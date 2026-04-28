
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeemedRateType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeemedRateType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DEDI"/&gt;
 *     &lt;enumeration value="DEFP"/&gt;
 *     &lt;enumeration value="DEIT"/&gt;
 *     &lt;enumeration value="DERY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DeemedRateType1Code")
@XmlEnum
public enum DeemedRateType1Code {


    /**
     * Deemed rate of dividend proceeds attributed to the security holder.
     * 
     */
    DEDI,

    /**
     * Deemed rate of fund proceeds attributed to the security holder.
     * 
     */
    DEFP,

    /**
     * Deemed rate of interest proceeds attributed to the security holder.
     * 
     */
    DEIT,

    /**
     * Deemed rate of royalties proceeds attributed to the security holder.
     * 
     */
    DERY;

    public String value() {
        return name();
    }

    public static DeemedRateType1Code fromValue(String v) {
        return valueOf(v);
    }

}
