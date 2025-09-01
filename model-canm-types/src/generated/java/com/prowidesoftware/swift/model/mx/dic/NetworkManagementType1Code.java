
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkManagementType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NetworkManagementType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ECTS"/&gt;
 *     &lt;enumeration value="ESFW"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="SGNF"/&gt;
 *     &lt;enumeration value="SGNN"/&gt;
 *     &lt;enumeration value="DSFW"/&gt;
 *     &lt;enumeration value="TSUN"/&gt;
 *     &lt;enumeration value="MOSB"/&gt;
 *     &lt;enumeration value="SPIN"/&gt;
 *     &lt;enumeration value="IART"/&gt;
 *     &lt;enumeration value="SYCL"/&gt;
 *     &lt;enumeration value="DRBI"/&gt;
 *     &lt;enumeration value="ERBI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
