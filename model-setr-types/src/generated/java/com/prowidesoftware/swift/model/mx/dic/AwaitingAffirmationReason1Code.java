
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AwaitingAffirmationReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AwaitingAffirmationReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="WAFF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AwaitingAffirmationReason1Code")
@XmlEnum
public enum AwaitingAffirmationReason1Code {


    /**
     * Affirmation has not been received yet.
     * 
     */
    WAFF;

    public String value() {
        return name();
    }

    public static AwaitingAffirmationReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
