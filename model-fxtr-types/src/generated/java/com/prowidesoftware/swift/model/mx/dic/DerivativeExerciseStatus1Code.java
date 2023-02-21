
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DerivativeExerciseStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DerivativeExerciseStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EXEC"/&gt;
 *     &lt;enumeration value="EXPI"/&gt;
 *     &lt;enumeration value="VALI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DerivativeExerciseStatus1Code")
@XmlEnum
public enum DerivativeExerciseStatus1Code {


    /**
     * Derivative is exercised.
     * 
     */
    EXEC,

    /**
     * Derivative is expired and will not be exercised.
     * 
     */
    EXPI,

    /**
     * Derivative is not exercised.
     * 
     */
    VALI;

    public String value() {
        return name();
    }

    public static DerivativeExerciseStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
