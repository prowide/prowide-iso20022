
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonEligibleProceedsIndicator1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NonEligibleProceedsIndicator1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NELC"/&gt;
 *     &lt;enumeration value="ACLI"/&gt;
 *     &lt;enumeration value="ONEL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NonEligibleProceedsIndicator1Code")
@XmlEnum
public enum NonEligibleProceedsIndicator1Code {


    /**
     * Currency not eligible for settlement in the Central Securities Depository (CSD).
     * 
     */
    NELC,

    /**
     * Participant's account limitation.
     * 
     */
    ACLI,

    /**
     * Other source of non eligibility.
     * 
     */
    ONEL;

    public String value() {
        return name();
    }

    public static NonEligibleProceedsIndicator1Code fromValue(String v) {
        return valueOf(v);
    }

}
