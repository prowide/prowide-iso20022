
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatementStructure1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatementStructure1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="STAT"/&gt;
 *     &lt;enumeration value="TRAN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StatementStructure1Code")
@XmlEnum
public enum StatementStructure1Code {


    /**
     * Statement is sorted by status.
     * 
     */
    STAT,

    /**
     * Statement is sorted by transaction.
     * 
     */
    TRAN;

    public String value() {
        return name();
    }

    public static StatementStructure1Code fromValue(String v) {
        return valueOf(v);
    }

}
