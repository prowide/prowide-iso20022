
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatementSource1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="StatementSource1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACCT"/>
 *     <enumeration value="CUST"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "StatementSource1Code")
@XmlEnum
public enum StatementSource1Code {


    /**
     * Accounting.
     * 
     */
    ACCT,

    /**
     * Custody.
     * 
     */
    CUST;

    public String value() {
        return name();
    }

    public static StatementSource1Code fromValue(String v) {
        return valueOf(v);
    }

}
