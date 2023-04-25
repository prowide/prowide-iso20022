
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMNoteType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ATMNoteType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ALLT"/>
 *     <enumeration value="CNTR"/>
 *     <enumeration value="IDVD"/>
 *     <enumeration value="SCNT"/>
 *     <enumeration value="UNFT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
