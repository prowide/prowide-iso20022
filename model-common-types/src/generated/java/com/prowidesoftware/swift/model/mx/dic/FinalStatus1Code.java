
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinalStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FinalStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="STLD"/&gt;
 *     &lt;enumeration value="RJTD"/&gt;
 *     &lt;enumeration value="CAND"/&gt;
 *     &lt;enumeration value="FNLD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
