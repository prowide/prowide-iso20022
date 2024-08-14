
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DocumentType4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CINV"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DocumentType4Code")
@XmlEnum
public enum DocumentType4Code {


    /**
     * Document is an invoice.
     * 
     */
    CINV;

    public String value() {
        return name();
    }

    public static DocumentType4Code fromValue(String v) {
        return valueOf(v);
    }

}
