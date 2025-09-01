
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionFrequencyType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CorporateActionFrequencyType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FINL"/&gt;
 *     &lt;enumeration value="INTE"/&gt;
 *     &lt;enumeration value="REGR"/&gt;
 *     &lt;enumeration value="SPEC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CorporateActionFrequencyType1Code")
@XmlEnum
public enum CorporateActionFrequencyType1Code {


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
    SPEC;

    public String value() {
        return name();
    }

    public static CorporateActionFrequencyType1Code fromValue(String v) {
        return valueOf(v);
    }

}
