
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfAmount17Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeOfAmount17Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="ISCF"/&gt;
 *     &lt;enumeration value="ANTA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
