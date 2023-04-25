
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeeCollectionInitiator1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FeeCollectionInitiator1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACQR"/>
 *     <enumeration value="AGNT"/>
 *     <enumeration value="CISS"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FeeCollectionInitiator1Code")
@XmlEnum
public enum FeeCollectionInitiator1Code {


    /**
     * Entity acquiring card transaction.
     * 
     */
    ACQR,

    /**
     * Entity providing card payment processing services acting as an intermediary between an acquirer and an issuer
     * 
     */
    AGNT,

    /**
     * Entity issuing card.
     * 
     */
    CISS,

    /**
     * Other entity initiates fee collection defined at national level.
     * 
     */
    OTHN,

    /**
     * Other entity initiates fee collection defined at private level.
     * 
     */
    OTHP;

    public String value() {
        return name();
    }

    public static FeeCollectionInitiator1Code fromValue(String v) {
        return valueOf(v);
    }

}
