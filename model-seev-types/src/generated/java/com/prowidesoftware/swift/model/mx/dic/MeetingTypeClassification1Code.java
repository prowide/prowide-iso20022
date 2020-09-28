
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeetingTypeClassification1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MeetingTypeClassification1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AMET"/&gt;
 *     &lt;enumeration value="OMET"/&gt;
 *     &lt;enumeration value="CLAS"/&gt;
 *     &lt;enumeration value="ISSU"/&gt;
 *     &lt;enumeration value="VRHI"/&gt;
 *     &lt;enumeration value="CORT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MeetingTypeClassification1Code")
@XmlEnum
public enum MeetingTypeClassification1Code {


    /**
     * Specifies a meeting held periodically to approve the financial statements and to elect the board members and the auditors.
     * 
     */
    AMET,

    /**
     * Specifies a meeting which is planned in the by-laws.
     * 
     */
    OMET,

    /**
     * Meeting for holders of a specific type of asset, e.g. preferred shs, bonds, 
     * 
     */
    CLAS,

    /**
     * Specifies that the meeting is the result of an obligation or a decision made by the issuer as opposed to voting rights holder initiated, ex. contested meeting.
     * 
     */
    ISSU,

    /**
     * Specifies that the meeting is the result of a request or an action of a voting right holder(s), e.g. contested meeting.
     * 
     */
    VRHI,

    /**
     * Specifies that the meeting is the result of a legal proceeding.
     * 
     */
    CORT;

    public String value() {
        return name();
    }

    public static MeetingTypeClassification1Code fromValue(String v) {
        return valueOf(v);
    }

}
