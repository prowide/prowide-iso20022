
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMNoteType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ATMNoteType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ALLT"/&gt;
 *     &lt;enumeration value="CNTR"/&gt;
 *     &lt;enumeration value="IDVD"/&gt;
 *     &lt;enumeration value="SCNT"/&gt;
 *     &lt;enumeration value="UNFT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ATMNoteType1Code")
@XmlEnum
public enum ATMNoteType1Code {


    /**
     * All fit bank note types.
     * 
     */
    ALLT,

    /**
     * Detected counterfeit notes.
     * 
     */
    CNTR,

    /**
     * All types of fit bank notes specified in an individual list.
     * 
     */
    IDVD,

    /**
     * Suspected counterfeit notes.
     * 
     */
    SCNT,

    /**
     * Unfit bank notes (unacceptable quality).
     * 
     */
    UNFT;

    public String value() {
        return name();
    }

    public static ATMNoteType1Code fromValue(String v) {
        return valueOf(v);
    }

}
