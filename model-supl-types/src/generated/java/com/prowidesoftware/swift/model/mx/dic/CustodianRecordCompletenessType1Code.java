
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustodianRecordCompletenessType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustodianRecordCompletenessType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="COMP"/&gt;
 *     &lt;enumeration value="INCO"/&gt;
 *     &lt;enumeration value="CCOM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
