
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Response11Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Response11Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="WARN"/>
 *     <enumeration value="FAIL"/>
 *     <enumeration value="SUCC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Response11Code")
@XmlEnum
public enum Response11Code {


    /**
     * An additional Response Code, mainly a functional one, should be considered to identify the outcome of the request.
     * 
     */
    WARN,

    /**
     * Processing of the request fails for various reasons. Some further processing according to the type of requested service, the context of the process, and some additional precision about the failure notified in the ErrorCondition data element.
     * 
     */
    FAIL,

    /**
     * Processing OK. Information related to the result of the processing is contained in other parts of the response message.
     * 
     */
    SUCC;

    public String value() {
        return name();
    }

    public static Response11Code fromValue(String v) {
        return valueOf(v);
    }

}
