
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxWithholdingMethod3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TaxWithholdingMethod3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MITX"/>
 *     <enumeration value="INVE"/>
 *     <enumeration value="ACCT"/>
 *     <enumeration value="EXMT"/>
 *     <enumeration value="REPT"/>
 *     <enumeration value="CRTF"/>
 *     <enumeration value="WHCO"/>
 *     <enumeration value="WTHD"/>
 *     <enumeration value="WTRE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TaxWithholdingMethod3Code")
@XmlEnum
public enum TaxWithholdingMethod3Code {


    /**
     * Minority interest tax is withheld.
     * 
     */
    MITX,

    /**
     * Withholding tax is applied to an investment company.
     * 
     */
    INVE,

    /**
     * Dividend tax is exempt according to the accountant.
     * 
     */
    ACCT,

    /**
     * Dividend tax is exempt.
     * 
     */
    EXMT,

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
     * Withholding tax is applied to a corporate.
     * 
     */
    WHCO,

    /**
     * Tax is withheld at source.
     * 
     */
    WTHD,

    /**
     * Tax is withheld at source and the tax information is also reported to the tax authorities.
     * 
     */
    WTRE;

    public String value() {
        return name();
    }

    public static TaxWithholdingMethod3Code fromValue(String v) {
        return valueOf(v);
    }

}
