
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NewSecuritiesIssuanceType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NewSecuritiesIssuanceType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EXIS"/&gt;
 *     &lt;enumeration value="NEIS"/&gt;
 *     &lt;enumeration value="UKWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NewSecuritiesIssuanceType1Code")
@XmlEnum
public enum NewSecuritiesIssuanceType1Code {


    /**
     * Securities proceeds are not new issues.
     * 
     */
    EXIS,

    /**
     * Securities proceeds are newly issued.
     * 
     */
    NEIS,

    /**
     * Not known whether the securities proceeds are newly issued or not.
     * 
     */
    UKWN;

    public String value() {
        return name();
    }

    public static NewSecuritiesIssuanceType1Code fromValue(String v) {
        return valueOf(v);
    }

}
