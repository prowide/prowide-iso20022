
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustodianAction1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustodianAction1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RSCH"/&gt;
 *     &lt;enumeration value="SEND"/&gt;
 *     &lt;enumeration value="DISS"/&gt;
 *     &lt;enumeration value="NOAC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CustodianAction1Code")
@XmlEnum
public enum CustodianAction1Code {


    /**
     * Custodian is researching pending issues raised by the validation service.
     * 
     */
    RSCH,

    /**
     * Custodian is expected to send updated information.
     * 
     */
    SEND,

    /**
     * Custodian disagrees with the validation service and will take no further action.
     * 
     */
    DISS,

    /**
     * No action required by the custodian.
     * 
     */
    NOAC;

    public String value() {
        return name();
    }

    public static CustodianAction1Code fromValue(String v) {
        return valueOf(v);
    }

}
