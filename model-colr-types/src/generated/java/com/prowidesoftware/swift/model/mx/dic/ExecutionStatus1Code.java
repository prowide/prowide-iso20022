
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExecutionStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ExecutionStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="INTD"/>
 *     <enumeration value="PINT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ExecutionStatus1Code")
@XmlEnum
public enum ExecutionStatus1Code {


    /**
     * Transaction which has been initiated and has not yet closed.
     * 
     */
    INTD,

    /**
     * Pending Initiation.
     * 
     */
    PINT;

    public String value() {
        return name();
    }

    public static ExecutionStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
