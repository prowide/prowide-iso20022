
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemClosureReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SystemClosureReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BHOL"/>
 *     <enumeration value="SMTN"/>
 *     <enumeration value="NOOP"/>
 *     <enumeration value="RCVR"/>
 *     <enumeration value="ADTW"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SystemClosureReason1Code")
@XmlEnum
public enum SystemClosureReason1Code {


    /**
     * System is closed due to a bank holiday.
     * 
     */
    BHOL,

    /**
     * System is closed for maintenance reasons.
     * 
     */
    SMTN,

    /**
     * System is not processing any operation.
     * 
     */
    NOOP,

    /**
     * System is not operational during recovery operations.
     * 
     */
    RCVR,

    /**
     * System is not operational during allowed downtime windows.
     * 
     */
    ADTW;

    public String value() {
        return name();
    }

    public static SystemClosureReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
