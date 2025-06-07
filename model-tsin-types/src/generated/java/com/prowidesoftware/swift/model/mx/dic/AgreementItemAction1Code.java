
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgreementItemAction1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AgreementItemAction1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DEAC"/&gt;
 *     &lt;enumeration value="HOLD"/&gt;
 *     &lt;enumeration value="MDFY"/&gt;
 *     &lt;enumeration value="REAC"/&gt;
 *     &lt;enumeration value="OPEN"/&gt;
 *     &lt;enumeration value="SYNC"/&gt;
 *     &lt;enumeration value="VRFY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AgreementItemAction1Code")
@XmlEnum
public enum AgreementItemAction1Code {


    /**
     * Deactivate agreement item.
     * 
     */
    DEAC,

    /**
     * Hold the agreement item.
     * 
     */
    HOLD,

    /**
     * Modify agreement item information.
     * 
     */
    MDFY,

    /**
     * Reactivate agreement item.
     * 
     */
    REAC,

    /**
     * Register item as new agreement.
     * 
     */
    OPEN,

    /**
     * Send status with full agreement information details.
     * 
     */
    SYNC,

    /**
     * Verify agreement item information.
     * 
     */
    VRFY;

    public String value() {
        return name();
    }

    public static AgreementItemAction1Code fromValue(String v) {
        return valueOf(v);
    }

}
