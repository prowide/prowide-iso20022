
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason52Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectionReason52Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="IDRI"/>
 *     <enumeration value="IDRJ"/>
 *     <enumeration value="SVNO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RejectionReason52Code")
@XmlEnum
public enum RejectionReason52Code {


    /**
     * Disclosure request identification is invalid or unknown.
     * 
     */
    IDRI,

    /**
     * Disclosure response identification is invalid or unknown.
     * 
     */
    IDRJ,

    /**
     * Service for which the information was sent is not offered.
     * 
     */
    SVNO;

    public String value() {
        return name();
    }

    public static RejectionReason52Code fromValue(String v) {
        return valueOf(v);
    }

}
