
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BPSUITERplctReqAddrInfoAddrFacs complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPSUITERplctReqAddrInfoAddrFacs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Number" type="{http://ariba.com/xi/SupplierManagement}PhoneNumber"/&gt;
 *         &lt;element name="FormattedNumberDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UsageDeniedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ValidityPeriod" type="{http://ariba.com/xi/SupplierManagement}CLOSED_DatePeriod" minOccurs="0"/&gt;
 *         &lt;element name="FacsimileNote" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqNote" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FacsimileUsage" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqAddrInfoAddrFacsUsge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="actionCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="facsimileNoteListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="facsimileUsageListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BPSUITERplctReqAddrInfoAddrFacs", propOrder = {
    "number",
    "formattedNumberDescription",
    "usageDeniedIndicator",
    "validityPeriod",
    "facsimileNote",
    "facsimileUsage"
})
public class BPSUITERplctReqAddrInfoAddrFacs {

    @XmlElement(name = "Number", required = true)
    protected PhoneNumber number;
    @XmlElement(name = "FormattedNumberDescription")
    protected String formattedNumberDescription;
    @XmlElement(name = "UsageDeniedIndicator")
    protected Boolean usageDeniedIndicator;
    @XmlElement(name = "ValidityPeriod")
    protected CLOSEDDatePeriod validityPeriod;
    @XmlElement(name = "FacsimileNote")
    protected List<BPSUITERplctReqNote> facsimileNote;
    @XmlElement(name = "FacsimileUsage")
    protected List<BPSUITERplctReqAddrInfoAddrFacsUsge> facsimileUsage;
    @XmlAttribute(name = "actionCode")
    protected String actionCode;
    @XmlAttribute(name = "facsimileNoteListCompleteTransmissionIndicator")
    protected Boolean facsimileNoteListCompleteTransmissionIndicator;
    @XmlAttribute(name = "facsimileUsageListCompleteTransmissionIndicator")
    protected Boolean facsimileUsageListCompleteTransmissionIndicator;

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
     * Gets the value of the facsimileNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facsimileNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacsimileNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPSUITERplctReqNote }
     * 
     * 
     */
    public List<BPSUITERplctReqNote> getFacsimileNote() {
        if (facsimileNote == null) {
            facsimileNote = new ArrayList<BPSUITERplctReqNote>();
        }
        return this.facsimileNote;
    }

    /**
     * Gets the value of the facsimileUsage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facsimileUsage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacsimileUsage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPSUITERplctReqAddrInfoAddrFacsUsge }
     * 
     * 
     */
    public List<BPSUITERplctReqAddrInfoAddrFacsUsge> getFacsimileUsage() {
        if (facsimileUsage == null) {
            facsimileUsage = new ArrayList<BPSUITERplctReqAddrInfoAddrFacsUsge>();
        }
        return this.facsimileUsage;
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
     * Obtém o valor da propriedade facsimileNoteListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFacsimileNoteListCompleteTransmissionIndicator() {
        return facsimileNoteListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade facsimileNoteListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFacsimileNoteListCompleteTransmissionIndicator(Boolean value) {
        this.facsimileNoteListCompleteTransmissionIndicator = value;
    }

    /**
     * Obtém o valor da propriedade facsimileUsageListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFacsimileUsageListCompleteTransmissionIndicator() {
        return facsimileUsageListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade facsimileUsageListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFacsimileUsageListCompleteTransmissionIndicator(Boolean value) {
        this.facsimileUsageListCompleteTransmissionIndicator = value;
    }

}
