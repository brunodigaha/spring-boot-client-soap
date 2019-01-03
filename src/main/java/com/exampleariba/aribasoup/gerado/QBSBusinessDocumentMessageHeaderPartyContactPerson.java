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
import java.util.ArrayList;
import org.ksoap2.serialization.PropertyInfo;

public class QBSBusinessDocumentMessageHeaderPartyContactPerson extends AttributeContainer implements KvmSerializable
{

    
    public QBSContactPersonInternalID InternalID;
    
    public ArrayList< String> OrganisationFormattedName =new ArrayList<String >();
    
    public ArrayList< String> PersonFormattedName =new ArrayList<String >();
    
    public ArrayList< QBSPhoneNumber> PhoneNumber =new ArrayList<QBSPhoneNumber >();
    
    public ArrayList< QBSPhoneNumber> FaxNumber =new ArrayList<QBSPhoneNumber >();
    
    public ArrayList< QBSEmailURI> EmailURI =new ArrayList<QBSEmailURI >();
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
        if (info.name.equals("InternalID"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.InternalID = (QBSContactPersonInternalID)__envelope.get(j,QBSContactPersonInternalID.class,false);
            }
            return true;
        }
        if (info.name.equals("OrganisationFormattedName"))
        {
            if(obj!=null)
            {
                if(this.OrganisationFormattedName==null)
                {
                    this.OrganisationFormattedName = new java.util.ArrayList< String>();
                }
                java.lang.Object j =obj;
                String j1= j.toString();
                this.OrganisationFormattedName.add(j1);
            }
            return true;
        }
        if (info.name.equals("PersonFormattedName"))
        {
            if(obj!=null)
            {
                if(this.PersonFormattedName==null)
                {
                    this.PersonFormattedName = new java.util.ArrayList< String>();
                }
                java.lang.Object j =obj;
                String j1= j.toString();
                this.PersonFormattedName.add(j1);
            }
            return true;
        }
        if (info.name.equals("PhoneNumber"))
        {
            if(obj!=null)
            {
                if(this.PhoneNumber==null)
                {
                    this.PhoneNumber = new java.util.ArrayList< QBSPhoneNumber>();
                }
                java.lang.Object j =obj;
                QBSPhoneNumber j1= (QBSPhoneNumber)__envelope.get(j,QBSPhoneNumber.class,false);
                this.PhoneNumber.add(j1);
            }
            return true;
        }
        if (info.name.equals("FaxNumber"))
        {
            if(obj!=null)
            {
                if(this.FaxNumber==null)
                {
                    this.FaxNumber = new java.util.ArrayList< QBSPhoneNumber>();
                }
                java.lang.Object j =obj;
                QBSPhoneNumber j1= (QBSPhoneNumber)__envelope.get(j,QBSPhoneNumber.class,false);
                this.FaxNumber.add(j1);
            }
            return true;
        }
        if (info.name.equals("EmailURI"))
        {
            if(obj!=null)
            {
                if(this.EmailURI==null)
                {
                    this.EmailURI = new java.util.ArrayList< QBSEmailURI>();
                }
                java.lang.Object j =obj;
                QBSEmailURI j1= (QBSEmailURI)__envelope.get(j,QBSEmailURI.class,false);
                this.EmailURI.add(j1);
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
            return this.InternalID!=null?this.InternalID.getSimpleValue():null;
        }
        if(propertyIndex>=1 && propertyIndex < 1+this.OrganisationFormattedName.size())
        {
            java.lang.Object OrganisationFormattedName = this.OrganisationFormattedName.get(propertyIndex-(1));
            return OrganisationFormattedName!=null?OrganisationFormattedName:SoapPrimitive.NullNilElement;
        }
        if(propertyIndex>=1+this.OrganisationFormattedName.size() && propertyIndex < 1+this.OrganisationFormattedName.size()+this.PersonFormattedName.size())
        {
            java.lang.Object PersonFormattedName = this.PersonFormattedName.get(propertyIndex-(1+this.OrganisationFormattedName.size()));
            return PersonFormattedName!=null?PersonFormattedName:SoapPrimitive.NullNilElement;
        }
        if(propertyIndex>=1+this.OrganisationFormattedName.size()+this.PersonFormattedName.size() && propertyIndex < 1+this.OrganisationFormattedName.size()+this.PersonFormattedName.size()+this.PhoneNumber.size())
        {
            java.lang.Object PhoneNumber = this.PhoneNumber.get(propertyIndex-(1+this.OrganisationFormattedName.size()+this.PersonFormattedName.size()));
            return PhoneNumber!=null?PhoneNumber:SoapPrimitive.NullNilElement;
        }
        if(propertyIndex>=1+this.OrganisationFormattedName.size()+this.PersonFormattedName.size()+this.PhoneNumber.size() && propertyIndex < 1+this.OrganisationFormattedName.size()+this.PersonFormattedName.size()+this.PhoneNumber.size()+this.FaxNumber.size())
        {
            java.lang.Object FaxNumber = this.FaxNumber.get(propertyIndex-(1+this.OrganisationFormattedName.size()+this.PersonFormattedName.size()+this.PhoneNumber.size()));
            return FaxNumber!=null?FaxNumber:SoapPrimitive.NullNilElement;
        }
        if(propertyIndex>=1+this.OrganisationFormattedName.size()+this.PersonFormattedName.size()+this.PhoneNumber.size()+this.FaxNumber.size() && propertyIndex < 1+this.OrganisationFormattedName.size()+this.PersonFormattedName.size()+this.PhoneNumber.size()+this.FaxNumber.size()+this.EmailURI.size())
        {
            return  this.EmailURI.get(propertyIndex-(1+this.OrganisationFormattedName.size()+this.PersonFormattedName.size()+this.PhoneNumber.size()+this.FaxNumber.size())).getSimpleValue();
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 1+OrganisationFormattedName.size()+PersonFormattedName.size()+PhoneNumber.size()+FaxNumber.size()+EmailURI.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = org.ksoap2.serialization.SoapPrimitive.class;
            info.name = "InternalID";
            info.namespace= "";
        }
        if(propertyIndex>=1 && propertyIndex < 1+this.OrganisationFormattedName.size())
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "OrganisationFormattedName";
            info.namespace= "";
        }
        if(propertyIndex>=1+this.OrganisationFormattedName.size() && propertyIndex < 1+this.OrganisationFormattedName.size()+this.PersonFormattedName.size())
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "PersonFormattedName";
            info.namespace= "";
        }
        if(propertyIndex>=1+this.OrganisationFormattedName.size()+this.PersonFormattedName.size() && propertyIndex < 1+this.OrganisationFormattedName.size()+this.PersonFormattedName.size()+this.PhoneNumber.size())
        {
            info.type = QBSPhoneNumber.class;
            info.name = "PhoneNumber";
            info.namespace= "";
        }
        if(propertyIndex>=1+this.OrganisationFormattedName.size()+this.PersonFormattedName.size()+this.PhoneNumber.size() && propertyIndex < 1+this.OrganisationFormattedName.size()+this.PersonFormattedName.size()+this.PhoneNumber.size()+this.FaxNumber.size())
        {
            info.type = QBSPhoneNumber.class;
            info.name = "FaxNumber";
            info.namespace= "";
        }
        if(propertyIndex>=1+this.OrganisationFormattedName.size()+this.PersonFormattedName.size()+this.PhoneNumber.size()+this.FaxNumber.size() && propertyIndex < 1+this.OrganisationFormattedName.size()+this.PersonFormattedName.size()+this.PhoneNumber.size()+this.FaxNumber.size()+this.EmailURI.size())
        {
            info.type = org.ksoap2.serialization.SoapPrimitive.class;
            info.name = "EmailURI";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}
