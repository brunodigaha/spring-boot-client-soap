
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java de BPSUITERplctReqBP complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPSUITERplctReqBP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UUID" type="{http://ariba.com/xi/SupplierManagement}UUID" minOccurs="0"/&gt;
 *         &lt;element name="InternalID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverUUID" type="{http://ariba.com/xi/SupplierManagement}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverInternalID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="CategoryCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="ExternalID" type="{http://ariba.com/xi/SupplierManagement}NOCONVERSION_ObjectID" minOccurs="0"/&gt;
 *         &lt;element name="NumberRangeIntervalBusinessPartnerGroupCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="Customer" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqCustInfo" minOccurs="0"/&gt;
 *         &lt;element name="Supplier" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqSuplr" minOccurs="0"/&gt;
 *         &lt;element name="AddressInformation" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqAddrInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BankDetails" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqBkDets" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Common" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqCom" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Role" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqRole" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Identification" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqIdn" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="IndustrySector" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqIndstrySectr" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TaxNumber" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqTxNo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GenericCustomField" type="{http://ariba.com/xi/SupplierManagement}GenericCustomField" maxOccurs="unbounded" minOccurs="0" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="actionCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="changeOrdinalNumberValue" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="reconciliationPeriodCounterValue" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="addressInformationListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="bankDetailsListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="commonListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="roleListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="identificationListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="industrySectorListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="taxNumberListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute ref="{http://ariba.com/xi/SupplierManagement}genericCustomFieldListCompleteTransmissionIndicator"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BPSUITERplctReqBP", propOrder = {
    "uuid",
    "internalID",
    "receiverUUID",
    "receiverInternalID",
    "categoryCode",
    "externalID",
    "numberRangeIntervalBusinessPartnerGroupCode",
    "customer",
    "supplier",
    "addressInformation",
    "bankDetails",
    "common",
    "role",
    "identification",
    "industrySector",
    "taxNumber",
    "genericCustomField"
})
public class BPSUITERplctReqBP {

