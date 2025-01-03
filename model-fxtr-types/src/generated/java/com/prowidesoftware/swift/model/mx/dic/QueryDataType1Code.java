
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryDataType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="QueryDataType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="QFXT"/>
 *     <enumeration value="QOTD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
