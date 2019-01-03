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

public class QBSBPRelshpSUITERplctReqShrhldr extends AttributeContainer implements KvmSerializable
{

    
    public BigDecimal EquityParticipationPercent;
    
    public QBSAmount EquityParticipationAmount;
    
    public Boolean CompanyControlIndicator;
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
        if (info.name.equals("EquityParticipationPercent"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.EquityParticipationPercent = new BigDecimal(j.toString());
                    }
                }
                else if (obj instanceof BigDecimal){
                    this.EquityParticipationPercent = (BigDecimal)obj;
                }
            }
            return true;
        }
        if (info.name.equals("EquityParticipationAmount"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.EquityParticipationAmount = (QBSAmount)__envelope.get(j,QBSAmount.class,false);
            }
            return true;
        }
        if (info.name.equals("CompanyControlIndicator"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.CompanyControlIndicator = new Boolean(j.toString());
                    }
                }
                else if (obj instanceof Boolean){
                    this.CompanyControlIndicator = (Boolean)obj;
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
            return this.EquityParticipationPercent!=null?this.EquityParticipationPercent.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.EquityParticipationAmount!=null?this.EquityParticipationAmount.getSimpleValue():null;
        }
        if(propertyIndex==2)
        {
            return this.CompanyControlIndicator!=null?this.CompanyControlIndicator:SoapPrimitive.NullSkip;
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
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "EquityParticipationPercent";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = org.ksoap2.serialization.SoapPrimitive.class;
            info.name = "EquityParticipationAmount";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "CompanyControlIndicator";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

