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

public class QBSBPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrEml extends AttributeContainer implements KvmSerializable
{

    
    public QBSEmailURI URI;
    
    public Boolean UsageDeniedIndicator;
    
    public QBSCLOSED_DatePeriod ValidityPeriod;
    
    public Boolean TransportNeutralEncapsulationFormatEnabledIndicator;
    
    public ArrayList< QBSBPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrEmlUsge> EmailUsage =new ArrayList<QBSBPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrEmlUsge >();
    
    public String actionCode;
    
    public Boolean eMailUsageListCompleteTransmissionIndicator=false;
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
        if (inObj.hasAttribute("eMailUsageListCompleteTransmissionIndicator"))
        {	
            java.lang.Object j = inObj.getAttribute("eMailUsageListCompleteTransmissionIndicator");
            if (j != null)
            {
                eMailUsageListCompleteTransmissionIndicator = new Boolean(j.toString());
            }
        }

    }

    
    protected boolean loadProperty(PropertyInfo info,SoapObject soapObject,QBSExtendedSoapSerializationEnvelope __envelope)
    {
        java.lang.Object obj = info.getValue();
        if (info.name.equals("URI"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.URI = (QBSEmailURI)__envelope.get(j,QBSEmailURI.class,false);
            }
            return true;
        }
        if (info.name.equals("UsageDeniedIndicator"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.UsageDeniedIndicator = new Boolean(j.toString());
                    }
                }
                else if (obj instanceof Boolean){
                    this.UsageDeniedIndicator = (Boolean)obj;
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
        if (info.name.equals("TransportNeutralEncapsulationFormatEnabledIndicator"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.TransportNeutralEncapsulationFormatEnabledIndicator = new Boolean(j.toString());
                    }
                }
                else if (obj instanceof Boolean){
                    this.TransportNeutralEncapsulationFormatEnabledIndicator = (Boolean)obj;
                }
            }
            return true;
        }
        if (info.name.equals("EmailUsage"))
        {
            if(obj!=null)
            {
                if(this.EmailUsage==null)
                {
                    this.EmailUsage = new java.util.ArrayList< QBSBPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrEmlUsge>();
                }
                java.lang.Object j =obj;
                QBSBPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrEmlUsge j1= (QBSBPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrEmlUsge)__envelope.get(j,QBSBPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrEmlUsge.class,false);
                this.EmailUsage.add(j1);
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
            return this.URI!=null?this.URI.getSimpleValue():null;
        }
        if(propertyIndex==1)
        {
            return this.UsageDeniedIndicator!=null?this.UsageDeniedIndicator:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.ValidityPeriod!=null?this.ValidityPeriod:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.TransportNeutralEncapsulationFormatEnabledIndicator!=null?this.TransportNeutralEncapsulationFormatEnabledIndicator:SoapPrimitive.NullSkip;
        }
        if(propertyIndex>=4 && propertyIndex < 4+this.EmailUsage.size())
        {
            java.lang.Object EmailUsage = this.EmailUsage.get(propertyIndex-(4));
            return EmailUsage!=null?EmailUsage:SoapPrimitive.NullNilElement;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 4+EmailUsage.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = org.ksoap2.serialization.SoapPrimitive.class;
            info.name = "URI";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "UsageDeniedIndicator";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = QBSCLOSED_DatePeriod.class;
            info.name = "ValidityPeriod";
            info.namespace= "";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "TransportNeutralEncapsulationFormatEnabledIndicator";
            info.namespace= "";
        }
        if(propertyIndex>=4 && propertyIndex < 4+this.EmailUsage.size())
        {
            info.type = QBSBPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrEmlUsge.class;
            info.name = "EmailUsage";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }



    @Override
    public int getAttributeCount() {
        return 2;
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
        if(index==1)
        {
            info.name = "eMailUsageListCompleteTransmissionIndicator";
            info.namespace= "";
            if(this.eMailUsageListCompleteTransmissionIndicator!=null)
            {
                info.setValue(this.eMailUsageListCompleteTransmissionIndicator);
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

