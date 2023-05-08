
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalNote1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="GlobalNote1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NGNO"/>
 *     <enumeration value="CGNO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "GlobalNote1Code")
@XmlEnum
public enum GlobalNote1Code {


    /**
     * Form of global certificate which refers to the books and records of the ICSDs to determine the Issue Outstanding Amount (IOA).
     * 
     */
    NGNO,

    /**
     * Form of global certificate which requires physical annotation on the attached schedule to reflect changes in the Issue Outstanding Amount (IOA).
     * 
     */
    CGNO;

    public String value() {
        return name();
    }

    public static GlobalNote1Code fromValue(String v) {
        return valueOf(v);
    }

}
