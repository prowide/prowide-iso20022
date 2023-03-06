
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralTransactionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CollateralTransactionType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AADJ"/&gt;
 *     &lt;enumeration value="CDTA"/&gt;
 *     &lt;enumeration value="CADJ"/&gt;
 *     &lt;enumeration value="DADJ"/&gt;
 *     &lt;enumeration value="DBVT"/&gt;
 *     &lt;enumeration value="INIT"/&gt;
 *     &lt;enumeration value="MADJ"/&gt;
 *     &lt;enumeration value="PADJ"/&gt;
 *     &lt;enumeration value="RATA"/&gt;
 *     &lt;enumeration value="TERM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
