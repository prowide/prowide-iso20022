
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMNoteType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ATMNoteType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CNTR"/&gt;
 *     &lt;enumeration value="FITN"/&gt;
 *     &lt;enumeration value="FITU"/&gt;
 *     &lt;enumeration value="NTRL"/&gt;
 *     &lt;enumeration value="SPCT"/&gt;
 *     &lt;enumeration value="UNFT"/&gt;
 *     &lt;enumeration value="UNRG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ATMNoteType2Code")
@XmlEnum
public enum ATMNoteType2Code {


    /**
     * Detected counterfeit notes.
     * 
     */
    CNTR,

    /**
     * Fit bank notes.
     * 
     */
    FITN,

    /**
     * Fit and unfit bank notes, if fitness cannot be determined.
     * 
     */
    FITU,

    /**
     * Notes stained by dye pack.
     * 
     */
    NTRL,

    /**
     * Suspect notes.
     * 
     */
    SPCT,

    /**
     * Unfit bank notes (unacceptable quality).
     * 
     */
    UNFT,

    /**
     * Unrecognised notes.
     * 
     */
    UNRG;

    public String value() {
        return name();
    }

    public static ATMNoteType2Code fromValue(String v) {
        return valueOf(v);
    }

}
