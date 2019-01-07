
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BPSUITERplctConfMsg complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPSUITERplctConfMsg"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MessageHeader" type="{http://ariba.com/xi/SupplierManagement}BusinessDocumentMessageHeader"/&gt;
 *         &lt;element name="BusinessPartner" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctConfBP"/&gt;
 *         &lt;element name="Log" type="{http://ariba.com/xi/SupplierManagement}Log" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BPSUITERplctConfMsg", propOrder = {
    "messageHeader",
    "businessPartner",
    "log"
})
public class BPSUITERplctConfMsg {

    @XmlElement(name = "MessageHeader", required = true)
    protected BusinessDocumentMessageHeader messageHeader;
    @XmlElement(name = "BusinessPartner", required = true)
    protected BPSUITERplctConfBP businessPartner;
    @XmlElement(name = "Log")
    protected Log log;

    /**
     * Obtém o valor da propriedade messageHeader.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentMessageHeader }
     *     
     */
    public BusinessDocumentMessageHeader getMessageHeader() {
        return messageHeader;
    }

    /**
     * Define o valor da propriedade messageHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentMessageHeader }
     *     
     */
    public void setMessageHeader(BusinessDocumentMessageHeader value) {
        this.messageHeader = value;
    }

    /**
     * Obtém o valor da propriedade businessPartner.
     * 
     * @return
     *     possible object is
     *     {@link BPSUITERplctConfBP }
     *     
     */
    public BPSUITERplctConfBP getBusinessPartner() {
        return businessPartner;
    }

    /**
     * Define o valor da propriedade businessPartner.
     * 
     * @param value
     *     allowed object is
     *     {@link BPSUITERplctConfBP }
     *     
     */
    public void setBusinessPartner(BPSUITERplctConfBP value) {
        this.businessPartner = value;
    }

    /**
     * Obtém o valor da propriedade log.
     * 
     * @return
     *     possible object is
     *     {@link Log }
     *     
     */
    public Log getLog() {
        return log;
    }

    /**
     * Define o valor da propriedade log.
     * 
     * @param value
     *     allowed object is
     *     {@link Log }
     *     
     */
    public void setLog(Log value) {
        this.log = value;
    }

}
