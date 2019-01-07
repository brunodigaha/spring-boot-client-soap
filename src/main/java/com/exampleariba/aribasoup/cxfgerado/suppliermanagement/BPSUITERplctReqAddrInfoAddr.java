
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BPSUITERplctReqAddrInfoAddr complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPSUITERplctReqAddrInfoAddr"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddressNote" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqNote" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CommunicationPreference" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqAddrInfoAddrCommPref" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqAddrInfoAddrEml" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Facsimile" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqAddrInfoAddrFacs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OrganisationName" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqAddrInfoAddrOrgName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PersonName" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqAddrInfoAddrPersnName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PostalAddress" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqAddrInfoAddrPostlAddr" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Telephone" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqAddrInfoAddrTel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Web" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqAddrInfoAddrWeb" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="actionCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="addressNoteListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="emailListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="facsimileListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="organisationNameListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="personNameListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="postalAddressListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="telephoneListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="webListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BPSUITERplctReqAddrInfoAddr", propOrder = {
    "addressNote",
    "communicationPreference",
    "email",
    "facsimile",
    "organisationName",
    "personName",
    "postalAddress",
    "telephone",
    "web"
})
public class BPSUITERplctReqAddrInfoAddr {

    @XmlElement(name = "AddressNote")
    protected List<BPSUITERplctReqNote> addressNote;
    @XmlElement(name = "CommunicationPreference")
    protected BPSUITERplctReqAddrInfoAddrCommPref communicationPreference;
    @XmlElement(name = "Email")
    protected List<BPSUITERplctReqAddrInfoAddrEml> email;
    @XmlElement(name = "Facsimile")
    protected List<BPSUITERplctReqAddrInfoAddrFacs> facsimile;
    @XmlElement(name = "OrganisationName")
    protected List<BPSUITERplctReqAddrInfoAddrOrgName> organisationName;
    @XmlElement(name = "PersonName")
    protected List<BPSUITERplctReqAddrInfoAddrPersnName> personName;
    @XmlElement(name = "PostalAddress")
    protected List<BPSUITERplctReqAddrInfoAddrPostlAddr> postalAddress;
    @XmlElement(name = "Telephone")
    protected List<BPSUITERplctReqAddrInfoAddrTel> telephone;
    @XmlElement(name = "Web")
    protected List<BPSUITERplctReqAddrInfoAddrWeb> web;
    @XmlAttribute(name = "actionCode")
    protected String actionCode;
    @XmlAttribute(name = "addressNoteListCompleteTransmissionIndicator")
    protected Boolean addressNoteListCompleteTransmissionIndicator;
    @XmlAttribute(name = "emailListCompleteTransmissionIndicator")
    protected Boolean emailListCompleteTransmissionIndicator;
    @XmlAttribute(name = "facsimileListCompleteTransmissionIndicator")
    protected Boolean facsimileListCompleteTransmissionIndicator;
    @XmlAttribute(name = "organisationNameListCompleteTransmissionIndicator")
    protected Boolean organisationNameListCompleteTransmissionIndicator;
    @XmlAttribute(name = "personNameListCompleteTransmissionIndicator")
    protected Boolean personNameListCompleteTransmissionIndicator;
    @XmlAttribute(name = "postalAddressListCompleteTransmissionIndicator")
    protected Boolean postalAddressListCompleteTransmissionIndicator;
    @XmlAttribute(name = "telephoneListCompleteTransmissionIndicator")
    protected Boolean telephoneListCompleteTransmissionIndicator;
    @XmlAttribute(name = "webListCompleteTransmissionIndicator")
    protected Boolean webListCompleteTransmissionIndicator;

    /**
     * Gets the value of the addressNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPSUITERplctReqNote }
     * 
     * 
     */
    public List<BPSUITERplctReqNote> getAddressNote() {
        if (addressNote == null) {
            addressNote = new ArrayList<BPSUITERplctReqNote>();
        }
        return this.addressNote;
    }

    /**
     * Obtém o valor da propriedade communicationPreference.
     * 
     * @return
     *     possible object is
     *     {@link BPSUITERplctReqAddrInfoAddrCommPref }
     *     
     */
    public BPSUITERplctReqAddrInfoAddrCommPref getCommunicationPreference() {
        return communicationPreference;
    }

    /**
     * Define o valor da propriedade communicationPreference.
     * 
     * @param value
     *     allowed object is
     *     {@link BPSUITERplctReqAddrInfoAddrCommPref }
     *     
     */
    public void setCommunicationPreference(BPSUITERplctReqAddrInfoAddrCommPref value) {
        this.communicationPreference = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the email property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPSUITERplctReqAddrInfoAddrEml }
     * 
     * 
     */
    public List<BPSUITERplctReqAddrInfoAddrEml> getEmail() {
        if (email == null) {
            email = new ArrayList<BPSUITERplctReqAddrInfoAddrEml>();
        }
        return this.email;
    }

