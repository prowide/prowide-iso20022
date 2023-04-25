
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseMode2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ResponseMode2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SEND"/>
 *     <enumeration value="IMMD"/>
 *     <enumeration value="NREQ"/>
 *     <enumeration value="PEND"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
