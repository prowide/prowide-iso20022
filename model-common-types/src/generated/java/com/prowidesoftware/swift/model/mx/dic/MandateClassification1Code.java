
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MandateClassification1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MandateClassification1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FIXE"/>
 *     <enumeration value="USGB"/>
 *     <enumeration value="VARI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MandateClassification1Code")
@XmlEnum
public enum MandateClassification1Code {


    /**
     * Direct debit amount is fixed.
     * 
     */
    FIXE,

    /**
     * Direct debit amount is based on usage.
     * 
     */
    USGB,

    /**
     * Direct debit amount is variable.
     * 
     */
    VARI;

    public String value() {
        return name();
    }

    public static MandateClassification1Code fromValue(String v) {
        return valueOf(v);
    }

}
