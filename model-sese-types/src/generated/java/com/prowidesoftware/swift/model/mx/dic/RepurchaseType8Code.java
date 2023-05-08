
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RepurchaseType8Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RepurchaseType8Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PADJ"/>
 *     <enumeration value="ROLP"/>
 *     <enumeration value="RATE"/>
 *     <enumeration value="CALL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RepurchaseType8Code")
@XmlEnum
public enum RepurchaseType8Code {


    /**
     * Relates to a principal adjustment.
     * 
     */
    PADJ,

    /**
     * Relates to a repo rollover of a contract extending the closing or maturity date without the underlying collateral impacted.
     * 
     */
    ROLP,

    /**
     * Is part of a pair-off.
     * 
     */
    RATE,

    /**
     * Relates to the early closing/maturity date for a term repo or a termination date of an open repo with the underlying collateral.
     * 
     */
    CALL;

    public String value() {
        return name();
    }

    public static RepurchaseType8Code fromValue(String v) {
        return valueOf(v);
    }

}
