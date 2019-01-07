
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BPSUITEBulkRplctConfMsg complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPSUITEBulkRplctConfMsg"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MessageHeader" type="{http://ariba.com/xi/SupplierManagement}BusinessDocumentMessageHeader"/&gt;
 *         &lt;element name="BusinessPartnerSUITEReplicateConfirmationMessage" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctConfMsg" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BPSUITEBulkRplctConfMsg", propOrder = {
    "messageHeader",
    "businessPartnerSUITEReplicateConfirmationMessage"
})
public class BPSUITEBulkRplctConfMsg {

    @XmlElement(name = "MessageHeader", required = true)
    protected BusinessDocumentMessageHeader messageHeader;
    @XmlElement(name = "BusinessPartnerSUITEReplicateConfirmationMessage", required = true)
    protected List<BPSUITERplctConfMsg> businessPartnerSUITEReplicateConfirmationMessage;

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
     * Gets the value of the businessPartnerSUITEReplicateConfirmationMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessPartnerSUITEReplicateConfirmationMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessPartnerSUITEReplicateConfirmationMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPSUITERplctConfMsg }
     * 
     * 
     */
    public List<BPSUITERplctConfMsg> getBusinessPartnerSUITEReplicateConfirmationMessage() {
        if (businessPartnerSUITEReplicateConfirmationMessage == null) {
            businessPartnerSUITEReplicateConfirmationMessage = new ArrayList<BPSUITERplctConfMsg>();
        }
        return this.businessPartnerSUITEReplicateConfirmationMessage;
    }

}
