
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralAppliedExcess1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CollateralAppliedExcess1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="APLD"/>
 *     <enumeration value="EXCS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CollateralAppliedExcess1Code")
@XmlEnum
public enum CollateralAppliedExcess1Code {


    /**
     * Collateral used by the collateral receiver to discharge liabilities owed to it by the collateral provider.
     * 
     * 
     */
    APLD,

    /**
     * Collateral held by the collateral receiver either in anticipation of future liabilities or towards previously liabilities no longer owed to it.
     * 
     * 
     */
    EXCS;

    public String value() {
        return name();
    }

    public static CollateralAppliedExcess1Code fromValue(String v) {
        return valueOf(v);
    }

}
