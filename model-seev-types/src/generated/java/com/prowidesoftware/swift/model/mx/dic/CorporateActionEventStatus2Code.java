
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionEventStatus2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CorporateActionEventStatus2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACTI"/>
 *     <enumeration value="CANC"/>
 *     <enumeration value="INAC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CorporateActionEventStatus2Code")
@XmlEnum
public enum CorporateActionEventStatus2Code {


    /**
     * The CA event is active.
     * 
     */
    ACTI,

    /**
     * The CA event is cancelled.
     * 
     */
    CANC,

    /**
     * Option is not active and can no longer be responded to. Any responses already processed against this option will remain valid, eg, expired option.
     * 
     */
    INAC;

    public String value() {
        return name();
    }

    public static CorporateActionEventStatus2Code fromValue(String v) {
        return valueOf(v);
    }

}
