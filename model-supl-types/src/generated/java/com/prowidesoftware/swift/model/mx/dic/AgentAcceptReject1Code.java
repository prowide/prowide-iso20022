
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgentAcceptReject1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AgentAcceptReject1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACPT"/>
 *     <enumeration value="REJT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AgentAcceptReject1Code")
@XmlEnum
public enum AgentAcceptReject1Code {


    /**
     * Offer approved by agent.
     * 
     */
    ACPT,

    /**
     * Offer rejected by agent.
     * 
     */
    REJT;

    public String value() {
        return name();
    }

    public static AgentAcceptReject1Code fromValue(String v) {
        return valueOf(v);
    }

}
