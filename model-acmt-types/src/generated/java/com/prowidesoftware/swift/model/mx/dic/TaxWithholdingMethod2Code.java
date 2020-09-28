
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxWithholdingMethod2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxWithholdingMethod2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="WHCO"/&gt;
 *     &lt;enumeration value="REPT"/&gt;
 *     &lt;enumeration value="CRTF"/&gt;
 *     &lt;enumeration value="WTHD"/&gt;
 *     &lt;enumeration value="WTRE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TaxWithholdingMethod2Code")
@XmlEnum
public enum TaxWithholdingMethod2Code {


    /**
     * Indicates the withholding tax is applied to a corporate.
     * 
     */
    WHCO,

    /**
     * Indicates the tax information is reported to the tax authorithies and therefore not withheld at source.
     * 
     */
    REPT,

    /**
     * Indicates that a tax certificate is provided by the beneficiary from his tax authorithy in his country of residence. Therefore, the obligation of withholding tax is waived and tax infrmation will be reported to the tax authorithies.
     * 
     */
    CRTF,

    /**
     * Indicates the tax is withheld at source.
     * 
     */
    WTHD,

    /**
     * Indicates the tax is withheld at source and that the tax information is also reported to the tax authorities.
     * 
     */
    WTRE;

    public String value() {
        return name();
    }

    public static TaxWithholdingMethod2Code fromValue(String v) {
        return valueOf(v);
    }

}
