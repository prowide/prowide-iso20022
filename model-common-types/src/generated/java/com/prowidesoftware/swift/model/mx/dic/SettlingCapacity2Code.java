
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlingCapacity2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SettlingCapacity2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SAGE"/&gt;
 *     &lt;enumeration value="CUST"/&gt;
 *     &lt;enumeration value="SPRI"/&gt;
 *     &lt;enumeration value="RISP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SettlingCapacity2Code")
@XmlEnum
public enum SettlingCapacity2Code {


    /**
     * Settlement party is trading and settling transactions in financial instruments on behalf of its client(s).
     * 
     */
    SAGE,

    /**
     * Settlement party is a custodian. It receives/delivers the securities and carries out custodial duties.
     * 
     */
    CUST,

    /**
     * Settlement party is settling its own trades.
     * 
     */
    SPRI,

    /**
     * Party settles trades that were simultaneously offset.
     * 
     */
    RISP;

    public String value() {
        return name();
    }

    public static SettlingCapacity2Code fromValue(String v) {
        return valueOf(v);
    }

}
