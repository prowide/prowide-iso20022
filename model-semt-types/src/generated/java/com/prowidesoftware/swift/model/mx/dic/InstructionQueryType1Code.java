
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstructionQueryType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InstructionQueryType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SETT"/>
 *     <enumeration value="IPOS"/>
 *     <enumeration value="BOTH"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InstructionQueryType1Code")
@XmlEnum
public enum InstructionQueryType1Code {


    /**
     * Query is performed on settlement transactions.
     * 
     */
    SETT,

    /**
     * Query is performed on intra-position movements.
     * 
     */
    IPOS,

    /**
     * Query is performed on both settlement transactions and intra-position movements.
     * 
     */
    BOTH;

    public String value() {
        return name();
    }

    public static InstructionQueryType1Code fromValue(String v) {
        return valueOf(v);
    }

}
