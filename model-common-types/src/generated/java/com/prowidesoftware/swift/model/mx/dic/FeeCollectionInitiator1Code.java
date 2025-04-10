
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeeCollectionInitiator1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeeCollectionInitiator1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACQR"/&gt;
 *     &lt;enumeration value="AGNT"/&gt;
 *     &lt;enumeration value="CISS"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
