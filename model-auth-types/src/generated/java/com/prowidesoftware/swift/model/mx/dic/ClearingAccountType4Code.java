
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClearingAccountType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClearingAccountType4Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CLIE"/&gt;
 *     &lt;enumeration value="HOUS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ClearingAccountType4Code")
@XmlEnum
public enum ClearingAccountType4Code {


    /**
     * Specifies that the account is used to register trades executed for the clearing member's customers.
     * 
     */
    CLIE,

    /**
     * Specifies that the account is used to register trades executed for either the clearing member or its subsidiaries.
     * 
     */
    HOUS;

    public String value() {
        return name();
    }

    public static ClearingAccountType4Code fromValue(String v) {
        return valueOf(v);
    }

}
