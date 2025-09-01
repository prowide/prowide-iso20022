
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgentType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AgentType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DAGB"/&gt;
 *     &lt;enumeration value="OTAG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AgentType1Code")
@XmlEnum
public enum AgentType1Code {


    /**
     * Trust company, bank or similar financial institution who acts on behalf of an out of town agent or event agent where securities can be delivered in person. Specific to bearer securities.
     * 
     */
    DAGB,

    /**
     * Agent that cannot be classified as any listed type of agent.
     * 
     */
    OTAG;

    public String value() {
        return name();
    }

    public static AgentType1Code fromValue(String v) {
        return valueOf(v);
    }

}
