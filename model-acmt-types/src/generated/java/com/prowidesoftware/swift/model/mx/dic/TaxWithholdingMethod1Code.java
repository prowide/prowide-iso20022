
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxWithholdingMethod1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TaxWithholdingMethod1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="WTHD"/>
 *     <enumeration value="REPT"/>
 *     <enumeration value="CRTF"/>
 *     <enumeration value="WTRE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TaxWithholdingMethod1Code")
@XmlEnum
public enum TaxWithholdingMethod1Code {


    /**
     * Tax is withheld at source.
     * 
     */
    WTHD,

    /**
     * Tax information is reported to the tax authorities and therefore not withheld at source.
     * 
     */
    REPT,

    /**
     * Tax certificate is provided by the beneficiary from its tax authority in its country of residence. Therefore, the obligation of withholding tax is waived and tax information will be reported to the tax authorities.
     * 
     */
    CRTF,

    /**
     * Tax is withheld at source and the tax information is also reported to the tax authorities.
     * 
     */
    WTRE;

    public String value() {
        return name();
    }

    public static TaxWithholdingMethod1Code fromValue(String v) {
        return valueOf(v);
    }

}
