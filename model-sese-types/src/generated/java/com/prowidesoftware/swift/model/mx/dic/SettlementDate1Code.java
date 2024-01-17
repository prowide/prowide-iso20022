
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementDate1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SettlementDate1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ASAP"/>
 *     <enumeration value="ENDC"/>
 *     <enumeration value="WHIF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SettlementDate1Code")
@XmlEnum
public enum SettlementDate1Code {


    /**
     * Transfer is to be effected as soon as possible.
     * 
     */
    ASAP,

    /**
     * Transfer is to be effected at the end of the contract.
     * 
     */
    ENDC,

    /**
     * Settlement takes place when the financial instrument is issued by the issuer.
     * 
     */
    WHIF;

    public String value() {
        return name();
    }

    public static SettlementDate1Code fromValue(String v) {
        return valueOf(v);
    }

}
