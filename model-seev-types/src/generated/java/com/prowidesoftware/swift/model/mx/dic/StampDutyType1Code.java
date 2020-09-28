
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StampDutyType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StampDutyType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SDRU"/&gt;
 *     &lt;enumeration value="SDRT"/&gt;
 *     &lt;enumeration value="SDRN"/&gt;
 *     &lt;enumeration value="SDRQ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StampDutyType1Code")
@XmlEnum
public enum StampDutyType1Code {


    /**
     * SDRT paid outside of CSD on corporate action.
     * 
     */
    SDRU,

    /**
     * SDRT paid on another transaction
     * 
     */
    SDRT,

    /**
     * Stamp duty not applicable.
     * 
     */
    SDRN,

    /**
     * Exempt, for any other reason.
     * 
     */
    SDRQ;

    public String value() {
        return name();
    }

    public static StampDutyType1Code fromValue(String v) {
        return valueOf(v);
    }

}
