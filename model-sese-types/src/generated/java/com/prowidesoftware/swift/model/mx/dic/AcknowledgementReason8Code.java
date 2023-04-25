
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcknowledgementReason8Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AcknowledgementReason8Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NARR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AcknowledgementReason8Code")
@XmlEnum
public enum AcknowledgementReason8Code {


    /**
     * See narrative field for reason.
     * 
     */
    NARR;

    public String value() {
        return name();
    }

    public static AcknowledgementReason8Code fromValue(String v) {
        return valueOf(v);
    }

}
