
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkManagementType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="NetworkManagementType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ECTS"/>
 *     <enumeration value="ESFW"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="SGNF"/>
 *     <enumeration value="SGNN"/>
 *     <enumeration value="DSFW"/>
 *     <enumeration value="TSUN"/>
 *     <enumeration value="MOSB"/>
 *     <enumeration value="SPIN"/>
 *     <enumeration value="IART"/>
 *     <enumeration value="SYCL"/>
 *     <enumeration value="DRBI"/>
 *     <enumeration value="ERBI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "NetworkManagementType1Code")
@XmlEnum
public enum NetworkManagementType1Code {


    /**
     * Detects whether communication at application level is still active.
     * 
     */
    ECTS,

    /**
     * Enable receipt of store and forward advice and notification messages.
     * 
     */
    ESFW,

    /**
     * Other type of communication management service defined at national level.
     * 
     */
    OTHN,

    /**
     * Other type of network management service defined at private level.
     * 
     */
    OTHP,

    /**
     * Terminate communication at application level.
     * 
     */
    SGNF,

    /**
     * Establish communication at application level.
     * 
     */
    SGNN,

    /**
     * Disable receipt of store and forward advice and notification messages.
     * 
     */
    DSFW,

    /**
     * System condition/target system unavailable
     * 
     * 
     */
    TSUN,

    /**
     * System condition/message originator's system in backup.
     * 
     */
    MOSB,

    /**
     * System condition/special instruction
     * 
     */
    SPIN,

    /**
     * System condition/initiate alternate routing
     * 
     */
    IART,

    /**
     * Clock synchronization
     * 
     */
    SYCL,

    /**
     * Disable the receipt of recurring billing.
     * 
     */
    DRBI,

    /**
     * Enable the receipt of recurring billing.
     * 
     */
    ERBI;

    public String value() {
        return name();
    }

    public static NetworkManagementType1Code fromValue(String v) {
        return valueOf(v);
    }

}
