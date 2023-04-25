
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Exemption2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Exemption2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PKGE"/>
 *     <enumeration value="TMBE"/>
 *     <enumeration value="RECP"/>
 *     <enumeration value="LOWA"/>
 *     <enumeration value="SCPE"/>
 *     <enumeration value="TRAE"/>
 *     <enumeration value="CTLS"/>
 *     <enumeration value="PAAC"/>
 *     <enumeration value="TRSP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Exemption2Code")
@XmlEnum
public enum Exemption2Code {


    /**
     * Payment is processed in a environment where strong customer authentication is inappropriate.
     * 
     */
    PKGE,

    /**
     * Cardholder has enrolled the Card Acceptor in the exemption list of strong customer authentication.
     * 
     */
    TMBE,

    /**
     * Transaction is one of a series of recurring payment.
     * 
     */
    RECP,

    /**
     * Transaction's amount is low and could be processed without strong customer authentication.
     * 
     */
    LOWA,

    /**
     * Transaction is a secure corporate payment.
     * 
     */
    SCPE,

    /**
     * According to the transaction risk analysis the strong customer authentication is not mandated.
     * 
     */
    TRAE,

    /**
     * Contactless payment at point of sale exemption.
     * 
     */
    CTLS,

    /**
     * Payment account information exemption.
     * 
     */
    PAAC,

    /**
     * Credit transfer between accounts held by the same natural or legal person exemption.
     * 
     */
    TRSP;

    public String value() {
        return name();
    }

    public static Exemption2Code fromValue(String v) {
        return valueOf(v);
    }

}
