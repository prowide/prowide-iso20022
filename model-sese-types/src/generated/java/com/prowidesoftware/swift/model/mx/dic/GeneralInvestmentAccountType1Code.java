
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeneralInvestmentAccountType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="GeneralInvestmentAccountType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EQUI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
