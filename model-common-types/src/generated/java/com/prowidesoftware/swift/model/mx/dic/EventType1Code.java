
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EventType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PUT1"/&gt;
 *     &lt;enumeration value="CALL"/&gt;
 *     &lt;enumeration value="TEND"/&gt;
 *     &lt;enumeration value="ACTI"/&gt;
 *     &lt;enumeration value="INAC"/&gt;
 *     &lt;enumeration value="SFCA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EventType1Code")
@XmlEnum
public enum EventType1Code {


    /**
     * In fixed income this is the put provision on the bond allowing the investor the right to "redeem the bond at a specified price prior to maturity".
     * 
     */
    @XmlEnumValue("PUT1")
    PUT_1("PUT1"),

    /**
     * In fixed income this is the call provision on the bond allowing the bond issuer "the right to redeem [the bond] prior to its maturity date, under certain conditions.".
     * 
     */
    CALL("CALL"),

    /**
     * Synonymous with Put but is the preferred term for certain asset classes in some markets.
     * 
     */
    TEND("TEND"),

    /**
     * Date when the security is activated for trading and clearing.
     * 
     */
    ACTI("ACTI"),

    /**
     * Date when the security is no longer available for trading and clearing.
     * 
     */
    INAC("INAC"),

    /**
     * A provision allowing a bond issuer the opportunity to buy outstanding bonds from bondholders for a set rate, using money (a sinking fund) from the issuer's earnings saved specifically for security buybacks. Because it adds doubt for investors over whether the bond will continue to pay until its maturity date, a sinking fund call is seen as an additional risk for investors.
     * 
     */
    SFCA("SFCA");
    private final String value;

    EventType1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EventType1Code fromValue(String v) {
        for (EventType1Code c: EventType1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
