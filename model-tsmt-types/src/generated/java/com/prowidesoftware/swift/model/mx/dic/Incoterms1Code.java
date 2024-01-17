
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Incoterms1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Incoterms1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EXW"/>
 *     <enumeration value="FCA"/>
 *     <enumeration value="FAS"/>
 *     <enumeration value="FOB"/>
 *     <enumeration value="CFR"/>
 *     <enumeration value="CIF"/>
 *     <enumeration value="CPT"/>
 *     <enumeration value="CIP"/>
 *     <enumeration value="DAF"/>
 *     <enumeration value="DES"/>
 *     <enumeration value="DEQ"/>
 *     <enumeration value="DDU"/>
 *     <enumeration value="DDP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
