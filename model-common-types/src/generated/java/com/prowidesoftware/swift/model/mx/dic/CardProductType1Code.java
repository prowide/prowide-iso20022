
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardProductType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CardProductType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="COMM"/>
 *     <enumeration value="CONS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CardProductType1Code")
@XmlEnum
public enum CardProductType1Code {


    /**
     * Cards issued as a means of business expenditure, for instance business card or corporate card. The user could be a company, an individual for business expenses or a self employed for business purposes.
     * 
     */
    COMM,

    /**
     * Cards issued as a means of personal expenditure. The user is always an individual.
     * 
     */
    CONS;

    public String value() {
        return name();
    }

    public static CardProductType1Code fromValue(String v) {
        return valueOf(v);
    }

}
