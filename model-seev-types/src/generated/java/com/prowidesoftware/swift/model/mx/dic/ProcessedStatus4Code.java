
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessedStatus4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProcessedStatus4Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RECE"/&gt;
 *     &lt;enumeration value="COMP"/&gt;
 *     &lt;enumeration value="PEND"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProcessedStatus4Code")
@XmlEnum
public enum ProcessedStatus4Code {


    /**
     * The instruction/request has been received.
     * 
     */
    RECE,

    /**
     * The request has been completed.
     * 
     */
    COMP,

    /**
     * The processing of the request is pending.
     * 
     */
    PEND;

    public String value() {
        return name();
    }

    public static ProcessedStatus4Code fromValue(String v) {
        return valueOf(v);
    }

}
