
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BPSUITERplctReqCustTxGrpg complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPSUITERplctReqCustTxGrpg"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaxCodeCategoryIndicator" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="ValidityPeriod" type="{http://ariba.com/xi/SupplierManagement}CLOSED_DatePeriod" minOccurs="0"/&gt;
 *         &lt;element name="TaxExemption" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqTxExmp" minOccurs="0"/&gt;
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
@XmlType(name = "BPSUITERplctReqCustTxGrpg", propOrder = {
    "taxCodeCategoryIndicator",
    "validityPeriod",
    "taxExemption"
})
public class BPSUITERplctReqCustTxGrpg {

    @XmlElement(name = "TaxCodeCategoryIndicator")
    protected Code taxCodeCategoryIndicator;
    @XmlElement(name = "ValidityPeriod")
    protected CLOSEDDatePeriod validityPeriod;
    @XmlElement(name = "TaxExemption")
    protected BPSUITERplctReqTxExmp taxExemption;
    @XmlAttribute(name = "actionCode")
    protected String actionCode;

    /**
     * Obtém o valor da propriedade taxCodeCategoryIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getTaxCodeCategoryIndicator() {
        return taxCodeCategoryIndicator;
    }

    /**
     * Define o valor da propriedade taxCodeCategoryIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setTaxCodeCategoryIndicator(Code value) {
        this.taxCodeCategoryIndicator = value;
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
     * Obtém o valor da propriedade taxExemption.
     * 
     * @return
     *     possible object is
     *     {@link BPSUITERplctReqTxExmp }
     *     
     */
    public BPSUITERplctReqTxExmp getTaxExemption() {
        return taxExemption;
    }

    /**
     * Define o valor da propriedade taxExemption.
     * 
     * @param value
     *     allowed object is
     *     {@link BPSUITERplctReqTxExmp }
     *     
     */
    public void setTaxExemption(BPSUITERplctReqTxExmp value) {
        this.taxExemption = value;
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
