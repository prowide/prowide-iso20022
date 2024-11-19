
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FutureAndOptionContractType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FutureAndOptionContractType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ORDY"/>
 *     <enumeration value="INDX"/>
 *     <enumeration value="EXFU"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
