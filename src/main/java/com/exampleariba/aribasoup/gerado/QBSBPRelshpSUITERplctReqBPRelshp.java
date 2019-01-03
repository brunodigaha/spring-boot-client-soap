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

public class QBSBPRelshpSUITERplctReqBPRelshp extends AttributeContainer implements KvmSerializable
{

    
    public QBSUUID BusinessPartnerUUID;
    
    public String BusinessPartnerInternalID;
    
    public QBSUUID ReceiverBusinessPartnerUUID;
    
    public String ReceiverBusinessPartnerInternalID;
    
    public QBSNOCONVERSION_ObjectID BusinessPartnerExternalID;
    
    public QBSUUID RelationshipBusinessPartnerUUID;
    
    public String RelationshipBusinessPartnerInternalID;
    
    public QBSUUID ReceiverRelationshipBusinessPartnerUUID;
    
    public String ReceiverRelationshipBusinessPartnerInternalID;
    
    public QBSNOCONVERSION_ObjectID RelationshipBusinessPartnerExternalID;
    
    public QBSMDGBusinessPartnerRelationshipCategoryCode RoleCode;
    
    public QBSCLOSED_DatePeriod ValidityPeriod;
    
    public Boolean DefaultIndicator;
    
    public QBSBPRelshpSUITERplctReqCntctPersn ContactPerson;
    
    public QBSBPRelshpSUITERplctReqShrhldr ShareHolder;
    
    public String actionCode;
    
    public BigDecimal changeOrdinalNumberValue=BigDecimal.ZERO;
    
