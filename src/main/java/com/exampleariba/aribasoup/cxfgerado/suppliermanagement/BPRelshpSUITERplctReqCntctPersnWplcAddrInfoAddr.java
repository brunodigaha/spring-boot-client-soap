
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddr complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddr"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CommunicationPreference" type="{http://ariba.com/xi/SupplierManagement}BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrCommPref" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://ariba.com/xi/SupplierManagement}BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrEml" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Facsimile" type="{http://ariba.com/xi/SupplierManagement}BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrFacs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Telephone" type="{http://ariba.com/xi/SupplierManagement}BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrTel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Web" type="{http://ariba.com/xi/SupplierManagement}BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrWeb" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AddressRepresentationPersonName" type="{http://ariba.com/xi/SupplierManagement}BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrRpstPersnName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Workplace" type="{http://ariba.com/xi/SupplierManagement}BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrWplc" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="actionCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="emailListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="facsimileListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="telephoneListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="webListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="workplaceListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="addressRepresentationPersonNameListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddr", propOrder = {
    "communicationPreference",
    "email",
    "facsimile",
    "telephone",
    "web",
    "addressRepresentationPersonName",
    "workplace"
})
public class BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddr {

    @XmlElement(name = "CommunicationPreference")
    protected BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrCommPref communicationPreference;
    @XmlElement(name = "Email")
    protected List<BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrEml> email;
    @XmlElement(name = "Facsimile")
    protected List<BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrFacs> facsimile;
    @XmlElement(name = "Telephone")
    protected List<BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrTel> telephone;
    @XmlElement(name = "Web")
    protected List<BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrWeb> web;
    @XmlElement(name = "AddressRepresentationPersonName")
    protected List<BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrRpstPersnName> addressRepresentationPersonName;
    @XmlElement(name = "Workplace")
    protected List<BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrWplc> workplace;
    @XmlAttribute(name = "actionCode")
    protected String actionCode;
    @XmlAttribute(name = "emailListCompleteTransmissionIndicator")
    protected Boolean emailListCompleteTransmissionIndicator;
    @XmlAttribute(name = "facsimileListCompleteTransmissionIndicator")
    protected Boolean facsimileListCompleteTransmissionIndicator;
    @XmlAttribute(name = "telephoneListCompleteTransmissionIndicator")
    protected Boolean telephoneListCompleteTransmissionIndicator;
    @XmlAttribute(name = "webListCompleteTransmissionIndicator")
    protected Boolean webListCompleteTransmissionIndicator;
    @XmlAttribute(name = "workplaceListCompleteTransmissionIndicator")
    protected Boolean workplaceListCompleteTransmissionIndicator;
    @XmlAttribute(name = "addressRepresentationPersonNameListCompleteTransmissionIndicator")
    protected Boolean addressRepresentationPersonNameListCompleteTransmissionIndicator;

    /**
     * Obtém o valor da propriedade communicationPreference.
     * 
     * @return
     *     possible object is
     *     {@link BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrCommPref }
     *     
     */
    public BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrCommPref getCommunicationPreference() {
        return communicationPreference;
    }

    /**
     * Define o valor da propriedade communicationPreference.
     * 
     * @param value
     *     allowed object is
     *     {@link BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrCommPref }
     *     
     */
    public void setCommunicationPreference(BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrCommPref value) {
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
     * {@link BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrEml }
     * 
     * 
     */
    public List<BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrEml> getEmail() {
        if (email == null) {
            email = new ArrayList<BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrEml>();
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
     * {@link BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrFacs }
     * 
     * 
     */
    public List<BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrFacs> getFacsimile() {
        if (facsimile == null) {
            facsimile = new ArrayList<BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrFacs>();
        }
        return this.facsimile;
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
     * {@link BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrTel }
     * 
     * 
     */
    public List<BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrTel> getTelephone() {
        if (telephone == null) {
            telephone = new ArrayList<BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrTel>();
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
     * {@link BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrWeb }
     * 
     * 
     */
    public List<BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrWeb> getWeb() {
        if (web == null) {
            web = new ArrayList<BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrWeb>();
        }
        return this.web;
    }

    /**
     * Gets the value of the addressRepresentationPersonName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressRepresentationPersonName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressRepresentationPersonName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrRpstPersnName }
     * 
     * 
     */
    public List<BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrRpstPersnName> getAddressRepresentationPersonName() {
        if (addressRepresentationPersonName == null) {
            addressRepresentationPersonName = new ArrayList<BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrRpstPersnName>();
        }
        return this.addressRepresentationPersonName;
    }

    /**
     * Gets the value of the workplace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workplace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkplace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrWplc }
     * 
     * 
     */
    public List<BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrWplc> getWorkplace() {
        if (workplace == null) {
            workplace = new ArrayList<BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrWplc>();
        }
        return this.workplace;
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

    /**
     * Obtém o valor da propriedade workplaceListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkplaceListCompleteTransmissionIndicator() {
        return workplaceListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade workplaceListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkplaceListCompleteTransmissionIndicator(Boolean value) {
        this.workplaceListCompleteTransmissionIndicator = value;
    }

    /**
     * Obtém o valor da propriedade addressRepresentationPersonNameListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddressRepresentationPersonNameListCompleteTransmissionIndicator() {
        return addressRepresentationPersonNameListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade addressRepresentationPersonNameListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddressRepresentationPersonNameListCompleteTransmissionIndicator(Boolean value) {
        this.addressRepresentationPersonNameListCompleteTransmissionIndicator = value;
    }

}
