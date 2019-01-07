
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de QuantityTolerance complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="QuantityTolerance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OverPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="OverPercentUnlimitedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UnderPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityTolerance", propOrder = {
    "overPercent",
    "overPercentUnlimitedIndicator",
    "underPercent"
})
public class QuantityTolerance {

    @XmlElement(name = "OverPercent")
    protected BigDecimal overPercent;
    @XmlElement(name = "OverPercentUnlimitedIndicator")
    protected Boolean overPercentUnlimitedIndicator;
    @XmlElement(name = "UnderPercent")
    protected BigDecimal underPercent;

    /**
     * Obtém o valor da propriedade overPercent.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOverPercent() {
        return overPercent;
    }

    /**
     * Define o valor da propriedade overPercent.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOverPercent(BigDecimal value) {
        this.overPercent = value;
    }

    /**
     * Obtém o valor da propriedade overPercentUnlimitedIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverPercentUnlimitedIndicator() {
        return overPercentUnlimitedIndicator;
    }

    /**
     * Define o valor da propriedade overPercentUnlimitedIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverPercentUnlimitedIndicator(Boolean value) {
        this.overPercentUnlimitedIndicator = value;
    }

    /**
     * Obtém o valor da propriedade underPercent.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnderPercent() {
        return underPercent;
    }

    /**
     * Define o valor da propriedade underPercent.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnderPercent(BigDecimal value) {
        this.underPercent = value;
    }

}
