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
import java.math.BigDecimal;

public class QBSBPSUITERplctReqTxExmp extends AttributeContainer implements KvmSerializable
{

    
    public QBSTaxExemptionCertificateID CertificateID;
    
    public BigDecimal Percent;
    
    public QBSCLOSED_DatePeriod ValidityPeriod;
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
        if (info.name.equals("CertificateID"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.CertificateID = (QBSTaxExemptionCertificateID)__envelope.get(j,QBSTaxExemptionCertificateID.class,false);
            }
            return true;
        }
        if (info.name.equals("Percent"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.Percent = new BigDecimal(j.toString());
                    }
                }
                else if (obj instanceof BigDecimal){
                    this.Percent = (BigDecimal)obj;
                }
            }
            return true;
        }
        if (info.name.equals("ValidityPeriod"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.ValidityPeriod = (QBSCLOSED_DatePeriod)__envelope.get(j,QBSCLOSED_DatePeriod.class,false);
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
            return this.CertificateID!=null?this.CertificateID.getSimpleValue():null;
        }
        if(propertyIndex==1)
        {
            return this.Percent!=null?this.Percent.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.ValidityPeriod!=null?this.ValidityPeriod:SoapPrimitive.NullSkip;
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
            info.name = "CertificateID";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "Percent";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = QBSCLOSED_DatePeriod.class;
            info.name = "ValidityPeriod";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