    /**
     * Gets the value of the facsimile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facsimile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacsimile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPSUITERplctReqAddrInfoAddrFacs }
     * 
     * 
     */
    public List<BPSUITERplctReqAddrInfoAddrFacs> getFacsimile() {
        if (facsimile == null) {
            facsimile = new ArrayList<BPSUITERplctReqAddrInfoAddrFacs>();
        }
        return this.facsimile;
    }

    /**
     * Gets the value of the organisationName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organisationName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganisationName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPSUITERplctReqAddrInfoAddrOrgName }
     * 
     * 
     */
    public List<BPSUITERplctReqAddrInfoAddrOrgName> getOrganisationName() {
        if (organisationName == null) {
            organisationName = new ArrayList<BPSUITERplctReqAddrInfoAddrOrgName>();
        }
        return this.organisationName;
    }

    /**
     * Gets the value of the personName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPSUITERplctReqAddrInfoAddrPersnName }
     * 
     * 
     */
    public List<BPSUITERplctReqAddrInfoAddrPersnName> getPersonName() {
        if (personName == null) {
            personName = new ArrayList<BPSUITERplctReqAddrInfoAddrPersnName>();
        }
        return this.personName;
    }

    /**
     * Gets the value of the postalAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the postalAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPostalAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPSUITERplctReqAddrInfoAddrPostlAddr }
     * 
     * 
     */
    public List<BPSUITERplctReqAddrInfoAddrPostlAddr> getPostalAddress() {
        if (postalAddress == null) {
            postalAddress = new ArrayList<BPSUITERplctReqAddrInfoAddrPostlAddr>();
        }
        return this.postalAddress;
    }

    /**
     * Gets the value of the telephone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telephone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelephone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPSUITERplctReqAddrInfoAddrTel }
     * 
     * 
     */
    public List<BPSUITERplctReqAddrInfoAddrTel> getTelephone() {
        if (telephone == null) {
            telephone = new ArrayList<BPSUITERplctReqAddrInfoAddrTel>();
        }
        return this.telephone;
    }

    /**
     * Gets the value of the web property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the web property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeb().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPSUITERplctReqAddrInfoAddrWeb }
     * 
     * 
     */
    public List<BPSUITERplctReqAddrInfoAddrWeb> getWeb() {
        if (web == null) {
            web = new ArrayList<BPSUITERplctReqAddrInfoAddrWeb>();
        }
        return this.web;
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

    /**
     * Obtém o valor da propriedade addressNoteListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddressNoteListCompleteTransmissionIndicator() {
        return addressNoteListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade addressNoteListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddressNoteListCompleteTransmissionIndicator(Boolean value) {
        this.addressNoteListCompleteTransmissionIndicator = value;
    }

    /**
     * Obtém o valor da propriedade emailListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmailListCompleteTransmissionIndicator() {
        return emailListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade emailListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmailListCompleteTransmissionIndicator(Boolean value) {
        this.emailListCompleteTransmissionIndicator = value;
    }

    /**
     * Obtém o valor da propriedade facsimileListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFacsimileListCompleteTransmissionIndicator() {
        return facsimileListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade facsimileListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFacsimileListCompleteTransmissionIndicator(Boolean value) {
        this.facsimileListCompleteTransmissionIndicator = value;
    }

    /**
     * Obtém o valor da propriedade organisationNameListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganisationNameListCompleteTransmissionIndicator() {
        return organisationNameListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade organisationNameListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganisationNameListCompleteTransmissionIndicator(Boolean value) {
        this.organisationNameListCompleteTransmissionIndicator = value;
    }

    /**
     * Obtém o valor da propriedade personNameListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPersonNameListCompleteTransmissionIndicator() {
        return personNameListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade personNameListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPersonNameListCompleteTransmissionIndicator(Boolean value) {
        this.personNameListCompleteTransmissionIndicator = value;
    }

    /**
     * Obtém o valor da propriedade postalAddressListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPostalAddressListCompleteTransmissionIndicator() {
        return postalAddressListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade postalAddressListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPostalAddressListCompleteTransmissionIndicator(Boolean value) {
        this.postalAddressListCompleteTransmissionIndicator = value;
    }

    /**
     * Obtém o valor da propriedade telephoneListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTelephoneListCompleteTransmissionIndicator() {
        return telephoneListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade telephoneListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTelephoneListCompleteTransmissionIndicator(Boolean value) {
        this.telephoneListCompleteTransmissionIndicator = value;
    }

    /**
     * Obtém o valor da propriedade webListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWebListCompleteTransmissionIndicator() {
        return webListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade webListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWebListCompleteTransmissionIndicator(Boolean value) {
        this.webListCompleteTransmissionIndicator = value;
    }

}
