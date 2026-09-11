
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesTransactionType5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SecuritiesTransactionType5Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="TRAD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SecuritiesTransactionType5Code")
@XmlEnum
public enum SecuritiesTransactionType5Code {


    /**
     * Relates to the settlement of a trade.
     * 
     */
    TRAD;

    public String value() {
        return name();
    }

    public static SecuritiesTransactionType5Code fromValue(String v) {
        return valueOf(v);
    }

}
