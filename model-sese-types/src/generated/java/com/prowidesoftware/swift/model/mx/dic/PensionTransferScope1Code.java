
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PensionTransferScope1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PensionTransferScope1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CRYS"/&gt;
 *     &lt;enumeration value="SDDT"/&gt;
 *     &lt;enumeration value="FULP"/&gt;
 *     &lt;enumeration value="UCRY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PensionTransferScope1Code")
@XmlEnum
public enum PensionTransferScope1Code {


    /**
     * Transfer is for the crystallised portion.
     * 
     */
    CRYS,

    /**
     * Transfer is for a specific drawdown tranche.
     * 
     */
    SDDT,

    /**
     * Transfer is for the full pension.
     * 
     */
    FULP,

    /**
     * Transfer is for the uncrystallised portion.
     * 
     */
    UCRY;

    public String value() {
        return name();
    }

    public static PensionTransferScope1Code fromValue(String v) {
        return valueOf(v);
    }

}
