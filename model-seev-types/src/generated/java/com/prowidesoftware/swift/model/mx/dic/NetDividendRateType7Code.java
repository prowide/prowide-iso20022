
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetDividendRateType7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NetDividendRateType7Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CAPO"/&gt;
 *     &lt;enumeration value="CDFI"/&gt;
 *     &lt;enumeration value="FUPU"/&gt;
 *     &lt;enumeration value="FLFR"/&gt;
 *     &lt;enumeration value="INCO"/&gt;
 *     &lt;enumeration value="INTR"/&gt;
 *     &lt;enumeration value="SOIC"/&gt;
 *     &lt;enumeration value="TXBL"/&gt;
 *     &lt;enumeration value="TXDF"/&gt;
 *     &lt;enumeration value="TXFR"/&gt;
 *     &lt;enumeration value="UNFR"/&gt;
 *     &lt;enumeration value="PAPU"/&gt;
 *     &lt;enumeration value="REES"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NetDividendRateType7Code")
@XmlEnum
public enum NetDividendRateType7Code {


    /**
     * Rate relating to the underlying security for which capital is distributed.
     * 
     */
    CAPO,

    /**
     * Rate relating to a foreign income type such as a conduit foreign income.
     * 
     */
    CDFI,

    /**
     * Distribution rate relating to the full period units, for example Group I units in UK.
     * 
     */
    FUPU,

    /**
     * Rate resulting from a fully franked dividend paid by a company; the rate includes tax credit for companies that have made sufficient tax payments during the fiscal period.
     * 
     */
    FLFR,

    /**
     * Rate relating to the underlying security for which income is distributed.
     * 
     */
    INCO,

    /**
     * Rate relating to the underlying security for which interest is paid.
     * 
     */
    INTR,

    /**
     * Rate relating to the underlying security for which other income is paid.
     * 
     */
    SOIC,

    /**
     * Rate relating to the underlying security for which tax is charged.
     * 
     */
    TXBL,

    /**
     * Rate relating to the underlying security for which tax is deferred.
     * 
     */
    TXDF,

    /**
     * Rate relating to the underlying security which is not taxable.
     * 
     */
    TXFR,

    /**
     * Rate resulting from an unfranked dividend paid by a company; the rate does not include tax credit and is subject to withholding tax.
     * 
     */
    UNFR,

    /**
     * Distribution rate relating to the part way period units, for example Group II units in UK.
     * 
     */
    PAPU,

    /**
     * Rate of income distribution originated by real estate investment.
     * 
     */
    REES;

    public String value() {
        return name();
    }

    public static NetDividendRateType7Code fromValue(String v) {
        return valueOf(v);
    }

}
