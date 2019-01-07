
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de BPSUITERplctReqIdn complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPSUITERplctReqIdn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PartyIdentifierTypeCode" type="{http://ariba.com/xi/SupplierManagement}PartyIdentifierTypeCode"/&gt;
 *         &lt;element name="BusinessPartnerID" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *         &lt;element name="IdentifierIssuingAgencyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EntryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="AreaOfValidityCountryCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="AreaOfValidityRegionCode" type="{http://ariba.com/xi/SupplierManagement}RegionCode" minOccurs="0"/&gt;
 *         &lt;element name="ValidityPeriod" type="{http://ariba.com/xi/SupplierManagement}CLOSED_DatePeriod" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="actionCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BPSUITERplctReqIdn", propOrder = {
    "partyIdentifierTypeCode",
    "businessPartnerID",
    "identifierIssuingAgencyName",
    "entryDate",
    "areaOfValidityCountryCode",
    "areaOfValidityRegionCode",
    "validityPeriod"
})
public class BPSUITERplctReqIdn {

    @XmlElement(name = "PartyIdentifierTypeCode", required = true)
    protected PartyIdentifierTypeCode partyIdentifierTypeCode;
    @XmlElement(name = "BusinessPartnerID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String businessPartnerID;
    @XmlElement(name = "IdentifierIssuingAgencyName")
    protected String identifierIssuingAgencyName;
    @XmlElement(name = "EntryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar entryDate;
    @XmlElement(name = "AreaOfValidityCountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String areaOfValidityCountryCode;
    @XmlElement(name = "AreaOfValidityRegionCode")
    protected RegionCode areaOfValidityRegionCode;
    @XmlElement(name = "ValidityPeriod")
    protected CLOSEDDatePeriod validityPeriod;
    @XmlAttribute(name = "actionCode")
    protected String actionCode;

    /**
     * Obtém o valor da propriedade partyIdentifierTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentifierTypeCode }
     *     
     */
    public PartyIdentifierTypeCode getPartyIdentifierTypeCode() {
        return partyIdentifierTypeCode;
    }

    /**
     * Define o valor da propriedade partyIdentifierTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentifierTypeCode }
     *     
     */
    public void setPartyIdentifierTypeCode(PartyIdentifierTypeCode value) {
        this.partyIdentifierTypeCode = value;
    }

    /**
     * Obtém o valor da propriedade businessPartnerID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessPartnerID() {
        return businessPartnerID;
    }

    /**
     * Define o valor da propriedade businessPartnerID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessPartnerID(String value) {
        this.businessPartnerID = value;
    }

    /**
     * Obtém o valor da propriedade identifierIssuingAgencyName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifierIssuingAgencyName() {
        return identifierIssuingAgencyName;
    }

    /**
     * Define o valor da propriedade identifierIssuingAgencyName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifierIssuingAgencyName(String value) {
        this.identifierIssuingAgencyName = value;
    }

    /**
     * Obtém o valor da propriedade entryDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEntryDate() {
        return entryDate;
    }

    /**
     * Define o valor da propriedade entryDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEntryDate(XMLGregorianCalendar value) {
        this.entryDate = value;
    }

    /**
     * Obtém o valor da propriedade areaOfValidityCountryCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaOfValidityCountryCode() {
        return areaOfValidityCountryCode;
    }

    /**
     * Define o valor da propriedade areaOfValidityCountryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaOfValidityCountryCode(String value) {
        this.areaOfValidityCountryCode = value;
    }

    /**
     * Obtém o valor da propriedade areaOfValidityRegionCode.
     * 
     * @return
     *     possible object is
     *     {@link RegionCode }
     *     
     */
    public RegionCode getAreaOfValidityRegionCode() {
        return areaOfValidityRegionCode;
    }

    /**
     * Define o valor da propriedade areaOfValidityRegionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionCode }
     *     
     */
    public void setAreaOfValidityRegionCode(RegionCode value) {
        this.areaOfValidityRegionCode = value;
    }

    /**
     * Obtém o valor da propriedade validityPeriod.
     * 
     * @return
     *     possible object is
     *     {@link CLOSEDDatePeriod }
     *     
     */
    public CLOSEDDatePeriod getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Define o valor da propriedade validityPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link CLOSEDDatePeriod }
     *     
     */
    public void setValidityPeriod(CLOSEDDatePeriod value) {
        this.validityPeriod = value;
    }

    /**
     * Obtém o valor da propriedade actionCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * Define o valor da propriedade actionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionCode(String value) {
        this.actionCode = value;
    }

}
