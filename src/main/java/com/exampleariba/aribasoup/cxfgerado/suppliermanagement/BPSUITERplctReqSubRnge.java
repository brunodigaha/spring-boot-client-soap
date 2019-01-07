
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BPSUITERplctReqSubRnge complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPSUITERplctReqSubRnge"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VendorSubrangeCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="SubrangeDescription" type="{http://ariba.com/xi/SupplierManagement}LEN20_Description" minOccurs="0"/&gt;
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
@XmlType(name = "BPSUITERplctReqSubRnge", propOrder = {
    "vendorSubrangeCode",
    "subrangeDescription"
})
public class BPSUITERplctReqSubRnge {

    @XmlElement(name = "VendorSubrangeCode")
    protected Code vendorSubrangeCode;
    @XmlElement(name = "SubrangeDescription")
    protected LEN20Description subrangeDescription;
    @XmlAttribute(name = "actionCode")
    protected String actionCode;

    /**
     * Obtém o valor da propriedade vendorSubrangeCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getVendorSubrangeCode() {
        return vendorSubrangeCode;
    }

    /**
     * Define o valor da propriedade vendorSubrangeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setVendorSubrangeCode(Code value) {
        this.vendorSubrangeCode = value;
    }

    /**
     * Obtém o valor da propriedade subrangeDescription.
     * 
     * @return
     *     possible object is
     *     {@link LEN20Description }
     *     
     */
    public LEN20Description getSubrangeDescription() {
        return subrangeDescription;
    }

    /**
     * Define o valor da propriedade subrangeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link LEN20Description }
     *     
     */
    public void setSubrangeDescription(LEN20Description value) {
        this.subrangeDescription = value;
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
