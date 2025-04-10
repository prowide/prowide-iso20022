
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PINFormat4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PINFormat4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ANSI"/>
 *     <enumeration value="BNCM"/>
 *     <enumeration value="BKSY"/>
 *     <enumeration value="DBLD"/>
 *     <enumeration value="DBLC"/>
 *     <enumeration value="ECI2"/>
 *     <enumeration value="ECI3"/>
 *     <enumeration value="EMVS"/>
 *     <enumeration value="IBM3"/>
 *     <enumeration value="ISO0"/>
 *     <enumeration value="ISO1"/>
 *     <enumeration value="ISO2"/>
 *     <enumeration value="ISO3"/>
 *     <enumeration value="ISO4"/>
 *     <enumeration value="ISO5"/>
 *     <enumeration value="VIS2"/>
 *     <enumeration value="VIS3"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PINFormat4Code")
@XmlEnum
public enum PINFormat4Code {


    /**
     * ANSI 0 PIN block format.
     * 
     */
    ANSI("ANSI"),

    /**
     * Italian Bancomat PIN block format.
     * 
     */
    BNCM("BNCM"),

    /**
     * Banksys PIN block format.
     * 
     */
    BKSY("BKSY"),

    /**
     * Diebold PIN block format.
     * 
     */
    DBLD("DBLD"),

    /**
     * Diebold CO PIN block format.
     * 
     */
    DBLC("DBLC"),

    /**
     * ECI2 PIN block format.
     * 
     */
    @XmlEnumValue("ECI2")
    ECI_2("ECI2"),

    /**
     * ECI3 PIN block format.
     * 
     */
    @XmlEnumValue("ECI3")
    ECI_3("ECI3"),

    /**
     * EMV ISO2 PIN block format encrypted with the EMV RSA cryptographic key for the PIN.
     * 
     */
    EMVS("EMVS"),

    /**
     * IBM 3624 PIN block format.
     * 
     */
    @XmlEnumValue("IBM3")
    IBM_3("IBM3"),

    /**
     * PIN diversified with the card account number, conforming to the standard ISO 9564-2.
     * 
     */
    @XmlEnumValue("ISO0")
    ISO_0("ISO0"),

    /**
     * PIN completed with random padding characters, conforming to the standard ISO 9564-2.
     * 
     */
    @XmlEnumValue("ISO1")
    ISO_1("ISO1"),

    /**
     * PIN without diversification characters, conforming to the standard ISO 9564-2.
     * 
     */
    @XmlEnumValue("ISO2")
    ISO_2("ISO2"),

    /**
     * PIN diversified with the card account number and random characters, conforming to the standard ISO 9564-2.
     * 
     */
    @XmlEnumValue("ISO3")
    ISO_3("ISO3"),

    /**
     * PIN format used with AES encryption, conforming to the new ISO SC2 format.
     * 
     */
    @XmlEnumValue("ISO4")
    ISO_4("ISO4"),

    /**
     * Alternative PIN format used with AES encryption, conforming to the new ISO SC2 format.
     * 
     */
    @XmlEnumValue("ISO5")
    ISO_5("ISO5"),

    /**
     * VISA2 PIN block format.
     * 
     */
    @XmlEnumValue("VIS2")
    VIS_2("VIS2"),

    /**
     * VISA3 PIN block format.
     * 
     */
    @XmlEnumValue("VIS3")
    VIS_3("VIS3");
    private final String value;

    PINFormat4Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PINFormat4Code fromValue(String v) {
        for (PINFormat4Code c: PINFormat4Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
