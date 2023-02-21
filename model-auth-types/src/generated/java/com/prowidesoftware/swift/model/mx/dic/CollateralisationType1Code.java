
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralisationType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CollateralisationType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FLCL"/&gt;
 *     &lt;enumeration value="OWCL"/&gt;
 *     &lt;enumeration value="PRCL"/&gt;
 *     &lt;enumeration value="UNCL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CollateralisationType1Code")
@XmlEnum
public enum CollateralisationType1Code {


    /**
     * The collateral agreement between the counterparties stipulates that both counterparties post initial margin and regularly post variation margin with respect to the derivative transaction.
     * 
     */
    FLCL,

    /**
     * The collateral agreement between the counterparties stipulates that one counterparty posts the initial margin and regularly posts variation margin and that the other counterparty does not post any margin with respect to the derivative transaction.
     * 
     */
    OWCL,

    /**
     * The collateral agreement between the counterparties stipulates that both counterparties regularly post only variation margin with respect to the derivative transaction.
     * 
     */
    PRCL,

    /**
     * There is no collateral agreement between the counterparties or the collateral agreement between the counterparties stipulates that no collateral (neither initial margin nor variation margin) has to be posted with respect to the derivative transaction.
     * 
     */
    UNCL;

    public String value() {
        return name();
    }

    public static CollateralisationType1Code fromValue(String v) {
        return valueOf(v);
    }

}
