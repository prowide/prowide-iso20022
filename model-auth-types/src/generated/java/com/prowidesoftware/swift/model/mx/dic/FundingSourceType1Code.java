
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundingSourceType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FundingSourceType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SECL"/&gt;
 *     &lt;enumeration value="FREE"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="BSHS"/&gt;
 *     &lt;enumeration value="CSHS"/&gt;
 *     &lt;enumeration value="REPO"/&gt;
 *     &lt;enumeration value="UBOR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FundingSourceType1Code")
@XmlEnum
public enum FundingSourceType1Code {


    /**
     * Type of a funding source is cash collateral from securities lending. 
     * 
     */
    SECL,

    /**
     * Type of a funding source is free credits. 
     * 
     */
    FREE,

    /**
     * Other type of a funding source.
     * 
     */
    OTHR,

    /**
     * Type of a funding source is proceeds from broker short sales. 
     * 
     */
    BSHS,

    /**
     * Type of a funding source is proceeds from customer short sales. 
     * 
     */
    CSHS,

    /**
     * Type of a funding source is repo or buy sell back.
     * 
     */
    REPO,

    /**
     * Type of a funding source is unsecured borrowing. 
     * 
     */
    UBOR;

    public String value() {
        return name();
    }

    public static FundingSourceType1Code fromValue(String v) {
        return valueOf(v);
    }

}
