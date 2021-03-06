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

public class QBSBPSUITERplctReqAddrInfoAddrFacs extends AttributeContainer implements KvmSerializable
{

    
    public QBSPhoneNumber Number;
    
    public String FormattedNumberDescription;
    
    public Boolean UsageDeniedIndicator;
    
    public QBSCLOSED_DatePeriod ValidityPeriod;
    
    public ArrayList< QBSBPSUITERplctReqNote> FacsimileNote =new ArrayList<QBSBPSUITERplctReqNote >();
    
    public ArrayList< QBSBPSUITERplctReqAddrInfoAddrFacsUsge> FacsimileUsage =new ArrayList<QBSBPSUITERplctReqAddrInfoAddrFacsUsge >();
    
    public String actionCode;
    
    public Boolean facsimileNoteListCompleteTransmissionIndicator=false;
    
    public Boolean facsimileUsageListCompleteTransmissionIndicator=false;
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
        if (inObj.hasAttribute("facsimileNoteListCompleteTransmissionIndicator"))
        {	
            java.lang.Object j = inObj.getAttribute("facsimileNoteListCompleteTransmissionIndicator");
            if (j != null)
            {
                facsimileNoteListCompleteTransmissionIndicator = new Boolean(j.toString());
            }
        }
        if (inObj.hasAttribute("facsimileUsageListCompleteTransmissionIndicator"))
        {	
            java.lang.Object j = inObj.getAttribute("facsimileUsageListCompleteTransmissionIndicator");
            if (j != null)
            {
                facsimileUsageListCompleteTransmissionIndicator = new Boolean(j.toString());
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
        if (info.name.equals("FacsimileNote"))
        {
            if(obj!=null)
            {
                if(this.FacsimileNote==null)
                {
                    this.FacsimileNote = new java.util.ArrayList< QBSBPSUITERplctReqNote>();
                }
                java.lang.Object j =obj;
                QBSBPSUITERplctReqNote j1= (QBSBPSUITERplctReqNote)__envelope.get(j,QBSBPSUITERplctReqNote.class,false);
                this.FacsimileNote.add(j1);
            }
            return true;
        }
        if (info.name.equals("FacsimileUsage"))
        {
            if(obj!=null)
            {
                if(this.FacsimileUsage==null)
                {
                    this.FacsimileUsage = new java.util.ArrayList< QBSBPSUITERplctReqAddrInfoAddrFacsUsge>();
                }
                java.lang.Object j =obj;
                QBSBPSUITERplctReqAddrInfoAddrFacsUsge j1= (QBSBPSUITERplctReqAddrInfoAddrFacsUsge)__envelope.get(j,QBSBPSUITERplctReqAddrInfoAddrFacsUsge.class,false);
                this.FacsimileUsage.add(j1);
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
        if(propertyIndex>=4 && propertyIndex < 4+this.FacsimileNote.size())
        {
            java.lang.Object FacsimileNote = this.FacsimileNote.get(propertyIndex-(4));
            return FacsimileNote!=null?FacsimileNote:SoapPrimitive.NullNilElement;
        }
        if(propertyIndex>=4+this.FacsimileNote.size() && propertyIndex < 4+this.FacsimileNote.size()+this.FacsimileUsage.size())
        {
            java.lang.Object FacsimileUsage = this.FacsimileUsage.get(propertyIndex-(4+this.FacsimileNote.size()));
            return FacsimileUsage!=null?FacsimileUsage:SoapPrimitive.NullNilElement;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 4+FacsimileNote.size()+FacsimileUsage.size();
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
        if(propertyIndex>=4 && propertyIndex < 4+this.FacsimileNote.size())
        {
            info.type = QBSBPSUITERplctReqNote.class;
            info.name = "FacsimileNote";
            info.namespace= "";
        }
        if(propertyIndex>=4+this.FacsimileNote.size() && propertyIndex < 4+this.FacsimileNote.size()+this.FacsimileUsage.size())
        {
            info.type = QBSBPSUITERplctReqAddrInfoAddrFacsUsge.class;
            info.name = "FacsimileUsage";
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
            info.name = "facsimileNoteListCompleteTransmissionIndicator";
            info.namespace= "";
            if(this.facsimileNoteListCompleteTransmissionIndicator!=null)
            {
                info.setValue(this.facsimileNoteListCompleteTransmissionIndicator);
            }
            
        }
        if(index==2)
        {
            info.name = "facsimileUsageListCompleteTransmissionIndicator";
            info.namespace= "";
            if(this.facsimileUsageListCompleteTransmissionIndicator!=null)
            {
                info.setValue(this.facsimileUsageListCompleteTransmissionIndicator);
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

