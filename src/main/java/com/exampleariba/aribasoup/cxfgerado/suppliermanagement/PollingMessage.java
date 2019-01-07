
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PollingMessage complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PollingMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BusinessPartnerSUITEBulkReplicateRequest" type="{http://ariba.com/xi/SupplierManagement}BPSUITEBulkRplctReqMsg" minOccurs="0"/&gt;
 *         &lt;element name="BusinessPartnerSUITEBulkReplicateConfirmation" type="{http://ariba.com/xi/SupplierManagement}BPSUITEBulkRplctConfMsg" minOccurs="0"/&gt;
 *         &lt;element name="BusinessPartnerRelationshipSUITEBulkReplicateRequest" type="{http://ariba.com/xi/SupplierManagement}BPRelshpSUITEBulkRplctReqMsg" minOccurs="0"/&gt;
 *         &lt;element name="BusinessPartnerRelationshipSUITEBulkReplicateConfirmation" type="{http://ariba.com/xi/SupplierManagement}BPRelshpSUITEBulkRplctConfMsg" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="inboundServiceName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="timestamp" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PollingMessage", propOrder = {
    "businessPartnerSUITEBulkReplicateRequest",
    "businessPartnerSUITEBulkReplicateConfirmation",
    "businessPartnerRelationshipSUITEBulkReplicateRequest",
    "businessPartnerRelationshipSUITEBulkReplicateConfirmation"
})
public class PollingMessage {

    @XmlElement(name = "BusinessPartnerSUITEBulkReplicateRequest")
    protected BPSUITEBulkRplctReqMsg businessPartnerSUITEBulkReplicateRequest;
    @XmlElement(name = "BusinessPartnerSUITEBulkReplicateConfirmation")
    protected BPSUITEBulkRplctConfMsg businessPartnerSUITEBulkReplicateConfirmation;
    @XmlElement(name = "BusinessPartnerRelationshipSUITEBulkReplicateRequest")
    protected BPRelshpSUITEBulkRplctReqMsg businessPartnerRelationshipSUITEBulkReplicateRequest;
    @XmlElement(name = "BusinessPartnerRelationshipSUITEBulkReplicateConfirmation")
    protected BPRelshpSUITEBulkRplctConfMsg businessPartnerRelationshipSUITEBulkReplicateConfirmation;
    @XmlAttribute(name = "inboundServiceName", required = true)
    protected String inboundServiceName;
    @XmlAttribute(name = "timestamp", required = true)
    protected String timestamp;

    /**
     * Obtém o valor da propriedade businessPartnerSUITEBulkReplicateRequest.
     * 
     * @return
     *     possible object is
     *     {@link BPSUITEBulkRplctReqMsg }
     *     
     */
    public BPSUITEBulkRplctReqMsg getBusinessPartnerSUITEBulkReplicateRequest() {
        return businessPartnerSUITEBulkReplicateRequest;
    }

    /**
     * Define o valor da propriedade businessPartnerSUITEBulkReplicateRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link BPSUITEBulkRplctReqMsg }
     *     
     */
    public void setBusinessPartnerSUITEBulkReplicateRequest(BPSUITEBulkRplctReqMsg value) {
        this.businessPartnerSUITEBulkReplicateRequest = value;
    }

    /**
     * Obtém o valor da propriedade businessPartnerSUITEBulkReplicateConfirmation.
     * 
     * @return
     *     possible object is
     *     {@link BPSUITEBulkRplctConfMsg }
     *     
     */
    public BPSUITEBulkRplctConfMsg getBusinessPartnerSUITEBulkReplicateConfirmation() {
        return businessPartnerSUITEBulkReplicateConfirmation;
    }

    /**
     * Define o valor da propriedade businessPartnerSUITEBulkReplicateConfirmation.
     * 
     * @param value
     *     allowed object is
     *     {@link BPSUITEBulkRplctConfMsg }
     *     
     */
    public void setBusinessPartnerSUITEBulkReplicateConfirmation(BPSUITEBulkRplctConfMsg value) {
        this.businessPartnerSUITEBulkReplicateConfirmation = value;
    }

    /**
     * Obtém o valor da propriedade businessPartnerRelationshipSUITEBulkReplicateRequest.
     * 
     * @return
     *     possible object is
     *     {@link BPRelshpSUITEBulkRplctReqMsg }
     *     
     */
    public BPRelshpSUITEBulkRplctReqMsg getBusinessPartnerRelationshipSUITEBulkReplicateRequest() {
        return businessPartnerRelationshipSUITEBulkReplicateRequest;
    }

    /**
     * Define o valor da propriedade businessPartnerRelationshipSUITEBulkReplicateRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link BPRelshpSUITEBulkRplctReqMsg }
     *     
     */
    public void setBusinessPartnerRelationshipSUITEBulkReplicateRequest(BPRelshpSUITEBulkRplctReqMsg value) {
        this.businessPartnerRelationshipSUITEBulkReplicateRequest = value;
    }

    /**
     * Obtém o valor da propriedade businessPartnerRelationshipSUITEBulkReplicateConfirmation.
     * 
     * @return
     *     possible object is
     *     {@link BPRelshpSUITEBulkRplctConfMsg }
     *     
     */
    public BPRelshpSUITEBulkRplctConfMsg getBusinessPartnerRelationshipSUITEBulkReplicateConfirmation() {
        return businessPartnerRelationshipSUITEBulkReplicateConfirmation;
    }

    /**
     * Define o valor da propriedade businessPartnerRelationshipSUITEBulkReplicateConfirmation.
     * 
     * @param value
     *     allowed object is
     *     {@link BPRelshpSUITEBulkRplctConfMsg }
     *     
     */
    public void setBusinessPartnerRelationshipSUITEBulkReplicateConfirmation(BPRelshpSUITEBulkRplctConfMsg value) {
        this.businessPartnerRelationshipSUITEBulkReplicateConfirmation = value;
    }

    /**
     * Obtém o valor da propriedade inboundServiceName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInboundServiceName() {
        return inboundServiceName;
    }

    /**
     * Define o valor da propriedade inboundServiceName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInboundServiceName(String value) {
        this.inboundServiceName = value;
    }

    /**
     * Obtém o valor da propriedade timestamp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * Define o valor da propriedade timestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimestamp(String value) {
        this.timestamp = value;
    }

}
