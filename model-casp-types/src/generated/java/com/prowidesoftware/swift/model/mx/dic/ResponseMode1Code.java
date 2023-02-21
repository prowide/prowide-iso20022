
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseMode1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResponseMode1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="IMMD"/&gt;
 *     &lt;enumeration value="NREQ"/&gt;
 *     &lt;enumeration value="PEND"/&gt;
 *     &lt;enumeration value="SEND"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResponseMode1Code")
@XmlEnum
public enum ResponseMode1Code {


    /**
     * The Message Response is immediate, after taking into account the request.
     * 
     */
    IMMD,

    /**
     * The Message Response is not required, except in case of error.
     * 
     */
    NREQ,

    /**
     * The Print Response is required at the end of print.
     * 
     */
    PEND,

    /**
     * The Sound Response is required at the end of play.
     * 
     */
    SEND;

    public String value() {
        return name();
    }

    public static ResponseMode1Code fromValue(String v) {
        return valueOf(v);
    }

}
