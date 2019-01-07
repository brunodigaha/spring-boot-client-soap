
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de BPSUITERplctReqDunInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPSUITERplctReqDunInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DunningAreaID" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="DunningProcedureCode" type="{http://ariba.com/xi/SupplierManagement}Code"/&gt;
 *         &lt;element name="DunningBlockCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="LastDunningNoticeDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="DunningLevelCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="DunningRecipientID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverDunningRecipientID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="LegalDunningProceedingsDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="DunningClerkInitialsCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BPSUITERplctReqDunInfo", propOrder = {
    "dunningAreaID",
    "dunningProcedureCode",
    "dunningBlockCode",
    "lastDunningNoticeDate",
    "dunningLevelCode",
    "dunningRecipientID",
    "receiverDunningRecipientID",
    "legalDunningProceedingsDate",
    "dunningClerkInitialsCode"
})
public class BPSUITERplctReqDunInfo {

    @XmlElement(name = "DunningAreaID")
    protected Code dunningAreaID;
    @XmlElement(name = "DunningProcedureCode", required = true)
    protected Code dunningProcedureCode;
    @XmlElement(name = "DunningBlockCode")
    protected Code dunningBlockCode;
    @XmlElement(name = "LastDunningNoticeDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastDunningNoticeDate;
    @XmlElement(name = "DunningLevelCode")
    protected Code dunningLevelCode;
    @XmlElement(name = "DunningRecipientID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String dunningRecipientID;
    @XmlElement(name = "ReceiverDunningRecipientID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String receiverDunningRecipientID;
    @XmlElement(name = "LegalDunningProceedingsDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar legalDunningProceedingsDate;
    @XmlElement(name = "DunningClerkInitialsCode")
    protected Code dunningClerkInitialsCode;

    /**
     * Obtém o valor da propriedade dunningAreaID.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getDunningAreaID() {
        return dunningAreaID;
    }

    /**
     * Define o valor da propriedade dunningAreaID.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setDunningAreaID(Code value) {
        this.dunningAreaID = value;
    }

    /**
     * Obtém o valor da propriedade dunningProcedureCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getDunningProcedureCode() {
        return dunningProcedureCode;
    }

    /**
     * Define o valor da propriedade dunningProcedureCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setDunningProcedureCode(Code value) {
        this.dunningProcedureCode = value;
    }

    /**
     * Obtém o valor da propriedade dunningBlockCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getDunningBlockCode() {
        return dunningBlockCode;
    }

    /**
     * Define o valor da propriedade dunningBlockCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setDunningBlockCode(Code value) {
        this.dunningBlockCode = value;
    }

    /**
     * Obtém o valor da propriedade lastDunningNoticeDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastDunningNoticeDate() {
        return lastDunningNoticeDate;
    }

    /**
     * Define o valor da propriedade lastDunningNoticeDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastDunningNoticeDate(XMLGregorianCalendar value) {
        this.lastDunningNoticeDate = value;
    }

    /**
     * Obtém o valor da propriedade dunningLevelCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getDunningLevelCode() {
        return dunningLevelCode;
    }

    /**
     * Define o valor da propriedade dunningLevelCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setDunningLevelCode(Code value) {
        this.dunningLevelCode = value;
    }

    /**
     * Obtém o valor da propriedade dunningRecipientID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDunningRecipientID() {
        return dunningRecipientID;
    }

    /**
     * Define o valor da propriedade dunningRecipientID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDunningRecipientID(String value) {
        this.dunningRecipientID = value;
    }

    /**
     * Obtém o valor da propriedade receiverDunningRecipientID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverDunningRecipientID() {
        return receiverDunningRecipientID;
    }

    /**
     * Define o valor da propriedade receiverDunningRecipientID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverDunningRecipientID(String value) {
        this.receiverDunningRecipientID = value;
    }

    /**
     * Obtém o valor da propriedade legalDunningProceedingsDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLegalDunningProceedingsDate() {
        return legalDunningProceedingsDate;
    }

    /**
     * Define o valor da propriedade legalDunningProceedingsDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLegalDunningProceedingsDate(XMLGregorianCalendar value) {
        this.legalDunningProceedingsDate = value;
    }

    /**
     * Obtém o valor da propriedade dunningClerkInitialsCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getDunningClerkInitialsCode() {
        return dunningClerkInitialsCode;
    }

    /**
     * Define o valor da propriedade dunningClerkInitialsCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setDunningClerkInitialsCode(Code value) {
        this.dunningClerkInitialsCode = value;
    }

}
