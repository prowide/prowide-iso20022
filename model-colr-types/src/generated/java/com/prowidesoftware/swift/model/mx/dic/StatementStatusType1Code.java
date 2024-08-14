
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatementStatusType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="StatementStatusType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <length value="4"/>
 *     <enumeration value="CONF"/>
 *     <enumeration value="PEND"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "StatementStatusType1Code")
@XmlEnum
public enum StatementStatusType1Code {


    /**
     * Transactions reported are confirmed.
     * 
     */
    CONF,

    /**
     * Instructions or transactions  reported are pending.
     * 
     */
    PEND;

    public String value() {
        return name();
    }

    public static StatementStatusType1Code fromValue(String v) {
        return valueOf(v);
    }

}
