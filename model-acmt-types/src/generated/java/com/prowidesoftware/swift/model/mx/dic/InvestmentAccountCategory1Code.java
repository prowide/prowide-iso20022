
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestmentAccountCategory1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InvestmentAccountCategory1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MAND"/>
 *     <enumeration value="RETA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InvestmentAccountCategory1Code")
@XmlEnum
public enum InvestmentAccountCategory1Code {


    /**
     * Account is fully managed by the financial institution, that is, an investor gives a 'mandate' to the financial institution to execute a mutually agreed investment strategy on its behalf.
     * 
     */
    MAND,

    /**
     * Account is a standard account managed by the investor. The investor issues instructions for the account to the financial institution.
     * 
     */
    RETA;

    public String value() {
        return name();
    }

    public static InvestmentAccountCategory1Code fromValue(String v) {
        return valueOf(v);
    }

}
