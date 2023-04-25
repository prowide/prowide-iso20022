
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListStatusType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ListStatusType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACKN"/>
 *     <enumeration value="RESP"/>
 *     <enumeration value="ADON"/>
 *     <enumeration value="ALER"/>
 *     <enumeration value="EXST"/>
 *     <enumeration value="TIME"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
