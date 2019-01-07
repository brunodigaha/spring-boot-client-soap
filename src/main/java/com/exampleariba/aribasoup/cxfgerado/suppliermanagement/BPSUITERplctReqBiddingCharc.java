
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de BPSUITERplctReqBiddingCharc complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPSUITERplctReqBiddingCharc"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MinorityOwnedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MinorityOwnedCertificateExpirationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="WomenOwnedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WomenOwnedCertificateExpirationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="SurrogateBiddingAllowedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OfflineBiddingIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
@XmlType(name = "BPSUITERplctReqBiddingCharc", propOrder = {
    "minorityOwnedIndicator",
    "minorityOwnedCertificateExpirationDate",
    "womenOwnedIndicator",
    "womenOwnedCertificateExpirationDate",
    "surrogateBiddingAllowedIndicator",
    "offlineBiddingIndicator"
})
public class BPSUITERplctReqBiddingCharc {

    @XmlElement(name = "MinorityOwnedIndicator")
    protected Boolean minorityOwnedIndicator;
    @XmlElement(name = "MinorityOwnedCertificateExpirationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar minorityOwnedCertificateExpirationDate;
    @XmlElement(name = "WomenOwnedIndicator")
    protected Boolean womenOwnedIndicator;
    @XmlElement(name = "WomenOwnedCertificateExpirationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar womenOwnedCertificateExpirationDate;
    @XmlElement(name = "SurrogateBiddingAllowedIndicator")
    protected Boolean surrogateBiddingAllowedIndicator;
    @XmlElement(name = "OfflineBiddingIndicator")
    protected Boolean offlineBiddingIndicator;
    @XmlAttribute(name = "actionCode")
    protected String actionCode;

    /**
     * Obtém o valor da propriedade minorityOwnedIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMinorityOwnedIndicator() {
        return minorityOwnedIndicator;
    }

    /**
     * Define o valor da propriedade minorityOwnedIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMinorityOwnedIndicator(Boolean value) {
        this.minorityOwnedIndicator = value;
    }

    /**
     * Obtém o valor da propriedade minorityOwnedCertificateExpirationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMinorityOwnedCertificateExpirationDate() {
        return minorityOwnedCertificateExpirationDate;
    }

    /**
     * Define o valor da propriedade minorityOwnedCertificateExpirationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMinorityOwnedCertificateExpirationDate(XMLGregorianCalendar value) {
        this.minorityOwnedCertificateExpirationDate = value;
    }

    /**
     * Obtém o valor da propriedade womenOwnedIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWomenOwnedIndicator() {
        return womenOwnedIndicator;
    }

    /**
     * Define o valor da propriedade womenOwnedIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWomenOwnedIndicator(Boolean value) {
        this.womenOwnedIndicator = value;
    }

    /**
     * Obtém o valor da propriedade womenOwnedCertificateExpirationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWomenOwnedCertificateExpirationDate() {
        return womenOwnedCertificateExpirationDate;
    }

    /**
     * Define o valor da propriedade womenOwnedCertificateExpirationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWomenOwnedCertificateExpirationDate(XMLGregorianCalendar value) {
        this.womenOwnedCertificateExpirationDate = value;
    }

    /**
     * Obtém o valor da propriedade surrogateBiddingAllowedIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSurrogateBiddingAllowedIndicator() {
        return surrogateBiddingAllowedIndicator;
    }

    /**
     * Define o valor da propriedade surrogateBiddingAllowedIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSurrogateBiddingAllowedIndicator(Boolean value) {
        this.surrogateBiddingAllowedIndicator = value;
    }

    /**
     * Obtém o valor da propriedade offlineBiddingIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOfflineBiddingIndicator() {
        return offlineBiddingIndicator;
    }

    /**
     * Define o valor da propriedade offlineBiddingIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOfflineBiddingIndicator(Boolean value) {
        this.offlineBiddingIndicator = value;
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
