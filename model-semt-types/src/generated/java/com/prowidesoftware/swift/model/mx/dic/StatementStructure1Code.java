
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatementStructure1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="StatementStructure1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="STAT"/>
 *     <enumeration value="TRAN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
