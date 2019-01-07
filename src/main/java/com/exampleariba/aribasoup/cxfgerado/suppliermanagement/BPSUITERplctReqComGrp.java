
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BPSUITERplctReqComGrp complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPSUITERplctReqComGrp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FormOfAddressCode" type="{http://ariba.com/xi/SupplierManagement}FormOfAddressCode" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PartnerGroupTypeCode" type="{http://ariba.com/xi/SupplierManagement}BusinessPartnerPartnerGroupTypeCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BPSUITERplctReqComGrp", propOrder = {
    "formOfAddressCode",
    "name",
    "additionalName",
    "partnerGroupTypeCode"
})
public class BPSUITERplctReqComGrp {

    @XmlElement(name = "FormOfAddressCode")
    protected FormOfAddressCode formOfAddressCode;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "AdditionalName")
    protected String additionalName;
    @XmlElement(name = "PartnerGroupTypeCode")
    protected BusinessPartnerPartnerGroupTypeCode partnerGroupTypeCode;

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
     * Obtém o valor da propriedade additionalName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalName() {
        return additionalName;
    }

    /**
     * Define o valor da propriedade additionalName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalName(String value) {
        this.additionalName = value;
    }

    /**
     * Obtém o valor da propriedade partnerGroupTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link BusinessPartnerPartnerGroupTypeCode }
     *     
     */
    public BusinessPartnerPartnerGroupTypeCode getPartnerGroupTypeCode() {
        return partnerGroupTypeCode;
    }

    /**
     * Define o valor da propriedade partnerGroupTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessPartnerPartnerGroupTypeCode }
     *     
     */
    public void setPartnerGroupTypeCode(BusinessPartnerPartnerGroupTypeCode value) {
        this.partnerGroupTypeCode = value;
    }

}
