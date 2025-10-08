
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Status6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Status6Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="REJT"/&gt;
 *     &lt;enumeration value="COMP"/&gt;
 *     &lt;enumeration value="QUED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Status6Code")
@XmlEnum
public enum Status6Code {


    /**
     * Instruction has been rejected.
     * 
     */
    REJT,

    /**
     * Processing has been completed.
     * 
     */
    COMP,

    /**
     * Instruction is queued.
     * 
     */
    QUED;

    public String value() {
        return name();
    }

    public static Status6Code fromValue(String v) {
        return valueOf(v);
    }

}
