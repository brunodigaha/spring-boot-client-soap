
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
 * <p>Classe Java de BPSUITERplctReqBusHrs complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPSUITERplctReqBusHrs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FactoryCalenderCode" type="{http://ariba.com/xi/SupplierManagement}WorkingDayCalendarCode" minOccurs="0"/&gt;
 *         &lt;element name="TimeZoneCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="MondayAMStartTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="MondayAMEndTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="MondayPMStartTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="MondayPMEndTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="TuesdayAMStartTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="TuesdayAMEndTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="TuesdayPMStartTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="TuesdayPMEndTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="WednesdayAMStartTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="WednesdayAMEndTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="WednesdayPMStartTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="WednesdayPMEndTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="ThursdayAMStartTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="ThursdayAMEndTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="ThursdayPMStartTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="ThursdayPMEndTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="FridayAMStartTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="FridayAMEndTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="FridayPMStartTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="FridayPMEndTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="SaturdayAMStartTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="SaturdayAMEndTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="SaturdayPMStartTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="SaturdayPMEndTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="SundayAMStartTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="SundayAMEndTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="SundayPMStartTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="SundayPMEndTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BPSUITERplctReqBusHrs", propOrder = {
    "factoryCalenderCode",
    "timeZoneCode",
    "mondayAMStartTime",
    "mondayAMEndTime",
    "mondayPMStartTime",
    "mondayPMEndTime",
    "tuesdayAMStartTime",
    "tuesdayAMEndTime",
    "tuesdayPMStartTime",
    "tuesdayPMEndTime",
    "wednesdayAMStartTime",
    "wednesdayAMEndTime",
    "wednesdayPMStartTime",
    "wednesdayPMEndTime",
    "thursdayAMStartTime",
    "thursdayAMEndTime",
    "thursdayPMStartTime",
    "thursdayPMEndTime",
    "fridayAMStartTime",
    "fridayAMEndTime",
    "fridayPMStartTime",
    "fridayPMEndTime",
    "saturdayAMStartTime",
    "saturdayAMEndTime",
    "saturdayPMStartTime",
    "saturdayPMEndTime",
    "sundayAMStartTime",
    "sundayAMEndTime",
    "sundayPMStartTime",
    "sundayPMEndTime"
})
public class BPSUITERplctReqBusHrs {

