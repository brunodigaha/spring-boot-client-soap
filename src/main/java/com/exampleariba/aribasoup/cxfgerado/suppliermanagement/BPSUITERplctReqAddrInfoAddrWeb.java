
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BPSUITERplctReqAddrInfoAddrWeb complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPSUITERplctReqAddrInfoAddrWeb"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="URITypeCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="UsageDeniedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WebNote" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqNote" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="WebUsage" type="{http://ariba.com/xi/SupplierManagement}BPSUITERplctReqAddrInfoAddrWebUsge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="actionCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="webNoteListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="webUsageListCompleteTransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BPSUITERplctReqAddrInfoAddrWeb", propOrder = {
    "uri",
    "uriTypeCode",
    "usageDeniedIndicator",
    "webNote",
    "webUsage"
})
public class BPSUITERplctReqAddrInfoAddrWeb {

    @XmlElement(name = "URI", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String uri;
    @XmlElement(name = "URITypeCode")
    protected Code uriTypeCode;
    @XmlElement(name = "UsageDeniedIndicator")
    protected Boolean usageDeniedIndicator;
    @XmlElement(name = "WebNote")
    protected List<BPSUITERplctReqNote> webNote;
    @XmlElement(name = "WebUsage")
    protected List<BPSUITERplctReqAddrInfoAddrWebUsge> webUsage;
    @XmlAttribute(name = "actionCode")
    protected String actionCode;
    @XmlAttribute(name = "webNoteListCompleteTransmissionIndicator")
    protected Boolean webNoteListCompleteTransmissionIndicator;
    @XmlAttribute(name = "webUsageListCompleteTransmissionIndicator")
    protected Boolean webUsageListCompleteTransmissionIndicator;

    /**
     * Obtém o valor da propriedade uri.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURI() {
        return uri;
    }

    /**
     * Define o valor da propriedade uri.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURI(String value) {
        this.uri = value;
    }

    /**
     * Obtém o valor da propriedade uriTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getURITypeCode() {
        return uriTypeCode;
    }

    /**
     * Define o valor da propriedade uriTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setURITypeCode(Code value) {
        this.uriTypeCode = value;
    }

    /**
     * Obtém o valor da propriedade usageDeniedIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsageDeniedIndicator() {
        return usageDeniedIndicator;
    }

    /**
     * Define o valor da propriedade usageDeniedIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsageDeniedIndicator(Boolean value) {
        this.usageDeniedIndicator = value;
    }

    /**
     * Gets the value of the webNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the webNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWebNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPSUITERplctReqNote }
     * 
     * 
     */
    public List<BPSUITERplctReqNote> getWebNote() {
        if (webNote == null) {
            webNote = new ArrayList<BPSUITERplctReqNote>();
        }
        return this.webNote;
    }

    /**
     * Gets the value of the webUsage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the webUsage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWebUsage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPSUITERplctReqAddrInfoAddrWebUsge }
     * 
     * 
     */
    public List<BPSUITERplctReqAddrInfoAddrWebUsge> getWebUsage() {
        if (webUsage == null) {
            webUsage = new ArrayList<BPSUITERplctReqAddrInfoAddrWebUsge>();
        }
        return this.webUsage;
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
     * Obtém o valor da propriedade webNoteListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWebNoteListCompleteTransmissionIndicator() {
        return webNoteListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade webNoteListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWebNoteListCompleteTransmissionIndicator(Boolean value) {
        this.webNoteListCompleteTransmissionIndicator = value;
    }

    /**
     * Obtém o valor da propriedade webUsageListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWebUsageListCompleteTransmissionIndicator() {
        return webUsageListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade webUsageListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWebUsageListCompleteTransmissionIndicator(Boolean value) {
        this.webUsageListCompleteTransmissionIndicator = value;
    }

}
