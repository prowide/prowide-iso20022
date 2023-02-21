
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionFrequencyType5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CorporateActionFrequencyType5Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FINL"/&gt;
 *     &lt;enumeration value="INTE"/&gt;
 *     &lt;enumeration value="REIN"/&gt;
 *     &lt;enumeration value="REGR"/&gt;
 *     &lt;enumeration value="SPEC"/&gt;
 *     &lt;enumeration value="SPRE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CorporateActionFrequencyType5Code")
@XmlEnum
public enum CorporateActionFrequencyType5Code {


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
     * Reinvestment of cash distributed.
     * 
     */
    REIN,

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
     * Special Dividend with reinvestment component.
     * 
     */
    SPRE;

    public String value() {
        return name();
    }

    public static CorporateActionFrequencyType5Code fromValue(String v) {
        return valueOf(v);
    }

}
