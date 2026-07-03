
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatementSource1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatementSource1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACCT"/&gt;
 *     &lt;enumeration value="CUST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
