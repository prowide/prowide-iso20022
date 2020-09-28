
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IssuanceType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IssuanceType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;length value="4"/&gt;
 *     &lt;enumeration value="CRQL"/&gt;
 *     &lt;enumeration value="CRQC"/&gt;
 *     &lt;enumeration value="ISSU"/&gt;
 *     &lt;enumeration value="ISCO"/&gt;
 *     &lt;enumeration value="ISAD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IssuanceType1Code")
@XmlEnum
public enum IssuanceType1Code {


    /**
     * Counter-undertaking issued to a correspondent with a request to issue a local undertaking. 
     * 
     */
    CRQL,

    /**
     * Counter-undertaking issued to a correspondent with a request to issue another counter-undertaking.
     * 
     */
    CRQC,

    /**
     * Undertaking issued direct to the beneficiary. 
     * 
     */
    ISSU,

    /**
     * Undertaking issued to the beneficiary via a confirming party.
     * 
     */
    ISCO,

    /**
     * Undertaking issued to the beneficiary via an advising party.
     * 
     */
    ISAD;

    public String value() {
        return name();
    }

    public static IssuanceType1Code fromValue(String v) {
        return valueOf(v);
    }

}
