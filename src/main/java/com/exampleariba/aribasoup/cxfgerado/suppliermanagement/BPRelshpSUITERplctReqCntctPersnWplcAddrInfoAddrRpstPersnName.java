
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrRpstPersnName complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrRpstPersnName"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddressRepresentationCode" type="{http://ariba.com/xi/SupplierManagement}AddressRepresentationCode"/&gt;
 *         &lt;element name="Name" type="{http://ariba.com/xi/SupplierManagement}PersonName"/&gt;
 *         &lt;element name="KeyWordsText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalKeyWordsText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FormattedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrRpstPersnName", propOrder = {
    "addressRepresentationCode",
    "name",
    "keyWordsText",
    "additionalKeyWordsText",
    "formattedName"
})
public class BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrRpstPersnName {

    @XmlElement(name = "AddressRepresentationCode", required = true)
    protected AddressRepresentationCode addressRepresentationCode;
    @XmlElement(name = "Name", required = true)
    protected PersonName name;
    @XmlElement(name = "KeyWordsText")
    protected String keyWordsText;
    @XmlElement(name = "AdditionalKeyWordsText")
    protected String additionalKeyWordsText;
    @XmlElement(name = "FormattedName")
    protected String formattedName;
    @XmlAttribute(name = "actionCode")
    protected String actionCode;

    /**
     * Obtém o valor da propriedade addressRepresentationCode.
     * 
     * @return
     *     possible object is
     *     {@link AddressRepresentationCode }
     *     
     */
    public AddressRepresentationCode getAddressRepresentationCode() {
        return addressRepresentationCode;
    }

    /**
     * Define o valor da propriedade addressRepresentationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressRepresentationCode }
     *     
     */
    public void setAddressRepresentationCode(AddressRepresentationCode value) {
        this.addressRepresentationCode = value;
    }

    /**
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link PersonName }
     *     
     */
    public PersonName getName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonName }
     *     
     */
    public void setName(PersonName value) {
        this.name = value;
    }

    /**
     * Obtém o valor da propriedade keyWordsText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyWordsText() {
        return keyWordsText;
    }

    /**
     * Define o valor da propriedade keyWordsText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyWordsText(String value) {
        this.keyWordsText = value;
    }

    /**
     * Obtém o valor da propriedade additionalKeyWordsText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalKeyWordsText() {
        return additionalKeyWordsText;
    }

    /**
     * Define o valor da propriedade additionalKeyWordsText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalKeyWordsText(String value) {
        this.additionalKeyWordsText = value;
    }

    /**
     * Obtém o valor da propriedade formattedName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedName() {
        return formattedName;
    }

    /**
     * Define o valor da propriedade formattedName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedName(String value) {
        this.formattedName = value;
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
