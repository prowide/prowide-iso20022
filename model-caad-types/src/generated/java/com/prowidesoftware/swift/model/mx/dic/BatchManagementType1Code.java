
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatchManagementType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BatchManagementType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AKRQ"/&gt;
 *     &lt;enumeration value="AKRP"/&gt;
 *     &lt;enumeration value="ENDB"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="STRT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BatchManagementType1Code")
@XmlEnum
public enum BatchManagementType1Code {


    /**
     * Acknowledgement requested by the originator to the destination (used with a notification message exclusively).
     * 
     */
    AKRQ,

    /**
     * Acknowledgement response by the destination to the originator (used with a notification message exclusively).
     * 
     */
    AKRP,

    /**
     * End of a collection or batch by the originator (used with a request message exclusively).
     * 
     */
    ENDB,

    /**
     * Any other type of batch management transaction defined at national level.
     * 
     */
    OTHN,

    /**
     * Any other type of batch management transaction defined at private level.
     * 
     */
    OTHP,

    /**
     * Initiation of a collection or batch by the originator (used with a request message exclusively).
     * 
     */
    STRT;

    public String value() {
        return name();
    }

    public static BatchManagementType1Code fromValue(String v) {
        return valueOf(v);
    }

}
