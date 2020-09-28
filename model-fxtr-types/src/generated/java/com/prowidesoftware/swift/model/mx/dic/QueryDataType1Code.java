
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryDataType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QueryDataType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="QFXT"/&gt;
 *     &lt;enumeration value="QOTD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "QueryDataType1Code")
@XmlEnum
public enum QueryDataType1Code {


    /**
     * Query for tading data of foreign exchange.
     * 
     */
    QFXT,

    /**
     * Query for tading data of option.
     * 
     */
    QOTD;

    public String value() {
        return name();
    }

    public static QueryDataType1Code fromValue(String v) {
        return valueOf(v);
    }

}
