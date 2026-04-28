
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DutchAuctionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DutchAuctionType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MDFD"/&gt;
 *     &lt;enumeration value="UNMD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DutchAuctionType1Code")
@XmlEnum
public enum DutchAuctionType1Code {


    /**
     * All instructions are accepted at the same price (issuer bid). 
     * 
     */
    MDFD,

    /**
     * All instructions are accepted at the instructed price (offering bid).
     * 
     */
    UNMD;

    public String value() {
        return name();
    }

    public static DutchAuctionType1Code fromValue(String v) {
        return valueOf(v);
    }

}
