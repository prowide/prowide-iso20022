
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalNote1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GlobalNote1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NGNO"/&gt;
 *     &lt;enumeration value="CGNO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
