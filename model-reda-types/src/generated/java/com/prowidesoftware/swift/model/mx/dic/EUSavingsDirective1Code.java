
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EUSavingsDirective1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EUSavingsDirective1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EUSI"/&gt;
 *     &lt;enumeration value="EUSO"/&gt;
 *     &lt;enumeration value="VARI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
