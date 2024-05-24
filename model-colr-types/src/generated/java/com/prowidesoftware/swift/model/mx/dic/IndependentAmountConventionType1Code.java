
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndependentAmountConventionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="IndependentAmountConventionType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NBTR"/>
 *     <enumeration value="NATR"/>
 *     <enumeration value="SEGR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "IndependentAmountConventionType1Code")
@XmlEnum
public enum IndependentAmountConventionType1Code {


    /**
     * Independent amount is an add on to exposure.
     * 
     */
    NBTR,

    /**
     * Independent amount is an add on to the credit support amount and forms part of the variation margin requirement.
     * 
     */
    NATR,

    /**
     * Independent amount is treated independently of variation margin for segregation purposes.
     * 
     */
    SEGR;

    public String value() {
        return name();
    }

    public static IndependentAmountConventionType1Code fromValue(String v) {
        return valueOf(v);
    }

}
