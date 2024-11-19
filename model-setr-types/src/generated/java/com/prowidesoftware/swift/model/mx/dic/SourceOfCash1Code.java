
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SourceOfCash1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SourceOfCash1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ALMY"/>
 *     <enumeration value="CASH"/>
 *     <enumeration value="COMP"/>
 *     <enumeration value="EMIN"/>
 *     <enumeration value="GIFT"/>
 *     <enumeration value="INHE"/>
 *     <enumeration value="INLQ"/>
 *     <enumeration value="REST"/>
 *     <enumeration value="REDM"/>
 *     <enumeration value="REPY"/>
 *     <enumeration value="SEAQ"/>
 *     <enumeration value="SALE"/>
 *     <enumeration value="SVGS"/>
 *     <enumeration value="SELF"/>
 *     <enumeration value="WINS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
