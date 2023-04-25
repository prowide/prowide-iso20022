
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralTransactionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CollateralTransactionType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AADJ"/>
 *     <enumeration value="CDTA"/>
 *     <enumeration value="CADJ"/>
 *     <enumeration value="DADJ"/>
 *     <enumeration value="DBVT"/>
 *     <enumeration value="INIT"/>
 *     <enumeration value="MADJ"/>
 *     <enumeration value="PADJ"/>
 *     <enumeration value="RATA"/>
 *     <enumeration value="TERM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CollateralTransactionType1Code")
@XmlEnum
public enum CollateralTransactionType1Code {


    /**
     * Automatic/manual settlement adjustment to change the allocation mode from manual to automatic or vice  versa.
     * 
     */
    AADJ,

    /**
     * Change of the closing date.
     * 
     */
    CDTA,

    /**
     * Change to collateral. Used  when collateral giver manually allocates the securities to the transaction.
     * 
     */
    CADJ,

    /**
     * Change of other data.
     * 
     */
    DADJ,

    /**
     * Delivery by value (DBV) transaction. 
     * 
     * 
     */
    DBVT,

    /**
     * Creation of a Collateral Management Transaction.
     * 
     */
    INIT,

    /**
     * Change to margin. 
     * 
     * 
     */
    MADJ,

    /**
     * Change of principal/exposure adjustment
     * 
     */
    PADJ,

    /**
     * Change of rate.
     * 
     */
    RATA,

    /**
     * Closing of the Collateral Management Transaction.
     * 
     */
    TERM;

    public String value() {
        return name();
    }

    public static CollateralTransactionType1Code fromValue(String v) {
        return valueOf(v);
    }

}
