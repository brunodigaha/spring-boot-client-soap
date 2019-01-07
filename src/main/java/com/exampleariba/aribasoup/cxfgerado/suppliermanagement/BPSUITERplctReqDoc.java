
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
 * <p>Classe Java de BPSUITERplctReqDoc complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPSUITERplctReqDoc"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocumentTypeCode" type="{http://ariba.com/xi/SupplierManagement}DocumentTypeCode"/&gt;
 *         &lt;element name="DocumentID" type="{http://ariba.com/xi/SupplierManagement}DocumentID"/&gt;
 *         &lt;element name="AlternativeDocumentID" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *         &lt;element name="DocumentVersionID" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
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
@XmlType(name = "BPSUITERplctReqDoc", propOrder = {
    "documentTypeCode",
    "documentID",
    "alternativeDocumentID",
    "documentVersionID"
})
public class BPSUITERplctReqDoc {

    @XmlElement(name = "DocumentTypeCode", required = true)
    protected DocumentTypeCode documentTypeCode;
    @XmlElement(name = "DocumentID", required = true)
    protected DocumentID documentID;
    @XmlElement(name = "AlternativeDocumentID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String alternativeDocumentID;
    @XmlElement(name = "DocumentVersionID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String documentVersionID;
    @XmlAttribute(name = "actionCode")
    protected String actionCode;

    /**
     * Obtém o valor da propriedade documentTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link DocumentTypeCode }
     *     
     */
    public DocumentTypeCode getDocumentTypeCode() {
        return documentTypeCode;
    }

    /**
     * Define o valor da propriedade documentTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentTypeCode }
     *     
     */
    public void setDocumentTypeCode(DocumentTypeCode value) {
        this.documentTypeCode = value;
    }

    /**
     * Obtém o valor da propriedade documentID.
     * 
     * @return
     *     possible object is
     *     {@link DocumentID }
     *     
     */
    public DocumentID getDocumentID() {
        return documentID;
    }

    /**
     * Define o valor da propriedade documentID.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentID }
     *     
     */
    public void setDocumentID(DocumentID value) {
        this.documentID = value;
    }

    /**
     * Obtém o valor da propriedade alternativeDocumentID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternativeDocumentID() {
        return alternativeDocumentID;
    }

    /**
     * Define o valor da propriedade alternativeDocumentID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternativeDocumentID(String value) {
        this.alternativeDocumentID = value;
    }

    /**
     * Obtém o valor da propriedade documentVersionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentVersionID() {
        return documentVersionID;
    }

    /**
     * Define o valor da propriedade documentVersionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentVersionID(String value) {
        this.documentVersionID = value;
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
