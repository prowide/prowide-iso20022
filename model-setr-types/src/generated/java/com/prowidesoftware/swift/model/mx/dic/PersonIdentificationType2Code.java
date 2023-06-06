
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonIdentificationType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PersonIdentificationType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PASS"/>
 *     <enumeration value="CPFA"/>
 *     <enumeration value="SRSA"/>
 *     <enumeration value="NRIN"/>
 *     <enumeration value="DRLC"/>
 *     <enumeration value="SOCS"/>
 *     <enumeration value="AREG"/>
 *     <enumeration value="IDCD"/>
 *     <enumeration value="EMID"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PersonIdentificationType2Code")
@XmlEnum
public enum PersonIdentificationType2Code {


    /**
     * Number assigned by a passport authority to a passport.
     * 
     */
    PASS,

    /**
     * Account issued by the Central Provident Fund Board (Singapore).
     * 
     */
    CPFA,

    /**
     * Supplementary retirement scheme account number.
     * 
     */
    SRSA,

    /**
     * National registration identification number. In Singapore this is known as the NRIC.
     * 
     */
    NRIN,

    /**
     * Number assigned by a license authority to a driver's license.
     * 
     */
    DRLC,

    /**
     * Number assigned by a social security agency.
     * 
     */
    SOCS,

    /**
     * Number assigned by a government agency to identify foreign nationals.
     * 
     */
    AREG,

    /**
     * Number assigned by a national authority to an identity card.
     * 
     */
    IDCD,

    /**
     * Number assigned to an employer by a registration authority.
     * 
     */
    EMID;

    public String value() {
        return name();
    }

    public static PersonIdentificationType2Code fromValue(String v) {
        return valueOf(v);
    }

}
