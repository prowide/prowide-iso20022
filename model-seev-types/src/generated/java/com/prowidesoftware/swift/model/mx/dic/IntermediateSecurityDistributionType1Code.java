
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntermediateSecurityDistributionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IntermediateSecurityDistributionType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BIDS"/&gt;
 *     &lt;enumeration value="BONU"/&gt;
 *     &lt;enumeration value="DRIP"/&gt;
 *     &lt;enumeration value="DVCA"/&gt;
 *     &lt;enumeration value="DVOP"/&gt;
 *     &lt;enumeration value="EXRI"/&gt;
 *     &lt;enumeration value="PRIO"/&gt;
 *     &lt;enumeration value="DVSC"/&gt;
 *     &lt;enumeration value="DVSE"/&gt;
 *     &lt;enumeration value="INTR"/&gt;
 *     &lt;enumeration value="LIQU"/&gt;
 *     &lt;enumeration value="SOFF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IntermediateSecurityDistributionType1Code")
@XmlEnum
public enum IntermediateSecurityDistributionType1Code {


    /**
     * Distribution of reverser rights.
     * 
     */
    BIDS,

    /**
     * Distribution of bonus rights.
     * 
     */
    BONU,

    /**
     * Distribution of dividend reinvestment securities.
     * 
     */
    DRIP,

    /**
     * Distribution of cash to shareholders, in proportion to their equity holding. Ordinary dividends are recurring and regular. Shareholder must take cash and may be offered a choice of currency.
     * 
     */
    DVCA,

    /**
     * Distribution of dividend option.
     * 
     */
    DVOP,

    /**
     * Distribution of subscription rights.
     * 
     */
    EXRI,

    /**
     * Distribution of open offer rights.
     * 
     */
    PRIO,

    /**
     * Dividend or interest paid in the form of scrip.
     * 
     */
    DVSC,

    /**
     * Dividend paid to shareholders in the form of shares of stock.
     * 
     */
    DVSE,

    /**
     * Interest payment distributed to holders of an interest bearing asset.
     * 
     */
    INTR,

    /**
     * A distribution of cash, assets or both.
     * 
     */
    LIQU,

    /**
     * A distribution of subsidiary stock to the shareholders.
     * 
     */
    SOFF;

    public String value() {
        return name();
    }

    public static IntermediateSecurityDistributionType1Code fromValue(String v) {
        return valueOf(v);
    }

}
