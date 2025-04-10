
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyIdentificationType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PartyIdentificationType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FXID"/>
 *     <enumeration value="FXSN"/>
 *     <enumeration value="INGN"/>
 *     <enumeration value="IICS"/>
 *     <enumeration value="IGBT"/>
 *     <enumeration value="MAMA"/>
 *     <enumeration value="MEOC"/>
 *     <enumeration value="METY"/>
 *     <enumeration value="NOMM"/>
 *     <enumeration value="OSCO"/>
 *     <enumeration value="PASS"/>
 *     <enumeration value="PONU"/>
 *     <enumeration value="POAD"/>
 *     <enumeration value="RMID"/>
 *     <enumeration value="SLCN"/>
 *     <enumeration value="SLNF"/>
 *     <enumeration value="TACN"/>
 *     <enumeration value="TRCO"/>
 *     <enumeration value="TANA"/>
 *     <enumeration value="USIT"/>
 *     <enumeration value="USNA"/>
 *     <enumeration value="AUIT"/>
 *     <enumeration value="BRID"/>
 *     <enumeration value="CLIN"/>
 *     <enumeration value="CMID"/>
 *     <enumeration value="COIN"/>
 *     <enumeration value="CMOT"/>
 *     <enumeration value="CONU"/>
 *     <enumeration value="CMIN"/>
 *     <enumeration value="DECN"/>
 *     <enumeration value="DEPA"/>
 *     <enumeration value="ELCO"/>
 *     <enumeration value="EXVE"/>
 *     <enumeration value="FICO"/>
 *     <enumeration value="FIID"/>
 *     <enumeration value="FLCN"/>
 *     <enumeration value="FLNF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PartyIdentificationType1Code")
@XmlEnum
public enum PartyIdentificationType1Code {


    /**
     * Member identification of the FX trading system.
     * 
     */
    FXID,

    /**
     * English short name of FX system.
     * 
     */
    FXSN,

    /**
     * Name of the firm group.
     * 
     */
    INGN,

    /**
     * Institution identification in com star system.
     * 
     */
    IICS,

    /**
     * Internal team that traders belong.
     * 
     * 
     */
    IGBT,

    /**
     * Specifies the maket makers.
     * 
     */
    MAMA,

    /**
     * Identify members or clients.
     * 
     */
    MEOC,

    /**
     * Type of the trading members.
     * 
     */
    METY,

    /**
     * Specifies the non maket makers.
     * 
     */
    NOMM,

    /**
     * Specifies other system.
     * 
     */
    OSCO,

    /**
     * Password of the trading system.
     * 
     */
    PASS,

    /**
     * Phone number of the trading members.
     * 
     */
    PONU,

    /**
     * Postal address of the trading members.
     * 
     */
    POAD,

    /**
     * Member identification of the RMB trading system
     * 
     * 
     */
    RMID,

    /**
     * Legal chinese short title of the trading members.
     * 
     */
    SLCN,

    /**
     * Legal short title of the trading members.
     * 
     */
    SLNF,

    /**
     * Chinese names for the traders.
     * 
     */
    TACN,

    /**
     * Specifies the traders.
     * 
     */
    TRCO,

    /**
     * Names for the traders.
     * 
     */
    TANA,

    /**
     * Input the user of trading system.
     * 
     */
    USIT,

    /**
     * User name of the trading system.
     * 
     */
    USNA,

    /**
     * Agent input the user of the trading system.
     * 
     */
    AUIT,

    /**
     * Identification of the branch.
     * 
     */
    BRID,

    /**
     * Specifies clearing institution.
     * 
     */
    CLIN,

    /**
     * Identification of the collateral management institution.
     * 
     */
    CMID,

    /**
     * Name of the collateral management institution.
     * 
     */
    COIN,

    /**
     * Contact method of the traders.
     * 
     */
    CMOT,

    /**
     * Contact name of the trading members.
     * 
     */
    CONU,

    /**
     * Institution of custody management.
     * 
     */
    CMIN,

    /**
     * Trade confimation person name.
     * 
     */
    DECN,

    /**
     * Department of the trading members.
     * 
     */
    DEPA,

    /**
     * Specifies eligible of counterparty.
     * 
     */
    ELCO,

    /**
     * Place of execution.
     * 
     */
    EXVE,

    /**
     * Specifies the firm.
     * 
     */
    FICO,

    /**
     * Identification of the firm.
     * 
     */
    FIID,

    /**
     * Legal chinese full title of the trading members.
     * 
     */
    FLCN,

    /**
     * Legal full title of the trading members.
     * 
     */
    FLNF;

    public String value() {
        return name();
    }

    public static PartyIdentificationType1Code fromValue(String v) {
        return valueOf(v);
    }

}
