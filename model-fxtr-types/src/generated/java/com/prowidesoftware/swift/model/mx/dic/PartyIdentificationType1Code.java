
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyIdentificationType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PartyIdentificationType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FXID"/&gt;
 *     &lt;enumeration value="FXSN"/&gt;
 *     &lt;enumeration value="INGN"/&gt;
 *     &lt;enumeration value="IICS"/&gt;
 *     &lt;enumeration value="IGBT"/&gt;
 *     &lt;enumeration value="MAMA"/&gt;
 *     &lt;enumeration value="MEOC"/&gt;
 *     &lt;enumeration value="METY"/&gt;
 *     &lt;enumeration value="NOMM"/&gt;
 *     &lt;enumeration value="OSCO"/&gt;
 *     &lt;enumeration value="PASS"/&gt;
 *     &lt;enumeration value="PONU"/&gt;
 *     &lt;enumeration value="POAD"/&gt;
 *     &lt;enumeration value="RMID"/&gt;
 *     &lt;enumeration value="SLCN"/&gt;
 *     &lt;enumeration value="SLNF"/&gt;
 *     &lt;enumeration value="TACN"/&gt;
 *     &lt;enumeration value="TRCO"/&gt;
 *     &lt;enumeration value="TANA"/&gt;
 *     &lt;enumeration value="USIT"/&gt;
 *     &lt;enumeration value="USNA"/&gt;
 *     &lt;enumeration value="AUIT"/&gt;
 *     &lt;enumeration value="BRID"/&gt;
 *     &lt;enumeration value="CLIN"/&gt;
 *     &lt;enumeration value="CMID"/&gt;
 *     &lt;enumeration value="COIN"/&gt;
 *     &lt;enumeration value="CMOT"/&gt;
 *     &lt;enumeration value="CONU"/&gt;
 *     &lt;enumeration value="CMIN"/&gt;
 *     &lt;enumeration value="DECN"/&gt;
 *     &lt;enumeration value="DEPA"/&gt;
 *     &lt;enumeration value="ELCO"/&gt;
 *     &lt;enumeration value="EXVE"/&gt;
 *     &lt;enumeration value="FICO"/&gt;
 *     &lt;enumeration value="FIID"/&gt;
 *     &lt;enumeration value="FLCN"/&gt;
 *     &lt;enumeration value="FLNF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
