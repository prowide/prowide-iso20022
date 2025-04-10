
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MovementResponseType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MovementResponseType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FULL"/&gt;
 *     &lt;enumeration value="STTS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MovementResponseType1Code")
@XmlEnum
public enum MovementResponseType1Code {


    /**
     * Response will include full details on the movements reported.
     * 
     */
    FULL,

    /**
     * Response will include limited details including the status on the movements reported.
     * 
     */
    STTS;

    public String value() {
        return name();
    }

    public static MovementResponseType1Code fromValue(String v) {
        return valueOf(v);
    }

}
