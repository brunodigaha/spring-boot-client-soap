
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java de BPSUITERplctReqBkDetsBkDirRef complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPSUITERplctReqBkDetsBkDirRef"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BankStandardID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="BankCountryCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="BankInternalID" type="{http://ariba.com/xi/SupplierManagement}BankInternalID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BPSUITERplctReqBkDetsBkDirRef", propOrder = {
    "bankStandardID",
    "bankCountryCode",
    "bankInternalID"
})
public class BPSUITERplctReqBkDetsBkDirRef {

    @XmlElement(name = "BankStandardID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String bankStandardID;
    @XmlElement(name = "BankCountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String bankCountryCode;
    @XmlElement(name = "BankInternalID")
    protected BankInternalID bankInternalID;

    /**
     * Obtém o valor da propriedade bankStandardID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankStandardID() {
        return bankStandardID;
    }

    /**
     * Define o valor da propriedade bankStandardID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankStandardID(String value) {
        this.bankStandardID = value;
    }

    /**
     * Obtém o valor da propriedade bankCountryCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCountryCode() {
        return bankCountryCode;
    }

    /**
     * Define o valor da propriedade bankCountryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCountryCode(String value) {
        this.bankCountryCode = value;
    }

    /**
     * Obtém o valor da propriedade bankInternalID.
     * 
     * @return
     *     possible object is
     *     {@link BankInternalID }
     *     
     */
    public BankInternalID getBankInternalID() {
        return bankInternalID;
    }

    /**
     * Define o valor da propriedade bankInternalID.
     * 
     * @param value
     *     allowed object is
     *     {@link BankInternalID }
     *     
     */
    public void setBankInternalID(BankInternalID value) {
        this.bankInternalID = value;
    }

}
