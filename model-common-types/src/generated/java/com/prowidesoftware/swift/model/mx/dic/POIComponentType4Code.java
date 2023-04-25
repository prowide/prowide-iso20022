
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for POIComponentType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="POIComponentType4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AQPP"/>
 *     <enumeration value="APPR"/>
 *     <enumeration value="TLPR"/>
 *     <enumeration value="SCPR"/>
 *     <enumeration value="SERV"/>
 *     <enumeration value="TERM"/>
 *     <enumeration value="DVCE"/>
 *     <enumeration value="SECM"/>
 *     <enumeration value="APLI"/>
 *     <enumeration value="EMVK"/>
 *     <enumeration value="EMVO"/>
 *     <enumeration value="MDWR"/>
 *     <enumeration value="DRVR"/>
 *     <enumeration value="OPST"/>
 *     <enumeration value="MRPR"/>
 *     <enumeration value="CRTF"/>
 *     <enumeration value="TMSP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "POIComponentType4Code")
@XmlEnum
public enum POIComponentType4Code {


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
     * EMV application kernel (EMV is the chip card specifications initially defined by Eurocard, Mastercard and Visa).
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
    MRPR,

    /**
     * Certificate provided by a terminal manager.
     * 
     */
    CRTF,

    /**
     * Configuration parameters for the TMS protocol.
     * 
     */
    TMSP;

    public String value() {
        return name();
    }

    public static POIComponentType4Code fromValue(String v) {
        return valueOf(v);
    }

}
