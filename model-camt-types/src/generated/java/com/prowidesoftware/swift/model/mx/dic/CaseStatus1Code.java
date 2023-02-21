
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CaseStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CaseStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CLOSE"/&gt;
 *     &lt;enumeration value="ASGN"/&gt;
 *     &lt;enumeration value="INVE"/&gt;
 *     &lt;enumeration value="UKNW"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CaseStatus1Code")
@XmlEnum
public enum CaseStatus1Code {


    /**
     * Case has been closed.
     * 
     */
    CLOSE,

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
    UKNW;

    public String value() {
        return name();
    }

    public static CaseStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
