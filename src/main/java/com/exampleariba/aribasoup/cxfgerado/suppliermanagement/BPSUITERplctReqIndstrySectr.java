
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BPSUITERplctReqIndstrySectr complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPSUITERplctReqIndstrySectr"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IndustryClassificationSystemCode" type="{http://ariba.com/xi/SupplierManagement}IndustryClassificationSystemCode"/&gt;
 *         &lt;element name="IndustrialSectorCode" type="{http://ariba.com/xi/SupplierManagement}IndustrialSectorCode"/&gt;
 *         &lt;element name="DefaultIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
@XmlType(name = "BPSUITERplctReqIndstrySectr", propOrder = {
    "industryClassificationSystemCode",
    "industrialSectorCode",
    "defaultIndicator"
})
public class BPSUITERplctReqIndstrySectr {

    @XmlElement(name = "IndustryClassificationSystemCode", required = true)
    protected IndustryClassificationSystemCode industryClassificationSystemCode;
    @XmlElement(name = "IndustrialSectorCode", required = true)
    protected IndustrialSectorCode industrialSectorCode;
    @XmlElement(name = "DefaultIndicator")
    protected Boolean defaultIndicator;
    @XmlAttribute(name = "actionCode")
    protected String actionCode;

    /**
     * Obtém o valor da propriedade industryClassificationSystemCode.
     * 
     * @return
     *     possible object is
     *     {@link IndustryClassificationSystemCode }
     *     
     */
    public IndustryClassificationSystemCode getIndustryClassificationSystemCode() {
        return industryClassificationSystemCode;
    }

    /**
     * Define o valor da propriedade industryClassificationSystemCode.
     * 
     * @param value
     *     allowed object is
     *     {@link IndustryClassificationSystemCode }
     *     
     */
    public void setIndustryClassificationSystemCode(IndustryClassificationSystemCode value) {
        this.industryClassificationSystemCode = value;
    }

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
     * Obtém o valor da propriedade defaultIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultIndicator() {
        return defaultIndicator;
    }

    /**
     * Define o valor da propriedade defaultIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultIndicator(Boolean value) {
        this.defaultIndicator = value;
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
