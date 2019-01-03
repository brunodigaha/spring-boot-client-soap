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

public class QBSBPSUITERplctReqComPersn extends AttributeContainer implements KvmSerializable
{

    
    public QBSPersonName Name;
    
    public String GenderCode;
    
    public String BirthPlaceName;
    
    public java.util.Date BirthDate;
    
    public java.util.Date DeathDate;
    
    public QBSMaritalStatusCode MaritalStatusCode;
    
    public String NonVerbalCommunicationLanguageCode;
    
    public QBSOccupationCode OccupationCode;
    
    public String Employer;
    
    public String NationalityCountryCode;
    
    public String OriginCountryCode;
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
                this.Name = (QBSPersonName)__envelope.get(j,QBSPersonName.class,false);
            }
            return true;
        }
        if (info.name.equals("GenderCode"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.GenderCode = j.toString();
                    }
                }
                else{
                    this.GenderCode = obj.toString();
                }
            }
            return true;
        }
        if (info.name.equals("BirthPlaceName"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.BirthPlaceName = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.BirthPlaceName = (String)obj;
                }
            }
            return true;
        }
        if (info.name.equals("BirthDate"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.BirthDate = QBSHelper.ConvertFromWebService(j.toString());
                    }
                }
                else if (obj instanceof java.util.Date){
                    this.BirthDate = (java.util.Date)obj;
                }
            }
            return true;
        }
        if (info.name.equals("DeathDate"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.DeathDate = QBSHelper.ConvertFromWebService(j.toString());
                    }
                }
                else if (obj instanceof java.util.Date){
                    this.DeathDate = (java.util.Date)obj;
                }
            }
            return true;
        }
        if (info.name.equals("MaritalStatusCode"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.MaritalStatusCode = (QBSMaritalStatusCode)__envelope.get(j,QBSMaritalStatusCode.class,false);
            }
            return true;
        }
        if (info.name.equals("NonVerbalCommunicationLanguageCode"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.NonVerbalCommunicationLanguageCode = j.toString();
                    }
                }
                else{
                    this.NonVerbalCommunicationLanguageCode = obj.toString();
                }
            }
            return true;
        }
        if (info.name.equals("OccupationCode"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.OccupationCode = (QBSOccupationCode)__envelope.get(j,QBSOccupationCode.class,false);
            }
            return true;
        }
        if (info.name.equals("Employer"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.Employer = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.Employer = (String)obj;
                }
            }
            return true;
        }
        if (info.name.equals("NationalityCountryCode"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.NationalityCountryCode = j.toString();
                    }
                }
                else{
                    this.NationalityCountryCode = obj.toString();
                }
            }
            return true;
        }
        if (info.name.equals("OriginCountryCode"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.OriginCountryCode = j.toString();
                    }
                }
                else{
                    this.OriginCountryCode = obj.toString();
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
            return this.GenderCode!=null?this.GenderCode:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.BirthPlaceName!=null?this.BirthPlaceName:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.BirthDate!=null?QBSHelper.getDateFormat().format(this.BirthDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return this.DeathDate!=null?QBSHelper.getDateFormat().format(this.DeathDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==5)
        {
            return this.MaritalStatusCode!=null?this.MaritalStatusCode.getSimpleValue():null;
        }
        if(propertyIndex==6)
        {
            return this.NonVerbalCommunicationLanguageCode!=null?this.NonVerbalCommunicationLanguageCode:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==7)
        {
            return this.OccupationCode!=null?this.OccupationCode.getSimpleValue():null;
        }
        if(propertyIndex==8)
        {
            return this.Employer!=null?this.Employer:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==9)
        {
            return this.NationalityCountryCode!=null?this.NationalityCountryCode:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==10)
        {
            return this.OriginCountryCode!=null?this.OriginCountryCode:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 11;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = QBSPersonName.class;
            info.name = "Name";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "GenderCode";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "BirthPlaceName";
            info.namespace= "";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "BirthDate";
            info.namespace= "";
        }
        if(propertyIndex==4)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "DeathDate";
            info.namespace= "";
        }
        if(propertyIndex==5)
        {
            info.type = org.ksoap2.serialization.SoapPrimitive.class;
            info.name = "MaritalStatusCode";
            info.namespace= "";
        }
        if(propertyIndex==6)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "NonVerbalCommunicationLanguageCode";
            info.namespace= "";
        }
        if(propertyIndex==7)
        {
            info.type = org.ksoap2.serialization.SoapPrimitive.class;
            info.name = "OccupationCode";
            info.namespace= "";
        }
        if(propertyIndex==8)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "Employer";
            info.namespace= "";
        }
        if(propertyIndex==9)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "NationalityCountryCode";
            info.namespace= "";
        }
        if(propertyIndex==10)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "OriginCountryCode";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}
