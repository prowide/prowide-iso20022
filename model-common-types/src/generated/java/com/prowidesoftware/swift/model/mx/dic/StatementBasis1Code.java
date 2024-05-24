
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatementBasis1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="StatementBasis1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CONT"/>
 *     <enumeration value="SETT"/>
 *     <enumeration value="TRAD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "StatementBasis1Code")
@XmlEnum
public enum StatementBasis1Code {


    /**
     * The statement is based on contractual settlement date irrespective of settled data positions.
     * 
     */
    CONT,

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

    public static StatementBasis1Code fromValue(String v) {
        return valueOf(v);
    }

}
