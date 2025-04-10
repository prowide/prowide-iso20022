
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionDeadline1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CorporateActionDeadline1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MKDT"/>
 *     <enumeration value="RDDT"/>
 *     <enumeration value="EARD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CorporateActionDeadline1Code")
@XmlEnum
public enum CorporateActionDeadline1Code {


    /**
     * Issuer or issuer's agent deadline to respond, with an election instruction, to an outstanding offer or privilege.
     * 
     */
    MKDT,

    /**
     * Date on which the account servicer has set as the deadline to respond, with instructions, to an outstanding event. This time is dependent on the reference time zone of the account servicer as specified in a Service Level Agreement (SLA).
     * 
     */
    RDDT,

    /**
     * Date/time at which the account servicer has set as the deadline to respond, with instructions, to an outstanding event, giving the holder eligibility to incentives. This time is dependent on the reference time zone of the account servicer as specified in a Service Level Agreement (SLA).
     * 
     */
    EARD;

    public String value() {
        return name();
    }

    public static CorporateActionDeadline1Code fromValue(String v) {
        return valueOf(v);
    }

}
