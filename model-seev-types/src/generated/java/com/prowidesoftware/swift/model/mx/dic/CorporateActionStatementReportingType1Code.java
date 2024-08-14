
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionStatementReportingType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CorporateActionStatementReportingType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MASE"/>
 *     <enumeration value="SAME"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CorporateActionStatementReportingType1Code")
@XmlEnum
public enum CorporateActionStatementReportingType1Code {


    /**
     * The reporting is for a single event and for multiple accounts.
     * 
     */
    MASE,

    /**
     * The reporting is for multiple events for a single account.
     * 
     */
    SAME;

    public String value() {
        return name();
    }

    public static CorporateActionStatementReportingType1Code fromValue(String v) {
        return valueOf(v);
    }

}
