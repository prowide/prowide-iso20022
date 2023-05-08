
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetDividendRateType5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="NetDividendRateType5Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CAPO"/>
 *     <enumeration value="FLFR"/>
 *     <enumeration value="INCO"/>
 *     <enumeration value="INTR"/>
 *     <enumeration value="SOIC"/>
 *     <enumeration value="TXBL"/>
 *     <enumeration value="TXDF"/>
 *     <enumeration value="TXFR"/>
 *     <enumeration value="UNFR"/>
 *     <enumeration value="FUPU"/>
 *     <enumeration value="PAPU"/>
 *     <enumeration value="REES"/>
 *     <enumeration value="CDFI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "NetDividendRateType5Code")
@XmlEnum
public enum NetDividendRateType5Code {


    /**
     * Rate relating to the underlying security for which capital is distributed.
     * 
     */
    CAPO,

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
     * Distribution rate relating to the full period units, for example Group I units in UK.
     * 
     */
    FUPU,

    /**
     * Distribution rate relating to the part way period units, for example Group II units in UK.
     * 
     */
    PAPU,

    /**
     * Rate of income distribution originated by real estate investment.
     * 
     */
    REES,

    /**
     * Rate relating to a conduit foreign income type.
     * 
     */
    CDFI;

    public String value() {
        return name();
    }

    public static NetDividendRateType5Code fromValue(String v) {
        return valueOf(v);
    }

}
