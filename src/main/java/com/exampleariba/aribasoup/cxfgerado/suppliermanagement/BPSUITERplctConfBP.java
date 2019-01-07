
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java de BPSUITERplctConfBP complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPSUITERplctConfBP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UUID" type="{http://ariba.com/xi/SupplierManagement}UUID" minOccurs="0"/&gt;
 *         &lt;element name="InternalID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverUUID" type="{http://ariba.com/xi/SupplierManagement}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverInternalID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="Customer" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctConfCust" minOccurs="0"/&gt;
 *         &lt;element name="Supplier" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctConfSuplr" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BPSUITERplctConfBP", propOrder = {
    "uuid",
    "internalID",
    "receiverUUID",
    "receiverInternalID",
    "customer",
    "supplier"
})
public class BPSUITERplctConfBP {

    @XmlElement(name = "UUID")
    protected UUID uuid;
    @XmlElement(name = "InternalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String internalID;
    @XmlElement(name = "ReceiverUUID")
    protected UUID receiverUUID;
    @XmlElement(name = "ReceiverInternalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String receiverInternalID;
    @XmlElement(name = "Customer")
    protected BPSUITERplctConfCust customer;
    @XmlElement(name = "Supplier")
    protected BPSUITERplctConfSuplr supplier;

    /**
     * Obtém o valor da propriedade uuid.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getUUID() {
        return uuid;
    }

    /**
     * Define o valor da propriedade uuid.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setUUID(UUID value) {
        this.uuid = value;
    }

    /**
     * Obtém o valor da propriedade internalID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalID() {
        return internalID;
    }

    /**
     * Define o valor da propriedade internalID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalID(String value) {
        this.internalID = value;
    }

    /**
     * Obtém o valor da propriedade receiverUUID.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getReceiverUUID() {
        return receiverUUID;
    }

    /**
     * Define o valor da propriedade receiverUUID.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setReceiverUUID(UUID value) {
        this.receiverUUID = value;
    }

    /**
     * Obtém o valor da propriedade receiverInternalID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverInternalID() {
        return receiverInternalID;
    }

    /**
     * Define o valor da propriedade receiverInternalID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverInternalID(String value) {
        this.receiverInternalID = value;
    }

    /**
     * Obtém o valor da propriedade customer.
     * 
     * @return
     *     possible object is
     *     {@link BPSUITERplctConfCust }
     *     
     */
    public BPSUITERplctConfCust getCustomer() {
        return customer;
    }

    /**
     * Define o valor da propriedade customer.
     * 
     * @param value
     *     allowed object is
     *     {@link BPSUITERplctConfCust }
     *     
     */
    public void setCustomer(BPSUITERplctConfCust value) {
        this.customer = value;
    }

    /**
     * Obtém o valor da propriedade supplier.
     * 
     * @return
     *     possible object is
     *     {@link BPSUITERplctConfSuplr }
     *     
     */
    public BPSUITERplctConfSuplr getSupplier() {
        return supplier;
    }

    /**
     * Define o valor da propriedade supplier.
     * 
     * @param value
     *     allowed object is
     *     {@link BPSUITERplctConfSuplr }
     *     
     */
    public void setSupplier(BPSUITERplctConfSuplr value) {
        this.supplier = value;
    }

}
