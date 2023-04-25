
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountStatus3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AccountStatus3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ENAB"/>
 *     <enumeration value="DISA"/>
 *     <enumeration value="DELE"/>
 *     <enumeration value="FORM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AccountStatus3Code")
@XmlEnum
public enum AccountStatus3Code {


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
    DELE,

    /**
     * Account is temporary and can be partially used for its intended purpose. The account will be fully available for use when the account servicer has received all relevant documents.
     * 
     */
    FORM;

    public String value() {
        return name();
    }

    public static AccountStatus3Code fromValue(String v) {
        return valueOf(v);
    }

}
