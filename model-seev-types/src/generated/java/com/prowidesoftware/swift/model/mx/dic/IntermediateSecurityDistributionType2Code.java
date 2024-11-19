
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntermediateSecurityDistributionType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="IntermediateSecurityDistributionType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BIDS"/>
 *     <enumeration value="BONU"/>
 *     <enumeration value="DRIP"/>
 *     <enumeration value="DVOP"/>
 *     <enumeration value="EXRI"/>
 *     <enumeration value="PRIO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "IntermediateSecurityDistributionType2Code")
@XmlEnum
public enum IntermediateSecurityDistributionType2Code {


    /**
     * Distribution of reverser rights.
     * 
     */
    BIDS,

    /**
     * Distribution of bonus rights.
     * 
     */
    BONU,

    /**
     * Distribution of dividend reinvestment securities.
     * 
     */
    DRIP,

    /**
     * Distribution of dividend option.
     * 
     */
    DVOP,

    /**
     * Distribution of subscription rights.
     * 
     */
    EXRI,

    /**
     * Distribution of open offer rights.
     * 
     */
    PRIO;

    public String value() {
        return name();
    }

    public static IntermediateSecurityDistributionType2Code fromValue(String v) {
        return valueOf(v);
    }

}
