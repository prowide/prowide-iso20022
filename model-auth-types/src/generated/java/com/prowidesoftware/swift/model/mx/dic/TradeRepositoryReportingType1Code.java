
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeRepositoryReportingType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TradeRepositoryReportingType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SWOS"/&gt;
 *     &lt;enumeration value="TWOS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
