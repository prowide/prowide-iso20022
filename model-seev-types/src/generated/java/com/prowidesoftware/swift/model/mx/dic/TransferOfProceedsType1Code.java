
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferOfProceedsType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TransferOfProceedsType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CLFT"/>
 *     <enumeration value="CLPT"/>
 *     <enumeration value="CLNT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TransferOfProceedsType1Code")
@XmlEnum
public enum TransferOfProceedsType1Code {


    /**
     * Market Claim is to transfer proceeds received from the issuer to the entitled party.
     * 
     */
    CLFT,

    /**
     * Market Claim is to compensate the entitled party in cash by the party that failed to fulfil its obligation. No proceeds have been received from the issuer.
     * 
     */
    CLPT,

    /**
     * Market Claim is to transfer proceeds partially received from the issuer to the entitled party. Part is compensated in cash by the party that failed to fulfil its obligation.
     * 
     */
    CLNT;

    public String value() {
        return name();
    }

    public static TransferOfProceedsType1Code fromValue(String v) {
        return valueOf(v);
    }

}
