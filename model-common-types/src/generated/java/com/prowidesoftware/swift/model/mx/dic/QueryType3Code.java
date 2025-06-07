
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QueryType3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ALLL"/&gt;
 *     &lt;enumeration value="CHNG"/&gt;
 *     &lt;enumeration value="MODF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "QueryType3Code")
@XmlEnum
public enum QueryType3Code {


    /**
     * Specifies that the query requests that all matching items be returned.
     * 
     */
    ALLL,

    /**
     * Specifies that the query requests that only new matching items since the last similar query be returned.
     * 
     */
    CHNG,

    /**
     * Specifies that the query requests that only items that have changed since the last query be returned.
     * 
     */
    MODF;

    public String value() {
        return name();
    }

    public static QueryType3Code fromValue(String v) {
        return valueOf(v);
    }

}
