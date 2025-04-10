
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RejectReason1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNPR"/&gt;
 *     &lt;enumeration value="IMSG"/&gt;
 *     &lt;enumeration value="PARS"/&gt;
 *     &lt;enumeration value="SECU"/&gt;
 *     &lt;enumeration value="INTP"/&gt;
 *     &lt;enumeration value="RCPP"/&gt;
 *     &lt;enumeration value="DPMG"/&gt;
 *     &lt;enumeration value="VERS"/&gt;
 *     &lt;enumeration value="MSGT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RejectReason1Code")
@XmlEnum
public enum RejectReason1Code {


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
     * Duplicate message, the identification of the exchange is the same than a previous message.
     * 
     */
    DPMG,

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

    public static RejectReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
