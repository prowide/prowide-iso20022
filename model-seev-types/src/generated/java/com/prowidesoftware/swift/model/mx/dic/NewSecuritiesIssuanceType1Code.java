
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NewSecuritiesIssuanceType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="NewSecuritiesIssuanceType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EXIS"/>
 *     <enumeration value="NEIS"/>
 *     <enumeration value="UKWN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
