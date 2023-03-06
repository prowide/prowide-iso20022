
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgentRole2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AgentRole2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SPAY"/&gt;
 *     &lt;enumeration value="CODO"/&gt;
 *     &lt;enumeration value="ISAG"/&gt;
 *     &lt;enumeration value="REGR"/&gt;
 *     &lt;enumeration value="PAYA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AgentRole2Code")
@XmlEnum
public enum AgentRole2Code {


    /**
     * The System Paying Agent (SPA) is the party within the CSD that is responsible for the distribution of cash and security proceeds related to a specific distribution to other CSD Parties.
     * 
     */
    SPAY,

    /**
     * Sub-agent appointed to execute the payment for the corporate action event on behalf of the issuer company/offeror.
     * 
     */
    CODO,

    /**
     * Party appointed to administer the event on behalf of the issuer company/offeror. The party may be contacted for more information about the event.
     * 
     */
    ISAG,

    /**
     * Party/agent responsible for maintaining the register of a security.
     * 
     */
    REGR,

    /**
     * Agent (principal or fiscal paying agent) appointed to execute the payment for the corporate action event on behalf of the issuer company/offeror.
     * 
     */
    PAYA;

    public String value() {
        return name();
    }

    public static AgentRole2Code fromValue(String v) {
        return valueOf(v);
    }

}
