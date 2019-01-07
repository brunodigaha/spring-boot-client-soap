
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java de BPSUITERplctReqMktgAttribs complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPSUITERplctReqMktgAttribs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerGroupCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="CustomerNielsenRegionCode" type="{http://ariba.com/xi/SupplierManagement}NielsenRegionCode" minOccurs="0"/&gt;
 *         &lt;element name="FiscalYearVariantCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="AnnualSalesVolumeAmount" type="{http://ariba.com/xi/SupplierManagement}Amount" minOccurs="0"/&gt;
 *         &lt;element name="AnnualSalesVolumeAmountReportedYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmployeeNumberValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EmployeeNumberValueReportedYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BPSUITERplctReqMktgAttribs", propOrder = {
    "customerGroupCode",
    "customerNielsenRegionCode",
    "fiscalYearVariantCode",
    "annualSalesVolumeAmount",
    "annualSalesVolumeAmountReportedYear",
    "employeeNumberValue",
    "employeeNumberValueReportedYear"
})
public class BPSUITERplctReqMktgAttribs {

    @XmlElement(name = "CustomerGroupCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String customerGroupCode;
    @XmlElement(name = "CustomerNielsenRegionCode")
    protected NielsenRegionCode customerNielsenRegionCode;
    @XmlElement(name = "FiscalYearVariantCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String fiscalYearVariantCode;
    @XmlElement(name = "AnnualSalesVolumeAmount")
    protected Amount annualSalesVolumeAmount;
    @XmlElement(name = "AnnualSalesVolumeAmountReportedYear")
    protected String annualSalesVolumeAmountReportedYear;
    @XmlElement(name = "EmployeeNumberValue")
    protected Integer employeeNumberValue;
    @XmlElement(name = "EmployeeNumberValueReportedYear")
    protected String employeeNumberValueReportedYear;

    /**
     * Obtém o valor da propriedade customerGroupCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerGroupCode() {
        return customerGroupCode;
    }

    /**
     * Define o valor da propriedade customerGroupCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerGroupCode(String value) {
        this.customerGroupCode = value;
    }

    /**
     * Obtém o valor da propriedade customerNielsenRegionCode.
     * 
     * @return
     *     possible object is
     *     {@link NielsenRegionCode }
     *     
     */
    public NielsenRegionCode getCustomerNielsenRegionCode() {
        return customerNielsenRegionCode;
    }

    /**
     * Define o valor da propriedade customerNielsenRegionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link NielsenRegionCode }
     *     
     */
    public void setCustomerNielsenRegionCode(NielsenRegionCode value) {
        this.customerNielsenRegionCode = value;
    }

    /**
     * Obtém o valor da propriedade fiscalYearVariantCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiscalYearVariantCode() {
        return fiscalYearVariantCode;
    }

    /**
     * Define o valor da propriedade fiscalYearVariantCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiscalYearVariantCode(String value) {
        this.fiscalYearVariantCode = value;
    }

    /**
     * Obtém o valor da propriedade annualSalesVolumeAmount.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getAnnualSalesVolumeAmount() {
        return annualSalesVolumeAmount;
    }

    /**
     * Define o valor da propriedade annualSalesVolumeAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setAnnualSalesVolumeAmount(Amount value) {
        this.annualSalesVolumeAmount = value;
    }

    /**
     * Obtém o valor da propriedade annualSalesVolumeAmountReportedYear.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnualSalesVolumeAmountReportedYear() {
        return annualSalesVolumeAmountReportedYear;
    }

    /**
     * Define o valor da propriedade annualSalesVolumeAmountReportedYear.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnualSalesVolumeAmountReportedYear(String value) {
        this.annualSalesVolumeAmountReportedYear = value;
    }

    /**
     * Obtém o valor da propriedade employeeNumberValue.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEmployeeNumberValue() {
        return employeeNumberValue;
    }

    /**
     * Define o valor da propriedade employeeNumberValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEmployeeNumberValue(Integer value) {
        this.employeeNumberValue = value;
    }

    /**
     * Obtém o valor da propriedade employeeNumberValueReportedYear.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeNumberValueReportedYear() {
        return employeeNumberValueReportedYear;
    }

    /**
     * Define o valor da propriedade employeeNumberValueReportedYear.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeNumberValueReportedYear(String value) {
        this.employeeNumberValueReportedYear = value;
    }

}
