
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralSubstitutionSequence1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CollateralSubstitutionSequence1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INIT"/&gt;
 *     &lt;enumeration value="UPDD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CollateralSubstitutionSequence1Code")
@XmlEnum
public enum CollateralSubstitutionSequence1Code {


    /**
     * Indicates this is a new collateral substitution request.
     * 
     */
    INIT,

    /**
     * Indicates this is an updated collateral substitution request.
     * 
     */
    UPDD;

    public String value() {
        return name();
    }

    public static CollateralSubstitutionSequence1Code fromValue(String v) {
        return valueOf(v);
    }

}
