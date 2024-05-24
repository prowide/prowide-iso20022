
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustodianRecordAgreementType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CustodianRecordAgreementType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AGRE"/>
 *     <enumeration value="DAGR"/>
 *     <enumeration value="NCOP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CustodianRecordAgreementType1Code")
@XmlEnum
public enum CustodianRecordAgreementType1Code {


    /**
     * Custodian record agrees with the composite record.
     * 
     */
    AGRE,

    /**
     * Custodian record disagrees with the composite record.
     * 
     */
    DAGR,

    /**
     * No composite record available.
     * 
     */
    NCOP;

    public String value() {
        return name();
    }

    public static CustodianRecordAgreementType1Code fromValue(String v) {
        return valueOf(v);
    }

}
