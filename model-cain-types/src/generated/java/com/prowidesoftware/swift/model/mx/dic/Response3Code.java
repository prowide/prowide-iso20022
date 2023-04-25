
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Response3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Response3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="APPR"/>
 *     <enumeration value="DECL"/>
 *     <enumeration value="FRTH"/>
 *     <enumeration value="PART"/>
 *     <enumeration value="PRCS"/>
 *     <enumeration value="UNPR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Response3Code")
@XmlEnum
public enum Response3Code {


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
     * Further action required to complete the transaction, for instance a referral.
     * 
     */
    FRTH,

    /**
     * Service has been partialy provided.
     * 
     */
    PART,

    /**
     * Advice message is processed.
     * 
     */
    PRCS,

    /**
     * Advice message could not be processed.
     * 
     */
    UNPR;

    public String value() {
        return name();
    }

    public static Response3Code fromValue(String v) {
        return valueOf(v);
    }

}
