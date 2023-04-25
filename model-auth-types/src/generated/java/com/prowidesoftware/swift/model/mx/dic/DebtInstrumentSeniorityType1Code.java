
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DebtInstrumentSeniorityType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DebtInstrumentSeniorityType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SBOD"/>
 *     <enumeration value="SNDB"/>
 *     <enumeration value="MZZD"/>
 *     <enumeration value="JUND"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DebtInstrumentSeniorityType1Code")
@XmlEnum
public enum DebtInstrumentSeniorityType1Code {


    /**
     * Debt owed to an unsecured creditor that can only be paid, in the event of a liquidation, after the claims of secured creditors have been met.
     * 
     */
    SBOD,

    /**
     * Debt that takes priority over other unsecured or otherwise more junior debt owed by the issuer.
     * 
     */
    SNDB,

    /**
     * Subordinated debt or preferred equity instrument that represents a claim on a company's assets which is senior only to that of the common shares.
     * 
     */
    MZZD,

    /**
     * Debt that is either unsecured or has a lower priority than of another debt claim on the same asset or property.
     * 
     */
    JUND;

    public String value() {
        return name();
    }

    public static DebtInstrumentSeniorityType1Code fromValue(String v) {
        return valueOf(v);
    }

}
