
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradingFloorOrderHandling1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TradingFloorOrderHandling1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ATPR"/&gt;
 *     &lt;enumeration value="ATPU"/&gt;
 *     &lt;enumeration value="MANU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TradingFloorOrderHandling1Code")
@XmlEnum
public enum TradingFloorOrderHandling1Code {


    /**
     * Indicates that the order should be executed automatically, private initiative, no broker intervention. Its sales trading desk will not be informed of the order and trade.
     * 
     */
    ATPR,

    /**
     * Indicates that the order should be executed automatically, public initiative, broker intervention allowed.
     * 
     */
    ATPU,

    /**
     * Manual order, best execution.
     * 
     */
    MANU;

    public String value() {
        return name();
    }

    public static TradingFloorOrderHandling1Code fromValue(String v) {
        return valueOf(v);
    }

}
