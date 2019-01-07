
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Classe Java de GenericCustomField complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="GenericCustomField"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="type" type="{http://ariba.com/xi/SupplierManagement}GenericCustomFieldType" /&gt;
 *       &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="languageCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="table" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="field" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="checkTable" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="receiverTable" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="receiverField" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="receiverCheckTable" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="maxLength" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="minLength" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="pattern" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="totalDigits" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="fractionDigits" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="maxInclusive" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="minInclusive" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="displayRestrictions" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="editRestrictions" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericCustomField", propOrder = {
    "value"
})
public class GenericCustomField {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "type")
    protected GenericCustomFieldType type;
    @XmlAttribute(name = "title")
    protected String title;
    @XmlAttribute(name = "description")
    protected String description;
    @XmlAttribute(name = "languageCode")
    protected String languageCode;
    @XmlAttribute(name = "table")
    protected String table;
    @XmlAttribute(name = "field")
    protected String field;
    @XmlAttribute(name = "checkTable")
    protected String checkTable;
    @XmlAttribute(name = "receiverTable")
    protected String receiverTable;
    @XmlAttribute(name = "receiverField")
    protected String receiverField;
    @XmlAttribute(name = "receiverCheckTable")
    protected String receiverCheckTable;
    @XmlAttribute(name = "maxLength")
    protected Integer maxLength;
    @XmlAttribute(name = "minLength")
    protected Integer minLength;
    @XmlAttribute(name = "pattern")
    protected String pattern;
    @XmlAttribute(name = "totalDigits")
    protected Integer totalDigits;
    @XmlAttribute(name = "fractionDigits")
    protected Integer fractionDigits;
    @XmlAttribute(name = "maxInclusive")
    protected BigDecimal maxInclusive;
    @XmlAttribute(name = "minInclusive")
    protected BigDecimal minInclusive;
    @XmlAttribute(name = "displayRestrictions")
    protected String displayRestrictions;
    @XmlAttribute(name = "editRestrictions")
    protected String editRestrictions;

    /**
     * Obtém o valor da propriedade value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Define o valor da propriedade value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtém o valor da propriedade type.
     * 
     * @return
     *     possible object is
     *     {@link GenericCustomFieldType }
     *     
     */
    public GenericCustomFieldType getType() {
        return type;
    }

    /**
     * Define o valor da propriedade type.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericCustomFieldType }
     *     
     */
    public void setType(GenericCustomFieldType value) {
        this.type = value;
    }

    /**
     * Obtém o valor da propriedade title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Define o valor da propriedade title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Obtém o valor da propriedade table.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTable() {
        return table;
    }

    /**
     * Define o valor da propriedade table.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTable(String value) {
        this.table = value;
    }

    /**
     * Obtém o valor da propriedade field.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField() {
        return field;
    }

    /**
     * Define o valor da propriedade field.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField(String value) {
        this.field = value;
    }

    /**
     * Obtém o valor da propriedade checkTable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckTable() {
        return checkTable;
    }

    /**
     * Define o valor da propriedade checkTable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckTable(String value) {
        this.checkTable = value;
    }

    /**
     * Obtém o valor da propriedade receiverTable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverTable() {
        return receiverTable;
    }

    /**
     * Define o valor da propriedade receiverTable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverTable(String value) {
        this.receiverTable = value;
    }

    /**
     * Obtém o valor da propriedade receiverField.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverField() {
        return receiverField;
    }

    /**
     * Define o valor da propriedade receiverField.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverField(String value) {
        this.receiverField = value;
    }

    /**
     * Obtém o valor da propriedade receiverCheckTable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverCheckTable() {
        return receiverCheckTable;
    }

    /**
     * Define o valor da propriedade receiverCheckTable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverCheckTable(String value) {
        this.receiverCheckTable = value;
    }

    /**
     * Obtém o valor da propriedade maxLength.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxLength() {
        return maxLength;
    }

    /**
     * Define o valor da propriedade maxLength.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxLength(Integer value) {
        this.maxLength = value;
    }

    /**
     * Obtém o valor da propriedade minLength.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinLength() {
        return minLength;
    }

    /**
     * Define o valor da propriedade minLength.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinLength(Integer value) {
        this.minLength = value;
    }

    /**
     * Obtém o valor da propriedade pattern.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * Define o valor da propriedade pattern.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPattern(String value) {
        this.pattern = value;
    }

    /**
     * Obtém o valor da propriedade totalDigits.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalDigits() {
        return totalDigits;
    }

    /**
     * Define o valor da propriedade totalDigits.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalDigits(Integer value) {
        this.totalDigits = value;
    }

    /**
     * Obtém o valor da propriedade fractionDigits.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFractionDigits() {
        return fractionDigits;
    }

    /**
     * Define o valor da propriedade fractionDigits.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFractionDigits(Integer value) {
        this.fractionDigits = value;
    }

    /**
     * Obtém o valor da propriedade maxInclusive.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxInclusive() {
        return maxInclusive;
    }

    /**
     * Define o valor da propriedade maxInclusive.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxInclusive(BigDecimal value) {
        this.maxInclusive = value;
    }

    /**
     * Obtém o valor da propriedade minInclusive.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinInclusive() {
        return minInclusive;
    }

    /**
     * Define o valor da propriedade minInclusive.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinInclusive(BigDecimal value) {
        this.minInclusive = value;
    }

    /**
     * Obtém o valor da propriedade displayRestrictions.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayRestrictions() {
        return displayRestrictions;
    }

    /**
     * Define o valor da propriedade displayRestrictions.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayRestrictions(String value) {
        this.displayRestrictions = value;
    }

    /**
     * Obtém o valor da propriedade editRestrictions.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditRestrictions() {
        return editRestrictions;
    }

    /**
     * Define o valor da propriedade editRestrictions.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditRestrictions(String value) {
        this.editRestrictions = value;
    }

}
