
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DetailAmount2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DetailAmount2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="SRCH"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DetailAmount2Code")
@XmlEnum
public enum DetailAmount2Code {


    /**
     * Other type of amount defined at national level
     * 
     */
    OTHN,

    /**
     * Other type of amount defined at private level
     * 
     */
    OTHP,

    /**
     * Fee charged by the acceptor for the transaction.
     * 
     */
    SRCH;

    public String value() {
        return name();
    }

    public static DetailAmount2Code fromValue(String v) {
        return valueOf(v);
    }

}
