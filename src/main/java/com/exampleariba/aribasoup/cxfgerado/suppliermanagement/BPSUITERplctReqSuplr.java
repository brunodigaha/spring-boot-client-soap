
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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de BPSUITERplctReqSuplr complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPSUITERplctReqSuplr"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InternalID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverInternalID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="CreditorInformationNumber" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="MaintenanceProfileCode" type="{http://ariba.com/xi/SupplierManagement}BusinessPartnerMaintenanceProfileCode" minOccurs="0"/&gt;
 *         &lt;element name="ProcurementTransactionBlockingCode" type="{http://ariba.com/xi/SupplierManagement}SupplierProcurementTransactionBlockingCode" minOccurs="0"/&gt;
 *         &lt;element name="DeletionBlockedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DeletedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PostingBlockedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PurchasingBlockedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TradingPartnerCompanyID" type="{http://ariba.com/xi/SupplierManagement}CompanyID" minOccurs="0"/&gt;
 *         &lt;element name="ManufacturerPartyID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="AuthorisationGroupCode" type="{http://ariba.com/xi/SupplierManagement}AuthorisationGroupCode" minOccurs="0"/&gt;
 *         &lt;element name="CorporateGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProofOfDeliveryRequirementCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="CreditDataLastCheckDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="TrainStationLocationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataMediumExchangeReportCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="DataMediumExchangeInstructionCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="InpaymentSlipWithReferenceNumberSubscriberID" type="{http://ariba.com/xi/SupplierManagement}Identifier" minOccurs="0"/&gt;
 *         &lt;element name="AlternativePayeePartyInternalID" type="{http://ariba.com/xi/SupplierManagement}PartyInternalID" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverAlternativePayeePartyInternalID" type="{http://ariba.com/xi/SupplierManagement}PartyInternalID" minOccurs="0"/&gt;
 *         &lt;element name="AlternativePayeeAllowedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EqualizationTaxRelevanceIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ValueAddedTaxRelevanceIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FiscalAddressPartyInternalID" type="{http://ariba.com/xi/SupplierManagement}PartyInternalID" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverFiscalAddressPartyInternalID" type="{http://ariba.com/xi/SupplierManagement}PartyInternalID" minOccurs="0"/&gt;
 *         &lt;element name="SupplyingPlantID" type="{http://ariba.com/xi/SupplierManagement}PlantID" minOccurs="0"/&gt;
 *         &lt;element name="SellerAssortmentProductGroupLevelRelevanceIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlantLevelRelevanceIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorkingDayCalendarCode" type="{http://ariba.com/xi/SupplierManagement}WorkingDayCalendarCode" minOccurs="0"/&gt;
 *         &lt;element name="CarrierPartyStandardID" type="{http://ariba.com/xi/SupplierManagement}PartyStandardID" minOccurs="0"/&gt;
 *         &lt;element name="CarrierPartyFreightGroupCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="ServicePerformerPartyGroupCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="StatisticsGroupCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="TaxAuthorityPartyID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="TaxGroupCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="SocialInsuranceActivityCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="ForSocialInsuranceRegisteredIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TaxSplitIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TaxBasePercentageCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="ResponsibleTaxOfficePartyInternalID" type="{http://ariba.com/xi/SupplierManagement}PartyInternalID" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverResponsibleTaxOfficePartyInternalID" type="{http://ariba.com/xi/SupplierManagement}PartyInternalID" minOccurs="0"/&gt;
 *         &lt;element name="RepresentativeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BusinessTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IndustryTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RelatedCustomerInternalID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverRelatedCustomerInternalID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="AccountingInformation" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqAcctgInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BiddingCharacteristic" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqBiddingCharc" minOccurs="0"/&gt;
 *         &lt;element name="ProcurementCardIssuingInstitutes" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqProcmtCardIssuingInstitutes" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="QualityManagement" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqQltyMgmt" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProcurementArrangement" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqProcmtArrgmt" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SubRange" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqSubRnge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TaxGrouping" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqTxGrpg" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SupplierText" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SupplierDocument" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqDoc" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GenericCustomField" type="{http://ariba.com/xi/SupplierManagement}GenericCustomField" maxOccurs="unbounded" minOccurs="0" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="accountingInformationListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="biddingCharacteristicListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="procurementCardIssuingInstitutesListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="qualitiyManagementListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="procurementArrangementListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="subRangeListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="taxGroupingListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="supplierTextListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute ref="{http://ariba.com/xi/SupplierManagement}genericCustomFieldListCompleteTransmissionIndicator"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BPSUITERplctReqSuplr", propOrder = {
    "internalID",
    "receiverInternalID",
    "creditorInformationNumber",
    "maintenanceProfileCode",
    "procurementTransactionBlockingCode",
    "deletionBlockedIndicator",
    "deletedIndicator",
    "postingBlockedIndicator",
    "purchasingBlockedIndicator",
    "tradingPartnerCompanyID",
    "manufacturerPartyID",
    "authorisationGroupCode",
    "corporateGroupName",
    "proofOfDeliveryRequirementCode",
    "creditDataLastCheckDate",
    "trainStationLocationName",
    "dataMediumExchangeReportCode",
    "dataMediumExchangeInstructionCode",
    "inpaymentSlipWithReferenceNumberSubscriberID",
    "alternativePayeePartyInternalID",
    "receiverAlternativePayeePartyInternalID",
    "alternativePayeeAllowedIndicator",
    "equalizationTaxRelevanceIndicator",
    "valueAddedTaxRelevanceIndicator",
    "fiscalAddressPartyInternalID",
    "receiverFiscalAddressPartyInternalID",
    "supplyingPlantID",
    "sellerAssortmentProductGroupLevelRelevanceIndicator",
    "plantLevelRelevanceIndicator",
    "workingDayCalendarCode",
    "carrierPartyStandardID",
    "carrierPartyFreightGroupCode",
    "servicePerformerPartyGroupCode",
    "statisticsGroupCode",
    "taxAuthorityPartyID",
    "taxGroupCode",
    "socialInsuranceActivityCode",
    "forSocialInsuranceRegisteredIndicator",
    "taxSplitIndicator",
    "taxBasePercentageCode",
    "responsibleTaxOfficePartyInternalID",
    "receiverResponsibleTaxOfficePartyInternalID",
    "representativeName",
    "businessTypeName",
    "industryTypeName",
    "relatedCustomerInternalID",
    "receiverRelatedCustomerInternalID",
    "accountingInformation",
    "biddingCharacteristic",
    "procurementCardIssuingInstitutes",
    "qualityManagement",
    "procurementArrangement",
    "subRange",
    "taxGrouping",
    "supplierText",
    "supplierDocument",
    "genericCustomField"
})
public class BPSUITERplctReqSuplr {

    @XmlElement(name = "InternalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String internalID;
    @XmlElement(name = "ReceiverInternalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String receiverInternalID;
    @XmlElement(name = "CreditorInformationNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String creditorInformationNumber;
    @XmlElement(name = "MaintenanceProfileCode")
    protected BusinessPartnerMaintenanceProfileCode maintenanceProfileCode;
    @XmlElement(name = "ProcurementTransactionBlockingCode")
    protected SupplierProcurementTransactionBlockingCode procurementTransactionBlockingCode;
    @XmlElement(name = "DeletionBlockedIndicator")
    protected Boolean deletionBlockedIndicator;
    @XmlElement(name = "DeletedIndicator")
    protected Boolean deletedIndicator;
    @XmlElement(name = "PostingBlockedIndicator")
    protected Boolean postingBlockedIndicator;
    @XmlElement(name = "PurchasingBlockedIndicator")
    protected Boolean purchasingBlockedIndicator;
    @XmlElement(name = "TradingPartnerCompanyID")
    protected CompanyID tradingPartnerCompanyID;
    @XmlElement(name = "ManufacturerPartyID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String manufacturerPartyID;
    @XmlElement(name = "AuthorisationGroupCode")
    protected AuthorisationGroupCode authorisationGroupCode;
    @XmlElement(name = "CorporateGroupName")
    protected String corporateGroupName;
    @XmlElement(name = "ProofOfDeliveryRequirementCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String proofOfDeliveryRequirementCode;
    @XmlElement(name = "CreditDataLastCheckDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar creditDataLastCheckDate;
    @XmlElement(name = "TrainStationLocationName")
    protected String trainStationLocationName;
    @XmlElement(name = "DataMediumExchangeReportCode")
    protected Code dataMediumExchangeReportCode;
    @XmlElement(name = "DataMediumExchangeInstructionCode")
    protected Code dataMediumExchangeInstructionCode;
    @XmlElement(name = "InpaymentSlipWithReferenceNumberSubscriberID")
    protected Identifier inpaymentSlipWithReferenceNumberSubscriberID;
    @XmlElement(name = "AlternativePayeePartyInternalID")
    protected PartyInternalID alternativePayeePartyInternalID;
    @XmlElement(name = "ReceiverAlternativePayeePartyInternalID")
    protected PartyInternalID receiverAlternativePayeePartyInternalID;
    @XmlElement(name = "AlternativePayeeAllowedIndicator")
    protected Boolean alternativePayeeAllowedIndicator;
    @XmlElement(name = "EqualizationTaxRelevanceIndicator")
    protected Boolean equalizationTaxRelevanceIndicator;
    @XmlElement(name = "ValueAddedTaxRelevanceIndicator")
    protected Boolean valueAddedTaxRelevanceIndicator;
    @XmlElement(name = "FiscalAddressPartyInternalID")
    protected PartyInternalID fiscalAddressPartyInternalID;
    @XmlElement(name = "ReceiverFiscalAddressPartyInternalID")
    protected PartyInternalID receiverFiscalAddressPartyInternalID;
    @XmlElement(name = "SupplyingPlantID")
    protected PlantID supplyingPlantID;
    @XmlElement(name = "SellerAssortmentProductGroupLevelRelevanceIndicator")
    protected Boolean sellerAssortmentProductGroupLevelRelevanceIndicator;
    @XmlElement(name = "PlantLevelRelevanceIndicator")
    protected Boolean plantLevelRelevanceIndicator;
    @XmlElement(name = "WorkingDayCalendarCode")
    protected WorkingDayCalendarCode workingDayCalendarCode;
    @XmlElement(name = "CarrierPartyStandardID")
    protected PartyStandardID carrierPartyStandardID;
    @XmlElement(name = "CarrierPartyFreightGroupCode")
    protected Code carrierPartyFreightGroupCode;
    @XmlElement(name = "ServicePerformerPartyGroupCode")
    protected Code servicePerformerPartyGroupCode;
    @XmlElement(name = "StatisticsGroupCode")
    protected Code statisticsGroupCode;
    @XmlElement(name = "TaxAuthorityPartyID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String taxAuthorityPartyID;
    @XmlElement(name = "TaxGroupCode")
    protected Code taxGroupCode;
    @XmlElement(name = "SocialInsuranceActivityCode")
    protected Code socialInsuranceActivityCode;
    @XmlElement(name = "ForSocialInsuranceRegisteredIndicator")
    protected Boolean forSocialInsuranceRegisteredIndicator;
    @XmlElement(name = "TaxSplitIndicator")
    protected Boolean taxSplitIndicator;
    @XmlElement(name = "TaxBasePercentageCode")
    protected Code taxBasePercentageCode;
    @XmlElement(name = "ResponsibleTaxOfficePartyInternalID")
    protected PartyInternalID responsibleTaxOfficePartyInternalID;
    @XmlElement(name = "ReceiverResponsibleTaxOfficePartyInternalID")
    protected PartyInternalID receiverResponsibleTaxOfficePartyInternalID;
    @XmlElement(name = "RepresentativeName")
    protected String representativeName;
    @XmlElement(name = "BusinessTypeName")
    protected String businessTypeName;
    @XmlElement(name = "IndustryTypeName")
    protected String industryTypeName;
    @XmlElement(name = "RelatedCustomerInternalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String relatedCustomerInternalID;
    @XmlElement(name = "ReceiverRelatedCustomerInternalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String receiverRelatedCustomerInternalID;
    @XmlElement(name = "AccountingInformation")
    protected List<BPSUITERplctReqAcctgInfo> accountingInformation;
    @XmlElement(name = "BiddingCharacteristic")
    protected BPSUITERplctReqBiddingCharc biddingCharacteristic;
    @XmlElement(name = "ProcurementCardIssuingInstitutes")
    protected List<BPSUITERplctReqProcmtCardIssuingInstitutes> procurementCardIssuingInstitutes;
    @XmlElement(name = "QualityManagement")
    protected List<BPSUITERplctReqQltyMgmt> qualityManagement;
    @XmlElement(name = "ProcurementArrangement")
    protected List<BPSUITERplctReqProcmtArrgmt> procurementArrangement;
    @XmlElement(name = "SubRange")
    protected List<BPSUITERplctReqSubRnge> subRange;
    @XmlElement(name = "TaxGrouping")
    protected List<BPSUITERplctReqTxGrpg> taxGrouping;
    @XmlElement(name = "SupplierText")
    protected List<BPSUITERplctReqText> supplierText;
    @XmlElement(name = "SupplierDocument")
    protected List<BPSUITERplctReqDoc> supplierDocument;
    @XmlElement(name = "GenericCustomField", namespace = "http://ariba.com/xi/SupplierManagement")
    protected List<GenericCustomField> genericCustomField;
    @XmlAttribute(name = "accountingInformationListCompleteTransmissionIndicator")
    protected Boolean accountingInformationListCompleteTransmissionIndicator;
    @XmlAttribute(name = "biddingCharacteristicListCompleteTransmissionIndicator")
    protected Boolean biddingCharacteristicListCompleteTransmissionIndicator;
    @XmlAttribute(name = "procurementCardIssuingInstitutesListCompleteTransmissionIndicator")
    protected Boolean procurementCardIssuingInstitutesListCompleteTransmissionIndicator;
    @XmlAttribute(name = "qualitiyManagementListCompleteTransmissionIndicator")
    protected Boolean qualitiyManagementListCompleteTransmissionIndicator;
    @XmlAttribute(name = "procurementArrangementListCompleteTransmissionIndicator")
    protected Boolean procurementArrangementListCompleteTransmissionIndicator;
    @XmlAttribute(name = "subRangeListCompleteTransmissionIndicator")
    protected Boolean subRangeListCompleteTransmissionIndicator;
    @XmlAttribute(name = "taxGroupingListCompleteTransmissionIndicator")
    protected Boolean taxGroupingListCompleteTransmissionIndicator;
    @XmlAttribute(name = "supplierTextListCompleteTransmissionIndicator")
    protected Boolean supplierTextListCompleteTransmissionIndicator;
    @XmlAttribute(name = "genericCustomFieldListCompleteTransmissionIndicator", namespace = "http://ariba.com/xi/SupplierManagement")
    protected String genericCustomFieldListCompleteTransmissionIndicator;

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
     * Obtém o valor da propriedade creditorInformationNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditorInformationNumber() {
        return creditorInformationNumber;
    }

    /**
     * Define o valor da propriedade creditorInformationNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditorInformationNumber(String value) {
        this.creditorInformationNumber = value;
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
     * Obtém o valor da propriedade procurementTransactionBlockingCode.
     * 
     * @return
     *     possible object is
     *     {@link SupplierProcurementTransactionBlockingCode }
     *     
     */
    public SupplierProcurementTransactionBlockingCode getProcurementTransactionBlockingCode() {
        return procurementTransactionBlockingCode;
    }

    /**
     * Define o valor da propriedade procurementTransactionBlockingCode.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierProcurementTransactionBlockingCode }
     *     
     */
    public void setProcurementTransactionBlockingCode(SupplierProcurementTransactionBlockingCode value) {
        this.procurementTransactionBlockingCode = value;
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
     * Obtém o valor da propriedade purchasingBlockedIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPurchasingBlockedIndicator() {
        return purchasingBlockedIndicator;
    }

    /**
     * Define o valor da propriedade purchasingBlockedIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPurchasingBlockedIndicator(Boolean value) {
        this.purchasingBlockedIndicator = value;
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
     * Obtém o valor da propriedade manufacturerPartyID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerPartyID() {
        return manufacturerPartyID;
    }

    /**
     * Define o valor da propriedade manufacturerPartyID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerPartyID(String value) {
        this.manufacturerPartyID = value;
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
     * Obtém o valor da propriedade proofOfDeliveryRequirementCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProofOfDeliveryRequirementCode() {
        return proofOfDeliveryRequirementCode;
    }

    /**
     * Define o valor da propriedade proofOfDeliveryRequirementCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProofOfDeliveryRequirementCode(String value) {
        this.proofOfDeliveryRequirementCode = value;
    }

    /**
     * Obtém o valor da propriedade creditDataLastCheckDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreditDataLastCheckDate() {
        return creditDataLastCheckDate;
    }

    /**
     * Define o valor da propriedade creditDataLastCheckDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreditDataLastCheckDate(XMLGregorianCalendar value) {
        this.creditDataLastCheckDate = value;
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
     * Obtém o valor da propriedade inpaymentSlipWithReferenceNumberSubscriberID.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getInpaymentSlipWithReferenceNumberSubscriberID() {
        return inpaymentSlipWithReferenceNumberSubscriberID;
    }

    /**
     * Define o valor da propriedade inpaymentSlipWithReferenceNumberSubscriberID.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setInpaymentSlipWithReferenceNumberSubscriberID(Identifier value) {
        this.inpaymentSlipWithReferenceNumberSubscriberID = value;
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
     * Obtém o valor da propriedade fiscalAddressPartyInternalID.
     * 
     * @return
     *     possible object is
     *     {@link PartyInternalID }
     *     
     */
    public PartyInternalID getFiscalAddressPartyInternalID() {
        return fiscalAddressPartyInternalID;
    }

    /**
     * Define o valor da propriedade fiscalAddressPartyInternalID.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyInternalID }
     *     
     */
    public void setFiscalAddressPartyInternalID(PartyInternalID value) {
        this.fiscalAddressPartyInternalID = value;
    }

    /**
     * Obtém o valor da propriedade receiverFiscalAddressPartyInternalID.
     * 
     * @return
     *     possible object is
     *     {@link PartyInternalID }
     *     
     */
    public PartyInternalID getReceiverFiscalAddressPartyInternalID() {
        return receiverFiscalAddressPartyInternalID;
    }

    /**
     * Define o valor da propriedade receiverFiscalAddressPartyInternalID.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyInternalID }
     *     
     */
    public void setReceiverFiscalAddressPartyInternalID(PartyInternalID value) {
        this.receiverFiscalAddressPartyInternalID = value;
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
     * Obtém o valor da propriedade sellerAssortmentProductGroupLevelRelevanceIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSellerAssortmentProductGroupLevelRelevanceIndicator() {
        return sellerAssortmentProductGroupLevelRelevanceIndicator;
    }

    /**
     * Define o valor da propriedade sellerAssortmentProductGroupLevelRelevanceIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSellerAssortmentProductGroupLevelRelevanceIndicator(Boolean value) {
        this.sellerAssortmentProductGroupLevelRelevanceIndicator = value;
    }

    /**
     * Obtém o valor da propriedade plantLevelRelevanceIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlantLevelRelevanceIndicator() {
        return plantLevelRelevanceIndicator;
    }

    /**
     * Define o valor da propriedade plantLevelRelevanceIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlantLevelRelevanceIndicator(Boolean value) {
        this.plantLevelRelevanceIndicator = value;
    }

    /**
     * Obtém o valor da propriedade workingDayCalendarCode.
     * 
     * @return
     *     possible object is
     *     {@link WorkingDayCalendarCode }
     *     
     */
    public WorkingDayCalendarCode getWorkingDayCalendarCode() {
        return workingDayCalendarCode;
    }

    /**
     * Define o valor da propriedade workingDayCalendarCode.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkingDayCalendarCode }
     *     
     */
    public void setWorkingDayCalendarCode(WorkingDayCalendarCode value) {
        this.workingDayCalendarCode = value;
    }

    /**
     * Obtém o valor da propriedade carrierPartyStandardID.
     * 
     * @return
     *     possible object is
     *     {@link PartyStandardID }
     *     
     */
    public PartyStandardID getCarrierPartyStandardID() {
        return carrierPartyStandardID;
    }

    /**
     * Define o valor da propriedade carrierPartyStandardID.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyStandardID }
     *     
     */
    public void setCarrierPartyStandardID(PartyStandardID value) {
        this.carrierPartyStandardID = value;
    }

    /**
     * Obtém o valor da propriedade carrierPartyFreightGroupCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getCarrierPartyFreightGroupCode() {
        return carrierPartyFreightGroupCode;
    }

    /**
     * Define o valor da propriedade carrierPartyFreightGroupCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setCarrierPartyFreightGroupCode(Code value) {
        this.carrierPartyFreightGroupCode = value;
    }

    /**
     * Obtém o valor da propriedade servicePerformerPartyGroupCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getServicePerformerPartyGroupCode() {
        return servicePerformerPartyGroupCode;
    }

    /**
     * Define o valor da propriedade servicePerformerPartyGroupCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setServicePerformerPartyGroupCode(Code value) {
        this.servicePerformerPartyGroupCode = value;
    }

    /**
     * Obtém o valor da propriedade statisticsGroupCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getStatisticsGroupCode() {
        return statisticsGroupCode;
    }

    /**
     * Define o valor da propriedade statisticsGroupCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setStatisticsGroupCode(Code value) {
        this.statisticsGroupCode = value;
    }

    /**
     * Obtém o valor da propriedade taxAuthorityPartyID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxAuthorityPartyID() {
        return taxAuthorityPartyID;
    }

    /**
     * Define o valor da propriedade taxAuthorityPartyID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxAuthorityPartyID(String value) {
        this.taxAuthorityPartyID = value;
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
     * Obtém o valor da propriedade socialInsuranceActivityCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getSocialInsuranceActivityCode() {
        return socialInsuranceActivityCode;
    }

    /**
     * Define o valor da propriedade socialInsuranceActivityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setSocialInsuranceActivityCode(Code value) {
        this.socialInsuranceActivityCode = value;
    }

    /**
     * Obtém o valor da propriedade forSocialInsuranceRegisteredIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForSocialInsuranceRegisteredIndicator() {
        return forSocialInsuranceRegisteredIndicator;
    }

    /**
     * Define o valor da propriedade forSocialInsuranceRegisteredIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForSocialInsuranceRegisteredIndicator(Boolean value) {
        this.forSocialInsuranceRegisteredIndicator = value;
    }

    /**
     * Obtém o valor da propriedade taxSplitIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxSplitIndicator() {
        return taxSplitIndicator;
    }

    /**
     * Define o valor da propriedade taxSplitIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxSplitIndicator(Boolean value) {
        this.taxSplitIndicator = value;
    }

    /**
     * Obtém o valor da propriedade taxBasePercentageCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getTaxBasePercentageCode() {
        return taxBasePercentageCode;
    }

    /**
     * Define o valor da propriedade taxBasePercentageCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setTaxBasePercentageCode(Code value) {
        this.taxBasePercentageCode = value;
    }

    /**
     * Obtém o valor da propriedade responsibleTaxOfficePartyInternalID.
     * 
     * @return
     *     possible object is
     *     {@link PartyInternalID }
     *     
     */
    public PartyInternalID getResponsibleTaxOfficePartyInternalID() {
        return responsibleTaxOfficePartyInternalID;
    }

    /**
     * Define o valor da propriedade responsibleTaxOfficePartyInternalID.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyInternalID }
     *     
     */
    public void setResponsibleTaxOfficePartyInternalID(PartyInternalID value) {
        this.responsibleTaxOfficePartyInternalID = value;
    }

    /**
     * Obtém o valor da propriedade receiverResponsibleTaxOfficePartyInternalID.
     * 
     * @return
     *     possible object is
     *     {@link PartyInternalID }
     *     
     */
    public PartyInternalID getReceiverResponsibleTaxOfficePartyInternalID() {
        return receiverResponsibleTaxOfficePartyInternalID;
    }

    /**
     * Define o valor da propriedade receiverResponsibleTaxOfficePartyInternalID.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyInternalID }
     *     
     */
    public void setReceiverResponsibleTaxOfficePartyInternalID(PartyInternalID value) {
        this.receiverResponsibleTaxOfficePartyInternalID = value;
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
     * Obtém o valor da propriedade relatedCustomerInternalID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedCustomerInternalID() {
        return relatedCustomerInternalID;
    }

    /**
     * Define o valor da propriedade relatedCustomerInternalID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedCustomerInternalID(String value) {
        this.relatedCustomerInternalID = value;
    }

    /**
     * Obtém o valor da propriedade receiverRelatedCustomerInternalID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverRelatedCustomerInternalID() {
        return receiverRelatedCustomerInternalID;
    }

    /**
     * Define o valor da propriedade receiverRelatedCustomerInternalID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverRelatedCustomerInternalID(String value) {
        this.receiverRelatedCustomerInternalID = value;
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
     * {@link BPSUITERplctReqAcctgInfo }
     * 
     * 
     */
    public List<BPSUITERplctReqAcctgInfo> getAccountingInformation() {
        if (accountingInformation == null) {
            accountingInformation = new ArrayList<BPSUITERplctReqAcctgInfo>();
        }
        return this.accountingInformation;
    }

    /**
     * Obtém o valor da propriedade biddingCharacteristic.
     * 
     * @return
     *     possible object is
     *     {@link BPSUITERplctReqBiddingCharc }
     *     
     */
    public BPSUITERplctReqBiddingCharc getBiddingCharacteristic() {
        return biddingCharacteristic;
    }

    /**
     * Define o valor da propriedade biddingCharacteristic.
     * 
     * @param value
     *     allowed object is
     *     {@link BPSUITERplctReqBiddingCharc }
     *     
     */
    public void setBiddingCharacteristic(BPSUITERplctReqBiddingCharc value) {
        this.biddingCharacteristic = value;
    }

    /**
     * Gets the value of the procurementCardIssuingInstitutes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the procurementCardIssuingInstitutes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcurementCardIssuingInstitutes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPSUITERplctReqProcmtCardIssuingInstitutes }
     * 
     * 
     */
    public List<BPSUITERplctReqProcmtCardIssuingInstitutes> getProcurementCardIssuingInstitutes() {
        if (procurementCardIssuingInstitutes == null) {
            procurementCardIssuingInstitutes = new ArrayList<BPSUITERplctReqProcmtCardIssuingInstitutes>();
        }
        return this.procurementCardIssuingInstitutes;
    }

    /**
     * Gets the value of the qualityManagement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualityManagement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQualityManagement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPSUITERplctReqQltyMgmt }
     * 
     * 
     */
    public List<BPSUITERplctReqQltyMgmt> getQualityManagement() {
        if (qualityManagement == null) {
            qualityManagement = new ArrayList<BPSUITERplctReqQltyMgmt>();
        }
        return this.qualityManagement;
    }

    /**
     * Gets the value of the procurementArrangement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the procurementArrangement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcurementArrangement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPSUITERplctReqProcmtArrgmt }
     * 
     * 
     */
    public List<BPSUITERplctReqProcmtArrgmt> getProcurementArrangement() {
        if (procurementArrangement == null) {
            procurementArrangement = new ArrayList<BPSUITERplctReqProcmtArrgmt>();
        }
        return this.procurementArrangement;
    }

    /**
     * Gets the value of the subRange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subRange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPSUITERplctReqSubRnge }
     * 
     * 
     */
    public List<BPSUITERplctReqSubRnge> getSubRange() {
        if (subRange == null) {
            subRange = new ArrayList<BPSUITERplctReqSubRnge>();
        }
        return this.subRange;
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
     * {@link BPSUITERplctReqTxGrpg }
     * 
     * 
     */
    public List<BPSUITERplctReqTxGrpg> getTaxGrouping() {
        if (taxGrouping == null) {
            taxGrouping = new ArrayList<BPSUITERplctReqTxGrpg>();
        }
        return this.taxGrouping;
    }

    /**
     * Gets the value of the supplierText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplierText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplierText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPSUITERplctReqText }
     * 
     * 
     */
    public List<BPSUITERplctReqText> getSupplierText() {
        if (supplierText == null) {
            supplierText = new ArrayList<BPSUITERplctReqText>();
        }
        return this.supplierText;
    }

    /**
     * Gets the value of the supplierDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplierDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplierDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPSUITERplctReqDoc }
     * 
     * 
     */
    public List<BPSUITERplctReqDoc> getSupplierDocument() {
        if (supplierDocument == null) {
            supplierDocument = new ArrayList<BPSUITERplctReqDoc>();
        }
        return this.supplierDocument;
    }

    /**
     * Gets the value of the genericCustomField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericCustomField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericCustomField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericCustomField }
     * 
     * 
     */
    public List<GenericCustomField> getGenericCustomField() {
        if (genericCustomField == null) {
            genericCustomField = new ArrayList<GenericCustomField>();
        }
        return this.genericCustomField;
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
     * Obtém o valor da propriedade biddingCharacteristicListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBiddingCharacteristicListCompleteTransmissionIndicator() {
        return biddingCharacteristicListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade biddingCharacteristicListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBiddingCharacteristicListCompleteTransmissionIndicator(Boolean value) {
        this.biddingCharacteristicListCompleteTransmissionIndicator = value;
    }

    /**
     * Obtém o valor da propriedade procurementCardIssuingInstitutesListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProcurementCardIssuingInstitutesListCompleteTransmissionIndicator() {
        return procurementCardIssuingInstitutesListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade procurementCardIssuingInstitutesListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProcurementCardIssuingInstitutesListCompleteTransmissionIndicator(Boolean value) {
        this.procurementCardIssuingInstitutesListCompleteTransmissionIndicator = value;
    }

    /**
     * Obtém o valor da propriedade qualitiyManagementListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQualitiyManagementListCompleteTransmissionIndicator() {
        return qualitiyManagementListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade qualitiyManagementListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQualitiyManagementListCompleteTransmissionIndicator(Boolean value) {
        this.qualitiyManagementListCompleteTransmissionIndicator = value;
    }

    /**
     * Obtém o valor da propriedade procurementArrangementListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProcurementArrangementListCompleteTransmissionIndicator() {
        return procurementArrangementListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade procurementArrangementListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProcurementArrangementListCompleteTransmissionIndicator(Boolean value) {
        this.procurementArrangementListCompleteTransmissionIndicator = value;
    }

    /**
     * Obtém o valor da propriedade subRangeListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubRangeListCompleteTransmissionIndicator() {
        return subRangeListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade subRangeListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubRangeListCompleteTransmissionIndicator(Boolean value) {
        this.subRangeListCompleteTransmissionIndicator = value;
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
     * Obtém o valor da propriedade supplierTextListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupplierTextListCompleteTransmissionIndicator() {
        return supplierTextListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade supplierTextListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupplierTextListCompleteTransmissionIndicator(Boolean value) {
        this.supplierTextListCompleteTransmissionIndicator = value;
    }

    /**
     * Obtém o valor da propriedade genericCustomFieldListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenericCustomFieldListCompleteTransmissionIndicator() {
        return genericCustomFieldListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade genericCustomFieldListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenericCustomFieldListCompleteTransmissionIndicator(String value) {
        this.genericCustomFieldListCompleteTransmissionIndicator = value;
    }

}
