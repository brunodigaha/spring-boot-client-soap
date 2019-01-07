
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BPSUITERplctReqTextSAPScriptLine complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPSUITERplctReqTextSAPScriptLine"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://sap.com/xi/SAP_BS_FND/MDG/Global2}OrdinalNumberValue"/&gt;
 *         &lt;element ref="{http://sap.com/xi/SAP_BS_FND/MDG/Global2}SAPScriptLineFormatCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://sap.com/xi/SAP_BS_FND/MDG/Global2}SAPScriptLineText"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BPSUITERplctReqTextSAPScriptLine", propOrder = {
    "ordinalNumberValue",
    "sapScriptLineFormatCode",
    "sapScriptLineText"
})
public class BPSUITERplctReqTextSAPScriptLine {

    @XmlElement(name = "OrdinalNumberValue", namespace = "http://sap.com/xi/SAP_BS_FND/MDG/Global2", required = true)
    protected BigDecimal ordinalNumberValue;
    @XmlElement(name = "SAPScriptLineFormatCode", namespace = "http://sap.com/xi/SAP_BS_FND/MDG/Global2")
    protected SAPScriptLineFormatCode sapScriptLineFormatCode;
    @XmlElement(name = "SAPScriptLineText", namespace = "http://sap.com/xi/SAP_BS_FND/MDG/Global2", required = true)
    protected SAPScriptLineText sapScriptLineText;

    /**
     * Obtém o valor da propriedade ordinalNumberValue.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrdinalNumberValue() {
        return ordinalNumberValue;
    }

    /**
     * Define o valor da propriedade ordinalNumberValue.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrdinalNumberValue(BigDecimal value) {
        this.ordinalNumberValue = value;
    }

    /**
     * Obtém o valor da propriedade sapScriptLineFormatCode.
     * 
     * @return
     *     possible object is
     *     {@link SAPScriptLineFormatCode }
     *     
     */
    public SAPScriptLineFormatCode getSAPScriptLineFormatCode() {
        return sapScriptLineFormatCode;
    }

    /**
     * Define o valor da propriedade sapScriptLineFormatCode.
     * 
     * @param value
     *     allowed object is
     *     {@link SAPScriptLineFormatCode }
     *     
     */
    public void setSAPScriptLineFormatCode(SAPScriptLineFormatCode value) {
        this.sapScriptLineFormatCode = value;
    }

    /**
     * Obtém o valor da propriedade sapScriptLineText.
     * 
     * @return
     *     possible object is
     *     {@link SAPScriptLineText }
     *     
     */
    public SAPScriptLineText getSAPScriptLineText() {
        return sapScriptLineText;
    }

    /**
     * Define o valor da propriedade sapScriptLineText.
     * 
     * @param value
     *     allowed object is
     *     {@link SAPScriptLineText }
     *     
     */
    public void setSAPScriptLineText(SAPScriptLineText value) {
        this.sapScriptLineText = value;
    }

}
