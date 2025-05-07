
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GovernanceProcessType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GovernanceProcessType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BMIF"/&gt;
 *     &lt;enumeration value="NINF"/&gt;
 *     &lt;enumeration value="CMIF"/&gt;
 *     &lt;enumeration value="AMIF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GovernanceProcessType1Code")
@XmlEnum
public enum GovernanceProcessType1Code {


    /**
     * Product governance procedure is comparable to MiFID II.
     * 
     */
    BMIF,

    /**
     * No information is requested from the issuer.
     * 
     */
    NINF,

    /**
     * Product governance procedure is not in accordance with MiFID II.
     * 
     */
    CMIF,

    /**
     * Product governance procedure is pursuant to MiFID II.
     * 
     */
    AMIF;

    public String value() {
        return name();
    }

    public static GovernanceProcessType1Code fromValue(String v) {
        return valueOf(v);
    }

}
