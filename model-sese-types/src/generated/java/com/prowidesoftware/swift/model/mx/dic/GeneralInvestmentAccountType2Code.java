
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeneralInvestmentAccountType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="GeneralInvestmentAccountType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ANYY"/>
 *     <enumeration value="EQUI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
