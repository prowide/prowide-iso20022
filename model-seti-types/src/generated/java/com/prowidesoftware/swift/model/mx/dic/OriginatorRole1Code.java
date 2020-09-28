
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OriginatorRole1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OriginatorRole1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SINT"/&gt;
 *     &lt;enumeration value="MLTF"/&gt;
 *     &lt;enumeration value="RMKT"/&gt;
 *     &lt;enumeration value="MKTM"/&gt;
 *     &lt;enumeration value="INVE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OriginatorRole1Code")
@XmlEnum
public enum OriginatorRole1Code {


    /**
     * Firms which, on an organised, frequent and systematic basis deal on their own account by executing client orders outside a regulated market or a Multilateral Trading Facility. SI's will have the obligation to provide, and make public, a definite bid and offer quote for liquid securities. They act as "mini"exchanges.
     * 
     */
    SINT,

    /**
     * Multilateral system which brings together multiple third-party buying and selling interests in financial instruments in a way that results in a contract.
     * 
     */
    MLTF,

    /**
     * Market on which financial instruments can be traded according to rules defined by the stock exchange.
     * 
     */
    RMKT,

    /**
     * Dealer or specialist that is trading for their own account in the OTC market. Market makers are expected to maintain an orderly market by being available to buy or sell.
     * 
     */
    MKTM,

    /**
     * Party, either an individual or organisation, whose assets are being invested.
     * 
     */
    INVE;

    public String value() {
        return name();
    }

    public static OriginatorRole1Code fromValue(String v) {
        return valueOf(v);
    }

}
