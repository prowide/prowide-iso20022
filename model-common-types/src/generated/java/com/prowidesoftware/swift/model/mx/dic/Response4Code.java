
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Response4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Response4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="APPR"/>
 *     <enumeration value="DECL"/>
 *     <enumeration value="PART"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Response4Code")
@XmlEnum
public enum Response4Code {


    /**
     * Service has been successfuly provided.
     * 
     */
    APPR,

    /**
     * Service is declined.
     * 
     */
    DECL,

    /**
     * Service has been partialy provided.
     * 
     */
    PART;

    public String value() {
        return name();
    }

    public static Response4Code fromValue(String v) {
        return valueOf(v);
    }

}
