
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectReason2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectReason2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="UNPR"/>
 *     <enumeration value="IMSG"/>
 *     <enumeration value="PARS"/>
 *     <enumeration value="SECU"/>
 *     <enumeration value="INTP"/>
 *     <enumeration value="RCPP"/>
 *     <enumeration value="VERS"/>
 *     <enumeration value="MSGT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RejectReason2Code")
@XmlEnum
public enum RejectReason2Code {


    /**
     * Not possible to process the message, for instance the security module is unavailable, the hardware is unavailable, or there is a problem of resource.
     * 
     */
    UNPR,

    /**
     * Invalid envelope of the message.
     * 
     */
    IMSG,

    /**
     * Invalid message: At least one of the data element or data structure is not present, the format, or the content of one data element or one data structure is not correct.
     * 
     */
    PARS,

    /**
     * Security error (for example an invalid key or an incorrect MAC value).
     * 
     */
    SECU,

    /**
     * Invalid identification data for the sender.
     * 
     */
    INTP,

    /**
     * Invalid identification data for the the receiver.
     * 
     */
    RCPP,

    /**
     * Version of the protocol couldn't be supported by the recipient.
     * 
     */
    VERS,

    /**
     * Type of message the recipient receives is unknow or unsupported.
     * 
     */
    MSGT;

    public String value() {
        return name();
    }

    public static RejectReason2Code fromValue(String v) {
        return valueOf(v);
    }

}
