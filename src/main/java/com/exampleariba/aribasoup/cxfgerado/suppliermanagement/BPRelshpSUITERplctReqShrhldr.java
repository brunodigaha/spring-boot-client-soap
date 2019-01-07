
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BPRelshpSUITERplctReqShrhldr complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPRelshpSUITERplctReqShrhldr"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EquityParticipationPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="EquityParticipationAmount" type="{http://ariba.com/xi/SupplierManagement}Amount" minOccurs="0"/&gt;
 *         &lt;element name="CompanyControlIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BPRelshpSUITERplctReqShrhldr", propOrder = {
    "equityParticipationPercent",
    "equityParticipationAmount",
    "companyControlIndicator"
})
public class BPRelshpSUITERplctReqShrhldr {

    @XmlElement(name = "EquityParticipationPercent")
    protected BigDecimal equityParticipationPercent;
    @XmlElement(name = "EquityParticipationAmount")
    protected Amount equityParticipationAmount;
    @XmlElement(name = "CompanyControlIndicator")
    protected Boolean companyControlIndicator;

    /**
     * Obtém o valor da propriedade equityParticipationPercent.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEquityParticipationPercent() {
        return equityParticipationPercent;
    }

    /**
     * Define o valor da propriedade equityParticipationPercent.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEquityParticipationPercent(BigDecimal value) {
        this.equityParticipationPercent = value;
    }

    /**
     * Obtém o valor da propriedade equityParticipationAmount.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getEquityParticipationAmount() {
        return equityParticipationAmount;
    }

    /**
     * Define o valor da propriedade equityParticipationAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setEquityParticipationAmount(Amount value) {
        this.equityParticipationAmount = value;
    }

    /**
     * Obtém o valor da propriedade companyControlIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCompanyControlIndicator() {
        return companyControlIndicator;
    }

    /**
     * Define o valor da propriedade companyControlIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCompanyControlIndicator(Boolean value) {
        this.companyControlIndicator = value;
    }

}
