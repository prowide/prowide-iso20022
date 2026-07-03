
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CaseStatus2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CaseStatus2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CLSD"/&gt;
 *     &lt;enumeration value="ASGN"/&gt;
 *     &lt;enumeration value="INVE"/&gt;
 *     &lt;enumeration value="UKNW"/&gt;
 *     &lt;enumeration value="ODUE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
