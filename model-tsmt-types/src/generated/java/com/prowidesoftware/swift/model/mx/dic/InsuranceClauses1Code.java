
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsuranceClauses1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InsuranceClauses1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ICCA"/>
 *     <enumeration value="ICCB"/>
 *     <enumeration value="ICCC"/>
 *     <enumeration value="ICAI"/>
 *     <enumeration value="IWCC"/>
 *     <enumeration value="ISCC"/>
 *     <enumeration value="IREC"/>
 *     <enumeration value="ICLC"/>
 *     <enumeration value="ISMC"/>
 *     <enumeration value="CMCC"/>
 *     <enumeration value="IRCE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InsuranceClauses1Code")
@XmlEnum
public enum InsuranceClauses1Code {


    /**
     * Institute Cargo Clause A (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters).
     * 
     */
    ICCA,

    /**
     * Institute Cargo Clause B (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters).
     * 
     */
    ICCB,

    /**
     * Institute Cargo Clause C (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters).
     * 
     */
    ICCC,

    /**
     * Institute Cargo Clause for Air (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters).
     * 
     */
    ICAI,

    /**
     * Institute War Clause for Cargo (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters).
     * 
     */
    IWCC,

    /**
     * Institute Strikes Clause for Cargo (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters).
     * 
     */
    ISCC,

    /**
     * Institute Replacement Clause (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters).
     * 
     */
    IREC,

    /**
     * Institute Classification Clause (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters).
     * 
     */
    ICLC,

    /**
     * ISM Code Endorsement (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters).
     * 
     */
    ISMC,

    /**
     * Computer Millenium Clause Cargo (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters).
     * 
     */
    CMCC,

    /**
     * Institute Radioactive Contamination Exclusion Clause (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters).
     * 
     */
    IRCE;

    public String value() {
        return name();
    }

    public static InsuranceClauses1Code fromValue(String v) {
        return valueOf(v);
    }

}
