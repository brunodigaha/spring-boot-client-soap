
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BPRelshpSUITERplctReqCntctPersn complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPRelshpSUITERplctReqCntctPersn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BusinessPartnerFunctionTypeCode" type="{http://ariba.com/xi/SupplierManagement}BusinessPartnerFunctionTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="BusinessPartnerFunctionalAreaCode" type="{http://ariba.com/xi/SupplierManagement}BusinessPartnerFunctionalAreaCode" minOccurs="0"/&gt;
 *         &lt;element name="PowerOfAttorneyTypeCode" type="{http://ariba.com/xi/SupplierManagement}PowerOfAttorneyTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="VIPReasonCode" type="{http://ariba.com/xi/SupplierManagement}VIPReasonCode" minOccurs="0"/&gt;
 *         &lt;element name="ContactPersonNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorkplaceAddressInformation" type="{http://ariba.com/xi/SupplierManagement}BPRelshpSUITERplctReqCntctPersnWplcAddrInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CustomerContactPerson" type="{http://ariba.com/xi/SupplierManagement}BPRelshpSUITERplctReqCustSuplrCntctPersn" minOccurs="0"/&gt;
 *         &lt;element name="SupplierContactPerson" type="{http://ariba.com/xi/SupplierManagement}BPRelshpSUITERplctReqCustSuplrCntctPersn" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="actionCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="workplaceAddressListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BPRelshpSUITERplctReqCntctPersn", propOrder = {
    "businessPartnerFunctionTypeCode",
    "businessPartnerFunctionalAreaCode",
    "powerOfAttorneyTypeCode",
    "vipReasonCode",
    "contactPersonNote",
    "workplaceAddressInformation",
    "customerContactPerson",
    "supplierContactPerson"
})
public class BPRelshpSUITERplctReqCntctPersn {

    @XmlElement(name = "BusinessPartnerFunctionTypeCode")
    protected BusinessPartnerFunctionTypeCode businessPartnerFunctionTypeCode;
    @XmlElement(name = "BusinessPartnerFunctionalAreaCode")
    protected BusinessPartnerFunctionalAreaCode businessPartnerFunctionalAreaCode;
    @XmlElement(name = "PowerOfAttorneyTypeCode")
    protected PowerOfAttorneyTypeCode powerOfAttorneyTypeCode;
    @XmlElement(name = "VIPReasonCode")
    protected VIPReasonCode vipReasonCode;
    @XmlElement(name = "ContactPersonNote")
    protected String contactPersonNote;
    @XmlElement(name = "WorkplaceAddressInformation")
    protected List<BPRelshpSUITERplctReqCntctPersnWplcAddrInfo> workplaceAddressInformation;
    @XmlElement(name = "CustomerContactPerson")
    protected BPRelshpSUITERplctReqCustSuplrCntctPersn customerContactPerson;
    @XmlElement(name = "SupplierContactPerson")
    protected BPRelshpSUITERplctReqCustSuplrCntctPersn supplierContactPerson;
    @XmlAttribute(name = "actionCode")
    protected String actionCode;
    @XmlAttribute(name = "workplaceAddressListCompleteTransmissionIndicator")
    protected Boolean workplaceAddressListCompleteTransmissionIndicator;

    /**
     * Obtém o valor da propriedade businessPartnerFunctionTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link BusinessPartnerFunctionTypeCode }
     *     
     */
    public BusinessPartnerFunctionTypeCode getBusinessPartnerFunctionTypeCode() {
        return businessPartnerFunctionTypeCode;
    }

    /**
     * Define o valor da propriedade businessPartnerFunctionTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessPartnerFunctionTypeCode }
     *     
     */
    public void setBusinessPartnerFunctionTypeCode(BusinessPartnerFunctionTypeCode value) {
        this.businessPartnerFunctionTypeCode = value;
    }

    /**
     * Obtém o valor da propriedade businessPartnerFunctionalAreaCode.
     * 
     * @return
     *     possible object is
     *     {@link BusinessPartnerFunctionalAreaCode }
     *     
     */
    public BusinessPartnerFunctionalAreaCode getBusinessPartnerFunctionalAreaCode() {
        return businessPartnerFunctionalAreaCode;
    }

