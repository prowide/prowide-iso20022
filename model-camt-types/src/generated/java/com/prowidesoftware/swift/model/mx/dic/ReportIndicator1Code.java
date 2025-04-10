
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportIndicator1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ReportIndicator1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="STND"/>
 *     <enumeration value="PRPR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ReportIndicator1Code")
@XmlEnum
public enum ReportIndicator1Code {


    /**
     * Requested report must contain information in the format of a statement.
     * 
     */
    STND,

    /**
     * Requested report must contain information in a bilaterally agreed format.
     * 
     */
    PRPR;

    public String value() {
        return name();
    }

    public static ReportIndicator1Code fromValue(String v) {
        return valueOf(v);
    }

}
