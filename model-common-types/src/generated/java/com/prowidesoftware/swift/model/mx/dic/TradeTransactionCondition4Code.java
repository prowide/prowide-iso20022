
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeTransactionCondition4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TradeTransactionCondition4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CBNS"/>
 *     <enumeration value="XBNS"/>
 *     <enumeration value="CCPN"/>
 *     <enumeration value="XCPN"/>
 *     <enumeration value="CDIV"/>
 *     <enumeration value="XDIV"/>
 *     <enumeration value="CRTS"/>
 *     <enumeration value="XRTS"/>
 *     <enumeration value="CWAR"/>
 *     <enumeration value="XWAR"/>
 *     <enumeration value="SPCU"/>
 *     <enumeration value="SPEX"/>
 *     <enumeration value="GTDL"/>
 *     <enumeration value="BCRO"/>
 *     <enumeration value="BCRP"/>
 *     <enumeration value="BCFD"/>
 *     <enumeration value="BCBL"/>
 *     <enumeration value="BCBN"/>
 *     <enumeration value="MAPR"/>
 *     <enumeration value="NEGO"/>
 *     <enumeration value="NMPR"/>
 *     <enumeration value="BCPD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TradeTransactionCondition4Code")
@XmlEnum
public enum TradeTransactionCondition4Code {


    /**
     * Indicates whether the trade is executed cum bonus.
     * 
     */
    CBNS,

    /**
     * Indicates whether the trade is executed ex bonus.
     * 
     */
    XBNS,

    /**
     * Indicates whether the trade is executed cum coupon.
     * 
     */
    CCPN,

    /**
     * Indicates whether the trade is executed ex coupon.
     * 
     */
    XCPN,

    /**
     * Indicates whether the trade is executed cum dividend.
     * 
     */
    CDIV,

    /**
     * Indicates whether the trade is executed ex dividend.
     * 
     */
    XDIV,

    /**
     * Indicates whether the trade is executed cum rights.
     * 
     */
    CRTS,

    /**
     * Indicates whether the trade is executed ex rights.
     * 
     */
    XRTS,

    /**
     * Indicates whether the trade is executed cum warrant.
     * 
     */
    CWAR,

    /**
     * Indicates whether the trade is executed ex warrant.
     * 
     */
    XWAR,

    /**
     * Indicates whether the trade is executed with a special cum 
     * dividend, that is, buying after the ex date and getting the dividend.
     * 
     */
    SPCU,

    /**
     * Indicates whether the trade is executed with a special ex 
     * dividend, that is, selling before the ex date without the coupon.
     * 
     */
    SPEX,

    /**
     * Indicates whether the delivery of the financial instrument on settlement date 
     * is guaranteed.
     * 
     */
    GTDL,

    /**
     * Result of option when set. (UK specific).
     * 
     */
    BCRO,

    /**
     * Result of repo when set (UK specific).
     * 
     */
    BCRP,

    /**
     * Form of delivery, not for foreign registration when unset (UK specific).
     * 
     */
    BCFD,

    /**
     * Board lots, not set for odd lots (UK specific).
     * 
     */
    BCBL,

    /**
     * Bad names, not set for good names (UK specific).
     * 
     */
    BCBN,

    /**
     * Trade was executed at market price.
     * 
     */
    MAPR,

    /**
     * Trade for which the price is not the one quoted but an improved one, that is, the negotiated price.
     * 
     */
    NEGO,

    /**
     * Trade was executed outside of normal market conditions, for example, in the case of an iceberg order.
     * 
     */
    NMPR,

    /**
     * Place of delivery, in country of incorporation when unset (UK specific).
     * 
     */
    BCPD;

    public String value() {
        return name();
    }

    public static TradeTransactionCondition4Code fromValue(String v) {
        return valueOf(v);
    }

}
