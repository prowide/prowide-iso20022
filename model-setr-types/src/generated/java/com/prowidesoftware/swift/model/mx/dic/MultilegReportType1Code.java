
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MultilegReportType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MultilegReportType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BYSE"/>
 *     <enumeration value="BSBL"/>
 *     <enumeration value="BYLE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MultilegReportType1Code")
@XmlEnum
public enum MultilegReportType1Code {


    /**
     * Report by multileg security only (do not report legs).
     * 
     */
    BYSE,

    /**
     * Report by multileg security and by instrument legs belonging to the multileg security.
     * 
     */
    BSBL,

    /**
     * Report by instrument legs belonging to the multileg security only (do not report status of multileg security).
     * 
     */
    BYLE;

    public String value() {
        return name();
    }

    public static MultilegReportType1Code fromValue(String v) {
        return valueOf(v);
    }

}
