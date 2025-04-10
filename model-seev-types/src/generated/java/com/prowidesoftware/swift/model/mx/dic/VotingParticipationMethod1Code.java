
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VotingParticipationMethod1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="VotingParticipationMethod1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MAIL"/>
 *     <enumeration value="PHYS"/>
 *     <enumeration value="PHNV"/>
 *     <enumeration value="PRXY"/>
 *     <enumeration value="VIRT"/>
 *     <enumeration value="EVOT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VotingParticipationMethod1Code")
@XmlEnum
public enum VotingParticipationMethod1Code {


    /**
     * Vote participation is via documents sent through physical post / mail.
     * 
     */
    MAIL,

    /**
     * Vote participation is through physical attendance.
     * 
     */
    PHYS,

    /**
     * Participation to the meeting is in person but the person is not voting.
     * 
     */
    PHNV,

    /**
     * Vote participation is through a proxy person.
     * 
     */
    PRXY,

    /**
     * Vote participation is through virtual meeting attendance method like multimedia and web based video or audio conferencing. 
     * 
     */
    VIRT,

    /**
     * Vote participation is through electronic means like email or dedicated standards messaging or web based voting applications.
     * 
     */
    EVOT;

    public String value() {
        return name();
    }

    public static VotingParticipationMethod1Code fromValue(String v) {
        return valueOf(v);
    }

}
