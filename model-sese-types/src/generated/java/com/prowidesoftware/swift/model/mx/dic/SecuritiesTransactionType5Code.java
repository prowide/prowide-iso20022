
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesTransactionType5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecuritiesTransactionType5Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TRAD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
