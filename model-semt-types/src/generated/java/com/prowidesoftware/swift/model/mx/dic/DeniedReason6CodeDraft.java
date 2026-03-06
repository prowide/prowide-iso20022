
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeniedReason6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DeniedReason6Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DCAN"/>
 *     <enumeration value="DSET"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DeniedReason6Code")
@XmlEnum
public enum DeniedReason6CodeDraft {


    /**
     * Request was denied since the instruction has been cancelled.
     * 
     */
    DCAN,

    /**
     * Request was denied because the instruction was settled.
     * 
     */
    DSET,

    /**
     * Other. See Narrative.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static DeniedReason6CodeDraft fromValue(String v) {
        return valueOf(v);
    }

}
