
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SourceOfCash1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SourceOfCash1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ALMY"/&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *     &lt;enumeration value="COMP"/&gt;
 *     &lt;enumeration value="EMIN"/&gt;
 *     &lt;enumeration value="GIFT"/&gt;
 *     &lt;enumeration value="INHE"/&gt;
 *     &lt;enumeration value="INLQ"/&gt;
 *     &lt;enumeration value="REST"/&gt;
 *     &lt;enumeration value="REDM"/&gt;
 *     &lt;enumeration value="REPY"/&gt;
 *     &lt;enumeration value="SEAQ"/&gt;
 *     &lt;enumeration value="SALE"/&gt;
 *     &lt;enumeration value="SVGS"/&gt;
 *     &lt;enumeration value="SELF"/&gt;
 *     &lt;enumeration value="WINS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SourceOfCash1Code")
@XmlEnum
public enum SourceOfCash1Code {


    /**
     * Income as a result of alimony.
     * 
     */
    ALMY,

    /**
     * Income is cash proceeds from customers.
     * 
     */
    CASH,

    /**
     * Income is from compensation received.
     * 
     */
    COMP,

    /**
     * Employee income.
     * 
     */
    EMIN,

    /**
     * Income was a cash gift.
     * 
     */
    GIFT,

    /**
     * Cash from an inheritance.
     * 
     */
    INHE,

    /**
     * Income from the liquidation of an insurance premium.
     * 
     */
    INLQ,

    /**
     * Income from the sale of real estate.
     * 
     */
    REST,

    /**
     * Redemption of an investment fund.
     * 
     */
    REDM,

    /**
     * Income from a retirement policy.
     * 
     */
    REPY,

    /**
     * Sale and acquisition of a corporation.
     * 
     */
    SEAQ,

    /**
     * Sale of goods.
     * 
     */
    SALE,

    /**
     * Income from a savings plan.
     * 
     */
    SVGS,

    /**
     * Income from self-employment.
     * 
     */
    SELF,

    /**
     * Income from a cash win.
     * 
     */
    WINS;

    public String value() {
        return name();
    }

    public static SourceOfCash1Code fromValue(String v) {
        return valueOf(v);
    }

}
