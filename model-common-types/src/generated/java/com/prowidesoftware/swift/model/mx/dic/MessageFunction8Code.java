
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageFunction8Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageFunction8Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BALN"/&gt;
 *     &lt;enumeration value="GSTS"/&gt;
 *     &lt;enumeration value="DSEC"/&gt;
 *     &lt;enumeration value="INQC"/&gt;
 *     &lt;enumeration value="KEYQ"/&gt;
 *     &lt;enumeration value="SSTS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MessageFunction8Code")
@XmlEnum
public enum MessageFunction8Code {


    /**
     * Provide the ATM counters resettting those that are applicable.
     * 
     */
    BALN,

    /**
     * Global status of the ATM.
     * 
     */
    GSTS,

    /**
     * Security detailed report.
     * 
     */
    DSEC,

    /**
     * Request the value of the ATM counters.
     * 
     */
    INQC,

    /**
     * Request of a key exchange.
     * 
     */
    KEYQ,

    /**
     * Status of cryptographic keys.
     * 
     */
    SSTS;

    public String value() {
        return name();
    }

    public static MessageFunction8Code fromValue(String v) {
        return valueOf(v);
    }

}
