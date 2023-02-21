
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisclosureRequestCancellationReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DisclosureRequestCancellationReason1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PROC"/&gt;
 *     &lt;enumeration value="WITH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DisclosureRequestCancellationReason1Code")
@XmlEnum
public enum DisclosureRequestCancellationReason1Code {


    /**
     * The cancellation of the disclosure request is due to a processsing error.
     * 
     */
    PROC,

    /**
     * The cancellation of the discolure request is due to the withdrawal of the request  by the issuer.
     * 
     */
    WITH;

    public String value() {
        return name();
    }

    public static DisclosureRequestCancellationReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
