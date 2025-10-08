
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarginType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MarginType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADFM"/&gt;
 *     &lt;enumeration value="COMA"/&gt;
 *     &lt;enumeration value="CEMA"/&gt;
 *     &lt;enumeration value="SEMA"/&gt;
 *     &lt;enumeration value="SCMA"/&gt;
 *     &lt;enumeration value="UFMA"/&gt;
 *     &lt;enumeration value="MARM"/&gt;
 *     &lt;enumeration value="SORM"/&gt;
 *     &lt;enumeration value="WWRM"/&gt;
 *     &lt;enumeration value="BARM"/&gt;
 *     &lt;enumeration value="LIRM"/&gt;
 *     &lt;enumeration value="CRAM"/&gt;
 *     &lt;enumeration value="CVMA"/&gt;
 *     &lt;enumeration value="SPMA"/&gt;
 *     &lt;enumeration value="JTDR"/&gt;
 *     &lt;enumeration value="DRAO"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MarginType2Code")
@XmlEnum
public enum MarginType2Code {


    /**
     * Additional margin required to cover the daily risk encountered by the central counterparty before the clearing member is actually called to cover the default fund. Indeed, central counterparty calculates the margin on the default fund on a daily basis but only calls the clearing member at the end of the month.
     * 
     */
    ADFM,

    /**
     * Margin required to cover the non payment of the monthly premium (for credit derivatives).
     * 
     */
    COMA,

    /**
     * Margin required to cover the risk of any event linked to the underlying (for example the payment default by the issuer of a debt).
     * 
     */
    CEMA,

    /**
     * Margin required to cover the risk of non settlement of the underlying. Also used to cover the risk linked to the non settlement on payment platforms (for example TARGET2 vs CLS).
     * 
     */
    SEMA,

    /**
     * Margin required to cover the concentration risk linked to the default of the seller of the "protection" (for example CDS seller).
     * 
     */
    SCMA,

    /**
     * Margin required to cover the non payment of the upfront premium (for credit derivatives).
     * 
     */
    UFMA,

    /**
     * Margin called to cover potential future exposures caused by volatility in the underlying risk factors of a set of financial instruments.
     * 
     */
    MARM,

    /**
     * Margin to cover the risk of a credit event relating to a sovereign issuer.
     * 
     */
    SORM,

    /**
     * Margin called to cover additional current or potential future exposures that may arise due to a connection between the credit quality of the counterparty and the movement in a set of risk factors of a financial instruments or portfolio of financial instruments.
     * 
     */
    WWRM,

    /**
     * Margin requirement to cover the risk of a breakdown in the assumed relationship between two financial instruments or risk factors when calculating the margin requirement for a portfolio of financial instruments.
     * 
     */
    BARM,

    /**
     * Margin called to cover differences in the assumed liquidation cost of a portfolio of financial instruments when estimating potential future exposure relative. For instance, where the potential future exposure is estimated using mid-prices but fails to consider the necessity to pay a bid-ask spread, or the additional cost of liquidation that may arise when liquidating a large portfolio.
     * 
     */
    LIRM,

    /**
     * Margin called to cover an increase in the probability of default by a counterparty in relation to an OTC derivative or cleared transaction. The calculation of such margin is typically independent of any changes in current or potential future exposure.
     * 
     */
    CRAM,

    /**
     * Margin called, by a central counterparty, to cover current exposures for a portfolio of financial instruments where collateral called against such current exposures is held by the central counterparty and returned to the poster of such collateral at the delivery of the financial instrument.
     * 
     */
    CVMA,

    /**
     * Margin to cover risks relating to a sponsored clearing member. That is were a third party carries out a number of obligations under the rulebook of the central counterparty on behalf of a clearing member but doing so creates additional risks for the central counterparty with respect to the clearing member.
     * 
     */
    SPMA,

    /**
     * Margin called to cover a potential increase in current exposure due to the revaluation of a financial instrument, where such revaluation is caused by a sharp discontinuous increase in the probability of default of the financial instrument or major risk factor of such financial instrument.
     * 
     */
    JTDR,

    /**
     * Margin set called at the discretion of the caller.
     * 
     */
    DRAO,

    /**
     * Margin not categorised by any other margin type code.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static MarginType2Code fromValue(String v) {
        return valueOf(v);
    }

}
