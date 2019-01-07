
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java de BPSUITERplctReqCom complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPSUITERplctReqCom"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ValidityPeriod" type="{http://ariba.com/xi/SupplierManagement}CLOSED_DatePeriod" minOccurs="0"/&gt;
 *         &lt;element name="LocationStandardID" type="{http://ariba.com/xi/SupplierManagement}LocationStandardID" minOccurs="0"/&gt;
 *         &lt;element name="BusinessPartnerGroupCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="DeletedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReleasedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BlockedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BusinessPartnerAuthorisationGroupCode" type="{http://ariba.com/xi/SupplierManagement}AuthorisationGroupCode" minOccurs="0"/&gt;
 *         &lt;element name="KeyWordsText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalKeyWordsText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VerbalCommunicationLanguageCode" type="{http://www.w3.org/2001/XMLSchema}language" minOccurs="0"/&gt;
 *         &lt;element name="SalutationText" type="{http://ariba.com/xi/SupplierManagement}SalutationText" minOccurs="0"/&gt;
 *         &lt;element name="CorrespondenceBrailleRequiredIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CorrespondenceLargePrintRequiredIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NaturalPersonIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ContactAllowedCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="DataOriginTypeCode" type="{http://ariba.com/xi/SupplierManagement}DataOriginTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="Person" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqComPersn" minOccurs="0"/&gt;
 *         &lt;element name="Organisation" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqComOrg" minOccurs="0"/&gt;
 *         &lt;element name="Group" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqComGrp" minOccurs="0"/&gt;
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
@XmlType(name = "BPSUITERplctReqCom", propOrder = {
    "validityPeriod",
    "locationStandardID",
    "businessPartnerGroupCode",
    "deletedIndicator",
    "releasedIndicator",
    "blockedIndicator",
    "businessPartnerAuthorisationGroupCode",
    "keyWordsText",
    "additionalKeyWordsText",
    "verbalCommunicationLanguageCode",
    "salutationText",
    "correspondenceBrailleRequiredIndicator",
    "correspondenceLargePrintRequiredIndicator",
    "naturalPersonIndicator",
    "contactAllowedCode",
    "dataOriginTypeCode",
    "person",
    "organisation",
    "group"
})
public class BPSUITERplctReqCom {

    @XmlElement(name = "ValidityPeriod")
    protected CLOSEDDatePeriod validityPeriod;
    @XmlElement(name = "LocationStandardID")
    protected LocationStandardID locationStandardID;
    @XmlElement(name = "BusinessPartnerGroupCode")
    protected Code businessPartnerGroupCode;
    @XmlElement(name = "DeletedIndicator")
    protected Boolean deletedIndicator;
    @XmlElement(name = "ReleasedIndicator")
    protected Boolean releasedIndicator;
    @XmlElement(name = "BlockedIndicator")
    protected Boolean blockedIndicator;
    @XmlElement(name = "BusinessPartnerAuthorisationGroupCode")
    protected AuthorisationGroupCode businessPartnerAuthorisationGroupCode;
    @XmlElement(name = "KeyWordsText")
    protected String keyWordsText;
    @XmlElement(name = "AdditionalKeyWordsText")
    protected String additionalKeyWordsText;
    @XmlElement(name = "VerbalCommunicationLanguageCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String verbalCommunicationLanguageCode;
    @XmlElement(name = "SalutationText")
    protected SalutationText salutationText;
    @XmlElement(name = "CorrespondenceBrailleRequiredIndicator")
    protected Boolean correspondenceBrailleRequiredIndicator;
    @XmlElement(name = "CorrespondenceLargePrintRequiredIndicator")
    protected Boolean correspondenceLargePrintRequiredIndicator;
    @XmlElement(name = "NaturalPersonIndicator")
    protected Boolean naturalPersonIndicator;
    @XmlElement(name = "ContactAllowedCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String contactAllowedCode;
    @XmlElement(name = "DataOriginTypeCode")
    protected DataOriginTypeCode dataOriginTypeCode;
    @XmlElement(name = "Person")
    protected BPSUITERplctReqComPersn person;
    @XmlElement(name = "Organisation")
    protected BPSUITERplctReqComOrg organisation;
    @XmlElement(name = "Group")
    protected BPSUITERplctReqComGrp group;
    @XmlAttribute(name = "actionCode")
    protected String actionCode;

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
     * Obtém o valor da propriedade locationStandardID.
     * 
     * @return
     *     possible object is
     *     {@link LocationStandardID }
     *     
     */
    public LocationStandardID getLocationStandardID() {
        return locationStandardID;
    }

    /**
     * Define o valor da propriedade locationStandardID.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationStandardID }
     *     
     */
    public void setLocationStandardID(LocationStandardID value) {
        this.locationStandardID = value;
    }

    /**
     * Obtém o valor da propriedade businessPartnerGroupCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getBusinessPartnerGroupCode() {
        return businessPartnerGroupCode;
    }

    /**
     * Define o valor da propriedade businessPartnerGroupCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setBusinessPartnerGroupCode(Code value) {
        this.businessPartnerGroupCode = value;
    }

    /**
     * Obtém o valor da propriedade deletedIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeletedIndicator() {
        return deletedIndicator;
    }

    /**
     * Define o valor da propriedade deletedIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeletedIndicator(Boolean value) {
        this.deletedIndicator = value;
    }

    /**
     * Obtém o valor da propriedade releasedIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReleasedIndicator() {
        return releasedIndicator;
    }

    /**
     * Define o valor da propriedade releasedIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReleasedIndicator(Boolean value) {
        this.releasedIndicator = value;
    }

    /**
     * Obtém o valor da propriedade blockedIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBlockedIndicator() {
        return blockedIndicator;
    }

    /**
     * Define o valor da propriedade blockedIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBlockedIndicator(Boolean value) {
        this.blockedIndicator = value;
    }

    /**
     * Obtém o valor da propriedade businessPartnerAuthorisationGroupCode.
     * 
     * @return
     *     possible object is
     *     {@link AuthorisationGroupCode }
     *     
     */
    public AuthorisationGroupCode getBusinessPartnerAuthorisationGroupCode() {
        return businessPartnerAuthorisationGroupCode;
    }

    /**
     * Define o valor da propriedade businessPartnerAuthorisationGroupCode.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorisationGroupCode }
     *     
     */
    public void setBusinessPartnerAuthorisationGroupCode(AuthorisationGroupCode value) {
        this.businessPartnerAuthorisationGroupCode = value;
    }

    /**
     * Obtém o valor da propriedade keyWordsText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyWordsText() {
        return keyWordsText;
    }

    /**
     * Define o valor da propriedade keyWordsText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyWordsText(String value) {
        this.keyWordsText = value;
    }

    /**
     * Obtém o valor da propriedade additionalKeyWordsText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalKeyWordsText() {
        return additionalKeyWordsText;
    }

    /**
     * Define o valor da propriedade additionalKeyWordsText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalKeyWordsText(String value) {
        this.additionalKeyWordsText = value;
    }

    /**
     * Obtém o valor da propriedade verbalCommunicationLanguageCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerbalCommunicationLanguageCode() {
        return verbalCommunicationLanguageCode;
    }

    /**
     * Define o valor da propriedade verbalCommunicationLanguageCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerbalCommunicationLanguageCode(String value) {
        this.verbalCommunicationLanguageCode = value;
    }

    /**
     * Obtém o valor da propriedade salutationText.
     * 
     * @return
     *     possible object is
     *     {@link SalutationText }
     *     
     */
    public SalutationText getSalutationText() {
        return salutationText;
    }

    /**
     * Define o valor da propriedade salutationText.
     * 
     * @param value
     *     allowed object is
     *     {@link SalutationText }
     *     
     */
    public void setSalutationText(SalutationText value) {
        this.salutationText = value;
    }

    /**
     * Obtém o valor da propriedade correspondenceBrailleRequiredIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCorrespondenceBrailleRequiredIndicator() {
        return correspondenceBrailleRequiredIndicator;
    }

    /**
     * Define o valor da propriedade correspondenceBrailleRequiredIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCorrespondenceBrailleRequiredIndicator(Boolean value) {
        this.correspondenceBrailleRequiredIndicator = value;
    }

    /**
     * Obtém o valor da propriedade correspondenceLargePrintRequiredIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCorrespondenceLargePrintRequiredIndicator() {
        return correspondenceLargePrintRequiredIndicator;
    }

    /**
     * Define o valor da propriedade correspondenceLargePrintRequiredIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCorrespondenceLargePrintRequiredIndicator(Boolean value) {
        this.correspondenceLargePrintRequiredIndicator = value;
    }

    /**
     * Obtém o valor da propriedade naturalPersonIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNaturalPersonIndicator() {
        return naturalPersonIndicator;
    }

    /**
     * Define o valor da propriedade naturalPersonIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNaturalPersonIndicator(Boolean value) {
        this.naturalPersonIndicator = value;
    }

    /**
     * Obtém o valor da propriedade contactAllowedCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactAllowedCode() {
        return contactAllowedCode;
    }

    /**
     * Define o valor da propriedade contactAllowedCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactAllowedCode(String value) {
        this.contactAllowedCode = value;
    }

    /**
     * Obtém o valor da propriedade dataOriginTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link DataOriginTypeCode }
     *     
     */
    public DataOriginTypeCode getDataOriginTypeCode() {
        return dataOriginTypeCode;
    }

    /**
     * Define o valor da propriedade dataOriginTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link DataOriginTypeCode }
     *     
     */
    public void setDataOriginTypeCode(DataOriginTypeCode value) {
        this.dataOriginTypeCode = value;
    }

    /**
     * Obtém o valor da propriedade person.
     * 
     * @return
     *     possible object is
     *     {@link BPSUITERplctReqComPersn }
     *     
     */
    public BPSUITERplctReqComPersn getPerson() {
        return person;
    }

    /**
     * Define o valor da propriedade person.
     * 
     * @param value
     *     allowed object is
     *     {@link BPSUITERplctReqComPersn }
     *     
     */
    public void setPerson(BPSUITERplctReqComPersn value) {
        this.person = value;
    }

    /**
     * Obtém o valor da propriedade organisation.
     * 
     * @return
     *     possible object is
     *     {@link BPSUITERplctReqComOrg }
     *     
     */
    public BPSUITERplctReqComOrg getOrganisation() {
        return organisation;
    }

    /**
     * Define o valor da propriedade organisation.
     * 
     * @param value
     *     allowed object is
     *     {@link BPSUITERplctReqComOrg }
     *     
     */
    public void setOrganisation(BPSUITERplctReqComOrg value) {
        this.organisation = value;
    }

    /**
     * Obtém o valor da propriedade group.
     * 
     * @return
     *     possible object is
     *     {@link BPSUITERplctReqComGrp }
     *     
     */
    public BPSUITERplctReqComGrp getGroup() {
        return group;
    }

    /**
     * Define o valor da propriedade group.
     * 
     * @param value
     *     allowed object is
     *     {@link BPSUITERplctReqComGrp }
     *     
     */
    public void setGroup(BPSUITERplctReqComGrp value) {
        this.group = value;
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
