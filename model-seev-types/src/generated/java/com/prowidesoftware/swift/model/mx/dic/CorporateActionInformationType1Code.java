
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionInformationType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CorporateActionInformationType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CONF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CorporateActionInformationType1Code")
@XmlEnum
public enum CorporateActionInformationType1Code {


    /**
     * Information is about an informal call when an issuer, trustee, agent wishes to talk to note holders to discuss a certain issue or potential change to the notes; nothing said being binding.
     * 
     */
    CONF;

    public String value() {
        return name();
    }

    public static CorporateActionInformationType1Code fromValue(String v) {
        return valueOf(v);
    }

}
