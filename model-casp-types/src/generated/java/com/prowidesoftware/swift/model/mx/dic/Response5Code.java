
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Response5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Response5Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SUCC"/>
 *     <enumeration value="FAIL"/>
 *     <enumeration value="PART"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Response5Code")
@XmlEnum
public enum Response5Code {


    /**
     * Processing OK. Information related to the result of the processing is contained in other parts of the response message.
     * 
     */
    SUCC,

    /**
     * Processing of the request fails for various reasons. Some further processing according to the type of requested service, the context of the process, and some additional precision about the failure notified in the ErrorCondition data element.
     * 
     */
    FAIL,

    /**
     * Service has been partialy provided.
     * 
     */
    PART;

    public String value() {
        return name();
    }

    public static Response5Code fromValue(String v) {
        return valueOf(v);
    }

}
