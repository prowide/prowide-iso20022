
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Incoterms1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Incoterms1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EXW"/&gt;
 *     &lt;enumeration value="FCA"/&gt;
 *     &lt;enumeration value="FAS"/&gt;
 *     &lt;enumeration value="FOB"/&gt;
 *     &lt;enumeration value="CFR"/&gt;
 *     &lt;enumeration value="CIF"/&gt;
 *     &lt;enumeration value="CPT"/&gt;
 *     &lt;enumeration value="CIP"/&gt;
 *     &lt;enumeration value="DAF"/&gt;
 *     &lt;enumeration value="DES"/&gt;
 *     &lt;enumeration value="DEQ"/&gt;
 *     &lt;enumeration value="DDU"/&gt;
 *     &lt;enumeration value="DDP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Incoterms1Code")
@XmlEnum
public enum Incoterms1Code {


    /**
     * Ex Works (any mode of transport, including multimodal).
     * 
     */
    EXW,

    /**
     * Free Carrier (any mode of transport, including multimodal).
     * 
     */
    FCA,

    /**
     * Free Alongside Ship (sea and inland waterway transport).
     * 
     */
    FAS,

    /**
     * Free On Board (sea and inland waterway transport).
     * 
     */
    FOB,

    /**
     * Cost and Freight (sea and inland waterway transport).
     * 
     */
    CFR,

    /**
     * Cost, Insurance and Freight (sea and inland waterway transport).
     * 
     */
    CIF,

    /**
     * Carriage Paid To (any mode of transport, including multimodal).
     * 
     */
    CPT,

    /**
     * Carriage and Insurance Paid to (any mode of transport, including multimodal).
     * 
     */
    CIP,

    /**
     * Delivered At Frontier (any mode of transport, including multimodal).
     * 
     */
    DAF,

    /**
     * Delivered Ex Ship (sea and inland waterway transport).
     * 
     */
    DES,

    /**
     * Delivered Ex Quay (sea and inland waterway transport).
     * 
     */
    DEQ,

    /**
     * Delivered Duty Unpaid (any mode of transport, including multimodal).
     * 
     */
    DDU,

    /**
     * Delivered Duty Paid (any mode of transport, including multimodal).
     * 
     */
    DDP;

    public String value() {
        return name();
    }

    public static Incoterms1Code fromValue(String v) {
        return valueOf(v);
    }

}
