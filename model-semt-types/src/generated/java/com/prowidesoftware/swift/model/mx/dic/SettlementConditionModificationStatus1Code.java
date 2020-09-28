
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementConditionModificationStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SettlementConditionModificationStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PACK"/&gt;
 *     &lt;enumeration value="REJT"/&gt;
 *     &lt;enumeration value="MODP"/&gt;
 *     &lt;enumeration value="DEND"/&gt;
 *     &lt;enumeration value="MODC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SettlementConditionModificationStatus1Code")
@XmlEnum
public enum SettlementConditionModificationStatus1Code {


    /**
     * Instruction has been acknowledged/accepted by the account servicer.
     * 
     */
    PACK,

    /**
     * Instruction has been rejected for further processing.
     * 
     */
    REJT,

    /**
     * Modification is pending. At this time, it is unknown whether the modification can be affected.
     * 
     */
    MODP,

    /**
     * Modification Request will not be executed.
     * 
     */
    DEND,

    /**
     * Modification has been completed.
     * 
     */
    MODC;

    public String value() {
        return name();
    }

    public static SettlementConditionModificationStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
