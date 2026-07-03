
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Response5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Response5Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SUCC"/&gt;
 *     &lt;enumeration value="FAIL"/&gt;
 *     &lt;enumeration value="PART"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
