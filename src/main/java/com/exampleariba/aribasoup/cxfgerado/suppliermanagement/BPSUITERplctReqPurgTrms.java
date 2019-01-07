
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java de BPSUITERplctReqPurgTrms complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPSUITERplctReqPurgTrms"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomsOfficeInternalID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="BuyerPartySellerID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseOrderCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="CashDiscountTermsCode" type="{http://ariba.com/xi/SupplierManagement}CashDiscountTermsCode" minOccurs="0"/&gt;
 *         &lt;element name="ReturnItemsEvaluatedReceiptSettlementIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TransportModeCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="TransportServiceLevelCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="PriceSpecificationSupplierGroupCode" type="{http://ariba.com/xi/SupplierManagement}PriceSpecificationSupplierGroupCode" minOccurs="0"/&gt;
 *         &lt;element name="PriceSpecificationDeterminationDateTypeCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="ExpectedPurchasingDocumentItemConfirmationTypeCode" type="{http://ariba.com/xi/SupplierManagement}PurchasingDocumentItemConfirmationTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="MeasureUnitGroupCode" type="{http://ariba.com/xi/SupplierManagement}MeasureUnitGroupCode" minOccurs="0"/&gt;
 *         &lt;element name="RoundingProfileCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryCyclePlanningCalendarCode" type="{http://ariba.com/xi/SupplierManagement}PlanningCalendarCode" minOccurs="0"/&gt;
 *         &lt;element name="PlanningCyclePlanningCalendarCode" type="{http://ariba.com/xi/SupplierManagement}PlanningCalendarCode" minOccurs="0"/&gt;
 *         &lt;element name="GoodsMovementItemSortCriterionCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="LoadBuildingRestrictionProfileCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="DataTransferProfileCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="PurchasingBlockedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryBasedInvoiceVerificationIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EvaluatedReceiptSettlementIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AutomaticPurchaseOrderGenerationAllowedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseOrderBySupplierProvidedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DiscountInKindAllowedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IndexCompilationForSubsequentSettlementAllowedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DocumentIndexAllowedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AgencyBusinessRelevanceIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RevaluationAllowedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceBasedInvoiceVerificationIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SubsequentSettlementApplyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BusinessVolumeComparisonRequiredIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PricingRelevanceIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RackJobbingIncludedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PriceMakingAgreementTypeCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="OrderMinimumAmount" type="{http://ariba.com/xi/SupplierManagement}Amount" minOccurs="0"/&gt;
 *         &lt;element name="PlannedDeliveryDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SalesVolumeFulfillmentPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseOrderConfirmationRequirementCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceConfirmationRequirementCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="FollowUpDespatchedDeliveryNotificationRequirementCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="FollowUpGoodsReceiptRequestRequirementCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="Incoterms" type="{http://ariba.com/xi/SupplierManagement}Incoterms" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BPSUITERplctReqPurgTrms", propOrder = {
    "customsOfficeInternalID",
    "buyerPartySellerID",
    "purchaseOrderCurrencyCode",
    "cashDiscountTermsCode",
    "returnItemsEvaluatedReceiptSettlementIndicator",
    "transportModeCode",
    "transportServiceLevelCode",
    "priceSpecificationSupplierGroupCode",
    "priceSpecificationDeterminationDateTypeCode",
    "expectedPurchasingDocumentItemConfirmationTypeCode",
    "measureUnitGroupCode",
    "roundingProfileCode",
    "deliveryCyclePlanningCalendarCode",
    "planningCyclePlanningCalendarCode",
    "goodsMovementItemSortCriterionCode",
    "loadBuildingRestrictionProfileCode",
    "dataTransferProfileCode",
    "purchasingBlockedIndicator",
    "deliveryBasedInvoiceVerificationIndicator",
    "evaluatedReceiptSettlementIndicator",
    "automaticPurchaseOrderGenerationAllowedIndicator",
    "purchaseOrderBySupplierProvidedIndicator",
    "discountInKindAllowedIndicator",
    "indexCompilationForSubsequentSettlementAllowedIndicator",
    "documentIndexAllowedIndicator",
    "agencyBusinessRelevanceIndicator",
    "revaluationAllowedIndicator",
    "serviceBasedInvoiceVerificationIndicator",
    "subsequentSettlementApplyIndicator",
    "businessVolumeComparisonRequiredIndicator",
    "pricingRelevanceIndicator",
    "rackJobbingIncludedIndicator",
    "priceMakingAgreementTypeCode",
    "orderMinimumAmount",
    "plannedDeliveryDuration",
    "salesVolumeFulfillmentPercent",
    "purchaseOrderConfirmationRequirementCode",
    "invoiceConfirmationRequirementCode",
    "followUpDespatchedDeliveryNotificationRequirementCode",
    "followUpGoodsReceiptRequestRequirementCode",
    "incoterms"
})
public class BPSUITERplctReqPurgTrms {

