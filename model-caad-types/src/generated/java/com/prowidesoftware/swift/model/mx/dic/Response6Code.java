
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Response6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Response6Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="UNPR"/>
 *     <enumeration value="PPRC"/>
 *     <enumeration value="PRCS"/>
 *     <enumeration value="REJT"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="TECH"/>
 *     <enumeration value="UNRV"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Response6Code")
@XmlEnum
public enum Response6Code {


    /**
     * Advice message could not be processed.
     * 
     */
    UNPR,

    /**
     * Processing of the service has been partially performed.
     * 
     */
    PPRC,

    /**
     * Advice message is processed.
     * 
     */
    PRCS,

    /**
     * Service was rejected.
     * 
     */
    REJT,

    /**
     * Other type of processing result defined at private level.
     * 
     */
    OTHP,

    /**
     * Other type of processing result defined at national level.
     * 
     */
    OTHN,

    /**
     * Service cannot be provided for technical reason (eg timeout contacting the Issuer, security problem).
     * 
     */
    TECH,

    /**
     * Service is under review.
     * 
     */
    UNRV;

    public String value() {
        return name();
    }

    public static Response6Code fromValue(String v) {
        return valueOf(v);
    }

}
