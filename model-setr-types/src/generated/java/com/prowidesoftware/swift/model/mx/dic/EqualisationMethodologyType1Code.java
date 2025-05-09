
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EqualisationMethodologyType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="EqualisationMethodologyType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="COLI"/>
 *     <enumeration value="DDEP"/>
 *     <enumeration value="EQCR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EqualisationMethodologyType1Code")
@XmlEnum
public enum EqualisationMethodologyType1Code {


    /**
     * Mandatory redemption of units processed either at redemption or crystallization, whose proceeds are due to the asset manager as performance fee. Performance fee to be paid by the investor when the value of the investment fund units were below their applicable high-watermark on subscription date, and above the high-watermark on redemption date.
     * 
     */
    COLI,

    /**
     * Performance fee to be paid by the investor when the net asset value reaches the high-watermark if the net asset value was under the high-watermark on subscription date.
     * 
     */
    DDEP,

    /**
     * Prepayment amount to be paid by the investor at the moment of the subscription.  The amount is based on the positive difference between the gross asset value at subscription and the high-watermark, when the investment fund units are subscribed to above their high-watermark.
     * 
     */
    EQCR;

    public String value() {
        return name();
    }

    public static EqualisationMethodologyType1Code fromValue(String v) {
        return valueOf(v);
    }

}
