
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BPSUITERplctReqCustIndstrySectr complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPSUITERplctReqCustIndstrySectr"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IndustrialSectorCode" type="{http://ariba.com/xi/SupplierManagement}IndustrialSectorCode" minOccurs="0"/&gt;
 *         &lt;element name="FirstAdditionalIndustrialSectorCode" type="{http://ariba.com/xi/SupplierManagement}IndustrialSectorCode" minOccurs="0"/&gt;
 *         &lt;element name="SecondAdditionalIndustrialSectorCode" type="{http://ariba.com/xi/SupplierManagement}IndustrialSectorCode" minOccurs="0"/&gt;
 *         &lt;element name="ThirdAdditionalIndustrialSectorCode" type="{http://ariba.com/xi/SupplierManagement}IndustrialSectorCode" minOccurs="0"/&gt;
 *         &lt;element name="FourthAdditionalIndustrialSectorCode" type="{http://ariba.com/xi/SupplierManagement}IndustrialSectorCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BPSUITERplctReqCustIndstrySectr", propOrder = {
    "industrialSectorCode",
    "firstAdditionalIndustrialSectorCode",
    "secondAdditionalIndustrialSectorCode",
    "thirdAdditionalIndustrialSectorCode",
    "fourthAdditionalIndustrialSectorCode"
})
public class BPSUITERplctReqCustIndstrySectr {

    @XmlElement(name = "IndustrialSectorCode")
    protected IndustrialSectorCode industrialSectorCode;
    @XmlElement(name = "FirstAdditionalIndustrialSectorCode")
    protected IndustrialSectorCode firstAdditionalIndustrialSectorCode;
    @XmlElement(name = "SecondAdditionalIndustrialSectorCode")
    protected IndustrialSectorCode secondAdditionalIndustrialSectorCode;
    @XmlElement(name = "ThirdAdditionalIndustrialSectorCode")
    protected IndustrialSectorCode thirdAdditionalIndustrialSectorCode;
    @XmlElement(name = "FourthAdditionalIndustrialSectorCode")
    protected IndustrialSectorCode fourthAdditionalIndustrialSectorCode;

    /**
     * Obtém o valor da propriedade industrialSectorCode.
     * 
     * @return
     *     possible object is
     *     {@link IndustrialSectorCode }
     *     
     */
    public IndustrialSectorCode getIndustrialSectorCode() {
        return industrialSectorCode;
    }

    /**
     * Define o valor da propriedade industrialSectorCode.
     * 
     * @param value
     *     allowed object is
     *     {@link IndustrialSectorCode }
     *     
     */
    public void setIndustrialSectorCode(IndustrialSectorCode value) {
        this.industrialSectorCode = value;
    }

    /**
     * Obtém o valor da propriedade firstAdditionalIndustrialSectorCode.
     * 
     * @return
     *     possible object is
     *     {@link IndustrialSectorCode }
     *     
     */
    public IndustrialSectorCode getFirstAdditionalIndustrialSectorCode() {
        return firstAdditionalIndustrialSectorCode;
    }

    /**
     * Define o valor da propriedade firstAdditionalIndustrialSectorCode.
     * 
     * @param value
     *     allowed object is
     *     {@link IndustrialSectorCode }
     *     
     */
    public void setFirstAdditionalIndustrialSectorCode(IndustrialSectorCode value) {
        this.firstAdditionalIndustrialSectorCode = value;
    }

    /**
     * Obtém o valor da propriedade secondAdditionalIndustrialSectorCode.
     * 
     * @return
     *     possible object is
     *     {@link IndustrialSectorCode }
     *     
     */
    public IndustrialSectorCode getSecondAdditionalIndustrialSectorCode() {
        return secondAdditionalIndustrialSectorCode;
    }

    /**
     * Define o valor da propriedade secondAdditionalIndustrialSectorCode.
     * 
     * @param value
     *     allowed object is
     *     {@link IndustrialSectorCode }
     *     
     */
    public void setSecondAdditionalIndustrialSectorCode(IndustrialSectorCode value) {
        this.secondAdditionalIndustrialSectorCode = value;
    }

    /**
     * Obtém o valor da propriedade thirdAdditionalIndustrialSectorCode.
     * 
     * @return
     *     possible object is
     *     {@link IndustrialSectorCode }
     *     
     */
    public IndustrialSectorCode getThirdAdditionalIndustrialSectorCode() {
        return thirdAdditionalIndustrialSectorCode;
    }

    /**
     * Define o valor da propriedade thirdAdditionalIndustrialSectorCode.
     * 
     * @param value
     *     allowed object is
     *     {@link IndustrialSectorCode }
     *     
     */
    public void setThirdAdditionalIndustrialSectorCode(IndustrialSectorCode value) {
        this.thirdAdditionalIndustrialSectorCode = value;
    }

    /**
     * Obtém o valor da propriedade fourthAdditionalIndustrialSectorCode.
     * 
     * @return
     *     possible object is
     *     {@link IndustrialSectorCode }
     *     
     */
    public IndustrialSectorCode getFourthAdditionalIndustrialSectorCode() {
        return fourthAdditionalIndustrialSectorCode;
    }

    /**
     * Define o valor da propriedade fourthAdditionalIndustrialSectorCode.
     * 
     * @param value
     *     allowed object is
     *     {@link IndustrialSectorCode }
     *     
     */
    public void setFourthAdditionalIndustrialSectorCode(IndustrialSectorCode value) {
        this.fourthAdditionalIndustrialSectorCode = value;
    }

}
