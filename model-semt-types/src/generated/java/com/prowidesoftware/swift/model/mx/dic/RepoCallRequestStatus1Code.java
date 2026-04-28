
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RepoCallRequestStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RepoCallRequestStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CACK"/&gt;
 *     &lt;enumeration value="DEND"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RepoCallRequestStatus1Code")
@XmlEnum
public enum RepoCallRequestStatus1Code {


    /**
     * Repurchase agreement call request is acknowledged/accepted.
     * 
     */
    CACK,

    /**
     * Repuchase agreement call request is denied.
     * 
     */
    DEND;

    public String value() {
        return name();
    }

    public static RepoCallRequestStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