    public Integer reconciliationPeriodCounterValue=0;
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
        if (inObj.hasAttribute("changeOrdinalNumberValue"))
        {	
            java.lang.Object j = inObj.getAttribute("changeOrdinalNumberValue");
            if (j != null)
            {
                changeOrdinalNumberValue = new BigDecimal(j.toString());
            }
        }
        if (inObj.hasAttribute("reconciliationPeriodCounterValue"))
        {	
            java.lang.Object j = inObj.getAttribute("reconciliationPeriodCounterValue");
            if (j != null)
            {
                reconciliationPeriodCounterValue = Integer.parseInt(j.toString());
            }
        }

    }

    
    protected boolean loadProperty(PropertyInfo info,SoapObject soapObject,QBSExtendedSoapSerializationEnvelope __envelope)
    {
        java.lang.Object obj = info.getValue();
        if (info.name.equals("BusinessPartnerUUID"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.BusinessPartnerUUID = (QBSUUID)__envelope.get(j,QBSUUID.class,false);
            }
            return true;
        }
        if (info.name.equals("BusinessPartnerInternalID"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.BusinessPartnerInternalID = j.toString();
                    }
                }
                else{
                    this.BusinessPartnerInternalID = obj.toString();
                }
            }
            return true;
        }
        if (info.name.equals("ReceiverBusinessPartnerUUID"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.ReceiverBusinessPartnerUUID = (QBSUUID)__envelope.get(j,QBSUUID.class,false);
            }
            return true;
        }
        if (info.name.equals("ReceiverBusinessPartnerInternalID"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.ReceiverBusinessPartnerInternalID = j.toString();
                    }
                }
                else{
                    this.ReceiverBusinessPartnerInternalID = obj.toString();
                }
            }
            return true;
        }
        if (info.name.equals("BusinessPartnerExternalID"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.BusinessPartnerExternalID = (QBSNOCONVERSION_ObjectID)__envelope.get(j,QBSNOCONVERSION_ObjectID.class,false);
            }
            return true;
        }
        if (info.name.equals("RelationshipBusinessPartnerUUID"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.RelationshipBusinessPartnerUUID = (QBSUUID)__envelope.get(j,QBSUUID.class,false);
            }
            return true;
        }
        if (info.name.equals("RelationshipBusinessPartnerInternalID"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.RelationshipBusinessPartnerInternalID = j.toString();
                    }
                }
                else{
                    this.RelationshipBusinessPartnerInternalID = obj.toString();
                }
            }
            return true;
        }
        if (info.name.equals("ReceiverRelationshipBusinessPartnerUUID"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.ReceiverRelationshipBusinessPartnerUUID = (QBSUUID)__envelope.get(j,QBSUUID.class,false);
            }
            return true;
        }
        if (info.name.equals("ReceiverRelationshipBusinessPartnerInternalID"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.ReceiverRelationshipBusinessPartnerInternalID = j.toString();
                    }
                }
                else{
                    this.ReceiverRelationshipBusinessPartnerInternalID = obj.toString();
                }
            }
            return true;
        }
        if (info.name.equals("RelationshipBusinessPartnerExternalID"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.RelationshipBusinessPartnerExternalID = (QBSNOCONVERSION_ObjectID)__envelope.get(j,QBSNOCONVERSION_ObjectID.class,false);
            }
            return true;
        }
        if (info.name.equals("RoleCode"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.RoleCode = (QBSMDGBusinessPartnerRelationshipCategoryCode)__envelope.get(j,QBSMDGBusinessPartnerRelationshipCategoryCode.class,false);
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
        if (info.name.equals("DefaultIndicator"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.DefaultIndicator = new Boolean(j.toString());
                    }
                }
                else if (obj instanceof Boolean){
                    this.DefaultIndicator = (Boolean)obj;
                }
            }
            return true;
        }
        if (info.name.equals("ContactPerson"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.ContactPerson = (QBSBPRelshpSUITERplctReqCntctPersn)__envelope.get(j,QBSBPRelshpSUITERplctReqCntctPersn.class,false);
            }
            return true;
        }
        if (info.name.equals("ShareHolder"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.ShareHolder = (QBSBPRelshpSUITERplctReqShrhldr)__envelope.get(j,QBSBPRelshpSUITERplctReqShrhldr.class,false);
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
            return this.BusinessPartnerUUID!=null?this.BusinessPartnerUUID.getSimpleValue():null;
        }
        if(propertyIndex==1)
        {
            return this.BusinessPartnerInternalID!=null?this.BusinessPartnerInternalID:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.ReceiverBusinessPartnerUUID!=null?this.ReceiverBusinessPartnerUUID.getSimpleValue():null;
        }
        if(propertyIndex==3)
        {
            return this.ReceiverBusinessPartnerInternalID!=null?this.ReceiverBusinessPartnerInternalID:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return this.BusinessPartnerExternalID!=null?this.BusinessPartnerExternalID.getSimpleValue():null;
        }
        if(propertyIndex==5)
        {
            return this.RelationshipBusinessPartnerUUID!=null?this.RelationshipBusinessPartnerUUID.getSimpleValue():null;
        }
        if(propertyIndex==6)
        {
            return this.RelationshipBusinessPartnerInternalID!=null?this.RelationshipBusinessPartnerInternalID:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==7)
        {
            return this.ReceiverRelationshipBusinessPartnerUUID!=null?this.ReceiverRelationshipBusinessPartnerUUID.getSimpleValue():null;
        }
        if(propertyIndex==8)
        {
            return this.ReceiverRelationshipBusinessPartnerInternalID!=null?this.ReceiverRelationshipBusinessPartnerInternalID:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==9)
        {
            return this.RelationshipBusinessPartnerExternalID!=null?this.RelationshipBusinessPartnerExternalID.getSimpleValue():null;
        }
        if(propertyIndex==10)
        {
            return this.RoleCode!=null?this.RoleCode.getSimpleValue():null;
        }
        if(propertyIndex==11)
        {
            return this.ValidityPeriod!=null?this.ValidityPeriod:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==12)
        {
            return this.DefaultIndicator!=null?this.DefaultIndicator:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==13)
        {
            return this.ContactPerson!=null?this.ContactPerson:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==14)
        {
            return this.ShareHolder!=null?this.ShareHolder:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 15;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = org.ksoap2.serialization.SoapPrimitive.class;
            info.name = "BusinessPartnerUUID";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "BusinessPartnerInternalID";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = org.ksoap2.serialization.SoapPrimitive.class;
            info.name = "ReceiverBusinessPartnerUUID";
            info.namespace= "";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "ReceiverBusinessPartnerInternalID";
            info.namespace= "";
        }
        if(propertyIndex==4)
        {
            info.type = org.ksoap2.serialization.SoapPrimitive.class;
            info.name = "BusinessPartnerExternalID";
            info.namespace= "";
        }
        if(propertyIndex==5)
        {
            info.type = org.ksoap2.serialization.SoapPrimitive.class;
            info.name = "RelationshipBusinessPartnerUUID";
            info.namespace= "";
        }
        if(propertyIndex==6)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "RelationshipBusinessPartnerInternalID";
            info.namespace= "";
        }
        if(propertyIndex==7)
        {
            info.type = org.ksoap2.serialization.SoapPrimitive.class;
            info.name = "ReceiverRelationshipBusinessPartnerUUID";
            info.namespace= "";
        }
        if(propertyIndex==8)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "ReceiverRelationshipBusinessPartnerInternalID";
            info.namespace= "";
        }
        if(propertyIndex==9)
        {
            info.type = org.ksoap2.serialization.SoapPrimitive.class;
            info.name = "RelationshipBusinessPartnerExternalID";
            info.namespace= "";
        }
        if(propertyIndex==10)
        {
            info.type = org.ksoap2.serialization.SoapPrimitive.class;
            info.name = "RoleCode";
            info.namespace= "";
        }
        if(propertyIndex==11)
        {
            info.type = QBSCLOSED_DatePeriod.class;
            info.name = "ValidityPeriod";
            info.namespace= "";
        }
        if(propertyIndex==12)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "DefaultIndicator";
            info.namespace= "";
        }
        if(propertyIndex==13)
        {
            info.type = QBSBPRelshpSUITERplctReqCntctPersn.class;
            info.name = "ContactPerson";
            info.namespace= "";
        }
        if(propertyIndex==14)
        {
            info.type = QBSBPRelshpSUITERplctReqShrhldr.class;
            info.name = "ShareHolder";
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
            info.name = "changeOrdinalNumberValue";
            info.namespace= "";
            if(this.changeOrdinalNumberValue!=null)
            {
                info.setValue(this.changeOrdinalNumberValue);
            }
            
        }
        if(index==2)
        {
            info.name = "reconciliationPeriodCounterValue";
            info.namespace= "";
            if(this.reconciliationPeriodCounterValue!=null)
            {
                info.setValue(this.reconciliationPeriodCounterValue);
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

