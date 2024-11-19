
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancellationStatus4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CancellationStatus4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PACK"/>
 *     <enumeration value="REJT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CancellationStatus4Code")
@XmlEnum
public enum CancellationStatus4Code {


    /**
     * Cancellation instruction / request has been received and has been acknowledged / accepted for further processing.
     * 
     */
    PACK,

    /**
     * Cancellation instruction / request has been rejected / denied for further processing.
     * 
     */
    REJT;

    public String value() {
        return name();
    }

    public static CancellationStatus4Code fromValue(String v) {
        return valueOf(v);
    }

}