    @XmlElement(name = "FactoryCalenderCode")
    protected WorkingDayCalendarCode factoryCalenderCode;
    @XmlElement(name = "TimeZoneCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String timeZoneCode;
    @XmlElement(name = "MondayAMStartTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar mondayAMStartTime;
    @XmlElement(name = "MondayAMEndTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar mondayAMEndTime;
    @XmlElement(name = "MondayPMStartTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar mondayPMStartTime;
    @XmlElement(name = "MondayPMEndTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar mondayPMEndTime;
    @XmlElement(name = "TuesdayAMStartTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar tuesdayAMStartTime;
    @XmlElement(name = "TuesdayAMEndTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar tuesdayAMEndTime;
    @XmlElement(name = "TuesdayPMStartTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar tuesdayPMStartTime;
    @XmlElement(name = "TuesdayPMEndTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar tuesdayPMEndTime;
    @XmlElement(name = "WednesdayAMStartTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar wednesdayAMStartTime;
    @XmlElement(name = "WednesdayAMEndTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar wednesdayAMEndTime;
    @XmlElement(name = "WednesdayPMStartTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar wednesdayPMStartTime;
    @XmlElement(name = "WednesdayPMEndTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar wednesdayPMEndTime;
    @XmlElement(name = "ThursdayAMStartTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar thursdayAMStartTime;
    @XmlElement(name = "ThursdayAMEndTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar thursdayAMEndTime;
    @XmlElement(name = "ThursdayPMStartTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar thursdayPMStartTime;
    @XmlElement(name = "ThursdayPMEndTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar thursdayPMEndTime;
    @XmlElement(name = "FridayAMStartTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar fridayAMStartTime;
    @XmlElement(name = "FridayAMEndTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar fridayAMEndTime;
    @XmlElement(name = "FridayPMStartTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar fridayPMStartTime;
    @XmlElement(name = "FridayPMEndTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar fridayPMEndTime;
    @XmlElement(name = "SaturdayAMStartTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar saturdayAMStartTime;
    @XmlElement(name = "SaturdayAMEndTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar saturdayAMEndTime;
    @XmlElement(name = "SaturdayPMStartTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar saturdayPMStartTime;
    @XmlElement(name = "SaturdayPMEndTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar saturdayPMEndTime;
    @XmlElement(name = "SundayAMStartTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar sundayAMStartTime;
    @XmlElement(name = "SundayAMEndTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar sundayAMEndTime;
    @XmlElement(name = "SundayPMStartTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar sundayPMStartTime;
    @XmlElement(name = "SundayPMEndTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar sundayPMEndTime;

    /**
     * Obtém o valor da propriedade factoryCalenderCode.
     * 
     * @return
     *     possible object is
     *     {@link WorkingDayCalendarCode }
     *     
     */
    public WorkingDayCalendarCode getFactoryCalenderCode() {
        return factoryCalenderCode;
    }

    /**
     * Define o valor da propriedade factoryCalenderCode.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkingDayCalendarCode }
     *     
     */
    public void setFactoryCalenderCode(WorkingDayCalendarCode value) {
        this.factoryCalenderCode = value;
    }

    /**
     * Obtém o valor da propriedade timeZoneCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZoneCode() {
        return timeZoneCode;
    }

    /**
     * Define o valor da propriedade timeZoneCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZoneCode(String value) {
        this.timeZoneCode = value;
    }

    /**
     * Obtém o valor da propriedade mondayAMStartTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMondayAMStartTime() {
        return mondayAMStartTime;
    }

    /**
     * Define o valor da propriedade mondayAMStartTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMondayAMStartTime(XMLGregorianCalendar value) {
        this.mondayAMStartTime = value;
    }

    /**
     * Obtém o valor da propriedade mondayAMEndTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMondayAMEndTime() {
        return mondayAMEndTime;
    }

    /**
     * Define o valor da propriedade mondayAMEndTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMondayAMEndTime(XMLGregorianCalendar value) {
        this.mondayAMEndTime = value;
    }

    /**
     * Obtém o valor da propriedade mondayPMStartTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMondayPMStartTime() {
        return mondayPMStartTime;
    }

    /**
     * Define o valor da propriedade mondayPMStartTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMondayPMStartTime(XMLGregorianCalendar value) {
        this.mondayPMStartTime = value;
    }

    /**
     * Obtém o valor da propriedade mondayPMEndTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMondayPMEndTime() {
        return mondayPMEndTime;
    }

    /**
     * Define o valor da propriedade mondayPMEndTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMondayPMEndTime(XMLGregorianCalendar value) {
        this.mondayPMEndTime = value;
    }

    /**
     * Obtém o valor da propriedade tuesdayAMStartTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTuesdayAMStartTime() {
        return tuesdayAMStartTime;
    }

    /**
     * Define o valor da propriedade tuesdayAMStartTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTuesdayAMStartTime(XMLGregorianCalendar value) {
        this.tuesdayAMStartTime = value;
    }

    /**
     * Obtém o valor da propriedade tuesdayAMEndTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTuesdayAMEndTime() {
        return tuesdayAMEndTime;
    }

    /**
     * Define o valor da propriedade tuesdayAMEndTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTuesdayAMEndTime(XMLGregorianCalendar value) {
        this.tuesdayAMEndTime = value;
    }

    /**
     * Obtém o valor da propriedade tuesdayPMStartTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTuesdayPMStartTime() {
        return tuesdayPMStartTime;
    }

    /**
     * Define o valor da propriedade tuesdayPMStartTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTuesdayPMStartTime(XMLGregorianCalendar value) {
        this.tuesdayPMStartTime = value;
    }

    /**
     * Obtém o valor da propriedade tuesdayPMEndTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTuesdayPMEndTime() {
        return tuesdayPMEndTime;
    }

    /**
     * Define o valor da propriedade tuesdayPMEndTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTuesdayPMEndTime(XMLGregorianCalendar value) {
        this.tuesdayPMEndTime = value;
    }

    /**
     * Obtém o valor da propriedade wednesdayAMStartTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWednesdayAMStartTime() {
        return wednesdayAMStartTime;
    }

    /**
     * Define o valor da propriedade wednesdayAMStartTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWednesdayAMStartTime(XMLGregorianCalendar value) {
        this.wednesdayAMStartTime = value;
    }

    /**
     * Obtém o valor da propriedade wednesdayAMEndTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWednesdayAMEndTime() {
        return wednesdayAMEndTime;
    }

    /**
     * Define o valor da propriedade wednesdayAMEndTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWednesdayAMEndTime(XMLGregorianCalendar value) {
        this.wednesdayAMEndTime = value;
    }

    /**
     * Obtém o valor da propriedade wednesdayPMStartTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWednesdayPMStartTime() {
        return wednesdayPMStartTime;
    }

    /**
     * Define o valor da propriedade wednesdayPMStartTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWednesdayPMStartTime(XMLGregorianCalendar value) {
        this.wednesdayPMStartTime = value;
    }

    /**
     * Obtém o valor da propriedade wednesdayPMEndTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWednesdayPMEndTime() {
        return wednesdayPMEndTime;
    }

    /**
     * Define o valor da propriedade wednesdayPMEndTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWednesdayPMEndTime(XMLGregorianCalendar value) {
        this.wednesdayPMEndTime = value;
    }

    /**
     * Obtém o valor da propriedade thursdayAMStartTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getThursdayAMStartTime() {
        return thursdayAMStartTime;
    }

    /**
     * Define o valor da propriedade thursdayAMStartTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setThursdayAMStartTime(XMLGregorianCalendar value) {
        this.thursdayAMStartTime = value;
    }

    /**
     * Obtém o valor da propriedade thursdayAMEndTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getThursdayAMEndTime() {
        return thursdayAMEndTime;
    }

    /**
     * Define o valor da propriedade thursdayAMEndTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setThursdayAMEndTime(XMLGregorianCalendar value) {
        this.thursdayAMEndTime = value;
    }

    /**
     * Obtém o valor da propriedade thursdayPMStartTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getThursdayPMStartTime() {
        return thursdayPMStartTime;
    }

    /**
     * Define o valor da propriedade thursdayPMStartTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setThursdayPMStartTime(XMLGregorianCalendar value) {
        this.thursdayPMStartTime = value;
    }

    /**
     * Obtém o valor da propriedade thursdayPMEndTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getThursdayPMEndTime() {
        return thursdayPMEndTime;
    }

    /**
     * Define o valor da propriedade thursdayPMEndTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setThursdayPMEndTime(XMLGregorianCalendar value) {
        this.thursdayPMEndTime = value;
    }

    /**
     * Obtém o valor da propriedade fridayAMStartTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFridayAMStartTime() {
        return fridayAMStartTime;
    }

    /**
     * Define o valor da propriedade fridayAMStartTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFridayAMStartTime(XMLGregorianCalendar value) {
        this.fridayAMStartTime = value;
    }

    /**
     * Obtém o valor da propriedade fridayAMEndTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFridayAMEndTime() {
        return fridayAMEndTime;
    }

    /**
     * Define o valor da propriedade fridayAMEndTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFridayAMEndTime(XMLGregorianCalendar value) {
        this.fridayAMEndTime = value;
    }

    /**
     * Obtém o valor da propriedade fridayPMStartTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFridayPMStartTime() {
        return fridayPMStartTime;
    }

    /**
     * Define o valor da propriedade fridayPMStartTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFridayPMStartTime(XMLGregorianCalendar value) {
        this.fridayPMStartTime = value;
    }

    /**
     * Obtém o valor da propriedade fridayPMEndTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFridayPMEndTime() {
        return fridayPMEndTime;
    }

    /**
     * Define o valor da propriedade fridayPMEndTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFridayPMEndTime(XMLGregorianCalendar value) {
        this.fridayPMEndTime = value;
    }

    /**
     * Obtém o valor da propriedade saturdayAMStartTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSaturdayAMStartTime() {
        return saturdayAMStartTime;
    }

    /**
     * Define o valor da propriedade saturdayAMStartTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSaturdayAMStartTime(XMLGregorianCalendar value) {
        this.saturdayAMStartTime = value;
    }

    /**
     * Obtém o valor da propriedade saturdayAMEndTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSaturdayAMEndTime() {
        return saturdayAMEndTime;
    }

    /**
     * Define o valor da propriedade saturdayAMEndTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSaturdayAMEndTime(XMLGregorianCalendar value) {
        this.saturdayAMEndTime = value;
    }

    /**
     * Obtém o valor da propriedade saturdayPMStartTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSaturdayPMStartTime() {
        return saturdayPMStartTime;
    }

    /**
     * Define o valor da propriedade saturdayPMStartTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSaturdayPMStartTime(XMLGregorianCalendar value) {
        this.saturdayPMStartTime = value;
    }

    /**
     * Obtém o valor da propriedade saturdayPMEndTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSaturdayPMEndTime() {
        return saturdayPMEndTime;
    }

    /**
     * Define o valor da propriedade saturdayPMEndTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSaturdayPMEndTime(XMLGregorianCalendar value) {
        this.saturdayPMEndTime = value;
    }

    /**
     * Obtém o valor da propriedade sundayAMStartTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSundayAMStartTime() {
        return sundayAMStartTime;
    }

    /**
     * Define o valor da propriedade sundayAMStartTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSundayAMStartTime(XMLGregorianCalendar value) {
        this.sundayAMStartTime = value;
    }

    /**
     * Obtém o valor da propriedade sundayAMEndTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSundayAMEndTime() {
        return sundayAMEndTime;
    }

    /**
     * Define o valor da propriedade sundayAMEndTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSundayAMEndTime(XMLGregorianCalendar value) {
        this.sundayAMEndTime = value;
    }

    /**
     * Obtém o valor da propriedade sundayPMStartTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSundayPMStartTime() {
        return sundayPMStartTime;
    }

    /**
     * Define o valor da propriedade sundayPMStartTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSundayPMStartTime(XMLGregorianCalendar value) {
        this.sundayPMStartTime = value;
    }

    /**
     * Obtém o valor da propriedade sundayPMEndTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSundayPMEndTime() {
        return sundayPMEndTime;
    }

    /**
     * Define o valor da propriedade sundayPMEndTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSundayPMEndTime(XMLGregorianCalendar value) {
        this.sundayPMEndTime = value;
    }

}
