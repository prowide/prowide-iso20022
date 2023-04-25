
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralSubstitutionConfirmation1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CollateralSubstitutionConfirmation1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CREL"/>
 *     <enumeration value="CRET"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CollateralSubstitutionConfirmation1Code")
@XmlEnum
public enum CollateralSubstitutionConfirmation1Code {


    /**
     * Notification that the collateral substitution, that is new piece(s) of collateral, have been released.
     * 
     */
    CREL,

    /**
     * Confirmation that the collateral substitution, that is new piece(s) of collateral, have been received.
     * 
     */
    CRET;

    public String value() {
        return name();
    }

    public static CollateralSubstitutionConfirmation1Code fromValue(String v) {
        return valueOf(v);
    }

}
