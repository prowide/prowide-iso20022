
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BlockTrade1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BlockTrade1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BLPA"/>
 *     <enumeration value="BLCH"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BlockTrade1Code")
@XmlEnum
public enum BlockTrade1Code {


    /**
     * Transaction is a block trade parent.
     * 
     */
    BLPA,

    /**
     * Transaction is a block trade child.
     * 
     */
    BLCH;

    public String value() {
        return name();
    }

    public static BlockTrade1Code fromValue(String v) {
        return valueOf(v);
    }

}
