
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UndertakingIssuanceName1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UndertakingIssuanceName1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="STBY"/&gt;
 *     &lt;enumeration value="DGAR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UndertakingIssuanceName1Code")
@XmlEnum
public enum UndertakingIssuanceName1Code {


    /**
     * Standby letter of credit.
     * 
     */
    STBY,

    /**
     * Demand guarantee.
     * 
     */
    DGAR;

    public String value() {
        return name();
    }

    public static UndertakingIssuanceName1Code fromValue(String v) {
        return valueOf(v);
    }

}
