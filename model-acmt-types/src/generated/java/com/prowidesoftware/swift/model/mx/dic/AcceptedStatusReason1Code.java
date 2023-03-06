
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcceptedStatusReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AcceptedStatusReason1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PLAC"/&gt;
 *     &lt;enumeration value="SECT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AcceptedStatusReason1Code")
@XmlEnum
public enum AcceptedStatusReason1Code {


    /**
     * Status of the account modification instruction is accepted but modification of the account data will not be carried out for the place.
     * 
     */
    PLAC,

    /**
     * Status of the account modification instruction is accepted but modification of the account data will not be carried out for the sector code.
     * 
     */
    SECT;

    public String value() {
        return name();
    }

    public static AcceptedStatusReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
