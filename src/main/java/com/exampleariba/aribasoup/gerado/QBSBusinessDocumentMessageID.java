package com.exampleariba.aribasoup.gerado;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 5.5.2.0
//
// Created by Quasar Development 
//
//---------------------------------------------------


import org.ksoap2.serialization.*;

public class QBSBusinessDocumentMessageID  
{

    
    public String value;
    
    public String schemeID;
    
    public String schemeAgencyID;
    
    public String schemeAgencySchemeAgencyID;
    private transient java.lang.Object __source;    
    

    
    
    
    public void loadFromSoap(java.lang.Object paramObj,QBSExtendedSoapSerializationEnvelope __envelope)
    {
        if (paramObj == null)
            return;
        AttributeContainer inObj=(AttributeContainer)paramObj;
        __source=inObj; 
        if(!(inObj instanceof SoapObject))
        {
            java.lang.Object j =(java.lang.Object)inObj;
            value = j.toString();
        }
        if (inObj.hasAttribute("schemeID"))
        {	
            java.lang.Object j = inObj.getAttribute("schemeID");
            if (j != null)
            {
                schemeID = j.toString();
            }
        }
        if (inObj.hasAttribute("schemeAgencyID"))
        {	
            java.lang.Object j = inObj.getAttribute("schemeAgencyID");
            if (j != null)
            {
                schemeAgencyID = j.toString();
            }
        }
        if (inObj.hasAttribute("schemeAgencySchemeAgencyID"))
        {	
            java.lang.Object j = inObj.getAttribute("schemeAgencySchemeAgencyID");
            if (j != null)
            {
                schemeAgencySchemeAgencyID = j.toString();
            }
        }

    }

    
    protected boolean loadProperty(PropertyInfo info,SoapObject soapObject,QBSExtendedSoapSerializationEnvelope __envelope)
    {
        java.lang.Object obj = info.getValue();
        if (info.name.equals("value"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.value = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.value = (String)obj;
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
    
    public Object getSimpleValue()
    {
        Object value=this.value != null ? this.value.toString() : "";
        SoapPrimitive primitive = new SoapPrimitive("", "value",value);
        
        if (this.schemeID != null)
        {
            AttributeInfo attrInfo = new AttributeInfo();
            attrInfo.setName("schemeID");
            attrInfo.setValue(this.schemeID);
            attrInfo.setNamespace("");
            primitive.addAttribute(attrInfo);
        }
        if (this.schemeAgencyID != null)
        {
            AttributeInfo attrInfo = new AttributeInfo();
            attrInfo.setName("schemeAgencyID");
            attrInfo.setValue(this.schemeAgencyID);
            attrInfo.setNamespace("");
            primitive.addAttribute(attrInfo);
        }
        if (this.schemeAgencySchemeAgencyID != null)
        {
            AttributeInfo attrInfo = new AttributeInfo();
            attrInfo.setName("schemeAgencySchemeAgencyID");
            attrInfo.setValue(this.schemeAgencySchemeAgencyID);
            attrInfo.setNamespace("");
            primitive.addAttribute(attrInfo);
        }
        return primitive;
    }    
}

