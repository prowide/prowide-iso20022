
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlingCapacity2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SettlingCapacity2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SAGE"/>
 *     <enumeration value="CUST"/>
 *     <enumeration value="SPRI"/>
 *     <enumeration value="RISP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
