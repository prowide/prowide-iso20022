
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LegalFramework2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LegalFramework2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UCIT"/&gt;
 *     &lt;enumeration value="AIFD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LegalFramework2Code")
@XmlEnum
public enum LegalFramework2Code {


    /**
     * Relates to the European legal framework for undertakings for collective investment in transferable securities.
     * 
     */
    UCIT,

    /**
     * Relates to the European legal framework for alternative investment fund.
     * 
     */
    AIFD;

    public String value() {
        return name();
    }

    public static LegalFramework2Code fromValue(String v) {
        return valueOf(v);
    }

}
