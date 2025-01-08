
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfIdentification4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TypeOfIdentification4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ARNU"/>
 *     <enumeration value="CUST"/>
 *     <enumeration value="CORP"/>
 *     <enumeration value="DRLC"/>
 *     <enumeration value="IDCD"/>
 *     <enumeration value="NRIN"/>
 *     <enumeration value="CCPT"/>
 *     <enumeration value="SOCS"/>
 *     <enumeration value="TXID"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TypeOfIdentification4Code")
@XmlEnum
public enum TypeOfIdentification4Code {


    /**
     * Number assigned by a government agency to identify foreign nationals.
     * 
     */
    ARNU,

    /**
     * Number assigned by an issuer to identify a customer via the concatenation of the birthdate and characters of the first name and surname. 
     * 
     */
    CUST,

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
     * Number assigned by a passport authority.
     * 
     */
    CCPT,

    /**
     * Number assigned by a social security agency.
     * 
     */
    SOCS,

    /**
     * Number assigned by a tax authority to an entity.
     * 
     */
    TXID;

    public String value() {
        return name();
    }

    public static TypeOfIdentification4Code fromValue(String v) {
        return valueOf(v);
    }

}
