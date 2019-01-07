
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BPRelshpSUITERplctReqMsg complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPRelshpSUITERplctReqMsg"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MessageHeader" type="{http://ariba.com/xi/SupplierManagement}BusinessDocumentMessageHeader"/&gt;
 *         &lt;element name="BusinessPartnerRelationship" type="{http://ariba.com/xi/SupplierManagement}BPRelshpSUITERplctReqBPRelshp"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BPRelshpSUITERplctReqMsg", propOrder = {
    "messageHeader",
    "businessPartnerRelationship"
})
public class BPRelshpSUITERplctReqMsg {

    @XmlElement(name = "MessageHeader", required = true)
    protected BusinessDocumentMessageHeader messageHeader;
    @XmlElement(name = "BusinessPartnerRelationship", required = true)
    protected BPRelshpSUITERplctReqBPRelshp businessPartnerRelationship;

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
     *     {@link BPRelshpSUITERplctReqBPRelshp }
     *     
     */
    public BPRelshpSUITERplctReqBPRelshp getBusinessPartnerRelationship() {
        return businessPartnerRelationship;
    }

    /**
     * Define o valor da propriedade businessPartnerRelationship.
     * 
     * @param value
     *     allowed object is
     *     {@link BPRelshpSUITERplctReqBPRelshp }
     *     
     */
    public void setBusinessPartnerRelationship(BPRelshpSUITERplctReqBPRelshp value) {
        this.businessPartnerRelationship = value;
    }

}
