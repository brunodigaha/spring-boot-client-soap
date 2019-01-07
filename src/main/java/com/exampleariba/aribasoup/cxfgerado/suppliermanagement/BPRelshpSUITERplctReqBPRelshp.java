
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java de BPRelshpSUITERplctReqBPRelshp complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPRelshpSUITERplctReqBPRelshp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BusinessPartnerUUID" type="{http://ariba.com/xi/SupplierManagement}UUID" minOccurs="0"/&gt;
 *         &lt;element name="BusinessPartnerInternalID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverBusinessPartnerUUID" type="{http://ariba.com/xi/SupplierManagement}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverBusinessPartnerInternalID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="BusinessPartnerExternalID" type="{http://ariba.com/xi/SupplierManagement}NOCONVERSION_ObjectID" minOccurs="0"/&gt;
 *         &lt;element name="RelationshipBusinessPartnerUUID" type="{http://ariba.com/xi/SupplierManagement}UUID" minOccurs="0"/&gt;
 *         &lt;element name="RelationshipBusinessPartnerInternalID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverRelationshipBusinessPartnerUUID" type="{http://ariba.com/xi/SupplierManagement}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverRelationshipBusinessPartnerInternalID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="RelationshipBusinessPartnerExternalID" type="{http://ariba.com/xi/SupplierManagement}NOCONVERSION_ObjectID" minOccurs="0"/&gt;
 *         &lt;element name="RoleCode" type="{http://ariba.com/xi/SupplierManagement}MDGBusinessPartnerRelationshipCategoryCode" minOccurs="0"/&gt;
 *         &lt;element name="ValidityPeriod" type="{http://ariba.com/xi/SupplierManagement}CLOSED_DatePeriod" minOccurs="0"/&gt;
 *         &lt;element name="DefaultIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ContactPerson" type="{http://ariba.com/xi/SupplierManagement}BPRelshpSUITERplctReqCntctPersn" minOccurs="0"/&gt;
 *         &lt;element name="ShareHolder" type="{http://ariba.com/xi/SupplierManagement}BPRelshpSUITERplctReqShrhldr" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="actionCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="changeOrdinalNumberValue" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="reconciliationPeriodCounterValue" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BPRelshpSUITERplctReqBPRelshp", propOrder = {
    "businessPartnerUUID",
    "businessPartnerInternalID",
    "receiverBusinessPartnerUUID",
    "receiverBusinessPartnerInternalID",
    "businessPartnerExternalID",
    "relationshipBusinessPartnerUUID",
    "relationshipBusinessPartnerInternalID",
    "receiverRelationshipBusinessPartnerUUID",
    "receiverRelationshipBusinessPartnerInternalID",
    "relationshipBusinessPartnerExternalID",
    "roleCode",
    "validityPeriod",
    "defaultIndicator",
    "contactPerson",
    "shareHolder"
})
public class BPRelshpSUITERplctReqBPRelshp {

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
    @XmlElement(name = "BusinessPartnerExternalID")
    protected NOCONVERSIONObjectID businessPartnerExternalID;
    @XmlElement(name = "RelationshipBusinessPartnerUUID")
    protected UUID relationshipBusinessPartnerUUID;
    @XmlElement(name = "RelationshipBusinessPartnerInternalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String relationshipBusinessPartnerInternalID;
    @XmlElement(name = "ReceiverRelationshipBusinessPartnerUUID")
    protected UUID receiverRelationshipBusinessPartnerUUID;
    @XmlElement(name = "ReceiverRelationshipBusinessPartnerInternalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String receiverRelationshipBusinessPartnerInternalID;
    @XmlElement(name = "RelationshipBusinessPartnerExternalID")
    protected NOCONVERSIONObjectID relationshipBusinessPartnerExternalID;
    @XmlElement(name = "RoleCode")
    protected MDGBusinessPartnerRelationshipCategoryCode roleCode;
    @XmlElement(name = "ValidityPeriod")
    protected CLOSEDDatePeriod validityPeriod;
    @XmlElement(name = "DefaultIndicator")
    protected Boolean defaultIndicator;
    @XmlElement(name = "ContactPerson")
    protected BPRelshpSUITERplctReqCntctPersn contactPerson;
    @XmlElement(name = "ShareHolder")
    protected BPRelshpSUITERplctReqShrhldr shareHolder;
    @XmlAttribute(name = "actionCode")
    protected String actionCode;
    @XmlAttribute(name = "changeOrdinalNumberValue")
    protected BigDecimal changeOrdinalNumberValue;
    @XmlAttribute(name = "reconciliationPeriodCounterValue")
    protected Integer reconciliationPeriodCounterValue;

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
     * Obtém o valor da propriedade businessPartnerExternalID.
     * 
     * @return
     *     possible object is
     *     {@link NOCONVERSIONObjectID }
     *     
     */
    public NOCONVERSIONObjectID getBusinessPartnerExternalID() {
        return businessPartnerExternalID;
    }

    /**
     * Define o valor da propriedade businessPartnerExternalID.
     * 
     * @param value
     *     allowed object is
     *     {@link NOCONVERSIONObjectID }
     *     
     */
    public void setBusinessPartnerExternalID(NOCONVERSIONObjectID value) {
        this.businessPartnerExternalID = value;
    }

    /**
     * Obtém o valor da propriedade relationshipBusinessPartnerUUID.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getRelationshipBusinessPartnerUUID() {
        return relationshipBusinessPartnerUUID;
    }

    /**
     * Define o valor da propriedade relationshipBusinessPartnerUUID.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setRelationshipBusinessPartnerUUID(UUID value) {
        this.relationshipBusinessPartnerUUID = value;
    }

    /**
     * Obtém o valor da propriedade relationshipBusinessPartnerInternalID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipBusinessPartnerInternalID() {
        return relationshipBusinessPartnerInternalID;
    }

    /**
     * Define o valor da propriedade relationshipBusinessPartnerInternalID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipBusinessPartnerInternalID(String value) {
        this.relationshipBusinessPartnerInternalID = value;
    }

    /**
     * Obtém o valor da propriedade receiverRelationshipBusinessPartnerUUID.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getReceiverRelationshipBusinessPartnerUUID() {
        return receiverRelationshipBusinessPartnerUUID;
    }

    /**
     * Define o valor da propriedade receiverRelationshipBusinessPartnerUUID.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setReceiverRelationshipBusinessPartnerUUID(UUID value) {
        this.receiverRelationshipBusinessPartnerUUID = value;
    }

    /**
     * Obtém o valor da propriedade receiverRelationshipBusinessPartnerInternalID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverRelationshipBusinessPartnerInternalID() {
        return receiverRelationshipBusinessPartnerInternalID;
    }

    /**
     * Define o valor da propriedade receiverRelationshipBusinessPartnerInternalID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverRelationshipBusinessPartnerInternalID(String value) {
        this.receiverRelationshipBusinessPartnerInternalID = value;
    }

    /**
     * Obtém o valor da propriedade relationshipBusinessPartnerExternalID.
     * 
     * @return
     *     possible object is
     *     {@link NOCONVERSIONObjectID }
     *     
     */
    public NOCONVERSIONObjectID getRelationshipBusinessPartnerExternalID() {
        return relationshipBusinessPartnerExternalID;
    }

    /**
     * Define o valor da propriedade relationshipBusinessPartnerExternalID.
     * 
     * @param value
     *     allowed object is
     *     {@link NOCONVERSIONObjectID }
     *     
     */
    public void setRelationshipBusinessPartnerExternalID(NOCONVERSIONObjectID value) {
        this.relationshipBusinessPartnerExternalID = value;
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

    /**
     * Obtém o valor da propriedade defaultIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultIndicator() {
        return defaultIndicator;
    }

    /**
     * Define o valor da propriedade defaultIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultIndicator(Boolean value) {
        this.defaultIndicator = value;
    }

    /**
     * Obtém o valor da propriedade contactPerson.
     * 
     * @return
     *     possible object is
     *     {@link BPRelshpSUITERplctReqCntctPersn }
     *     
     */
    public BPRelshpSUITERplctReqCntctPersn getContactPerson() {
        return contactPerson;
    }

    /**
     * Define o valor da propriedade contactPerson.
     * 
     * @param value
     *     allowed object is
     *     {@link BPRelshpSUITERplctReqCntctPersn }
     *     
     */
    public void setContactPerson(BPRelshpSUITERplctReqCntctPersn value) {
        this.contactPerson = value;
    }

    /**
     * Obtém o valor da propriedade shareHolder.
     * 
     * @return
     *     possible object is
     *     {@link BPRelshpSUITERplctReqShrhldr }
     *     
     */
    public BPRelshpSUITERplctReqShrhldr getShareHolder() {
        return shareHolder;
    }

    /**
     * Define o valor da propriedade shareHolder.
     * 
     * @param value
     *     allowed object is
     *     {@link BPRelshpSUITERplctReqShrhldr }
     *     
     */
    public void setShareHolder(BPRelshpSUITERplctReqShrhldr value) {
        this.shareHolder = value;
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
     * Obtém o valor da propriedade changeOrdinalNumberValue.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChangeOrdinalNumberValue() {
        return changeOrdinalNumberValue;
    }

    /**
     * Define o valor da propriedade changeOrdinalNumberValue.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChangeOrdinalNumberValue(BigDecimal value) {
        this.changeOrdinalNumberValue = value;
    }

    /**
     * Obtém o valor da propriedade reconciliationPeriodCounterValue.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReconciliationPeriodCounterValue() {
        return reconciliationPeriodCounterValue;
    }

    /**
     * Define o valor da propriedade reconciliationPeriodCounterValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReconciliationPeriodCounterValue(Integer value) {
        this.reconciliationPeriodCounterValue = value;
    }

}
