
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustodianRecordCompletenessType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CustodianRecordCompletenessType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="COMP"/>
 *     <enumeration value="INCO"/>
 *     <enumeration value="CCOM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CustodianRecordCompletenessType1Code")
@XmlEnum
public enum CustodianRecordCompletenessType1Code {


    /**
     * Custodian record is complete.
     * 
     */
    COMP,

    /**
     * Custodian record is incomplete.
     * 
     */
    INCO,

    /**
     * Custodian record is conditionally complete.
     * 
     */
    CCOM;

    public String value() {
        return name();
    }

    public static CustodianRecordCompletenessType1Code fromValue(String v) {
        return valueOf(v);
    }

}
