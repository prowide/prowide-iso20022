
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UndertakingStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UndertakingStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTC"/&gt;
 *     &lt;enumeration value="PEND"/&gt;
 *     &lt;enumeration value="RCVD"/&gt;
 *     &lt;enumeration value="REJT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UndertakingStatus1Code")
@XmlEnum
public enum UndertakingStatus1Code {


    /**
     * Accepted in accordance with technical validation.
     * 
     */
    ACTC,

    /**
     * Pending further processing.
     * 
     */
    PEND,

    /**
     * Received.
     * 
     */
    RCVD,

    /**
     * Rejected.
     * 
     */
    REJT;

    public String value() {
        return name();
    }

    public static UndertakingStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
