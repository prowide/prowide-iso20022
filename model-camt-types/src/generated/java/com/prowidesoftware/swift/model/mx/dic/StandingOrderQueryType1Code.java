
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandingOrderQueryType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StandingOrderQueryType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SLST"/&gt;
 *     &lt;enumeration value="SDTL"/&gt;
 *     &lt;enumeration value="TAPS"/&gt;
 *     &lt;enumeration value="SLSL"/&gt;
 *     &lt;enumeration value="SWLS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StandingOrderQueryType1Code")
@XmlEnum
public enum StandingOrderQueryType1Code {


    /**
     * Used to query the list of liquidity transfer standing orders defined in the system.
     * 
     */
    SLST,

    /**
     * Used to query a specific liquidity transfer standing order based on a set of search criteria.
     * 
     */
    SDTL,

    /**
     * Used to query the total amounts of predefined and user defined liquidity transfer standing orders for both defined and not yet executed orders.
     * 
     */
    TAPS,

    /**
     * Used to query the list of liquidity transfer standing orders defined in a specific link set of sequenced standing orders. The link set is a collection of standing order defined in a specific sequence.
     * 
     */
    SLSL,

    /**
     * Used to query a specific standing order within a link set of sequenced liquidity transfer standing orders. The link set is a collection of standing order defined in a specific sequence.
     * 
     */
    SWLS;

    public String value() {
        return name();
    }

    public static StandingOrderQueryType1Code fromValue(String v) {
        return valueOf(v);
    }

}
