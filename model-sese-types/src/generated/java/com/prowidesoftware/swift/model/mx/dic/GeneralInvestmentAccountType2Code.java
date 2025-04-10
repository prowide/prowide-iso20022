
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeneralInvestmentAccountType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GeneralInvestmentAccountType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ANYY"/&gt;
 *     &lt;enumeration value="EQUI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GeneralInvestmentAccountType2Code")
@XmlEnum
public enum GeneralInvestmentAccountType2Code {


    /**
     * Any type of general investment account.
     * 
     */
    ANYY,

    /**
     * General shares or equity savings account.
     * 
     */
    EQUI;

    public String value() {
        return name();
    }

    public static GeneralInvestmentAccountType2Code fromValue(String v) {
        return valueOf(v);
    }

}
