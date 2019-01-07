
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import java.math.BigDecimal;
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
 * <p>Classe Java de BPSUITERplctReqCustAcctgInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPSUITERplctReqCustAcctgInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CompanyID" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *         &lt;element name="EmployeeID" type="{http://ariba.com/xi/SupplierManagement}EmployeeID" minOccurs="0"/&gt;
 *         &lt;element name="BlockedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DeletedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SortCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="AccountingClerkInitialsCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="GeneralLedgerAccountReference" type="{http://ariba.com/xi/SupplierManagement}GeneralLedgerAccountReference" minOccurs="0"/&gt;
 *         &lt;element name="AuthorisationGroupCode" type="{http://ariba.com/xi/SupplierManagement}AuthorisationGroupCode" minOccurs="0"/&gt;
 *         &lt;element name="HeadOfficeAccountInternalID" type="{http://ariba.com/xi/SupplierManagement}PartyInternalID" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverHeadOfficeAccountInternalID" type="{http://ariba.com/xi/SupplierManagement}PartyInternalID" minOccurs="0"/&gt;
 *         &lt;element name="AlternativePayeePartyInternalID" type="{http://ariba.com/xi/SupplierManagement}PartyInternalID" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverAlternativePayeePartyInternalID" type="{http://ariba.com/xi/SupplierManagement}PartyInternalID" minOccurs="0"/&gt;
 *         &lt;element name="PaymentNoticeCustomerClearedItemsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PaymentNoticeSalesDepartmentIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PaymentNoticeLegalDepartmentIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PaymentNoticeAccountingIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PaymentNoticeCustomerWithoutClearedItemsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PaymentMethodsCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="CustomerSupplierClearingIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PaymentBlockCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="CashDiscountTermsCode" type="{http://ariba.com/xi/SupplierManagement}CashDiscountTermsCode" minOccurs="0"/&gt;
 *         &lt;element name="BillOfExchangeChargesCashDiscountTermsCode" type="{http://ariba.com/xi/SupplierManagement}CashDiscountTermsCode" minOccurs="0"/&gt;
 *         &lt;element name="InterestCalculationInclusionCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="LastInterestCalculationKeyDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="InterestCalculationFrequencyCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="DebtorPartyCreditorID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="EmployeeResponsiblePartyName" type="{http://ariba.com/xi/SupplierManagement}MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PlanningGroupCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="ExportCreditInsuranceInstitutionID" type="{http://ariba.com/xi/SupplierManagement}Identifier" minOccurs="0"/&gt;
 *         &lt;element name="InsuredAmount" type="{http://ariba.com/xi/SupplierManagement}Amount" minOccurs="0"/&gt;
 *         &lt;element name="InsuranceLeadDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeductiblePercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="InsuranceID" type="{http://ariba.com/xi/SupplierManagement}Identifier" minOccurs="0"/&gt;
 *         &lt;element name="InsuranceValidityDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="CollectiveInvoiceVariantID" type="{http://ariba.com/xi/SupplierManagement}Identifier" minOccurs="0"/&gt;
 *         &lt;element name="LocalProcessingIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PeriodicAccountStatementsCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="BillOfExchangeLimitAmount" type="{http://ariba.com/xi/SupplierManagement}Amount" minOccurs="0"/&gt;
 *         &lt;element name="NextPayeeInternalID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverNextPayeeInternalID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="LastInterestCalculationRunDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="RecordPaymentHistoryIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BusinessPartnerToleranceGroupCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="ProbableCheckPaidDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HouseBankInternalID" type="{http://ariba.com/xi/SupplierManagement}BankInternalID" minOccurs="0"/&gt;
 *         &lt;element name="PayItemsSeparatelyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReductionRatesDeterminationCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="PreviousCustomerInternalID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="PaymentGroupingCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="LeaveReasonCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="DunningNoticeGroupingCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="LockboxCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="PaymentMethodSupplementCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="BuyingGroupInternalID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverBuyingGroupInternalID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="PaymentAdvicesSelectionRuleCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="PaymentAdvicesByEDIIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReleaseApprovalGroupCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="ConversionVersionReasonCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="EmployeeResponsiblePartyTelephoneFormattedNumberDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmployeeResponsiblePartyFaxFormattedNumberDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmployeeResponsiblePartyWebAddress" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="CreditMemosPaymentTermsCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="ValueAdjustmentCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="DeletionBlockedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AccountsReceivablePledgingCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="DunningInformation" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqDunInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="WithholdingTax" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqCustWhldgTx" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AccountingText" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="actionCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="dunningInformationListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="withholdingTaxListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="accountingTextListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BPSUITERplctReqCustAcctgInfo", propOrder = {
    "companyID",
    "employeeID",
    "blockedIndicator",
    "deletedIndicator",
    "sortCode",
    "accountingClerkInitialsCode",
    "generalLedgerAccountReference",
    "authorisationGroupCode",
    "headOfficeAccountInternalID",
    "receiverHeadOfficeAccountInternalID",
    "alternativePayeePartyInternalID",
    "receiverAlternativePayeePartyInternalID",
    "paymentNoticeCustomerClearedItemsIndicator",
    "paymentNoticeSalesDepartmentIndicator",
    "paymentNoticeLegalDepartmentIndicator",
    "paymentNoticeAccountingIndicator",
    "paymentNoticeCustomerWithoutClearedItemsIndicator",
    "paymentMethodsCode",
    "customerSupplierClearingIndicator",
    "paymentBlockCode",
    "cashDiscountTermsCode",
    "billOfExchangeChargesCashDiscountTermsCode",
    "interestCalculationInclusionCode",
    "lastInterestCalculationKeyDate",
    "interestCalculationFrequencyCode",
    "debtorPartyCreditorID",
    "employeeResponsiblePartyName",
    "note",
    "planningGroupCode",
    "exportCreditInsuranceInstitutionID",
    "insuredAmount",
    "insuranceLeadDuration",
    "deductiblePercent",
    "insuranceID",
    "insuranceValidityDate",
    "collectiveInvoiceVariantID",
    "localProcessingIndicator",
    "periodicAccountStatementsCode",
    "billOfExchangeLimitAmount",
    "nextPayeeInternalID",
    "receiverNextPayeeInternalID",
    "lastInterestCalculationRunDate",
    "recordPaymentHistoryIndicator",
    "businessPartnerToleranceGroupCode",
    "probableCheckPaidDuration",
    "houseBankInternalID",
    "payItemsSeparatelyIndicator",
    "reductionRatesDeterminationCode",
    "previousCustomerInternalID",
    "paymentGroupingCode",
    "leaveReasonCode",
    "dunningNoticeGroupingCode",
    "lockboxCode",
    "paymentMethodSupplementCode",
    "buyingGroupInternalID",
    "receiverBuyingGroupInternalID",
    "paymentAdvicesSelectionRuleCode",
    "paymentAdvicesByEDIIndicator",
    "releaseApprovalGroupCode",
    "conversionVersionReasonCode",
    "employeeResponsiblePartyTelephoneFormattedNumberDescription",
    "employeeResponsiblePartyFaxFormattedNumberDescription",
    "employeeResponsiblePartyWebAddress",
    "creditMemosPaymentTermsCode",
    "valueAdjustmentCode",
    "deletionBlockedIndicator",
    "accountsReceivablePledgingCode",
    "dunningInformation",
    "withholdingTax",
    "accountingText"
})
public class BPSUITERplctReqCustAcctgInfo {

    @XmlElement(name = "CompanyID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String companyID;
    @XmlElement(name = "EmployeeID")
    protected EmployeeID employeeID;
    @XmlElement(name = "BlockedIndicator")
    protected Boolean blockedIndicator;
    @XmlElement(name = "DeletedIndicator")
    protected Boolean deletedIndicator;
    @XmlElement(name = "SortCode")
    protected Code sortCode;
    @XmlElement(name = "AccountingClerkInitialsCode")
    protected Code accountingClerkInitialsCode;
    @XmlElement(name = "GeneralLedgerAccountReference")
    protected GeneralLedgerAccountReference generalLedgerAccountReference;
    @XmlElement(name = "AuthorisationGroupCode")
    protected AuthorisationGroupCode authorisationGroupCode;
    @XmlElement(name = "HeadOfficeAccountInternalID")
    protected PartyInternalID headOfficeAccountInternalID;
    @XmlElement(name = "ReceiverHeadOfficeAccountInternalID")
    protected PartyInternalID receiverHeadOfficeAccountInternalID;
    @XmlElement(name = "AlternativePayeePartyInternalID")
    protected PartyInternalID alternativePayeePartyInternalID;
    @XmlElement(name = "ReceiverAlternativePayeePartyInternalID")
    protected PartyInternalID receiverAlternativePayeePartyInternalID;
    @XmlElement(name = "PaymentNoticeCustomerClearedItemsIndicator")
    protected Boolean paymentNoticeCustomerClearedItemsIndicator;
    @XmlElement(name = "PaymentNoticeSalesDepartmentIndicator")
    protected Boolean paymentNoticeSalesDepartmentIndicator;
    @XmlElement(name = "PaymentNoticeLegalDepartmentIndicator")
    protected Boolean paymentNoticeLegalDepartmentIndicator;
    @XmlElement(name = "PaymentNoticeAccountingIndicator")
    protected Boolean paymentNoticeAccountingIndicator;
    @XmlElement(name = "PaymentNoticeCustomerWithoutClearedItemsIndicator")
    protected Boolean paymentNoticeCustomerWithoutClearedItemsIndicator;
    @XmlElement(name = "PaymentMethodsCode")
    protected Code paymentMethodsCode;
    @XmlElement(name = "CustomerSupplierClearingIndicator")
    protected Boolean customerSupplierClearingIndicator;
    @XmlElement(name = "PaymentBlockCode")
    protected Code paymentBlockCode;
    @XmlElement(name = "CashDiscountTermsCode")
    protected CashDiscountTermsCode cashDiscountTermsCode;
    @XmlElement(name = "BillOfExchangeChargesCashDiscountTermsCode")
    protected CashDiscountTermsCode billOfExchangeChargesCashDiscountTermsCode;
    @XmlElement(name = "InterestCalculationInclusionCode")
    protected Code interestCalculationInclusionCode;
    @XmlElement(name = "LastInterestCalculationKeyDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastInterestCalculationKeyDate;
    @XmlElement(name = "InterestCalculationFrequencyCode")
    protected Code interestCalculationFrequencyCode;
    @XmlElement(name = "DebtorPartyCreditorID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String debtorPartyCreditorID;
    @XmlElement(name = "EmployeeResponsiblePartyName")
    protected MEDIUMName employeeResponsiblePartyName;
    @XmlElement(name = "Note")
    protected String note;
    @XmlElement(name = "PlanningGroupCode")
    protected Code planningGroupCode;
    @XmlElement(name = "ExportCreditInsuranceInstitutionID")
    protected Identifier exportCreditInsuranceInstitutionID;
    @XmlElement(name = "InsuredAmount")
    protected Amount insuredAmount;
    @XmlElement(name = "InsuranceLeadDuration")
    protected String insuranceLeadDuration;
    @XmlElement(name = "DeductiblePercent")
    protected BigDecimal deductiblePercent;
    @XmlElement(name = "InsuranceID")
    protected Identifier insuranceID;
    @XmlElement(name = "InsuranceValidityDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar insuranceValidityDate;
    @XmlElement(name = "CollectiveInvoiceVariantID")
    protected Identifier collectiveInvoiceVariantID;
    @XmlElement(name = "LocalProcessingIndicator")
    protected Boolean localProcessingIndicator;
    @XmlElement(name = "PeriodicAccountStatementsCode")
    protected Code periodicAccountStatementsCode;
    @XmlElement(name = "BillOfExchangeLimitAmount")
    protected Amount billOfExchangeLimitAmount;
    @XmlElement(name = "NextPayeeInternalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String nextPayeeInternalID;
    @XmlElement(name = "ReceiverNextPayeeInternalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String receiverNextPayeeInternalID;
    @XmlElement(name = "LastInterestCalculationRunDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastInterestCalculationRunDate;
    @XmlElement(name = "RecordPaymentHistoryIndicator")
    protected Boolean recordPaymentHistoryIndicator;
    @XmlElement(name = "BusinessPartnerToleranceGroupCode")
    protected Code businessPartnerToleranceGroupCode;
    @XmlElement(name = "ProbableCheckPaidDuration")
    protected String probableCheckPaidDuration;
    @XmlElement(name = "HouseBankInternalID")
    protected BankInternalID houseBankInternalID;
    @XmlElement(name = "PayItemsSeparatelyIndicator")
    protected Boolean payItemsSeparatelyIndicator;
    @XmlElement(name = "ReductionRatesDeterminationCode")
    protected Code reductionRatesDeterminationCode;
    @XmlElement(name = "PreviousCustomerInternalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String previousCustomerInternalID;
    @XmlElement(name = "PaymentGroupingCode")
    protected Code paymentGroupingCode;
    @XmlElement(name = "LeaveReasonCode")
    protected Code leaveReasonCode;
    @XmlElement(name = "DunningNoticeGroupingCode")
    protected Code dunningNoticeGroupingCode;
    @XmlElement(name = "LockboxCode")
    protected Code lockboxCode;
    @XmlElement(name = "PaymentMethodSupplementCode")
    protected Code paymentMethodSupplementCode;
    @XmlElement(name = "BuyingGroupInternalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String buyingGroupInternalID;
    @XmlElement(name = "ReceiverBuyingGroupInternalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String receiverBuyingGroupInternalID;
    @XmlElement(name = "PaymentAdvicesSelectionRuleCode")
    protected Code paymentAdvicesSelectionRuleCode;
    @XmlElement(name = "PaymentAdvicesByEDIIndicator")
    protected Boolean paymentAdvicesByEDIIndicator;
    @XmlElement(name = "ReleaseApprovalGroupCode")
    protected Code releaseApprovalGroupCode;
    @XmlElement(name = "ConversionVersionReasonCode")
    protected Code conversionVersionReasonCode;
    @XmlElement(name = "EmployeeResponsiblePartyTelephoneFormattedNumberDescription")
    protected String employeeResponsiblePartyTelephoneFormattedNumberDescription;
    @XmlElement(name = "EmployeeResponsiblePartyFaxFormattedNumberDescription")
    protected String employeeResponsiblePartyFaxFormattedNumberDescription;
    @XmlElement(name = "EmployeeResponsiblePartyWebAddress")
    @XmlSchemaType(name = "anyURI")
    protected String employeeResponsiblePartyWebAddress;
    @XmlElement(name = "CreditMemosPaymentTermsCode")
    protected Code creditMemosPaymentTermsCode;
    @XmlElement(name = "ValueAdjustmentCode")
    protected Code valueAdjustmentCode;
    @XmlElement(name = "DeletionBlockedIndicator")
    protected Boolean deletionBlockedIndicator;
    @XmlElement(name = "AccountsReceivablePledgingCode")
    protected Code accountsReceivablePledgingCode;
    @XmlElement(name = "DunningInformation")
    protected List<BPSUITERplctReqDunInfo> dunningInformation;
    @XmlElement(name = "WithholdingTax")
    protected List<BPSUITERplctReqCustWhldgTx> withholdingTax;
    @XmlElement(name = "AccountingText")
    protected List<BPSUITERplctReqText> accountingText;
    @XmlAttribute(name = "actionCode")
    protected String actionCode;
    @XmlAttribute(name = "dunningInformationListCompleteTransmissionIndicator")
    protected Boolean dunningInformationListCompleteTransmissionIndicator;
    @XmlAttribute(name = "withholdingTaxListCompleteTransmissionIndicator")
    protected Boolean withholdingTaxListCompleteTransmissionIndicator;
    @XmlAttribute(name = "accountingTextListCompleteTransmissionIndicator")
    protected Boolean accountingTextListCompleteTransmissionIndicator;

    /**
     * Obtém o valor da propriedade companyID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyID() {
        return companyID;
    }

    /**
     * Define o valor da propriedade companyID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyID(String value) {
        this.companyID = value;
    }

    /**
     * Obtém o valor da propriedade employeeID.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeID }
     *     
     */
    public EmployeeID getEmployeeID() {
        return employeeID;
    }

    /**
     * Define o valor da propriedade employeeID.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeID }
     *     
     */
    public void setEmployeeID(EmployeeID value) {
        this.employeeID = value;
    }

    /**
     * Obtém o valor da propriedade blockedIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBlockedIndicator() {
        return blockedIndicator;
    }

    /**
     * Define o valor da propriedade blockedIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBlockedIndicator(Boolean value) {
        this.blockedIndicator = value;
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
     * Obtém o valor da propriedade sortCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getSortCode() {
        return sortCode;
    }

    /**
     * Define o valor da propriedade sortCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setSortCode(Code value) {
        this.sortCode = value;
    }

    /**
     * Obtém o valor da propriedade accountingClerkInitialsCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getAccountingClerkInitialsCode() {
        return accountingClerkInitialsCode;
    }

    /**
     * Define o valor da propriedade accountingClerkInitialsCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setAccountingClerkInitialsCode(Code value) {
        this.accountingClerkInitialsCode = value;
    }

    /**
     * Obtém o valor da propriedade generalLedgerAccountReference.
     * 
     * @return
     *     possible object is
     *     {@link GeneralLedgerAccountReference }
     *     
     */
    public GeneralLedgerAccountReference getGeneralLedgerAccountReference() {
        return generalLedgerAccountReference;
    }

    /**
     * Define o valor da propriedade generalLedgerAccountReference.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralLedgerAccountReference }
     *     
     */
    public void setGeneralLedgerAccountReference(GeneralLedgerAccountReference value) {
        this.generalLedgerAccountReference = value;
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
     * Obtém o valor da propriedade headOfficeAccountInternalID.
     * 
     * @return
     *     possible object is
     *     {@link PartyInternalID }
     *     
     */
    public PartyInternalID getHeadOfficeAccountInternalID() {
        return headOfficeAccountInternalID;
    }

    /**
     * Define o valor da propriedade headOfficeAccountInternalID.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyInternalID }
     *     
     */
    public void setHeadOfficeAccountInternalID(PartyInternalID value) {
        this.headOfficeAccountInternalID = value;
    }

    /**
     * Obtém o valor da propriedade receiverHeadOfficeAccountInternalID.
     * 
     * @return
     *     possible object is
     *     {@link PartyInternalID }
     *     
     */
    public PartyInternalID getReceiverHeadOfficeAccountInternalID() {
        return receiverHeadOfficeAccountInternalID;
    }

    /**
     * Define o valor da propriedade receiverHeadOfficeAccountInternalID.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyInternalID }
     *     
     */
    public void setReceiverHeadOfficeAccountInternalID(PartyInternalID value) {
        this.receiverHeadOfficeAccountInternalID = value;
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
     * Obtém o valor da propriedade paymentNoticeCustomerClearedItemsIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaymentNoticeCustomerClearedItemsIndicator() {
        return paymentNoticeCustomerClearedItemsIndicator;
    }

    /**
     * Define o valor da propriedade paymentNoticeCustomerClearedItemsIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaymentNoticeCustomerClearedItemsIndicator(Boolean value) {
        this.paymentNoticeCustomerClearedItemsIndicator = value;
    }

    /**
     * Obtém o valor da propriedade paymentNoticeSalesDepartmentIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaymentNoticeSalesDepartmentIndicator() {
        return paymentNoticeSalesDepartmentIndicator;
    }

    /**
     * Define o valor da propriedade paymentNoticeSalesDepartmentIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaymentNoticeSalesDepartmentIndicator(Boolean value) {
        this.paymentNoticeSalesDepartmentIndicator = value;
    }

    /**
     * Obtém o valor da propriedade paymentNoticeLegalDepartmentIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaymentNoticeLegalDepartmentIndicator() {
        return paymentNoticeLegalDepartmentIndicator;
    }

    /**
     * Define o valor da propriedade paymentNoticeLegalDepartmentIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaymentNoticeLegalDepartmentIndicator(Boolean value) {
        this.paymentNoticeLegalDepartmentIndicator = value;
    }

    /**
     * Obtém o valor da propriedade paymentNoticeAccountingIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaymentNoticeAccountingIndicator() {
        return paymentNoticeAccountingIndicator;
    }

    /**
     * Define o valor da propriedade paymentNoticeAccountingIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaymentNoticeAccountingIndicator(Boolean value) {
        this.paymentNoticeAccountingIndicator = value;
    }

    /**
     * Obtém o valor da propriedade paymentNoticeCustomerWithoutClearedItemsIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaymentNoticeCustomerWithoutClearedItemsIndicator() {
        return paymentNoticeCustomerWithoutClearedItemsIndicator;
    }

    /**
     * Define o valor da propriedade paymentNoticeCustomerWithoutClearedItemsIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaymentNoticeCustomerWithoutClearedItemsIndicator(Boolean value) {
        this.paymentNoticeCustomerWithoutClearedItemsIndicator = value;
    }

    /**
     * Obtém o valor da propriedade paymentMethodsCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getPaymentMethodsCode() {
        return paymentMethodsCode;
    }

    /**
     * Define o valor da propriedade paymentMethodsCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setPaymentMethodsCode(Code value) {
        this.paymentMethodsCode = value;
    }

    /**
     * Obtém o valor da propriedade customerSupplierClearingIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomerSupplierClearingIndicator() {
        return customerSupplierClearingIndicator;
    }

    /**
     * Define o valor da propriedade customerSupplierClearingIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomerSupplierClearingIndicator(Boolean value) {
        this.customerSupplierClearingIndicator = value;
    }

    /**
     * Obtém o valor da propriedade paymentBlockCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getPaymentBlockCode() {
        return paymentBlockCode;
    }

    /**
     * Define o valor da propriedade paymentBlockCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setPaymentBlockCode(Code value) {
        this.paymentBlockCode = value;
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
     * Obtém o valor da propriedade billOfExchangeChargesCashDiscountTermsCode.
     * 
     * @return
     *     possible object is
     *     {@link CashDiscountTermsCode }
     *     
     */
    public CashDiscountTermsCode getBillOfExchangeChargesCashDiscountTermsCode() {
        return billOfExchangeChargesCashDiscountTermsCode;
    }

    /**
     * Define o valor da propriedade billOfExchangeChargesCashDiscountTermsCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CashDiscountTermsCode }
     *     
     */
    public void setBillOfExchangeChargesCashDiscountTermsCode(CashDiscountTermsCode value) {
        this.billOfExchangeChargesCashDiscountTermsCode = value;
    }

    /**
     * Obtém o valor da propriedade interestCalculationInclusionCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getInterestCalculationInclusionCode() {
        return interestCalculationInclusionCode;
    }

    /**
     * Define o valor da propriedade interestCalculationInclusionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setInterestCalculationInclusionCode(Code value) {
        this.interestCalculationInclusionCode = value;
    }

    /**
     * Obtém o valor da propriedade lastInterestCalculationKeyDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastInterestCalculationKeyDate() {
        return lastInterestCalculationKeyDate;
    }

    /**
     * Define o valor da propriedade lastInterestCalculationKeyDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastInterestCalculationKeyDate(XMLGregorianCalendar value) {
        this.lastInterestCalculationKeyDate = value;
    }

    /**
     * Obtém o valor da propriedade interestCalculationFrequencyCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getInterestCalculationFrequencyCode() {
        return interestCalculationFrequencyCode;
    }

    /**
     * Define o valor da propriedade interestCalculationFrequencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setInterestCalculationFrequencyCode(Code value) {
        this.interestCalculationFrequencyCode = value;
    }

    /**
     * Obtém o valor da propriedade debtorPartyCreditorID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebtorPartyCreditorID() {
        return debtorPartyCreditorID;
    }

    /**
     * Define o valor da propriedade debtorPartyCreditorID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebtorPartyCreditorID(String value) {
        this.debtorPartyCreditorID = value;
    }

    /**
     * Obtém o valor da propriedade employeeResponsiblePartyName.
     * 
     * @return
     *     possible object is
     *     {@link MEDIUMName }
     *     
     */
    public MEDIUMName getEmployeeResponsiblePartyName() {
        return employeeResponsiblePartyName;
    }

    /**
     * Define o valor da propriedade employeeResponsiblePartyName.
     * 
     * @param value
     *     allowed object is
     *     {@link MEDIUMName }
     *     
     */
    public void setEmployeeResponsiblePartyName(MEDIUMName value) {
        this.employeeResponsiblePartyName = value;
    }

    /**
     * Obtém o valor da propriedade note.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Define o valor da propriedade note.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Obtém o valor da propriedade planningGroupCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getPlanningGroupCode() {
        return planningGroupCode;
    }

    /**
     * Define o valor da propriedade planningGroupCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setPlanningGroupCode(Code value) {
        this.planningGroupCode = value;
    }

    /**
     * Obtém o valor da propriedade exportCreditInsuranceInstitutionID.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getExportCreditInsuranceInstitutionID() {
        return exportCreditInsuranceInstitutionID;
    }

    /**
     * Define o valor da propriedade exportCreditInsuranceInstitutionID.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setExportCreditInsuranceInstitutionID(Identifier value) {
        this.exportCreditInsuranceInstitutionID = value;
    }

    /**
     * Obtém o valor da propriedade insuredAmount.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getInsuredAmount() {
        return insuredAmount;
    }

    /**
     * Define o valor da propriedade insuredAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setInsuredAmount(Amount value) {
        this.insuredAmount = value;
    }

    /**
     * Obtém o valor da propriedade insuranceLeadDuration.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceLeadDuration() {
        return insuranceLeadDuration;
    }

    /**
     * Define o valor da propriedade insuranceLeadDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceLeadDuration(String value) {
        this.insuranceLeadDuration = value;
    }

    /**
     * Obtém o valor da propriedade deductiblePercent.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeductiblePercent() {
        return deductiblePercent;
    }

    /**
     * Define o valor da propriedade deductiblePercent.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeductiblePercent(BigDecimal value) {
        this.deductiblePercent = value;
    }

    /**
     * Obtém o valor da propriedade insuranceID.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getInsuranceID() {
        return insuranceID;
    }

    /**
     * Define o valor da propriedade insuranceID.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setInsuranceID(Identifier value) {
        this.insuranceID = value;
    }

    /**
     * Obtém o valor da propriedade insuranceValidityDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInsuranceValidityDate() {
        return insuranceValidityDate;
    }

    /**
     * Define o valor da propriedade insuranceValidityDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInsuranceValidityDate(XMLGregorianCalendar value) {
        this.insuranceValidityDate = value;
    }

    /**
     * Obtém o valor da propriedade collectiveInvoiceVariantID.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getCollectiveInvoiceVariantID() {
        return collectiveInvoiceVariantID;
    }

    /**
     * Define o valor da propriedade collectiveInvoiceVariantID.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setCollectiveInvoiceVariantID(Identifier value) {
        this.collectiveInvoiceVariantID = value;
    }

    /**
     * Obtém o valor da propriedade localProcessingIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalProcessingIndicator() {
        return localProcessingIndicator;
    }

    /**
     * Define o valor da propriedade localProcessingIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalProcessingIndicator(Boolean value) {
        this.localProcessingIndicator = value;
    }

    /**
     * Obtém o valor da propriedade periodicAccountStatementsCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getPeriodicAccountStatementsCode() {
        return periodicAccountStatementsCode;
    }

    /**
     * Define o valor da propriedade periodicAccountStatementsCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setPeriodicAccountStatementsCode(Code value) {
        this.periodicAccountStatementsCode = value;
    }

    /**
     * Obtém o valor da propriedade billOfExchangeLimitAmount.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getBillOfExchangeLimitAmount() {
        return billOfExchangeLimitAmount;
    }

    /**
     * Define o valor da propriedade billOfExchangeLimitAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setBillOfExchangeLimitAmount(Amount value) {
        this.billOfExchangeLimitAmount = value;
    }

    /**
     * Obtém o valor da propriedade nextPayeeInternalID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextPayeeInternalID() {
        return nextPayeeInternalID;
    }

    /**
     * Define o valor da propriedade nextPayeeInternalID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextPayeeInternalID(String value) {
        this.nextPayeeInternalID = value;
    }

    /**
     * Obtém o valor da propriedade receiverNextPayeeInternalID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverNextPayeeInternalID() {
        return receiverNextPayeeInternalID;
    }

    /**
     * Define o valor da propriedade receiverNextPayeeInternalID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverNextPayeeInternalID(String value) {
        this.receiverNextPayeeInternalID = value;
    }

    /**
     * Obtém o valor da propriedade lastInterestCalculationRunDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastInterestCalculationRunDate() {
        return lastInterestCalculationRunDate;
    }

    /**
     * Define o valor da propriedade lastInterestCalculationRunDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastInterestCalculationRunDate(XMLGregorianCalendar value) {
        this.lastInterestCalculationRunDate = value;
    }

    /**
     * Obtém o valor da propriedade recordPaymentHistoryIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecordPaymentHistoryIndicator() {
        return recordPaymentHistoryIndicator;
    }

    /**
     * Define o valor da propriedade recordPaymentHistoryIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecordPaymentHistoryIndicator(Boolean value) {
        this.recordPaymentHistoryIndicator = value;
    }

    /**
     * Obtém o valor da propriedade businessPartnerToleranceGroupCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getBusinessPartnerToleranceGroupCode() {
        return businessPartnerToleranceGroupCode;
    }

    /**
     * Define o valor da propriedade businessPartnerToleranceGroupCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setBusinessPartnerToleranceGroupCode(Code value) {
        this.businessPartnerToleranceGroupCode = value;
    }

    /**
     * Obtém o valor da propriedade probableCheckPaidDuration.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProbableCheckPaidDuration() {
        return probableCheckPaidDuration;
    }

    /**
     * Define o valor da propriedade probableCheckPaidDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProbableCheckPaidDuration(String value) {
        this.probableCheckPaidDuration = value;
    }

    /**
     * Obtém o valor da propriedade houseBankInternalID.
     * 
     * @return
     *     possible object is
     *     {@link BankInternalID }
     *     
     */
    public BankInternalID getHouseBankInternalID() {
        return houseBankInternalID;
    }

    /**
     * Define o valor da propriedade houseBankInternalID.
     * 
     * @param value
     *     allowed object is
     *     {@link BankInternalID }
     *     
     */
    public void setHouseBankInternalID(BankInternalID value) {
        this.houseBankInternalID = value;
    }

    /**
     * Obtém o valor da propriedade payItemsSeparatelyIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPayItemsSeparatelyIndicator() {
        return payItemsSeparatelyIndicator;
    }

    /**
     * Define o valor da propriedade payItemsSeparatelyIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPayItemsSeparatelyIndicator(Boolean value) {
        this.payItemsSeparatelyIndicator = value;
    }

    /**
     * Obtém o valor da propriedade reductionRatesDeterminationCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getReductionRatesDeterminationCode() {
        return reductionRatesDeterminationCode;
    }

    /**
     * Define o valor da propriedade reductionRatesDeterminationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setReductionRatesDeterminationCode(Code value) {
        this.reductionRatesDeterminationCode = value;
    }

    /**
     * Obtém o valor da propriedade previousCustomerInternalID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousCustomerInternalID() {
        return previousCustomerInternalID;
    }

    /**
     * Define o valor da propriedade previousCustomerInternalID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousCustomerInternalID(String value) {
        this.previousCustomerInternalID = value;
    }

    /**
     * Obtém o valor da propriedade paymentGroupingCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getPaymentGroupingCode() {
        return paymentGroupingCode;
    }

    /**
     * Define o valor da propriedade paymentGroupingCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setPaymentGroupingCode(Code value) {
        this.paymentGroupingCode = value;
    }

    /**
     * Obtém o valor da propriedade leaveReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getLeaveReasonCode() {
        return leaveReasonCode;
    }

    /**
     * Define o valor da propriedade leaveReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setLeaveReasonCode(Code value) {
        this.leaveReasonCode = value;
    }

    /**
     * Obtém o valor da propriedade dunningNoticeGroupingCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getDunningNoticeGroupingCode() {
        return dunningNoticeGroupingCode;
    }

    /**
     * Define o valor da propriedade dunningNoticeGroupingCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setDunningNoticeGroupingCode(Code value) {
        this.dunningNoticeGroupingCode = value;
    }

    /**
     * Obtém o valor da propriedade lockboxCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getLockboxCode() {
        return lockboxCode;
    }

    /**
     * Define o valor da propriedade lockboxCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setLockboxCode(Code value) {
        this.lockboxCode = value;
    }

    /**
     * Obtém o valor da propriedade paymentMethodSupplementCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getPaymentMethodSupplementCode() {
        return paymentMethodSupplementCode;
    }

    /**
     * Define o valor da propriedade paymentMethodSupplementCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setPaymentMethodSupplementCode(Code value) {
        this.paymentMethodSupplementCode = value;
    }

    /**
     * Obtém o valor da propriedade buyingGroupInternalID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyingGroupInternalID() {
        return buyingGroupInternalID;
    }

    /**
     * Define o valor da propriedade buyingGroupInternalID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyingGroupInternalID(String value) {
        this.buyingGroupInternalID = value;
    }

    /**
     * Obtém o valor da propriedade receiverBuyingGroupInternalID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverBuyingGroupInternalID() {
        return receiverBuyingGroupInternalID;
    }

    /**
     * Define o valor da propriedade receiverBuyingGroupInternalID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverBuyingGroupInternalID(String value) {
        this.receiverBuyingGroupInternalID = value;
    }

    /**
     * Obtém o valor da propriedade paymentAdvicesSelectionRuleCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getPaymentAdvicesSelectionRuleCode() {
        return paymentAdvicesSelectionRuleCode;
    }

    /**
     * Define o valor da propriedade paymentAdvicesSelectionRuleCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setPaymentAdvicesSelectionRuleCode(Code value) {
        this.paymentAdvicesSelectionRuleCode = value;
    }

    /**
     * Obtém o valor da propriedade paymentAdvicesByEDIIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaymentAdvicesByEDIIndicator() {
        return paymentAdvicesByEDIIndicator;
    }

    /**
     * Define o valor da propriedade paymentAdvicesByEDIIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaymentAdvicesByEDIIndicator(Boolean value) {
        this.paymentAdvicesByEDIIndicator = value;
    }

    /**
     * Obtém o valor da propriedade releaseApprovalGroupCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getReleaseApprovalGroupCode() {
        return releaseApprovalGroupCode;
    }

    /**
     * Define o valor da propriedade releaseApprovalGroupCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setReleaseApprovalGroupCode(Code value) {
        this.releaseApprovalGroupCode = value;
    }

    /**
     * Obtém o valor da propriedade conversionVersionReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getConversionVersionReasonCode() {
        return conversionVersionReasonCode;
    }

    /**
     * Define o valor da propriedade conversionVersionReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setConversionVersionReasonCode(Code value) {
        this.conversionVersionReasonCode = value;
    }

    /**
     * Obtém o valor da propriedade employeeResponsiblePartyTelephoneFormattedNumberDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeResponsiblePartyTelephoneFormattedNumberDescription() {
        return employeeResponsiblePartyTelephoneFormattedNumberDescription;
    }

    /**
     * Define o valor da propriedade employeeResponsiblePartyTelephoneFormattedNumberDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeResponsiblePartyTelephoneFormattedNumberDescription(String value) {
        this.employeeResponsiblePartyTelephoneFormattedNumberDescription = value;
    }

    /**
     * Obtém o valor da propriedade employeeResponsiblePartyFaxFormattedNumberDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeResponsiblePartyFaxFormattedNumberDescription() {
        return employeeResponsiblePartyFaxFormattedNumberDescription;
    }

    /**
     * Define o valor da propriedade employeeResponsiblePartyFaxFormattedNumberDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeResponsiblePartyFaxFormattedNumberDescription(String value) {
        this.employeeResponsiblePartyFaxFormattedNumberDescription = value;
    }

    /**
     * Obtém o valor da propriedade employeeResponsiblePartyWebAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeResponsiblePartyWebAddress() {
        return employeeResponsiblePartyWebAddress;
    }

    /**
     * Define o valor da propriedade employeeResponsiblePartyWebAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeResponsiblePartyWebAddress(String value) {
        this.employeeResponsiblePartyWebAddress = value;
    }

    /**
     * Obtém o valor da propriedade creditMemosPaymentTermsCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getCreditMemosPaymentTermsCode() {
        return creditMemosPaymentTermsCode;
    }

    /**
     * Define o valor da propriedade creditMemosPaymentTermsCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setCreditMemosPaymentTermsCode(Code value) {
        this.creditMemosPaymentTermsCode = value;
    }

    /**
     * Obtém o valor da propriedade valueAdjustmentCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getValueAdjustmentCode() {
        return valueAdjustmentCode;
    }

    /**
     * Define o valor da propriedade valueAdjustmentCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setValueAdjustmentCode(Code value) {
        this.valueAdjustmentCode = value;
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
     * Obtém o valor da propriedade accountsReceivablePledgingCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getAccountsReceivablePledgingCode() {
        return accountsReceivablePledgingCode;
    }

    /**
     * Define o valor da propriedade accountsReceivablePledgingCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setAccountsReceivablePledgingCode(Code value) {
        this.accountsReceivablePledgingCode = value;
    }

    /**
     * Gets the value of the dunningInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dunningInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDunningInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPSUITERplctReqDunInfo }
     * 
     * 
     */
    public List<BPSUITERplctReqDunInfo> getDunningInformation() {
        if (dunningInformation == null) {
            dunningInformation = new ArrayList<BPSUITERplctReqDunInfo>();
        }
        return this.dunningInformation;
    }

    /**
     * Gets the value of the withholdingTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the withholdingTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWithholdingTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPSUITERplctReqCustWhldgTx }
     * 
     * 
     */
    public List<BPSUITERplctReqCustWhldgTx> getWithholdingTax() {
        if (withholdingTax == null) {
            withholdingTax = new ArrayList<BPSUITERplctReqCustWhldgTx>();
        }
        return this.withholdingTax;
    }

    /**
     * Gets the value of the accountingText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountingText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountingText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPSUITERplctReqText }
     * 
     * 
     */
    public List<BPSUITERplctReqText> getAccountingText() {
        if (accountingText == null) {
            accountingText = new ArrayList<BPSUITERplctReqText>();
        }
        return this.accountingText;
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
     * Obtém o valor da propriedade dunningInformationListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDunningInformationListCompleteTransmissionIndicator() {
        return dunningInformationListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade dunningInformationListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDunningInformationListCompleteTransmissionIndicator(Boolean value) {
        this.dunningInformationListCompleteTransmissionIndicator = value;
    }

    /**
     * Obtém o valor da propriedade withholdingTaxListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWithholdingTaxListCompleteTransmissionIndicator() {
        return withholdingTaxListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade withholdingTaxListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWithholdingTaxListCompleteTransmissionIndicator(Boolean value) {
        this.withholdingTaxListCompleteTransmissionIndicator = value;
    }

    /**
     * Obtém o valor da propriedade accountingTextListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccountingTextListCompleteTransmissionIndicator() {
        return accountingTextListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade accountingTextListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccountingTextListCompleteTransmissionIndicator(Boolean value) {
        this.accountingTextListCompleteTransmissionIndicator = value;
    }

}
