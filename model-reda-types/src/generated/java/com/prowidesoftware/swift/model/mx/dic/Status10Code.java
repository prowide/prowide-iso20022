
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Status10Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Status10Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="COMP"/>
 *     <enumeration value="QUED"/>
 *     <enumeration value="REJT"/>
 *     <enumeration value="PART"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Status10Code")
@XmlEnum
public enum Status10Code {


    /**
     * Processing has been completed.
     * 
     */
    COMP,

    /**
     * Instruction is queued.
     * 
     */
    QUED,

    /**
     * Instruction has been rejected.
     * 
     */
    REJT,

    /**
     * Processing has been partially completed.
     * 
     */
    PART;

    public String value() {
        return name();
    }

    public static Status10Code fromValue(String v) {
        return valueOf(v);
    }

}
