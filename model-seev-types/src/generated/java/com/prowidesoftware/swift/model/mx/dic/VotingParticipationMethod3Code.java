
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VotingParticipationMethod3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VotingParticipationMethod3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MAIL"/&gt;
 *     &lt;enumeration value="EVOT"/&gt;
 *     &lt;enumeration value="PHYS"/&gt;
 *     &lt;enumeration value="PHNV"/&gt;
 *     &lt;enumeration value="PRXY"/&gt;
 *     &lt;enumeration value="VIRT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VotingParticipationMethod3Code")
@XmlEnum
public enum VotingParticipationMethod3Code {


    /**
     * Vote participation is via documents sent through physical post / mail.
     * 
     */
    MAIL,

    /**
     * Vote participation is through electronic means like dedicated standards messaging or web based voting applications.
     * 
     */
    EVOT,

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
    VIRT;

    public String value() {
        return name();
    }

    public static VotingParticipationMethod3Code fromValue(String v) {
        return valueOf(v);
    }

}
