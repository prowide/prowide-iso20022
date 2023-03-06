
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancingUnderlyingType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FinancingUnderlyingType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CMBS"/&gt;
 *     &lt;enumeration value="CSML"/&gt;
 *     &lt;enumeration value="CCRB"/&gt;
 *     &lt;enumeration value="LESG"/&gt;
 *     &lt;enumeration value="LTCS"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="RMBS"/&gt;
 *     &lt;enumeration value="TDRB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FinancingUnderlyingType1Code")
@XmlEnum
public enum FinancingUnderlyingType1Code {


    /**
     * Relates to sub structured type of the financial instrument is a commercial mortgage.
     * 
     */
    CMBS,

    /**
     * Relates to consumer loans.
     * 
     */
    CSML,

    /**
     * Relates to credit card receivables.
     * 
     */
    CCRB,

    /**
     * Relates to leasing.
     * 
     */
    LESG,

    /**
     * Relates to loans to corporates or small or medium-sized enterprises.
     * 
     */
    LTCS,

    /**
     * Other financial instrument type.
     * 
     */
    OTHR,

    /**
     * Relates to sub structured type of the financial instrument is a residential mortgage.
     * 
     */
    RMBS,

    /**
     * Relates to trade receivables.
     * 
     */
    TDRB;

    public String value() {
        return name();
    }

    public static FinancingUnderlyingType1Code fromValue(String v) {
        return valueOf(v);
    }

}
