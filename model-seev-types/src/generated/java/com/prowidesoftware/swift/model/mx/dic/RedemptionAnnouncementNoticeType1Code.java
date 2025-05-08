
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RedemptionAnnouncementNoticeType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RedemptionAnnouncementNoticeType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DEPT"/>
 *     <enumeration value="UNVL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RedemptionAnnouncementNoticeType1Code")
@XmlEnum
public enum RedemptionAnnouncementNoticeType1Code {


    /**
     * Event announcement will refer only to certificates held at the depository.  Used for Redemption events only. 
     * 
     */
    DEPT,

    /**
     * Event announcement will refer to certificates held outside of depository.
     * 
     */
    UNVL;

    public String value() {
        return name();
    }

    public static RedemptionAnnouncementNoticeType1Code fromValue(String v) {
        return valueOf(v);
    }

}
