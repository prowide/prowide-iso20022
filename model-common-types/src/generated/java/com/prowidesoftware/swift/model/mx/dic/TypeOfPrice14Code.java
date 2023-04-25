
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfPrice14Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TypeOfPrice14Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AVER"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TypeOfPrice14Code")
@XmlEnum
public enum TypeOfPrice14Code {


    /**
     * Price is an average execution price.
     * 
     */
    AVER;

    public String value() {
        return name();
    }

    public static TypeOfPrice14Code fromValue(String v) {
        return valueOf(v);
    }

}
