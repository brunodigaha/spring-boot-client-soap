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

public class QBSBPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrRpstPersnName extends AttributeContainer implements KvmSerializable
{

    
    public QBSAddressRepresentationCode AddressRepresentationCode;
    
    public QBSPersonName Name;
    
    public String KeyWordsText;
    
    public String AdditionalKeyWordsText;
    
    public String FormattedName;
    
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
        if (info.name.equals("AddressRepresentationCode"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.AddressRepresentationCode = (QBSAddressRepresentationCode)__envelope.get(j,QBSAddressRepresentationCode.class,false);
            }
            return true;
        }
        if (info.name.equals("Name"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.Name = (QBSPersonName)__envelope.get(j,QBSPersonName.class,false);
            }
            return true;
        }
        if (info.name.equals("KeyWordsText"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.KeyWordsText = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.KeyWordsText = (String)obj;
                }
            }
            return true;
        }
        if (info.name.equals("AdditionalKeyWordsText"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.AdditionalKeyWordsText = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.AdditionalKeyWordsText = (String)obj;
                }
            }
            return true;
        }
        if (info.name.equals("FormattedName"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.FormattedName = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.FormattedName = (String)obj;
                }
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
            return this.AddressRepresentationCode!=null?this.AddressRepresentationCode.getSimpleValue():null;
        }
        if(propertyIndex==1)
        {
            return Name;
        }
        if(propertyIndex==2)
        {
            return this.KeyWordsText!=null?this.KeyWordsText:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.AdditionalKeyWordsText!=null?this.AdditionalKeyWordsText:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return this.FormattedName!=null?this.FormattedName:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 5;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = org.ksoap2.serialization.SoapPrimitive.class;
            info.name = "AddressRepresentationCode";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = QBSPersonName.class;
            info.name = "Name";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "KeyWordsText";
            info.namespace= "";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "AdditionalKeyWordsText";
            info.namespace= "";
        }
        if(propertyIndex==4)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "FormattedName";
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
