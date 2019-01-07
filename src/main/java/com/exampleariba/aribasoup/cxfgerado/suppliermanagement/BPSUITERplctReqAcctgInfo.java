
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
 * <p>Classe Java de BPSUITERplctReqAcctgInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPSUITERplctReqAcctgInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CompanyID" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *         &lt;element name="BlockedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DeletedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SortCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="GeneralLedgerAccountReference" type="{http://ariba.com/xi/SupplierManagement}GeneralLedgerAccountReference" minOccurs="0"/&gt;
 *         &lt;element name="AuthorisationGroupCode" type="{http://ariba.com/xi/SupplierManagement}AuthorisationGroupCode" minOccurs="0"/&gt;
 *         &lt;element name="InterestCalculationInclusionCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="InterestCalculationFrequencyCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="LastInterestCalculationKeyDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="LastInterestCalculationRunDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="PaymentMethodsCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="PaymentBlockCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="CashDiscountTermsCode" type="{http://ariba.com/xi/SupplierManagement}CashDiscountTermsCode" minOccurs="0"/&gt;
 *         &lt;element name="LocalProcessingIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AccountingClerkInitialsCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="DebtorPartyCreditorID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="EmployeeResponsiblePartyName" type="{http://ariba.com/xi/SupplierManagement}MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="EmployeeResponsiblePartyFaxFormattedNumberDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmployeeResponsiblePartyTelephoneFormattedNumberDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmployeeResponsiblePartyWebAddress" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PlanningGroupCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="HeadOfficeAccountInternalID" type="{http://ariba.com/xi/SupplierManagement}PartyInternalID" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverHeadOfficeAccountInternalID" type="{http://ariba.com/xi/SupplierManagement}PartyInternalID" minOccurs="0"/&gt;
 *         &lt;element name="AlternativePayeePartyInternalID" type="{http://ariba.com/xi/SupplierManagement}PartyInternalID" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverAlternativePayeePartyInternalID" type="{http://ariba.com/xi/SupplierManagement}PartyInternalID" minOccurs="0"/&gt;
 *         &lt;element name="BillOfExchangeLimitAmount" type="{http://ariba.com/xi/SupplierManagement}Amount" minOccurs="0"/&gt;
 *         &lt;element name="ProbableCheckPaidDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DoubleEntriesCheckIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BusinessPartnerToleranceGroupCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="HouseBankInternalID" type="{http://ariba.com/xi/SupplierManagement}BankInternalID" minOccurs="0"/&gt;
 *         &lt;element name="PayItemsSeparatelyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WithholdingTaxExemptionCertificateID" type="{http://ariba.com/xi/SupplierManagement}TaxExemptionCertificateID" minOccurs="0"/&gt;
 *         &lt;element name="WithholdingTaxExemptionCertificateValidityDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="WithholdingTaxTypeCode" type="{http://ariba.com/xi/SupplierManagement}TaxTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="WithholdingTaxExemptionReasonCode" type="{http://ariba.com/xi/SupplierManagement}TaxExemptionReasonCode" minOccurs="0"/&gt;
 *         &lt;element name="WithholdingTaxCountryCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="VendorRecipientTypeCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="ReductionRatesDeterminationCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="MinorityIndicatorsCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="PreviousSupplierInternalID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="EmployeeID" type="{http://ariba.com/xi/SupplierManagement}EmployeeID" minOccurs="0"/&gt;
 *         &lt;element name="PaymentGroupingCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="PaymentMethodSupplementCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="PaymentAdvicesByEDIIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReleaseApprovalGroupCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceVerificationToleranceGroupCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="CreditMemosPaymentTermsCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="PeriodicAccountStatementsCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="CertificationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="DeletionBlockedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CustomerSupplierClearingIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DunningNoticeGroupingCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="DunningInformation" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqDunInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="WithholdingTax" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqWhldgTx" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AccountingText" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GenericCustomField" type="{http://ariba.com/xi/SupplierManagement}GenericCustomField" maxOccurs="unbounded" minOccurs="0" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="actionCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="dunningInformationListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="withholdingTaxListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="accountingTextListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute ref="{http://ariba.com/xi/SupplierManagement}genericCustomFieldListCompleteTransmissionIndicator"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BPSUITERplctReqAcctgInfo", propOrder = {
    "companyID",
    "blockedIndicator",
    "deletedIndicator",
    "sortCode",
    "generalLedgerAccountReference",
    "authorisationGroupCode",
    "interestCalculationInclusionCode",
    "interestCalculationFrequencyCode",
    "lastInterestCalculationKeyDate",
    "lastInterestCalculationRunDate",
    "paymentMethodsCode",
    "paymentBlockCode",
    "cashDiscountTermsCode",
    "localProcessingIndicator",
    "accountingClerkInitialsCode",
    "debtorPartyCreditorID",
    "employeeResponsiblePartyName",
    "employeeResponsiblePartyFaxFormattedNumberDescription",
    "employeeResponsiblePartyTelephoneFormattedNumberDescription",
    "employeeResponsiblePartyWebAddress",
    "note",
    "planningGroupCode",
    "headOfficeAccountInternalID",
    "receiverHeadOfficeAccountInternalID",
    "alternativePayeePartyInternalID",
    "receiverAlternativePayeePartyInternalID",
    "billOfExchangeLimitAmount",
    "probableCheckPaidDuration",
    "doubleEntriesCheckIndicator",
    "businessPartnerToleranceGroupCode",
    "houseBankInternalID",
    "payItemsSeparatelyIndicator",
    "withholdingTaxExemptionCertificateID",
    "withholdingTaxExemptionCertificateValidityDate",
    "withholdingTaxTypeCode",
    "withholdingTaxExemptionReasonCode",
    "withholdingTaxCountryCode",
    "vendorRecipientTypeCode",
    "reductionRatesDeterminationCode",
    "minorityIndicatorsCode",
    "previousSupplierInternalID",
    "employeeID",
    "paymentGroupingCode",
    "paymentMethodSupplementCode",
    "paymentAdvicesByEDIIndicator",
    "releaseApprovalGroupCode",
    "invoiceVerificationToleranceGroupCode",
    "creditMemosPaymentTermsCode",
    "periodicAccountStatementsCode",
    "certificationDate",
    "deletionBlockedIndicator",
    "customerSupplierClearingIndicator",
    "dunningNoticeGroupingCode",
    "dunningInformation",
    "withholdingTax",
    "accountingText",
    "genericCustomField"
})
public class BPSUITERplctReqAcctgInfo {

    @XmlElement(name = "CompanyID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String companyID;
    @XmlElement(name = "BlockedIndicator")
    protected Boolean blockedIndicator;
    @XmlElement(name = "DeletedIndicator")
    protected Boolean deletedIndicator;
    @XmlElement(name = "SortCode")
    protected Code sortCode;
    @XmlElement(name = "GeneralLedgerAccountReference")
    protected GeneralLedgerAccountReference generalLedgerAccountReference;
    @XmlElement(name = "AuthorisationGroupCode")
    protected AuthorisationGroupCode authorisationGroupCode;
    @XmlElement(name = "InterestCalculationInclusionCode")
    protected Code interestCalculationInclusionCode;
    @XmlElement(name = "InterestCalculationFrequencyCode")
    protected Code interestCalculationFrequencyCode;
    @XmlElement(name = "LastInterestCalculationKeyDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastInterestCalculationKeyDate;
    @XmlElement(name = "LastInterestCalculationRunDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastInterestCalculationRunDate;
    @XmlElement(name = "PaymentMethodsCode")
    protected Code paymentMethodsCode;
    @XmlElement(name = "PaymentBlockCode")
    protected Code paymentBlockCode;
    @XmlElement(name = "CashDiscountTermsCode")
    protected CashDiscountTermsCode cashDiscountTermsCode;
    @XmlElement(name = "LocalProcessingIndicator")
    protected Boolean localProcessingIndicator;
    @XmlElement(name = "AccountingClerkInitialsCode")
    protected Code accountingClerkInitialsCode;
    @XmlElement(name = "DebtorPartyCreditorID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String debtorPartyCreditorID;
    @XmlElement(name = "EmployeeResponsiblePartyName")
    protected MEDIUMName employeeResponsiblePartyName;
    @XmlElement(name = "EmployeeResponsiblePartyFaxFormattedNumberDescription")
    protected String employeeResponsiblePartyFaxFormattedNumberDescription;
    @XmlElement(name = "EmployeeResponsiblePartyTelephoneFormattedNumberDescription")
    protected String employeeResponsiblePartyTelephoneFormattedNumberDescription;
    @XmlElement(name = "EmployeeResponsiblePartyWebAddress")
    @XmlSchemaType(name = "anyURI")
    protected String employeeResponsiblePartyWebAddress;
    @XmlElement(name = "Note")
    protected String note;
    @XmlElement(name = "PlanningGroupCode")
    protected Code planningGroupCode;
    @XmlElement(name = "HeadOfficeAccountInternalID")
    protected PartyInternalID headOfficeAccountInternalID;
    @XmlElement(name = "ReceiverHeadOfficeAccountInternalID")
    protected PartyInternalID receiverHeadOfficeAccountInternalID;
    @XmlElement(name = "AlternativePayeePartyInternalID")
    protected PartyInternalID alternativePayeePartyInternalID;
    @XmlElement(name = "ReceiverAlternativePayeePartyInternalID")
    protected PartyInternalID receiverAlternativePayeePartyInternalID;
    @XmlElement(name = "BillOfExchangeLimitAmount")
    protected Amount billOfExchangeLimitAmount;
    @XmlElement(name = "ProbableCheckPaidDuration")
    protected String probableCheckPaidDuration;
    @XmlElement(name = "DoubleEntriesCheckIndicator")
    protected Boolean doubleEntriesCheckIndicator;
    @XmlElement(name = "BusinessPartnerToleranceGroupCode")
    protected Code businessPartnerToleranceGroupCode;
    @XmlElement(name = "HouseBankInternalID")
    protected BankInternalID houseBankInternalID;
    @XmlElement(name = "PayItemsSeparatelyIndicator")
    protected Boolean payItemsSeparatelyIndicator;
    @XmlElement(name = "WithholdingTaxExemptionCertificateID")
    protected TaxExemptionCertificateID withholdingTaxExemptionCertificateID;
    @XmlElement(name = "WithholdingTaxExemptionCertificateValidityDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar withholdingTaxExemptionCertificateValidityDate;
    @XmlElement(name = "WithholdingTaxTypeCode")
    protected TaxTypeCode withholdingTaxTypeCode;
    @XmlElement(name = "WithholdingTaxExemptionReasonCode")
    protected TaxExemptionReasonCode withholdingTaxExemptionReasonCode;
    @XmlElement(name = "WithholdingTaxCountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String withholdingTaxCountryCode;
    @XmlElement(name = "VendorRecipientTypeCode")
    protected Code vendorRecipientTypeCode;
    @XmlElement(name = "ReductionRatesDeterminationCode")
    protected Code reductionRatesDeterminationCode;
    @XmlElement(name = "MinorityIndicatorsCode")
    protected Code minorityIndicatorsCode;
    @XmlElement(name = "PreviousSupplierInternalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String previousSupplierInternalID;
    @XmlElement(name = "EmployeeID")
    protected EmployeeID employeeID;
    @XmlElement(name = "PaymentGroupingCode")
    protected Code paymentGroupingCode;
    @XmlElement(name = "PaymentMethodSupplementCode")
    protected Code paymentMethodSupplementCode;
    @XmlElement(name = "PaymentAdvicesByEDIIndicator")
    protected Boolean paymentAdvicesByEDIIndicator;
    @XmlElement(name = "ReleaseApprovalGroupCode")
    protected Code releaseApprovalGroupCode;
    @XmlElement(name = "InvoiceVerificationToleranceGroupCode")
    protected Code invoiceVerificationToleranceGroupCode;
    @XmlElement(name = "CreditMemosPaymentTermsCode")
    protected Code creditMemosPaymentTermsCode;
    @XmlElement(name = "PeriodicAccountStatementsCode")
    protected Code periodicAccountStatementsCode;
    @XmlElement(name = "CertificationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar certificationDate;
    @XmlElement(name = "DeletionBlockedIndicator")
    protected Boolean deletionBlockedIndicator;
    @XmlElement(name = "CustomerSupplierClearingIndicator")
    protected Boolean customerSupplierClearingIndicator;
    @XmlElement(name = "DunningNoticeGroupingCode")
    protected Code dunningNoticeGroupingCode;
    @XmlElement(name = "DunningInformation")
    protected List<BPSUITERplctReqDunInfo> dunningInformation;
    @XmlElement(name = "WithholdingTax")
    protected List<BPSUITERplctReqWhldgTx> withholdingTax;
    @XmlElement(name = "AccountingText")
    protected List<BPSUITERplctReqText> accountingText;
    @XmlElement(name = "GenericCustomField", namespace = "http://ariba.com/xi/SupplierManagement")
    protected List<GenericCustomField> genericCustomField;
    @XmlAttribute(name = "actionCode")
    protected String actionCode;
    @XmlAttribute(name = "dunningInformationListCompleteTransmissionIndicator")
    protected Boolean dunningInformationListCompleteTransmissionIndicator;
    @XmlAttribute(name = "withholdingTaxListCompleteTransmissionIndicator")
    protected Boolean withholdingTaxListCompleteTransmissionIndicator;
    @XmlAttribute(name = "accountingTextListCompleteTransmissionIndicator")
    protected Boolean accountingTextListCompleteTransmissionIndicator;
    @XmlAttribute(name = "genericCustomFieldListCompleteTransmissionIndicator", namespace = "http://ariba.com/xi/SupplierManagement")
    protected String genericCustomFieldListCompleteTransmissionIndicator;

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
     * Obtém o valor da propriedade doubleEntriesCheckIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDoubleEntriesCheckIndicator() {
        return doubleEntriesCheckIndicator;
    }

    /**
     * Define o valor da propriedade doubleEntriesCheckIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDoubleEntriesCheckIndicator(Boolean value) {
        this.doubleEntriesCheckIndicator = value;
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
     * Obtém o valor da propriedade withholdingTaxExemptionCertificateID.
     * 
     * @return
     *     possible object is
     *     {@link TaxExemptionCertificateID }
     *     
     */
    public TaxExemptionCertificateID getWithholdingTaxExemptionCertificateID() {
        return withholdingTaxExemptionCertificateID;
    }

    /**
     * Define o valor da propriedade withholdingTaxExemptionCertificateID.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExemptionCertificateID }
     *     
     */
    public void setWithholdingTaxExemptionCertificateID(TaxExemptionCertificateID value) {
        this.withholdingTaxExemptionCertificateID = value;
    }

    /**
     * Obtém o valor da propriedade withholdingTaxExemptionCertificateValidityDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWithholdingTaxExemptionCertificateValidityDate() {
        return withholdingTaxExemptionCertificateValidityDate;
    }

    /**
     * Define o valor da propriedade withholdingTaxExemptionCertificateValidityDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWithholdingTaxExemptionCertificateValidityDate(XMLGregorianCalendar value) {
        this.withholdingTaxExemptionCertificateValidityDate = value;
    }

    /**
     * Obtém o valor da propriedade withholdingTaxTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link TaxTypeCode }
     *     
     */
    public TaxTypeCode getWithholdingTaxTypeCode() {
        return withholdingTaxTypeCode;
    }

    /**
     * Define o valor da propriedade withholdingTaxTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxTypeCode }
     *     
     */
    public void setWithholdingTaxTypeCode(TaxTypeCode value) {
        this.withholdingTaxTypeCode = value;
    }

    /**
     * Obtém o valor da propriedade withholdingTaxExemptionReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link TaxExemptionReasonCode }
     *     
     */
    public TaxExemptionReasonCode getWithholdingTaxExemptionReasonCode() {
        return withholdingTaxExemptionReasonCode;
    }

    /**
     * Define o valor da propriedade withholdingTaxExemptionReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExemptionReasonCode }
     *     
     */
    public void setWithholdingTaxExemptionReasonCode(TaxExemptionReasonCode value) {
        this.withholdingTaxExemptionReasonCode = value;
    }

    /**
     * Obtém o valor da propriedade withholdingTaxCountryCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWithholdingTaxCountryCode() {
        return withholdingTaxCountryCode;
    }

    /**
     * Define o valor da propriedade withholdingTaxCountryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWithholdingTaxCountryCode(String value) {
        this.withholdingTaxCountryCode = value;
    }

    /**
     * Obtém o valor da propriedade vendorRecipientTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getVendorRecipientTypeCode() {
        return vendorRecipientTypeCode;
    }

    /**
     * Define o valor da propriedade vendorRecipientTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setVendorRecipientTypeCode(Code value) {
        this.vendorRecipientTypeCode = value;
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
     * Obtém o valor da propriedade minorityIndicatorsCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getMinorityIndicatorsCode() {
        return minorityIndicatorsCode;
    }

    /**
     * Define o valor da propriedade minorityIndicatorsCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setMinorityIndicatorsCode(Code value) {
        this.minorityIndicatorsCode = value;
    }

    /**
     * Obtém o valor da propriedade previousSupplierInternalID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousSupplierInternalID() {
        return previousSupplierInternalID;
    }

    /**
     * Define o valor da propriedade previousSupplierInternalID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousSupplierInternalID(String value) {
        this.previousSupplierInternalID = value;
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
     * Obtém o valor da propriedade invoiceVerificationToleranceGroupCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getInvoiceVerificationToleranceGroupCode() {
        return invoiceVerificationToleranceGroupCode;
    }

    /**
     * Define o valor da propriedade invoiceVerificationToleranceGroupCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setInvoiceVerificationToleranceGroupCode(Code value) {
        this.invoiceVerificationToleranceGroupCode = value;
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
     * Obtém o valor da propriedade certificationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCertificationDate() {
        return certificationDate;
    }

    /**
     * Define o valor da propriedade certificationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCertificationDate(XMLGregorianCalendar value) {
        this.certificationDate = value;
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
     * {@link BPSUITERplctReqWhldgTx }
     * 
     * 
     */
    public List<BPSUITERplctReqWhldgTx> getWithholdingTax() {
        if (withholdingTax == null) {
            withholdingTax = new ArrayList<BPSUITERplctReqWhldgTx>();
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
