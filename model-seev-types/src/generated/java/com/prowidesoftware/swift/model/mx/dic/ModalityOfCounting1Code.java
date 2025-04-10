
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModalityOfCounting1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ModalityOfCounting1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EVAM"/>
 *     <enumeration value="EVBM"/>
 *     <enumeration value="PVBM"/>
 *     <enumeration value="PVAM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ModalityOfCounting1Code")
@XmlEnum
public enum ModalityOfCounting1Code {


    /**
     * Electronic vote recorded and counted at the meeting.
     * 
     */
    EVAM,

    /**
     * Electronic vote recorded and counted ahead of the meeting.
     * 
     */
    EVBM,

    /**
     * Paper vote recorded and counted ahead of the meeting.
     * 
     */
    PVBM,

    /**
     * Physical attendance with vote at the meeting.
     * 
     */
    PVAM;

    public String value() {
        return name();
    }

    public static ModalityOfCounting1Code fromValue(String v) {
        return valueOf(v);
    }

}
