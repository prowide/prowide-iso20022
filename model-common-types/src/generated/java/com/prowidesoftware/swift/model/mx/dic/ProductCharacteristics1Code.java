
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductCharacteristics1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ProductCharacteristics1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BISP"/>
 *     <enumeration value="CHNR"/>
 *     <enumeration value="CLOR"/>
 *     <enumeration value="EDSP"/>
 *     <enumeration value="ENNR"/>
 *     <enumeration value="OPTN"/>
 *     <enumeration value="ORCR"/>
 *     <enumeration value="PCTV"/>
 *     <enumeration value="SISP"/>
 *     <enumeration value="SIZE"/>
 *     <enumeration value="SZRG"/>
 *     <enumeration value="SPRM"/>
 *     <enumeration value="STOR"/>
 *     <enumeration value="VINR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ProductCharacteristics1Code")
@XmlEnum
public enum ProductCharacteristics1Code {


    /**
     * Detailed product information as assigned by the buyer.
     * 
     */
    BISP,

    /**
     * Unique identifier affixed by manufacturer to a chassis for identification purposes.
     * 
     */
    CHNR,

    /**
     * Indication of the product colour.
     * 
     */
    CLOR,

    /**
     * The total of the volume used for combustion inside the cylinders of an engine. This is expressed in cubic centimetres.
     * 
     */
    EDSP,

    /**
     * Unique identifier affixed by manufacturer to an engine for identification purposes.
     * 
     */
    ENNR,

    /**
     * Identifier of a sub-category of a product such as size, colour, etc.
     * 
     */
    OPTN,

    /**
     * Code assigned to the product describing how it will be stored.
     * 
     */
    ORCR,

    /**
     * Percentage by volume.
     * 
     */
    PCTV,

    /**
     * Detailed product information as assigned by the seller.
     * 
     */
    SISP,

    /**
     * Indication of the product size.
     * 
     */
    SIZE,

    /**
     * Range of product sizes.
     * 
     */
    SZRG,

    /**
     * Special remarks about a product.
     * 
     */
    SPRM,

    /**
     * Code assigned to the product describing how it will be stored.
     * 
     */
    STOR,

    /**
     * The identification number which uniquely distinguishes one vehicle from another through the lifespan of the vehicle.
     * 
     */
    VINR;

    public String value() {
        return name();
    }

    public static ProductCharacteristics1Code fromValue(String v) {
        return valueOf(v);
    }

}
