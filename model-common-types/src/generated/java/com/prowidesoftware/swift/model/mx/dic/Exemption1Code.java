
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Exemption1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Exemption1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="LOWA"/>
 *     <enumeration value="MINT"/>
 *     <enumeration value="RECP"/>
 *     <enumeration value="SCPE"/>
 *     <enumeration value="SCAD"/>
 *     <enumeration value="TRAE"/>
 *     <enumeration value="PKGE"/>
 *     <enumeration value="TMBE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Exemption1Code")
@XmlEnum
public enum Exemption1Code {


    /**
     * Transaction's amount is low and could be processed without strong customer authentication.
     * 
     */
    LOWA,

    /**
     * Transaction is initiated by the Card Acceptor.
     * 
     */
    MINT,

    /**
     * Transaction is one of a series of recurring payment.
     * 
     */
    RECP,

    /**
     * Transaction is a secure corporate payment.
     * 
     */
    SCPE,

    /**
     * Card Acceptor is a strong customer authentication delegate.
     * 
     */
    SCAD,

    /**
     * According to the transaction risk analysis the strong customer authentication is not mandated.
     * 
     */
    TRAE,

    /**
     * Payment is processed in a environment where strong customer authentication is inappropriate.
     * 
     */
    PKGE,

    /**
     * Cardholder has enrolled the Card Acceptor in the exemption list of strong customer authentication.
     * 
     */
    TMBE;

    public String value() {
        return name();
    }

    public static Exemption1Code fromValue(String v) {
        return valueOf(v);
    }

}
