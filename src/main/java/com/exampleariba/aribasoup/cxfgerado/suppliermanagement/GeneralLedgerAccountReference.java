
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java de GeneralLedgerAccountReference complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="GeneralLedgerAccountReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *         &lt;element name="ChartOfAccountsID" type="{http://ariba.com/xi/SupplierManagement}ChartOfAccountsID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralLedgerAccountReference", propOrder = {
    "id",
    "chartOfAccountsID"
})
public class GeneralLedgerAccountReference {

    @XmlElement(name = "ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String id;
    @XmlElement(name = "ChartOfAccountsID")
    protected ChartOfAccountsID chartOfAccountsID;

    /**
     * Obtém o valor da propriedade id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade chartOfAccountsID.
     * 
     * @return
     *     possible object is
     *     {@link ChartOfAccountsID }
     *     
     */
    public ChartOfAccountsID getChartOfAccountsID() {
        return chartOfAccountsID;
    }

    /**
     * Define o valor da propriedade chartOfAccountsID.
     * 
     * @param value
     *     allowed object is
     *     {@link ChartOfAccountsID }
     *     
     */
    public void setChartOfAccountsID(ChartOfAccountsID value) {
        this.chartOfAccountsID = value;
    }

}
