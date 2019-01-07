
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BPSUITERplctReqLegalCtrlInds complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPSUITERplctReqLegalCtrlInds"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BiochemicalWarfareIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NuclearNonproliferationIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NationalSecurityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MissileTechnologyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BPSUITERplctReqLegalCtrlInds", propOrder = {
    "biochemicalWarfareIndicator",
    "nuclearNonproliferationIndicator",
    "nationalSecurityIndicator",
    "missileTechnologyIndicator"
})
public class BPSUITERplctReqLegalCtrlInds {

    @XmlElement(name = "BiochemicalWarfareIndicator")
    protected Boolean biochemicalWarfareIndicator;
    @XmlElement(name = "NuclearNonproliferationIndicator")
    protected Boolean nuclearNonproliferationIndicator;
    @XmlElement(name = "NationalSecurityIndicator")
    protected Boolean nationalSecurityIndicator;
    @XmlElement(name = "MissileTechnologyIndicator")
    protected Boolean missileTechnologyIndicator;

    /**
     * Obtém o valor da propriedade biochemicalWarfareIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBiochemicalWarfareIndicator() {
        return biochemicalWarfareIndicator;
    }

    /**
     * Define o valor da propriedade biochemicalWarfareIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBiochemicalWarfareIndicator(Boolean value) {
        this.biochemicalWarfareIndicator = value;
    }

    /**
     * Obtém o valor da propriedade nuclearNonproliferationIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNuclearNonproliferationIndicator() {
        return nuclearNonproliferationIndicator;
    }

    /**
     * Define o valor da propriedade nuclearNonproliferationIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNuclearNonproliferationIndicator(Boolean value) {
        this.nuclearNonproliferationIndicator = value;
    }

    /**
     * Obtém o valor da propriedade nationalSecurityIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNationalSecurityIndicator() {
        return nationalSecurityIndicator;
    }

    /**
     * Define o valor da propriedade nationalSecurityIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNationalSecurityIndicator(Boolean value) {
        this.nationalSecurityIndicator = value;
    }

    /**
     * Obtém o valor da propriedade missileTechnologyIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMissileTechnologyIndicator() {
        return missileTechnologyIndicator;
    }

    /**
     * Define o valor da propriedade missileTechnologyIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMissileTechnologyIndicator(Boolean value) {
        this.missileTechnologyIndicator = value;
    }

}
