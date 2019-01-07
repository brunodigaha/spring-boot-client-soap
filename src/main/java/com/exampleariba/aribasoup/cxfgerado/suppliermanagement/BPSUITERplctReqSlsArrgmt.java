
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
 * <p>Classe Java de BPSUITERplctReqSlsArrgmt complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPSUITERplctReqSlsArrgmt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SalesOrganisationID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverSalesOrganisationID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="OrganisationalCentreID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverOrganisationalCentreID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="DistributionChannelCode" type="{http://ariba.com/xi/SupplierManagement}DistributionChannelCode" minOccurs="0"/&gt;
 *         &lt;element name="DivisionCode" type="{http://ariba.com/xi/SupplierManagement}DivisionCode" minOccurs="0"/&gt;
 *         &lt;element name="AuthorisationGroupCode" type="{http://ariba.com/xi/SupplierManagement}AuthorisationGroupCode" minOccurs="0"/&gt;
 *         &lt;element name="DeletedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StatisticsGroupCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="OrderBlockingReasonCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="PricingProcedureDeterminationCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="GroupCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="SalesDistrictCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="PriceGroupCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="PriceListTypeCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="ItemOrderProbabilityNumberValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryBlockingReasonCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="BatchSplitAllowedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SellerPartyBuyerID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="TransportServiceLevelCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="BillingBlockingReasonCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="ManualInvoiceMaintenanceIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceDatesCalendarCode" type="{http://ariba.com/xi/SupplierManagement}WorkingDayCalendarCode" minOccurs="0"/&gt;
 *         &lt;element name="IncoiceListScheduleCalendarCode" type="{http://ariba.com/xi/SupplierManagement}WorkingDayCalendarCode" minOccurs="0"/&gt;
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="ABCClassificationCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="AccountAssignmentGroupCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="CashDiscountTermsCode" type="{http://ariba.com/xi/SupplierManagement}CashDiscountTermsCode" minOccurs="0"/&gt;
 *         &lt;element name="DeliveringPlantID" type="{http://ariba.com/xi/SupplierManagement}PlantID" minOccurs="0"/&gt;
 *         &lt;element name="SalesGroupCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="SalesOfficeCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="ProductProposalID" type="{http://ariba.com/xi/SupplierManagement}Identifier" minOccurs="0"/&gt;
 *         &lt;element name="CustomerDefinedGroupCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="FirstAdditionalCustomerDefinedGroupCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="SecondAdditionalCustomerDefinedGroupCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="ThirdAdditionalCustomerDefinedGroupCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="FourthAdditionalCustomerDefinedGroupCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="RebateRelevantIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ExchangeRateTypeCode" type="{http://ariba.com/xi/SupplierManagement}ExchangeRateTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="PricingRelevanceIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PaymentGuaranteeProcedureCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="CreditControlAreaCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="SalesSupportBlockedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RoundingSwitchOffIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AgencyBusinessRelevanceIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MeasureUnitGroupCode" type="{http://ariba.com/xi/SupplierManagement}MeasureUnitGroupCode" minOccurs="0"/&gt;
 *         &lt;element name="ProductProposalCustomerProcedureCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="PODRelevanceIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PODConfirmationTimeframeDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DocumentIndexAllowedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryTerms" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqDelivTrms" minOccurs="0"/&gt;
 *         &lt;element name="PartnerFunctions" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqCustPartFuncs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SalesArrangementText" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="actionCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="partnerFunctionsListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="salesArrangementTextListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BPSUITERplctReqSlsArrgmt", propOrder = {
    "salesOrganisationID",
    "receiverSalesOrganisationID",
    "organisationalCentreID",
    "receiverOrganisationalCentreID",
    "distributionChannelCode",
    "divisionCode",
    "authorisationGroupCode",
    "deletedIndicator",
    "statisticsGroupCode",
    "orderBlockingReasonCode",
    "pricingProcedureDeterminationCode",
    "groupCode",
    "salesDistrictCode",
    "priceGroupCode",
    "priceListTypeCode",
    "itemOrderProbabilityNumberValue",
    "deliveryBlockingReasonCode",
    "batchSplitAllowedIndicator",
    "sellerPartyBuyerID",
    "transportServiceLevelCode",
    "billingBlockingReasonCode",
    "manualInvoiceMaintenanceIndicator",
    "invoiceDatesCalendarCode",
    "incoiceListScheduleCalendarCode",
    "currencyCode",
    "abcClassificationCode",
    "accountAssignmentGroupCode",
    "cashDiscountTermsCode",
    "deliveringPlantID",
    "salesGroupCode",
    "salesOfficeCode",
    "productProposalID",
    "customerDefinedGroupCode",
    "firstAdditionalCustomerDefinedGroupCode",
    "secondAdditionalCustomerDefinedGroupCode",
    "thirdAdditionalCustomerDefinedGroupCode",
    "fourthAdditionalCustomerDefinedGroupCode",
    "rebateRelevantIndicator",
    "exchangeRateTypeCode",
    "pricingRelevanceIndicator",
    "paymentGuaranteeProcedureCode",
    "creditControlAreaCode",
    "salesSupportBlockedIndicator",
    "roundingSwitchOffIndicator",
    "agencyBusinessRelevanceIndicator",
    "measureUnitGroupCode",
    "productProposalCustomerProcedureCode",
    "podRelevanceIndicator",
    "podConfirmationTimeframeDuration",
    "documentIndexAllowedIndicator",
    "deliveryTerms",
    "partnerFunctions",
    "salesArrangementText"
})
public class BPSUITERplctReqSlsArrgmt {

    @XmlElement(name = "SalesOrganisationID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String salesOrganisationID;
    @XmlElement(name = "ReceiverSalesOrganisationID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String receiverSalesOrganisationID;
    @XmlElement(name = "OrganisationalCentreID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String organisationalCentreID;
    @XmlElement(name = "ReceiverOrganisationalCentreID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String receiverOrganisationalCentreID;
    @XmlElement(name = "DistributionChannelCode")
    protected DistributionChannelCode distributionChannelCode;
    @XmlElement(name = "DivisionCode")
    protected DivisionCode divisionCode;
    @XmlElement(name = "AuthorisationGroupCode")
    protected AuthorisationGroupCode authorisationGroupCode;
    @XmlElement(name = "DeletedIndicator")
    protected Boolean deletedIndicator;
    @XmlElement(name = "StatisticsGroupCode")
    protected Code statisticsGroupCode;
    @XmlElement(name = "OrderBlockingReasonCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String orderBlockingReasonCode;
    @XmlElement(name = "PricingProcedureDeterminationCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String pricingProcedureDeterminationCode;
    @XmlElement(name = "GroupCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String groupCode;
    @XmlElement(name = "SalesDistrictCode")
    protected Code salesDistrictCode;
    @XmlElement(name = "PriceGroupCode")
    protected Code priceGroupCode;
    @XmlElement(name = "PriceListTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String priceListTypeCode;
    @XmlElement(name = "ItemOrderProbabilityNumberValue")
    protected Integer itemOrderProbabilityNumberValue;
    @XmlElement(name = "DeliveryBlockingReasonCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String deliveryBlockingReasonCode;
    @XmlElement(name = "BatchSplitAllowedIndicator")
    protected Boolean batchSplitAllowedIndicator;
    @XmlElement(name = "SellerPartyBuyerID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String sellerPartyBuyerID;
    @XmlElement(name = "TransportServiceLevelCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String transportServiceLevelCode;
    @XmlElement(name = "BillingBlockingReasonCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String billingBlockingReasonCode;
    @XmlElement(name = "ManualInvoiceMaintenanceIndicator")
    protected Boolean manualInvoiceMaintenanceIndicator;
    @XmlElement(name = "InvoiceDatesCalendarCode")
    protected WorkingDayCalendarCode invoiceDatesCalendarCode;
    @XmlElement(name = "IncoiceListScheduleCalendarCode")
    protected WorkingDayCalendarCode incoiceListScheduleCalendarCode;
    @XmlElement(name = "CurrencyCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String currencyCode;
    @XmlElement(name = "ABCClassificationCode")
    protected Code abcClassificationCode;
    @XmlElement(name = "AccountAssignmentGroupCode")
    protected Code accountAssignmentGroupCode;
    @XmlElement(name = "CashDiscountTermsCode")
    protected CashDiscountTermsCode cashDiscountTermsCode;
    @XmlElement(name = "DeliveringPlantID")
    protected PlantID deliveringPlantID;
    @XmlElement(name = "SalesGroupCode")
    protected Code salesGroupCode;
    @XmlElement(name = "SalesOfficeCode")
    protected Code salesOfficeCode;
    @XmlElement(name = "ProductProposalID")
    protected Identifier productProposalID;
    @XmlElement(name = "CustomerDefinedGroupCode")
    protected Code customerDefinedGroupCode;
    @XmlElement(name = "FirstAdditionalCustomerDefinedGroupCode")
    protected Code firstAdditionalCustomerDefinedGroupCode;
    @XmlElement(name = "SecondAdditionalCustomerDefinedGroupCode")
    protected Code secondAdditionalCustomerDefinedGroupCode;
    @XmlElement(name = "ThirdAdditionalCustomerDefinedGroupCode")
    protected Code thirdAdditionalCustomerDefinedGroupCode;
    @XmlElement(name = "FourthAdditionalCustomerDefinedGroupCode")
    protected Code fourthAdditionalCustomerDefinedGroupCode;
    @XmlElement(name = "RebateRelevantIndicator")
    protected Boolean rebateRelevantIndicator;
    @XmlElement(name = "ExchangeRateTypeCode")
    protected ExchangeRateTypeCode exchangeRateTypeCode;
    @XmlElement(name = "PricingRelevanceIndicator")
    protected Boolean pricingRelevanceIndicator;
    @XmlElement(name = "PaymentGuaranteeProcedureCode")
    protected Code paymentGuaranteeProcedureCode;
    @XmlElement(name = "CreditControlAreaCode")
    protected Code creditControlAreaCode;
    @XmlElement(name = "SalesSupportBlockedIndicator")
    protected Boolean salesSupportBlockedIndicator;
    @XmlElement(name = "RoundingSwitchOffIndicator")
    protected Boolean roundingSwitchOffIndicator;
    @XmlElement(name = "AgencyBusinessRelevanceIndicator")
    protected Boolean agencyBusinessRelevanceIndicator;
    @XmlElement(name = "MeasureUnitGroupCode")
    protected MeasureUnitGroupCode measureUnitGroupCode;
    @XmlElement(name = "ProductProposalCustomerProcedureCode")
    protected Code productProposalCustomerProcedureCode;
    @XmlElement(name = "PODRelevanceIndicator")
    protected Boolean podRelevanceIndicator;
    @XmlElement(name = "PODConfirmationTimeframeDuration")
    protected String podConfirmationTimeframeDuration;
    @XmlElement(name = "DocumentIndexAllowedIndicator")
    protected Boolean documentIndexAllowedIndicator;
    @XmlElement(name = "DeliveryTerms")
    protected BPSUITERplctReqDelivTrms deliveryTerms;
    @XmlElement(name = "PartnerFunctions")
    protected List<BPSUITERplctReqCustPartFuncs> partnerFunctions;
    @XmlElement(name = "SalesArrangementText")
    protected List<BPSUITERplctReqText> salesArrangementText;
    @XmlAttribute(name = "actionCode")
    protected String actionCode;
    @XmlAttribute(name = "partnerFunctionsListCompleteTransmissionIndicator")
    protected Boolean partnerFunctionsListCompleteTransmissionIndicator;
    @XmlAttribute(name = "salesArrangementTextListCompleteTransmissionIndicator")
    protected Boolean salesArrangementTextListCompleteTransmissionIndicator;

    /**
     * Obtém o valor da propriedade salesOrganisationID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesOrganisationID() {
        return salesOrganisationID;
    }

    /**
     * Define o valor da propriedade salesOrganisationID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesOrganisationID(String value) {
        this.salesOrganisationID = value;
    }

    /**
     * Obtém o valor da propriedade receiverSalesOrganisationID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverSalesOrganisationID() {
        return receiverSalesOrganisationID;
    }

    /**
     * Define o valor da propriedade receiverSalesOrganisationID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverSalesOrganisationID(String value) {
        this.receiverSalesOrganisationID = value;
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
     * Obtém o valor da propriedade distributionChannelCode.
     * 
     * @return
     *     possible object is
     *     {@link DistributionChannelCode }
     *     
     */
    public DistributionChannelCode getDistributionChannelCode() {
        return distributionChannelCode;
    }

    /**
     * Define o valor da propriedade distributionChannelCode.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionChannelCode }
     *     
     */
    public void setDistributionChannelCode(DistributionChannelCode value) {
        this.distributionChannelCode = value;
    }

    /**
     * Obtém o valor da propriedade divisionCode.
     * 
     * @return
     *     possible object is
     *     {@link DivisionCode }
     *     
     */
    public DivisionCode getDivisionCode() {
        return divisionCode;
    }

    /**
     * Define o valor da propriedade divisionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link DivisionCode }
     *     
     */
    public void setDivisionCode(DivisionCode value) {
        this.divisionCode = value;
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
     * Obtém o valor da propriedade orderBlockingReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderBlockingReasonCode() {
        return orderBlockingReasonCode;
    }

    /**
     * Define o valor da propriedade orderBlockingReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderBlockingReasonCode(String value) {
        this.orderBlockingReasonCode = value;
    }

    /**
     * Obtém o valor da propriedade pricingProcedureDeterminationCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingProcedureDeterminationCode() {
        return pricingProcedureDeterminationCode;
    }

    /**
     * Define o valor da propriedade pricingProcedureDeterminationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingProcedureDeterminationCode(String value) {
        this.pricingProcedureDeterminationCode = value;
    }

    /**
     * Obtém o valor da propriedade groupCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupCode() {
        return groupCode;
    }

    /**
     * Define o valor da propriedade groupCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupCode(String value) {
        this.groupCode = value;
    }

    /**
     * Obtém o valor da propriedade salesDistrictCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getSalesDistrictCode() {
        return salesDistrictCode;
    }

    /**
     * Define o valor da propriedade salesDistrictCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setSalesDistrictCode(Code value) {
        this.salesDistrictCode = value;
    }

    /**
     * Obtém o valor da propriedade priceGroupCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getPriceGroupCode() {
        return priceGroupCode;
    }

    /**
     * Define o valor da propriedade priceGroupCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setPriceGroupCode(Code value) {
        this.priceGroupCode = value;
    }

    /**
     * Obtém o valor da propriedade priceListTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceListTypeCode() {
        return priceListTypeCode;
    }

    /**
     * Define o valor da propriedade priceListTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceListTypeCode(String value) {
        this.priceListTypeCode = value;
    }

    /**
     * Obtém o valor da propriedade itemOrderProbabilityNumberValue.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getItemOrderProbabilityNumberValue() {
        return itemOrderProbabilityNumberValue;
    }

    /**
     * Define o valor da propriedade itemOrderProbabilityNumberValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setItemOrderProbabilityNumberValue(Integer value) {
        this.itemOrderProbabilityNumberValue = value;
    }

    /**
     * Obtém o valor da propriedade deliveryBlockingReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryBlockingReasonCode() {
        return deliveryBlockingReasonCode;
    }

    /**
     * Define o valor da propriedade deliveryBlockingReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryBlockingReasonCode(String value) {
        this.deliveryBlockingReasonCode = value;
    }

    /**
     * Obtém o valor da propriedade batchSplitAllowedIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBatchSplitAllowedIndicator() {
        return batchSplitAllowedIndicator;
    }

    /**
     * Define o valor da propriedade batchSplitAllowedIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBatchSplitAllowedIndicator(Boolean value) {
        this.batchSplitAllowedIndicator = value;
    }

    /**
     * Obtém o valor da propriedade sellerPartyBuyerID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerPartyBuyerID() {
        return sellerPartyBuyerID;
    }

    /**
     * Define o valor da propriedade sellerPartyBuyerID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerPartyBuyerID(String value) {
        this.sellerPartyBuyerID = value;
    }

    /**
     * Obtém o valor da propriedade transportServiceLevelCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportServiceLevelCode() {
        return transportServiceLevelCode;
    }

    /**
     * Define o valor da propriedade transportServiceLevelCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportServiceLevelCode(String value) {
        this.transportServiceLevelCode = value;
    }

    /**
     * Obtém o valor da propriedade billingBlockingReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingBlockingReasonCode() {
        return billingBlockingReasonCode;
    }

    /**
     * Define o valor da propriedade billingBlockingReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingBlockingReasonCode(String value) {
        this.billingBlockingReasonCode = value;
    }

    /**
     * Obtém o valor da propriedade manualInvoiceMaintenanceIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isManualInvoiceMaintenanceIndicator() {
        return manualInvoiceMaintenanceIndicator;
    }

    /**
     * Define o valor da propriedade manualInvoiceMaintenanceIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManualInvoiceMaintenanceIndicator(Boolean value) {
        this.manualInvoiceMaintenanceIndicator = value;
    }

    /**
     * Obtém o valor da propriedade invoiceDatesCalendarCode.
     * 
     * @return
     *     possible object is
     *     {@link WorkingDayCalendarCode }
     *     
     */
    public WorkingDayCalendarCode getInvoiceDatesCalendarCode() {
        return invoiceDatesCalendarCode;
    }

    /**
     * Define o valor da propriedade invoiceDatesCalendarCode.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkingDayCalendarCode }
     *     
     */
    public void setInvoiceDatesCalendarCode(WorkingDayCalendarCode value) {
        this.invoiceDatesCalendarCode = value;
    }

    /**
     * Obtém o valor da propriedade incoiceListScheduleCalendarCode.
     * 
     * @return
     *     possible object is
     *     {@link WorkingDayCalendarCode }
     *     
     */
    public WorkingDayCalendarCode getIncoiceListScheduleCalendarCode() {
        return incoiceListScheduleCalendarCode;
    }

    /**
     * Define o valor da propriedade incoiceListScheduleCalendarCode.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkingDayCalendarCode }
     *     
     */
    public void setIncoiceListScheduleCalendarCode(WorkingDayCalendarCode value) {
        this.incoiceListScheduleCalendarCode = value;
    }

    /**
     * Obtém o valor da propriedade currencyCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Define o valor da propriedade currencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Obtém o valor da propriedade abcClassificationCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getABCClassificationCode() {
        return abcClassificationCode;
    }

    /**
     * Define o valor da propriedade abcClassificationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setABCClassificationCode(Code value) {
        this.abcClassificationCode = value;
    }

    /**
     * Obtém o valor da propriedade accountAssignmentGroupCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getAccountAssignmentGroupCode() {
        return accountAssignmentGroupCode;
    }

    /**
     * Define o valor da propriedade accountAssignmentGroupCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setAccountAssignmentGroupCode(Code value) {
        this.accountAssignmentGroupCode = value;
    }

    /**
     * Obtém o valor da propriedade cashDiscountTermsCode.
     * 
     * @return
     *     possible object is
     *     {@link CashDiscountTermsCode }
     *     
     */
    public CashDiscountTermsCode getCashDiscountTermsCode() {
        return cashDiscountTermsCode;
    }

    /**
     * Define o valor da propriedade cashDiscountTermsCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CashDiscountTermsCode }
     *     
     */
    public void setCashDiscountTermsCode(CashDiscountTermsCode value) {
        this.cashDiscountTermsCode = value;
    }

    /**
     * Obtém o valor da propriedade deliveringPlantID.
     * 
     * @return
     *     possible object is
     *     {@link PlantID }
     *     
     */
    public PlantID getDeliveringPlantID() {
        return deliveringPlantID;
    }

    /**
     * Define o valor da propriedade deliveringPlantID.
     * 
     * @param value
     *     allowed object is
     *     {@link PlantID }
     *     
     */
    public void setDeliveringPlantID(PlantID value) {
        this.deliveringPlantID = value;
    }

    /**
     * Obtém o valor da propriedade salesGroupCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getSalesGroupCode() {
        return salesGroupCode;
    }

    /**
     * Define o valor da propriedade salesGroupCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setSalesGroupCode(Code value) {
        this.salesGroupCode = value;
    }

    /**
     * Obtém o valor da propriedade salesOfficeCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getSalesOfficeCode() {
        return salesOfficeCode;
    }

    /**
     * Define o valor da propriedade salesOfficeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setSalesOfficeCode(Code value) {
        this.salesOfficeCode = value;
    }

    /**
     * Obtém o valor da propriedade productProposalID.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getProductProposalID() {
        return productProposalID;
    }

    /**
     * Define o valor da propriedade productProposalID.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setProductProposalID(Identifier value) {
        this.productProposalID = value;
    }

    /**
     * Obtém o valor da propriedade customerDefinedGroupCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getCustomerDefinedGroupCode() {
        return customerDefinedGroupCode;
    }

    /**
     * Define o valor da propriedade customerDefinedGroupCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setCustomerDefinedGroupCode(Code value) {
        this.customerDefinedGroupCode = value;
    }

    /**
     * Obtém o valor da propriedade firstAdditionalCustomerDefinedGroupCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getFirstAdditionalCustomerDefinedGroupCode() {
        return firstAdditionalCustomerDefinedGroupCode;
    }

    /**
     * Define o valor da propriedade firstAdditionalCustomerDefinedGroupCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setFirstAdditionalCustomerDefinedGroupCode(Code value) {
        this.firstAdditionalCustomerDefinedGroupCode = value;
    }

    /**
     * Obtém o valor da propriedade secondAdditionalCustomerDefinedGroupCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getSecondAdditionalCustomerDefinedGroupCode() {
        return secondAdditionalCustomerDefinedGroupCode;
    }

    /**
     * Define o valor da propriedade secondAdditionalCustomerDefinedGroupCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setSecondAdditionalCustomerDefinedGroupCode(Code value) {
        this.secondAdditionalCustomerDefinedGroupCode = value;
    }

    /**
     * Obtém o valor da propriedade thirdAdditionalCustomerDefinedGroupCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getThirdAdditionalCustomerDefinedGroupCode() {
        return thirdAdditionalCustomerDefinedGroupCode;
    }

    /**
     * Define o valor da propriedade thirdAdditionalCustomerDefinedGroupCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setThirdAdditionalCustomerDefinedGroupCode(Code value) {
        this.thirdAdditionalCustomerDefinedGroupCode = value;
    }

    /**
     * Obtém o valor da propriedade fourthAdditionalCustomerDefinedGroupCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getFourthAdditionalCustomerDefinedGroupCode() {
        return fourthAdditionalCustomerDefinedGroupCode;
    }

    /**
     * Define o valor da propriedade fourthAdditionalCustomerDefinedGroupCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setFourthAdditionalCustomerDefinedGroupCode(Code value) {
        this.fourthAdditionalCustomerDefinedGroupCode = value;
    }

    /**
     * Obtém o valor da propriedade rebateRelevantIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRebateRelevantIndicator() {
        return rebateRelevantIndicator;
    }

    /**
     * Define o valor da propriedade rebateRelevantIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRebateRelevantIndicator(Boolean value) {
        this.rebateRelevantIndicator = value;
    }

    /**
     * Obtém o valor da propriedade exchangeRateTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateTypeCode }
     *     
     */
    public ExchangeRateTypeCode getExchangeRateTypeCode() {
        return exchangeRateTypeCode;
    }

    /**
     * Define o valor da propriedade exchangeRateTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateTypeCode }
     *     
     */
    public void setExchangeRateTypeCode(ExchangeRateTypeCode value) {
        this.exchangeRateTypeCode = value;
    }

    /**
     * Obtém o valor da propriedade pricingRelevanceIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPricingRelevanceIndicator() {
        return pricingRelevanceIndicator;
    }

    /**
     * Define o valor da propriedade pricingRelevanceIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPricingRelevanceIndicator(Boolean value) {
        this.pricingRelevanceIndicator = value;
    }

    /**
     * Obtém o valor da propriedade paymentGuaranteeProcedureCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getPaymentGuaranteeProcedureCode() {
        return paymentGuaranteeProcedureCode;
    }

    /**
     * Define o valor da propriedade paymentGuaranteeProcedureCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setPaymentGuaranteeProcedureCode(Code value) {
        this.paymentGuaranteeProcedureCode = value;
    }

    /**
     * Obtém o valor da propriedade creditControlAreaCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getCreditControlAreaCode() {
        return creditControlAreaCode;
    }

    /**
     * Define o valor da propriedade creditControlAreaCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setCreditControlAreaCode(Code value) {
        this.creditControlAreaCode = value;
    }

    /**
     * Obtém o valor da propriedade salesSupportBlockedIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSalesSupportBlockedIndicator() {
        return salesSupportBlockedIndicator;
    }

    /**
     * Define o valor da propriedade salesSupportBlockedIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSalesSupportBlockedIndicator(Boolean value) {
        this.salesSupportBlockedIndicator = value;
    }

    /**
     * Obtém o valor da propriedade roundingSwitchOffIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRoundingSwitchOffIndicator() {
        return roundingSwitchOffIndicator;
    }

    /**
     * Define o valor da propriedade roundingSwitchOffIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRoundingSwitchOffIndicator(Boolean value) {
        this.roundingSwitchOffIndicator = value;
    }

    /**
     * Obtém o valor da propriedade agencyBusinessRelevanceIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAgencyBusinessRelevanceIndicator() {
        return agencyBusinessRelevanceIndicator;
    }

    /**
     * Define o valor da propriedade agencyBusinessRelevanceIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAgencyBusinessRelevanceIndicator(Boolean value) {
        this.agencyBusinessRelevanceIndicator = value;
    }

    /**
     * Obtém o valor da propriedade measureUnitGroupCode.
     * 
     * @return
     *     possible object is
     *     {@link MeasureUnitGroupCode }
     *     
     */
    public MeasureUnitGroupCode getMeasureUnitGroupCode() {
        return measureUnitGroupCode;
    }

    /**
     * Define o valor da propriedade measureUnitGroupCode.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureUnitGroupCode }
     *     
     */
    public void setMeasureUnitGroupCode(MeasureUnitGroupCode value) {
        this.measureUnitGroupCode = value;
    }

    /**
     * Obtém o valor da propriedade productProposalCustomerProcedureCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getProductProposalCustomerProcedureCode() {
        return productProposalCustomerProcedureCode;
    }

    /**
     * Define o valor da propriedade productProposalCustomerProcedureCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setProductProposalCustomerProcedureCode(Code value) {
        this.productProposalCustomerProcedureCode = value;
    }

    /**
     * Obtém o valor da propriedade podRelevanceIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPODRelevanceIndicator() {
        return podRelevanceIndicator;
    }

    /**
     * Define o valor da propriedade podRelevanceIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPODRelevanceIndicator(Boolean value) {
        this.podRelevanceIndicator = value;
    }

    /**
     * Obtém o valor da propriedade podConfirmationTimeframeDuration.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPODConfirmationTimeframeDuration() {
        return podConfirmationTimeframeDuration;
    }

    /**
     * Define o valor da propriedade podConfirmationTimeframeDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPODConfirmationTimeframeDuration(String value) {
        this.podConfirmationTimeframeDuration = value;
    }

    /**
     * Obtém o valor da propriedade documentIndexAllowedIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDocumentIndexAllowedIndicator() {
        return documentIndexAllowedIndicator;
    }

    /**
     * Define o valor da propriedade documentIndexAllowedIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDocumentIndexAllowedIndicator(Boolean value) {
        this.documentIndexAllowedIndicator = value;
    }

    /**
     * Obtém o valor da propriedade deliveryTerms.
     * 
     * @return
     *     possible object is
     *     {@link BPSUITERplctReqDelivTrms }
     *     
     */
    public BPSUITERplctReqDelivTrms getDeliveryTerms() {
        return deliveryTerms;
    }

    /**
     * Define o valor da propriedade deliveryTerms.
     * 
     * @param value
     *     allowed object is
     *     {@link BPSUITERplctReqDelivTrms }
     *     
     */
    public void setDeliveryTerms(BPSUITERplctReqDelivTrms value) {
        this.deliveryTerms = value;
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
     * {@link BPSUITERplctReqCustPartFuncs }
     * 
     * 
     */
    public List<BPSUITERplctReqCustPartFuncs> getPartnerFunctions() {
        if (partnerFunctions == null) {
            partnerFunctions = new ArrayList<BPSUITERplctReqCustPartFuncs>();
        }
        return this.partnerFunctions;
    }

    /**
     * Gets the value of the salesArrangementText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesArrangementText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesArrangementText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPSUITERplctReqText }
     * 
     * 
     */
    public List<BPSUITERplctReqText> getSalesArrangementText() {
        if (salesArrangementText == null) {
            salesArrangementText = new ArrayList<BPSUITERplctReqText>();
        }
        return this.salesArrangementText;
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
     * Obtém o valor da propriedade salesArrangementTextListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSalesArrangementTextListCompleteTransmissionIndicator() {
        return salesArrangementTextListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade salesArrangementTextListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSalesArrangementTextListCompleteTransmissionIndicator(Boolean value) {
        this.salesArrangementTextListCompleteTransmissionIndicator = value;
    }

}
