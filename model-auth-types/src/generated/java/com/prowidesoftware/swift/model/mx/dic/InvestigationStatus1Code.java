
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestigationStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InvestigationStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FOUN"/>
 *     <enumeration value="NFOU"/>
 *     <enumeration value="NOAP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InvestigationStatus1Code")
@XmlEnum
public enum InvestigationStatus1Code {


    /**
     * Search for requested data is complete, the data has been found and will be sent using a separate message flow.
     * 
     */
    FOUN,

    /**
     * Search for requested data is complete, data not found.
     * 
     */
    NFOU,

    /**
     * Search for requested data not complete yet.
     * 
     */
    NOAP;

    public String value() {
        return name();
    }

    public static InvestigationStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
