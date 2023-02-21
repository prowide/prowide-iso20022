
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportSortedType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportSortedType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="COUN"/&gt;
 *     &lt;enumeration value="PART"/&gt;
 *     &lt;enumeration value="CURR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReportSortedType1Code")
@XmlEnum
public enum ReportSortedType1Code {


    /**
     * Type of criterion is a nation.
     * 
     */
    COUN,

    /**
     * Type of criterion is an entity, eg, a financial institution.
     * 
     */
    PART,

    /**
     * Type of criterion is a currency, eg, the euro.
     * 
     */
    CURR;

    public String value() {
        return name();
    }

    public static ReportSortedType1Code fromValue(String v) {
        return valueOf(v);
    }

}
