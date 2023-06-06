
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageFunction8Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MessageFunction8Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BALN"/>
 *     <enumeration value="GSTS"/>
 *     <enumeration value="DSEC"/>
 *     <enumeration value="INQC"/>
 *     <enumeration value="KEYQ"/>
 *     <enumeration value="SSTS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
