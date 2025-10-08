
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonEquityAssetClass1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NonEquityAssetClass1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SDRV"/&gt;
 *     &lt;enumeration value="IRDV"/&gt;
 *     &lt;enumeration value="FEXD"/&gt;
 *     &lt;enumeration value="EQDV"/&gt;
 *     &lt;enumeration value="EADV"/&gt;
 *     &lt;enumeration value="EMAL"/&gt;
 *     &lt;enumeration value="CRDV"/&gt;
 *     &lt;enumeration value="CFDS"/&gt;
 *     &lt;enumeration value="COMD"/&gt;
 *     &lt;enumeration value="C10D"/&gt;
 *     &lt;enumeration value="BOND"/&gt;
 *     &lt;enumeration value="ETCS"/&gt;
 *     &lt;enumeration value="ETNS"/&gt;
 *     &lt;enumeration value="SFPS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NonEquityAssetClass1Code")
@XmlEnum
public enum NonEquityAssetClass1Code {


    /**
     * Securitised derivative.
     * 
     */
    SDRV("SDRV"),

    /**
     * Interest rate derivative.
     * 
     */
    IRDV("IRDV"),

    /**
     * Foreign exchange derivative.
     * 
     */
    FEXD("FEXD"),

    /**
     * Equity derivative.
     * 
     */
    EQDV("EQDV"),

    /**
     * Emission allowance derivative.
     * 
     */
    EADV("EADV"),

    /**
     * Emission allowance.
     * 
     */
    EMAL("EMAL"),

    /**
     * Credit derivative.
     * 
     */
    CRDV("CRDV"),

    /**
     * Contract for difference.
     * 
     */
    CFDS("CFDS"),

    /**
     * Commodity derivative.
     * 
     */
    COMD("COMD"),

    /**
     * C10 derivative.
     * 
     */
    @XmlEnumValue("C10D")
    C_10_D("C10D"),

    /**
     * Bond.
     * 
     */
    BOND("BOND"),

    /**
     * Exchange traded commodities.
     * 
     */
    ETCS("ETCS"),

    /**
     * Exchange traded note.
     * 
     */
    ETNS("ETNS"),

    /**
     * Structured finance product.
     * 
     */
    SFPS("SFPS");
    private final String value;

    NonEquityAssetClass1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NonEquityAssetClass1Code fromValue(String v) {
        for (NonEquityAssetClass1Code c: NonEquityAssetClass1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
