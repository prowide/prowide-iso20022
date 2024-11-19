
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Reconciliation3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Reconciliation3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DPRW"/&gt;
 *     &lt;enumeration value="DPRV"/&gt;
 *     &lt;enumeration value="DSMA"/&gt;
 *     &lt;enumeration value="DSNM"/&gt;
 *     &lt;enumeration value="NORE"/&gt;
 *     &lt;enumeration value="SSMA"/&gt;
 *     &lt;enumeration value="SSPA"/&gt;
 *     &lt;enumeration value="SPRW"/&gt;
 *     &lt;enumeration value="SPRV"/&gt;
 *     &lt;enumeration value="SSUN"/&gt;
 *     &lt;enumeration value="SSNE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Reconciliation3Code")
@XmlEnum
public enum Reconciliation3Code {


    /**
     * Trade repository has both sides of the trade reported but fields are not valuation reconciled.
     * 
     */
    DPRW,

    /**
     * Trade repository has both sides of the trade reported but fields are valuation reconciled only.
     * 
     */
    DPRV,

    /**
     * Trade repository has both sides of the trade reported and all fields match.
     * 
     */
    DSMA,

    /**
     * Trade repository has both sides of the trade reported but not all fields match.
     * 
     */
    DSNM,

    /**
     * Trade was not required to be submitted for reconciliation.
     * 
     */
    NORE,

    /**
     * Trade repository has one side of the trade, knows which trade repository holds the other side of the trade, has already performed the comparison of the reports, and the result has been successful according to the specification of the inter-TR reconciliation process.
     * 
     */
    SSMA,

    /**
     * Trade repository has one side of the trade, knows which trade repository holds the other side of the trade, and either has already performed comparison of the reports, or is in the process of doing so.
     * 
     */
    SSPA,

    /**
     * Trade repository has one side of the trade, knows which trade repository holds the other side of the trade, has already performed the comparison of the reports, but fields are not valuation reconciled.
     * 
     */
    SPRW,

    /**
     * Trade repository has one side of the trade, knows which trade repository holds the other side of the trade, has already performed the comparison of the reports, but fields are valuation reconciled only.
     * 
     */
    SPRV,

    /**
     * Trade repository has one side of the trade, knows that the other side is EEA counterparty and does not know which TR holds the other side of the trade.
     * 
     */
    SSUN,

    /**
     * Trade repository has one side of the trade and knows that the other side does not have a reporting obligation.
     * 
     */
    SSNE;

    public String value() {
        return name();
    }

    public static Reconciliation3Code fromValue(String v) {
        return valueOf(v);
    }

}
