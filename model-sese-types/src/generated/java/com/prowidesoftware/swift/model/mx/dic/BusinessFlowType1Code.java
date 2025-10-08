
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessFlowType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BusinessFlowType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SLDP"/&gt;
 *     &lt;enumeration value="SLRP"/&gt;
 *     &lt;enumeration value="DLPR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BusinessFlowType1Code")
@XmlEnum
public enum BusinessFlowType1Code {


    /**
     * Single leg process initiated by the delivering party.
     * 
     */
    SLDP,

    /**
     * Single leg process initiated by the receiving party.
     * 
     */
    SLRP,

    /**
     * Double leg process.
     * 
     */
    DLPR;

    public String value() {
        return name();
    }

    public static BusinessFlowType1Code fromValue(String v) {
        return valueOf(v);
    }

}
