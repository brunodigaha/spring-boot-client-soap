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

public class QBSBPSUITERplctReqComOrg extends AttributeContainer implements KvmSerializable
{

    
    public QBSOrganisationName Name;
    
    public QBSCompanyLegalFormCode CompanyLegalFormCode;
    
    public QBSLegalEntityTypeCode LegalEntityTypeCode;
    
    public java.util.Date FoundationDate;
    
    public java.util.Date LiquidationDate;
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
        if (info.name.equals("Name"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.Name = (QBSOrganisationName)__envelope.get(j,QBSOrganisationName.class,false);
            }
            return true;
        }
        if (info.name.equals("CompanyLegalFormCode"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.CompanyLegalFormCode = (QBSCompanyLegalFormCode)__envelope.get(j,QBSCompanyLegalFormCode.class,false);
            }
            return true;
        }
        if (info.name.equals("LegalEntityTypeCode"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.LegalEntityTypeCode = (QBSLegalEntityTypeCode)__envelope.get(j,QBSLegalEntityTypeCode.class,false);
            }
            return true;
        }
        if (info.name.equals("FoundationDate"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.FoundationDate = QBSHelper.ConvertFromWebService(j.toString());
                    }
                }
                else if (obj instanceof java.util.Date){
                    this.FoundationDate = (java.util.Date)obj;
                }
            }
            return true;
        }
        if (info.name.equals("LiquidationDate"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.LiquidationDate = QBSHelper.ConvertFromWebService(j.toString());
                    }
                }
                else if (obj instanceof java.util.Date){
                    this.LiquidationDate = (java.util.Date)obj;
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
            return this.Name!=null?this.Name:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.CompanyLegalFormCode!=null?this.CompanyLegalFormCode.getSimpleValue():null;
        }
        if(propertyIndex==2)
        {
            return this.LegalEntityTypeCode!=null?this.LegalEntityTypeCode.getSimpleValue():null;
        }
        if(propertyIndex==3)
        {
            return this.FoundationDate!=null?QBSHelper.getDateFormat().format(this.FoundationDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return this.LiquidationDate!=null?QBSHelper.getDateFormat().format(this.LiquidationDate):SoapPrimitive.NullSkip;
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
            info.type = QBSOrganisationName.class;
            info.name = "Name";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = org.ksoap2.serialization.SoapPrimitive.class;
            info.name = "CompanyLegalFormCode";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = org.ksoap2.serialization.SoapPrimitive.class;
            info.name = "LegalEntityTypeCode";
            info.namespace= "";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "FoundationDate";
            info.namespace= "";
        }
        if(propertyIndex==4)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "LiquidationDate";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}
