
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason13Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RejectionReason13Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FAIL"/&gt;
 *     &lt;enumeration value="SAID"/&gt;
 *     &lt;enumeration value="INID"/&gt;
 *     &lt;enumeration value="REFI"/&gt;
 *     &lt;enumeration value="MICA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RejectionReason13Code")
@XmlEnum
public enum RejectionReason13Code {


    /**
     * The validation of the advice/instruction/request failed.
     * 
     */
    FAIL,

    /**
     * Several message with the same identification.
     * 
     */
    SAID,

    /**
     * Instruction contains an invalid message identification, identification is unknown.
     * 
     */
    INID,

    /**
     * Invalid corporate action identification supplied.
     * 
     */
    REFI,

    /**
     * Issuer CA Identification does not correspond with the Corporate Action Identification supplied.
     * 
     */
    MICA;

    public String value() {
        return name();
    }

    public static RejectionReason13Code fromValue(String v) {
        return valueOf(v);
    }

}
