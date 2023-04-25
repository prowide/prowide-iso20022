
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AllocationIndicator1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AllocationIndicator1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="POST"/>
 *     <enumeration value="PREA"/>
 *     <enumeration value="UNAL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AllocationIndicator1Code")
@XmlEnum
public enum AllocationIndicator1Code {


    /**
     * Trade is a post-allocation trade.
     * 
     */
    POST,

    /**
     * Trade is a pre-allocation trade.
     * 
     */
    PREA,

    /**
     * Trade is unallocated.
     * 
     */
    UNAL;

    public String value() {
        return name();
    }

    public static AllocationIndicator1Code fromValue(String v) {
        return valueOf(v);
    }

}
