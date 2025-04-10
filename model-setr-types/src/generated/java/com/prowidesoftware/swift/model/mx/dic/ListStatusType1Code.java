
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListStatusType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ListStatusType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACKN"/&gt;
 *     &lt;enumeration value="RESP"/&gt;
 *     &lt;enumeration value="ADON"/&gt;
 *     &lt;enumeration value="ALER"/&gt;
 *     &lt;enumeration value="EXST"/&gt;
 *     &lt;enumeration value="TIME"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ListStatusType1Code")
@XmlEnum
public enum ListStatusType1Code {


    /**
     * Status is an acknowledgement of the ListOrder.
     * 
     */
    ACKN,

    /**
     * Status is a response to a previously sent StatusRequest.
     * 
     */
    RESP,

    /**
     * Status indicates that the ListOrder has been executed.
     * 
     */
    ADON,

    /**
     * Status indicates that any of the individual orders of the ListOrder have a status that requires something to be done.
     * 
     */
    ALER,

    /**
     * Status indicates that the Execution has started.
     * 
     */
    EXST,

    /**
     * Status indicated that time limit for the order has expired.
     * 
     */
    TIME;

    public String value() {
        return name();
    }

    public static ListStatusType1Code fromValue(String v) {
        return valueOf(v);
    }

}
