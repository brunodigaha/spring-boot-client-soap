
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BPSUITERplctReqPrSpecs complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPSUITERplctReqPrSpecs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerConditionGroupCode" type="{http://ariba.com/xi/SupplierManagement}PriceSpecificationCustomerGroupCode" minOccurs="0"/&gt;
 *         &lt;element name="FirstAdditionalCustomerConditionGroupCode" type="{http://ariba.com/xi/SupplierManagement}PriceSpecificationCustomerGroupCode" minOccurs="0"/&gt;
 *         &lt;element name="SecondAdditionalCustomerConditionGroupCode" type="{http://ariba.com/xi/SupplierManagement}PriceSpecificationCustomerGroupCode" minOccurs="0"/&gt;
 *         &lt;element name="ThirdAdditionalCustomerConditionGroupCode" type="{http://ariba.com/xi/SupplierManagement}PriceSpecificationCustomerGroupCode" minOccurs="0"/&gt;
 *         &lt;element name="FourthAdditionalCustomerConditionGroupCode" type="{http://ariba.com/xi/SupplierManagement}PriceSpecificationCustomerGroupCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BPSUITERplctReqPrSpecs", propOrder = {
    "customerConditionGroupCode",
    "firstAdditionalCustomerConditionGroupCode",
    "secondAdditionalCustomerConditionGroupCode",
    "thirdAdditionalCustomerConditionGroupCode",
    "fourthAdditionalCustomerConditionGroupCode"
})
public class BPSUITERplctReqPrSpecs {

    @XmlElement(name = "CustomerConditionGroupCode")
    protected PriceSpecificationCustomerGroupCode customerConditionGroupCode;
    @XmlElement(name = "FirstAdditionalCustomerConditionGroupCode")
    protected PriceSpecificationCustomerGroupCode firstAdditionalCustomerConditionGroupCode;
    @XmlElement(name = "SecondAdditionalCustomerConditionGroupCode")
    protected PriceSpecificationCustomerGroupCode secondAdditionalCustomerConditionGroupCode;
    @XmlElement(name = "ThirdAdditionalCustomerConditionGroupCode")
    protected PriceSpecificationCustomerGroupCode thirdAdditionalCustomerConditionGroupCode;
    @XmlElement(name = "FourthAdditionalCustomerConditionGroupCode")
    protected PriceSpecificationCustomerGroupCode fourthAdditionalCustomerConditionGroupCode;

    /**
     * Obtém o valor da propriedade customerConditionGroupCode.
     * 
     * @return
     *     possible object is
     *     {@link PriceSpecificationCustomerGroupCode }
     *     
     */
    public PriceSpecificationCustomerGroupCode getCustomerConditionGroupCode() {
        return customerConditionGroupCode;
    }

    /**
     * Define o valor da propriedade customerConditionGroupCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceSpecificationCustomerGroupCode }
     *     
     */
    public void setCustomerConditionGroupCode(PriceSpecificationCustomerGroupCode value) {
        this.customerConditionGroupCode = value;
    }

    /**
     * Obtém o valor da propriedade firstAdditionalCustomerConditionGroupCode.
     * 
     * @return
     *     possible object is
     *     {@link PriceSpecificationCustomerGroupCode }
     *     
     */
    public PriceSpecificationCustomerGroupCode getFirstAdditionalCustomerConditionGroupCode() {
        return firstAdditionalCustomerConditionGroupCode;
    }

    /**
     * Define o valor da propriedade firstAdditionalCustomerConditionGroupCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceSpecificationCustomerGroupCode }
     *     
     */
    public void setFirstAdditionalCustomerConditionGroupCode(PriceSpecificationCustomerGroupCode value) {
        this.firstAdditionalCustomerConditionGroupCode = value;
    }

    /**
     * Obtém o valor da propriedade secondAdditionalCustomerConditionGroupCode.
     * 
     * @return
     *     possible object is
     *     {@link PriceSpecificationCustomerGroupCode }
     *     
     */
    public PriceSpecificationCustomerGroupCode getSecondAdditionalCustomerConditionGroupCode() {
        return secondAdditionalCustomerConditionGroupCode;
    }

    /**
     * Define o valor da propriedade secondAdditionalCustomerConditionGroupCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceSpecificationCustomerGroupCode }
     *     
     */
    public void setSecondAdditionalCustomerConditionGroupCode(PriceSpecificationCustomerGroupCode value) {
        this.secondAdditionalCustomerConditionGroupCode = value;
    }

    /**
     * Obtém o valor da propriedade thirdAdditionalCustomerConditionGroupCode.
     * 
     * @return
     *     possible object is
     *     {@link PriceSpecificationCustomerGroupCode }
     *     
     */
    public PriceSpecificationCustomerGroupCode getThirdAdditionalCustomerConditionGroupCode() {
        return thirdAdditionalCustomerConditionGroupCode;
    }

    /**
     * Define o valor da propriedade thirdAdditionalCustomerConditionGroupCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceSpecificationCustomerGroupCode }
     *     
     */
    public void setThirdAdditionalCustomerConditionGroupCode(PriceSpecificationCustomerGroupCode value) {
        this.thirdAdditionalCustomerConditionGroupCode = value;
    }

    /**
     * Obtém o valor da propriedade fourthAdditionalCustomerConditionGroupCode.
     * 
     * @return
     *     possible object is
     *     {@link PriceSpecificationCustomerGroupCode }
     *     
     */
    public PriceSpecificationCustomerGroupCode getFourthAdditionalCustomerConditionGroupCode() {
        return fourthAdditionalCustomerConditionGroupCode;
    }

    /**
     * Define o valor da propriedade fourthAdditionalCustomerConditionGroupCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceSpecificationCustomerGroupCode }
     *     
     */
    public void setFourthAdditionalCustomerConditionGroupCode(PriceSpecificationCustomerGroupCode value) {
        this.fourthAdditionalCustomerConditionGroupCode = value;
    }

}
