
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CheckType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BANK"/>
 *     <enumeration value="BUSI"/>
 *     <enumeration value="GOVC"/>
 *     <enumeration value="PAYR"/>
 *     <enumeration value="PERS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CheckType1Code")
@XmlEnum
public enum CheckType1Code {


    /**
     * The check is guaranteed by a bank.
     * 
     */
    BANK,

    /**
     * The check belongs to a Company or a professional entity.
     * 
     */
    BUSI,

    /**
     * Check issued by Government.
     * 
     */
    GOVC,

    /**
     * Check issued by a company for the employees.
     * 
     */
    PAYR,

    /**
     * The check belongs to an individual.
     * 
     */
    PERS;

    public String value() {
        return name();
    }

    public static CheckType1Code fromValue(String v) {
        return valueOf(v);
    }

}
