
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason40Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectionReason40Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SETS"/>
 *     <enumeration value="DDAT"/>
 *     <enumeration value="CASY"/>
 *     <enumeration value="DDEA"/>
 *     <enumeration value="DEPT"/>
 *     <enumeration value="DMON"/>
 *     <enumeration value="DQUA"/>
 *     <enumeration value="DSEC"/>
 *     <enumeration value="DTRD"/>
 *     <enumeration value="ICAG"/>
 *     <enumeration value="ICUS"/>
 *     <enumeration value="IEXE"/>
 *     <enumeration value="NARR"/>
 *     <enumeration value="NCRR"/>
 *     <enumeration value="PLCE"/>
 *     <enumeration value="RTGS"/>
 *     <enumeration value="SETR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RejectionReason40Code")
@XmlEnum
public enum RejectionReason40Code {


    /**
     * Unrecognised or invalid settlement system/method instructed.
     * 
     */
    SETS,

    /**
     * Unrecognised or invalid settlement date.
     * 
     */
    DDAT,

    /**
     * Impossible standing arrangements override instruction for the cash settlement system.
     * 
     */
    CASY,

    /**
     * Unrecognised or invalid deal price.
     * 
     */
    DDEA,

    /**
     * Unrecognised or invalid depository.
     * 
     */
    DEPT,

    /**
     * Unrecognised or invalid settlement amount.
     * 
     */
    DMON,

    /**
     * Unrecognised or invalid instructed quantity.
     * 
     */
    DQUA,

    /**
     * Unrecognised or invalid financial instrument identification.
     * 
     */
    DSEC,

    /**
     * Unrecognised or invalid trade date or requested trade date or future trade date.
     * 
     */
    DTRD,

    /**
     * Unrecognised or invalid participant of delivering or receiving depository.
     * 
     */
    ICAG,

    /**
     * Unrecognised or invalid client of delivering or receiving party 1.
     * 
     */
    ICUS,

    /**
     * Unrecognised or invalid client of delivering or receiving party 2.
     * 
     */
    IEXE,

    /**
     * See narrative field for reason.
     * 
     */
    NARR,

    /**
     * Unrecognised or invalid settlement amount currency.
     * 
     */
    NCRR,

    /**
     * Unrecognised or invalid place of trade.
     * 
     */
    PLCE,

    /**
     * Not possible to use the RTGS system instructed (NRTG or YRTG).
     * 
     */
    RTGS,

    /**
     * Unrecognised or invalid settlement transaction type.
     * 
     */
    SETR;

    public String value() {
        return name();
    }

    public static RejectionReason40Code fromValue(String v) {
        return valueOf(v);
    }

}
