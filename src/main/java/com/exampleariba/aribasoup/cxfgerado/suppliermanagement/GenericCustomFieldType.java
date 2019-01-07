
package com.exampleariba.aribasoup.cxfgerado.suppliermanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de GenericCustomFieldType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="GenericCustomFieldType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Code"/&gt;
 *     &lt;enumeration value="Date"/&gt;
 *     &lt;enumeration value="Decimal"/&gt;
 *     &lt;enumeration value="Indicator"/&gt;
 *     &lt;enumeration value="Text"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GenericCustomFieldType")
@XmlEnum
public enum GenericCustomFieldType {

    @XmlEnumValue("Code")
    CODE("Code"),
    @XmlEnumValue("Date")
    DATE("Date"),
    @XmlEnumValue("Decimal")
    DECIMAL("Decimal"),
    @XmlEnumValue("Indicator")
    INDICATOR("Indicator"),
    @XmlEnumValue("Text")
    TEXT("Text");
    private final String value;

    GenericCustomFieldType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GenericCustomFieldType fromValue(String v) {
        for (GenericCustomFieldType c: GenericCustomFieldType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
