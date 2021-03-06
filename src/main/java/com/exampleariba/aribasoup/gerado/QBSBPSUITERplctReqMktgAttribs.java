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

public class QBSBPSUITERplctReqMktgAttribs extends AttributeContainer implements KvmSerializable
{

    
    public String CustomerGroupCode;
    
    public QBSNielsenRegionCode CustomerNielsenRegionCode;
    
    public String FiscalYearVariantCode;
    
    public QBSAmount AnnualSalesVolumeAmount;
    
    public String AnnualSalesVolumeAmountReportedYear;
    
    public Integer EmployeeNumberValue;
    
    public String EmployeeNumberValueReportedYear;
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
        if (info.name.equals("CustomerGroupCode"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.CustomerGroupCode = j.toString();
                    }
                }
                else{
                    this.CustomerGroupCode = obj.toString();
                }
            }
            return true;
        }
        if (info.name.equals("CustomerNielsenRegionCode"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.CustomerNielsenRegionCode = (QBSNielsenRegionCode)__envelope.get(j,QBSNielsenRegionCode.class,false);
            }
            return true;
        }
        if (info.name.equals("FiscalYearVariantCode"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.FiscalYearVariantCode = j.toString();
                    }
                }
                else{
                    this.FiscalYearVariantCode = obj.toString();
                }
            }
            return true;
        }
        if (info.name.equals("AnnualSalesVolumeAmount"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.AnnualSalesVolumeAmount = (QBSAmount)__envelope.get(j,QBSAmount.class,false);
            }
            return true;
        }
        if (info.name.equals("AnnualSalesVolumeAmountReportedYear"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.AnnualSalesVolumeAmountReportedYear = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.AnnualSalesVolumeAmountReportedYear = (String)obj;
                }
            }
            return true;
        }
        if (info.name.equals("EmployeeNumberValue"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.EmployeeNumberValue = Integer.parseInt(j.toString());
                    }
                }
                else if (obj instanceof Integer){
                    this.EmployeeNumberValue = (Integer)obj;
                }
            }
            return true;
        }
        if (info.name.equals("EmployeeNumberValueReportedYear"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.EmployeeNumberValueReportedYear = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.EmployeeNumberValueReportedYear = (String)obj;
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
            return this.CustomerGroupCode!=null?this.CustomerGroupCode:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.CustomerNielsenRegionCode!=null?this.CustomerNielsenRegionCode.getSimpleValue():null;
        }
        if(propertyIndex==2)
        {
            return this.FiscalYearVariantCode!=null?this.FiscalYearVariantCode:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.AnnualSalesVolumeAmount!=null?this.AnnualSalesVolumeAmount.getSimpleValue():null;
        }
        if(propertyIndex==4)
        {
            return this.AnnualSalesVolumeAmountReportedYear!=null?this.AnnualSalesVolumeAmountReportedYear:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==5)
        {
            return this.EmployeeNumberValue!=null?this.EmployeeNumberValue:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==6)
        {
            return this.EmployeeNumberValueReportedYear!=null?this.EmployeeNumberValueReportedYear:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 7;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "CustomerGroupCode";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = org.ksoap2.serialization.SoapPrimitive.class;
            info.name = "CustomerNielsenRegionCode";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "FiscalYearVariantCode";
            info.namespace= "";
        }
        if(propertyIndex==3)
        {
            info.type = org.ksoap2.serialization.SoapPrimitive.class;
            info.name = "AnnualSalesVolumeAmount";
            info.namespace= "";
        }
        if(propertyIndex==4)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "AnnualSalesVolumeAmountReportedYear";
            info.namespace= "";
        }
        if(propertyIndex==5)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "EmployeeNumberValue";
            info.namespace= "";
        }
        if(propertyIndex==6)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "EmployeeNumberValueReportedYear";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

