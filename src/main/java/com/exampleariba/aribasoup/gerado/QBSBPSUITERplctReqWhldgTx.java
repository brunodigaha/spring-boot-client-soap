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

public class QBSBPSUITERplctReqWhldgTx extends AttributeContainer implements KvmSerializable
{

    
    public QBSCode WithholdingTaxTypeCode;
    
    public QBSCode SubjectToWithholdingTaxIndicator;
    
    public QBSCode VendorRecipientTypeCode;
    
    public QBSCode WithholdingTaxIdentificationNumber;
    
    public QBSCode WithholdingTaxCode;
    
    public QBSCode WithholdingTaxExemptionCertificateID;
    
    public QBSAmount WithholdingTaxExemptionRate;
    
    public QBSCLOSED_DatePeriod WithholdingTaxExemptionValidityPeriod;
    
    public QBSCode WithholdingTaxExemptionReasonCode;
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
        if (info.name.equals("WithholdingTaxTypeCode"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.WithholdingTaxTypeCode = (QBSCode)__envelope.get(j,QBSCode.class,false);
            }
            return true;
        }
        if (info.name.equals("SubjectToWithholdingTaxIndicator"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.SubjectToWithholdingTaxIndicator = (QBSCode)__envelope.get(j,QBSCode.class,false);
            }
            return true;
        }
        if (info.name.equals("VendorRecipientTypeCode"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.VendorRecipientTypeCode = (QBSCode)__envelope.get(j,QBSCode.class,false);
            }
            return true;
        }
        if (info.name.equals("WithholdingTaxIdentificationNumber"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.WithholdingTaxIdentificationNumber = (QBSCode)__envelope.get(j,QBSCode.class,false);
            }
            return true;
        }
        if (info.name.equals("WithholdingTaxCode"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.WithholdingTaxCode = (QBSCode)__envelope.get(j,QBSCode.class,false);
            }
            return true;
        }
        if (info.name.equals("WithholdingTaxExemptionCertificateID"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.WithholdingTaxExemptionCertificateID = (QBSCode)__envelope.get(j,QBSCode.class,false);
            }
            return true;
        }
        if (info.name.equals("WithholdingTaxExemptionRate"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.WithholdingTaxExemptionRate = (QBSAmount)__envelope.get(j,QBSAmount.class,false);
            }
            return true;
        }
        if (info.name.equals("WithholdingTaxExemptionValidityPeriod"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.WithholdingTaxExemptionValidityPeriod = (QBSCLOSED_DatePeriod)__envelope.get(j,QBSCLOSED_DatePeriod.class,false);
            }
            return true;
        }
        if (info.name.equals("WithholdingTaxExemptionReasonCode"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.WithholdingTaxExemptionReasonCode = (QBSCode)__envelope.get(j,QBSCode.class,false);
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
            return this.WithholdingTaxTypeCode!=null?this.WithholdingTaxTypeCode.getSimpleValue():null;
        }
        if(propertyIndex==1)
        {
            return this.SubjectToWithholdingTaxIndicator!=null?this.SubjectToWithholdingTaxIndicator.getSimpleValue():null;
        }
        if(propertyIndex==2)
        {
            return this.VendorRecipientTypeCode!=null?this.VendorRecipientTypeCode.getSimpleValue():null;
        }
        if(propertyIndex==3)
        {
            return this.WithholdingTaxIdentificationNumber!=null?this.WithholdingTaxIdentificationNumber.getSimpleValue():null;
        }
        if(propertyIndex==4)
        {
            return this.WithholdingTaxCode!=null?this.WithholdingTaxCode.getSimpleValue():null;
        }
        if(propertyIndex==5)
        {
            return this.WithholdingTaxExemptionCertificateID!=null?this.WithholdingTaxExemptionCertificateID.getSimpleValue():null;
        }
        if(propertyIndex==6)
        {
            return this.WithholdingTaxExemptionRate!=null?this.WithholdingTaxExemptionRate.getSimpleValue():null;
        }
        if(propertyIndex==7)
        {
            return this.WithholdingTaxExemptionValidityPeriod!=null?this.WithholdingTaxExemptionValidityPeriod:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==8)
        {
            return this.WithholdingTaxExemptionReasonCode!=null?this.WithholdingTaxExemptionReasonCode.getSimpleValue():null;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 9;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = org.ksoap2.serialization.SoapPrimitive.class;
            info.name = "WithholdingTaxTypeCode";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = org.ksoap2.serialization.SoapPrimitive.class;
            info.name = "SubjectToWithholdingTaxIndicator";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = org.ksoap2.serialization.SoapPrimitive.class;
            info.name = "VendorRecipientTypeCode";
            info.namespace= "";
        }
        if(propertyIndex==3)
        {
            info.type = org.ksoap2.serialization.SoapPrimitive.class;
            info.name = "WithholdingTaxIdentificationNumber";
            info.namespace= "";
        }
        if(propertyIndex==4)
        {
            info.type = org.ksoap2.serialization.SoapPrimitive.class;
            info.name = "WithholdingTaxCode";
            info.namespace= "";
        }
        if(propertyIndex==5)
        {
            info.type = org.ksoap2.serialization.SoapPrimitive.class;
            info.name = "WithholdingTaxExemptionCertificateID";
            info.namespace= "";
        }
        if(propertyIndex==6)
        {
            info.type = org.ksoap2.serialization.SoapPrimitive.class;
            info.name = "WithholdingTaxExemptionRate";
            info.namespace= "";
        }
        if(propertyIndex==7)
        {
            info.type = QBSCLOSED_DatePeriod.class;
            info.name = "WithholdingTaxExemptionValidityPeriod";
            info.namespace= "";
        }
        if(propertyIndex==8)
        {
            info.type = org.ksoap2.serialization.SoapPrimitive.class;
            info.name = "WithholdingTaxExemptionReasonCode";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

