
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java de BPRelshpSUITERplctConfBPRelshp complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPRelshpSUITERplctConfBPRelshp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BusinessPartnerUUID" type="{http://ariba.com/xi/SupplierManagement}UUID" minOccurs="0"/&gt;
 *         &lt;element name="BusinessPartnerInternalID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverBusinessPartnerUUID" type="{http://ariba.com/xi/SupplierManagement}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverBusinessPartnerInternalID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="RelatedBusinessPartnerUUID" type="{http://ariba.com/xi/SupplierManagement}UUID" minOccurs="0"/&gt;
 *         &lt;element name="RelatedBusinessPartnerInternalID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverRelatedBusinessPartnerUUID" type="{http://ariba.com/xi/SupplierManagement}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverRelatedBusinessPartnerInternalID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="RoleCode" type="{http://ariba.com/xi/SupplierManagement}MDGBusinessPartnerRelationshipCategoryCode" minOccurs="0"/&gt;
 *         &lt;element name="ValidityPeriod" type="{http://ariba.com/xi/SupplierManagement}CLOSED_DatePeriod" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BPRelshpSUITERplctConfBPRelshp", propOrder = {
    "businessPartnerUUID",
    "businessPartnerInternalID",
    "receiverBusinessPartnerUUID",
    "receiverBusinessPartnerInternalID",
    "relatedBusinessPartnerUUID",
    "relatedBusinessPartnerInternalID",
    "receiverRelatedBusinessPartnerUUID",
    "receiverRelatedBusinessPartnerInternalID",
    "roleCode",
    "validityPeriod"
})
public class BPRelshpSUITERplctConfBPRelshp {

    @XmlElement(name = "BusinessPartnerUUID")
    protected UUID businessPartnerUUID;
    @XmlElement(name = "BusinessPartnerInternalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String businessPartnerInternalID;
    @XmlElement(name = "ReceiverBusinessPartnerUUID")
    protected UUID receiverBusinessPartnerUUID;
    @XmlElement(name = "ReceiverBusinessPartnerInternalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String receiverBusinessPartnerInternalID;
    @XmlElement(name = "RelatedBusinessPartnerUUID")
    protected UUID relatedBusinessPartnerUUID;
    @XmlElement(name = "RelatedBusinessPartnerInternalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String relatedBusinessPartnerInternalID;
    @XmlElement(name = "ReceiverRelatedBusinessPartnerUUID")
    protected UUID receiverRelatedBusinessPartnerUUID;
    @XmlElement(name = "ReceiverRelatedBusinessPartnerInternalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String receiverRelatedBusinessPartnerInternalID;
    @XmlElement(name = "RoleCode")
    protected MDGBusinessPartnerRelationshipCategoryCode roleCode;
    @XmlElement(name = "ValidityPeriod")
    protected CLOSEDDatePeriod validityPeriod;

    /**
     * Obtém o valor da propriedade businessPartnerUUID.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getBusinessPartnerUUID() {
        return businessPartnerUUID;
    }

    /**
     * Define o valor da propriedade businessPartnerUUID.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setBusinessPartnerUUID(UUID value) {
        this.businessPartnerUUID = value;
    }

    /**
     * Obtém o valor da propriedade businessPartnerInternalID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessPartnerInternalID() {
        return businessPartnerInternalID;
    }

    /**
     * Define o valor da propriedade businessPartnerInternalID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessPartnerInternalID(String value) {
        this.businessPartnerInternalID = value;
    }

    /**
     * Obtém o valor da propriedade receiverBusinessPartnerUUID.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getReceiverBusinessPartnerUUID() {
        return receiverBusinessPartnerUUID;
    }

    /**
     * Define o valor da propriedade receiverBusinessPartnerUUID.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setReceiverBusinessPartnerUUID(UUID value) {
        this.receiverBusinessPartnerUUID = value;
    }

    /**
     * Obtém o valor da propriedade receiverBusinessPartnerInternalID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverBusinessPartnerInternalID() {
        return receiverBusinessPartnerInternalID;
    }

    /**
     * Define o valor da propriedade receiverBusinessPartnerInternalID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverBusinessPartnerInternalID(String value) {
        this.receiverBusinessPartnerInternalID = value;
    }

    /**
     * Obtém o valor da propriedade relatedBusinessPartnerUUID.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getRelatedBusinessPartnerUUID() {
        return relatedBusinessPartnerUUID;
    }

    /**
     * Define o valor da propriedade relatedBusinessPartnerUUID.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setRelatedBusinessPartnerUUID(UUID value) {
        this.relatedBusinessPartnerUUID = value;
    }

    /**
     * Obtém o valor da propriedade relatedBusinessPartnerInternalID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedBusinessPartnerInternalID() {
        return relatedBusinessPartnerInternalID;
    }

    /**
     * Define o valor da propriedade relatedBusinessPartnerInternalID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedBusinessPartnerInternalID(String value) {
        this.relatedBusinessPartnerInternalID = value;
    }

    /**
     * Obtém o valor da propriedade receiverRelatedBusinessPartnerUUID.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getReceiverRelatedBusinessPartnerUUID() {
        return receiverRelatedBusinessPartnerUUID;
    }

    /**
     * Define o valor da propriedade receiverRelatedBusinessPartnerUUID.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setReceiverRelatedBusinessPartnerUUID(UUID value) {
        this.receiverRelatedBusinessPartnerUUID = value;
    }

    /**
     * Obtém o valor da propriedade receiverRelatedBusinessPartnerInternalID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverRelatedBusinessPartnerInternalID() {
        return receiverRelatedBusinessPartnerInternalID;
    }

    /**
     * Define o valor da propriedade receiverRelatedBusinessPartnerInternalID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverRelatedBusinessPartnerInternalID(String value) {
        this.receiverRelatedBusinessPartnerInternalID = value;
    }

    /**
     * Obtém o valor da propriedade roleCode.
     * 
     * @return
     *     possible object is
     *     {@link MDGBusinessPartnerRelationshipCategoryCode }
     *     
     */
    public MDGBusinessPartnerRelationshipCategoryCode getRoleCode() {
        return roleCode;
    }

    /**
     * Define o valor da propriedade roleCode.
     * 
     * @param value
     *     allowed object is
     *     {@link MDGBusinessPartnerRelationshipCategoryCode }
     *     
     */
    public void setRoleCode(MDGBusinessPartnerRelationshipCategoryCode value) {
        this.roleCode = value;
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

}
