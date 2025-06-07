
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductIdentifier2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductIdentifier2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BINR"/&gt;
 *     &lt;enumeration value="COMD"/&gt;
 *     &lt;enumeration value="EANC"/&gt;
 *     &lt;enumeration value="HRTR"/&gt;
 *     &lt;enumeration value="MANI"/&gt;
 *     &lt;enumeration value="MODL"/&gt;
 *     &lt;enumeration value="PART"/&gt;
 *     &lt;enumeration value="QOTA"/&gt;
 *     &lt;enumeration value="STYL"/&gt;
 *     &lt;enumeration value="SUPI"/&gt;
 *     &lt;enumeration value="UPCC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProductIdentifier2Code")
@XmlEnum
public enum ProductIdentifier2Code {


    /**
     * Product identifier assigned by the buyer.
     * 
     */
    BINR,

    /**
     * A code to identify a product based on applicable commercial conditions.
     * 
     */
    COMD,

    /**
     * The unique EAN (European Article Number) code.
     * 
     */
    EANC,

    /**
     * Classification of goods as developed by the Customs Cooperation council.
     * 
     */
    HRTR,

    /**
     * Product identifier as assigned by the manufacturer.
     * 
     */
    MANI,

    /**
     * Reference number assigned by the manufacturer to differentiate variations in similar products in a class or group.
     * 
     */
    MODL,

    /**
     * Reference assigned by the manufacturer to a product part.
     * 
     */
    PART,

    /**
     * Product identifier used by the retail industry.
     * 
     */
    QOTA,

    /**
     * Identification of the style of a product.
     * 
     */
    STYL,

    /**
     * Number assigned to an article by the supplier of that article.
     * 
     */
    SUPI,

    /**
     * Number assigned to a manufacturer's product by the Product Code Council.
     * 
     */
    UPCC;

    public String value() {
        return name();
    }

    public static ProductIdentifier2Code fromValue(String v) {
        return valueOf(v);
    }

}
