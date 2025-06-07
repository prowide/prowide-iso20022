
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatementBasis3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatementBasis3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EOSP"/&gt;
 *     &lt;enumeration value="FUTM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StatementBasis3Code")
@XmlEnum
public enum StatementBasis3Code {


    /**
     * Mark-to-Market report sent after settlement. All transactions which have been initiated.
     * 
     */
    EOSP,

    /**
     * Mark-to-market report taking into account collateral management actions which are still pending initiation and initiated transactions.
     * 
     */
    FUTM;

    public String value() {
        return name();
    }

    public static StatementBasis3Code fromValue(String v) {
        return valueOf(v);
    }

}
