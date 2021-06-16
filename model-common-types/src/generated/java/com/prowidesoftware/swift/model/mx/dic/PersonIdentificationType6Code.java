
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonIdentificationType6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PersonIdentificationType6Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AREG"/&gt;
 *     &lt;enumeration value="CPFA"/&gt;
 *     &lt;enumeration value="DRLC"/&gt;
 *     &lt;enumeration value="EMID"/&gt;
 *     &lt;enumeration value="IDCD"/&gt;
 *     &lt;enumeration value="NRIN"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="PASS"/&gt;
 *     &lt;enumeration value="POCD"/&gt;
 *     &lt;enumeration value="SOCS"/&gt;
 *     &lt;enumeration value="SRSA"/&gt;
 *     &lt;enumeration value="GUNL"/&gt;
 *     &lt;enumeration value="ATIN"/&gt;
 *     &lt;enumeration value="GTIN"/&gt;
 *     &lt;enumeration value="ITIN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PersonIdentificationType6Code")
@XmlEnum
public enum PersonIdentificationType6Code {


    /**
     * Number assigned by a government agency to identify foreign nationals.
     * 
     */
    AREG,

    /**
     * Account issued by the Central Provident Fund Board (Singapore).
     * 
     */
    CPFA,

    /**
     * Number assigned by a license authority to a driver's license.
     * 
     */
    DRLC,

    /**
     * Number assigned to an employer by a registration authority.
     * 
     */
    EMID,

    /**
     * Number assigned by a national authority to an identity card.
     * 
     */
    IDCD,

    /**
     * National registration identification number. In Singapore this is known as the NRIC.
     * 
     */
    NRIN,

    /**
     * Another type of identification type.
     * 
     */
    OTHR,

    /**
     * Number assigned by a passport authority to a passport.
     * 
     */
    PASS,

    /**
     * Post office card number as assigned by a national post office.
     * 
     */
    POCD,

    /**
     * Number assigned by a social security agency.
     * 
     */
    SOCS,

    /**
     * Supplementary retirement scheme account number.
     * 
     */
    SRSA,

    /**
     * Gun license number as assigned by a gun licensing authority.
     * 
     */
    GUNL,

    /**
     * Temporary tax processing number (used
     * in the domestic adoption of a child).
     * 
     */
    ATIN,

    /**
     * Generic tax identification number.
     * 
     */
    GTIN,

    /**
     * Tax processing number.
     * 
     */
    ITIN;

    public String value() {
        return name();
    }

    public static PersonIdentificationType6Code fromValue(String v) {
        return valueOf(v);
    }

}
