
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AllocationIndicator1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AllocationIndicator1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="POST"/&gt;
 *     &lt;enumeration value="PREA"/&gt;
 *     &lt;enumeration value="UNAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
