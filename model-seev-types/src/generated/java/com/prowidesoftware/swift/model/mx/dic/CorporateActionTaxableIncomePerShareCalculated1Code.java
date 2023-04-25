
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionTaxableIncomePerShareCalculated1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CorporateActionTaxableIncomePerShareCalculated1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="TDIY"/>
 *     <enumeration value="TDIN"/>
 *     <enumeration value="UKWN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CorporateActionTaxableIncomePerShareCalculated1Code")
@XmlEnum
public enum CorporateActionTaxableIncomePerShareCalculated1Code {


    /**
     * Fund is calculating the taxable income per dividend/taxable income per share.
     * 
     */
    TDIY,

    /**
     * Fund is not calculating the taxable income per dividend/taxable income per share.
     * 
     */
    TDIN,

    /**
     * Unknown whether the fund is calculating the taxable income per dividend/taxable income per share.
     * 
     */
    UKWN;

    public String value() {
        return name();
    }

    public static CorporateActionTaxableIncomePerShareCalculated1Code fromValue(String v) {
        return valueOf(v);
    }

}
