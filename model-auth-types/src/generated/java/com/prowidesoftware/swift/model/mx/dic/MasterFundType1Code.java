
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MasterFundType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MasterFundType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FDER"/>
 *     <enumeration value="MSTR"/>
 *     <enumeration value="NONE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
