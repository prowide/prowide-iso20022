
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssignmentMethod1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssignmentMethod1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RAND"/&gt;
 *     &lt;enumeration value="PROR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AssignmentMethod1Code")
@XmlEnum
public enum AssignmentMethod1Code {


    /**
     * Assignment was conducted randomly.
     * 
     */
    RAND,

    /**
     * Assignment was conducted on a prorata basis.
     * 
     */
    PROR;

    public String value() {
        return name();
    }

    public static AssignmentMethod1Code fromValue(String v) {
        return valueOf(v);
    }

}
