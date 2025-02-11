
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GoodsAndServices1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="GoodsAndServices1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ELEC"/>
 *     <enumeration value="PHYS"/>
 *     <enumeration value="ELPH"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "GoodsAndServices1Code")
@XmlEnum
public enum GoodsAndServices1Code {


    /**
     * Electronic goods and services.
     * 
     */
    ELEC,

    /**
     * Physical goods or services.
     * 
     */
    PHYS,

    /**
     * Electronic and physical goods and services.
     * 
     */
    ELPH;

    public String value() {
        return name();
    }

    public static GoodsAndServices1Code fromValue(String v) {
        return valueOf(v);
    }

}
