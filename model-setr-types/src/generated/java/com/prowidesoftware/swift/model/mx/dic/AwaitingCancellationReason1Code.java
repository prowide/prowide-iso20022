
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AwaitingCancellationReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AwaitingCancellationReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="WCAN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AwaitingCancellationReason1Code")
@XmlEnum
public enum AwaitingCancellationReason1Code {


    /**
     * Cancellation has not been received yet.
     * 
     */
    WCAN;

    public String value() {
        return name();
    }

    public static AwaitingCancellationReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
