
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemSecuritiesAccountType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SystemSecuritiesAccountType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CSDP"/&gt;
 *     &lt;enumeration value="CSDM"/&gt;
 *     &lt;enumeration value="ICSA"/&gt;
 *     &lt;enumeration value="TOFF"/&gt;
 *     &lt;enumeration value="CSDO"/&gt;
 *     &lt;enumeration value="ISSA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SystemSecuritiesAccountType1Code")
@XmlEnum
public enum SystemSecuritiesAccountType1Code {


    /**
     * Account owned by a CSD Participant
     * .
     * 
     */
    CSDP,

    /**
     * Account operated by CSD for mirroring positions
     * .
     * 
     */
    CSDM,

    /**
     * Account operated by CSD for settlement of securities legs for instructions involving internal CSD s.
     * 
     */
    ICSA,

    /**
     * Account operated by CSDs in a direct holding market context.
     * 
     */
    TOFF,

    /**
     * Account operated by CSD in cross-CSD settlement context.
     * 
     */
    CSDO,

    /**
     * Account reflecting the holdings of the participants of the issuer CSD for a given financial instrument.
     * 
     */
    ISSA;

    public String value() {
        return name();
    }

    public static SystemSecuritiesAccountType1Code fromValue(String v) {
        return valueOf(v);
    }

}
