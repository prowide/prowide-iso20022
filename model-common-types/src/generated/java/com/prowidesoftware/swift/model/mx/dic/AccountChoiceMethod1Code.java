
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountChoiceMethod1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AccountChoiceMethod1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACSL"/>
 *     <enumeration value="ENTR"/>
 *     <enumeration value="IMAC"/>
 *     <enumeration value="IMPL"/>
 *     <enumeration value="NOSL"/>
 *     <enumeration value="TPSL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AccountChoiceMethod1Code")
@XmlEnum
public enum AccountChoiceMethod1Code {


    /**
     * Account selected in an account list.
     * 
     */
    ACSL,

    /**
     * Account identification is entered by the customer.
     * 
     */
    ENTR,

    /**
     * Account is selected according to the configuration.
     * 
     */
    IMAC,

    /**
     * Type of account is selected according to the configuration.
     * 
     */
    IMPL,

    /**
     * Account is not selected by the customer or a profile, but by the issuer.
     * 
     */
    NOSL,

    /**
     * Type of account selected in a list.
     * 
     */
    TPSL;

    public String value() {
        return name();
    }

    public static AccountChoiceMethod1Code fromValue(String v) {
        return valueOf(v);
    }

}
