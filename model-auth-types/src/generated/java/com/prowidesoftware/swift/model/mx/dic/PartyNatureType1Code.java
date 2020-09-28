
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyNatureType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PartyNatureType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="NFIN"/&gt;
 *     &lt;enumeration value="FIIN"/&gt;
 *     &lt;enumeration value="CCPS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PartyNatureType1Code")
@XmlEnum
public enum PartyNatureType1Code {


    /**
     * Other type of issuer.
     * 
     */
    OTHR,

    /**
     * Issuer is a non-financial institution.
     * 
     */
    NFIN,

    /**
     * Issuer is a financial institution.
     * 
     */
    FIIN,

    /**
     * Issuer is a central counterparty.
     * 
     */
    CCPS;

    public String value() {
        return name();
    }

    public static PartyNatureType1Code fromValue(String v) {
        return valueOf(v);
    }

}
