
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxIncomeStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxIncomeStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FNAL"/&gt;
 *     &lt;enumeration value="PRVL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
