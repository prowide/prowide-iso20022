
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QRCodeErrorCorrection1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QRCodeErrorCorrection1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="M015"/&gt;
 *     &lt;enumeration value="Q025"/&gt;
 *     &lt;enumeration value="H030"/&gt;
 *     &lt;enumeration value="L007"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "QRCodeErrorCorrection1Code")
@XmlEnum
public enum QRCodeErrorCorrection1Code {


    /**
     * Reed-Solomon error correction 15%
     * 
     */
    @XmlEnumValue("M015")
    M_015("M015"),

    /**
     * Reed-Solomon error correction 25%
     * 
     */
    @XmlEnumValue("Q025")
    Q_025("Q025"),

    /**
     * Reed-Solomon error correction 30%
     * 
     */
    @XmlEnumValue("H030")
    H_030("H030"),

    /**
     * Reed-Solomon error correction  7%
     * 
     */
    @XmlEnumValue("L007")
    L_007("L007");
    private final String value;

    QRCodeErrorCorrection1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QRCodeErrorCorrection1Code fromValue(String v) {
        for (QRCodeErrorCorrection1Code c: QRCodeErrorCorrection1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
