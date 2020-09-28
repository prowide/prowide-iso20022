
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountChoiceMethod1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountChoiceMethod1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACSL"/&gt;
 *     &lt;enumeration value="ENTR"/&gt;
 *     &lt;enumeration value="IMAC"/&gt;
 *     &lt;enumeration value="IMPL"/&gt;
 *     &lt;enumeration value="NOSL"/&gt;
 *     &lt;enumeration value="TPSL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
