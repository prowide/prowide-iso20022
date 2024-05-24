
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionStatementType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CorporateActionStatementType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MISS"/>
 *     <enumeration value="ALLL"/>
 *     <enumeration value="BALO"/>
 *     <enumeration value="BALI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CorporateActionStatementType2Code")
@XmlEnum
public enum CorporateActionStatementType2Code {


    /**
     * Statement contains missing instructions.
     * 
     */
    MISS,

    /**
     * Statement contains all instructions.
     * 
     */
    ALLL,

    /**
     * Balance information with no instruction details provided.
     * 
     */
    BALO,

    /**
     * Balance information with instruction details.
     * 
     */
    BALI;

    public String value() {
        return name();
    }

    public static CorporateActionStatementType2Code fromValue(String v) {
        return valueOf(v);
    }

}
