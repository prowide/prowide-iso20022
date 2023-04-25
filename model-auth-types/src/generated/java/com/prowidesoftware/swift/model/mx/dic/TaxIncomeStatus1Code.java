
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxIncomeStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TaxIncomeStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FNAL"/>
 *     <enumeration value="PRVL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TaxIncomeStatus1Code")
@XmlEnum
public enum TaxIncomeStatus1Code {


    /**
     * Tax income data provided are final.
     * 
     */
    FNAL,

    /**
     * Tax income data provided are provisional.
     * 
     */
    PRVL;

    public String value() {
        return name();
    }

    public static TaxIncomeStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
