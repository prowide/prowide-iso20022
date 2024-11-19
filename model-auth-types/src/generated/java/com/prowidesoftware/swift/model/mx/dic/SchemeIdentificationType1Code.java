
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SchemeIdentificationType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SchemeIdentificationType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MARG"/>
 *     <enumeration value="COLL"/>
 *     <enumeration value="POSI"/>
 *     <enumeration value="CLIM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SchemeIdentificationType1Code")
@XmlEnum
public enum SchemeIdentificationType1Code {


    /**
     * Operational construct used to record the set of positions whose margin requirements is calculated on a gross basis.
     * 
     */
    MARG,

    /**
     * Operational construct used by a central counterparty to record ownership of assets posted as collateral by clearing members to meet their obligations at the central counterparty.
     * 
     */
    COLL,

    /**
     * Operational construct used to record a position in a set of financial instruments, often linked by a common set of characteristics, ownership or trading strategy.
     * 
     */
    POSI,

    /**
     * Legal entity that is a participant in a clearing service of a central counterparty, that is the legal counterparty to all novated trades for all the accounts associated with such counterparty.
     * 
     */
    CLIM;

    public String value() {
        return name();
    }

    public static SchemeIdentificationType1Code fromValue(String v) {
        return valueOf(v);
    }

}
