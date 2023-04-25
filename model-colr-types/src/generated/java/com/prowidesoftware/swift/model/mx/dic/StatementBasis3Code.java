
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatementBasis3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="StatementBasis3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EOSP"/>
 *     <enumeration value="FUTM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
