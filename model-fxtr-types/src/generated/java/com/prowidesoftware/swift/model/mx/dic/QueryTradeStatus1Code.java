
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryTradeStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="QueryTradeStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="QAST"/>
 *     <enumeration value="QCTR"/>
 *     <enumeration value="QCIR"/>
 *     <enumeration value="QETR"/>
 *     <enumeration value="QNTR"/>
 *     <enumeration value="QRTR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "QueryTradeStatus1Code")
@XmlEnum
public enum QueryTradeStatus1Code {


    /**
     * Query for all trades.
     * 
     */
    QAST,

    /**
     * Query for trades have been canceled.
     * 
     */
    QCTR,

    /**
     * Query for cancelling trades.
     * 
     */
    QCIR,

    /**
     * Query for emergency trades.
     * 
     */
    QETR,

    /**
     * Query for new trades.
     * 
     */
    QNTR,

    /**
     * Query for trades have been replaced.
     * 
     */
    QRTR;

    public String value() {
        return name();
    }

    public static QueryTradeStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
