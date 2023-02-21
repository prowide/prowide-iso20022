
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfPrice3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeOfPrice3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AVER"/&gt;
 *     &lt;enumeration value="AVOV"/&gt;
 *     &lt;enumeration value="GREX"/&gt;
 *     &lt;enumeration value="NET2"/&gt;
 *     &lt;enumeration value="NET1"/&gt;
 *     &lt;enumeration value="PARV"/&gt;
 *     &lt;enumeration value="RDAV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TypeOfPrice3Code")
@XmlEnum
public enum TypeOfPrice3Code {


    /**
     * Price is an average execution price.
     * 
     */
    AVER("AVER"),

    /**
     * Price is an override of the average price.
     * 
     */
    AVOV("AVOV"),

    /**
     * Price is a gross execution price. The price is an all inclusive price, ie, including all charges, fees, and taxes.
     * 
     */
    GREX("GREX"),

    /**
     * Price is a net price, ie, net only of local broker's commission, local fees and local taxes.
     * 
     */
    @XmlEnumValue("NET2")
    NET_2("NET2"),

    /**
     * Price is a net price, ie, net of all charges, fees and taxes.
     * 
     */
    @XmlEnumValue("NET1")
    NET_1("NET1"),

    /**
     * Price is equal to the nominal or face value of the instrument.
     * 
     */
    PARV("PARV"),

    /**
     * Price is a rounded average price.
     * 
     */
    RDAV("RDAV");
    private final String value;

    TypeOfPrice3Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeOfPrice3Code fromValue(String v) {
        for (TypeOfPrice3Code c: TypeOfPrice3Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
