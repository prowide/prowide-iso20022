
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatementStatusType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatementStatusType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;length value="4"/&gt;
 *     &lt;enumeration value="CONF"/&gt;
 *     &lt;enumeration value="PEND"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StatementStatusType1Code")
@XmlEnum
public enum StatementStatusType1Code {


    /**
     * Transactions reported are confirmed.
     * 
     */
    CONF,

    /**
     * Instructions or transactions  reported are pending.
     * 
     */
    PEND;

    public String value() {
        return name();
    }

    public static StatementStatusType1Code fromValue(String v) {
        return valueOf(v);
    }

}
