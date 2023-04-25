
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesStatementType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SecuritiesStatementType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CUST"/>
 *     <enumeration value="ACCT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SecuritiesStatementType1Code")
@XmlEnum
public enum SecuritiesStatementType1Code {


    /**
     * Statement is a custody statement.
     * 
     */
    CUST,

    /**
     * Statement is an accounting statement.
     * 
     */
    ACCT;

    public String value() {
        return name();
    }

    public static SecuritiesStatementType1Code fromValue(String v) {
        return valueOf(v);
    }

}
