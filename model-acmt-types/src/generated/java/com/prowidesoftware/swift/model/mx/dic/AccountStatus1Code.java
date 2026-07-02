
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ENAB"/&gt;
 *     &lt;enumeration value="DISA"/&gt;
 *     &lt;enumeration value="DELE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccountStatus1Code")
@XmlEnum
public enum AccountStatus1Code {


    /**
     * Account can be used for its intended purpose.
     * 
     */
    ENAB,

    /**
     * Account cannot be used for its intended purpose, either temporarily or permanently.
     * 
     */
    DISA,

    /**
     * Account cannot be used any longer.
     * 
     */
    DELE;

    public String value() {
        return name();
    }

    public static AccountStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
