
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionStatementType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CorporateActionStatementType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MISS"/>
 *     <enumeration value="ALLL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CorporateActionStatementType1Code")
@XmlEnum
public enum CorporateActionStatementType1Code {


    /**
     * Statement contains missing instructions.
     * 
     */
    MISS,

    /**
     * Statement contains all instructions.
     * 
     */
    ALLL;

    public String value() {
        return name();
    }

    public static CorporateActionStatementType1Code fromValue(String v) {
        return valueOf(v);
    }

}
