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

public class QBSBPSUITERplctReqAddrInfoAddr extends AttributeContainer implements KvmSerializable
{

    
    public ArrayList< QBSBPSUITERplctReqNote> AddressNote =new ArrayList<QBSBPSUITERplctReqNote >();
    
    public QBSBPSUITERplctReqAddrInfoAddrCommPref CommunicationPreference;
    
    public ArrayList< QBSBPSUITERplctReqAddrInfoAddrEml> Email =new ArrayList<QBSBPSUITERplctReqAddrInfoAddrEml >();
    
    public ArrayList< QBSBPSUITERplctReqAddrInfoAddrFacs> Facsimile =new ArrayList<QBSBPSUITERplctReqAddrInfoAddrFacs >();
    
    public ArrayList< QBSBPSUITERplctReqAddrInfoAddrOrgName> OrganisationName =new ArrayList<QBSBPSUITERplctReqAddrInfoAddrOrgName >();
    
    public ArrayList< QBSBPSUITERplctReqAddrInfoAddrPersnName> PersonName =new ArrayList<QBSBPSUITERplctReqAddrInfoAddrPersnName >();
    
    public ArrayList< QBSBPSUITERplctReqAddrInfoAddrPostlAddr> PostalAddress =new ArrayList<QBSBPSUITERplctReqAddrInfoAddrPostlAddr >();
    
    public ArrayList< QBSBPSUITERplctReqAddrInfoAddrTel> Telephone =new ArrayList<QBSBPSUITERplctReqAddrInfoAddrTel >();
    
    public ArrayList< QBSBPSUITERplctReqAddrInfoAddrWeb> Web =new ArrayList<QBSBPSUITERplctReqAddrInfoAddrWeb >();
    
    public String actionCode;
    
    public Boolean addressNoteListCompleteTransmissionIndicator=false;
    
    public Boolean emailListCompleteTransmissionIndicator=false;
    
    public Boolean facsimileListCompleteTransmissionIndicator=false;
    
    public Boolean organisationNameListCompleteTransmissionIndicator=false;
    
    public Boolean personNameListCompleteTransmissionIndicator=false;
    
    public Boolean postalAddressListCompleteTransmissionIndicator=false;
    
    public Boolean telephoneListCompleteTransmissionIndicator=false;
    
