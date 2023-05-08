
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RepoCallAcknowledgementReason2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RepoCallAcknowledgementReason2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CALD"/>
 *     <enumeration value="CALP"/>
 *     <enumeration value="ADEA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RepoCallAcknowledgementReason2Code")
@XmlEnum
public enum RepoCallAcknowledgementReason2Code {


    /**
     * Repurchase agreement call is in process.
     * 
     */
    CALD,

    /**
     * Repurchase agreement call is processed.
     * 
     */
    CALP,

    /**
     * Received after the account servicer's deadline. Processed on best effort basis.
     * 
     */
    ADEA;

    public String value() {
        return name();
    }

    public static RepoCallAcknowledgementReason2Code fromValue(String v) {
        return valueOf(v);
    }

}
