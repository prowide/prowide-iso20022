
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PowerOfAttorneyLegalisation1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PowerOfAttorneyLegalisation1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NOTA"/>
 *     <enumeration value="LOCA"/>
 *     <enumeration value="APOS"/>
 *     <enumeration value="COUN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PowerOfAttorneyLegalisation1Code")
@XmlEnum
public enum PowerOfAttorneyLegalisation1Code {


    /**
     * Indicates that the power of attorney must be legalised by a notary.
     * 
     */
    NOTA,

    /**
     * Indicates that the power of attorney must be legalised by a local authority.
     * 
     */
    LOCA,

    /**
     * Indicates that the power of attorney must be legalised by a legal officer.
     * 
     */
    APOS,

    /**
     * Indicates that the power of attorney must be legalised by a consular officer.
     * 
     */
    COUN;

    public String value() {
        return name();
    }

    public static PowerOfAttorneyLegalisation1Code fromValue(String v) {
        return valueOf(v);
    }

}
