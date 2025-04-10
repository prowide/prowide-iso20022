
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonIdentificationType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PersonIdentificationType3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ARNU"/&gt;
 *     &lt;enumeration value="CCPT"/&gt;
 *     &lt;enumeration value="EMID"/&gt;
 *     &lt;enumeration value="DRLC"/&gt;
 *     &lt;enumeration value="FINN"/&gt;
 *     &lt;enumeration value="TXID"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PersonIdentificationType3Code")
@XmlEnum
public enum PersonIdentificationType3Code {


    /**
     * Number assigned by a government agency to identify foreign nationals.
     * 
     */
    ARNU,

    /**
     * Number assigned by a passport authority to a passport.
     * 
     */
    CCPT,

    /**
     * Number assigned to an employer by a registration authority.
     * 
     */
    EMID,

    /**
     * Number assigned by a license authority to a driver's license.
     * 
     */
    DRLC,

    /**
     * Number assigned to a foreign investor (other than the alien number).
     * 
     */
    FINN,

    /**
     * Number assigned by a tax authority to an entity.
     * 
     */
    TXID;

    public String value() {
        return name();
    }

    public static PersonIdentificationType3Code fromValue(String v) {
        return valueOf(v);
    }

}
