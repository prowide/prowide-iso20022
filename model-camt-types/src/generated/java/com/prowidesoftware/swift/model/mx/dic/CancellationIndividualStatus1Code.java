
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancellationIndividualStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CancellationIndividualStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RJCR"/&gt;
 *     &lt;enumeration value="ACCR"/&gt;
 *     &lt;enumeration value="PDCR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CancellationIndividualStatus1Code")
@XmlEnum
public enum CancellationIndividualStatus1Code {


    /**
     * Cancellation request is rejected
     * 
     */
    RJCR,

    /**
     * Cancellation is accepted.
     * 
     */
    ACCR,

    /**
     * Cancellation request is pending.
     * 
     */
    PDCR;

    public String value() {
        return name();
    }

    public static CancellationIndividualStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
