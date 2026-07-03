
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementDate1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SettlementDate1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ASAP"/&gt;
 *     &lt;enumeration value="ENDC"/&gt;
 *     &lt;enumeration value="WHIF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
