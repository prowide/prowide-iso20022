
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WithholdingTaxRateType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="WithholdingTaxRateType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BWIT"/>
 *     <enumeration value="FTCA"/>
 *     <enumeration value="NRAT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "WithholdingTaxRateType1Code")
@XmlEnum
public enum WithholdingTaxRateType1Code {


    /**
     * Withholding tax related to payments subject to back up withholding.
     * 
     */
    BWIT,

    /**
     * Withholding tax related to income subject to FATCA (Foreign Account Tax Compliance Act).
     * 
     */
    FTCA,

    /**
     * Withholding tax related to income subject to NRA (Non Resident Alien).
     * 
     */
    NRAT;

    public String value() {
        return name();
    }

    public static WithholdingTaxRateType1Code fromValue(String v) {
        return valueOf(v);
    }

}