    /**
     * Define o valor da propriedade businessPartnerFunctionalAreaCode.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessPartnerFunctionalAreaCode }
     *     
     */
    public void setBusinessPartnerFunctionalAreaCode(BusinessPartnerFunctionalAreaCode value) {
        this.businessPartnerFunctionalAreaCode = value;
    }

    /**
     * Obtém o valor da propriedade powerOfAttorneyTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link PowerOfAttorneyTypeCode }
     *     
     */
    public PowerOfAttorneyTypeCode getPowerOfAttorneyTypeCode() {
        return powerOfAttorneyTypeCode;
    }

    /**
     * Define o valor da propriedade powerOfAttorneyTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerOfAttorneyTypeCode }
     *     
     */
    public void setPowerOfAttorneyTypeCode(PowerOfAttorneyTypeCode value) {
        this.powerOfAttorneyTypeCode = value;
    }

    /**
     * Obtém o valor da propriedade vipReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link VIPReasonCode }
     *     
     */
    public VIPReasonCode getVIPReasonCode() {
        return vipReasonCode;
    }

    /**
     * Define o valor da propriedade vipReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link VIPReasonCode }
     *     
     */
    public void setVIPReasonCode(VIPReasonCode value) {
        this.vipReasonCode = value;
    }

    /**
     * Obtém o valor da propriedade contactPersonNote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPersonNote() {
        return contactPersonNote;
    }

    /**
     * Define o valor da propriedade contactPersonNote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPersonNote(String value) {
        this.contactPersonNote = value;
    }

    /**
     * Gets the value of the workplaceAddressInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workplaceAddressInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkplaceAddressInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPRelshpSUITERplctReqCntctPersnWplcAddrInfo }
     * 
     * 
     */
    public List<BPRelshpSUITERplctReqCntctPersnWplcAddrInfo> getWorkplaceAddressInformation() {
        if (workplaceAddressInformation == null) {
            workplaceAddressInformation = new ArrayList<BPRelshpSUITERplctReqCntctPersnWplcAddrInfo>();
        }
        return this.workplaceAddressInformation;
    }

    /**
     * Obtém o valor da propriedade customerContactPerson.
     * 
     * @return
     *     possible object is
     *     {@link BPRelshpSUITERplctReqCustSuplrCntctPersn }
     *     
     */
    public BPRelshpSUITERplctReqCustSuplrCntctPersn getCustomerContactPerson() {
        return customerContactPerson;
    }

    /**
     * Define o valor da propriedade customerContactPerson.
     * 
     * @param value
     *     allowed object is
     *     {@link BPRelshpSUITERplctReqCustSuplrCntctPersn }
     *     
     */
    public void setCustomerContactPerson(BPRelshpSUITERplctReqCustSuplrCntctPersn value) {
        this.customerContactPerson = value;
    }

    /**
     * Obtém o valor da propriedade supplierContactPerson.
     * 
     * @return
     *     possible object is
     *     {@link BPRelshpSUITERplctReqCustSuplrCntctPersn }
     *     
     */
    public BPRelshpSUITERplctReqCustSuplrCntctPersn getSupplierContactPerson() {
        return supplierContactPerson;
    }

    /**
     * Define o valor da propriedade supplierContactPerson.
     * 
     * @param value
     *     allowed object is
     *     {@link BPRelshpSUITERplctReqCustSuplrCntctPersn }
     *     
     */
    public void setSupplierContactPerson(BPRelshpSUITERplctReqCustSuplrCntctPersn value) {
        this.supplierContactPerson = value;
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
     * Obtém o valor da propriedade workplaceAddressListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkplaceAddressListCompleteTransmissionIndicator() {
        return workplaceAddressListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade workplaceAddressListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkplaceAddressListCompleteTransmissionIndicator(Boolean value) {
        this.workplaceAddressListCompleteTransmissionIndicator = value;
    }

}
