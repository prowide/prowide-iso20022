
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatementBasis2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="StatementBasis2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SETT"/>
 *     <enumeration value="TRAD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "StatementBasis2Code")
@XmlEnum
public enum StatementBasis2Code {


    /**
     * The statement is based on settled date positions to the knowledge of the sender at the time of the statement preparation.
     * 
     */
    SETT,

    /**
     * The statement is based on trade date positions.
     * 
     */
    TRAD;

    public String value() {
        return name();
    }

    public static StatementBasis2Code fromValue(String v) {
        return valueOf(v);
    }

}
