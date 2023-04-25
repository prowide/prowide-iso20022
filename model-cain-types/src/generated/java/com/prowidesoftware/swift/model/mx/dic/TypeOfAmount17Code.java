
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfAmount17Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TypeOfAmount17Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="ISCF"/>
 *     <enumeration value="ANTA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TypeOfAmount17Code")
@XmlEnum
public enum TypeOfAmount17Code {


    /**
     * Other type of amount defined at national level.
     * 
     */
    OTHN,

    /**
     * Other type of amount defined at private level.
     * 
     */
    OTHP,

    /**
     * Fee applied by the card issuer to the cardholder.
     * 
     */
    ISCF,

    /**
     * Amount anticipated for the transaction
     * 
     */
    ANTA;

    public String value() {
        return name();
    }

    public static TypeOfAmount17Code fromValue(String v) {
        return valueOf(v);
    }

}
