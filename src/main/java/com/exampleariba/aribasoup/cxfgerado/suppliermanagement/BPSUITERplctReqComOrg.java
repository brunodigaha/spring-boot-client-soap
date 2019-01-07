
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de BPSUITERplctReqComOrg complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPSUITERplctReqComOrg"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://ariba.com/xi/SupplierManagement}OrganisationName" minOccurs="0"/&gt;
 *         &lt;element name="CompanyLegalFormCode" type="{http://ariba.com/xi/SupplierManagement}CompanyLegalFormCode" minOccurs="0"/&gt;
 *         &lt;element name="LegalEntityTypeCode" type="{http://ariba.com/xi/SupplierManagement}LegalEntityTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="FoundationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="LiquidationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BPSUITERplctReqComOrg", propOrder = {
    "name",
    "companyLegalFormCode",
    "legalEntityTypeCode",
    "foundationDate",
    "liquidationDate"
})
public class BPSUITERplctReqComOrg {

    @XmlElement(name = "Name")
    protected OrganisationName name;
    @XmlElement(name = "CompanyLegalFormCode")
    protected CompanyLegalFormCode companyLegalFormCode;
    @XmlElement(name = "LegalEntityTypeCode")
    protected LegalEntityTypeCode legalEntityTypeCode;
    @XmlElement(name = "FoundationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar foundationDate;
    @XmlElement(name = "LiquidationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar liquidationDate;

    /**
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationName }
     *     
     */
    public OrganisationName getName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationName }
     *     
     */
    public void setName(OrganisationName value) {
        this.name = value;
    }

    /**
     * Obtém o valor da propriedade companyLegalFormCode.
     * 
     * @return
     *     possible object is
     *     {@link CompanyLegalFormCode }
     *     
     */
    public CompanyLegalFormCode getCompanyLegalFormCode() {
        return companyLegalFormCode;
    }

    /**
     * Define o valor da propriedade companyLegalFormCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyLegalFormCode }
     *     
     */
    public void setCompanyLegalFormCode(CompanyLegalFormCode value) {
        this.companyLegalFormCode = value;
    }

    /**
     * Obtém o valor da propriedade legalEntityTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link LegalEntityTypeCode }
     *     
     */
    public LegalEntityTypeCode getLegalEntityTypeCode() {
        return legalEntityTypeCode;
    }

    /**
     * Define o valor da propriedade legalEntityTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalEntityTypeCode }
     *     
     */
    public void setLegalEntityTypeCode(LegalEntityTypeCode value) {
        this.legalEntityTypeCode = value;
    }

    /**
     * Obtém o valor da propriedade foundationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFoundationDate() {
        return foundationDate;
    }

    /**
     * Define o valor da propriedade foundationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFoundationDate(XMLGregorianCalendar value) {
        this.foundationDate = value;
    }

    /**
     * Obtém o valor da propriedade liquidationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLiquidationDate() {
        return liquidationDate;
    }

    /**
     * Define o valor da propriedade liquidationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLiquidationDate(XMLGregorianCalendar value) {
        this.liquidationDate = value;
    }

}
