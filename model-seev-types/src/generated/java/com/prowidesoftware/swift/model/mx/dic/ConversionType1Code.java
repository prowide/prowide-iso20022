
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConversionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConversionType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FINL"/&gt;
 *     &lt;enumeration value="INTE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConversionType1Code")
@XmlEnum
public enum ConversionType1Code {


    /**
     * This is a final conversion.
     * 
     */
    FINL,

    /**
     * This is an interim conversion.
     * 
     */
    INTE;

    public String value() {
        return name();
    }

    public static ConversionType1Code fromValue(String v) {
        return valueOf(v);
    }

}
