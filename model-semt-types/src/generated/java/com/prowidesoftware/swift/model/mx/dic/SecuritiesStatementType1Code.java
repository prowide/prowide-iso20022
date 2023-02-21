
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesStatementType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecuritiesStatementType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CUST"/&gt;
 *     &lt;enumeration value="ACCT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
