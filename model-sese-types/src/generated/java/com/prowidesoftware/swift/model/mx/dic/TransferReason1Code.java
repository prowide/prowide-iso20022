
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TransferReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="TRAU"/>
 *     <enumeration value="TRAC"/>
 *     <enumeration value="TRAT"/>
 *     <enumeration value="TRAO"/>
 *     <enumeration value="TRAI"/>
 *     <enumeration value="TRAG"/>
 *     <enumeration value="TPLD"/>
 *     <enumeration value="TTDT"/>
 *     <enumeration value="TRPE"/>
 *     <enumeration value="TRAF"/>
 *     <enumeration value="TRAN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TransferReason1Code")
@XmlEnum
public enum TransferReason1Code {


    /**
     * Transfer is an undivided possession.
     * 
     */
    TRAU,

    /**
     * Transfer is between spouses.
     * 
     */
    TRAC,

    /**
     * Transfer is a trade.
     * 
     */
    TRAT,

    /**
     * Transfer is ordinary.
     * 
     */
    TRAO,

    /**
     * Transfer is a heritage.
     * 
     */
    TRAI,

    /**
     * Transfer is a gift.
     * 
     */
    TRAG,

    /**
     * Transfer to pledged account (in certain circumstances distributors have to freeze and transfer total or partial holding to separate omnibus account e.g. investigation required by fiscal authority or police).
     * 
     */
    TPLD,

    /**
     * Transfer instruction executed within TDT framework (TDT framework is the operation model promoted by the Italian Banking Association for transfer and most of transfers, but not all, will be executed in accordance with that process).
     * 
     */
    TTDT,

    /**
     * Transfer between different beneficiaries with taxation to be applied (accounts with different owner).
     * 
     */
    TRPE,

    /**
     * Transfer is the result of a demerger or division.
     * 
     */
    TRAF,

    /**
     * Transfer is between own accounts.
     * 
     */
    TRAN;

    public String value() {
        return name();
    }

    public static TransferReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
