
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonIdentificationType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PersonIdentificationType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PASS"/&gt;
 *     &lt;enumeration value="CPFA"/&gt;
 *     &lt;enumeration value="SRSA"/&gt;
 *     &lt;enumeration value="NRIN"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="DRLC"/&gt;
 *     &lt;enumeration value="SOCS"/&gt;
 *     &lt;enumeration value="AREG"/&gt;
 *     &lt;enumeration value="IDCD"/&gt;
 *     &lt;enumeration value="EMID"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PersonIdentificationType1Code")
@XmlEnum
public enum PersonIdentificationType1Code {


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
     * Another type of identification type.
     * 
     */
    OTHR,

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

    public static PersonIdentificationType1Code fromValue(String v) {
        return valueOf(v);
    }

}
