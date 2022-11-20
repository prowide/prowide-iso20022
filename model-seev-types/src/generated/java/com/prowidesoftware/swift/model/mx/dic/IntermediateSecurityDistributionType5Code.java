
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntermediateSecurityDistributionType5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IntermediateSecurityDistributionType5Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BIDS"/&gt;
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
 *     &lt;enumeration value="SPLF"/&gt;
 *     &lt;enumeration value="BONU"/&gt;
 *     &lt;enumeration value="EXOF"/&gt;
 *     &lt;enumeration value="MRGR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IntermediateSecurityDistributionType5Code")
@XmlEnum
public enum IntermediateSecurityDistributionType5Code {


    /**
     * Distribution of reverser rights.
     * 
     */
    BIDS,

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
    SOFF,

    /**
     * Also known as change in nominal value or subdivision.
     * Increase in a corporation's number of outstanding equities without any change in the shareholder's equity or the aggregate market value at the time of the split. Equity price and nominal value are reduced accordingly.
     * 
     */
    SPLF,

    /**
     * Distribution of bonus rights.
     * 
     */
    BONU,

    /**
     * Exchange of holdings for other securities and/or cash. The exchange can be either mandatory or voluntary involving the exchange of outstanding securities for different securities and/or cash. For example "exchange offer", "capital reorganisation" or "funds separation".
     * 
     */
    EXOF,

    /**
     * Exchange of outstanding securities, initiated by the issuer which may include options, as the result of two or more companies combining assets, that is, an external, third party company. Cash payments may accompany share exchange.
     * 
     */
    MRGR;

    public String value() {
        return name();
    }

    public static IntermediateSecurityDistributionType5Code fromValue(String v) {
        return valueOf(v);
    }

}
