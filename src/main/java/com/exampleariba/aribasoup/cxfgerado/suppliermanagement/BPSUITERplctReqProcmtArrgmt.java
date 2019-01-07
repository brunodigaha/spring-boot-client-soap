
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java de BPSUITERplctReqProcmtArrgmt complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPSUITERplctReqProcmtArrgmt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReceiverPurchasingOrganisationID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverOrganisationalCentreID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="PurchasingOrganisationID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="OrganisationalCentreID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="SupplyingPlantID" type="{http://ariba.com/xi/SupplierManagement}PlantID" minOccurs="0"/&gt;
 *         &lt;element name="VendorSubrangeCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="PurchasingGroupID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="DeletedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SupplierABCClassificationCode" type="{http://ariba.com/xi/SupplierManagement}SupplierABCClassificationCode" minOccurs="0"/&gt;
 *         &lt;element name="SellerPartyContactPersonName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MRPControllerCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="PurchasingTerms" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqPurgTrms" minOccurs="0"/&gt;
 *         &lt;element name="PartnerFunctions" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqPartFuncs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PurchasingText" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="actionCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="purchasingTermsListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="partnerFunctionsListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="purchasingTextListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BPSUITERplctReqProcmtArrgmt", propOrder = {
    "receiverPurchasingOrganisationID",
    "receiverOrganisationalCentreID",
    "purchasingOrganisationID",
    "organisationalCentreID",
    "supplyingPlantID",
    "vendorSubrangeCode",
    "purchasingGroupID",
    "deletedIndicator",
    "supplierABCClassificationCode",
    "sellerPartyContactPersonName",
    "mrpControllerCode",
    "purchasingTerms",
    "partnerFunctions",
    "purchasingText"
})
public class BPSUITERplctReqProcmtArrgmt {

