
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeneralInvestmentAccountType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GeneralInvestmentAccountType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EQUI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GeneralInvestmentAccountType1Code")
@XmlEnum
public enum GeneralInvestmentAccountType1Code {


    /**
     * General shares or equity savings account.
     * 
     */
    EQUI;

    public String value() {
        return name();
    }

    public static GeneralInvestmentAccountType1Code fromValue(String v) {
        return valueOf(v);
    }

}
