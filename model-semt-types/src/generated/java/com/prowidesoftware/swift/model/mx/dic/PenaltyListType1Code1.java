
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PenaltyListType1Code__1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PenaltyListType1Code__1">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FWAM"/>
 *     <enumeration value="FWIS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PenaltyListType1Code__1")
@XmlEnum
public enum PenaltyListType1Code1 {


    /**
     * To report a penalty list that has been amended (that is the penalty list contains only updated and/or removed penalties that have already been previously reported in a FWIS Penalty List).
     * 
     */
    FWAM,

    /**
     * To report a daily penalty list created for the first time (that is the penalty list contains only newly computed penalties)
     * 
     */
    FWIS;

    public String value() {
        return name();
    }

    public static PenaltyListType1Code1 fromValue(String v) {
        return valueOf(v);
    }

}
