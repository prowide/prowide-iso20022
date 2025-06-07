
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MemberStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MemberStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ENBL"/&gt;
 *     &lt;enumeration value="DSBL"/&gt;
 *     &lt;enumeration value="DLTD"/&gt;
 *     &lt;enumeration value="JOIN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
