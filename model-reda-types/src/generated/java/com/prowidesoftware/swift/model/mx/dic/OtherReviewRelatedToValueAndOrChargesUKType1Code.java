
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherReviewRelatedToValueAndOrChargesUKType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="OtherReviewRelatedToValueAndOrChargesUKType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="REVA"/>
 *     <enumeration value="REVO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OtherReviewRelatedToValueAndOrChargesUKType1Code")
@XmlEnum
public enum OtherReviewRelatedToValueAndOrChargesUKType1Code {


    /**
     * In line with the ESMA supervisory briefing on the supervision of costs in UCITS and AIFs or relevant NCA supervisory activity.
     * 
     */
    REVA,

    /**
     * In line with other local requirements or procedures.
     * 
     */
    REVO;

    public String value() {
        return name();
    }

    public static OtherReviewRelatedToValueAndOrChargesUKType1Code fromValue(String v) {
        return valueOf(v);
    }

}