    public Boolean webListCompleteTransmissionIndicator=false;
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
        if (inObj.hasAttribute("addressNoteListCompleteTransmissionIndicator"))
        {	
            java.lang.Object j = inObj.getAttribute("addressNoteListCompleteTransmissionIndicator");
            if (j != null)
            {
                addressNoteListCompleteTransmissionIndicator = new Boolean(j.toString());
            }
        }
        if (inObj.hasAttribute("emailListCompleteTransmissionIndicator"))
        {	
            java.lang.Object j = inObj.getAttribute("emailListCompleteTransmissionIndicator");
            if (j != null)
            {
                emailListCompleteTransmissionIndicator = new Boolean(j.toString());
            }
        }
        if (inObj.hasAttribute("facsimileListCompleteTransmissionIndicator"))
        {	
            java.lang.Object j = inObj.getAttribute("facsimileListCompleteTransmissionIndicator");
            if (j != null)
            {
                facsimileListCompleteTransmissionIndicator = new Boolean(j.toString());
            }
        }
        if (inObj.hasAttribute("organisationNameListCompleteTransmissionIndicator"))
        {	
            java.lang.Object j = inObj.getAttribute("organisationNameListCompleteTransmissionIndicator");
            if (j != null)
            {
                organisationNameListCompleteTransmissionIndicator = new Boolean(j.toString());
            }
        }
        if (inObj.hasAttribute("personNameListCompleteTransmissionIndicator"))
        {	
            java.lang.Object j = inObj.getAttribute("personNameListCompleteTransmissionIndicator");
            if (j != null)
            {
                personNameListCompleteTransmissionIndicator = new Boolean(j.toString());
            }
        }
        if (inObj.hasAttribute("postalAddressListCompleteTransmissionIndicator"))
        {	
            java.lang.Object j = inObj.getAttribute("postalAddressListCompleteTransmissionIndicator");
            if (j != null)
            {
                postalAddressListCompleteTransmissionIndicator = new Boolean(j.toString());
            }
        }
        if (inObj.hasAttribute("telephoneListCompleteTransmissionIndicator"))
        {	
            java.lang.Object j = inObj.getAttribute("telephoneListCompleteTransmissionIndicator");
            if (j != null)
            {
                telephoneListCompleteTransmissionIndicator = new Boolean(j.toString());
            }
        }
        if (inObj.hasAttribute("webListCompleteTransmissionIndicator"))
        {	
            java.lang.Object j = inObj.getAttribute("webListCompleteTransmissionIndicator");
            if (j != null)
            {
                webListCompleteTransmissionIndicator = new Boolean(j.toString());
            }
        }

    }

    
    protected boolean loadProperty(PropertyInfo info,SoapObject soapObject,QBSExtendedSoapSerializationEnvelope __envelope)
    {
        java.lang.Object obj = info.getValue();
        if (info.name.equals("AddressNote"))
        {
            if(obj!=null)
            {
                if(this.AddressNote==null)
                {
                    this.AddressNote = new java.util.ArrayList< QBSBPSUITERplctReqNote>();
                }
                java.lang.Object j =obj;
                QBSBPSUITERplctReqNote j1= (QBSBPSUITERplctReqNote)__envelope.get(j,QBSBPSUITERplctReqNote.class,false);
                this.AddressNote.add(j1);
            }
            return true;
        }
        if (info.name.equals("CommunicationPreference"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.CommunicationPreference = (QBSBPSUITERplctReqAddrInfoAddrCommPref)__envelope.get(j,QBSBPSUITERplctReqAddrInfoAddrCommPref.class,false);
            }
            return true;
        }
        if (info.name.equals("Email"))
        {
            if(obj!=null)
            {
                if(this.Email==null)
                {
                    this.Email = new java.util.ArrayList< QBSBPSUITERplctReqAddrInfoAddrEml>();
                }
                java.lang.Object j =obj;
                QBSBPSUITERplctReqAddrInfoAddrEml j1= (QBSBPSUITERplctReqAddrInfoAddrEml)__envelope.get(j,QBSBPSUITERplctReqAddrInfoAddrEml.class,false);
                this.Email.add(j1);
            }
            return true;
        }
        if (info.name.equals("Facsimile"))
        {
            if(obj!=null)
            {
                if(this.Facsimile==null)
                {
                    this.Facsimile = new java.util.ArrayList< QBSBPSUITERplctReqAddrInfoAddrFacs>();
                }
                java.lang.Object j =obj;
                QBSBPSUITERplctReqAddrInfoAddrFacs j1= (QBSBPSUITERplctReqAddrInfoAddrFacs)__envelope.get(j,QBSBPSUITERplctReqAddrInfoAddrFacs.class,false);
                this.Facsimile.add(j1);
            }
            return true;
        }
        if (info.name.equals("OrganisationName"))
        {
            if(obj!=null)
            {
                if(this.OrganisationName==null)
                {
                    this.OrganisationName = new java.util.ArrayList< QBSBPSUITERplctReqAddrInfoAddrOrgName>();
                }
                java.lang.Object j =obj;
                QBSBPSUITERplctReqAddrInfoAddrOrgName j1= (QBSBPSUITERplctReqAddrInfoAddrOrgName)__envelope.get(j,QBSBPSUITERplctReqAddrInfoAddrOrgName.class,false);
                this.OrganisationName.add(j1);
            }
            return true;
        }
        if (info.name.equals("PersonName"))
        {
            if(obj!=null)
            {
                if(this.PersonName==null)
                {
                    this.PersonName = new java.util.ArrayList< QBSBPSUITERplctReqAddrInfoAddrPersnName>();
                }
                java.lang.Object j =obj;
                QBSBPSUITERplctReqAddrInfoAddrPersnName j1= (QBSBPSUITERplctReqAddrInfoAddrPersnName)__envelope.get(j,QBSBPSUITERplctReqAddrInfoAddrPersnName.class,false);
                this.PersonName.add(j1);
            }
            return true;
        }
        if (info.name.equals("PostalAddress"))
        {
            if(obj!=null)
            {
                if(this.PostalAddress==null)
                {
                    this.PostalAddress = new java.util.ArrayList< QBSBPSUITERplctReqAddrInfoAddrPostlAddr>();
                }
                java.lang.Object j =obj;
                QBSBPSUITERplctReqAddrInfoAddrPostlAddr j1= (QBSBPSUITERplctReqAddrInfoAddrPostlAddr)__envelope.get(j,QBSBPSUITERplctReqAddrInfoAddrPostlAddr.class,false);
                this.PostalAddress.add(j1);
            }
            return true;
        }
        if (info.name.equals("Telephone"))
        {
            if(obj!=null)
            {
                if(this.Telephone==null)
                {
                    this.Telephone = new java.util.ArrayList< QBSBPSUITERplctReqAddrInfoAddrTel>();
                }
                java.lang.Object j =obj;
                QBSBPSUITERplctReqAddrInfoAddrTel j1= (QBSBPSUITERplctReqAddrInfoAddrTel)__envelope.get(j,QBSBPSUITERplctReqAddrInfoAddrTel.class,false);
                this.Telephone.add(j1);
            }
            return true;
        }
        if (info.name.equals("Web"))
        {
            if(obj!=null)
            {
                if(this.Web==null)
                {
                    this.Web = new java.util.ArrayList< QBSBPSUITERplctReqAddrInfoAddrWeb>();
                }
                java.lang.Object j =obj;
                QBSBPSUITERplctReqAddrInfoAddrWeb j1= (QBSBPSUITERplctReqAddrInfoAddrWeb)__envelope.get(j,QBSBPSUITERplctReqAddrInfoAddrWeb.class,false);
                this.Web.add(j1);
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
        if(propertyIndex>=0 && propertyIndex < 0+this.AddressNote.size())
        {
            java.lang.Object AddressNote = this.AddressNote.get(propertyIndex-(0));
            return AddressNote!=null?AddressNote:SoapPrimitive.NullNilElement;
        }
        if(propertyIndex==0+this.AddressNote.size())
        {
            return this.CommunicationPreference!=null?this.CommunicationPreference:SoapPrimitive.NullSkip;
        }
        if(propertyIndex>=1+this.AddressNote.size() && propertyIndex < 1+this.AddressNote.size()+this.Email.size())
        {
            java.lang.Object Email = this.Email.get(propertyIndex-(1+this.AddressNote.size()));
            return Email!=null?Email:SoapPrimitive.NullNilElement;
        }
        if(propertyIndex>=1+this.AddressNote.size()+this.Email.size() && propertyIndex < 1+this.AddressNote.size()+this.Email.size()+this.Facsimile.size())
        {
            java.lang.Object Facsimile = this.Facsimile.get(propertyIndex-(1+this.AddressNote.size()+this.Email.size()));
            return Facsimile!=null?Facsimile:SoapPrimitive.NullNilElement;
        }
        if(propertyIndex>=1+this.AddressNote.size()+this.Email.size()+this.Facsimile.size() && propertyIndex < 1+this.AddressNote.size()+this.Email.size()+this.Facsimile.size()+this.OrganisationName.size())
        {
            java.lang.Object OrganisationName = this.OrganisationName.get(propertyIndex-(1+this.AddressNote.size()+this.Email.size()+this.Facsimile.size()));
            return OrganisationName!=null?OrganisationName:SoapPrimitive.NullNilElement;
        }
        if(propertyIndex>=1+this.AddressNote.size()+this.Email.size()+this.Facsimile.size()+this.OrganisationName.size() && propertyIndex < 1+this.AddressNote.size()+this.Email.size()+this.Facsimile.size()+this.OrganisationName.size()+this.PersonName.size())
        {
            java.lang.Object PersonName = this.PersonName.get(propertyIndex-(1+this.AddressNote.size()+this.Email.size()+this.Facsimile.size()+this.OrganisationName.size()));
            return PersonName!=null?PersonName:SoapPrimitive.NullNilElement;
        }
        if(propertyIndex>=1+this.AddressNote.size()+this.Email.size()+this.Facsimile.size()+this.OrganisationName.size()+this.PersonName.size() && propertyIndex < 1+this.AddressNote.size()+this.Email.size()+this.Facsimile.size()+this.OrganisationName.size()+this.PersonName.size()+this.PostalAddress.size())
        {
            java.lang.Object PostalAddress = this.PostalAddress.get(propertyIndex-(1+this.AddressNote.size()+this.Email.size()+this.Facsimile.size()+this.OrganisationName.size()+this.PersonName.size()));
            return PostalAddress!=null?PostalAddress:SoapPrimitive.NullNilElement;
        }
        if(propertyIndex>=1+this.AddressNote.size()+this.Email.size()+this.Facsimile.size()+this.OrganisationName.size()+this.PersonName.size()+this.PostalAddress.size() && propertyIndex < 1+this.AddressNote.size()+this.Email.size()+this.Facsimile.size()+this.OrganisationName.size()+this.PersonName.size()+this.PostalAddress.size()+this.Telephone.size())
        {
            java.lang.Object Telephone = this.Telephone.get(propertyIndex-(1+this.AddressNote.size()+this.Email.size()+this.Facsimile.size()+this.OrganisationName.size()+this.PersonName.size()+this.PostalAddress.size()));
            return Telephone!=null?Telephone:SoapPrimitive.NullNilElement;
        }
        if(propertyIndex>=1+this.AddressNote.size()+this.Email.size()+this.Facsimile.size()+this.OrganisationName.size()+this.PersonName.size()+this.PostalAddress.size()+this.Telephone.size() && propertyIndex < 1+this.AddressNote.size()+this.Email.size()+this.Facsimile.size()+this.OrganisationName.size()+this.PersonName.size()+this.PostalAddress.size()+this.Telephone.size()+this.Web.size())
        {
            java.lang.Object Web = this.Web.get(propertyIndex-(1+this.AddressNote.size()+this.Email.size()+this.Facsimile.size()+this.OrganisationName.size()+this.PersonName.size()+this.PostalAddress.size()+this.Telephone.size()));
            return Web!=null?Web:SoapPrimitive.NullNilElement;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 1+AddressNote.size()+Email.size()+Facsimile.size()+OrganisationName.size()+PersonName.size()+PostalAddress.size()+Telephone.size()+Web.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex>=0 && propertyIndex < 0+this.AddressNote.size())
        {
            info.type = QBSBPSUITERplctReqNote.class;
            info.name = "AddressNote";
            info.namespace= "";
        }
        if(propertyIndex==0+this.AddressNote.size())
        {
            info.type = QBSBPSUITERplctReqAddrInfoAddrCommPref.class;
            info.name = "CommunicationPreference";
            info.namespace= "";
        }
        if(propertyIndex>=1+this.AddressNote.size() && propertyIndex < 1+this.AddressNote.size()+this.Email.size())
        {
            info.type = QBSBPSUITERplctReqAddrInfoAddrEml.class;
            info.name = "Email";
            info.namespace= "";
        }
        if(propertyIndex>=1+this.AddressNote.size()+this.Email.size() && propertyIndex < 1+this.AddressNote.size()+this.Email.size()+this.Facsimile.size())
        {
            info.type = QBSBPSUITERplctReqAddrInfoAddrFacs.class;
            info.name = "Facsimile";
            info.namespace= "";
        }
        if(propertyIndex>=1+this.AddressNote.size()+this.Email.size()+this.Facsimile.size() && propertyIndex < 1+this.AddressNote.size()+this.Email.size()+this.Facsimile.size()+this.OrganisationName.size())
        {
            info.type = QBSBPSUITERplctReqAddrInfoAddrOrgName.class;
            info.name = "OrganisationName";
            info.namespace= "";
        }
        if(propertyIndex>=1+this.AddressNote.size()+this.Email.size()+this.Facsimile.size()+this.OrganisationName.size() && propertyIndex < 1+this.AddressNote.size()+this.Email.size()+this.Facsimile.size()+this.OrganisationName.size()+this.PersonName.size())
        {
            info.type = QBSBPSUITERplctReqAddrInfoAddrPersnName.class;
            info.name = "PersonName";
            info.namespace= "";
        }
        if(propertyIndex>=1+this.AddressNote.size()+this.Email.size()+this.Facsimile.size()+this.OrganisationName.size()+this.PersonName.size() && propertyIndex < 1+this.AddressNote.size()+this.Email.size()+this.Facsimile.size()+this.OrganisationName.size()+this.PersonName.size()+this.PostalAddress.size())
        {
            info.type = QBSBPSUITERplctReqAddrInfoAddrPostlAddr.class;
            info.name = "PostalAddress";
            info.namespace= "";
        }
        if(propertyIndex>=1+this.AddressNote.size()+this.Email.size()+this.Facsimile.size()+this.OrganisationName.size()+this.PersonName.size()+this.PostalAddress.size() && propertyIndex < 1+this.AddressNote.size()+this.Email.size()+this.Facsimile.size()+this.OrganisationName.size()+this.PersonName.size()+this.PostalAddress.size()+this.Telephone.size())
        {
            info.type = QBSBPSUITERplctReqAddrInfoAddrTel.class;
            info.name = "Telephone";
            info.namespace= "";
        }
        if(propertyIndex>=1+this.AddressNote.size()+this.Email.size()+this.Facsimile.size()+this.OrganisationName.size()+this.PersonName.size()+this.PostalAddress.size()+this.Telephone.size() && propertyIndex < 1+this.AddressNote.size()+this.Email.size()+this.Facsimile.size()+this.OrganisationName.size()+this.PersonName.size()+this.PostalAddress.size()+this.Telephone.size()+this.Web.size())
        {
            info.type = QBSBPSUITERplctReqAddrInfoAddrWeb.class;
            info.name = "Web";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }



    @Override
    public int getAttributeCount() {
        return 9;
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
            info.name = "addressNoteListCompleteTransmissionIndicator";
            info.namespace= "";
            if(this.addressNoteListCompleteTransmissionIndicator!=null)
            {
                info.setValue(this.addressNoteListCompleteTransmissionIndicator);
            }
            
        }
        if(index==2)
        {
            info.name = "emailListCompleteTransmissionIndicator";
            info.namespace= "";
            if(this.emailListCompleteTransmissionIndicator!=null)
            {
                info.setValue(this.emailListCompleteTransmissionIndicator);
            }
            
        }
        if(index==3)
        {
            info.name = "facsimileListCompleteTransmissionIndicator";
            info.namespace= "";
            if(this.facsimileListCompleteTransmissionIndicator!=null)
            {
                info.setValue(this.facsimileListCompleteTransmissionIndicator);
            }
            
        }
        if(index==4)
        {
            info.name = "organisationNameListCompleteTransmissionIndicator";
            info.namespace= "";
            if(this.organisationNameListCompleteTransmissionIndicator!=null)
            {
                info.setValue(this.organisationNameListCompleteTransmissionIndicator);
            }
            
        }
        if(index==5)
        {
            info.name = "personNameListCompleteTransmissionIndicator";
            info.namespace= "";
            if(this.personNameListCompleteTransmissionIndicator!=null)
            {
                info.setValue(this.personNameListCompleteTransmissionIndicator);
            }
            
        }
        if(index==6)
        {
            info.name = "postalAddressListCompleteTransmissionIndicator";
            info.namespace= "";
            if(this.postalAddressListCompleteTransmissionIndicator!=null)
            {
                info.setValue(this.postalAddressListCompleteTransmissionIndicator);
            }
            
        }
        if(index==7)
        {
            info.name = "telephoneListCompleteTransmissionIndicator";
            info.namespace= "";
            if(this.telephoneListCompleteTransmissionIndicator!=null)
            {
                info.setValue(this.telephoneListCompleteTransmissionIndicator);
            }
            
        }
        if(index==8)
        {
            info.name = "webListCompleteTransmissionIndicator";
            info.namespace= "";
            if(this.webListCompleteTransmissionIndicator!=null)
            {
                info.setValue(this.webListCompleteTransmissionIndicator);
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

