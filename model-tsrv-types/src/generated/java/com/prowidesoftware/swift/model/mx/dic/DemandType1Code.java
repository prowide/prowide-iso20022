
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DemandType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DemandType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PAYM"/&gt;
 *     &lt;enumeration value="PAEX"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DemandType1Code")
@XmlEnum
public enum DemandType1Code {


    /**
     * Pay only.
     * 
     */
    PAYM,

    /**
     * Pay or extend.
     * 
     */
    PAEX;

    public String value() {
        return name();
    }

    public static DemandType1Code fromValue(String v) {
        return valueOf(v);
    }

}
