
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BPRelshpSUITERplctReqCntctPersnWplcAddrInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPRelshpSUITERplctReqCntctPersnWplcAddrInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddressReceiverUUID" type="{http://ariba.com/xi/SupplierManagement}UUID" minOccurs="0"/&gt;
 *         &lt;element name="AddressUUID" type="{http://ariba.com/xi/SupplierManagement}UUID" minOccurs="0"/&gt;
 *         &lt;element name="DefaultIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://ariba.com/xi/SupplierManagement}BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddr" minOccurs="0"/&gt;
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
@XmlType(name = "BPRelshpSUITERplctReqCntctPersnWplcAddrInfo", propOrder = {
    "addressReceiverUUID",
    "addressUUID",
    "defaultIndicator",
    "address"
})
public class BPRelshpSUITERplctReqCntctPersnWplcAddrInfo {

    @XmlElement(name = "AddressReceiverUUID")
    protected UUID addressReceiverUUID;
    @XmlElement(name = "AddressUUID")
    protected UUID addressUUID;
    @XmlElement(name = "DefaultIndicator")
    protected Boolean defaultIndicator;
    @XmlElement(name = "Address")
    protected BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddr address;
    @XmlAttribute(name = "actionCode")
    protected String actionCode;

    /**
     * Obtém o valor da propriedade addressReceiverUUID.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getAddressReceiverUUID() {
        return addressReceiverUUID;
    }

    /**
     * Define o valor da propriedade addressReceiverUUID.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setAddressReceiverUUID(UUID value) {
        this.addressReceiverUUID = value;
    }

    /**
     * Obtém o valor da propriedade addressUUID.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getAddressUUID() {
        return addressUUID;
    }

    /**
     * Define o valor da propriedade addressUUID.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setAddressUUID(UUID value) {
        this.addressUUID = value;
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
     * Obtém o valor da propriedade address.
     * 
     * @return
     *     possible object is
     *     {@link BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddr }
     *     
     */
    public BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddr getAddress() {
        return address;
    }

    /**
     * Define o valor da propriedade address.
     * 
     * @param value
     *     allowed object is
     *     {@link BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddr }
     *     
     */
    public void setAddress(BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddr value) {
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

}
