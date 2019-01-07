
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
 * <p>Classe Java de BPSUITERplctReqText complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPSUITERplctReqText"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TextTypeCode" type="{http://ariba.com/xi/SupplierManagement}TextCollectionTextTypeCode"/&gt;
 *         &lt;element name="LanguageCode" type="{http://www.w3.org/2001/XMLSchema}language"/&gt;
 *         &lt;element name="TextSAPScriptLine" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqTextSAPScriptLine" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="actionCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="textSAPScriptLineListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BPSUITERplctReqText", propOrder = {
    "textTypeCode",
    "languageCode",
    "textSAPScriptLine"
})
public class BPSUITERplctReqText {

    @XmlElement(name = "TextTypeCode", required = true)
    protected TextCollectionTextTypeCode textTypeCode;
    @XmlElement(name = "LanguageCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String languageCode;
    @XmlElement(name = "TextSAPScriptLine", required = true)
    protected List<BPSUITERplctReqTextSAPScriptLine> textSAPScriptLine;
    @XmlAttribute(name = "actionCode")
    protected String actionCode;
    @XmlAttribute(name = "textSAPScriptLineListCompleteTransmissionIndicator")
    protected Boolean textSAPScriptLineListCompleteTransmissionIndicator;

    /**
     * Obtém o valor da propriedade textTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link TextCollectionTextTypeCode }
     *     
     */
    public TextCollectionTextTypeCode getTextTypeCode() {
        return textTypeCode;
    }

    /**
     * Define o valor da propriedade textTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TextCollectionTextTypeCode }
     *     
     */
    public void setTextTypeCode(TextCollectionTextTypeCode value) {
        this.textTypeCode = value;
    }

    /**
     * Obtém o valor da propriedade languageCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Define o valor da propriedade languageCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the textSAPScriptLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textSAPScriptLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextSAPScriptLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPSUITERplctReqTextSAPScriptLine }
     * 
     * 
     */
    public List<BPSUITERplctReqTextSAPScriptLine> getTextSAPScriptLine() {
        if (textSAPScriptLine == null) {
            textSAPScriptLine = new ArrayList<BPSUITERplctReqTextSAPScriptLine>();
        }
        return this.textSAPScriptLine;
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
     * Obtém o valor da propriedade textSAPScriptLineListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTextSAPScriptLineListCompleteTransmissionIndicator() {
        return textSAPScriptLineListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade textSAPScriptLineListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTextSAPScriptLineListCompleteTransmissionIndicator(Boolean value) {
        this.textSAPScriptLineListCompleteTransmissionIndicator = value;
    }

}
