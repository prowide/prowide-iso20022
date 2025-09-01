
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgentRole1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AgentRole1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PRIN"/&gt;
 *     &lt;enumeration value="SUBA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AgentRole1Code")
@XmlEnum
public enum AgentRole1Code {


    /**
     * Identification of the agent acting as main agent.
     * 
     */
    PRIN,

    /**
     * Identification of the agent acting as co-domicile or sub agent.
     * 
     */
    SUBA;

    public String value() {
        return name();
    }

    public static AgentRole1Code fromValue(String v) {
        return valueOf(v);
    }

}
