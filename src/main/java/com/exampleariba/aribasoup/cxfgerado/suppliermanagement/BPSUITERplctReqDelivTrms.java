
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java de BPSUITERplctReqDelivTrms complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPSUITERplctReqDelivTrms"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeliveryPriorityCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="Incoterms" type="{http://ariba.com/xi/SupplierManagement}Incoterms" minOccurs="0"/&gt;
 *         &lt;element name="SalesOrderCompleteDeliveryIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderCombinationAllowedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PartialDeliveryControlCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="PartialDeliveryMaximumNumberValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="QuantityTolerance" type="{http://ariba.com/xi/SupplierManagement}QuantityTolerance" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BPSUITERplctReqDelivTrms", propOrder = {
    "deliveryPriorityCode",
    "incoterms",
    "salesOrderCompleteDeliveryIndicator",
    "orderCombinationAllowedIndicator",
    "partialDeliveryControlCode",
    "partialDeliveryMaximumNumberValue",
    "quantityTolerance"
})
public class BPSUITERplctReqDelivTrms {

    @XmlElement(name = "DeliveryPriorityCode")
    protected Code deliveryPriorityCode;
    @XmlElement(name = "Incoterms")
    protected Incoterms incoterms;
    @XmlElement(name = "SalesOrderCompleteDeliveryIndicator")
    protected Boolean salesOrderCompleteDeliveryIndicator;
    @XmlElement(name = "OrderCombinationAllowedIndicator")
    protected Boolean orderCombinationAllowedIndicator;
    @XmlElement(name = "PartialDeliveryControlCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String partialDeliveryControlCode;
    @XmlElement(name = "PartialDeliveryMaximumNumberValue")
    protected Integer partialDeliveryMaximumNumberValue;
    @XmlElement(name = "QuantityTolerance")
    protected QuantityTolerance quantityTolerance;

    /**
     * Obtém o valor da propriedade deliveryPriorityCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getDeliveryPriorityCode() {
        return deliveryPriorityCode;
    }

    /**
     * Define o valor da propriedade deliveryPriorityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setDeliveryPriorityCode(Code value) {
        this.deliveryPriorityCode = value;
    }

    /**
     * Obtém o valor da propriedade incoterms.
     * 
     * @return
     *     possible object is
     *     {@link Incoterms }
     *     
     */
    public Incoterms getIncoterms() {
        return incoterms;
    }

    /**
     * Define o valor da propriedade incoterms.
     * 
     * @param value
     *     allowed object is
     *     {@link Incoterms }
     *     
     */
    public void setIncoterms(Incoterms value) {
        this.incoterms = value;
    }

    /**
     * Obtém o valor da propriedade salesOrderCompleteDeliveryIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSalesOrderCompleteDeliveryIndicator() {
        return salesOrderCompleteDeliveryIndicator;
    }

    /**
     * Define o valor da propriedade salesOrderCompleteDeliveryIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSalesOrderCompleteDeliveryIndicator(Boolean value) {
        this.salesOrderCompleteDeliveryIndicator = value;
    }

    /**
     * Obtém o valor da propriedade orderCombinationAllowedIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderCombinationAllowedIndicator() {
        return orderCombinationAllowedIndicator;
    }

    /**
     * Define o valor da propriedade orderCombinationAllowedIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderCombinationAllowedIndicator(Boolean value) {
        this.orderCombinationAllowedIndicator = value;
    }

    /**
     * Obtém o valor da propriedade partialDeliveryControlCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartialDeliveryControlCode() {
        return partialDeliveryControlCode;
    }

    /**
     * Define o valor da propriedade partialDeliveryControlCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartialDeliveryControlCode(String value) {
        this.partialDeliveryControlCode = value;
    }

    /**
     * Obtém o valor da propriedade partialDeliveryMaximumNumberValue.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPartialDeliveryMaximumNumberValue() {
        return partialDeliveryMaximumNumberValue;
    }

    /**
     * Define o valor da propriedade partialDeliveryMaximumNumberValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPartialDeliveryMaximumNumberValue(Integer value) {
        this.partialDeliveryMaximumNumberValue = value;
    }

    /**
     * Obtém o valor da propriedade quantityTolerance.
     * 
     * @return
     *     possible object is
     *     {@link QuantityTolerance }
     *     
     */
    public QuantityTolerance getQuantityTolerance() {
        return quantityTolerance;
    }

    /**
     * Define o valor da propriedade quantityTolerance.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityTolerance }
     *     
     */
    public void setQuantityTolerance(QuantityTolerance value) {
        this.quantityTolerance = value;
    }

}
