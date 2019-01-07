
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de BPSUITERplctReqAddrInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPSUITERplctReqAddrInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReceiverUUID" type="{http://ariba.com/xi/SupplierManagement}UUID" minOccurs="0"/&gt;
 *         &lt;element name="UUID" type="{http://ariba.com/xi/SupplierManagement}UUID" minOccurs="0"/&gt;
 *         &lt;element name="MoveDestinationAddressReceiverUUID" type="{http://ariba.com/xi/SupplierManagement}UUID" minOccurs="0"/&gt;
 *         &lt;element name="MoveDestinationAddressUUID" type="{http://ariba.com/xi/SupplierManagement}UUID" minOccurs="0"/&gt;
 *         &lt;element name="MoveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ValidityPeriod" type="{http://ariba.com/xi/SupplierManagement}CLOSED_DatePeriod" minOccurs="0"/&gt;
 *         &lt;element name="AddressUsage" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqAddrInfoAddrUsge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqAddrInfoAddr"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="actionCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="addressUsageListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BPSUITERplctReqAddrInfo", propOrder = {
    "receiverUUID",
    "uuid",
    "moveDestinationAddressReceiverUUID",
    "moveDestinationAddressUUID",
    "moveDate",
    "validityPeriod",
    "addressUsage",
    "address"
})
public class BPSUITERplctReqAddrInfo {

    @XmlElement(name = "ReceiverUUID")
    protected UUID receiverUUID;
    @XmlElement(name = "UUID")
    protected UUID uuid;
    @XmlElement(name = "MoveDestinationAddressReceiverUUID")
    protected UUID moveDestinationAddressReceiverUUID;
    @XmlElement(name = "MoveDestinationAddressUUID")
    protected UUID moveDestinationAddressUUID;
    @XmlElement(name = "MoveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar moveDate;
    @XmlElement(name = "ValidityPeriod")
    protected CLOSEDDatePeriod validityPeriod;
    @XmlElement(name = "AddressUsage")
    protected List<BPSUITERplctReqAddrInfoAddrUsge> addressUsage;
    @XmlElement(name = "Address", required = true)
    protected BPSUITERplctReqAddrInfoAddr address;
    @XmlAttribute(name = "actionCode")
    protected String actionCode;
    @XmlAttribute(name = "addressUsageListCompleteTransmissionIndicator")
    protected Boolean addressUsageListCompleteTransmissionIndicator;

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
     * Obtém o valor da propriedade moveDestinationAddressReceiverUUID.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getMoveDestinationAddressReceiverUUID() {
        return moveDestinationAddressReceiverUUID;
    }

    /**
     * Define o valor da propriedade moveDestinationAddressReceiverUUID.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setMoveDestinationAddressReceiverUUID(UUID value) {
        this.moveDestinationAddressReceiverUUID = value;
    }

    /**
     * Obtém o valor da propriedade moveDestinationAddressUUID.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getMoveDestinationAddressUUID() {
        return moveDestinationAddressUUID;
    }

    /**
     * Define o valor da propriedade moveDestinationAddressUUID.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setMoveDestinationAddressUUID(UUID value) {
        this.moveDestinationAddressUUID = value;
    }

    /**
     * Obtém o valor da propriedade moveDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMoveDate() {
        return moveDate;
    }

    /**
     * Define o valor da propriedade moveDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMoveDate(XMLGregorianCalendar value) {
        this.moveDate = value;
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
     * Gets the value of the addressUsage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressUsage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressUsage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPSUITERplctReqAddrInfoAddrUsge }
     * 
     * 
     */
    public List<BPSUITERplctReqAddrInfoAddrUsge> getAddressUsage() {
        if (addressUsage == null) {
            addressUsage = new ArrayList<BPSUITERplctReqAddrInfoAddrUsge>();
        }
        return this.addressUsage;
    }

    /**
     * Obtém o valor da propriedade address.
     * 
     * @return
     *     possible object is
     *     {@link BPSUITERplctReqAddrInfoAddr }
     *     
     */
    public BPSUITERplctReqAddrInfoAddr getAddress() {
        return address;
    }

    /**
     * Define o valor da propriedade address.
     * 
     * @param value
     *     allowed object is
     *     {@link BPSUITERplctReqAddrInfoAddr }
     *     
     */
    public void setAddress(BPSUITERplctReqAddrInfoAddr value) {
        this.address = value;
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

    /**
     * Obtém o valor da propriedade addressUsageListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddressUsageListCompleteTransmissionIndicator() {
        return addressUsageListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade addressUsageListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddressUsageListCompleteTransmissionIndicator(Boolean value) {
        this.addressUsageListCompleteTransmissionIndicator = value;
    }

}
