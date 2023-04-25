
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashMarginOrder1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CashMarginOrder1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CASH"/>
 *     <enumeration value="MRGO"/>
 *     <enumeration value="MRGC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CashMarginOrder1Code")
@XmlEnum
public enum CashMarginOrder1Code {


    /**
     * The principal owns the cash in case of a purchase, or the securities in case of a sale so the execution, if it occurs, will not generate any margin account opening or margin call.
     * 
     */
    CASH,

    /**
     * The principal order, if executed, will generate a margin account opening or margin call because the principal does not have the cash in case of a purchase or the securities in case of a sale.
     * 
     */
    MRGO,

    /**
     * The principal order, if executed, will enable the margin position to be closed and the positions to be covered (for example: purchase of securities that have previously been short-sold, or sale of securities that have been bought on margin).
     * 
     */
    MRGC;

    public String value() {
        return name();
    }

    public static CashMarginOrder1Code fromValue(String v) {
        return valueOf(v);
    }

}
