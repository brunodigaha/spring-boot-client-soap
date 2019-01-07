
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java de PersonName complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PersonName"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FormOfAddressCode" type="{http://ariba.com/xi/SupplierManagement}FormOfAddressCode" minOccurs="0"/&gt;
 *         &lt;element name="FormOfAddressName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FamilyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalFamilyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BirthName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NickName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InitialsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AcademicTitleCode" type="{http://ariba.com/xi/SupplierManagement}AcademicTitleCode" minOccurs="0"/&gt;
 *         &lt;element name="AcademicTitleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalAcademicTitleCode" type="{http://ariba.com/xi/SupplierManagement}AcademicTitleCode" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalAcademicTitleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NamePrefixCode" type="{http://ariba.com/xi/SupplierManagement}FamilyNamePrefixCode" minOccurs="0"/&gt;
 *         &lt;element name="NamePrefixName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalNamePrefixCode" type="{http://ariba.com/xi/SupplierManagement}FamilyNamePrefixCode" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalNamePrefixName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NameSupplementCode" type="{http://ariba.com/xi/SupplierManagement}PersonNameSupplementCode" minOccurs="0"/&gt;
 *         &lt;element name="NameSupplementName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeviatingFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NameFormatCountryCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="NameFormatCode" type="{http://ariba.com/xi/SupplierManagement}PersonNameFormatCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonName", propOrder = {
    "formOfAddressCode",
    "formOfAddressName",
    "givenName",
    "middleName",
    "familyName",
    "additionalFamilyName",
    "birthName",
    "nickName",
    "initialsName",
    "academicTitleCode",
    "academicTitleName",
    "additionalAcademicTitleCode",
    "additionalAcademicTitleName",
    "namePrefixCode",
    "namePrefixName",
    "additionalNamePrefixCode",
    "additionalNamePrefixName",
    "nameSupplementCode",
    "nameSupplementName",
    "deviatingFullName",
    "nameFormatCountryCode",
    "nameFormatCode"
})
public class PersonName {

    @XmlElement(name = "FormOfAddressCode")
    protected FormOfAddressCode formOfAddressCode;
    @XmlElement(name = "FormOfAddressName")
    protected String formOfAddressName;
    @XmlElement(name = "GivenName")
    protected String givenName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "FamilyName")
    protected String familyName;
    @XmlElement(name = "AdditionalFamilyName")
    protected String additionalFamilyName;
    @XmlElement(name = "BirthName")
    protected String birthName;
    @XmlElement(name = "NickName")
    protected String nickName;
    @XmlElement(name = "InitialsName")
    protected String initialsName;
    @XmlElement(name = "AcademicTitleCode")
    protected AcademicTitleCode academicTitleCode;
    @XmlElement(name = "AcademicTitleName")
    protected String academicTitleName;
    @XmlElement(name = "AdditionalAcademicTitleCode")
    protected AcademicTitleCode additionalAcademicTitleCode;
    @XmlElement(name = "AdditionalAcademicTitleName")
    protected String additionalAcademicTitleName;
    @XmlElement(name = "NamePrefixCode")
    protected FamilyNamePrefixCode namePrefixCode;
    @XmlElement(name = "NamePrefixName")
    protected String namePrefixName;
    @XmlElement(name = "AdditionalNamePrefixCode")
    protected FamilyNamePrefixCode additionalNamePrefixCode;
    @XmlElement(name = "AdditionalNamePrefixName")
    protected String additionalNamePrefixName;
    @XmlElement(name = "NameSupplementCode")
    protected PersonNameSupplementCode nameSupplementCode;
    @XmlElement(name = "NameSupplementName")
    protected String nameSupplementName;
    @XmlElement(name = "DeviatingFullName")
    protected String deviatingFullName;
    @XmlElement(name = "NameFormatCountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String nameFormatCountryCode;
    @XmlElement(name = "NameFormatCode")
    protected PersonNameFormatCode nameFormatCode;

    /**
     * Obtém o valor da propriedade formOfAddressCode.
     * 
     * @return
     *     possible object is
     *     {@link FormOfAddressCode }
     *     
     */
    public FormOfAddressCode getFormOfAddressCode() {
        return formOfAddressCode;
    }

    /**
     * Define o valor da propriedade formOfAddressCode.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfAddressCode }
     *     
     */
    public void setFormOfAddressCode(FormOfAddressCode value) {
        this.formOfAddressCode = value;
    }

    /**
     * Obtém o valor da propriedade formOfAddressName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormOfAddressName() {
        return formOfAddressName;
    }

    /**
     * Define o valor da propriedade formOfAddressName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormOfAddressName(String value) {
        this.formOfAddressName = value;
    }

    /**
     * Obtém o valor da propriedade givenName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGivenName() {
        return givenName;
    }

    /**
     * Define o valor da propriedade givenName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGivenName(String value) {
        this.givenName = value;
    }

    /**
     * Obtém o valor da propriedade middleName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Define o valor da propriedade middleName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Obtém o valor da propriedade familyName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyName() {
        return familyName;
    }

    /**
     * Define o valor da propriedade familyName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyName(String value) {
        this.familyName = value;
    }

    /**
     * Obtém o valor da propriedade additionalFamilyName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalFamilyName() {
        return additionalFamilyName;
    }

    /**
     * Define o valor da propriedade additionalFamilyName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalFamilyName(String value) {
        this.additionalFamilyName = value;
    }

    /**
     * Obtém o valor da propriedade birthName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthName() {
        return birthName;
    }

    /**
     * Define o valor da propriedade birthName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthName(String value) {
        this.birthName = value;
    }

    /**
     * Obtém o valor da propriedade nickName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * Define o valor da propriedade nickName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickName(String value) {
        this.nickName = value;
    }

    /**
     * Obtém o valor da propriedade initialsName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialsName() {
        return initialsName;
    }

    /**
     * Define o valor da propriedade initialsName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialsName(String value) {
        this.initialsName = value;
    }

    /**
     * Obtém o valor da propriedade academicTitleCode.
     * 
     * @return
     *     possible object is
     *     {@link AcademicTitleCode }
     *     
     */
    public AcademicTitleCode getAcademicTitleCode() {
        return academicTitleCode;
    }

    /**
     * Define o valor da propriedade academicTitleCode.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicTitleCode }
     *     
     */
    public void setAcademicTitleCode(AcademicTitleCode value) {
        this.academicTitleCode = value;
    }

    /**
     * Obtém o valor da propriedade academicTitleName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicTitleName() {
        return academicTitleName;
    }

    /**
     * Define o valor da propriedade academicTitleName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicTitleName(String value) {
        this.academicTitleName = value;
    }

    /**
     * Obtém o valor da propriedade additionalAcademicTitleCode.
     * 
     * @return
     *     possible object is
     *     {@link AcademicTitleCode }
     *     
     */
    public AcademicTitleCode getAdditionalAcademicTitleCode() {
        return additionalAcademicTitleCode;
    }

    /**
     * Define o valor da propriedade additionalAcademicTitleCode.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicTitleCode }
     *     
     */
    public void setAdditionalAcademicTitleCode(AcademicTitleCode value) {
        this.additionalAcademicTitleCode = value;
    }

    /**
     * Obtém o valor da propriedade additionalAcademicTitleName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalAcademicTitleName() {
        return additionalAcademicTitleName;
    }

    /**
     * Define o valor da propriedade additionalAcademicTitleName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalAcademicTitleName(String value) {
        this.additionalAcademicTitleName = value;
    }

    /**
     * Obtém o valor da propriedade namePrefixCode.
     * 
     * @return
     *     possible object is
     *     {@link FamilyNamePrefixCode }
     *     
     */
    public FamilyNamePrefixCode getNamePrefixCode() {
        return namePrefixCode;
    }

    /**
     * Define o valor da propriedade namePrefixCode.
     * 
     * @param value
     *     allowed object is
     *     {@link FamilyNamePrefixCode }
     *     
     */
    public void setNamePrefixCode(FamilyNamePrefixCode value) {
        this.namePrefixCode = value;
    }

    /**
     * Obtém o valor da propriedade namePrefixName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamePrefixName() {
        return namePrefixName;
    }

    /**
     * Define o valor da propriedade namePrefixName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamePrefixName(String value) {
        this.namePrefixName = value;
    }

    /**
     * Obtém o valor da propriedade additionalNamePrefixCode.
     * 
     * @return
     *     possible object is
     *     {@link FamilyNamePrefixCode }
     *     
     */
    public FamilyNamePrefixCode getAdditionalNamePrefixCode() {
        return additionalNamePrefixCode;
    }

    /**
     * Define o valor da propriedade additionalNamePrefixCode.
     * 
     * @param value
     *     allowed object is
     *     {@link FamilyNamePrefixCode }
     *     
     */
    public void setAdditionalNamePrefixCode(FamilyNamePrefixCode value) {
        this.additionalNamePrefixCode = value;
    }

    /**
     * Obtém o valor da propriedade additionalNamePrefixName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalNamePrefixName() {
        return additionalNamePrefixName;
    }

    /**
     * Define o valor da propriedade additionalNamePrefixName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalNamePrefixName(String value) {
        this.additionalNamePrefixName = value;
    }

    /**
     * Obtém o valor da propriedade nameSupplementCode.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameSupplementCode }
     *     
     */
    public PersonNameSupplementCode getNameSupplementCode() {
        return nameSupplementCode;
    }

    /**
     * Define o valor da propriedade nameSupplementCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameSupplementCode }
     *     
     */
    public void setNameSupplementCode(PersonNameSupplementCode value) {
        this.nameSupplementCode = value;
    }

    /**
     * Obtém o valor da propriedade nameSupplementName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameSupplementName() {
        return nameSupplementName;
    }

    /**
     * Define o valor da propriedade nameSupplementName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameSupplementName(String value) {
        this.nameSupplementName = value;
    }

    /**
     * Obtém o valor da propriedade deviatingFullName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviatingFullName() {
        return deviatingFullName;
    }

    /**
     * Define o valor da propriedade deviatingFullName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviatingFullName(String value) {
        this.deviatingFullName = value;
    }

    /**
     * Obtém o valor da propriedade nameFormatCountryCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameFormatCountryCode() {
        return nameFormatCountryCode;
    }

    /**
     * Define o valor da propriedade nameFormatCountryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameFormatCountryCode(String value) {
        this.nameFormatCountryCode = value;
    }

    /**
     * Obtém o valor da propriedade nameFormatCode.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameFormatCode }
     *     
     */
    public PersonNameFormatCode getNameFormatCode() {
        return nameFormatCode;
    }

    /**
     * Define o valor da propriedade nameFormatCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameFormatCode }
     *     
     */
    public void setNameFormatCode(PersonNameFormatCode value) {
        this.nameFormatCode = value;
    }

}
