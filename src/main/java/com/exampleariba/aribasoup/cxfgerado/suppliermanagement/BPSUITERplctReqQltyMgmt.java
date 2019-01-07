
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de BPSUITERplctReqQltyMgmt complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPSUITERplctReqQltyMgmt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SystemStandardCode" type="{http://ariba.com/xi/SupplierManagement}QualityManagementSystemStandardCode"/&gt;
 *         &lt;element name="SystemStandardCodeExpirationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="DefaultIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="actionCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BPSUITERplctReqQltyMgmt", propOrder = {
    "systemStandardCode",
    "systemStandardCodeExpirationDate",
    "defaultIndicator"
})
public class BPSUITERplctReqQltyMgmt {

    @XmlElement(name = "SystemStandardCode", required = true)
    protected QualityManagementSystemStandardCode systemStandardCode;
    @XmlElement(name = "SystemStandardCodeExpirationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar systemStandardCodeExpirationDate;
    @XmlElement(name = "DefaultIndicator")
    protected Boolean defaultIndicator;
    @XmlAttribute(name = "actionCode")
    protected String actionCode;

    /**
     * Obtém o valor da propriedade systemStandardCode.
     * 
     * @return
     *     possible object is
     *     {@link QualityManagementSystemStandardCode }
     *     
     */
    public QualityManagementSystemStandardCode getSystemStandardCode() {
        return systemStandardCode;
    }

    /**
     * Define o valor da propriedade systemStandardCode.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityManagementSystemStandardCode }
     *     
     */
    public void setSystemStandardCode(QualityManagementSystemStandardCode value) {
        this.systemStandardCode = value;
    }

    /**
     * Obtém o valor da propriedade systemStandardCodeExpirationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSystemStandardCodeExpirationDate() {
        return systemStandardCodeExpirationDate;
    }

    /**
     * Define o valor da propriedade systemStandardCodeExpirationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSystemStandardCodeExpirationDate(XMLGregorianCalendar value) {
        this.systemStandardCodeExpirationDate = value;
    }

    /**
     * Obtém o valor da propriedade defaultIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultIndicator() {
        return defaultIndicator;
    }

    /**
     * Define o valor da propriedade defaultIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultIndicator(Boolean value) {
        this.defaultIndicator = value;
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

}
