
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeRepositoryReportingType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TradeRepositoryReportingType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SWOS"/>
 *     <enumeration value="TWOS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TradeRepositoryReportingType1Code")
@XmlEnum
public enum TradeRepositoryReportingType1Code {


    /**
     * Only one counterparty to the transaction has reported to the same trade repository.
     * 
     */
    SWOS,

    /**
     *  Both counterparties to the transaction have reported to the same trade repository.
     * 
     */
    TWOS;

    public String value() {
        return name();
    }

    public static TradeRepositoryReportingType1Code fromValue(String v) {
        return valueOf(v);
    }

}
