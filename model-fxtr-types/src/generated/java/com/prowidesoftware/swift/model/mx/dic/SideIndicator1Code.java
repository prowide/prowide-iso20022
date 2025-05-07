
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SideIndicator1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SideIndicator1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CCPL"/&gt;
 *     &lt;enumeration value="CLNT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SideIndicator1Code")
@XmlEnum
public enum SideIndicator1Code {


    /**
     * Clearing broker identification is for the Central Counterparty (CCP) leg.
     * 
     */
    CCPL,

    /**
     * Clearing broker identification is for the client leg.
     * 
     */
    CLNT;

    public String value() {
        return name();
    }

    public static SideIndicator1Code fromValue(String v) {
        return valueOf(v);
    }

}
