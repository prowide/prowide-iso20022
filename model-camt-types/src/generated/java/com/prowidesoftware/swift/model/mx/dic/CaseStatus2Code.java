
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CaseStatus2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CaseStatus2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CLSD"/>
 *     <enumeration value="ASGN"/>
 *     <enumeration value="INVE"/>
 *     <enumeration value="UKNW"/>
 *     <enumeration value="ODUE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CaseStatus2Code")
@XmlEnum
public enum CaseStatus2Code {


    /**
     * Case has been closed.
     * 
     */
    CLSD,

    /**
     * Case has been assigned to another party.
     * 
     */
    ASGN,

    /**
     * Case is currently under investigation.
     * 
     */
    INVE,

    /**
     * Case has never been assigned before.
     * 
     */
    UKNW,

    /**
     * Investigation is taking too long.
     * 
     */
    ODUE;

    public String value() {
        return name();
    }

    public static CaseStatus2Code fromValue(String v) {
        return valueOf(v);
    }

}
