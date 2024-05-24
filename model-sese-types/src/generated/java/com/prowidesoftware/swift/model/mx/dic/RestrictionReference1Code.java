
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RestrictionReference1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RestrictionReference1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <minLength value="1"/>
 *     <maxLength value="4"/>
 *     <enumeration value="ADDC"/>
 *     <enumeration value="ADDS"/>
 *     <enumeration value="REMC"/>
 *     <enumeration value="REMS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RestrictionReference1Code")
@XmlEnum
public enum RestrictionReference1Code {


    /**
     * Addition of a cash restriction reference representing a cash sub-balance to be utilised within the settlement instruction for the debiting or crediting of cash.
     * 
     */
    ADDC,

    /**
     * Addition of a securities restriction reference representing a securities sub-position to be utilised within the settlement instruction for the delivery or receipt of securities.
     * 
     */
    ADDS,

    /**
     * Removal of a cash restriction reference, already present within the settlement instruction, representing a cash sub-balance to be utilised within the settlement instruction for the debiting or crediting of cash.
     * 
     */
    REMC,

    /**
     * Removal of a securities restriction reference, already present within the settlement instruction, representing a securities sub-position to be utilised within the settlement instruction for the delivery or receipt of securities. 
     * 
     */
    REMS;

    public String value() {
        return name();
    }

    public static RestrictionReference1Code fromValue(String v) {
        return valueOf(v);
    }

}
