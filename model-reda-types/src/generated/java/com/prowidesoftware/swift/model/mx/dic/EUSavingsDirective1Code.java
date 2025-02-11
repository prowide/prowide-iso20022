
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EUSavingsDirective1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="EUSavingsDirective1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EUSI"/>
 *     <enumeration value="EUSO"/>
 *     <enumeration value="VARI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EUSavingsDirective1Code")
@XmlEnum
public enum EUSavingsDirective1Code {


    /**
     * Investment Fund is in the scope of the directive.
     * 
     */
    EUSI,

    /**
     * Investment Fund is out of the scope of the directive.
     * 
     */
    EUSO,

    /**
     * Investment Fund may vary for inclusion in the scope of the directive.
     * 
     */
    VARI;

    public String value() {
        return name();
    }

    public static EUSavingsDirective1Code fromValue(String v) {
        return valueOf(v);
    }

}
