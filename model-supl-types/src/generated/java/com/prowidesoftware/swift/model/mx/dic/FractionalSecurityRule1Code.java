
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FractionalSecurityRule1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FractionalSecurityRule1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BORU"/&gt;
 *     &lt;enumeration value="BCIL"/&gt;
 *     &lt;enumeration value="BORD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FractionalSecurityRule1Code")
@XmlEnum
public enum FractionalSecurityRule1Code {


    /**
     * Round Up x and above on the beneficial owner fractions, where x is the rounding factor. For an example if rounding factor is 0.6 this means that fractional units greater than or equal to 6 will be rounded up and  less than 6 will be rounded down.
     * 
     */
    BORU,

    /**
     * Cash in Lieu on the beneficial owner fractions. 
     * 
     */
    BCIL,

    /**
     * Round Down x and below beneficial owner fractions, where x is the rounding factor. For an example if rounding factor is 0.6 this means that fractional units greater than or equal to 6 will be rounded up and  less than 6 will be rounded down.
     * 
     */
    BORD;

    public String value() {
        return name();
    }

    public static FractionalSecurityRule1Code fromValue(String v) {
        return valueOf(v);
    }

}
