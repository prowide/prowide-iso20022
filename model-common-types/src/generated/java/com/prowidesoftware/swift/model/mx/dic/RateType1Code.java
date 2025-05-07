
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RateType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FIXE"/&gt;
 *     &lt;enumeration value="FORF"/&gt;
 *     &lt;enumeration value="VARI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RateType1Code")
@XmlEnum
public enum RateType1Code {


    /**
     * Rate is fixed.
     * 
     */
    FIXE,

    /**
     * No specific repurchase rate applies to the transaction Repo, only a forfeit.
     * 
     */
    FORF,

    /**
     * Rate is variable.
     * 
     */
    VARI;

    public String value() {
        return name();
    }

    public static RateType1Code fromValue(String v) {
        return valueOf(v);
    }

}
