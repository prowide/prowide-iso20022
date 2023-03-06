
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NoticeType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NoticeType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNVL"/&gt;
 *     &lt;enumeration value="CEDE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NoticeType1Code")
@XmlEnum
public enum NoticeType1Code {


    /**
     * Notice is universal.
     * 
     */
    UNVL,

    /**
     * Notice is specific to the securities registered in DTC's (The Depository Trust Company) nominee name.
     * 
     */
    CEDE;

    public String value() {
        return name();
    }

    public static NoticeType1Code fromValue(String v) {
        return valueOf(v);
    }

}