    @XmlElement(name = "CustomsOfficeInternalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String customsOfficeInternalID;
    @XmlElement(name = "BuyerPartySellerID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String buyerPartySellerID;
    @XmlElement(name = "PurchaseOrderCurrencyCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String purchaseOrderCurrencyCode;
    @XmlElement(name = "CashDiscountTermsCode")
    protected CashDiscountTermsCode cashDiscountTermsCode;
    @XmlElement(name = "ReturnItemsEvaluatedReceiptSettlementIndicator")
    protected Boolean returnItemsEvaluatedReceiptSettlementIndicator;
    @XmlElement(name = "TransportModeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String transportModeCode;
    @XmlElement(name = "TransportServiceLevelCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String transportServiceLevelCode;
    @XmlElement(name = "PriceSpecificationSupplierGroupCode")
    protected PriceSpecificationSupplierGroupCode priceSpecificationSupplierGroupCode;
    @XmlElement(name = "PriceSpecificationDeterminationDateTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String priceSpecificationDeterminationDateTypeCode;
    @XmlElement(name = "ExpectedPurchasingDocumentItemConfirmationTypeCode")
    protected PurchasingDocumentItemConfirmationTypeCode expectedPurchasingDocumentItemConfirmationTypeCode;
    @XmlElement(name = "MeasureUnitGroupCode")
    protected MeasureUnitGroupCode measureUnitGroupCode;
    @XmlElement(name = "RoundingProfileCode")
    protected Code roundingProfileCode;
    @XmlElement(name = "DeliveryCyclePlanningCalendarCode")
    protected PlanningCalendarCode deliveryCyclePlanningCalendarCode;
    @XmlElement(name = "PlanningCyclePlanningCalendarCode")
    protected PlanningCalendarCode planningCyclePlanningCalendarCode;
    @XmlElement(name = "GoodsMovementItemSortCriterionCode")
    protected Code goodsMovementItemSortCriterionCode;
    @XmlElement(name = "LoadBuildingRestrictionProfileCode")
    protected Code loadBuildingRestrictionProfileCode;
    @XmlElement(name = "DataTransferProfileCode")
    protected Code dataTransferProfileCode;
    @XmlElement(name = "PurchasingBlockedIndicator")
    protected Boolean purchasingBlockedIndicator;
    @XmlElement(name = "DeliveryBasedInvoiceVerificationIndicator")
    protected Boolean deliveryBasedInvoiceVerificationIndicator;
    @XmlElement(name = "EvaluatedReceiptSettlementIndicator")
    protected Boolean evaluatedReceiptSettlementIndicator;
    @XmlElement(name = "AutomaticPurchaseOrderGenerationAllowedIndicator")
    protected Boolean automaticPurchaseOrderGenerationAllowedIndicator;
    @XmlElement(name = "PurchaseOrderBySupplierProvidedIndicator")
    protected Boolean purchaseOrderBySupplierProvidedIndicator;
    @XmlElement(name = "DiscountInKindAllowedIndicator")
    protected Boolean discountInKindAllowedIndicator;
    @XmlElement(name = "IndexCompilationForSubsequentSettlementAllowedIndicator")
    protected Boolean indexCompilationForSubsequentSettlementAllowedIndicator;
    @XmlElement(name = "DocumentIndexAllowedIndicator")
    protected Boolean documentIndexAllowedIndicator;
    @XmlElement(name = "AgencyBusinessRelevanceIndicator")
    protected Boolean agencyBusinessRelevanceIndicator;
    @XmlElement(name = "RevaluationAllowedIndicator")
    protected Boolean revaluationAllowedIndicator;
    @XmlElement(name = "ServiceBasedInvoiceVerificationIndicator")
    protected Boolean serviceBasedInvoiceVerificationIndicator;
    @XmlElement(name = "SubsequentSettlementApplyIndicator")
    protected Boolean subsequentSettlementApplyIndicator;
    @XmlElement(name = "BusinessVolumeComparisonRequiredIndicator")
    protected Boolean businessVolumeComparisonRequiredIndicator;
    @XmlElement(name = "PricingRelevanceIndicator")
    protected Boolean pricingRelevanceIndicator;
    @XmlElement(name = "RackJobbingIncludedIndicator")
    protected Boolean rackJobbingIncludedIndicator;
    @XmlElement(name = "PriceMakingAgreementTypeCode")
    protected Code priceMakingAgreementTypeCode;
    @XmlElement(name = "OrderMinimumAmount")
    protected Amount orderMinimumAmount;
    @XmlElement(name = "PlannedDeliveryDuration")
    protected String plannedDeliveryDuration;
    @XmlElement(name = "SalesVolumeFulfillmentPercent")
    protected BigDecimal salesVolumeFulfillmentPercent;
    @XmlElement(name = "PurchaseOrderConfirmationRequirementCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String purchaseOrderConfirmationRequirementCode;
    @XmlElement(name = "InvoiceConfirmationRequirementCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String invoiceConfirmationRequirementCode;
    @XmlElement(name = "FollowUpDespatchedDeliveryNotificationRequirementCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String followUpDespatchedDeliveryNotificationRequirementCode;
    @XmlElement(name = "FollowUpGoodsReceiptRequestRequirementCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String followUpGoodsReceiptRequestRequirementCode;
    @XmlElement(name = "Incoterms")
    protected Incoterms incoterms;

    /**
     * Obtém o valor da propriedade customsOfficeInternalID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsOfficeInternalID() {
        return customsOfficeInternalID;
    }

    /**
     * Define o valor da propriedade customsOfficeInternalID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsOfficeInternalID(String value) {
        this.customsOfficeInternalID = value;
    }

    /**
     * Obtém o valor da propriedade buyerPartySellerID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerPartySellerID() {
        return buyerPartySellerID;
    }

    /**
     * Define o valor da propriedade buyerPartySellerID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerPartySellerID(String value) {
        this.buyerPartySellerID = value;
    }

    /**
     * Obtém o valor da propriedade purchaseOrderCurrencyCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseOrderCurrencyCode() {
        return purchaseOrderCurrencyCode;
    }

    /**
     * Define o valor da propriedade purchaseOrderCurrencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseOrderCurrencyCode(String value) {
        this.purchaseOrderCurrencyCode = value;
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
     * Obtém o valor da propriedade returnItemsEvaluatedReceiptSettlementIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnItemsEvaluatedReceiptSettlementIndicator() {
        return returnItemsEvaluatedReceiptSettlementIndicator;
    }

    /**
     * Define o valor da propriedade returnItemsEvaluatedReceiptSettlementIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnItemsEvaluatedReceiptSettlementIndicator(Boolean value) {
        this.returnItemsEvaluatedReceiptSettlementIndicator = value;
    }

    /**
     * Obtém o valor da propriedade transportModeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportModeCode() {
        return transportModeCode;
    }

    /**
     * Define o valor da propriedade transportModeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportModeCode(String value) {
        this.transportModeCode = value;
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
     * Obtém o valor da propriedade priceSpecificationSupplierGroupCode.
     * 
     * @return
     *     possible object is
     *     {@link PriceSpecificationSupplierGroupCode }
     *     
     */
    public PriceSpecificationSupplierGroupCode getPriceSpecificationSupplierGroupCode() {
        return priceSpecificationSupplierGroupCode;
    }

    /**
     * Define o valor da propriedade priceSpecificationSupplierGroupCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceSpecificationSupplierGroupCode }
     *     
     */
    public void setPriceSpecificationSupplierGroupCode(PriceSpecificationSupplierGroupCode value) {
        this.priceSpecificationSupplierGroupCode = value;
    }

    /**
     * Obtém o valor da propriedade priceSpecificationDeterminationDateTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceSpecificationDeterminationDateTypeCode() {
        return priceSpecificationDeterminationDateTypeCode;
    }

    /**
     * Define o valor da propriedade priceSpecificationDeterminationDateTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceSpecificationDeterminationDateTypeCode(String value) {
        this.priceSpecificationDeterminationDateTypeCode = value;
    }

    /**
     * Obtém o valor da propriedade expectedPurchasingDocumentItemConfirmationTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link PurchasingDocumentItemConfirmationTypeCode }
     *     
     */
    public PurchasingDocumentItemConfirmationTypeCode getExpectedPurchasingDocumentItemConfirmationTypeCode() {
        return expectedPurchasingDocumentItemConfirmationTypeCode;
    }

    /**
     * Define o valor da propriedade expectedPurchasingDocumentItemConfirmationTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchasingDocumentItemConfirmationTypeCode }
     *     
     */
    public void setExpectedPurchasingDocumentItemConfirmationTypeCode(PurchasingDocumentItemConfirmationTypeCode value) {
        this.expectedPurchasingDocumentItemConfirmationTypeCode = value;
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
     * Obtém o valor da propriedade roundingProfileCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getRoundingProfileCode() {
        return roundingProfileCode;
    }

    /**
     * Define o valor da propriedade roundingProfileCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setRoundingProfileCode(Code value) {
        this.roundingProfileCode = value;
    }

    /**
     * Obtém o valor da propriedade deliveryCyclePlanningCalendarCode.
     * 
     * @return
     *     possible object is
     *     {@link PlanningCalendarCode }
     *     
     */
    public PlanningCalendarCode getDeliveryCyclePlanningCalendarCode() {
        return deliveryCyclePlanningCalendarCode;
    }

    /**
     * Define o valor da propriedade deliveryCyclePlanningCalendarCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanningCalendarCode }
     *     
     */
    public void setDeliveryCyclePlanningCalendarCode(PlanningCalendarCode value) {
        this.deliveryCyclePlanningCalendarCode = value;
    }

    /**
     * Obtém o valor da propriedade planningCyclePlanningCalendarCode.
     * 
     * @return
     *     possible object is
     *     {@link PlanningCalendarCode }
     *     
     */
    public PlanningCalendarCode getPlanningCyclePlanningCalendarCode() {
        return planningCyclePlanningCalendarCode;
    }

    /**
     * Define o valor da propriedade planningCyclePlanningCalendarCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanningCalendarCode }
     *     
     */
    public void setPlanningCyclePlanningCalendarCode(PlanningCalendarCode value) {
        this.planningCyclePlanningCalendarCode = value;
    }

    /**
     * Obtém o valor da propriedade goodsMovementItemSortCriterionCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getGoodsMovementItemSortCriterionCode() {
        return goodsMovementItemSortCriterionCode;
    }

    /**
     * Define o valor da propriedade goodsMovementItemSortCriterionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setGoodsMovementItemSortCriterionCode(Code value) {
        this.goodsMovementItemSortCriterionCode = value;
    }

    /**
     * Obtém o valor da propriedade loadBuildingRestrictionProfileCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getLoadBuildingRestrictionProfileCode() {
        return loadBuildingRestrictionProfileCode;
    }

    /**
     * Define o valor da propriedade loadBuildingRestrictionProfileCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setLoadBuildingRestrictionProfileCode(Code value) {
        this.loadBuildingRestrictionProfileCode = value;
    }

    /**
     * Obtém o valor da propriedade dataTransferProfileCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getDataTransferProfileCode() {
        return dataTransferProfileCode;
    }

    /**
     * Define o valor da propriedade dataTransferProfileCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setDataTransferProfileCode(Code value) {
        this.dataTransferProfileCode = value;
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
     * Obtém o valor da propriedade deliveryBasedInvoiceVerificationIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeliveryBasedInvoiceVerificationIndicator() {
        return deliveryBasedInvoiceVerificationIndicator;
    }

    /**
     * Define o valor da propriedade deliveryBasedInvoiceVerificationIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeliveryBasedInvoiceVerificationIndicator(Boolean value) {
        this.deliveryBasedInvoiceVerificationIndicator = value;
    }

    /**
     * Obtém o valor da propriedade evaluatedReceiptSettlementIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEvaluatedReceiptSettlementIndicator() {
        return evaluatedReceiptSettlementIndicator;
    }

    /**
     * Define o valor da propriedade evaluatedReceiptSettlementIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEvaluatedReceiptSettlementIndicator(Boolean value) {
        this.evaluatedReceiptSettlementIndicator = value;
    }

    /**
     * Obtém o valor da propriedade automaticPurchaseOrderGenerationAllowedIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutomaticPurchaseOrderGenerationAllowedIndicator() {
        return automaticPurchaseOrderGenerationAllowedIndicator;
    }

    /**
     * Define o valor da propriedade automaticPurchaseOrderGenerationAllowedIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutomaticPurchaseOrderGenerationAllowedIndicator(Boolean value) {
        this.automaticPurchaseOrderGenerationAllowedIndicator = value;
    }

    /**
     * Obtém o valor da propriedade purchaseOrderBySupplierProvidedIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPurchaseOrderBySupplierProvidedIndicator() {
        return purchaseOrderBySupplierProvidedIndicator;
    }

    /**
     * Define o valor da propriedade purchaseOrderBySupplierProvidedIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPurchaseOrderBySupplierProvidedIndicator(Boolean value) {
        this.purchaseOrderBySupplierProvidedIndicator = value;
    }

    /**
     * Obtém o valor da propriedade discountInKindAllowedIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDiscountInKindAllowedIndicator() {
        return discountInKindAllowedIndicator;
    }

    /**
     * Define o valor da propriedade discountInKindAllowedIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDiscountInKindAllowedIndicator(Boolean value) {
        this.discountInKindAllowedIndicator = value;
    }

    /**
     * Obtém o valor da propriedade indexCompilationForSubsequentSettlementAllowedIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndexCompilationForSubsequentSettlementAllowedIndicator() {
        return indexCompilationForSubsequentSettlementAllowedIndicator;
    }

    /**
     * Define o valor da propriedade indexCompilationForSubsequentSettlementAllowedIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndexCompilationForSubsequentSettlementAllowedIndicator(Boolean value) {
        this.indexCompilationForSubsequentSettlementAllowedIndicator = value;
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
     * Obtém o valor da propriedade revaluationAllowedIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRevaluationAllowedIndicator() {
        return revaluationAllowedIndicator;
    }

    /**
     * Define o valor da propriedade revaluationAllowedIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRevaluationAllowedIndicator(Boolean value) {
        this.revaluationAllowedIndicator = value;
    }

    /**
     * Obtém o valor da propriedade serviceBasedInvoiceVerificationIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceBasedInvoiceVerificationIndicator() {
        return serviceBasedInvoiceVerificationIndicator;
    }

    /**
     * Define o valor da propriedade serviceBasedInvoiceVerificationIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceBasedInvoiceVerificationIndicator(Boolean value) {
        this.serviceBasedInvoiceVerificationIndicator = value;
    }

    /**
     * Obtém o valor da propriedade subsequentSettlementApplyIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubsequentSettlementApplyIndicator() {
        return subsequentSettlementApplyIndicator;
    }

    /**
     * Define o valor da propriedade subsequentSettlementApplyIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubsequentSettlementApplyIndicator(Boolean value) {
        this.subsequentSettlementApplyIndicator = value;
    }

    /**
     * Obtém o valor da propriedade businessVolumeComparisonRequiredIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBusinessVolumeComparisonRequiredIndicator() {
        return businessVolumeComparisonRequiredIndicator;
    }

    /**
     * Define o valor da propriedade businessVolumeComparisonRequiredIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBusinessVolumeComparisonRequiredIndicator(Boolean value) {
        this.businessVolumeComparisonRequiredIndicator = value;
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
     * Obtém o valor da propriedade rackJobbingIncludedIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRackJobbingIncludedIndicator() {
        return rackJobbingIncludedIndicator;
    }

    /**
     * Define o valor da propriedade rackJobbingIncludedIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRackJobbingIncludedIndicator(Boolean value) {
        this.rackJobbingIncludedIndicator = value;
    }

    /**
     * Obtém o valor da propriedade priceMakingAgreementTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getPriceMakingAgreementTypeCode() {
        return priceMakingAgreementTypeCode;
    }

    /**
     * Define o valor da propriedade priceMakingAgreementTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setPriceMakingAgreementTypeCode(Code value) {
        this.priceMakingAgreementTypeCode = value;
    }

    /**
     * Obtém o valor da propriedade orderMinimumAmount.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getOrderMinimumAmount() {
        return orderMinimumAmount;
    }

    /**
     * Define o valor da propriedade orderMinimumAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setOrderMinimumAmount(Amount value) {
        this.orderMinimumAmount = value;
    }

    /**
     * Obtém o valor da propriedade plannedDeliveryDuration.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlannedDeliveryDuration() {
        return plannedDeliveryDuration;
    }

    /**
     * Define o valor da propriedade plannedDeliveryDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlannedDeliveryDuration(String value) {
        this.plannedDeliveryDuration = value;
    }

    /**
     * Obtém o valor da propriedade salesVolumeFulfillmentPercent.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSalesVolumeFulfillmentPercent() {
        return salesVolumeFulfillmentPercent;
    }

    /**
     * Define o valor da propriedade salesVolumeFulfillmentPercent.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSalesVolumeFulfillmentPercent(BigDecimal value) {
        this.salesVolumeFulfillmentPercent = value;
    }

    /**
     * Obtém o valor da propriedade purchaseOrderConfirmationRequirementCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseOrderConfirmationRequirementCode() {
        return purchaseOrderConfirmationRequirementCode;
    }

    /**
     * Define o valor da propriedade purchaseOrderConfirmationRequirementCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseOrderConfirmationRequirementCode(String value) {
        this.purchaseOrderConfirmationRequirementCode = value;
    }

    /**
     * Obtém o valor da propriedade invoiceConfirmationRequirementCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceConfirmationRequirementCode() {
        return invoiceConfirmationRequirementCode;
    }

    /**
     * Define o valor da propriedade invoiceConfirmationRequirementCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceConfirmationRequirementCode(String value) {
        this.invoiceConfirmationRequirementCode = value;
    }

    /**
     * Obtém o valor da propriedade followUpDespatchedDeliveryNotificationRequirementCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFollowUpDespatchedDeliveryNotificationRequirementCode() {
        return followUpDespatchedDeliveryNotificationRequirementCode;
    }

    /**
     * Define o valor da propriedade followUpDespatchedDeliveryNotificationRequirementCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFollowUpDespatchedDeliveryNotificationRequirementCode(String value) {
        this.followUpDespatchedDeliveryNotificationRequirementCode = value;
    }

    /**
     * Obtém o valor da propriedade followUpGoodsReceiptRequestRequirementCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFollowUpGoodsReceiptRequestRequirementCode() {
        return followUpGoodsReceiptRequestRequirementCode;
    }

    /**
     * Define o valor da propriedade followUpGoodsReceiptRequestRequirementCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFollowUpGoodsReceiptRequestRequirementCode(String value) {
        this.followUpGoodsReceiptRequestRequirementCode = value;
    }

    /**
     * Obtém o valor da propriedade incoterms.
     * 
     * @return
     *     possible object is
     *     {@link Incoterms }
     *     
     */
    public Incoterms getIncoterms() {
        return incoterms;
    }

    /**
     * Define o valor da propriedade incoterms.
     * 
     * @param value
     *     allowed object is
     *     {@link Incoterms }
     *     
     */
    public void setIncoterms(Incoterms value) {
        this.incoterms = value;
    }

}
