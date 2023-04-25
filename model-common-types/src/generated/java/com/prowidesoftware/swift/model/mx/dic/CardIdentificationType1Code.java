
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardIdentificationType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CardIdentificationType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACCT"/>
 *     <enumeration value="BARC"/>
 *     <enumeration value="ISO2"/>
 *     <enumeration value="PHON"/>
 *     <enumeration value="CPAN"/>
 *     <enumeration value="PRIV"/>
 *     <enumeration value="UUID"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CardIdentificationType1Code")
@XmlEnum
public enum CardIdentificationType1Code {


    /**
     * Account identification.
     * 
     */
    ACCT("ACCT"),

    /**
     * Bar-code with a specific form of identification.
     * 
     */
    BARC("BARC"),

    /**
     * ISO Track 2 including identification.
     * 
     */
    @XmlEnumValue("ISO2")
    ISO_2("ISO2"),

    /**
     * A phone number identifies the account on which the phone card is assigned.
     * 
     */
    PHON("PHON"),

    /**
     * Standard card identification (card number).
     * 
     */
    CPAN("CPAN"),

    /**
     * An identification set by a privative application.
     * 
     */
    PRIV("PRIV"),

    /**
     * A Universal Unique Identification code is set for identification.
     * 
     */
    UUID("UUID");
    private final String value;

    CardIdentificationType1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CardIdentificationType1Code fromValue(String v) {
        for (CardIdentificationType1Code c: CardIdentificationType1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
