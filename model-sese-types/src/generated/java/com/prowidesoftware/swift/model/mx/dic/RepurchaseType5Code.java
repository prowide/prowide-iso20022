
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RepurchaseType5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RepurchaseType5Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CALL"/>
 *     <enumeration value="RATE"/>
 *     <enumeration value="ROLP"/>
 *     <enumeration value="PADJ"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RepurchaseType5Code")
@XmlEnum
public enum RepurchaseType5Code {


    /**
     * Relates to a change in the closing or maturity date.
     * 
     */
    CALL,

    /**
     * Is part of a pair-off.
     * 
     */
    RATE,

    /**
     * Relates to a repo rollover of a position extending the closing or maturity date.
     * 
     */
    ROLP,

    /**
     * Relates to a principal adjustment.
     * 
     */
    PADJ;

    public String value() {
        return name();
    }

    public static RepurchaseType5Code fromValue(String v) {
        return valueOf(v);
    }

}
