
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de BPSUITERplctReqBkDets complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPSUITERplctReqBkDets"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="BankDirectoryReference" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqBkDetsBkDirRef" minOccurs="0"/&gt;
 *         &lt;element name="BankAccountHolderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BankAccountID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="BankAccountStandardID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="SubstituteBusinessPartnerBankDetailsID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="SubstituteDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ValidityPeriod" type="{http://ariba.com/xi/SupplierManagement}CLOSED_DatePeriod" minOccurs="0"/&gt;
 *         &lt;element name="CollectionAuthorisationIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BankControlKey" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="SpecificationsDescription" type="{http://ariba.com/xi/SupplierManagement}LEN20_Description" minOccurs="0"/&gt;
 *         &lt;element name="BankAccountExternalID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="GenericCustomField" type="{http://ariba.com/xi/SupplierManagement}GenericCustomField" maxOccurs="unbounded" minOccurs="0" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="actionCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute ref="{http://ariba.com/xi/SupplierManagement}genericCustomFieldListCompleteTransmissionIndicator"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BPSUITERplctReqBkDets", propOrder = {
    "id",
    "bankDirectoryReference",
    "bankAccountHolderName",
    "name",
    "bankAccountID",
    "bankAccountStandardID",
    "substituteBusinessPartnerBankDetailsID",
    "substituteDate",
    "validityPeriod",
    "collectionAuthorisationIndicator",
    "bankControlKey",
    "specificationsDescription",
    "bankAccountExternalID",
    "genericCustomField"
})
public class BPSUITERplctReqBkDets {

    @XmlElement(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String id;
    @XmlElement(name = "BankDirectoryReference")
    protected BPSUITERplctReqBkDetsBkDirRef bankDirectoryReference;
    @XmlElement(name = "BankAccountHolderName")
    protected String bankAccountHolderName;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "BankAccountID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String bankAccountID;
    @XmlElement(name = "BankAccountStandardID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String bankAccountStandardID;
    @XmlElement(name = "SubstituteBusinessPartnerBankDetailsID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String substituteBusinessPartnerBankDetailsID;
    @XmlElement(name = "SubstituteDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar substituteDate;
    @XmlElement(name = "ValidityPeriod")
    protected CLOSEDDatePeriod validityPeriod;
    @XmlElement(name = "CollectionAuthorisationIndicator")
    protected String collectionAuthorisationIndicator;
    @XmlElement(name = "BankControlKey")
    protected Code bankControlKey;
    @XmlElement(name = "SpecificationsDescription")
    protected LEN20Description specificationsDescription;
    @XmlElement(name = "BankAccountExternalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String bankAccountExternalID;
    @XmlElement(name = "GenericCustomField", namespace = "http://ariba.com/xi/SupplierManagement")
    protected List<GenericCustomField> genericCustomField;
    @XmlAttribute(name = "actionCode")
    protected String actionCode;
    @XmlAttribute(name = "genericCustomFieldListCompleteTransmissionIndicator", namespace = "http://ariba.com/xi/SupplierManagement")
    protected String genericCustomFieldListCompleteTransmissionIndicator;

    /**
     * Obtém o valor da propriedade id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade bankDirectoryReference.
     * 
     * @return
     *     possible object is
     *     {@link BPSUITERplctReqBkDetsBkDirRef }
     *     
     */
    public BPSUITERplctReqBkDetsBkDirRef getBankDirectoryReference() {
        return bankDirectoryReference;
    }

    /**
     * Define o valor da propriedade bankDirectoryReference.
     * 
     * @param value
     *     allowed object is
     *     {@link BPSUITERplctReqBkDetsBkDirRef }
     *     
     */
    public void setBankDirectoryReference(BPSUITERplctReqBkDetsBkDirRef value) {
        this.bankDirectoryReference = value;
    }

    /**
     * Obtém o valor da propriedade bankAccountHolderName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountHolderName() {
        return bankAccountHolderName;
    }

    /**
     * Define o valor da propriedade bankAccountHolderName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountHolderName(String value) {
        this.bankAccountHolderName = value;
    }

    /**
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtém o valor da propriedade bankAccountID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountID() {
        return bankAccountID;
    }

    /**
     * Define o valor da propriedade bankAccountID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountID(String value) {
        this.bankAccountID = value;
    }

    /**
     * Obtém o valor da propriedade bankAccountStandardID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountStandardID() {
        return bankAccountStandardID;
    }

    /**
     * Define o valor da propriedade bankAccountStandardID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountStandardID(String value) {
        this.bankAccountStandardID = value;
    }

    /**
     * Obtém o valor da propriedade substituteBusinessPartnerBankDetailsID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubstituteBusinessPartnerBankDetailsID() {
        return substituteBusinessPartnerBankDetailsID;
    }

    /**
     * Define o valor da propriedade substituteBusinessPartnerBankDetailsID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubstituteBusinessPartnerBankDetailsID(String value) {
        this.substituteBusinessPartnerBankDetailsID = value;
    }

    /**
     * Obtém o valor da propriedade substituteDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubstituteDate() {
        return substituteDate;
    }

    /**
     * Define o valor da propriedade substituteDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubstituteDate(XMLGregorianCalendar value) {
        this.substituteDate = value;
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
     * Obtém o valor da propriedade collectionAuthorisationIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionAuthorisationIndicator() {
        return collectionAuthorisationIndicator;
    }

    /**
     * Define o valor da propriedade collectionAuthorisationIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionAuthorisationIndicator(String value) {
        this.collectionAuthorisationIndicator = value;
    }

    /**
     * Obtém o valor da propriedade bankControlKey.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getBankControlKey() {
        return bankControlKey;
    }

    /**
     * Define o valor da propriedade bankControlKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setBankControlKey(Code value) {
        this.bankControlKey = value;
    }

    /**
     * Obtém o valor da propriedade specificationsDescription.
     * 
     * @return
     *     possible object is
     *     {@link LEN20Description }
     *     
     */
    public LEN20Description getSpecificationsDescription() {
        return specificationsDescription;
    }

    /**
     * Define o valor da propriedade specificationsDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link LEN20Description }
     *     
     */
    public void setSpecificationsDescription(LEN20Description value) {
        this.specificationsDescription = value;
    }

    /**
     * Obtém o valor da propriedade bankAccountExternalID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountExternalID() {
        return bankAccountExternalID;
    }

    /**
     * Define o valor da propriedade bankAccountExternalID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountExternalID(String value) {
        this.bankAccountExternalID = value;
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
