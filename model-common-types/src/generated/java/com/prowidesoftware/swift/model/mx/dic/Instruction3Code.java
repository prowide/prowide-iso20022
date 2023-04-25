
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Instruction3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Instruction3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CHQB"/>
 *     <enumeration value="HOLD"/>
 *     <enumeration value="PHOB"/>
 *     <enumeration value="TELB"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Instruction3Code")
@XmlEnum
public enum Instruction3Code {


    /**
     * (Ultimate) creditor must be paid by cheque.
     * 
     */
    CHQB,

    /**
     * Amount of money must be held for the (ultimate) creditor, who will call. Pay on identification.
     * 
     */
    HOLD,

    /**
     * Please advise/contact (ultimate) creditor/claimant by phone.
     * 
     */
    PHOB,

    /**
     * Please advise/contact (ultimate) creditor/claimant by the most efficient means of telecommunication.
     * 
     */
    TELB;

    public String value() {
        return name();
    }

    public static Instruction3Code fromValue(String v) {
        return valueOf(v);
    }

}
