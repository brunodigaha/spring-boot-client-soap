
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BPRelshpSUITERplctConfMsg complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPRelshpSUITERplctConfMsg"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MessageHeader" type="{http://ariba.com/xi/SupplierManagement}BusinessDocumentMessageHeader"/&gt;
 *         &lt;element name="BusinessPartnerRelationship" type="{http://ariba.com/xi/SupplierManagement}BPRelshpSUITERplctConfBPRelshp"/&gt;
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
@XmlType(name = "BPRelshpSUITERplctConfMsg", propOrder = {
    "messageHeader",
    "businessPartnerRelationship",
    "log"
})
public class BPRelshpSUITERplctConfMsg {

    @XmlElement(name = "MessageHeader", required = true)
    protected BusinessDocumentMessageHeader messageHeader;
    @XmlElement(name = "BusinessPartnerRelationship", required = true)
    protected BPRelshpSUITERplctConfBPRelshp businessPartnerRelationship;
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
     * Obtém o valor da propriedade businessPartnerRelationship.
     * 
     * @return
     *     possible object is
     *     {@link BPRelshpSUITERplctConfBPRelshp }
     *     
     */
    public BPRelshpSUITERplctConfBPRelshp getBusinessPartnerRelationship() {
        return businessPartnerRelationship;
    }

    /**
     * Define o valor da propriedade businessPartnerRelationship.
     * 
     * @param value
     *     allowed object is
     *     {@link BPRelshpSUITERplctConfBPRelshp }
     *     
     */
    public void setBusinessPartnerRelationship(BPRelshpSUITERplctConfBPRelshp value) {
        this.businessPartnerRelationship = value;
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
