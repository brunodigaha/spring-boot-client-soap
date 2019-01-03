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

public class QBSBusinessScope extends AttributeContainer implements KvmSerializable
{

    
    public QBSBusinessScopeTypeCode TypeCode;
    
    public QBSBusinessScopeInstanceID InstanceID;
    
    public QBSBusinessScopeID ID;
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
        if (info.name.equals("TypeCode"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.TypeCode = (QBSBusinessScopeTypeCode)__envelope.get(j,QBSBusinessScopeTypeCode.class,false);
            }
            return true;
        }
        if (info.name.equals("InstanceID"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.InstanceID = (QBSBusinessScopeInstanceID)__envelope.get(j,QBSBusinessScopeInstanceID.class,false);
            }
            return true;
        }
        if (info.name.equals("ID"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.ID = (QBSBusinessScopeID)__envelope.get(j,QBSBusinessScopeID.class,false);
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
            return this.TypeCode!=null?this.TypeCode.getSimpleValue():null;
        }
        if(propertyIndex==1)
        {
            return this.InstanceID!=null?this.InstanceID.getSimpleValue():null;
        }
        if(propertyIndex==2)
        {
            return this.ID!=null?this.ID.getSimpleValue():null;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 3;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = org.ksoap2.serialization.SoapPrimitive.class;
            info.name = "TypeCode";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = org.ksoap2.serialization.SoapPrimitive.class;
            info.name = "InstanceID";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = org.ksoap2.serialization.SoapPrimitive.class;
            info.name = "ID";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}
