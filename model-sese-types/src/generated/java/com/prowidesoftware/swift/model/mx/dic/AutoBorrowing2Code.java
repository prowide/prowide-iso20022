
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutoBorrowing2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AutoBorrowing2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LAMI"/&gt;
 *     &lt;enumeration value="NBOR"/&gt;
 *     &lt;enumeration value="YBOR"/&gt;
 *     &lt;enumeration value="RTRN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AutoBorrowing2Code")
@XmlEnum
public enum AutoBorrowing2Code {


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
    YBOR,

    /**
     * Return of stocks should take place.
     * 
     */
    RTRN;

    public String value() {
        return name();
    }

    public static AutoBorrowing2Code fromValue(String v) {
        return valueOf(v);
    }

}
