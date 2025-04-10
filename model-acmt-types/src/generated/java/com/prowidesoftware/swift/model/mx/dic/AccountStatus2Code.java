
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountStatus2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountStatus2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ENAB"/&gt;
 *     &lt;enumeration value="DISA"/&gt;
 *     &lt;enumeration value="FORM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccountStatus2Code")
@XmlEnum
public enum AccountStatus2Code {


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
     * Account is temporary and can be partially used for its intended purpose. The account will be fully available for use when the account servicer has received all relevant documents.
     * 
     */
    FORM;

    public String value() {
        return name();
    }

    public static AccountStatus2Code fromValue(String v) {
        return valueOf(v);
    }

}
