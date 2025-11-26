
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DutchAuctionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DutchAuctionType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MDFD"/>
 *     <enumeration value="UNMD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
