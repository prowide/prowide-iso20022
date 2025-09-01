
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FloorLimitType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FloorLimitType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CRED"/&gt;
 *     &lt;enumeration value="DEBT"/&gt;
 *     &lt;enumeration value="BOTH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FloorLimitType1Code")
@XmlEnum
public enum FloorLimitType1Code {


    /**
     * Floor limit applies to credit entries.
     * 
     */
    CRED,

    /**
     * Floor limit applies to debit entries.
     * 
     */
    DEBT,

    /**
     * Floor limit applies to both credit and debit entries.
     * 
     */
    BOTH;

    public String value() {
        return name();
    }

    public static FloorLimitType1Code fromValue(String v) {
        return valueOf(v);
    }

}
