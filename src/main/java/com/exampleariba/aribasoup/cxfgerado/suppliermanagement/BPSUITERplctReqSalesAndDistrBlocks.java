
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java de BPSUITERplctReqSalesAndDistrBlocks complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPSUITERplctReqSalesAndDistrBlocks"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderBlockingReasonCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="BillingBlockingReasonCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryBlockingReasonCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="SalesSupportBlockedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BPSUITERplctReqSalesAndDistrBlocks", propOrder = {
    "orderBlockingReasonCode",
    "billingBlockingReasonCode",
    "deliveryBlockingReasonCode",
    "salesSupportBlockedIndicator"
})
public class BPSUITERplctReqSalesAndDistrBlocks {

    @XmlElement(name = "OrderBlockingReasonCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String orderBlockingReasonCode;
    @XmlElement(name = "BillingBlockingReasonCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String billingBlockingReasonCode;
    @XmlElement(name = "DeliveryBlockingReasonCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String deliveryBlockingReasonCode;
    @XmlElement(name = "SalesSupportBlockedIndicator")
    protected Boolean salesSupportBlockedIndicator;

    /**
     * Obtém o valor da propriedade orderBlockingReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderBlockingReasonCode() {
        return orderBlockingReasonCode;
    }

    /**
     * Define o valor da propriedade orderBlockingReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderBlockingReasonCode(String value) {
        this.orderBlockingReasonCode = value;
    }

    /**
     * Obtém o valor da propriedade billingBlockingReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingBlockingReasonCode() {
        return billingBlockingReasonCode;
    }

    /**
     * Define o valor da propriedade billingBlockingReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingBlockingReasonCode(String value) {
        this.billingBlockingReasonCode = value;
    }

    /**
     * Obtém o valor da propriedade deliveryBlockingReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryBlockingReasonCode() {
        return deliveryBlockingReasonCode;
    }

    /**
     * Define o valor da propriedade deliveryBlockingReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryBlockingReasonCode(String value) {
        this.deliveryBlockingReasonCode = value;
    }

    /**
     * Obtém o valor da propriedade salesSupportBlockedIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSalesSupportBlockedIndicator() {
        return salesSupportBlockedIndicator;
    }

    /**
     * Define o valor da propriedade salesSupportBlockedIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSalesSupportBlockedIndicator(Boolean value) {
        this.salesSupportBlockedIndicator = value;
    }

}
