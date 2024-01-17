
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TerminationReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TerminationReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="REFU"/>
 *     <enumeration value="NOAC"/>
 *     <enumeration value="BUFI"/>
 *     <enumeration value="WOEX"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TerminationReason1Code")
@XmlEnum
public enum TerminationReason1Code {


    /**
     * Reason for termination is reduction terms have been fulfilled.
     * 
     */
    REFU,

    /**
     * Reason for termination is non-acceptance of a tender.
     * 
     */
    NOAC,

    /**
     * Reason for termination is underlying business has finished.
     * 
     */
    BUFI,

    /**
     * Reason for termination is warranty obligation period has expired.
     * 
     */
    WOEX;

    public String value() {
        return name();
    }

    public static TerminationReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
