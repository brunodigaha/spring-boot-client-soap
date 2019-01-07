
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BusinessDocumentMessageHeaderParty complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BusinessDocumentMessageHeaderParty"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InternalID" type="{http://ariba.com/xi/SupplierManagement}PartyInternalID" minOccurs="0"/&gt;
 *         &lt;element name="StandardID" type="{http://ariba.com/xi/SupplierManagement}PartyStandardID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ContactPerson" type="{http://ariba.com/xi/SupplierManagement}BusinessDocumentMessageHeaderPartyContactPerson" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessDocumentMessageHeaderParty", propOrder = {
    "internalID",
    "standardID",
    "contactPerson"
})
public class BusinessDocumentMessageHeaderParty {

    @XmlElement(name = "InternalID")
    protected PartyInternalID internalID;
    @XmlElement(name = "StandardID")
    protected List<PartyStandardID> standardID;
    @XmlElement(name = "ContactPerson")
    protected BusinessDocumentMessageHeaderPartyContactPerson contactPerson;

    /**
     * Obtém o valor da propriedade internalID.
     * 
     * @return
     *     possible object is
     *     {@link PartyInternalID }
     *     
     */
    public PartyInternalID getInternalID() {
        return internalID;
    }

    /**
     * Define o valor da propriedade internalID.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyInternalID }
     *     
     */
    public void setInternalID(PartyInternalID value) {
        this.internalID = value;
    }

    /**
     * Gets the value of the standardID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the standardID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStandardID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyStandardID }
     * 
     * 
     */
    public List<PartyStandardID> getStandardID() {
        if (standardID == null) {
            standardID = new ArrayList<PartyStandardID>();
        }
        return this.standardID;
    }

    /**
     * Obtém o valor da propriedade contactPerson.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentMessageHeaderPartyContactPerson }
     *     
     */
    public BusinessDocumentMessageHeaderPartyContactPerson getContactPerson() {
        return contactPerson;
    }

    /**
     * Define o valor da propriedade contactPerson.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentMessageHeaderPartyContactPerson }
     *     
     */
    public void setContactPerson(BusinessDocumentMessageHeaderPartyContactPerson value) {
        this.contactPerson = value;
    }

}
