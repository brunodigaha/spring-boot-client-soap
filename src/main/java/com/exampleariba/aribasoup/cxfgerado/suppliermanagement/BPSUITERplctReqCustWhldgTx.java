
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BPSUITERplctReqCustWhldgTx complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPSUITERplctReqCustWhldgTx"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WithholdingTaxTypeCode" type="{http://ariba.com/xi/SupplierManagement}Code"/&gt;
 *         &lt;element name="WithholdingTaxIdentificationNumber" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="WithholdingTaxCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="WithholdingTaxAgentIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WithholdingTaxObligationPeriod" type="{http://ariba.com/xi/SupplierManagement}CLOSED_DatePeriod" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BPSUITERplctReqCustWhldgTx", propOrder = {
    "withholdingTaxTypeCode",
    "withholdingTaxIdentificationNumber",
    "withholdingTaxCode",
    "withholdingTaxAgentIndicator",
    "withholdingTaxObligationPeriod"
})
public class BPSUITERplctReqCustWhldgTx {

    @XmlElement(name = "WithholdingTaxTypeCode", required = true)
    protected Code withholdingTaxTypeCode;
    @XmlElement(name = "WithholdingTaxIdentificationNumber")
    protected Code withholdingTaxIdentificationNumber;
    @XmlElement(name = "WithholdingTaxCode")
    protected Code withholdingTaxCode;
    @XmlElement(name = "WithholdingTaxAgentIndicator")
    protected Boolean withholdingTaxAgentIndicator;
    @XmlElement(name = "WithholdingTaxObligationPeriod")
    protected CLOSEDDatePeriod withholdingTaxObligationPeriod;

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
     * Obtém o valor da propriedade withholdingTaxAgentIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWithholdingTaxAgentIndicator() {
        return withholdingTaxAgentIndicator;
    }

    /**
     * Define o valor da propriedade withholdingTaxAgentIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWithholdingTaxAgentIndicator(Boolean value) {
        this.withholdingTaxAgentIndicator = value;
    }

    /**
     * Obtém o valor da propriedade withholdingTaxObligationPeriod.
     * 
     * @return
     *     possible object is
     *     {@link CLOSEDDatePeriod }
     *     
     */
    public CLOSEDDatePeriod getWithholdingTaxObligationPeriod() {
        return withholdingTaxObligationPeriod;
    }

    /**
     * Define o valor da propriedade withholdingTaxObligationPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link CLOSEDDatePeriod }
     *     
     */
    public void setWithholdingTaxObligationPeriod(CLOSEDDatePeriod value) {
        this.withholdingTaxObligationPeriod = value;
    }

}
