
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClearingMethod2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClearingMethod2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DAYC"/&gt;
 *     &lt;enumeration value="DFRD"/&gt;
 *     &lt;enumeration value="INST"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="RLTM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ClearingMethod2Code")
@XmlEnum
public enum ClearingMethod2Code {


    /**
     * Day clearing.
     * 
     */
    DAYC,

    /**
     * Clearing to be deferred in time.
     * 
     */
    DFRD,

    /**
     * Clearing for instant payments and transfers.
     * 
     */
    INST,

    /**
     * Other type of clearing method defined at national level.
     * 
     */
    OTHN,

    /**
     * Other type of clearing method defined at private level.
     * 
     */
    OTHP,

    /**
     * Clearing done in real time.
     * 
     */
    RLTM;

    public String value() {
        return name();
    }

    public static ClearingMethod2Code fromValue(String v) {
        return valueOf(v);
    }

}
