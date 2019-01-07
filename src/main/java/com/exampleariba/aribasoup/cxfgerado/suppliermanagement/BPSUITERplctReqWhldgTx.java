
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BPSUITERplctReqWhldgTx complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPSUITERplctReqWhldgTx"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WithholdingTaxTypeCode" type="{http://ariba.com/xi/SupplierManagement}Code"/&gt;
 *         &lt;element name="SubjectToWithholdingTaxIndicator" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="VendorRecipientTypeCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="WithholdingTaxIdentificationNumber" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="WithholdingTaxCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="WithholdingTaxExemptionCertificateID" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="WithholdingTaxExemptionRate" type="{http://ariba.com/xi/SupplierManagement}Amount" minOccurs="0"/&gt;
 *         &lt;element name="WithholdingTaxExemptionValidityPeriod" type="{http://ariba.com/xi/SupplierManagement}CLOSED_DatePeriod" minOccurs="0"/&gt;
 *         &lt;element name="WithholdingTaxExemptionReasonCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BPSUITERplctReqWhldgTx", propOrder = {
    "withholdingTaxTypeCode",
    "subjectToWithholdingTaxIndicator",
    "vendorRecipientTypeCode",
    "withholdingTaxIdentificationNumber",
    "withholdingTaxCode",
    "withholdingTaxExemptionCertificateID",
    "withholdingTaxExemptionRate",
    "withholdingTaxExemptionValidityPeriod",
    "withholdingTaxExemptionReasonCode"
})
public class BPSUITERplctReqWhldgTx {

    @XmlElement(name = "WithholdingTaxTypeCode", required = true)
    protected Code withholdingTaxTypeCode;
    @XmlElement(name = "SubjectToWithholdingTaxIndicator")
    protected Code subjectToWithholdingTaxIndicator;
    @XmlElement(name = "VendorRecipientTypeCode")
    protected Code vendorRecipientTypeCode;
    @XmlElement(name = "WithholdingTaxIdentificationNumber")
    protected Code withholdingTaxIdentificationNumber;
    @XmlElement(name = "WithholdingTaxCode")
    protected Code withholdingTaxCode;
    @XmlElement(name = "WithholdingTaxExemptionCertificateID")
    protected Code withholdingTaxExemptionCertificateID;
    @XmlElement(name = "WithholdingTaxExemptionRate")
    protected Amount withholdingTaxExemptionRate;
    @XmlElement(name = "WithholdingTaxExemptionValidityPeriod")
    protected CLOSEDDatePeriod withholdingTaxExemptionValidityPeriod;
    @XmlElement(name = "WithholdingTaxExemptionReasonCode")
    protected Code withholdingTaxExemptionReasonCode;

    /**
     * Obtém o valor da propriedade withholdingTaxTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getWithholdingTaxTypeCode() {
        return withholdingTaxTypeCode;
    }

    /**
     * Define o valor da propriedade withholdingTaxTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setWithholdingTaxTypeCode(Code value) {
        this.withholdingTaxTypeCode = value;
    }

    /**
     * Obtém o valor da propriedade subjectToWithholdingTaxIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getSubjectToWithholdingTaxIndicator() {
        return subjectToWithholdingTaxIndicator;
    }

    /**
     * Define o valor da propriedade subjectToWithholdingTaxIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setSubjectToWithholdingTaxIndicator(Code value) {
        this.subjectToWithholdingTaxIndicator = value;
    }

    /**
     * Obtém o valor da propriedade vendorRecipientTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getVendorRecipientTypeCode() {
        return vendorRecipientTypeCode;
    }

    /**
     * Define o valor da propriedade vendorRecipientTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setVendorRecipientTypeCode(Code value) {
        this.vendorRecipientTypeCode = value;
    }

    /**
     * Obtém o valor da propriedade withholdingTaxIdentificationNumber.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getWithholdingTaxIdentificationNumber() {
        return withholdingTaxIdentificationNumber;
    }

    /**
     * Define o valor da propriedade withholdingTaxIdentificationNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setWithholdingTaxIdentificationNumber(Code value) {
        this.withholdingTaxIdentificationNumber = value;
    }

    /**
     * Obtém o valor da propriedade withholdingTaxCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getWithholdingTaxCode() {
        return withholdingTaxCode;
    }

    /**
     * Define o valor da propriedade withholdingTaxCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setWithholdingTaxCode(Code value) {
        this.withholdingTaxCode = value;
    }

    /**
     * Obtém o valor da propriedade withholdingTaxExemptionCertificateID.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getWithholdingTaxExemptionCertificateID() {
        return withholdingTaxExemptionCertificateID;
    }

    /**
     * Define o valor da propriedade withholdingTaxExemptionCertificateID.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setWithholdingTaxExemptionCertificateID(Code value) {
        this.withholdingTaxExemptionCertificateID = value;
    }

    /**
     * Obtém o valor da propriedade withholdingTaxExemptionRate.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getWithholdingTaxExemptionRate() {
        return withholdingTaxExemptionRate;
    }

    /**
     * Define o valor da propriedade withholdingTaxExemptionRate.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setWithholdingTaxExemptionRate(Amount value) {
        this.withholdingTaxExemptionRate = value;
    }

    /**
     * Obtém o valor da propriedade withholdingTaxExemptionValidityPeriod.
     * 
     * @return
     *     possible object is
     *     {@link CLOSEDDatePeriod }
     *     
     */
    public CLOSEDDatePeriod getWithholdingTaxExemptionValidityPeriod() {
        return withholdingTaxExemptionValidityPeriod;
    }

    /**
     * Define o valor da propriedade withholdingTaxExemptionValidityPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link CLOSEDDatePeriod }
     *     
     */
    public void setWithholdingTaxExemptionValidityPeriod(CLOSEDDatePeriod value) {
        this.withholdingTaxExemptionValidityPeriod = value;
    }

    /**
     * Obtém o valor da propriedade withholdingTaxExemptionReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getWithholdingTaxExemptionReasonCode() {
        return withholdingTaxExemptionReasonCode;
    }

    /**
     * Define o valor da propriedade withholdingTaxExemptionReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setWithholdingTaxExemptionReasonCode(Code value) {
        this.withholdingTaxExemptionReasonCode = value;
    }

}
