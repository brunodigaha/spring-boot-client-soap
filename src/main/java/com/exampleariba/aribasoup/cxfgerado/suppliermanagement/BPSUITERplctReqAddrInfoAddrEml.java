
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BPSUITERplctReqAddrInfoAddrEml complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPSUITERplctReqAddrInfoAddrEml"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="URI" type="{http://ariba.com/xi/SupplierManagement}EmailURI"/&gt;
 *         &lt;element name="UsageDeniedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ValidityPeriod" type="{http://ariba.com/xi/SupplierManagement}CLOSED_DatePeriod" minOccurs="0"/&gt;
 *         &lt;element name="TransportNeutralEncapsulationFormatEnabledIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EmailNote" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqNote" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EmailUsage" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqAddrInfoAddrEmlUsge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="actionCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="eMailNoteListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="eMailUsageListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BPSUITERplctReqAddrInfoAddrEml", propOrder = {
    "uri",
    "usageDeniedIndicator",
    "validityPeriod",
    "transportNeutralEncapsulationFormatEnabledIndicator",
    "emailNote",
    "emailUsage"
})
public class BPSUITERplctReqAddrInfoAddrEml {

    @XmlElement(name = "URI", required = true)
    protected EmailURI uri;
    @XmlElement(name = "UsageDeniedIndicator")
    protected Boolean usageDeniedIndicator;
    @XmlElement(name = "ValidityPeriod")
    protected CLOSEDDatePeriod validityPeriod;
    @XmlElement(name = "TransportNeutralEncapsulationFormatEnabledIndicator")
    protected Boolean transportNeutralEncapsulationFormatEnabledIndicator;
    @XmlElement(name = "EmailNote")
    protected List<BPSUITERplctReqNote> emailNote;
    @XmlElement(name = "EmailUsage")
    protected List<BPSUITERplctReqAddrInfoAddrEmlUsge> emailUsage;
    @XmlAttribute(name = "actionCode")
    protected String actionCode;
    @XmlAttribute(name = "eMailNoteListCompleteTransmissionIndicator")
    protected Boolean eMailNoteListCompleteTransmissionIndicator;
    @XmlAttribute(name = "eMailUsageListCompleteTransmissionIndicator")
    protected Boolean eMailUsageListCompleteTransmissionIndicator;

    /**
     * Obtém o valor da propriedade uri.
     * 
     * @return
     *     possible object is
     *     {@link EmailURI }
     *     
     */
    public EmailURI getURI() {
        return uri;
    }

    /**
     * Define o valor da propriedade uri.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailURI }
     *     
     */
    public void setURI(EmailURI value) {
        this.uri = value;
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
     * Obtém o valor da propriedade transportNeutralEncapsulationFormatEnabledIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTransportNeutralEncapsulationFormatEnabledIndicator() {
        return transportNeutralEncapsulationFormatEnabledIndicator;
    }

    /**
     * Define o valor da propriedade transportNeutralEncapsulationFormatEnabledIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransportNeutralEncapsulationFormatEnabledIndicator(Boolean value) {
        this.transportNeutralEncapsulationFormatEnabledIndicator = value;
    }

    /**
     * Gets the value of the emailNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPSUITERplctReqNote }
     * 
     * 
     */
    public List<BPSUITERplctReqNote> getEmailNote() {
        if (emailNote == null) {
            emailNote = new ArrayList<BPSUITERplctReqNote>();
        }
        return this.emailNote;
    }

    /**
     * Gets the value of the emailUsage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailUsage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailUsage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPSUITERplctReqAddrInfoAddrEmlUsge }
     * 
     * 
     */
    public List<BPSUITERplctReqAddrInfoAddrEmlUsge> getEmailUsage() {
        if (emailUsage == null) {
            emailUsage = new ArrayList<BPSUITERplctReqAddrInfoAddrEmlUsge>();
        }
        return this.emailUsage;
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
     * Obtém o valor da propriedade eMailNoteListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEMailNoteListCompleteTransmissionIndicator() {
        return eMailNoteListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade eMailNoteListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEMailNoteListCompleteTransmissionIndicator(Boolean value) {
        this.eMailNoteListCompleteTransmissionIndicator = value;
    }

    /**
     * Obtém o valor da propriedade eMailUsageListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEMailUsageListCompleteTransmissionIndicator() {
        return eMailUsageListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade eMailUsageListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEMailUsageListCompleteTransmissionIndicator(Boolean value) {
        this.eMailUsageListCompleteTransmissionIndicator = value;
    }

}
