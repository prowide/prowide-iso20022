
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessedStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ProcessedStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RECE"/>
 *     <enumeration value="SENT"/>
 *     <enumeration value="WARN"/>
 *     <enumeration value="PACK"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ProcessedStatus1Code")
@XmlEnum
public enum ProcessedStatus1Code {


    /**
     * The instruction/request has been received.
     * 
     */
    RECE,

    /**
     * The advice has been sent to the market.
     * 
     */
    SENT,

    /**
     * The announcement has been accepted but another source has provided different information.
     * 
     */
    WARN,

    /**
     * The request is accepted.
     * 
     */
    PACK;

    public String value() {
        return name();
    }

    public static ProcessedStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
