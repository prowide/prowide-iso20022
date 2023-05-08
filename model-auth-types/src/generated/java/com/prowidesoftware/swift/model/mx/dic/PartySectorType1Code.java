
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartySectorType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PartySectorType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SRSN"/>
 *     <enumeration value="SRSB"/>
 *     <enumeration value="SRPB"/>
 *     <enumeration value="SRCB"/>
 *     <enumeration value="RGNL"/>
 *     <enumeration value="OFCP"/>
 *     <enumeration value="NRSN"/>
 *     <enumeration value="NRSB"/>
 *     <enumeration value="NRPB"/>
 *     <enumeration value="NRCB"/>
 *     <enumeration value="NFIN"/>
 *     <enumeration value="NTPB"/>
 *     <enumeration value="LOCA"/>
 *     <enumeration value="CDTI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PartySectorType1Code")
@XmlEnum
public enum PartySectorType1Code {


    /**
     * Party is a supranational public body subject to the Regulation.
     * 
     * 
     */
    SRSN,

    /**
     * Party is a bond of type sovereign bond subject to the Regulation.
     * 
     */
    SRSB,

    /**
     * Party is a public body (excluding the central banks) subject to the Regulation.
     * 
     */
    SRPB,

    /**
     * Party is a Central bank subject to the Regulation.
     * 
     */
    SRCB,

    /**
     * Party is a regional government.
     * 
     */
    RGNL,

    /**
     * Party is other financial corporation.
     * 
     */
    OFCP,

    /**
     * Party is a supranational public body not subject to the Regulation.
     * 
     */
    NRSN,

    /**
     * Party is a bond of type sovereign bond not subject to the Regulation.
     * 
     */
    NRSB,

    /**
     * Party is a public body not subject to the Regulation.
     * 
     */
    NRPB,

    /**
     * Party is a national central bank not subject to the Regulation.
     * 
     */
    NRCB,

    /**
     * Party is a non-financial institution.
     * 
     */
    NFIN,

    /**
     * Party is a national public body.
     * 
     */
    NTPB,

    /**
     * Party is a local government.
     * 
     */
    LOCA,

    /**
     * Party is a credit institution.
     * 
     */
    CDTI;

    public String value() {
        return name();
    }

    public static PartySectorType1Code fromValue(String v) {
        return valueOf(v);
    }

}
