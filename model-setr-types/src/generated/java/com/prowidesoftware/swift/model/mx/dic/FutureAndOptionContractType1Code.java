
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FutureAndOptionContractType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FutureAndOptionContractType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ORDY"/&gt;
 *     &lt;enumeration value="INDX"/&gt;
 *     &lt;enumeration value="EXFU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FutureAndOptionContractType1Code")
@XmlEnum
public enum FutureAndOptionContractType1Code {


    /**
     * Ordinary future and option contract.
     * 
     */
    ORDY,

    /**
     * Future and option contract on an index as opposed to an underlying equity.
     * 
     */
    INDX,

    /**
     * Receipt of future contract when an option on a future is exercised.
     * 
     */
    EXFU;

    public String value() {
        return name();
    }

    public static FutureAndOptionContractType1Code fromValue(String v) {
        return valueOf(v);
    }

}
