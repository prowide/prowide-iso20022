
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClearingExemptionException1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClearingExemptionException1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="COOP"/&gt;
 *     &lt;enumeration value="ENDU"/&gt;
 *     &lt;enumeration value="AFFL"/&gt;
 *     &lt;enumeration value="NOAL"/&gt;
 *     &lt;enumeration value="NORE"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="SMBK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ClearingExemptionException1Code")
@XmlEnum
public enum ClearingExemptionException1Code {


    /**
     * Cooperative exemption.
     * 
     */
    COOP,

    /**
     * End user exemption.
     * 
     */
    ENDU,

    /**
     * Inter affiliate exemption.
     * 
     */
    AFFL,

    /**
     * No action letter relief.
     * 
     */
    NOAL,

    /**
     * No reason.
     * 
     */
    NORE,

    /**
     * Other.
     * 
     */
    OTHR,

    /**
     * Small bank exemption
     * 
     */
    SMBK;

    public String value() {
        return name();
    }

    public static ClearingExemptionException1Code fromValue(String v) {
        return valueOf(v);
    }

}
