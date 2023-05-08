
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReorganisationTransactionType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ReorganisationTransactionType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="COVA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ReorganisationTransactionType2Code")
@XmlEnum
public enum ReorganisationTransactionType2Code {


    /**
     * Reorganisation is a cover protect directly to agent transaction type.
     * 
     */
    COVA;

    public String value() {
        return name();
    }

    public static ReorganisationTransactionType2Code fromValue(String v) {
        return valueOf(v);
    }

}
