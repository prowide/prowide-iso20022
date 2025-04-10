
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NoCriteria1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="NoCriteria1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NOCR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "NoCriteria1Code")
@XmlEnum
public enum NoCriteria1Code {


    /**
     * No criteria.
     * 
     */
    NOCR;

    public String value() {
        return name();
    }

    public static NoCriteria1Code fromValue(String v) {
        return valueOf(v);
    }

}
