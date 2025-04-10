
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NoticeType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="NoticeType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="UNVL"/>
 *     <enumeration value="CEDE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
