
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RepurchaseType5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RepurchaseType5Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CALL"/&gt;
 *     &lt;enumeration value="RATE"/&gt;
 *     &lt;enumeration value="ROLP"/&gt;
 *     &lt;enumeration value="PADJ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RepurchaseType5Code")
@XmlEnum
public enum RepurchaseType5Code {


    /**
     * Relates to a change in the closing or maturity date.
     * 
     */
    CALL,

    /**
     * Is part of a pair-off.
     * 
     */
    RATE,

    /**
     * Relates to a repo rollover of a position extending the closing or maturity date.
     * 
     */
    ROLP,

    /**
     * Relates to a principal adjustment.
     * 
     */
    PADJ;

    public String value() {
        return name();
    }

    public static RepurchaseType5Code fromValue(String v) {
        return valueOf(v);
    }

}
