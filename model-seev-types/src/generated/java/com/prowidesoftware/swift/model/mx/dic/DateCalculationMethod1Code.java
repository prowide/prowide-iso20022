
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateCalculationMethod1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DateCalculationMethod1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FIFO"/&gt;
 *     &lt;enumeration value="LIFO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DateCalculationMethod1Code")
@XmlEnum
public enum DateCalculationMethod1Code {

    FIFO,
    LIFO;

    public String value() {
        return name();
    }

    public static DateCalculationMethod1Code fromValue(String v) {
        return valueOf(v);
    }

}
