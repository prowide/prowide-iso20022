
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MasterFundType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MasterFundType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FDER"/&gt;
 *     &lt;enumeration value="MSTR"/&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MasterFundType1Code")
@XmlEnum
public enum MasterFundType1Code {


    /**
     * Feeder fund that is investing into a master fund.
     * 
     */
    FDER,

    /**
     * Master fund that is investing in the market using funds received by its feeder funds.
     * 
     */
    MSTR,

    /**
     * Fund that is not a feeder fund or a master fund.
     * 
     */
    NONE;

    public String value() {
        return name();
    }

    public static MasterFundType1Code fromValue(String v) {
        return valueOf(v);
    }

}
