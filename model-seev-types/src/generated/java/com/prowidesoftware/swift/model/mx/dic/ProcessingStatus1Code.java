
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessingStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ProcessingStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="COMP"/>
 *     <enumeration value="PREC"/>
 *     <enumeration value="PREU"/>
 *     <enumeration value="INFO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ProcessingStatus1Code")
@XmlEnum
public enum ProcessingStatus1Code {


    /**
     * Message contains complete details of the corporate action event at the time the event is communicated and the occurrence of the event has been confirmed by the account servicer's chosen official source. Further updates to the event are still possible.
     * 
     */
    COMP,

    /**
     * Message may not contain complete details of the corporate action event,
     * however, the occurrence of the event is confirmed.
     * 
     */
    PREC,

    /**
     * Message may not contain complete details of the corporate action event and
     * the occurrence of the event is not yet confirmed.
     * 
     */
    PREU,

    /**
     * The message is for information only.
     * 
     */
    INFO;

    public String value() {
        return name();
    }

    public static ProcessingStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
