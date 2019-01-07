
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BPSUITERplctReqCustUnldgPts complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPSUITERplctReqCustUnldgPts"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UnloadingPointName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DefaultIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BusinessHours" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqBusHrs" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="actionCode" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BPSUITERplctReqCustUnldgPts", propOrder = {
    "unloadingPointName",
    "defaultIndicator",
    "businessHours"
})
public class BPSUITERplctReqCustUnldgPts {

    @XmlElement(name = "UnloadingPointName", required = true)
    protected String unloadingPointName;
    @XmlElement(name = "DefaultIndicator")
    protected Boolean defaultIndicator;
    @XmlElement(name = "BusinessHours")
    protected BPSUITERplctReqBusHrs businessHours;
    @XmlAttribute(name = "actionCode")
    protected Boolean actionCode;

    /**
     * Obtém o valor da propriedade unloadingPointName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnloadingPointName() {
        return unloadingPointName;
    }

    /**
     * Define o valor da propriedade unloadingPointName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnloadingPointName(String value) {
        this.unloadingPointName = value;
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
     * Obtém o valor da propriedade businessHours.
     * 
     * @return
     *     possible object is
     *     {@link BPSUITERplctReqBusHrs }
     *     
     */
    public BPSUITERplctReqBusHrs getBusinessHours() {
        return businessHours;
    }

    /**
     * Define o valor da propriedade businessHours.
     * 
     * @param value
     *     allowed object is
     *     {@link BPSUITERplctReqBusHrs }
     *     
     */
    public void setBusinessHours(BPSUITERplctReqBusHrs value) {
        this.businessHours = value;
    }

    /**
     * Obtém o valor da propriedade actionCode.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActionCode() {
        return actionCode;
    }

    /**
     * Define o valor da propriedade actionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActionCode(Boolean value) {
        this.actionCode = value;
    }

}
