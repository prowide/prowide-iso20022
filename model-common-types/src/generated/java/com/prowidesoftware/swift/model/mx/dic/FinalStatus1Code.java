
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinalStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FinalStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="STLD"/>
 *     <enumeration value="RJTD"/>
 *     <enumeration value="CAND"/>
 *     <enumeration value="FNLD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FinalStatus1Code")
@XmlEnum
public enum FinalStatus1Code {


    /**
     * Transaction has been successfully processed by the clearing agent.
     * 
     */
    STLD,

    /**
     * Transaction has been rejected by the clearing agent.
     * 
     */
    RJTD,

    /**
     * Transaction has been cancelled.
     * 
     */
    CAND,

    /**
     * Transaction has been successfully processed by the clearing agent. Settlement will take place outside of the system.
     * 
     */
    FNLD;

    public String value() {
        return name();
    }

    public static FinalStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
