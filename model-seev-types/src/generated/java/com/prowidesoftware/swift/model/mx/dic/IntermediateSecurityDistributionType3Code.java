
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntermediateSecurityDistributionType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="IntermediateSecurityDistributionType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BIDS"/>
 *     <enumeration value="BONU"/>
 *     <enumeration value="DRIP"/>
 *     <enumeration value="DVCA"/>
 *     <enumeration value="DVOP"/>
 *     <enumeration value="EXRI"/>
 *     <enumeration value="PRIO"/>
 *     <enumeration value="DVSC"/>
 *     <enumeration value="DVSE"/>
 *     <enumeration value="INTR"/>
 *     <enumeration value="LIQU"/>
 *     <enumeration value="SOFF"/>
 *     <enumeration value="SPLF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "IntermediateSecurityDistributionType3Code")
@XmlEnum
public enum IntermediateSecurityDistributionType3Code {


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
    SOFF,

    /**
     * Also known as change in nominal value or subdivision.
     * Increase in a corporation's number of outstanding equities without any change in the shareholder's equity or the aggregate market value at the time of the split. Equity price and nominal value are reduced accordingly.
     * 
     */
    SPLF;

    public String value() {
        return name();
    }

    public static IntermediateSecurityDistributionType3Code fromValue(String v) {
        return valueOf(v);
    }

}
