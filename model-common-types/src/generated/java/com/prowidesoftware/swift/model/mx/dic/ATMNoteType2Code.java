
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMNoteType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ATMNoteType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CNTR"/>
 *     <enumeration value="FITN"/>
 *     <enumeration value="FITU"/>
 *     <enumeration value="NTRL"/>
 *     <enumeration value="SPCT"/>
 *     <enumeration value="UNFT"/>
 *     <enumeration value="UNRG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
