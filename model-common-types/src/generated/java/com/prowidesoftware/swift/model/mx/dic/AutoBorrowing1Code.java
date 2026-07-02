
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutoBorrowing1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AutoBorrowing1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LAMI"/&gt;
 *     &lt;enumeration value="NBOR"/&gt;
 *     &lt;enumeration value="YBOR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AutoBorrowing1Code")
@XmlEnum
public enum AutoBorrowing1Code {


    /**
     * Only last resort borrowing should be considered to make settlement occur.
     * 
     */
    LAMI,

    /**
     * No automatic borrowing should take place.
     * 
     */
    NBOR,

    /**
     * Automatic borrowing should take place.
     * 
     */
    YBOR;

    public String value() {
        return name();
    }

    public static AutoBorrowing1Code fromValue(String v) {
        return valueOf(v);
    }

}
