
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExecutionStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExecutionStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INTD"/&gt;
 *     &lt;enumeration value="PINT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
