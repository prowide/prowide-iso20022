
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralisationType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CollateralisationType3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FLCL"/&gt;
 *     &lt;enumeration value="OWCL"/&gt;
 *     &lt;enumeration value="OWC1"/&gt;
 *     &lt;enumeration value="OWC2"/&gt;
 *     &lt;enumeration value="OWP1"/&gt;
 *     &lt;enumeration value="OWP2"/&gt;
 *     &lt;enumeration value="PRCL"/&gt;
 *     &lt;enumeration value="PRC1"/&gt;
 *     &lt;enumeration value="PRC2"/&gt;
 *     &lt;enumeration value="UNCL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CollateralisationType3Code")
@XmlEnum
public enum CollateralisationType3Code {


    /**
     * The collateral agreement between the counterparties stipulates that both counterparties post initial margin and regularly post variation margin with respect to the derivative transaction.
     * 
     */
    FLCL("FLCL"),

    /**
     * The collateral agreement between the counterparties stipulates that one counterparty posts the initial margin and regularly posts variation margin and that the other counterparty does not post any margin with respect to the derivative transaction.
     * 
     */
    OWCL("OWCL"),

    /**
     * The collateral agreement between the counterparties stipulates that the reporting counterparty posts the initial margin and regularly posts variation margin and that the other counterparty does not post any margin with respect to the derivative transaction.
     * 
     */
    @XmlEnumValue("OWC1")
    OWC_1("OWC1"),

    /**
     * The collateral agreement between the counterparties stipulates that the other counterparty posts the initial margin and regularly posts variation margin and that the reporting counterparty does not post any margin with respect to the derivative transaction.
     * 
     */
    @XmlEnumValue("OWC2")
    OWC_2("OWC2"),

    /**
     * The collateral agreement between the counterparties stipulates that the reporting counterparty posts the initial margin and regularly posts variation margin and that the other counterparty regularly posts only variation margin. 
     * 
     */
    @XmlEnumValue("OWP1")
    OWP_1("OWP1"),

    /**
     * The collateral agreement between the counterparties stipulates that the other counterparty posts the initial margin and regularly posts variation margin and that the reporting counterparty regularly posts only variation margin.
     * 
     */
    @XmlEnumValue("OWP2")
    OWP_2("OWP2"),

    /**
     * The collateral agreement between the counterparties stipulates that both counterparties regularly post only variation margin with respect to the derivative transaction.
     * 
     */
    PRCL("PRCL"),

    /**
     * The collateral agreement between the counterparties stipulates that the reporting counterparty regularly  posts only variation margin and that the other counterparty does not post any margin with respect to the derivative transaction.
     * 
     */
    @XmlEnumValue("PRC1")
    PRC_1("PRC1"),

    /**
     * The collateral agreement between the counterparties stipulates that the other counterparty regularly posts only variation margin and that the reporting counterparty does not post any margin with respect to the derivative transaction.
     * 
     */
    @XmlEnumValue("PRC2")
    PRC_2("PRC2"),

    /**
     * There is no collateral agreement between the counterparties or the collateral agreement between the counterparties stipulates that no collateral (neither initial margin nor variation margin) has to be posted with respect to the derivative transaction.
     * 
     */
    UNCL("UNCL");
    private final String value;

    CollateralisationType3Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CollateralisationType3Code fromValue(String v) {
        for (CollateralisationType3Code c: CollateralisationType3Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
