
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Instruction5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Instruction5Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PHOB"/>
 *     <enumeration value="TELB"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Instruction5Code")
@XmlEnum
public enum Instruction5Code {


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

    public static Instruction5Code fromValue(String v) {
        return valueOf(v);
    }

}
