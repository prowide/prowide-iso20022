
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialInstrumentProductType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FinancialInstrumentProductType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CEOD"/&gt;
 *     &lt;enumeration value="COPR"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="ABCP"/&gt;
 *     &lt;enumeration value="FRNT"/&gt;
 *     &lt;enumeration value="CACM"/&gt;
 *     &lt;enumeration value="DPST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FinancialInstrumentProductType1Code")
@XmlEnum
public enum FinancialInstrumentProductType1Code {


    /**
     * Certificate issued by a bank or thrift that indicates a specified sum of money deposited. The certificate has a maturity date and a specified interest rate.
     * 
     */
    CEOD,

    /**
     * Short-term, unsecured promissory note issued by a corporation. The maturity is typically less than 270 days, with a most common maturity range of 30 to 50 days or less. Commercial paper is usually issued at a discount, though some are interest-bearing.
     * 
     */
    COPR,

    /**
     * Other short term debt securities issued.
     * 
     */
    OTHR,

    /**
     * Debt instrument issued by a financial institution which has a maturity of no more than one year, is either interest-bearing or discounted and is backed by some form of collateral.
     * 
     */
    ABCP,

    /**
     * Debt instrument in which the periodic interest payments are calculated on the basis of the value (fixing of an underlying reference rate such as the Euribor) on predefined dates (fixing dates) and which has a maturity of no more tha one year.
     * 
     */
    FRNT,

    /**
     * Cash account with a notice period to withdraw money and that gives rise to interest payments or calculations at regular intervals, and daily change of the applicable rate.
     * 
     */
    CACM,

    /**
     * Unsecured interest-bearing deposit that is either redeemable at notice or has a maturity of no more than one year, that is 397 days after the settlement date, and which is either taken (borrowing) or placed (lending) by the agent.
     * 
     */
    DPST;

    public String value() {
        return name();
    }

    public static FinancialInstrumentProductType1Code fromValue(String v) {
        return valueOf(v);
    }

}
