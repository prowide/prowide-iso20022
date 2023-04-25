
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MemberStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MemberStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ENBL"/>
 *     <enumeration value="DSBL"/>
 *     <enumeration value="DLTD"/>
 *     <enumeration value="JOIN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MemberStatus1Code")
@XmlEnum
public enum MemberStatus1Code {


    /**
     * Member is live on the system.
     * 
     */
    ENBL,

    /**
     * Member is temporarily not live on the system.
     * 
     */
    DSBL,

    /**
     * Member is no longer live on the system.
     * 
     */
    DLTD,

    /**
     * Member is joining and will soon be enabled on the system.
     * 
     */
    JOIN;

    public String value() {
        return name();
    }

    public static MemberStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
