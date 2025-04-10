
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmbeddedType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EmbeddedType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CANC"/&gt;
 *     &lt;enumeration value="EXTD"/&gt;
 *     &lt;enumeration value="OPET"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="MDET"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EmbeddedType1Code")
@XmlEnum
public enum EmbeddedType1Code {


    /**
     * Option can be cancelled.
     * 
     */
    CANC,

    /**
     * Option can be extended.
     * 
     */
    EXTD,

    /**
     * Option can be early terminated.
     * 
     */
    OPET,

    /**
     * Option type is other.
     * 
     */
    OTHR,

    /**
     * Option must be early terminated.
     * 
     */
    MDET;

    public String value() {
        return name();
    }

    public static EmbeddedType1Code fromValue(String v) {
        return valueOf(v);
    }

}
