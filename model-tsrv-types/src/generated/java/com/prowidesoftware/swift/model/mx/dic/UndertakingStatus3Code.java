
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UndertakingStatus3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UndertakingStatus3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACCP"/&gt;
 *     &lt;enumeration value="NCON"/&gt;
 *     &lt;enumeration value="REJT"/&gt;
 *     &lt;enumeration value="WTHD"/&gt;
 *     &lt;enumeration value="AMTC"/&gt;
 *     &lt;enumeration value="AMTU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UndertakingStatus3Code")
@XmlEnum
public enum UndertakingStatus3Code {


    /**
     * Accepted.
     * 
     */
    ACCP,

    /**
     * Undertaking not confirmed.
     * 
     */
    NCON,

    /**
     * Rejected.
     * 
     */
    REJT,

    /**
     * Demand has been withdrawn.
     * 
     */
    WTHD,

    /**
     * Change to counter-undertaking amount.
     * 
     */
    AMTC,

    /**
     * Change to undertaking amount.
     * 
     */
    AMTU;

    public String value() {
        return name();
    }

    public static UndertakingStatus3Code fromValue(String v) {
        return valueOf(v);
    }

}
