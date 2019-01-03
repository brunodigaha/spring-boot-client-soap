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

public class QBSBPSUITERplctReqComGrp extends AttributeContainer implements KvmSerializable
{

    
    public QBSFormOfAddressCode FormOfAddressCode;
    
    public String Name;
    
    public String AdditionalName;
    
    public QBSBusinessPartnerPartnerGroupTypeCode PartnerGroupTypeCode;
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

    }

    
    protected boolean loadProperty(PropertyInfo info,SoapObject soapObject,QBSExtendedSoapSerializationEnvelope __envelope)
    {
        java.lang.Object obj = info.getValue();
        if (info.name.equals("FormOfAddressCode"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.FormOfAddressCode = (QBSFormOfAddressCode)__envelope.get(j,QBSFormOfAddressCode.class,false);
            }
            return true;
        }
        if (info.name.equals("Name"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.Name = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.Name = (String)obj;
                }
            }
            return true;
        }
        if (info.name.equals("AdditionalName"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.AdditionalName = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.AdditionalName = (String)obj;
                }
            }
            return true;
        }
        if (info.name.equals("PartnerGroupTypeCode"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.PartnerGroupTypeCode = (QBSBusinessPartnerPartnerGroupTypeCode)__envelope.get(j,QBSBusinessPartnerPartnerGroupTypeCode.class,false);
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
            return this.FormOfAddressCode!=null?this.FormOfAddressCode.getSimpleValue():null;
        }
        if(propertyIndex==1)
        {
            return this.Name!=null?this.Name:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.AdditionalName!=null?this.AdditionalName:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.PartnerGroupTypeCode!=null?this.PartnerGroupTypeCode.getSimpleValue():null;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 4;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = org.ksoap2.serialization.SoapPrimitive.class;
            info.name = "FormOfAddressCode";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "Name";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "AdditionalName";
            info.namespace= "";
        }
        if(propertyIndex==3)
        {
            info.type = org.ksoap2.serialization.SoapPrimitive.class;
            info.name = "PartnerGroupTypeCode";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}