    @XmlElement(name = "UUID")
    protected UUID uuid;
    @XmlElement(name = "InternalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String internalID;
    @XmlElement(name = "ReceiverUUID")
    protected UUID receiverUUID;
    @XmlElement(name = "ReceiverInternalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String receiverInternalID;
    @XmlElement(name = "CategoryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String categoryCode;
    @XmlElement(name = "ExternalID")
    protected NOCONVERSIONObjectID externalID;
    @XmlElement(name = "NumberRangeIntervalBusinessPartnerGroupCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String numberRangeIntervalBusinessPartnerGroupCode;
    @XmlElement(name = "Customer")
    protected BPSUITERplctReqCustInfo customer;
    @XmlElement(name = "Supplier")
    protected BPSUITERplctReqSuplr supplier;
    @XmlElement(name = "AddressInformation")
    protected List<BPSUITERplctReqAddrInfo> addressInformation;
    @XmlElement(name = "BankDetails")
    protected List<BPSUITERplctReqBkDets> bankDetails;
    @XmlElement(name = "Common")
    protected List<BPSUITERplctReqCom> common;
    @XmlElement(name = "Role")
    protected List<BPSUITERplctReqRole> role;
    @XmlElement(name = "Identification")
    protected List<BPSUITERplctReqIdn> identification;
    @XmlElement(name = "IndustrySector")
    protected List<BPSUITERplctReqIndstrySectr> industrySector;
    @XmlElement(name = "TaxNumber")
    protected List<BPSUITERplctReqTxNo> taxNumber;
    @XmlElement(name = "GenericCustomField", namespace = "http://ariba.com/xi/SupplierManagement")
    protected List<GenericCustomField> genericCustomField;
    @XmlAttribute(name = "actionCode")
    protected String actionCode;
    @XmlAttribute(name = "changeOrdinalNumberValue")
    protected BigDecimal changeOrdinalNumberValue;
    @XmlAttribute(name = "reconciliationPeriodCounterValue")
    protected Integer reconciliationPeriodCounterValue;
    @XmlAttribute(name = "addressInformationListCompleteTransmissionIndicator")
    protected Boolean addressInformationListCompleteTransmissionIndicator;
    @XmlAttribute(name = "bankDetailsListCompleteTransmissionIndicator")
    protected Boolean bankDetailsListCompleteTransmissionIndicator;
    @XmlAttribute(name = "commonListCompleteTransmissionIndicator")
    protected Boolean commonListCompleteTransmissionIndicator;
    @XmlAttribute(name = "roleListCompleteTransmissionIndicator")
    protected Boolean roleListCompleteTransmissionIndicator;
    @XmlAttribute(name = "identificationListCompleteTransmissionIndicator")
    protected Boolean identificationListCompleteTransmissionIndicator;
    @XmlAttribute(name = "industrySectorListCompleteTransmissionIndicator")
    protected Boolean industrySectorListCompleteTransmissionIndicator;
    @XmlAttribute(name = "taxNumberListCompleteTransmissionIndicator")
    protected Boolean taxNumberListCompleteTransmissionIndicator;
    @XmlAttribute(name = "genericCustomFieldListCompleteTransmissionIndicator", namespace = "http://ariba.com/xi/SupplierManagement")
    protected String genericCustomFieldListCompleteTransmissionIndicator;

    /**
     * Obtém o valor da propriedade uuid.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getUUID() {
        return uuid;
    }

    /**
     * Define o valor da propriedade uuid.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setUUID(UUID value) {
        this.uuid = value;
    }

    /**
     * Obtém o valor da propriedade internalID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalID() {
        return internalID;
    }

    /**
     * Define o valor da propriedade internalID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalID(String value) {
        this.internalID = value;
    }

    /**
     * Obtém o valor da propriedade receiverUUID.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getReceiverUUID() {
        return receiverUUID;
    }

    /**
     * Define o valor da propriedade receiverUUID.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setReceiverUUID(UUID value) {
        this.receiverUUID = value;
    }

    /**
     * Obtém o valor da propriedade receiverInternalID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverInternalID() {
        return receiverInternalID;
    }

    /**
     * Define o valor da propriedade receiverInternalID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverInternalID(String value) {
        this.receiverInternalID = value;
    }

    /**
     * Obtém o valor da propriedade categoryCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryCode() {
        return categoryCode;
    }

    /**
     * Define o valor da propriedade categoryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryCode(String value) {
        this.categoryCode = value;
    }

    /**
     * Obtém o valor da propriedade externalID.
     * 
     * @return
     *     possible object is
     *     {@link NOCONVERSIONObjectID }
     *     
     */
    public NOCONVERSIONObjectID getExternalID() {
        return externalID;
    }

    /**
     * Define o valor da propriedade externalID.
     * 
     * @param value
     *     allowed object is
     *     {@link NOCONVERSIONObjectID }
     *     
     */
    public void setExternalID(NOCONVERSIONObjectID value) {
        this.externalID = value;
    }

    /**
     * Obtém o valor da propriedade numberRangeIntervalBusinessPartnerGroupCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberRangeIntervalBusinessPartnerGroupCode() {
        return numberRangeIntervalBusinessPartnerGroupCode;
    }

    /**
     * Define o valor da propriedade numberRangeIntervalBusinessPartnerGroupCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberRangeIntervalBusinessPartnerGroupCode(String value) {
        this.numberRangeIntervalBusinessPartnerGroupCode = value;
    }

    /**
     * Obtém o valor da propriedade customer.
     * 
     * @return
     *     possible object is
     *     {@link BPSUITERplctReqCustInfo }
     *     
     */
    public BPSUITERplctReqCustInfo getCustomer() {
        return customer;
    }

    /**
     * Define o valor da propriedade customer.
     * 
     * @param value
     *     allowed object is
     *     {@link BPSUITERplctReqCustInfo }
     *     
     */
    public void setCustomer(BPSUITERplctReqCustInfo value) {
        this.customer = value;
    }

    /**
     * Obtém o valor da propriedade supplier.
     * 
     * @return
     *     possible object is
     *     {@link BPSUITERplctReqSuplr }
     *     
     */
    public BPSUITERplctReqSuplr getSupplier() {
        return supplier;
    }

    /**
     * Define o valor da propriedade supplier.
     * 
     * @param value
     *     allowed object is
     *     {@link BPSUITERplctReqSuplr }
     *     
     */
    public void setSupplier(BPSUITERplctReqSuplr value) {
        this.supplier = value;
    }

    /**
     * Gets the value of the addressInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPSUITERplctReqAddrInfo }
     * 
     * 
     */
    public List<BPSUITERplctReqAddrInfo> getAddressInformation() {
        if (addressInformation == null) {
            addressInformation = new ArrayList<BPSUITERplctReqAddrInfo>();
        }
        return this.addressInformation;
    }

    /**
     * Gets the value of the bankDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bankDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBankDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPSUITERplctReqBkDets }
     * 
     * 
     */
    public List<BPSUITERplctReqBkDets> getBankDetails() {
        if (bankDetails == null) {
            bankDetails = new ArrayList<BPSUITERplctReqBkDets>();
        }
        return this.bankDetails;
    }

    /**
     * Gets the value of the common property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the common property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPSUITERplctReqCom }
     * 
     * 
     */
    public List<BPSUITERplctReqCom> getCommon() {
        if (common == null) {
            common = new ArrayList<BPSUITERplctReqCom>();
        }
        return this.common;
    }

    /**
     * Gets the value of the role property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the role property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPSUITERplctReqRole }
     * 
     * 
     */
    public List<BPSUITERplctReqRole> getRole() {
        if (role == null) {
            role = new ArrayList<BPSUITERplctReqRole>();
        }
        return this.role;
    }

    /**
     * Gets the value of the identification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPSUITERplctReqIdn }
     * 
     * 
     */
    public List<BPSUITERplctReqIdn> getIdentification() {
        if (identification == null) {
            identification = new ArrayList<BPSUITERplctReqIdn>();
        }
        return this.identification;
    }

    /**
     * Gets the value of the industrySector property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the industrySector property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndustrySector().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPSUITERplctReqIndstrySectr }
     * 
     * 
     */
    public List<BPSUITERplctReqIndstrySectr> getIndustrySector() {
        if (industrySector == null) {
            industrySector = new ArrayList<BPSUITERplctReqIndstrySectr>();
        }
        return this.industrySector;
    }

    /**
     * Gets the value of the taxNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPSUITERplctReqTxNo }
     * 
     * 
     */
    public List<BPSUITERplctReqTxNo> getTaxNumber() {
        if (taxNumber == null) {
            taxNumber = new ArrayList<BPSUITERplctReqTxNo>();
        }
        return this.taxNumber;
    }

    /**
     * Gets the value of the genericCustomField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericCustomField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericCustomField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericCustomField }
     * 
     * 
     */
    public List<GenericCustomField> getGenericCustomField() {
        if (genericCustomField == null) {
            genericCustomField = new ArrayList<GenericCustomField>();
        }
        return this.genericCustomField;
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

    /**
     * Obtém o valor da propriedade addressInformationListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddressInformationListCompleteTransmissionIndicator() {
        return addressInformationListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade addressInformationListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddressInformationListCompleteTransmissionIndicator(Boolean value) {
        this.addressInformationListCompleteTransmissionIndicator = value;
    }

    /**
     * Obtém o valor da propriedade bankDetailsListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBankDetailsListCompleteTransmissionIndicator() {
        return bankDetailsListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade bankDetailsListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBankDetailsListCompleteTransmissionIndicator(Boolean value) {
        this.bankDetailsListCompleteTransmissionIndicator = value;
    }

    /**
     * Obtém o valor da propriedade commonListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCommonListCompleteTransmissionIndicator() {
        return commonListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade commonListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCommonListCompleteTransmissionIndicator(Boolean value) {
        this.commonListCompleteTransmissionIndicator = value;
    }

    /**
     * Obtém o valor da propriedade roleListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRoleListCompleteTransmissionIndicator() {
        return roleListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade roleListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRoleListCompleteTransmissionIndicator(Boolean value) {
        this.roleListCompleteTransmissionIndicator = value;
    }

    /**
     * Obtém o valor da propriedade identificationListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIdentificationListCompleteTransmissionIndicator() {
        return identificationListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade identificationListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIdentificationListCompleteTransmissionIndicator(Boolean value) {
        this.identificationListCompleteTransmissionIndicator = value;
    }

    /**
     * Obtém o valor da propriedade industrySectorListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndustrySectorListCompleteTransmissionIndicator() {
        return industrySectorListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade industrySectorListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndustrySectorListCompleteTransmissionIndicator(Boolean value) {
        this.industrySectorListCompleteTransmissionIndicator = value;
    }

    /**
     * Obtém o valor da propriedade taxNumberListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxNumberListCompleteTransmissionIndicator() {
        return taxNumberListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade taxNumberListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxNumberListCompleteTransmissionIndicator(Boolean value) {
        this.taxNumberListCompleteTransmissionIndicator = value;
    }

    /**
     * Obtém o valor da propriedade genericCustomFieldListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenericCustomFieldListCompleteTransmissionIndicator() {
        return genericCustomFieldListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade genericCustomFieldListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenericCustomFieldListCompleteTransmissionIndicator(String value) {
        this.genericCustomFieldListCompleteTransmissionIndicator = value;
    }

}
