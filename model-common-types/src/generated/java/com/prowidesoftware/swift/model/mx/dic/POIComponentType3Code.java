
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for POIComponentType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="POIComponentType3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AQPP"/&gt;
 *     &lt;enumeration value="APPR"/&gt;
 *     &lt;enumeration value="TLPR"/&gt;
 *     &lt;enumeration value="SCPR"/&gt;
 *     &lt;enumeration value="SERV"/&gt;
 *     &lt;enumeration value="TERM"/&gt;
 *     &lt;enumeration value="DVCE"/&gt;
 *     &lt;enumeration value="SECM"/&gt;
 *     &lt;enumeration value="APLI"/&gt;
 *     &lt;enumeration value="EMVK"/&gt;
 *     &lt;enumeration value="EMVO"/&gt;
 *     &lt;enumeration value="MDWR"/&gt;
 *     &lt;enumeration value="DRVR"/&gt;
 *     &lt;enumeration value="OPST"/&gt;
 *     &lt;enumeration value="MRPR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "POIComponentType3Code")
@XmlEnum
public enum POIComponentType3Code {


    /**
     * Parameters for acquirer interface of the point of interaction, including acquirer host configuration parameters.
     * 
     */
    AQPP,

    /**
     * Parameters of a payment application running on the point of interaction.
     * 
     */
    APPR,

    /**
     * Manufacturer configuration parameters of the point of interaction.
     * 
     */
    TLPR,

    /**
     * Security parameters of the point of interaction.
     * 
     */
    SCPR,

    /**
     * Payment server of a point of interaction system.
     * 
     */
    SERV,

    /**
     * Payment terminal point of interaction.
     * 
     */
    TERM,

    /**
     * Device sub-component of a component of the point of interaction.
     * 
     */
    DVCE,

    /**
     * Security module.
     * 
     */
    SECM,

    /**
     * Payment application software.
     * 
     */
    APLI,

    /**
     * EMV application kernel  (EMV is the chip card specifications initially defined by Eurocard, Mastercard and Visa).
     * 
     */
    EMVK,

    /**
     * EMV physical interface (EMV is the chip card specifications initially defined by Eurocard, Mastercard and Visa).
     * 
     */
    EMVO,

    /**
     * Software module of the point of interaction.
     * 
     */
    MDWR,

    /**
     * Driver module of the point of interaction.
     * 
     */
    DRVR,

    /**
     * Software that manages hardware to provide common services to the applications.
     * 
     */
    OPST,

    /**
     * Merchant configuration parameters for the point of interaction (POI).
     * 
     */
    MRPR;

    public String value() {
        return name();
    }

    public static POIComponentType3Code fromValue(String v) {
        return valueOf(v);
    }

}
