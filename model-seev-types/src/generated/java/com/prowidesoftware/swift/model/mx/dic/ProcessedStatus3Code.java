
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessedStatus3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProcessedStatus3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RECE"/&gt;
 *     &lt;enumeration value="PEND"/&gt;
 *     &lt;enumeration value="PACK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProcessedStatus3Code")
@XmlEnum
public enum ProcessedStatus3Code {


    /**
     * The instruction/request has been received.
     * 
     */
    RECE,

    /**
     * The processing of the request is pending.
     * 
     */
    PEND,

    /**
     * The request is accepted.
     * 
     */
    PACK;

    public String value() {
        return name();
    }

    public static ProcessedStatus3Code fromValue(String v) {
        return valueOf(v);
    }

}
