
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportIndicator1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportIndicator1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="STND"/&gt;
 *     &lt;enumeration value="PRPR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
