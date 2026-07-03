
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxWithholdingMethod3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxWithholdingMethod3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MITX"/&gt;
 *     &lt;enumeration value="INVE"/&gt;
 *     &lt;enumeration value="ACCT"/&gt;
 *     &lt;enumeration value="EXMT"/&gt;
 *     &lt;enumeration value="REPT"/&gt;
 *     &lt;enumeration value="CRTF"/&gt;
 *     &lt;enumeration value="WHCO"/&gt;
 *     &lt;enumeration value="WTHD"/&gt;
 *     &lt;enumeration value="WTRE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
