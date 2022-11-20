
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryTradeStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QueryTradeStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="QAST"/&gt;
 *     &lt;enumeration value="QCTR"/&gt;
 *     &lt;enumeration value="QCIR"/&gt;
 *     &lt;enumeration value="QETR"/&gt;
 *     &lt;enumeration value="QNTR"/&gt;
 *     &lt;enumeration value="QRTR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
