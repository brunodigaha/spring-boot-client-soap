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

public class QBSVIPReasonCode  
{

    
    public String value;
    
    public String listID;
    
    public String listVersionID;
    
    public String listAgencyID;
    
    public String listAgencySchemeID;
    
    public String listAgencySchemeAgencyID;
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
        if (inObj.hasAttribute("listID"))
        {	
            java.lang.Object j = inObj.getAttribute("listID");
            if (j != null)
            {
                listID = j.toString();
            }
        }
        if (inObj.hasAttribute("listVersionID"))
        {	
            java.lang.Object j = inObj.getAttribute("listVersionID");
            if (j != null)
            {
                listVersionID = j.toString();
            }
        }
        if (inObj.hasAttribute("listAgencyID"))
        {	
            java.lang.Object j = inObj.getAttribute("listAgencyID");
            if (j != null)
            {
                listAgencyID = j.toString();
            }
        }
        if (inObj.hasAttribute("listAgencySchemeID"))
        {	
            java.lang.Object j = inObj.getAttribute("listAgencySchemeID");
            if (j != null)
            {
                listAgencySchemeID = j.toString();
            }
        }
        if (inObj.hasAttribute("listAgencySchemeAgencyID"))
        {	
            java.lang.Object j = inObj.getAttribute("listAgencySchemeAgencyID");
            if (j != null)
            {
                listAgencySchemeAgencyID = j.toString();
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
        
        if (this.listID != null)
        {
            AttributeInfo attrInfo = new AttributeInfo();
            attrInfo.setName("listID");
            attrInfo.setValue(this.listID);
            attrInfo.setNamespace("");
            primitive.addAttribute(attrInfo);
        }
        if (this.listVersionID != null)
        {
            AttributeInfo attrInfo = new AttributeInfo();
            attrInfo.setName("listVersionID");
            attrInfo.setValue(this.listVersionID);
            attrInfo.setNamespace("");
            primitive.addAttribute(attrInfo);
        }
        if (this.listAgencyID != null)
        {
            AttributeInfo attrInfo = new AttributeInfo();
            attrInfo.setName("listAgencyID");
            attrInfo.setValue(this.listAgencyID);
            attrInfo.setNamespace("");
            primitive.addAttribute(attrInfo);
        }
        if (this.listAgencySchemeID != null)
        {
            AttributeInfo attrInfo = new AttributeInfo();
            attrInfo.setName("listAgencySchemeID");
            attrInfo.setValue(this.listAgencySchemeID);
            attrInfo.setNamespace("");
            primitive.addAttribute(attrInfo);
        }
        if (this.listAgencySchemeAgencyID != null)
        {
            AttributeInfo attrInfo = new AttributeInfo();
            attrInfo.setName("listAgencySchemeAgencyID");
            attrInfo.setValue(this.listAgencySchemeAgencyID);
            attrInfo.setNamespace("");
            primitive.addAttribute(attrInfo);
        }
        return primitive;
    }    
}

