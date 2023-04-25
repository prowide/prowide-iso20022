
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResolutionStatus2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ResolutionStatus2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACPT"/>
 *     <enumeration value="REJT"/>
 *     <enumeration value="WDRA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ResolutionStatus2Code")
@XmlEnum
public enum ResolutionStatus2Code {


    /**
     * Meeting resolution has been accepted.
     * 
     */
    ACPT,

    /**
     * Meeting resolution has been rejected.
     * 
     */
    REJT,

    /**
     * Meeting resolution has been withdrawn.
     * 
     */
    WDRA;

    public String value() {
        return name();
    }

    public static ResolutionStatus2Code fromValue(String v) {
        return valueOf(v);
    }

}
