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

public class QBSBPSUITERplctReqAddrInfoAddrTel extends AttributeContainer implements KvmSerializable
{

    
    public QBSPhoneNumber Number;
    
    public String FormattedNumberDescription;
    
    public Boolean UsageDeniedIndicator;
    
    public QBSCLOSED_DatePeriod ValidityPeriod;
    
    public Boolean MobilePhoneNumberIndicator;
    
    public Boolean SMSEnabledIndicator;
    
    public ArrayList< QBSBPSUITERplctReqNote> TelephoneNote =new ArrayList<QBSBPSUITERplctReqNote >();
    
    public ArrayList< QBSBPSUITERplctReqAddrInfoAddrTelUsge> TelephoneUsage =new ArrayList<QBSBPSUITERplctReqAddrInfoAddrTelUsge >();
    
    public String actionCode;
    
    public Boolean telephoneNoteListCompleteTransmissionIndicator=false;
    
    public Boolean telephoneUsageListCompleteTransmissionIndicator=false;
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
        if (inObj.hasAttribute("telephoneNoteListCompleteTransmissionIndicator"))
        {	
            java.lang.Object j = inObj.getAttribute("telephoneNoteListCompleteTransmissionIndicator");
            if (j != null)
            {
                telephoneNoteListCompleteTransmissionIndicator = new Boolean(j.toString());
            }
        }
        if (inObj.hasAttribute("telephoneUsageListCompleteTransmissionIndicator"))
        {	
            java.lang.Object j = inObj.getAttribute("telephoneUsageListCompleteTransmissionIndicator");
            if (j != null)
            {
                telephoneUsageListCompleteTransmissionIndicator = new Boolean(j.toString());
            }
        }

    }

    
    protected boolean loadProperty(PropertyInfo info,SoapObject soapObject,QBSExtendedSoapSerializationEnvelope __envelope)
    {
        java.lang.Object obj = info.getValue();
        if (info.name.equals("Number"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.Number = (QBSPhoneNumber)__envelope.get(j,QBSPhoneNumber.class,false);
            }
            return true;
        }
        if (info.name.equals("FormattedNumberDescription"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.FormattedNumberDescription = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.FormattedNumberDescription = (String)obj;
                }
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
        if (info.name.equals("MobilePhoneNumberIndicator"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.MobilePhoneNumberIndicator = new Boolean(j.toString());
                    }
                }
                else if (obj instanceof Boolean){
                    this.MobilePhoneNumberIndicator = (Boolean)obj;
                }
            }
            return true;
        }
        if (info.name.equals("SMSEnabledIndicator"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.SMSEnabledIndicator = new Boolean(j.toString());
                    }
                }
                else if (obj instanceof Boolean){
                    this.SMSEnabledIndicator = (Boolean)obj;
                }
            }
            return true;
        }
        if (info.name.equals("TelephoneNote"))
        {
            if(obj!=null)
            {
                if(this.TelephoneNote==null)
                {
                    this.TelephoneNote = new java.util.ArrayList< QBSBPSUITERplctReqNote>();
                }
                java.lang.Object j =obj;
                QBSBPSUITERplctReqNote j1= (QBSBPSUITERplctReqNote)__envelope.get(j,QBSBPSUITERplctReqNote.class,false);
                this.TelephoneNote.add(j1);
            }
            return true;
        }
        if (info.name.equals("TelephoneUsage"))
        {
            if(obj!=null)
            {
                if(this.TelephoneUsage==null)
                {
                    this.TelephoneUsage = new java.util.ArrayList< QBSBPSUITERplctReqAddrInfoAddrTelUsge>();
                }
                java.lang.Object j =obj;
                QBSBPSUITERplctReqAddrInfoAddrTelUsge j1= (QBSBPSUITERplctReqAddrInfoAddrTelUsge)__envelope.get(j,QBSBPSUITERplctReqAddrInfoAddrTelUsge.class,false);
                this.TelephoneUsage.add(j1);
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
            return Number;
        }
        if(propertyIndex==1)
        {
            return this.FormattedNumberDescription!=null?this.FormattedNumberDescription:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.UsageDeniedIndicator!=null?this.UsageDeniedIndicator:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.ValidityPeriod!=null?this.ValidityPeriod:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return this.MobilePhoneNumberIndicator!=null?this.MobilePhoneNumberIndicator:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==5)
        {
            return this.SMSEnabledIndicator!=null?this.SMSEnabledIndicator:SoapPrimitive.NullSkip;
        }
        if(propertyIndex>=6 && propertyIndex < 6+this.TelephoneNote.size())
        {
            java.lang.Object TelephoneNote = this.TelephoneNote.get(propertyIndex-(6));
            return TelephoneNote!=null?TelephoneNote:SoapPrimitive.NullNilElement;
        }
        if(propertyIndex>=6+this.TelephoneNote.size() && propertyIndex < 6+this.TelephoneNote.size()+this.TelephoneUsage.size())
        {
            java.lang.Object TelephoneUsage = this.TelephoneUsage.get(propertyIndex-(6+this.TelephoneNote.size()));
            return TelephoneUsage!=null?TelephoneUsage:SoapPrimitive.NullNilElement;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 6+TelephoneNote.size()+TelephoneUsage.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = QBSPhoneNumber.class;
            info.name = "Number";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "FormattedNumberDescription";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "UsageDeniedIndicator";
            info.namespace= "";
        }
        if(propertyIndex==3)
        {
            info.type = QBSCLOSED_DatePeriod.class;
            info.name = "ValidityPeriod";
            info.namespace= "";
        }
        if(propertyIndex==4)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "MobilePhoneNumberIndicator";
            info.namespace= "";
        }
        if(propertyIndex==5)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "SMSEnabledIndicator";
            info.namespace= "";
        }
        if(propertyIndex>=6 && propertyIndex < 6+this.TelephoneNote.size())
        {
            info.type = QBSBPSUITERplctReqNote.class;
            info.name = "TelephoneNote";
            info.namespace= "";
        }
        if(propertyIndex>=6+this.TelephoneNote.size() && propertyIndex < 6+this.TelephoneNote.size()+this.TelephoneUsage.size())
        {
            info.type = QBSBPSUITERplctReqAddrInfoAddrTelUsge.class;
            info.name = "TelephoneUsage";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }



    @Override
    public int getAttributeCount() {
        return 3;
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
            info.name = "telephoneNoteListCompleteTransmissionIndicator";
            info.namespace= "";
            if(this.telephoneNoteListCompleteTransmissionIndicator!=null)
            {
                info.setValue(this.telephoneNoteListCompleteTransmissionIndicator);
            }
            
        }
        if(index==2)
        {
            info.name = "telephoneUsageListCompleteTransmissionIndicator";
            info.namespace= "";
            if(this.telephoneUsageListCompleteTransmissionIndicator!=null)
            {
                info.setValue(this.telephoneUsageListCompleteTransmissionIndicator);
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

