
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VotingParticipationMethod2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="VotingParticipationMethod2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PHNV"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VotingParticipationMethod2Code")
@XmlEnum
public enum VotingParticipationMethod2Code {


    /**
     * Participation to the meeting is in person but the person is not voting.
     * 
     */
    PHNV;

    public String value() {
        return name();
    }

    public static VotingParticipationMethod2Code fromValue(String v) {
        return valueOf(v);
    }

}
