
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
 * <p>Classe Java de BPSUITERplctReqAddrInfoAddrPostlAddr complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BPSUITERplctReqAddrInfoAddrPostlAddr"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddressRepresentationCode" type="{http://ariba.com/xi/SupplierManagement}AddressRepresentationCode" minOccurs="0"/&gt;
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="RegionCode" type="{http://ariba.com/xi/SupplierManagement}RegionCode" minOccurs="0"/&gt;
 *         &lt;element name="CityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DistrictName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StreetPostalCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="POBoxPostalCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="CompanyPostalCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="StreetPrefixName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalStreetPrefixName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StreetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StreetSuffixName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalStreetSuffixName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HouseID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalHouseID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="BuildingID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="RoomID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="FloorID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="CareOfName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StreetAddressMailNonDeliveryReasonCode" type="{http://ariba.com/xi/SupplierManagement}MailNonDeliveryReasonCode" minOccurs="0"/&gt;
 *         &lt;element name="POBoxDeviatingCountryCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="POBoxDeviatingRegionCode" type="{http://ariba.com/xi/SupplierManagement}RegionCode" minOccurs="0"/&gt;
 *         &lt;element name="POBoxDeviatingCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="POBoxLobbyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="POBoxID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="POBoxAddressMailNonDeliveryReasonCode" type="{http://ariba.com/xi/SupplierManagement}MailNonDeliveryReasonCode" minOccurs="0"/&gt;
 *         &lt;element name="POBoxIDVisibleIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="POBoxDeliveryServiceID" type="{http://ariba.com/xi/SupplierManagement}Identifier" minOccurs="0"/&gt;
 *         &lt;element name="POBoxDeliveryServiceTypeCode" type="{http://ariba.com/xi/SupplierManagement}Code" minOccurs="0"/&gt;
 *         &lt;element name="TaxJurisdictionCode" type="{http://ariba.com/xi/SupplierManagement}TaxJurisdictionCode" minOccurs="0"/&gt;
 *         &lt;element name="TimeZoneCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="TransportationZoneID" type="{http://ariba.com/xi/SupplierManagement}TransportationZoneID" minOccurs="0"/&gt;
 *         &lt;element name="RegionalStructureElementGroupCode" type="{http://ariba.com/xi/SupplierManagement}RegionalStructureElementGroupCode" minOccurs="0"/&gt;
 *         &lt;element name="RegionalStructureAddressConsistencyStatusCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="RegionalStructureCityCode" type="{http://ariba.com/xi/SupplierManagement}RegionalStructureCityCode" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalRegionalStructureCityCode" type="{http://ariba.com/xi/SupplierManagement}RegionalStructureCityCode" minOccurs="0"/&gt;
 *         &lt;element name="POBoxDeviatingRegionalStructureCityCode" type="{http://ariba.com/xi/SupplierManagement}RegionalStructureCityCode" minOccurs="0"/&gt;
 *         &lt;element name="RegionalStructureDistrictCode" type="{http://ariba.com/xi/SupplierManagement}RegionalStructureDistrictCode" minOccurs="0"/&gt;
 *         &lt;element name="RegionalStructureStreetCode" type="{http://ariba.com/xi/SupplierManagement}RegionalStructureStreetCode" minOccurs="0"/&gt;
 *         &lt;element name="ExtendedBuildingID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
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
@XmlType(name = "BPSUITERplctReqAddrInfoAddrPostlAddr", propOrder = {
    "addressRepresentationCode",
    "countryCode",
    "regionCode",
    "cityName",
    "additionalCityName",
    "districtName",
    "streetPostalCode",
    "poBoxPostalCode",
    "companyPostalCode",
    "streetPrefixName",
    "additionalStreetPrefixName",
    "streetName",
    "streetSuffixName",
    "additionalStreetSuffixName",
    "houseID",
    "additionalHouseID",
    "buildingID",
    "roomID",
    "floorID",
    "careOfName",
    "streetAddressMailNonDeliveryReasonCode",
    "poBoxDeviatingCountryCode",
    "poBoxDeviatingRegionCode",
    "poBoxDeviatingCityName",
    "poBoxLobbyName",
    "poBoxID",
    "poBoxAddressMailNonDeliveryReasonCode",
    "poBoxIDVisibleIndicator",
    "poBoxDeliveryServiceID",
    "poBoxDeliveryServiceTypeCode",
    "taxJurisdictionCode",
    "timeZoneCode",
    "transportationZoneID",
    "regionalStructureElementGroupCode",
    "regionalStructureAddressConsistencyStatusCode",
    "regionalStructureCityCode",
    "additionalRegionalStructureCityCode",
    "poBoxDeviatingRegionalStructureCityCode",
    "regionalStructureDistrictCode",
    "regionalStructureStreetCode",
    "extendedBuildingID"
})
public class BPSUITERplctReqAddrInfoAddrPostlAddr {

    @XmlElement(name = "AddressRepresentationCode")
    protected AddressRepresentationCode addressRepresentationCode;
    @XmlElement(name = "CountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String countryCode;
    @XmlElement(name = "RegionCode")
    protected RegionCode regionCode;
    @XmlElement(name = "CityName")
    protected String cityName;
    @XmlElement(name = "AdditionalCityName")
    protected String additionalCityName;
    @XmlElement(name = "DistrictName")
    protected String districtName;
    @XmlElement(name = "StreetPostalCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String streetPostalCode;
    @XmlElement(name = "POBoxPostalCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String poBoxPostalCode;
    @XmlElement(name = "CompanyPostalCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String companyPostalCode;
    @XmlElement(name = "StreetPrefixName")
    protected String streetPrefixName;
    @XmlElement(name = "AdditionalStreetPrefixName")
    protected String additionalStreetPrefixName;
    @XmlElement(name = "StreetName")
    protected String streetName;
    @XmlElement(name = "StreetSuffixName")
    protected String streetSuffixName;
    @XmlElement(name = "AdditionalStreetSuffixName")
    protected String additionalStreetSuffixName;
    @XmlElement(name = "HouseID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String houseID;
    @XmlElement(name = "AdditionalHouseID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String additionalHouseID;
    @XmlElement(name = "BuildingID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String buildingID;
    @XmlElement(name = "RoomID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String roomID;
    @XmlElement(name = "FloorID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String floorID;
    @XmlElement(name = "CareOfName")
    protected String careOfName;
    @XmlElement(name = "StreetAddressMailNonDeliveryReasonCode")
    protected MailNonDeliveryReasonCode streetAddressMailNonDeliveryReasonCode;
    @XmlElement(name = "POBoxDeviatingCountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String poBoxDeviatingCountryCode;
    @XmlElement(name = "POBoxDeviatingRegionCode")
    protected RegionCode poBoxDeviatingRegionCode;
    @XmlElement(name = "POBoxDeviatingCityName")
    protected String poBoxDeviatingCityName;
    @XmlElement(name = "POBoxLobbyName")
    protected String poBoxLobbyName;
    @XmlElement(name = "POBoxID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String poBoxID;
    @XmlElement(name = "POBoxAddressMailNonDeliveryReasonCode")
    protected MailNonDeliveryReasonCode poBoxAddressMailNonDeliveryReasonCode;
    @XmlElement(name = "POBoxIDVisibleIndicator")
    protected Boolean poBoxIDVisibleIndicator;
    @XmlElement(name = "POBoxDeliveryServiceID")
    protected Identifier poBoxDeliveryServiceID;
    @XmlElement(name = "POBoxDeliveryServiceTypeCode")
    protected Code poBoxDeliveryServiceTypeCode;
    @XmlElement(name = "TaxJurisdictionCode")
    protected TaxJurisdictionCode taxJurisdictionCode;
    @XmlElement(name = "TimeZoneCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String timeZoneCode;
    @XmlElement(name = "TransportationZoneID")
    protected TransportationZoneID transportationZoneID;
    @XmlElement(name = "RegionalStructureElementGroupCode")
    protected RegionalStructureElementGroupCode regionalStructureElementGroupCode;
    @XmlElement(name = "RegionalStructureAddressConsistencyStatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String regionalStructureAddressConsistencyStatusCode;
    @XmlElement(name = "RegionalStructureCityCode")
    protected RegionalStructureCityCode regionalStructureCityCode;
    @XmlElement(name = "AdditionalRegionalStructureCityCode")
    protected RegionalStructureCityCode additionalRegionalStructureCityCode;
    @XmlElement(name = "POBoxDeviatingRegionalStructureCityCode")
    protected RegionalStructureCityCode poBoxDeviatingRegionalStructureCityCode;
    @XmlElement(name = "RegionalStructureDistrictCode")
    protected RegionalStructureDistrictCode regionalStructureDistrictCode;
    @XmlElement(name = "RegionalStructureStreetCode")
    protected RegionalStructureStreetCode regionalStructureStreetCode;
    @XmlElement(name = "ExtendedBuildingID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String extendedBuildingID;
    @XmlAttribute(name = "actionCode")
    protected String actionCode;

    /**
     * Obtém o valor da propriedade addressRepresentationCode.
     * 
     * @return
     *     possible object is
     *     {@link AddressRepresentationCode }
     *     
     */
    public AddressRepresentationCode getAddressRepresentationCode() {
        return addressRepresentationCode;
    }

    /**
     * Define o valor da propriedade addressRepresentationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressRepresentationCode }
     *     
     */
    public void setAddressRepresentationCode(AddressRepresentationCode value) {
        this.addressRepresentationCode = value;
    }

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
     * Obtém o valor da propriedade regionCode.
     * 
     * @return
     *     possible object is
     *     {@link RegionCode }
     *     
     */
    public RegionCode getRegionCode() {
        return regionCode;
    }

    /**
     * Define o valor da propriedade regionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionCode }
     *     
     */
    public void setRegionCode(RegionCode value) {
        this.regionCode = value;
    }

    /**
     * Obtém o valor da propriedade cityName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Define o valor da propriedade cityName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

    /**
     * Obtém o valor da propriedade additionalCityName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalCityName() {
        return additionalCityName;
    }

    /**
     * Define o valor da propriedade additionalCityName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalCityName(String value) {
        this.additionalCityName = value;
    }

    /**
     * Obtém o valor da propriedade districtName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrictName() {
        return districtName;
    }

    /**
     * Define o valor da propriedade districtName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictName(String value) {
        this.districtName = value;
    }

    /**
     * Obtém o valor da propriedade streetPostalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetPostalCode() {
        return streetPostalCode;
    }

    /**
     * Define o valor da propriedade streetPostalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetPostalCode(String value) {
        this.streetPostalCode = value;
    }

    /**
     * Obtém o valor da propriedade poBoxPostalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOBoxPostalCode() {
        return poBoxPostalCode;
    }

    /**
     * Define o valor da propriedade poBoxPostalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOBoxPostalCode(String value) {
        this.poBoxPostalCode = value;
    }

    /**
     * Obtém o valor da propriedade companyPostalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyPostalCode() {
        return companyPostalCode;
    }

    /**
     * Define o valor da propriedade companyPostalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyPostalCode(String value) {
        this.companyPostalCode = value;
    }

    /**
     * Obtém o valor da propriedade streetPrefixName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetPrefixName() {
        return streetPrefixName;
    }

    /**
     * Define o valor da propriedade streetPrefixName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetPrefixName(String value) {
        this.streetPrefixName = value;
    }

    /**
     * Obtém o valor da propriedade additionalStreetPrefixName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalStreetPrefixName() {
        return additionalStreetPrefixName;
    }

    /**
     * Define o valor da propriedade additionalStreetPrefixName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalStreetPrefixName(String value) {
        this.additionalStreetPrefixName = value;
    }

    /**
     * Obtém o valor da propriedade streetName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Define o valor da propriedade streetName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetName(String value) {
        this.streetName = value;
    }

    /**
     * Obtém o valor da propriedade streetSuffixName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetSuffixName() {
        return streetSuffixName;
    }

    /**
     * Define o valor da propriedade streetSuffixName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetSuffixName(String value) {
        this.streetSuffixName = value;
    }

    /**
     * Obtém o valor da propriedade additionalStreetSuffixName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalStreetSuffixName() {
        return additionalStreetSuffixName;
    }

    /**
     * Define o valor da propriedade additionalStreetSuffixName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalStreetSuffixName(String value) {
        this.additionalStreetSuffixName = value;
    }

    /**
     * Obtém o valor da propriedade houseID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseID() {
        return houseID;
    }

    /**
     * Define o valor da propriedade houseID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseID(String value) {
        this.houseID = value;
    }

    /**
     * Obtém o valor da propriedade additionalHouseID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalHouseID() {
        return additionalHouseID;
    }

    /**
     * Define o valor da propriedade additionalHouseID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalHouseID(String value) {
        this.additionalHouseID = value;
    }

    /**
     * Obtém o valor da propriedade buildingID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingID() {
        return buildingID;
    }

    /**
     * Define o valor da propriedade buildingID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildingID(String value) {
        this.buildingID = value;
    }

    /**
     * Obtém o valor da propriedade roomID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomID() {
        return roomID;
    }

    /**
     * Define o valor da propriedade roomID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomID(String value) {
        this.roomID = value;
    }

    /**
     * Obtém o valor da propriedade floorID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloorID() {
        return floorID;
    }

    /**
     * Define o valor da propriedade floorID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloorID(String value) {
        this.floorID = value;
    }

    /**
     * Obtém o valor da propriedade careOfName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCareOfName() {
        return careOfName;
    }

    /**
     * Define o valor da propriedade careOfName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCareOfName(String value) {
        this.careOfName = value;
    }

    /**
     * Obtém o valor da propriedade streetAddressMailNonDeliveryReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link MailNonDeliveryReasonCode }
     *     
     */
    public MailNonDeliveryReasonCode getStreetAddressMailNonDeliveryReasonCode() {
        return streetAddressMailNonDeliveryReasonCode;
    }

    /**
     * Define o valor da propriedade streetAddressMailNonDeliveryReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link MailNonDeliveryReasonCode }
     *     
     */
    public void setStreetAddressMailNonDeliveryReasonCode(MailNonDeliveryReasonCode value) {
        this.streetAddressMailNonDeliveryReasonCode = value;
    }

    /**
     * Obtém o valor da propriedade poBoxDeviatingCountryCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOBoxDeviatingCountryCode() {
        return poBoxDeviatingCountryCode;
    }

    /**
     * Define o valor da propriedade poBoxDeviatingCountryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOBoxDeviatingCountryCode(String value) {
        this.poBoxDeviatingCountryCode = value;
    }

    /**
     * Obtém o valor da propriedade poBoxDeviatingRegionCode.
     * 
     * @return
     *     possible object is
     *     {@link RegionCode }
     *     
     */
    public RegionCode getPOBoxDeviatingRegionCode() {
        return poBoxDeviatingRegionCode;
    }

    /**
     * Define o valor da propriedade poBoxDeviatingRegionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionCode }
     *     
     */
    public void setPOBoxDeviatingRegionCode(RegionCode value) {
        this.poBoxDeviatingRegionCode = value;
    }

    /**
     * Obtém o valor da propriedade poBoxDeviatingCityName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOBoxDeviatingCityName() {
        return poBoxDeviatingCityName;
    }

    /**
     * Define o valor da propriedade poBoxDeviatingCityName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOBoxDeviatingCityName(String value) {
        this.poBoxDeviatingCityName = value;
    }

    /**
     * Obtém o valor da propriedade poBoxLobbyName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOBoxLobbyName() {
        return poBoxLobbyName;
    }

    /**
     * Define o valor da propriedade poBoxLobbyName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOBoxLobbyName(String value) {
        this.poBoxLobbyName = value;
    }

    /**
     * Obtém o valor da propriedade poBoxID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOBoxID() {
        return poBoxID;
    }

    /**
     * Define o valor da propriedade poBoxID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOBoxID(String value) {
        this.poBoxID = value;
    }

    /**
     * Obtém o valor da propriedade poBoxAddressMailNonDeliveryReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link MailNonDeliveryReasonCode }
     *     
     */
    public MailNonDeliveryReasonCode getPOBoxAddressMailNonDeliveryReasonCode() {
        return poBoxAddressMailNonDeliveryReasonCode;
    }

    /**
     * Define o valor da propriedade poBoxAddressMailNonDeliveryReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link MailNonDeliveryReasonCode }
     *     
     */
    public void setPOBoxAddressMailNonDeliveryReasonCode(MailNonDeliveryReasonCode value) {
        this.poBoxAddressMailNonDeliveryReasonCode = value;
    }

    /**
     * Obtém o valor da propriedade poBoxIDVisibleIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPOBoxIDVisibleIndicator() {
        return poBoxIDVisibleIndicator;
    }

    /**
     * Define o valor da propriedade poBoxIDVisibleIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPOBoxIDVisibleIndicator(Boolean value) {
        this.poBoxIDVisibleIndicator = value;
    }

    /**
     * Obtém o valor da propriedade poBoxDeliveryServiceID.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getPOBoxDeliveryServiceID() {
        return poBoxDeliveryServiceID;
    }

    /**
     * Define o valor da propriedade poBoxDeliveryServiceID.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setPOBoxDeliveryServiceID(Identifier value) {
        this.poBoxDeliveryServiceID = value;
    }

    /**
     * Obtém o valor da propriedade poBoxDeliveryServiceTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getPOBoxDeliveryServiceTypeCode() {
        return poBoxDeliveryServiceTypeCode;
    }

    /**
     * Define o valor da propriedade poBoxDeliveryServiceTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setPOBoxDeliveryServiceTypeCode(Code value) {
        this.poBoxDeliveryServiceTypeCode = value;
    }

    /**
     * Obtém o valor da propriedade taxJurisdictionCode.
     * 
     * @return
     *     possible object is
     *     {@link TaxJurisdictionCode }
     *     
     */
    public TaxJurisdictionCode getTaxJurisdictionCode() {
        return taxJurisdictionCode;
    }

    /**
     * Define o valor da propriedade taxJurisdictionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxJurisdictionCode }
     *     
     */
    public void setTaxJurisdictionCode(TaxJurisdictionCode value) {
        this.taxJurisdictionCode = value;
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
     * Obtém o valor da propriedade transportationZoneID.
     * 
     * @return
     *     possible object is
     *     {@link TransportationZoneID }
     *     
     */
    public TransportationZoneID getTransportationZoneID() {
        return transportationZoneID;
    }

    /**
     * Define o valor da propriedade transportationZoneID.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportationZoneID }
     *     
     */
    public void setTransportationZoneID(TransportationZoneID value) {
        this.transportationZoneID = value;
    }

    /**
     * Obtém o valor da propriedade regionalStructureElementGroupCode.
     * 
     * @return
     *     possible object is
     *     {@link RegionalStructureElementGroupCode }
     *     
     */
    public RegionalStructureElementGroupCode getRegionalStructureElementGroupCode() {
        return regionalStructureElementGroupCode;
    }

    /**
     * Define o valor da propriedade regionalStructureElementGroupCode.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionalStructureElementGroupCode }
     *     
     */
    public void setRegionalStructureElementGroupCode(RegionalStructureElementGroupCode value) {
        this.regionalStructureElementGroupCode = value;
    }

    /**
     * Obtém o valor da propriedade regionalStructureAddressConsistencyStatusCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionalStructureAddressConsistencyStatusCode() {
        return regionalStructureAddressConsistencyStatusCode;
    }

    /**
     * Define o valor da propriedade regionalStructureAddressConsistencyStatusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionalStructureAddressConsistencyStatusCode(String value) {
        this.regionalStructureAddressConsistencyStatusCode = value;
    }

    /**
     * Obtém o valor da propriedade regionalStructureCityCode.
     * 
     * @return
     *     possible object is
     *     {@link RegionalStructureCityCode }
     *     
     */
    public RegionalStructureCityCode getRegionalStructureCityCode() {
        return regionalStructureCityCode;
    }

    /**
     * Define o valor da propriedade regionalStructureCityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionalStructureCityCode }
     *     
     */
    public void setRegionalStructureCityCode(RegionalStructureCityCode value) {
        this.regionalStructureCityCode = value;
    }

    /**
     * Obtém o valor da propriedade additionalRegionalStructureCityCode.
     * 
     * @return
     *     possible object is
     *     {@link RegionalStructureCityCode }
     *     
     */
    public RegionalStructureCityCode getAdditionalRegionalStructureCityCode() {
        return additionalRegionalStructureCityCode;
    }

    /**
     * Define o valor da propriedade additionalRegionalStructureCityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionalStructureCityCode }
     *     
     */
    public void setAdditionalRegionalStructureCityCode(RegionalStructureCityCode value) {
        this.additionalRegionalStructureCityCode = value;
    }

    /**
     * Obtém o valor da propriedade poBoxDeviatingRegionalStructureCityCode.
     * 
     * @return
     *     possible object is
     *     {@link RegionalStructureCityCode }
     *     
     */
    public RegionalStructureCityCode getPOBoxDeviatingRegionalStructureCityCode() {
        return poBoxDeviatingRegionalStructureCityCode;
    }

    /**
     * Define o valor da propriedade poBoxDeviatingRegionalStructureCityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionalStructureCityCode }
     *     
     */
    public void setPOBoxDeviatingRegionalStructureCityCode(RegionalStructureCityCode value) {
        this.poBoxDeviatingRegionalStructureCityCode = value;
    }

    /**
     * Obtém o valor da propriedade regionalStructureDistrictCode.
     * 
     * @return
     *     possible object is
     *     {@link RegionalStructureDistrictCode }
     *     
     */
    public RegionalStructureDistrictCode getRegionalStructureDistrictCode() {
        return regionalStructureDistrictCode;
    }

    /**
     * Define o valor da propriedade regionalStructureDistrictCode.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionalStructureDistrictCode }
     *     
     */
    public void setRegionalStructureDistrictCode(RegionalStructureDistrictCode value) {
        this.regionalStructureDistrictCode = value;
    }

    /**
     * Obtém o valor da propriedade regionalStructureStreetCode.
     * 
     * @return
     *     possible object is
     *     {@link RegionalStructureStreetCode }
     *     
     */
    public RegionalStructureStreetCode getRegionalStructureStreetCode() {
        return regionalStructureStreetCode;
    }

    /**
     * Define o valor da propriedade regionalStructureStreetCode.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionalStructureStreetCode }
     *     
     */
    public void setRegionalStructureStreetCode(RegionalStructureStreetCode value) {
        this.regionalStructureStreetCode = value;
    }

    /**
     * Obtém o valor da propriedade extendedBuildingID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendedBuildingID() {
        return extendedBuildingID;
    }

    /**
     * Define o valor da propriedade extendedBuildingID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendedBuildingID(String value) {
        this.extendedBuildingID = value;
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
