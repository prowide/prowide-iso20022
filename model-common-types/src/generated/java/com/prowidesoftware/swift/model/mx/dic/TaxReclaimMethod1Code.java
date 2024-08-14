
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxReclaimMethod1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TaxReclaimMethod1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="INPP"/>
 *     <enumeration value="INPS"/>
 *     <enumeration value="INSU"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TaxReclaimMethod1Code")
@XmlEnum
public enum TaxReclaimMethod1Code {


    /**
     * Invoice printed and given to purchaser and then used for tax reclaim
     * 
     */
    INPP,

    /**
     * Invoice printed but treated as supplemental because electronic copy is used for tax reclaim
     * 
     */
    INPS,

    /**
     * Printed invoice suppressed because electronic master version is used for tax reclaim
     * 
     */
    INSU,

    /**
     * Other tax reclaim method not elsewhere specified
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static TaxReclaimMethod1Code fromValue(String v) {
        return valueOf(v);
    }

}
