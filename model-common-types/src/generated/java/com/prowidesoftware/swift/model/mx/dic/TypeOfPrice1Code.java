
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfPrice1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeOfPrice1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AVER"/&gt;
 *     &lt;enumeration value="AVOV"/&gt;
 *     &lt;enumeration value="COMB"/&gt;
 *     &lt;enumeration value="GREX"/&gt;
 *     &lt;enumeration value="LIMI"/&gt;
 *     &lt;enumeration value="NET2"/&gt;
 *     &lt;enumeration value="NDIS"/&gt;
 *     &lt;enumeration value="NET1"/&gt;
 *     &lt;enumeration value="NUND"/&gt;
 *     &lt;enumeration value="NOGR"/&gt;
 *     &lt;enumeration value="PARV"/&gt;
 *     &lt;enumeration value="RDAV"/&gt;
 *     &lt;enumeration value="STOP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TypeOfPrice1Code")
@XmlEnum
public enum TypeOfPrice1Code {


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
     * Price is composed of the combined expenses (used in the UK market).
     * 
     */
    COMB("COMB"),

    /**
     * Price is a gross execution price. The price is an all inclusive price, ie, including all charges, fees, and taxes.
     * 
     */
    GREX("GREX"),

    /**
     * Price is the limit price of a limit order, eg, a customer might put in a limit order to sell financial instruments at 67 or to buy at 60.
     * 
     */
    LIMI("LIMI"),

    /**
     * Price is a net price, ie, net only of local broker's commission, local fees and local taxes.
     * 
     */
    @XmlEnumValue("NET2")
    NET_2("NET2"),

    /**
     * Price is net to the disclosed client.
     * 
     */
    NDIS("NDIS"),

    /**
     * Price is a net price, ie, net of all charges, fees and taxes.
     * 
     */
    @XmlEnumValue("NET1")
    NET_1("NET1"),

    /**
     * Price is net to the client undisclosed (used in the UK market).
     * 
     */
    NUND("NUND"),

    /**
     * Price is notional gross (used in the UK market).
     * 
     */
    NOGR("NOGR"),

    /**
     * Price is equal to the nominal or face value of the instrument.
     * 
     */
    PARV("PARV"),

    /**
     * Price is a rounded average price.
     * 
     */
    RDAV("RDAV"),

    /**
     * Price is a stop price used in an order to buy. The order becomes a market order when the financial instrument trades at or above the stop price after the order is submitted. In an order to sell the order becomes a market order when the financial instrument trades at or below the stop price.
     * 
     */
    STOP("STOP");
    private final String value;

    TypeOfPrice1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeOfPrice1Code fromValue(String v) {
        for (TypeOfPrice1Code c: TypeOfPrice1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
