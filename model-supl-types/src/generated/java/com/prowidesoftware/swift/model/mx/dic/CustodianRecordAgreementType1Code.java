
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustodianRecordAgreementType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustodianRecordAgreementType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AGRE"/&gt;
 *     &lt;enumeration value="DAGR"/&gt;
 *     &lt;enumeration value="NCOP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
