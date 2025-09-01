
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsolidationType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConsolidationType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GENL"/&gt;
 *     &lt;enumeration value="PART"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConsolidationType1Code")
@XmlEnum
public enum ConsolidationType1Code {


    /**
     * Consolidation is general.
     * 
     */
    GENL,

    /**
     * Consolidation is at the level of the participant.
     * 
     */
    PART;

    public String value() {
        return name();
    }

    public static ConsolidationType1Code fromValue(String v) {
        return valueOf(v);
    }

}
