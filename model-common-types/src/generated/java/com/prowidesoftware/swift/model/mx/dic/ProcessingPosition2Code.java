
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessingPosition2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProcessingPosition2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AFTE"/&gt;
 *     &lt;enumeration value="WITH"/&gt;
 *     &lt;enumeration value="BEFO"/&gt;
 *     &lt;enumeration value="INFO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProcessingPosition2Code")
@XmlEnum
public enum ProcessingPosition2Code {


    /**
     * Specifies that the transaction/instruction is to be executed after the linked transaction/instruction.
     * 
     */
    AFTE,

    /**
     * Specifies that the transaction/instruction is to be executed with the linked transaction/instruction.
     * 
     */
    WITH,

    /**
     * Specifies that the transaction/instruction is to be executed before the linked transaction/instruction.
     * 
     */
    BEFO,

    /**
     * Specifies that the transactions/instructions are linked for information purposes only.
     * 
     */
    INFO;

    public String value() {
        return name();
    }

    public static ProcessingPosition2Code fromValue(String v) {
        return valueOf(v);
    }

}
