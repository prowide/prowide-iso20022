
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionEventProcessingType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CorporateActionEventProcessingType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="GENL"/>
 *     <enumeration value="DISN"/>
 *     <enumeration value="REOR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CorporateActionEventProcessingType1Code")
@XmlEnum
public enum CorporateActionEventProcessingType1Code {


    /**
     * No debit or credit of resources.
     * 
     */
    GENL,

    /**
     * Holder of the relevant security on a certain date, for example, the record date, will receive a benefit without giving up the underlying security.
     * 
     */
    DISN,

    /**
     * Underlying security will be debited and may be replaced by another resource (or resources).
     * 
     */
    REOR;

    public String value() {
        return name();
    }

    public static CorporateActionEventProcessingType1Code fromValue(String v) {
        return valueOf(v);
    }

}
