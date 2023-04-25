
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhysicalTransferType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PhysicalTransferType4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PHYS"/>
 *     <enumeration value="OPTL"/>
 *     <enumeration value="CASH"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PhysicalTransferType4Code")
@XmlEnum
public enum PhysicalTransferType4Code {


    /**
     * Physical transfer.
     * 
     */
    PHYS,

    /**
     * Determined by a third party or optional for counterparty.
     * 
     */
    OPTL,

    /**
     * Cash transfer.
     * 
     */
    CASH;

    public String value() {
        return name();
    }

    public static PhysicalTransferType4Code fromValue(String v) {
        return valueOf(v);
    }

}
