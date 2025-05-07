
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsuranceClauses1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InsuranceClauses1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ICCA"/&gt;
 *     &lt;enumeration value="ICCB"/&gt;
 *     &lt;enumeration value="ICCC"/&gt;
 *     &lt;enumeration value="ICAI"/&gt;
 *     &lt;enumeration value="IWCC"/&gt;
 *     &lt;enumeration value="ISCC"/&gt;
 *     &lt;enumeration value="IREC"/&gt;
 *     &lt;enumeration value="ICLC"/&gt;
 *     &lt;enumeration value="ISMC"/&gt;
 *     &lt;enumeration value="CMCC"/&gt;
 *     &lt;enumeration value="IRCE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
