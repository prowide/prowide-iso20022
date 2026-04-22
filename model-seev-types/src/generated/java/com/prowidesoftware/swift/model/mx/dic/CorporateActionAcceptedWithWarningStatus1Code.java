
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionAcceptedWithWarningStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CorporateActionAcceptedWithWarningStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SCAL"/>
 *     <enumeration value="PAYD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CorporateActionAcceptedWithWarningStatus1Code")
@XmlEnum
public enum CorporateActionAcceptedWithWarningStatus1Code {


    /**
     * Invalid Security Called Amount.
     * 
     */
    SCAL,

    /**
     * Payable Date outside of applicable date range.
     * 
     */
    PAYD;

    public String value() {
        return name();
    }

    public static CorporateActionAcceptedWithWarningStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
