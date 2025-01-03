
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatchManagementType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BatchManagementType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AKRQ"/>
 *     <enumeration value="AKRP"/>
 *     <enumeration value="ENDB"/>
 *     <enumeration value="IDNT"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="RERQ"/>
 *     <enumeration value="STRT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BatchManagementType2Code")
@XmlEnum
public enum BatchManagementType2Code {


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
     * Contains a list of batch or collection identifications.
     * 
     */
    IDNT,

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
     * A request to resend a batch or collection.
     * 
     */
    RERQ,

    /**
     * Initiation of a collection or batch by the originator (used with a request message exclusively).
     * 
     */
    STRT;

    public String value() {
        return name();
    }

    public static BatchManagementType2Code fromValue(String v) {
        return valueOf(v);
    }

}
