
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BusinessDocumentMessageHeaderPartyContactPerson complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BusinessDocumentMessageHeaderPartyContactPerson"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InternalID" type="{http://ariba.com/xi/SupplierManagement}ContactPersonInternalID" minOccurs="0"/&gt;
 *         &lt;element name="OrganisationFormattedName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PersonFormattedName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNumber" type="{http://ariba.com/xi/SupplierManagement}PhoneNumber" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FaxNumber" type="{http://ariba.com/xi/SupplierManagement}PhoneNumber" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EmailURI" type="{http://ariba.com/xi/SupplierManagement}EmailURI" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessDocumentMessageHeaderPartyContactPerson", propOrder = {
    "internalID",
    "organisationFormattedName",
    "personFormattedName",
    "phoneNumber",
    "faxNumber",
    "emailURI"
})
public class BusinessDocumentMessageHeaderPartyContactPerson {

    @XmlElement(name = "InternalID")
    protected ContactPersonInternalID internalID;
    @XmlElement(name = "OrganisationFormattedName")
    protected List<String> organisationFormattedName;
    @XmlElement(name = "PersonFormattedName")
    protected List<String> personFormattedName;
    @XmlElement(name = "PhoneNumber")
    protected List<PhoneNumber> phoneNumber;
    @XmlElement(name = "FaxNumber")
    protected List<PhoneNumber> faxNumber;
    @XmlElement(name = "EmailURI")
    protected List<EmailURI> emailURI;

    /**
     * Obtém o valor da propriedade internalID.
     * 
     * @return
     *     possible object is
     *     {@link ContactPersonInternalID }
     *     
     */
    public ContactPersonInternalID getInternalID() {
        return internalID;
    }

    /**
     * Define o valor da propriedade internalID.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPersonInternalID }
     *     
     */
    public void setInternalID(ContactPersonInternalID value) {
        this.internalID = value;
    }

    /**
     * Gets the value of the organisationFormattedName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organisationFormattedName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganisationFormattedName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOrganisationFormattedName() {
        if (organisationFormattedName == null) {
            organisationFormattedName = new ArrayList<String>();
        }
        return this.organisationFormattedName;
    }

    /**
     * Gets the value of the personFormattedName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personFormattedName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonFormattedName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPersonFormattedName() {
        if (personFormattedName == null) {
            personFormattedName = new ArrayList<String>();
        }
        return this.personFormattedName;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phoneNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhoneNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhoneNumber }
     * 
     * 
     */
    public List<PhoneNumber> getPhoneNumber() {
        if (phoneNumber == null) {
            phoneNumber = new ArrayList<PhoneNumber>();
        }
        return this.phoneNumber;
    }

    /**
     * Gets the value of the faxNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the faxNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFaxNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhoneNumber }
     * 
     * 
     */
    public List<PhoneNumber> getFaxNumber() {
        if (faxNumber == null) {
            faxNumber = new ArrayList<PhoneNumber>();
        }
        return this.faxNumber;
    }

    /**
     * Gets the value of the emailURI property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailURI property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailURI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmailURI }
     * 
     * 
     */
    public List<EmailURI> getEmailURI() {
        if (emailURI == null) {
            emailURI = new ArrayList<EmailURI>();
        }
        return this.emailURI;
    }

}
