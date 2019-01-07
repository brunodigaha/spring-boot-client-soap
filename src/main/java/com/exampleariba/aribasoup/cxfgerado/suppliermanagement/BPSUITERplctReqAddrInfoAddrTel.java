
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BPSUITERplctReqAddrInfoAddrTel complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPSUITERplctReqAddrInfoAddrTel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Number" type="{http://ariba.com/xi/SupplierManagement}PhoneNumber"/&gt;
 *         &lt;element name="FormattedNumberDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UsageDeniedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ValidityPeriod" type="{http://ariba.com/xi/SupplierManagement}CLOSED_DatePeriod" minOccurs="0"/&gt;
 *         &lt;element name="MobilePhoneNumberIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SMSEnabledIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TelephoneNote" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqNote" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TelephoneUsage" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqAddrInfoAddrTelUsge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="actionCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="telephoneNoteListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="telephoneUsageListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BPSUITERplctReqAddrInfoAddrTel", propOrder = {
    "number",
    "formattedNumberDescription",
    "usageDeniedIndicator",
    "validityPeriod",
    "mobilePhoneNumberIndicator",
    "smsEnabledIndicator",
    "telephoneNote",
    "telephoneUsage"
})
public class BPSUITERplctReqAddrInfoAddrTel {

    @XmlElement(name = "Number", required = true)
    protected PhoneNumber number;
    @XmlElement(name = "FormattedNumberDescription")
    protected String formattedNumberDescription;
    @XmlElement(name = "UsageDeniedIndicator")
    protected Boolean usageDeniedIndicator;
    @XmlElement(name = "ValidityPeriod")
    protected CLOSEDDatePeriod validityPeriod;
    @XmlElement(name = "MobilePhoneNumberIndicator")
    protected Boolean mobilePhoneNumberIndicator;
    @XmlElement(name = "SMSEnabledIndicator")
    protected Boolean smsEnabledIndicator;
    @XmlElement(name = "TelephoneNote")
    protected List<BPSUITERplctReqNote> telephoneNote;
    @XmlElement(name = "TelephoneUsage")
    protected List<BPSUITERplctReqAddrInfoAddrTelUsge> telephoneUsage;
    @XmlAttribute(name = "actionCode")
    protected String actionCode;
    @XmlAttribute(name = "telephoneNoteListCompleteTransmissionIndicator")
    protected Boolean telephoneNoteListCompleteTransmissionIndicator;
    @XmlAttribute(name = "telephoneUsageListCompleteTransmissionIndicator")
    protected Boolean telephoneUsageListCompleteTransmissionIndicator;

    /**
     * Obtém o valor da propriedade number.
     * 
     * @return
     *     possible object is
     *     {@link PhoneNumber }
     *     
     */
    public PhoneNumber getNumber() {
        return number;
    }

    /**
     * Define o valor da propriedade number.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneNumber }
     *     
     */
    public void setNumber(PhoneNumber value) {
        this.number = value;
    }

    /**
     * Obtém o valor da propriedade formattedNumberDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedNumberDescription() {
        return formattedNumberDescription;
    }

    /**
     * Define o valor da propriedade formattedNumberDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedNumberDescription(String value) {
        this.formattedNumberDescription = value;
    }

    /**
     * Obtém o valor da propriedade usageDeniedIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsageDeniedIndicator() {
        return usageDeniedIndicator;
    }

    /**
     * Define o valor da propriedade usageDeniedIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsageDeniedIndicator(Boolean value) {
        this.usageDeniedIndicator = value;
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
     * Obtém o valor da propriedade mobilePhoneNumberIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMobilePhoneNumberIndicator() {
        return mobilePhoneNumberIndicator;
    }

    /**
     * Define o valor da propriedade mobilePhoneNumberIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMobilePhoneNumberIndicator(Boolean value) {
        this.mobilePhoneNumberIndicator = value;
    }

    /**
     * Obtém o valor da propriedade smsEnabledIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSMSEnabledIndicator() {
        return smsEnabledIndicator;
    }

    /**
     * Define o valor da propriedade smsEnabledIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSMSEnabledIndicator(Boolean value) {
        this.smsEnabledIndicator = value;
    }

    /**
     * Gets the value of the telephoneNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telephoneNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelephoneNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPSUITERplctReqNote }
     * 
     * 
     */
    public List<BPSUITERplctReqNote> getTelephoneNote() {
        if (telephoneNote == null) {
            telephoneNote = new ArrayList<BPSUITERplctReqNote>();
        }
        return this.telephoneNote;
    }

    /**
     * Gets the value of the telephoneUsage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telephoneUsage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelephoneUsage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPSUITERplctReqAddrInfoAddrTelUsge }
     * 
     * 
     */
    public List<BPSUITERplctReqAddrInfoAddrTelUsge> getTelephoneUsage() {
        if (telephoneUsage == null) {
            telephoneUsage = new ArrayList<BPSUITERplctReqAddrInfoAddrTelUsge>();
        }
        return this.telephoneUsage;
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

    /**
     * Obtém o valor da propriedade telephoneNoteListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTelephoneNoteListCompleteTransmissionIndicator() {
        return telephoneNoteListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade telephoneNoteListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTelephoneNoteListCompleteTransmissionIndicator(Boolean value) {
        this.telephoneNoteListCompleteTransmissionIndicator = value;
    }

    /**
     * Obtém o valor da propriedade telephoneUsageListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTelephoneUsageListCompleteTransmissionIndicator() {
        return telephoneUsageListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade telephoneUsageListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTelephoneUsageListCompleteTransmissionIndicator(Boolean value) {
        this.telephoneUsageListCompleteTransmissionIndicator = value;
    }

}
