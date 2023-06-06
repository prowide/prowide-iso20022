
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfAmount21Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TypeOfAmount21Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="INTC"/>
 *     <enumeration value="FEEP"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="FEEA"/>
 *     <enumeration value="CSIF"/>
 *     <enumeration value="MXIF"/>
 *     <enumeration value="MNIF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TypeOfAmount21Code")
@XmlEnum
public enum TypeOfAmount21Code {


    /**
     * Interchange fee.
     * 
     */
    INTC,

    /**
     * Processing fees.
     * 
     */
    FEEP,

    /**
     * Other type of amount defined at national level.
     * 
     */
    OTHN,

    /**
     * Other type of amount defined at private level.
     * 
     */
    OTHP,

    /**
     * International service assessment fees.
     * 
     */
    FEEA,

    /**
     * Interchange fee applicable to cash back amount.
     * 
     */
    CSIF,

    /**
     * Maximum applicable interchange fee.
     * 
     */
    MXIF,

    /**
     * Minimum interchange fee applicable.
     * 
     */
    MNIF;

    public String value() {
        return name();
    }

    public static TypeOfAmount21Code fromValue(String v) {
        return valueOf(v);
    }

}
