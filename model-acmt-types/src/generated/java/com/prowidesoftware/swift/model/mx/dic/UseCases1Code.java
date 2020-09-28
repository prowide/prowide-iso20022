
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UseCases1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UseCases1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OPEN"/&gt;
 *     &lt;enumeration value="MNTN"/&gt;
 *     &lt;enumeration value="CLSG"/&gt;
 *     &lt;enumeration value="VIEW"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
