
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DerivativeExerciseStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DerivativeExerciseStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EXEC"/>
 *     <enumeration value="EXPI"/>
 *     <enumeration value="VALI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
