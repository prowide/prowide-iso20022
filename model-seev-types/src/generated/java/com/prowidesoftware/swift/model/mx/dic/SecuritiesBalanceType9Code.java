
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesBalanceType9Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecuritiesBalanceType9Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AVLB"/&gt;
 *     &lt;enumeration value="ELEC"/&gt;
 *     &lt;enumeration value="UNEL"/&gt;
 *     &lt;enumeration value="RDIS"/&gt;
 *     &lt;enumeration value="RREM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SecuritiesBalanceType9Code")
@XmlEnum
public enum SecuritiesBalanceType9Code {


    /**
     * Balance of money or securities that is at the disposal of the account owner on the date specified.
     * 
     */
    AVLB,

    /**
     * Balance of instructed position.
     * 
     */
    ELEC,

    /**
     * Balance of uninstructed position.
     * 
     */
    UNEL,

    /**
     * Balance of financial instruments that are reserved for the distribution of the proceeds.
     * 
     */
    RDIS,

    /**
     * Balance of securities which are reserved temporarily in the SPA account before they will effectively be exchanged.
     * 
     */
    RREM;

    public String value() {
        return name();
    }

    public static SecuritiesBalanceType9Code fromValue(String v) {
        return valueOf(v);
    }

}
