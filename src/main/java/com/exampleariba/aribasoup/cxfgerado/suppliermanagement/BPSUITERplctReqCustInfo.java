
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
 * <p>Classe Java de BPSUITERplctReqCustInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPSUITERplctReqCustInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InternalID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverInternalID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="MaintenanceProfileCode" type="{http://ariba.com/xi/SupplierManagement}BusinessPartnerMaintenanceProfileCode" minOccurs="0"/&gt;
 *         &lt;element name="AuthorisationGroupCode" type="{http://ariba.com/xi/SupplierManagement}AuthorisationGroupCode" minOccurs="0"/&gt;
 *         &lt;element name="ExpressTrainStationLocationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TrainStationLocationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerPartyWithFiscalAddressInternalID" type="{http://ariba.com/xi/SupplierManagement}PartyInternalID" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverCustomerPartyWithFiscalAddressInternalID" type="{http://ariba.com/xi/SupplierManagement}PartyInternalID" minOccurs="0"/&gt;
 *         &lt;element name="AlternativePayeePartyInternalID" type="{http://ariba.com/xi/SupplierManagement}PartyInternalID" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverAlternativePayeePartyInternalID" type="{http://ariba.com/xi/SupplierManagement}PartyInternalID" minOccurs="0"/&gt;
 *         &lt;element name="AlternativePayeeAllowedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CorporateGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StandardPointLocationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeletionBlockedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DeletedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CountyCode" type="{http://ariba.com/xi/SupplierManagement}CountyCode" minOccurs="0"/&gt;
 *         &lt;element name="CityCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="PostingBlockedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EqualizationTaxRelevanceIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ValueAddedTaxRelevanceIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TradingPartnerCompanyID" type="{http://ariba.com/xi/SupplierManagement}CompanyID" minOccurs="0"/&gt;
 *         &lt;element name="TaxGroupCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="ICMSExemptionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IPIExemptionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TaxSubstitutionGroupCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="CFOPCategoryCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="SaleSalesAndDistributionBlocks" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqSalesAndDistrBlocks" minOccurs="0"/&gt;
 *         &lt;element name="IndustrySector" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqCustIndstrySectr" minOccurs="0"/&gt;
 *         &lt;element name="MarketingAttributes" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqMktgAttribs" minOccurs="0"/&gt;
 *         &lt;element name="CustomerExtensionCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="FirstAdditionalCustomerExtensionCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="SecondAdditionalCustomerExtensionCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="ThirdAdditionalCustomerExtensionCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="FourthAdditionalCustomerExtensionCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="FifthAdditionalCustomerExtensionCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="SixthAdditionalCustomerExtensionCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="SeventhAdditionalCustomerExtensionCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="EighthAdditionalCustomerExtensionCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="NinthAdditionalCustomerExtensionCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="DataMediumExchangeReportCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="DataMediumExchangeInstructionCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="CivilUseIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MilitaryUseIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LegalControlIndicators" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqLegalCtrlInds" minOccurs="0"/&gt;
 *         &lt;element name="PriceSpecifications" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqPrSpecs" minOccurs="0"/&gt;
 *         &lt;element name="RepresentativeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BusinessTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IndustryTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RelatedSupplierInternalID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverRelatedSupplierInternalID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="AccountingInformation" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqCustAcctgInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SalesArrangement" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqSlsArrgmt" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="UnloadingPoints" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqCustUnldgPts" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TaxClassification" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqCustTaxClass" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TaxGrouping" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqCustTxGrpg" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CustomerText" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CustomerDocument" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqDoc" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="accountingInformationListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="salesArrangementListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="unloadingPointsListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="taxClassificationListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="taxGroupingListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="customerTextListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BPSUITERplctReqCustInfo", propOrder = {
    "internalID",
    "receiverInternalID",
    "maintenanceProfileCode",
    "authorisationGroupCode",
    "expressTrainStationLocationName",
    "trainStationLocationName",
    "customerPartyWithFiscalAddressInternalID",
    "receiverCustomerPartyWithFiscalAddressInternalID",
    "alternativePayeePartyInternalID",
    "receiverAlternativePayeePartyInternalID",
    "alternativePayeeAllowedIndicator",
    "corporateGroupName",
    "standardPointLocationCode",
    "deletionBlockedIndicator",
    "deletedIndicator",
    "countyCode",
    "cityCode",
    "postingBlockedIndicator",
    "equalizationTaxRelevanceIndicator",
    "valueAddedTaxRelevanceIndicator",
    "tradingPartnerCompanyID",
    "taxGroupCode",
    "icmsExemptionIndicator",
    "ipiExemptionIndicator",
    "taxSubstitutionGroupCode",
    "cfopCategoryCode",
    "saleSalesAndDistributionBlocks",
    "industrySector",
    "marketingAttributes",
    "customerExtensionCode",
    "firstAdditionalCustomerExtensionCode",
    "secondAdditionalCustomerExtensionCode",
    "thirdAdditionalCustomerExtensionCode",
    "fourthAdditionalCustomerExtensionCode",
    "fifthAdditionalCustomerExtensionCode",
    "sixthAdditionalCustomerExtensionCode",
    "seventhAdditionalCustomerExtensionCode",
    "eighthAdditionalCustomerExtensionCode",
    "ninthAdditionalCustomerExtensionCode",
    "dataMediumExchangeReportCode",
    "dataMediumExchangeInstructionCode",
    "civilUseIndicator",
    "militaryUseIndicator",
    "legalControlIndicators",
    "priceSpecifications",
    "representativeName",
    "businessTypeName",
    "industryTypeName",
    "relatedSupplierInternalID",
    "receiverRelatedSupplierInternalID",
    "accountingInformation",
    "salesArrangement",
    "unloadingPoints",
    "taxClassification",
    "taxGrouping",
    "customerText",
    "customerDocument"
})
public class BPSUITERplctReqCustInfo {

    @XmlElement(name = "InternalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String internalID;
    @XmlElement(name = "ReceiverInternalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String receiverInternalID;
    @XmlElement(name = "MaintenanceProfileCode")
    protected BusinessPartnerMaintenanceProfileCode maintenanceProfileCode;
    @XmlElement(name = "AuthorisationGroupCode")
    protected AuthorisationGroupCode authorisationGroupCode;
    @XmlElement(name = "ExpressTrainStationLocationName")
    protected String expressTrainStationLocationName;
    @XmlElement(name = "TrainStationLocationName")
    protected String trainStationLocationName;
    @XmlElement(name = "CustomerPartyWithFiscalAddressInternalID")
    protected PartyInternalID customerPartyWithFiscalAddressInternalID;
    @XmlElement(name = "ReceiverCustomerPartyWithFiscalAddressInternalID")
    protected PartyInternalID receiverCustomerPartyWithFiscalAddressInternalID;
    @XmlElement(name = "AlternativePayeePartyInternalID")
    protected PartyInternalID alternativePayeePartyInternalID;
    @XmlElement(name = "ReceiverAlternativePayeePartyInternalID")
    protected PartyInternalID receiverAlternativePayeePartyInternalID;
    @XmlElement(name = "AlternativePayeeAllowedIndicator")
    protected Boolean alternativePayeeAllowedIndicator;
    @XmlElement(name = "CorporateGroupName")
    protected String corporateGroupName;
    @XmlElement(name = "StandardPointLocationCode")
    protected String standardPointLocationCode;
    @XmlElement(name = "DeletionBlockedIndicator")
    protected Boolean deletionBlockedIndicator;
    @XmlElement(name = "DeletedIndicator")
    protected Boolean deletedIndicator;
    @XmlElement(name = "CountyCode")
    protected CountyCode countyCode;
    @XmlElement(name = "CityCode")
    protected Code cityCode;
    @XmlElement(name = "PostingBlockedIndicator")
    protected Boolean postingBlockedIndicator;
    @XmlElement(name = "EqualizationTaxRelevanceIndicator")
    protected Boolean equalizationTaxRelevanceIndicator;
    @XmlElement(name = "ValueAddedTaxRelevanceIndicator")
    protected Boolean valueAddedTaxRelevanceIndicator;
    @XmlElement(name = "TradingPartnerCompanyID")
    protected CompanyID tradingPartnerCompanyID;
    @XmlElement(name = "TaxGroupCode")
    protected Code taxGroupCode;
    @XmlElement(name = "ICMSExemptionIndicator")
    protected Boolean icmsExemptionIndicator;
    @XmlElement(name = "IPIExemptionIndicator")
    protected Boolean ipiExemptionIndicator;
    @XmlElement(name = "TaxSubstitutionGroupCode")
    protected Code taxSubstitutionGroupCode;
    @XmlElement(name = "CFOPCategoryCode")
    protected Code cfopCategoryCode;
    @XmlElement(name = "SaleSalesAndDistributionBlocks")
    protected BPSUITERplctReqSalesAndDistrBlocks saleSalesAndDistributionBlocks;
    @XmlElement(name = "IndustrySector")
    protected BPSUITERplctReqCustIndstrySectr industrySector;
    @XmlElement(name = "MarketingAttributes")
    protected BPSUITERplctReqMktgAttribs marketingAttributes;
    @XmlElement(name = "CustomerExtensionCode")
    protected Code customerExtensionCode;
    @XmlElement(name = "FirstAdditionalCustomerExtensionCode")
    protected Code firstAdditionalCustomerExtensionCode;
    @XmlElement(name = "SecondAdditionalCustomerExtensionCode")
    protected Code secondAdditionalCustomerExtensionCode;
    @XmlElement(name = "ThirdAdditionalCustomerExtensionCode")
    protected Code thirdAdditionalCustomerExtensionCode;
    @XmlElement(name = "FourthAdditionalCustomerExtensionCode")
    protected Code fourthAdditionalCustomerExtensionCode;
    @XmlElement(name = "FifthAdditionalCustomerExtensionCode")
    protected Code fifthAdditionalCustomerExtensionCode;
    @XmlElement(name = "SixthAdditionalCustomerExtensionCode")
    protected Code sixthAdditionalCustomerExtensionCode;
    @XmlElement(name = "SeventhAdditionalCustomerExtensionCode")
    protected Code seventhAdditionalCustomerExtensionCode;
    @XmlElement(name = "EighthAdditionalCustomerExtensionCode")
    protected Code eighthAdditionalCustomerExtensionCode;
    @XmlElement(name = "NinthAdditionalCustomerExtensionCode")
    protected Code ninthAdditionalCustomerExtensionCode;
    @XmlElement(name = "DataMediumExchangeReportCode")
    protected Code dataMediumExchangeReportCode;
    @XmlElement(name = "DataMediumExchangeInstructionCode")
    protected Code dataMediumExchangeInstructionCode;
    @XmlElement(name = "CivilUseIndicator")
    protected Boolean civilUseIndicator;
    @XmlElement(name = "MilitaryUseIndicator")
    protected Boolean militaryUseIndicator;
    @XmlElement(name = "LegalControlIndicators")
    protected BPSUITERplctReqLegalCtrlInds legalControlIndicators;
    @XmlElement(name = "PriceSpecifications")
    protected BPSUITERplctReqPrSpecs priceSpecifications;
    @XmlElement(name = "RepresentativeName")
    protected String representativeName;
    @XmlElement(name = "BusinessTypeName")
    protected String businessTypeName;
    @XmlElement(name = "IndustryTypeName")
    protected String industryTypeName;
    @XmlElement(name = "RelatedSupplierInternalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String relatedSupplierInternalID;
    @XmlElement(name = "ReceiverRelatedSupplierInternalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String receiverRelatedSupplierInternalID;
    @XmlElement(name = "AccountingInformation")
    protected List<BPSUITERplctReqCustAcctgInfo> accountingInformation;
    @XmlElement(name = "SalesArrangement")
    protected List<BPSUITERplctReqSlsArrgmt> salesArrangement;
    @XmlElement(name = "UnloadingPoints")
    protected List<BPSUITERplctReqCustUnldgPts> unloadingPoints;
    @XmlElement(name = "TaxClassification")
    protected List<BPSUITERplctReqCustTaxClass> taxClassification;
    @XmlElement(name = "TaxGrouping")
    protected List<BPSUITERplctReqCustTxGrpg> taxGrouping;
    @XmlElement(name = "CustomerText")
    protected List<BPSUITERplctReqText> customerText;
    @XmlElement(name = "CustomerDocument")
    protected List<BPSUITERplctReqDoc> customerDocument;
    @XmlAttribute(name = "accountingInformationListCompleteTransmissionIndicator")
    protected Boolean accountingInformationListCompleteTransmissionIndicator;
    @XmlAttribute(name = "salesArrangementListCompleteTransmissionIndicator")
    protected Boolean salesArrangementListCompleteTransmissionIndicator;
    @XmlAttribute(name = "unloadingPointsListCompleteTransmissionIndicator")
    protected Boolean unloadingPointsListCompleteTransmissionIndicator;
    @XmlAttribute(name = "taxClassificationListCompleteTransmissionIndicator")
    protected Boolean taxClassificationListCompleteTransmissionIndicator;
    @XmlAttribute(name = "taxGroupingListCompleteTransmissionIndicator")
    protected Boolean taxGroupingListCompleteTransmissionIndicator;
    @XmlAttribute(name = "customerTextListCompleteTransmissionIndicator")
    protected Boolean customerTextListCompleteTransmissionIndicator;

    /**
     * Obtém o valor da propriedade internalID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalID() {
        return internalID;
    }

    /**
     * Define o valor da propriedade internalID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalID(String value) {
        this.internalID = value;
    }

    /**
     * Obtém o valor da propriedade receiverInternalID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverInternalID() {
        return receiverInternalID;
    }

    /**
     * Define o valor da propriedade receiverInternalID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverInternalID(String value) {
        this.receiverInternalID = value;
    }

    /**
     * Obtém o valor da propriedade maintenanceProfileCode.
     * 
     * @return
     *     possible object is
     *     {@link BusinessPartnerMaintenanceProfileCode }
     *     
     */
    public BusinessPartnerMaintenanceProfileCode getMaintenanceProfileCode() {
        return maintenanceProfileCode;
    }

    /**
     * Define o valor da propriedade maintenanceProfileCode.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessPartnerMaintenanceProfileCode }
     *     
     */
    public void setMaintenanceProfileCode(BusinessPartnerMaintenanceProfileCode value) {
        this.maintenanceProfileCode = value;
    }

    /**
     * Obtém o valor da propriedade authorisationGroupCode.
     * 
     * @return
     *     possible object is
     *     {@link AuthorisationGroupCode }
     *     
     */
    public AuthorisationGroupCode getAuthorisationGroupCode() {
        return authorisationGroupCode;
    }

    /**
     * Define o valor da propriedade authorisationGroupCode.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorisationGroupCode }
     *     
     */
    public void setAuthorisationGroupCode(AuthorisationGroupCode value) {
        this.authorisationGroupCode = value;
    }

    /**
     * Obtém o valor da propriedade expressTrainStationLocationName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpressTrainStationLocationName() {
        return expressTrainStationLocationName;
    }

    /**
     * Define o valor da propriedade expressTrainStationLocationName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpressTrainStationLocationName(String value) {
        this.expressTrainStationLocationName = value;
    }

    /**
     * Obtém o valor da propriedade trainStationLocationName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainStationLocationName() {
        return trainStationLocationName;
    }

    /**
     * Define o valor da propriedade trainStationLocationName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainStationLocationName(String value) {
        this.trainStationLocationName = value;
    }

    /**
     * Obtém o valor da propriedade customerPartyWithFiscalAddressInternalID.
     * 
     * @return
     *     possible object is
     *     {@link PartyInternalID }
     *     
     */
    public PartyInternalID getCustomerPartyWithFiscalAddressInternalID() {
        return customerPartyWithFiscalAddressInternalID;
    }

    /**
     * Define o valor da propriedade customerPartyWithFiscalAddressInternalID.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyInternalID }
     *     
     */
    public void setCustomerPartyWithFiscalAddressInternalID(PartyInternalID value) {
        this.customerPartyWithFiscalAddressInternalID = value;
    }

    /**
     * Obtém o valor da propriedade receiverCustomerPartyWithFiscalAddressInternalID.
     * 
     * @return
     *     possible object is
     *     {@link PartyInternalID }
     *     
     */
    public PartyInternalID getReceiverCustomerPartyWithFiscalAddressInternalID() {
        return receiverCustomerPartyWithFiscalAddressInternalID;
    }

    /**
     * Define o valor da propriedade receiverCustomerPartyWithFiscalAddressInternalID.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyInternalID }
     *     
     */
    public void setReceiverCustomerPartyWithFiscalAddressInternalID(PartyInternalID value) {
        this.receiverCustomerPartyWithFiscalAddressInternalID = value;
    }

    /**
     * Obtém o valor da propriedade alternativePayeePartyInternalID.
     * 
     * @return
     *     possible object is
     *     {@link PartyInternalID }
     *     
     */
    public PartyInternalID getAlternativePayeePartyInternalID() {
        return alternativePayeePartyInternalID;
    }

    /**
     * Define o valor da propriedade alternativePayeePartyInternalID.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyInternalID }
     *     
     */
    public void setAlternativePayeePartyInternalID(PartyInternalID value) {
        this.alternativePayeePartyInternalID = value;
    }

    /**
     * Obtém o valor da propriedade receiverAlternativePayeePartyInternalID.
     * 
     * @return
     *     possible object is
     *     {@link PartyInternalID }
     *     
     */
    public PartyInternalID getReceiverAlternativePayeePartyInternalID() {
        return receiverAlternativePayeePartyInternalID;
    }

    /**
     * Define o valor da propriedade receiverAlternativePayeePartyInternalID.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyInternalID }
     *     
     */
    public void setReceiverAlternativePayeePartyInternalID(PartyInternalID value) {
        this.receiverAlternativePayeePartyInternalID = value;
    }

    /**
     * Obtém o valor da propriedade alternativePayeeAllowedIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlternativePayeeAllowedIndicator() {
        return alternativePayeeAllowedIndicator;
    }

    /**
     * Define o valor da propriedade alternativePayeeAllowedIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlternativePayeeAllowedIndicator(Boolean value) {
        this.alternativePayeeAllowedIndicator = value;
    }

    /**
     * Obtém o valor da propriedade corporateGroupName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporateGroupName() {
        return corporateGroupName;
    }

    /**
     * Define o valor da propriedade corporateGroupName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporateGroupName(String value) {
        this.corporateGroupName = value;
    }

    /**
     * Obtém o valor da propriedade standardPointLocationCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardPointLocationCode() {
        return standardPointLocationCode;
    }

    /**
     * Define o valor da propriedade standardPointLocationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardPointLocationCode(String value) {
        this.standardPointLocationCode = value;
    }

    /**
     * Obtém o valor da propriedade deletionBlockedIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeletionBlockedIndicator() {
        return deletionBlockedIndicator;
    }

    /**
     * Define o valor da propriedade deletionBlockedIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeletionBlockedIndicator(Boolean value) {
        this.deletionBlockedIndicator = value;
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
     * Obtém o valor da propriedade countyCode.
     * 
     * @return
     *     possible object is
     *     {@link CountyCode }
     *     
     */
    public CountyCode getCountyCode() {
        return countyCode;
    }

    /**
     * Define o valor da propriedade countyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CountyCode }
     *     
     */
    public void setCountyCode(CountyCode value) {
        this.countyCode = value;
    }

    /**
     * Obtém o valor da propriedade cityCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getCityCode() {
        return cityCode;
    }

    /**
     * Define o valor da propriedade cityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setCityCode(Code value) {
        this.cityCode = value;
    }

    /**
     * Obtém o valor da propriedade postingBlockedIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPostingBlockedIndicator() {
        return postingBlockedIndicator;
    }

    /**
     * Define o valor da propriedade postingBlockedIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPostingBlockedIndicator(Boolean value) {
        this.postingBlockedIndicator = value;
    }

    /**
     * Obtém o valor da propriedade equalizationTaxRelevanceIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEqualizationTaxRelevanceIndicator() {
        return equalizationTaxRelevanceIndicator;
    }

    /**
     * Define o valor da propriedade equalizationTaxRelevanceIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEqualizationTaxRelevanceIndicator(Boolean value) {
        this.equalizationTaxRelevanceIndicator = value;
    }

    /**
     * Obtém o valor da propriedade valueAddedTaxRelevanceIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValueAddedTaxRelevanceIndicator() {
        return valueAddedTaxRelevanceIndicator;
    }

    /**
     * Define o valor da propriedade valueAddedTaxRelevanceIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValueAddedTaxRelevanceIndicator(Boolean value) {
        this.valueAddedTaxRelevanceIndicator = value;
    }

    /**
     * Obtém o valor da propriedade tradingPartnerCompanyID.
     * 
     * @return
     *     possible object is
     *     {@link CompanyID }
     *     
     */
    public CompanyID getTradingPartnerCompanyID() {
        return tradingPartnerCompanyID;
    }

    /**
     * Define o valor da propriedade tradingPartnerCompanyID.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyID }
     *     
     */
    public void setTradingPartnerCompanyID(CompanyID value) {
        this.tradingPartnerCompanyID = value;
    }

    /**
     * Obtém o valor da propriedade taxGroupCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getTaxGroupCode() {
        return taxGroupCode;
    }

    /**
     * Define o valor da propriedade taxGroupCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setTaxGroupCode(Code value) {
        this.taxGroupCode = value;
    }

    /**
     * Obtém o valor da propriedade icmsExemptionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isICMSExemptionIndicator() {
        return icmsExemptionIndicator;
    }

    /**
     * Define o valor da propriedade icmsExemptionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setICMSExemptionIndicator(Boolean value) {
        this.icmsExemptionIndicator = value;
    }

    /**
     * Obtém o valor da propriedade ipiExemptionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIPIExemptionIndicator() {
        return ipiExemptionIndicator;
    }

    /**
     * Define o valor da propriedade ipiExemptionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIPIExemptionIndicator(Boolean value) {
        this.ipiExemptionIndicator = value;
    }

    /**
     * Obtém o valor da propriedade taxSubstitutionGroupCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getTaxSubstitutionGroupCode() {
        return taxSubstitutionGroupCode;
    }

    /**
     * Define o valor da propriedade taxSubstitutionGroupCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setTaxSubstitutionGroupCode(Code value) {
        this.taxSubstitutionGroupCode = value;
    }

    /**
     * Obtém o valor da propriedade cfopCategoryCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getCFOPCategoryCode() {
        return cfopCategoryCode;
    }

    /**
     * Define o valor da propriedade cfopCategoryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setCFOPCategoryCode(Code value) {
        this.cfopCategoryCode = value;
    }

    /**
     * Obtém o valor da propriedade saleSalesAndDistributionBlocks.
     * 
     * @return
     *     possible object is
     *     {@link BPSUITERplctReqSalesAndDistrBlocks }
     *     
     */
    public BPSUITERplctReqSalesAndDistrBlocks getSaleSalesAndDistributionBlocks() {
        return saleSalesAndDistributionBlocks;
    }

    /**
     * Define o valor da propriedade saleSalesAndDistributionBlocks.
     * 
     * @param value
     *     allowed object is
     *     {@link BPSUITERplctReqSalesAndDistrBlocks }
     *     
     */
    public void setSaleSalesAndDistributionBlocks(BPSUITERplctReqSalesAndDistrBlocks value) {
        this.saleSalesAndDistributionBlocks = value;
    }

    /**
     * Obtém o valor da propriedade industrySector.
     * 
     * @return
     *     possible object is
     *     {@link BPSUITERplctReqCustIndstrySectr }
     *     
     */
    public BPSUITERplctReqCustIndstrySectr getIndustrySector() {
        return industrySector;
    }

    /**
     * Define o valor da propriedade industrySector.
     * 
     * @param value
     *     allowed object is
     *     {@link BPSUITERplctReqCustIndstrySectr }
     *     
     */
    public void setIndustrySector(BPSUITERplctReqCustIndstrySectr value) {
        this.industrySector = value;
    }

    /**
     * Obtém o valor da propriedade marketingAttributes.
     * 
     * @return
     *     possible object is
     *     {@link BPSUITERplctReqMktgAttribs }
     *     
     */
    public BPSUITERplctReqMktgAttribs getMarketingAttributes() {
        return marketingAttributes;
    }

    /**
     * Define o valor da propriedade marketingAttributes.
     * 
     * @param value
     *     allowed object is
     *     {@link BPSUITERplctReqMktgAttribs }
     *     
     */
    public void setMarketingAttributes(BPSUITERplctReqMktgAttribs value) {
        this.marketingAttributes = value;
    }

    /**
     * Obtém o valor da propriedade customerExtensionCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getCustomerExtensionCode() {
        return customerExtensionCode;
    }

    /**
     * Define o valor da propriedade customerExtensionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setCustomerExtensionCode(Code value) {
        this.customerExtensionCode = value;
    }

    /**
     * Obtém o valor da propriedade firstAdditionalCustomerExtensionCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getFirstAdditionalCustomerExtensionCode() {
        return firstAdditionalCustomerExtensionCode;
    }

    /**
     * Define o valor da propriedade firstAdditionalCustomerExtensionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setFirstAdditionalCustomerExtensionCode(Code value) {
        this.firstAdditionalCustomerExtensionCode = value;
    }

    /**
     * Obtém o valor da propriedade secondAdditionalCustomerExtensionCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getSecondAdditionalCustomerExtensionCode() {
        return secondAdditionalCustomerExtensionCode;
    }

    /**
     * Define o valor da propriedade secondAdditionalCustomerExtensionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setSecondAdditionalCustomerExtensionCode(Code value) {
        this.secondAdditionalCustomerExtensionCode = value;
    }

    /**
     * Obtém o valor da propriedade thirdAdditionalCustomerExtensionCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getThirdAdditionalCustomerExtensionCode() {
        return thirdAdditionalCustomerExtensionCode;
    }

    /**
     * Define o valor da propriedade thirdAdditionalCustomerExtensionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setThirdAdditionalCustomerExtensionCode(Code value) {
        this.thirdAdditionalCustomerExtensionCode = value;
    }

    /**
     * Obtém o valor da propriedade fourthAdditionalCustomerExtensionCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getFourthAdditionalCustomerExtensionCode() {
        return fourthAdditionalCustomerExtensionCode;
    }

    /**
     * Define o valor da propriedade fourthAdditionalCustomerExtensionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setFourthAdditionalCustomerExtensionCode(Code value) {
        this.fourthAdditionalCustomerExtensionCode = value;
    }

    /**
     * Obtém o valor da propriedade fifthAdditionalCustomerExtensionCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getFifthAdditionalCustomerExtensionCode() {
        return fifthAdditionalCustomerExtensionCode;
    }

    /**
     * Define o valor da propriedade fifthAdditionalCustomerExtensionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setFifthAdditionalCustomerExtensionCode(Code value) {
        this.fifthAdditionalCustomerExtensionCode = value;
    }

    /**
     * Obtém o valor da propriedade sixthAdditionalCustomerExtensionCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getSixthAdditionalCustomerExtensionCode() {
        return sixthAdditionalCustomerExtensionCode;
    }

    /**
     * Define o valor da propriedade sixthAdditionalCustomerExtensionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setSixthAdditionalCustomerExtensionCode(Code value) {
        this.sixthAdditionalCustomerExtensionCode = value;
    }

    /**
     * Obtém o valor da propriedade seventhAdditionalCustomerExtensionCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getSeventhAdditionalCustomerExtensionCode() {
        return seventhAdditionalCustomerExtensionCode;
    }

    /**
     * Define o valor da propriedade seventhAdditionalCustomerExtensionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setSeventhAdditionalCustomerExtensionCode(Code value) {
        this.seventhAdditionalCustomerExtensionCode = value;
    }

    /**
     * Obtém o valor da propriedade eighthAdditionalCustomerExtensionCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getEighthAdditionalCustomerExtensionCode() {
        return eighthAdditionalCustomerExtensionCode;
    }

    /**
     * Define o valor da propriedade eighthAdditionalCustomerExtensionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setEighthAdditionalCustomerExtensionCode(Code value) {
        this.eighthAdditionalCustomerExtensionCode = value;
    }

    /**
     * Obtém o valor da propriedade ninthAdditionalCustomerExtensionCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getNinthAdditionalCustomerExtensionCode() {
        return ninthAdditionalCustomerExtensionCode;
    }

    /**
     * Define o valor da propriedade ninthAdditionalCustomerExtensionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setNinthAdditionalCustomerExtensionCode(Code value) {
        this.ninthAdditionalCustomerExtensionCode = value;
    }

    /**
     * Obtém o valor da propriedade dataMediumExchangeReportCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getDataMediumExchangeReportCode() {
        return dataMediumExchangeReportCode;
    }

    /**
     * Define o valor da propriedade dataMediumExchangeReportCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setDataMediumExchangeReportCode(Code value) {
        this.dataMediumExchangeReportCode = value;
    }

    /**
     * Obtém o valor da propriedade dataMediumExchangeInstructionCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getDataMediumExchangeInstructionCode() {
        return dataMediumExchangeInstructionCode;
    }

    /**
     * Define o valor da propriedade dataMediumExchangeInstructionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setDataMediumExchangeInstructionCode(Code value) {
        this.dataMediumExchangeInstructionCode = value;
    }

    /**
     * Obtém o valor da propriedade civilUseIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCivilUseIndicator() {
        return civilUseIndicator;
    }

    /**
     * Define o valor da propriedade civilUseIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCivilUseIndicator(Boolean value) {
        this.civilUseIndicator = value;
    }

    /**
     * Obtém o valor da propriedade militaryUseIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMilitaryUseIndicator() {
        return militaryUseIndicator;
    }

    /**
     * Define o valor da propriedade militaryUseIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMilitaryUseIndicator(Boolean value) {
        this.militaryUseIndicator = value;
    }

    /**
     * Obtém o valor da propriedade legalControlIndicators.
     * 
     * @return
     *     possible object is
     *     {@link BPSUITERplctReqLegalCtrlInds }
     *     
     */
    public BPSUITERplctReqLegalCtrlInds getLegalControlIndicators() {
        return legalControlIndicators;
    }

    /**
     * Define o valor da propriedade legalControlIndicators.
     * 
     * @param value
     *     allowed object is
     *     {@link BPSUITERplctReqLegalCtrlInds }
     *     
     */
    public void setLegalControlIndicators(BPSUITERplctReqLegalCtrlInds value) {
        this.legalControlIndicators = value;
    }

    /**
     * Obtém o valor da propriedade priceSpecifications.
     * 
     * @return
     *     possible object is
     *     {@link BPSUITERplctReqPrSpecs }
     *     
     */
    public BPSUITERplctReqPrSpecs getPriceSpecifications() {
        return priceSpecifications;
    }

    /**
     * Define o valor da propriedade priceSpecifications.
     * 
     * @param value
     *     allowed object is
     *     {@link BPSUITERplctReqPrSpecs }
     *     
     */
    public void setPriceSpecifications(BPSUITERplctReqPrSpecs value) {
        this.priceSpecifications = value;
    }

    /**
     * Obtém o valor da propriedade representativeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepresentativeName() {
        return representativeName;
    }

    /**
     * Define o valor da propriedade representativeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepresentativeName(String value) {
        this.representativeName = value;
    }

    /**
     * Obtém o valor da propriedade businessTypeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessTypeName() {
        return businessTypeName;
    }

    /**
     * Define o valor da propriedade businessTypeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessTypeName(String value) {
        this.businessTypeName = value;
    }

    /**
     * Obtém o valor da propriedade industryTypeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustryTypeName() {
        return industryTypeName;
    }

    /**
     * Define o valor da propriedade industryTypeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustryTypeName(String value) {
        this.industryTypeName = value;
    }

    /**
     * Obtém o valor da propriedade relatedSupplierInternalID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedSupplierInternalID() {
        return relatedSupplierInternalID;
    }

    /**
     * Define o valor da propriedade relatedSupplierInternalID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedSupplierInternalID(String value) {
        this.relatedSupplierInternalID = value;
    }

    /**
     * Obtém o valor da propriedade receiverRelatedSupplierInternalID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverRelatedSupplierInternalID() {
        return receiverRelatedSupplierInternalID;
    }

    /**
     * Define o valor da propriedade receiverRelatedSupplierInternalID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverRelatedSupplierInternalID(String value) {
        this.receiverRelatedSupplierInternalID = value;
    }

    /**
     * Gets the value of the accountingInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountingInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountingInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPSUITERplctReqCustAcctgInfo }
     * 
     * 
     */
    public List<BPSUITERplctReqCustAcctgInfo> getAccountingInformation() {
        if (accountingInformation == null) {
            accountingInformation = new ArrayList<BPSUITERplctReqCustAcctgInfo>();
        }
        return this.accountingInformation;
    }

    /**
     * Gets the value of the salesArrangement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesArrangement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesArrangement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPSUITERplctReqSlsArrgmt }
     * 
     * 
     */
    public List<BPSUITERplctReqSlsArrgmt> getSalesArrangement() {
        if (salesArrangement == null) {
            salesArrangement = new ArrayList<BPSUITERplctReqSlsArrgmt>();
        }
        return this.salesArrangement;
    }

    /**
     * Gets the value of the unloadingPoints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unloadingPoints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnloadingPoints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPSUITERplctReqCustUnldgPts }
     * 
     * 
     */
    public List<BPSUITERplctReqCustUnldgPts> getUnloadingPoints() {
        if (unloadingPoints == null) {
            unloadingPoints = new ArrayList<BPSUITERplctReqCustUnldgPts>();
        }
        return this.unloadingPoints;
    }

    /**
     * Gets the value of the taxClassification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxClassification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPSUITERplctReqCustTaxClass }
     * 
     * 
     */
    public List<BPSUITERplctReqCustTaxClass> getTaxClassification() {
        if (taxClassification == null) {
            taxClassification = new ArrayList<BPSUITERplctReqCustTaxClass>();
        }
        return this.taxClassification;
    }

    /**
     * Gets the value of the taxGrouping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxGrouping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxGrouping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPSUITERplctReqCustTxGrpg }
     * 
     * 
     */
    public List<BPSUITERplctReqCustTxGrpg> getTaxGrouping() {
        if (taxGrouping == null) {
            taxGrouping = new ArrayList<BPSUITERplctReqCustTxGrpg>();
        }
        return this.taxGrouping;
    }

    /**
     * Gets the value of the customerText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPSUITERplctReqText }
     * 
     * 
     */
    public List<BPSUITERplctReqText> getCustomerText() {
        if (customerText == null) {
            customerText = new ArrayList<BPSUITERplctReqText>();
        }
        return this.customerText;
    }

    /**
     * Gets the value of the customerDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPSUITERplctReqDoc }
     * 
     * 
     */
    public List<BPSUITERplctReqDoc> getCustomerDocument() {
        if (customerDocument == null) {
            customerDocument = new ArrayList<BPSUITERplctReqDoc>();
        }
        return this.customerDocument;
    }

    /**
     * Obtém o valor da propriedade accountingInformationListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccountingInformationListCompleteTransmissionIndicator() {
        return accountingInformationListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade accountingInformationListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccountingInformationListCompleteTransmissionIndicator(Boolean value) {
        this.accountingInformationListCompleteTransmissionIndicator = value;
    }

    /**
     * Obtém o valor da propriedade salesArrangementListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSalesArrangementListCompleteTransmissionIndicator() {
        return salesArrangementListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade salesArrangementListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSalesArrangementListCompleteTransmissionIndicator(Boolean value) {
        this.salesArrangementListCompleteTransmissionIndicator = value;
    }

    /**
     * Obtém o valor da propriedade unloadingPointsListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnloadingPointsListCompleteTransmissionIndicator() {
        return unloadingPointsListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade unloadingPointsListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnloadingPointsListCompleteTransmissionIndicator(Boolean value) {
        this.unloadingPointsListCompleteTransmissionIndicator = value;
    }

    /**
     * Obtém o valor da propriedade taxClassificationListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxClassificationListCompleteTransmissionIndicator() {
        return taxClassificationListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade taxClassificationListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxClassificationListCompleteTransmissionIndicator(Boolean value) {
        this.taxClassificationListCompleteTransmissionIndicator = value;
    }

    /**
     * Obtém o valor da propriedade taxGroupingListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxGroupingListCompleteTransmissionIndicator() {
        return taxGroupingListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade taxGroupingListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxGroupingListCompleteTransmissionIndicator(Boolean value) {
        this.taxGroupingListCompleteTransmissionIndicator = value;
    }

    /**
     * Obtém o valor da propriedade customerTextListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomerTextListCompleteTransmissionIndicator() {
        return customerTextListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade customerTextListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomerTextListCompleteTransmissionIndicator(Boolean value) {
        this.customerTextListCompleteTransmissionIndicator = value;
    }

}
