
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemStatus2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SystemStatus2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SUSP"/&gt;
 *     &lt;enumeration value="ACTV"/&gt;
 *     &lt;enumeration value="CLSD"/&gt;
 *     &lt;enumeration value="CLSG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SystemStatus2Code")
@XmlEnum
public enum SystemStatus2Code {


    /**
     * System is suspended, that is, not operational.
     * 
     */
    SUSP,

    /**
     * System is functioning normally, that is, operational.
     * 
     */
    ACTV,

    /**
     * System is closed (eg. normal closure of an RTGS).
     * 
     */
    CLSD,

    /**
     * System needs to wait for completion of intermediate internal activities before going to a status Closed.
     * 
     */
    CLSG;

    public String value() {
        return name();
    }

    public static SystemStatus2Code fromValue(String v) {
        return valueOf(v);
    }

}
