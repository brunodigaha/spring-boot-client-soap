
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java de BPSUITERplctReqTxNo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPSUITERplctReqTxNo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *         &lt;element name="TaxIdentificationNumberTypeCode" type="{http://ariba.com/xi/SupplierManagement}TaxIdentificationNumberTypeCode"/&gt;
 *         &lt;element name="PartyTaxID" type="{http://ariba.com/xi/SupplierManagement}PartyTaxID"/&gt;
 *         &lt;element name="LONG_PartyTaxID" type="{http://ariba.com/xi/SupplierManagement}LONG_PartyTaxID"/&gt;
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
@XmlType(name = "BPSUITERplctReqTxNo", propOrder = {
    "countryCode",
    "taxIdentificationNumberTypeCode",
    "partyTaxID",
    "longPartyTaxID"
})
public class BPSUITERplctReqTxNo {

    @XmlElement(name = "CountryCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String countryCode;
    @XmlElement(name = "TaxIdentificationNumberTypeCode", required = true)
    protected TaxIdentificationNumberTypeCode taxIdentificationNumberTypeCode;
    @XmlElement(name = "PartyTaxID", required = true)
    protected PartyTaxID partyTaxID;
    @XmlElement(name = "LONG_PartyTaxID", required = true)
    protected LONGPartyTaxID longPartyTaxID;
    @XmlAttribute(name = "actionCode")
    protected String actionCode;

    /**
     * Obtém o valor da propriedade countryCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Define o valor da propriedade countryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Obtém o valor da propriedade taxIdentificationNumberTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link TaxIdentificationNumberTypeCode }
     *     
     */
    public TaxIdentificationNumberTypeCode getTaxIdentificationNumberTypeCode() {
        return taxIdentificationNumberTypeCode;
    }

    /**
     * Define o valor da propriedade taxIdentificationNumberTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIdentificationNumberTypeCode }
     *     
     */
    public void setTaxIdentificationNumberTypeCode(TaxIdentificationNumberTypeCode value) {
        this.taxIdentificationNumberTypeCode = value;
    }

    /**
     * Obtém o valor da propriedade partyTaxID.
     * 
     * @return
     *     possible object is
     *     {@link PartyTaxID }
     *     
     */
    public PartyTaxID getPartyTaxID() {
        return partyTaxID;
    }

    /**
     * Define o valor da propriedade partyTaxID.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyTaxID }
     *     
     */
    public void setPartyTaxID(PartyTaxID value) {
        this.partyTaxID = value;
    }

    /**
     * Obtém o valor da propriedade longPartyTaxID.
     * 
     * @return
     *     possible object is
     *     {@link LONGPartyTaxID }
     *     
     */
    public LONGPartyTaxID getLONGPartyTaxID() {
        return longPartyTaxID;
    }

    /**
     * Define o valor da propriedade longPartyTaxID.
     * 
     * @param value
     *     allowed object is
     *     {@link LONGPartyTaxID }
     *     
     */
    public void setLONGPartyTaxID(LONGPartyTaxID value) {
        this.longPartyTaxID = value;
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
