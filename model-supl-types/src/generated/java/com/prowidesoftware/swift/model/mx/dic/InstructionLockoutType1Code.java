
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstructionLockoutType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InstructionLockoutType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MANL"/&gt;
 *     &lt;enumeration value="NOTL"/&gt;
 *     &lt;enumeration value="SYSL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InstructionLockoutType1Code")
@XmlEnum
public enum InstructionLockoutType1Code {


    /**
     * Event is locked out manually for instruction processing.  This relates to conversions, warrants and put events.
     * 
     */
    MANL,

    /**
     * Event is not locked out manually for instruction processing. This relates to conversions, warrants and put events.
     * 
     */
    NOTL,

    /**
     * Event is locked out systemically for instruction processing. This relates to conversion or warrant events due to an "out of town" record date on the disbursed security.
     * 
     */
    SYSL;

    public String value() {
        return name();
    }

    public static InstructionLockoutType1Code fromValue(String v) {
        return valueOf(v);
    }

}
