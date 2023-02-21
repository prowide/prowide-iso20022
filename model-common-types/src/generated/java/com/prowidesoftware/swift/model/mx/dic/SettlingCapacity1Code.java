
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlingCapacity1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SettlingCapacity1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CUST"/&gt;
 *     &lt;enumeration value="SAGE"/&gt;
 *     &lt;enumeration value="SPRI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SettlingCapacity1Code")
@XmlEnum
public enum SettlingCapacity1Code {


    /**
     * Settlement party is a custodian. It receives/delivers the securities and carries out custodial duties.
     * 
     */
    CUST,

    /**
     * Settlement party is trading and settling transactions in financial instruments on behalf of its client(s).
     * 
     */
    SAGE,

    /**
     * Settlement party is settling its own trades.
     * 
     */
    SPRI;

    public String value() {
        return name();
    }

    public static SettlingCapacity1Code fromValue(String v) {
        return valueOf(v);
    }

}
