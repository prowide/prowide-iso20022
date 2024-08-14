
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancellationRight1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CancellationRight1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="VALI"/>
 *     <enumeration value="NOXO"/>
 *     <enumeration value="NOWA"/>
 *     <enumeration value="NOIN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CancellationRight1Code")
@XmlEnum
public enum CancellationRight1Code {


    /**
     * Investor is entitled to a "cooling off" period with cancellation rights under compliance rules.
     * 
     */
    VALI,

    /**
     * Investor is not entitled to cancellation rights under compliance rules, as the investor is an execution's only client.
     * 
     */
    NOXO,

    /**
     * Investor is not entitled to cancellation rights under compliance rules as the investor has agreed to waive those rights.
     * 
     */
    NOWA,

    /**
     * Investor is not entitled to cancellation rights under compliance rules as the investor is a financial institution.
     * 
     */
    NOIN;

    public String value() {
        return name();
    }

    public static CancellationRight1Code fromValue(String v) {
        return valueOf(v);
    }

}
