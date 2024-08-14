
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TaxType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="STAM"/>
 *     <enumeration value="WITH"/>
 *     <enumeration value="EUTR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TaxType2Code")
@XmlEnum
public enum TaxType2Code {


    /**
     * Tax is on certain documents and transactions.
     * 
     */
    STAM,

    /**
     * Tax is on income deducted at source, which the paying agent is legally obliged to deduct from its payments of interest on deposits and other proceeds of a financial instrument.
     * 
     */
    WITH,

    /**
     * Tax withheld at source in the framework of the European Directive on taxation of savings in the form of interest payments.
     * 
     */
    EUTR;

    public String value() {
        return name();
    }

    public static TaxType2Code fromValue(String v) {
        return valueOf(v);
    }

}
