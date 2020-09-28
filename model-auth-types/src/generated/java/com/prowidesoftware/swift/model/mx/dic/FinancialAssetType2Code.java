
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialAssetType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FinancialAssetType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MMFT"/&gt;
 *     &lt;enumeration value="STSA"/&gt;
 *     &lt;enumeration value="SCRT"/&gt;
 *     &lt;enumeration value="RVPO"/&gt;
 *     &lt;enumeration value="OTCD"/&gt;
 *     &lt;enumeration value="DPSC"/&gt;
 *     &lt;enumeration value="MMII"/&gt;
 *     &lt;enumeration value="REPO"/&gt;
 *     &lt;enumeration value="ABCP"/&gt;
 *     &lt;enumeration value="STSS"/&gt;
 *     &lt;enumeration value="ANLA"/&gt;
 *     &lt;enumeration value="RMTD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FinancialAssetType2Code")
@XmlEnum
public enum FinancialAssetType2Code {


    /**
     * Relates to units or shares of other MMFs.
     * 
     */
    MMFT,

    /**
     * Relates to single and transparent and standardised asset back commercial papers.
     * 
     */
    STSA,

    /**
     * Relates to securitisations not considered as simple transparent and standardised.
     * 
     */
    SCRT,

    /**
     * Relates to a reverse repurchase agreement transaction.
     * 
     */
    RVPO,

    /**
     * Relates to financial derivative instruments dealt in over the counter.
     * 
     */
    OTCD,

    /**
     * Relates to deposits with credit institutions.
     * 
     */
    DPSC,

    /**
     * Relates to money market Instruments.
     * 
     */
    MMII,

    /**
     * Relates to repurchase agreement trading.
     * 
     */
    REPO,

    /**
     * Relates to asset backed commercial papers not considered as simple transparent and standardised.
     * 
     */
    ABCP,

    /**
     * Relates to single and transparent and standardised securitisations.
     * 
     */
    STSS,

    /**
     * Relates to ancillary liquid assets.
     * 
     */
    ANLA,

    /**
     * Financial derivative instruments dealt in on a regulated market.
     * 
     */
    RMTD;

    public String value() {
        return name();
    }

    public static FinancialAssetType2Code fromValue(String v) {
        return valueOf(v);
    }

}
