
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CheckType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BANK"/&gt;
 *     &lt;enumeration value="BUSI"/&gt;
 *     &lt;enumeration value="GOVC"/&gt;
 *     &lt;enumeration value="PAYR"/&gt;
 *     &lt;enumeration value="PERS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
