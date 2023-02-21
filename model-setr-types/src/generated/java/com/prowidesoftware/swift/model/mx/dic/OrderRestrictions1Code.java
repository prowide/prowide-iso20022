
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderRestrictions1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderRestrictions1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PROG"/&gt;
 *     &lt;enumeration value="ARBT"/&gt;
 *     &lt;enumeration value="NARB"/&gt;
 *     &lt;enumeration value="CMAR"/&gt;
 *     &lt;enumeration value="SSPE"/&gt;
 *     &lt;enumeration value="USPE"/&gt;
 *     &lt;enumeration value="FORE"/&gt;
 *     &lt;enumeration value="EXMA"/&gt;
 *     &lt;enumeration value="MALI"/&gt;
 *     &lt;enumeration value="RARB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrderRestrictions1Code")
@XmlEnum
public enum OrderRestrictions1Code {


    /**
     * Purchase or sale of a large number of stocks. Originally called program trading when index funds and other institutional
     * investors began to embark on large-scale buying and selling campaigns or programs to replicate a target stock index. The
     * term includes computer aided stock market buying or selling programs, portfolio insurance and index arbitrage.
     * 
     */
    PROG,

    /**
     * Program trade on a stock index. Simultaneous purchase and sale of an index future and the index underlying securities to
     * profit from intermarket spreads between the future and the index itself.
     * 
     */
    ARBT,

    /**
     * Simultaneous purchase and sale of a large number of securities to profit from intermarket spreads between financial
     * instruments that do not include stock indexes.
     * 
     */
    NARB,

    /**
     * Specialist or market maker registered as such on a registered stock exchange, or a market maker bidding and offering over-the-counter.
     * 
     */
    CMAR,

    /**
     * Specialist or market maker registered as such on a registered stock exchange, or a market maker acting based on a set of
     * rules applicable to a defined security.
     * 
     */
    SSPE,

    /**
     * Specialist or market maker registered as such on a registered stock exchange, or a market maker acting based on a set of
     * rules applicable to a defined underlying security of a derivative product.
     * 
     */
    USPE,

    /**
     * Non domestic business entity, foreign government or regulatory jurisdiction.
     * 
     */
    FORE,

    /**
     * Participating entity not registered on an exchange.
     * 
     */
    EXMA,

    /**
     * Participating entity linked but not registered on an exchange.
     * 
     */
    MALI,

    /**
     * Risk-free transaction consisting of purchasing an asset at one price and simultaneously selling that same asset at a higher
     * price, generating a profit on the difference.
     * 
     */
    RARB;

    public String value() {
        return name();
    }

    public static OrderRestrictions1Code fromValue(String v) {
        return valueOf(v);
    }

}
