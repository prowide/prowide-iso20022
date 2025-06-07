
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyExceptionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PartyExceptionType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AGGR"/&gt;
 *     &lt;enumeration value="PNAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PartyExceptionType1Code")
@XmlEnum
public enum PartyExceptionType1Code {


    /**
     * Aggregated orders
     * 
     */
    AGGR,

    /**
     * Pending allocations 
     * 
     */
    PNAL;

    public String value() {
        return name();
    }

    public static PartyExceptionType1Code fromValue(String v) {
        return valueOf(v);
    }

}
