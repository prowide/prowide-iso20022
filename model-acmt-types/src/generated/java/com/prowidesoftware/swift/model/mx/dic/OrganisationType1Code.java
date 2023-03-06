
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganisationType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrganisationType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="IFUN"/&gt;
 *     &lt;enumeration value="PRIV"/&gt;
 *     &lt;enumeration value="PUBL"/&gt;
 *     &lt;enumeration value="PFUN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrganisationType1Code")
@XmlEnum
public enum OrganisationType1Code {


    /**
     * Organisation is an investment fund.
     * 
     */
    IFUN,

    /**
     * Organisation is a private association.
     * 
     */
    PRIV,

    /**
     * Organisation is a public company.
     * 
     */
    PUBL,

    /**
     * Organisation is a public fund.
     * 
     */
    PFUN;

    public String value() {
        return name();
    }

    public static OrganisationType1Code fromValue(String v) {
        return valueOf(v);
    }

}
