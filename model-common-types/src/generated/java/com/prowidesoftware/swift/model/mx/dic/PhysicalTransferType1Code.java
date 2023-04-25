
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhysicalTransferType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PhysicalTransferType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DEMT"/>
 *     <enumeration value="PHYS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PhysicalTransferType1Code")
@XmlEnum
public enum PhysicalTransferType1Code {


    /**
     * Dematerialised transfer.
     * 
     */
    DEMT,

    /**
     * Physical transfer.
     * 
     */
    PHYS;

    public String value() {
        return name();
    }

    public static PhysicalTransferType1Code fromValue(String v) {
        return valueOf(v);
    }

}
