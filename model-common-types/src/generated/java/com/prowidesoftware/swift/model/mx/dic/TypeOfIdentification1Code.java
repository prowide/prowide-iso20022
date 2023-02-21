
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfIdentification1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeOfIdentification1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ARNU"/&gt;
 *     &lt;enumeration value="CCPT"/&gt;
 *     &lt;enumeration value="CHTY"/&gt;
 *     &lt;enumeration value="CORP"/&gt;
 *     &lt;enumeration value="DRLC"/&gt;
 *     &lt;enumeration value="FIIN"/&gt;
 *     &lt;enumeration value="TXID"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TypeOfIdentification1Code")
@XmlEnum
public enum TypeOfIdentification1Code {


    /**
     * Number assigned by a government agency to identify foreign nationals.
     * 
     */
    ARNU,

    /**
     * Number assigned by a passport authority.
     * 
     */
    CCPT,

    /**
     * Number assigned to a tax exempt entity.
     * 
     */
    CHTY,

    /**
     * Number assigned to a corporate entity.
     * 
     */
    CORP,

    /**
     * Number assigned to a driver's license.
     * 
     */
    DRLC,

    /**
     * Number assigned to a foreign investor (other than the alien number).
     * 
     */
    FIIN,

    /**
     * Number assigned by a tax authority to an entity.
     * 
     */
    TXID;

    public String value() {
        return name();
    }

    public static TypeOfIdentification1Code fromValue(String v) {
        return valueOf(v);
    }

}
