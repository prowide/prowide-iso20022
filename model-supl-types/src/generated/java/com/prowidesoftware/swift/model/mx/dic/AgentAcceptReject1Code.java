
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgentAcceptReject1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AgentAcceptReject1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACPT"/&gt;
 *     &lt;enumeration value="REJT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
