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

public class QBSBPRelshpSUITEBulkRplctReqMsg extends AttributeContainer implements KvmSerializable
{

    
    public QBSBusinessDocumentMessageHeader MessageHeader;
    
    public ArrayList< QBSBPRelshpSUITERplctReqMsg> BusinessPartnerRelationshipSUITEReplicateRequestMessage =new ArrayList<QBSBPRelshpSUITERplctReqMsg >();
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
        if (info.name.equals("MessageHeader"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.MessageHeader = (QBSBusinessDocumentMessageHeader)__envelope.get(j,QBSBusinessDocumentMessageHeader.class,false);
            }
            return true;
        }
        if (info.name.equals("BusinessPartnerRelationshipSUITEReplicateRequestMessage"))
        {
            if(obj!=null)
            {
                if(this.BusinessPartnerRelationshipSUITEReplicateRequestMessage==null)
                {
                    this.BusinessPartnerRelationshipSUITEReplicateRequestMessage = new java.util.ArrayList< QBSBPRelshpSUITERplctReqMsg>();
                }
                java.lang.Object j =obj;
                QBSBPRelshpSUITERplctReqMsg j1= (QBSBPRelshpSUITERplctReqMsg)__envelope.get(j,QBSBPRelshpSUITERplctReqMsg.class,false);
                this.BusinessPartnerRelationshipSUITEReplicateRequestMessage.add(j1);
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
            return MessageHeader;
        }
        if(propertyIndex>=1 && propertyIndex < 1+this.BusinessPartnerRelationshipSUITEReplicateRequestMessage.size())
        {
            java.lang.Object BusinessPartnerRelationshipSUITEReplicateRequestMessage = this.BusinessPartnerRelationshipSUITEReplicateRequestMessage.get(propertyIndex-(1));
            return BusinessPartnerRelationshipSUITEReplicateRequestMessage!=null?BusinessPartnerRelationshipSUITEReplicateRequestMessage:SoapPrimitive.NullNilElement;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 1+BusinessPartnerRelationshipSUITEReplicateRequestMessage.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = QBSBusinessDocumentMessageHeader.class;
            info.name = "MessageHeader";
            info.namespace= "";
        }
        if(propertyIndex>=1 && propertyIndex < 1+this.BusinessPartnerRelationshipSUITEReplicateRequestMessage.size())
        {
            info.type = QBSBPRelshpSUITERplctReqMsg.class;
            info.name = "BusinessPartnerRelationshipSUITEReplicateRequestMessage";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

