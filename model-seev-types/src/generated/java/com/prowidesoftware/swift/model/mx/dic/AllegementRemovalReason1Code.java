
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AllegementRemovalReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AllegementRemovalReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CANC"/>
 *     <enumeration value="REMO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AllegementRemovalReason1Code")
@XmlEnum
public enum AllegementRemovalReason1Code {


    /**
     * Allegement removed as the counterparty has cancelled its instruction.
     * 
     */
    CANC,

    /**
     * Allegement removed as a matching instruction has been received.
     * 
     */
    REMO;

    public String value() {
        return name();
    }

    public static AllegementRemovalReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
