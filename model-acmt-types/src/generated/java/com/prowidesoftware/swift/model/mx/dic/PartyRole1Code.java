
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyRole1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PartyRole1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CUST"/&gt;
 *     &lt;enumeration value="INVS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PartyRole1Code")
@XmlEnum
public enum PartyRole1Code {


    /**
     * Party that safekeeps and administers assets on behalf of the owner.
     * 
     */
    CUST,

    /**
     * Party, either an individual or organisation, whose assets are being invested.
     * 
     */
    INVS;

    public String value() {
        return name();
    }

    public static PartyRole1Code fromValue(String v) {
        return valueOf(v);
    }

}
