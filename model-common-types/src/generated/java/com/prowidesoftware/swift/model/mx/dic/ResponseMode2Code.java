
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseMode2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResponseMode2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SEND"/&gt;
 *     &lt;enumeration value="IMMD"/&gt;
 *     &lt;enumeration value="NREQ"/&gt;
 *     &lt;enumeration value="PEND"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResponseMode2Code")
@XmlEnum
public enum ResponseMode2Code {


    /**
     * The Response is required at the end of play.
     * 
     */
    SEND,

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
    PEND;

    public String value() {
        return name();
    }

    public static ResponseMode2Code fromValue(String v) {
        return valueOf(v);
    }

}
