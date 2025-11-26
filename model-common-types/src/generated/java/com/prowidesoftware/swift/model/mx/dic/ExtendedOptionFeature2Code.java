
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtendedOptionFeature2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ExtendedOptionFeature2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FORU"/>
 *     <enumeration value="FORF"/>
 *     <enumeration value="FORX"/>
 *     <enumeration value="DRPU"/>
 *     <enumeration value="DRPF"/>
 *     <enumeration value="DRPX"/>
 *     <enumeration value="FCPP"/>
 *     <enumeration value="FCPU"/>
 *     <enumeration value="FCPF"/>
 *     <enumeration value="FCPX"/>
 *     <enumeration value="NSHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ExtendedOptionFeature2Code")
@XmlEnum
public enum ExtendedOptionFeature2Code {


    /**
     * DTC (The Depository Trust Company) only option. The event and security are eligible for the Foreign Tax Relief service at DTC. Option to select unfavourable tax rate. The Foreign Tax Unfavourable option is the default option.
     * 
     */
    FORU,

    /**
     * DTC (The Depository Trust Company) only option. The event and security are eligible for the Foreign Tax Relief service at DTC. An election into this option ensures the participant receives their payment at a favourable tax withholding rate.
     * 
     */
    FORF,

    /**
     * DTC (The Depository Trust Company) only option. The event and security are eligible for the Foreign Tax Relief service at DTC. An election into this option ensures the participant is exempt from any tax withholding.
     * 
     */
    FORX,

    /**
     * DTC (The Depository Trust Company) only option. The event and security are eligible for both the Dividend Reinvestment and Foreign Tax services at DTC. Participants electing this option will receive additional shares and the tax withholding on those shares will be at the unfavourable tax rate.
     * 
     */
    DRPU,

    /**
     * DTC (The Depository Trust Company) only option. The event and security are eligible for both the Dividend Reinvestment and Foreign Tax Relief services at DTC. Participants electing this option will receive additional shares and the tax withholding on those shares will be at the favourable tax rate.
     * 
     */
    DRPF,

    /**
     * DTC (The Depository Trust Company) only option. The event and security are eligible for both the Dividend Reinvestment and the Foreign Tax Relief services at DTC. Participants electing this option will receive additional shares and will be exempt from any tax withholding.
     * 
     */
    DRPX,

    /**
     * DTC (The Depository Trust Company) only option. The event and security are eligible for Foreign Currency Payment service at DTC. Participants electing this option will receive their distribution in the foreign currency instructed.
     * 
     */
    FCPP,

    /**
     * DTC (The Depository Trust Company) only option. The event and security are eligible for both the Foreign Currency and Foreign Tax services at DTC. Participants electing this option will receive their distribution in a foreign currency and the tax withholding on that distribution will be subject to unfavourable tax withholding.
     * 
     */
    FCPU,

    /**
     * DTC (The Depository Trust Company) only option. The event and security are eligible for both the Foreign Currency and Foreign Tax services at DTC. Participants electing the option will receive their distribution in foreign currency and the tax withholding on that distribution will be subject to favourable tax withholding.
     * 
     */
    FCPF,

    /**
     * DTC (The Depository Trust Company) only option. The event and security are eligible for both the Foreign Currency and Foreign Tax services at DTC. Participants electing this option will receive their distribution in a foreign currency and will be exempt from any tax withholding.
     * 
     */
    FCPX,

    /**
     * Indicates option in which holders must not provide a shareholder number if provided will be rejected. 
     * 
     * 
     */
    NSHR;

    public String value() {
        return name();
    }

    public static ExtendedOptionFeature2Code fromValue(String v) {
        return valueOf(v);
    }

}
