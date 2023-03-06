
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelativeSize1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RelativeSize1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SMAL"/&gt;
 *     &lt;enumeration value="MEDI"/&gt;
 *     &lt;enumeration value="LARG"/&gt;
 *     &lt;enumeration value="UNDI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RelativeSize1Code")
@XmlEnum
public enum RelativeSize1Code {


    /**
     * Indicates that the relative size is small.
     * 
     */
    SMAL,

    /**
     * Indicates that the relative size is medium.
     * 
     */
    MEDI,

    /**
     * Indicates that the relative size is large.
     * 
     */
    LARG,

    /**
     * Indicates that the quantity is undisclosed.
     * 
     */
    UNDI;

    public String value() {
        return name();
    }

    public static RelativeSize1Code fromValue(String v) {
        return valueOf(v);
    }

}
