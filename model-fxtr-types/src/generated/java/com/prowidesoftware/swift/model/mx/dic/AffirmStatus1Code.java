
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AffirmStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AffirmStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ATCN"/&gt;
 *     &lt;enumeration value="ATSC"/&gt;
 *     &lt;enumeration value="COMP"/&gt;
 *     &lt;enumeration value="MISM"/&gt;
 *     &lt;enumeration value="MISE"/&gt;
 *     &lt;enumeration value="NOTP"/&gt;
 *     &lt;enumeration value="OUOR"/&gt;
 *     &lt;enumeration value="OUOS"/&gt;
 *     &lt;enumeration value="RECE"/&gt;
 *     &lt;enumeration value="UNRE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AffirmStatus1Code")
@XmlEnum
public enum AffirmStatus1Code {


    /**
     * Notfies that the trade confimation was conpleted.
     * 
     */
    ATCN,

    /**
     * Notfies the clearing status changed.
     * 
     */
    ATSC,

    /**
     * Data was successfully matched.
     * 
     */
    COMP,

    /**
     * Data was mismatched.
     * 
     */
    MISM,

    /**
     * Model has errors.
     * 
     */
    MISE,

    /**
     * Have no trading permissions.
     * 
     */
    NOTP,

    /**
     * Query time was out of range.
     * 
     */
    OUOR,

    /**
     * Query time was over system service time.
     * 
     */
    OUOS,

    /**
     * Format of upload data was right, and system receives successfully.
     * 
     */
    RECE,

    /**
     * Format of upload data was wrong, and system receives unsuccessfully.
     * 
     */
    UNRE;

    public String value() {
        return name();
    }

    public static AffirmStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
