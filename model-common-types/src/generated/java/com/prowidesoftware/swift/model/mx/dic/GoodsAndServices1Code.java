
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GoodsAndServices1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GoodsAndServices1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ELEC"/&gt;
 *     &lt;enumeration value="PHYS"/&gt;
 *     &lt;enumeration value="ELPH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
