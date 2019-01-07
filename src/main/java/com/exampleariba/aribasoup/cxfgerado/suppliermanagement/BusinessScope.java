
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BusinessScope complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BusinessScope"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TypeCode" type="{http://ariba.com/xi/SupplierManagement}BusinessScopeTypeCode"/&gt;
 *         &lt;element name="InstanceID" type="{http://ariba.com/xi/SupplierManagement}BusinessScopeInstanceID" minOccurs="0"/&gt;
 *         &lt;element name="ID" type="{http://ariba.com/xi/SupplierManagement}BusinessScopeID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessScope", propOrder = {
    "typeCode",
    "instanceID",
    "id"
})
public class BusinessScope {

    @XmlElement(name = "TypeCode", required = true)
    protected BusinessScopeTypeCode typeCode;
    @XmlElement(name = "InstanceID")
    protected BusinessScopeInstanceID instanceID;
    @XmlElement(name = "ID")
    protected BusinessScopeID id;

    /**
     * Obtém o valor da propriedade typeCode.
     * 
     * @return
     *     possible object is
     *     {@link BusinessScopeTypeCode }
     *     
     */
    public BusinessScopeTypeCode getTypeCode() {
        return typeCode;
    }

    /**
     * Define o valor da propriedade typeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessScopeTypeCode }
     *     
     */
    public void setTypeCode(BusinessScopeTypeCode value) {
        this.typeCode = value;
    }

    /**
     * Obtém o valor da propriedade instanceID.
     * 
     * @return
     *     possible object is
     *     {@link BusinessScopeInstanceID }
     *     
     */
    public BusinessScopeInstanceID getInstanceID() {
        return instanceID;
    }

    /**
     * Define o valor da propriedade instanceID.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessScopeInstanceID }
     *     
     */
    public void setInstanceID(BusinessScopeInstanceID value) {
        this.instanceID = value;
    }

    /**
     * Obtém o valor da propriedade id.
     * 
     * @return
     *     possible object is
     *     {@link BusinessScopeID }
     *     
     */
    public BusinessScopeID getID() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessScopeID }
     *     
     */
    public void setID(BusinessScopeID value) {
        this.id = value;
    }

}
