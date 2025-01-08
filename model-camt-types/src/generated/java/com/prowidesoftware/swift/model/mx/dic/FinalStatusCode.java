
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinalStatusCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FinalStatusCode">
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
@XmlType(name = "FinalStatusCode")
@XmlEnum
public enum FinalStatusCode {


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

    public static FinalStatusCode fromValue(String v) {
        return valueOf(v);
    }

}
