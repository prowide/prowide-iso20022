
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UseCases1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="UseCases1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OPEN"/>
 *     <enumeration value="MNTN"/>
 *     <enumeration value="CLSG"/>
 *     <enumeration value="VIEW"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "UseCases1Code")
@XmlEnum
public enum UseCases1Code {


    /**
     * Code indicating the opening of an account.
     * 
     */
    OPEN,

    /**
     * Code indicating the maintenance of an account.
     * 
     */
    MNTN,

    /**
     * Code indicating the closing of an account.
     * 
     */
    CLSG,

    /**
     * Code indicating the view of an account.
     * 
     */
    VIEW;

    public String value() {
        return name();
    }

    public static UseCases1Code fromValue(String v) {
        return valueOf(v);
    }

}
