
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Response10Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Response10Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INPS"/&gt;
 *     &lt;enumeration value="UNRV"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="FAIL"/&gt;
 *     &lt;enumeration value="SUCC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Response10Code")
@XmlEnum
public enum Response10Code {


    /**
     * Request is still in progress.
     * 
     */
    INPS,

    /**
     * Service is under review.
     * 
     */
    UNRV,

    /**
     * Other type of processing result defined at private level.
     * 
     */
    OTHP,

    /**
     * Other type of processing result defined at national level.
     * 
     */
    OTHN,

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

    public static Response10Code fromValue(String v) {
        return valueOf(v);
    }

}
