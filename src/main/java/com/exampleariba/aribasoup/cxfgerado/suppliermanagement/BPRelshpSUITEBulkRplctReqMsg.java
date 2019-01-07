
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BPRelshpSUITEBulkRplctReqMsg complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPRelshpSUITEBulkRplctReqMsg"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MessageHeader" type="{http://ariba.com/xi/SupplierManagement}BusinessDocumentMessageHeader"/&gt;
 *         &lt;element name="BusinessPartnerRelationshipSUITEReplicateRequestMessage" type="{http://ariba.com/xi/SupplierManagement}BPRelshpSUITERplctReqMsg" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BPRelshpSUITEBulkRplctReqMsg", propOrder = {
    "messageHeader",
    "businessPartnerRelationshipSUITEReplicateRequestMessage"
})
public class BPRelshpSUITEBulkRplctReqMsg {

    @XmlElement(name = "MessageHeader", required = true)
    protected BusinessDocumentMessageHeader messageHeader;
    @XmlElement(name = "BusinessPartnerRelationshipSUITEReplicateRequestMessage", required = true)
    protected List<BPRelshpSUITERplctReqMsg> businessPartnerRelationshipSUITEReplicateRequestMessage;

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
     * Gets the value of the businessPartnerRelationshipSUITEReplicateRequestMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessPartnerRelationshipSUITEReplicateRequestMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessPartnerRelationshipSUITEReplicateRequestMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPRelshpSUITERplctReqMsg }
     * 
     * 
     */
    public List<BPRelshpSUITERplctReqMsg> getBusinessPartnerRelationshipSUITEReplicateRequestMessage() {
        if (businessPartnerRelationshipSUITEReplicateRequestMessage == null) {
            businessPartnerRelationshipSUITEReplicateRequestMessage = new ArrayList<BPRelshpSUITERplctReqMsg>();
        }
        return this.businessPartnerRelationshipSUITEReplicateRequestMessage;
    }

}
