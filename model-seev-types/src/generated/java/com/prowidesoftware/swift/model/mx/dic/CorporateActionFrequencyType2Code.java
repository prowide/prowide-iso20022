
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionFrequencyType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CorporateActionFrequencyType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FINL"/>
 *     <enumeration value="INTE"/>
 *     <enumeration value="REGR"/>
 *     <enumeration value="SPEC"/>
 *     <enumeration value="REIN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CorporateActionFrequencyType2Code")
@XmlEnum
public enum CorporateActionFrequencyType2Code {


    /**
     * Payment of a dividend, less amounts already paid through interim dividends.
     * 
     */
    FINL,

    /**
     * Dividend declared and paid before annual earnings have been determined.
     * 
     */
    INTE,

    /**
     * Dividend paid at regular interval, for example, quarterly.
     * 
     */
    REGR,

    /**
     * Dividend in addition to the regular dividend being paid by the company.
     * 
     */
    SPEC,

    /**
     * Automatic Reinvestment of Cash distributed by accumulating funds.
     * 
     */
    REIN;

    public String value() {
        return name();
    }

    public static CorporateActionFrequencyType2Code fromValue(String v) {
        return valueOf(v);
    }

}