    @XmlElement(name = "ReceiverPurchasingOrganisationID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String receiverPurchasingOrganisationID;
    @XmlElement(name = "ReceiverOrganisationalCentreID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String receiverOrganisationalCentreID;
    @XmlElement(name = "PurchasingOrganisationID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String purchasingOrganisationID;
    @XmlElement(name = "OrganisationalCentreID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String organisationalCentreID;
    @XmlElement(name = "SupplyingPlantID")
    protected PlantID supplyingPlantID;
    @XmlElement(name = "VendorSubrangeCode")
    protected Code vendorSubrangeCode;
    @XmlElement(name = "PurchasingGroupID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String purchasingGroupID;
    @XmlElement(name = "DeletedIndicator")
    protected Boolean deletedIndicator;
    @XmlElement(name = "SupplierABCClassificationCode")
    protected SupplierABCClassificationCode supplierABCClassificationCode;
    @XmlElement(name = "SellerPartyContactPersonName")
    protected String sellerPartyContactPersonName;
    @XmlElement(name = "MRPControllerCode")
    protected Code mrpControllerCode;
    @XmlElement(name = "PurchasingTerms")
    protected BPSUITERplctReqPurgTrms purchasingTerms;
    @XmlElement(name = "PartnerFunctions")
    protected List<BPSUITERplctReqPartFuncs> partnerFunctions;
    @XmlElement(name = "PurchasingText")
    protected List<BPSUITERplctReqText> purchasingText;
    @XmlAttribute(name = "actionCode")
    protected String actionCode;
    @XmlAttribute(name = "purchasingTermsListCompleteTransmissionIndicator")
    protected Boolean purchasingTermsListCompleteTransmissionIndicator;
    @XmlAttribute(name = "partnerFunctionsListCompleteTransmissionIndicator")
    protected Boolean partnerFunctionsListCompleteTransmissionIndicator;
    @XmlAttribute(name = "purchasingTextListCompleteTransmissionIndicator")
    protected Boolean purchasingTextListCompleteTransmissionIndicator;

    /**
     * Obtém o valor da propriedade receiverPurchasingOrganisationID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverPurchasingOrganisationID() {
        return receiverPurchasingOrganisationID;
    }

    /**
     * Define o valor da propriedade receiverPurchasingOrganisationID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverPurchasingOrganisationID(String value) {
        this.receiverPurchasingOrganisationID = value;
    }

    /**
     * Obtém o valor da propriedade receiverOrganisationalCentreID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverOrganisationalCentreID() {
        return receiverOrganisationalCentreID;
    }

    /**
     * Define o valor da propriedade receiverOrganisationalCentreID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverOrganisationalCentreID(String value) {
        this.receiverOrganisationalCentreID = value;
    }

    /**
     * Obtém o valor da propriedade purchasingOrganisationID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchasingOrganisationID() {
        return purchasingOrganisationID;
    }

    /**
     * Define o valor da propriedade purchasingOrganisationID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchasingOrganisationID(String value) {
        this.purchasingOrganisationID = value;
    }

    /**
     * Obtém o valor da propriedade organisationalCentreID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationalCentreID() {
        return organisationalCentreID;
    }

    /**
     * Define o valor da propriedade organisationalCentreID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationalCentreID(String value) {
        this.organisationalCentreID = value;
    }

    /**
     * Obtém o valor da propriedade supplyingPlantID.
     * 
     * @return
     *     possible object is
     *     {@link PlantID }
     *     
     */
    public PlantID getSupplyingPlantID() {
        return supplyingPlantID;
    }

    /**
     * Define o valor da propriedade supplyingPlantID.
     * 
     * @param value
     *     allowed object is
     *     {@link PlantID }
     *     
     */
    public void setSupplyingPlantID(PlantID value) {
        this.supplyingPlantID = value;
    }

    /**
     * Obtém o valor da propriedade vendorSubrangeCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getVendorSubrangeCode() {
        return vendorSubrangeCode;
    }

    /**
     * Define o valor da propriedade vendorSubrangeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setVendorSubrangeCode(Code value) {
        this.vendorSubrangeCode = value;
    }

    /**
     * Obtém o valor da propriedade purchasingGroupID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchasingGroupID() {
        return purchasingGroupID;
    }

    /**
     * Define o valor da propriedade purchasingGroupID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchasingGroupID(String value) {
        this.purchasingGroupID = value;
    }

    /**
     * Obtém o valor da propriedade deletedIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeletedIndicator() {
        return deletedIndicator;
    }

    /**
     * Define o valor da propriedade deletedIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeletedIndicator(Boolean value) {
        this.deletedIndicator = value;
    }

    /**
     * Obtém o valor da propriedade supplierABCClassificationCode.
     * 
     * @return
     *     possible object is
     *     {@link SupplierABCClassificationCode }
     *     
     */
    public SupplierABCClassificationCode getSupplierABCClassificationCode() {
        return supplierABCClassificationCode;
    }

    /**
     * Define o valor da propriedade supplierABCClassificationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierABCClassificationCode }
     *     
     */
    public void setSupplierABCClassificationCode(SupplierABCClassificationCode value) {
        this.supplierABCClassificationCode = value;
    }

    /**
     * Obtém o valor da propriedade sellerPartyContactPersonName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerPartyContactPersonName() {
        return sellerPartyContactPersonName;
    }

    /**
     * Define o valor da propriedade sellerPartyContactPersonName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerPartyContactPersonName(String value) {
        this.sellerPartyContactPersonName = value;
    }

    /**
     * Obtém o valor da propriedade mrpControllerCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getMRPControllerCode() {
        return mrpControllerCode;
    }

    /**
     * Define o valor da propriedade mrpControllerCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setMRPControllerCode(Code value) {
        this.mrpControllerCode = value;
    }

    /**
     * Obtém o valor da propriedade purchasingTerms.
     * 
     * @return
     *     possible object is
     *     {@link BPSUITERplctReqPurgTrms }
     *     
     */
    public BPSUITERplctReqPurgTrms getPurchasingTerms() {
        return purchasingTerms;
    }

    /**
     * Define o valor da propriedade purchasingTerms.
     * 
     * @param value
     *     allowed object is
     *     {@link BPSUITERplctReqPurgTrms }
     *     
     */
    public void setPurchasingTerms(BPSUITERplctReqPurgTrms value) {
        this.purchasingTerms = value;
    }

    /**
     * Gets the value of the partnerFunctions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerFunctions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnerFunctions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPSUITERplctReqPartFuncs }
     * 
     * 
     */
    public List<BPSUITERplctReqPartFuncs> getPartnerFunctions() {
        if (partnerFunctions == null) {
            partnerFunctions = new ArrayList<BPSUITERplctReqPartFuncs>();
        }
        return this.partnerFunctions;
    }

    /**
     * Gets the value of the purchasingText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchasingText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchasingText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPSUITERplctReqText }
     * 
     * 
     */
    public List<BPSUITERplctReqText> getPurchasingText() {
        if (purchasingText == null) {
            purchasingText = new ArrayList<BPSUITERplctReqText>();
        }
        return this.purchasingText;
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
     * Obtém o valor da propriedade purchasingTermsListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPurchasingTermsListCompleteTransmissionIndicator() {
        return purchasingTermsListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade purchasingTermsListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPurchasingTermsListCompleteTransmissionIndicator(Boolean value) {
        this.purchasingTermsListCompleteTransmissionIndicator = value;
    }

    /**
     * Obtém o valor da propriedade partnerFunctionsListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPartnerFunctionsListCompleteTransmissionIndicator() {
        return partnerFunctionsListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade partnerFunctionsListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartnerFunctionsListCompleteTransmissionIndicator(Boolean value) {
        this.partnerFunctionsListCompleteTransmissionIndicator = value;
    }

    /**
     * Obtém o valor da propriedade purchasingTextListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPurchasingTextListCompleteTransmissionIndicator() {
        return purchasingTextListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade purchasingTextListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPurchasingTextListCompleteTransmissionIndicator(Boolean value) {
        this.purchasingTextListCompleteTransmissionIndicator = value;
    }

}
