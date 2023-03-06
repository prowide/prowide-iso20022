
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgreementFramework1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AgreementFramework1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FBAA"/&gt;
 *     &lt;enumeration value="BBAA"/&gt;
 *     &lt;enumeration value="DERV"/&gt;
 *     &lt;enumeration value="ISDA"/&gt;
 *     &lt;enumeration value="NONR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AgreementFramework1Code")
@XmlEnum
public enum AgreementFramework1Code {


    /**
     * French Banker's Association Agreement.
     * 
     */
    FBAA,

    /**
     * British Banker's Association Agreement.
     * 
     */
    BBAA,

    /**
     * German Rahmenvertrag Agreement.
     * 
     */
    DERV,

    /**
     * International Swaps and Derivatives Association Agreement.
     * 
     */
    ISDA,

    /**
     * No information about the master agreement is available.
     * 
     */
    NONR;

    public String value() {
        return name();
    }

    public static AgreementFramework1Code fromValue(String v) {
        return valueOf(v);
    }

}
