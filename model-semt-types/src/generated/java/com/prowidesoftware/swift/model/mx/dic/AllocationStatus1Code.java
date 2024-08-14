
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AllocationStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AllocationStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AOLF"/>
 *     <enumeration value="AOLP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AllocationStatus1Code")
@XmlEnum
public enum AllocationStatus1Code {


    /**
     * Instruction has been fully covered by collateral.
     * 
     */
    AOLF,

    /**
     * Instruction has been partially covered by collateral.
     * 
     */
    AOLP;

    public String value() {
        return name();
    }

    public static AllocationStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
