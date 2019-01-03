package com.exampleariba.aribasoup.gerado;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 5.5.2.0
//
// Created by Quasar Development 
//
//---------------------------------------------------


import java.util.Hashtable;
import org.ksoap2.serialization.*;

public class QBSBPSUITERplctReqSubRnge extends AttributeContainer implements KvmSerializable
{

    
    public QBSCode VendorSubrangeCode;
    
    public QBSLEN20_Description SubrangeDescription;
    
    public String actionCode;
    private transient java.lang.Object __source;    
    

    
    
    
    public void loadFromSoap(java.lang.Object paramObj,QBSExtendedSoapSerializationEnvelope __envelope)
    {
        if (paramObj == null)
            return;
        AttributeContainer inObj=(AttributeContainer)paramObj;
        __source=inObj; 
        if(inObj instanceof SoapObject)
        {
            SoapObject soapObject=(SoapObject)inObj;
            int size = soapObject.getPropertyCount();
            for (int i0=0;i0< size;i0++)
            {
                PropertyInfo info=soapObject.getPropertyInfo(i0);
                if(!loadProperty(info,soapObject,__envelope))
                {
                }
            } 
        }
        if (inObj.hasAttribute("actionCode"))
        {	
            java.lang.Object j = inObj.getAttribute("actionCode");
            if (j != null)
            {
                actionCode = j.toString();
            }
        }

    }

    
    protected boolean loadProperty(PropertyInfo info,SoapObject soapObject,QBSExtendedSoapSerializationEnvelope __envelope)
    {
        java.lang.Object obj = info.getValue();
        if (info.name.equals("VendorSubrangeCode"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.VendorSubrangeCode = (QBSCode)__envelope.get(j,QBSCode.class,false);
            }
            return true;
        }
        if (info.name.equals("SubrangeDescription"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.SubrangeDescription = (QBSLEN20_Description)__envelope.get(j,QBSLEN20_Description.class,false);
            }
            return true;
        }
        return false;
    }
    
    public java.lang.Object getOriginalXmlSource()
    {
        return __source;
    }    
    

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==0)
        {
            return this.VendorSubrangeCode!=null?this.VendorSubrangeCode.getSimpleValue():null;
        }
        if(propertyIndex==1)
        {
            return this.SubrangeDescription!=null?this.SubrangeDescription.getSimpleValue():null;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 2;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = org.ksoap2.serialization.SoapPrimitive.class;
            info.name = "VendorSubrangeCode";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = org.ksoap2.serialization.SoapPrimitive.class;
            info.name = "SubrangeDescription";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }



    @Override
    public int getAttributeCount() {
        return 1;
    }
    
    @Override
    public void getAttributeInfo(int index, AttributeInfo info) {
        if(index==0)
        {
            info.name = "actionCode";
            info.namespace= "";
            if(this.actionCode!=null)
            {
                info.setValue(this.actionCode);
            }
            
        }
    }

    @Override
    public void getAttribute(int i, AttributeInfo attributeInfo) {

    }

    @Override
    public void setAttribute(AttributeInfo attributeInfo) {

    }    
}

