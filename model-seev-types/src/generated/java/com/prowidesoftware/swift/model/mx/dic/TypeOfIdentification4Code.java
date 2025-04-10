
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfIdentification4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeOfIdentification4Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ARNU"/&gt;
 *     &lt;enumeration value="CUST"/&gt;
 *     &lt;enumeration value="CORP"/&gt;
 *     &lt;enumeration value="DRLC"/&gt;
 *     &lt;enumeration value="IDCD"/&gt;
 *     &lt;enumeration value="NRIN"/&gt;
 *     &lt;enumeration value="CCPT"/&gt;
 *     &lt;enumeration value="SOCS"/&gt;
 *     &lt;enumeration value="TXID"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
