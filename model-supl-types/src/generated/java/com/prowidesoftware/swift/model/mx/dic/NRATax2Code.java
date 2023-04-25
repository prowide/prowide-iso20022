
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NRATax2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="NRATax2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="T011"/>
 *     <enumeration value="T012"/>
 *     <enumeration value="T013"/>
 *     <enumeration value="T014"/>
 *     <enumeration value="T015"/>
 *     <enumeration value="T019"/>
 *     <enumeration value="T021"/>
 *     <enumeration value="T022"/>
 *     <enumeration value="T023"/>
 *     <enumeration value="T025"/>
 *     <enumeration value="T026"/>
 *     <enumeration value="T027"/>
 *     <enumeration value="T029"/>
 *     <enumeration value="T302"/>
 *     <enumeration value="T041"/>
 *     <enumeration value="T042"/>
 *     <enumeration value="T043"/>
 *     <enumeration value="T044"/>
 *     <enumeration value="T045"/>
 *     <enumeration value="T046"/>
 *     <enumeration value="T047"/>
 *     <enumeration value="T048"/>
 *     <enumeration value="T049"/>
 *     <enumeration value="T050"/>
 *     <enumeration value="T051"/>
 *     <enumeration value="T054"/>
 *     <enumeration value="T073"/>
 *     <enumeration value="T074"/>
 *     <enumeration value="T075"/>
 *     <enumeration value="T076"/>
 *     <enumeration value="T077"/>
 *     <enumeration value="T078"/>
 *     <enumeration value="T080"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "NRATax2Code")
@XmlEnum
public enum NRATax2Code {


    /**
     * Tax category for domestic source income dividends.
     * 
     */
    @XmlEnumValue("T011")
    T_011("T011"),

    /**
     * Tax category for foreign source income dividends.
     * 
     */
    @XmlEnumValue("T012")
    T_012("T012"),

    /**
     * Tax category for non taxable domestic dividends.
     * 
     */
    @XmlEnumValue("T013")
    T_013("T013"),

    /**
     * Tax category for fully exempt dividends on municipal type mutual funds.
     * 
     */
    @XmlEnumValue("T014")
    T_014("T014"),

    /**
     * Tax category for federal taxable state exempt dividends.
     * 
     */
    @XmlEnumValue("T015")
    T_015("T015"),

    /**
     * Tax category for Return Of Capital proceeds.
     * 
     */
    @XmlEnumValue("T019")
    T_019("T019"),

    /**
     * Tax category for Long Term Capital Gains proceeds.
     * 
     */
    @XmlEnumValue("T021")
    T_021("T021"),

    /**
     * Tax category for Short Term Capital Gains proceeds.
     * 
     */
    @XmlEnumValue("T022")
    T_022("T022"),

    /**
     * Tax category for FIRPTA eligible (REITS).
     * 
     */
    @XmlEnumValue("T023")
    T_023("T023"),

    /**
     * Tax category for REIT (Capital Gain Distributions).
     * 
     */
    @XmlEnumValue("T025")
    T_025("T025"),

    /**
     * Tax category for limited publicly traded partnership.
     * 
     */
    @XmlEnumValue("T026")
    T_026("T026"),

    /**
     * Tax category for substitute dividend payments.
     * 
     */
    @XmlEnumValue("T027")
    T_027("T027"),

    /**
     * Tax category for short term capital gain distributions.
     * 
     */
    @XmlEnumValue("T029")
    T_029("T029"),

    /**
     * Tax category for dividend or capital gains distribution due to a corporate action.
     * 
     */
    @XmlEnumValue("T302")
    T_302("T302"),

    /**
     * Tax category for U.S. source ordinary interest proceeds.
     * 
     */
    @XmlEnumValue("T041")
    T_041("T041"),

    /**
     * Tax category for foreign bond interest proceeds.
     * 
     */
    @XmlEnumValue("T042")
    T_042("T042"),

    /**
     * Tax category for all state and territorial municipal interest proceeds.
     * 
     */
    @XmlEnumValue("T043")
    T_043("T043"),

    /**
     * Tax category for all municipal bonds that are subject to federal tax proceeds.
     * 
     */
    @XmlEnumValue("T044")
    T_044("T044"),

    /**
     * Tax category for U.S. government interest on contracts Notes & mortgages proceeds.
     * 
     */
    @XmlEnumValue("T045")
    T_045("T045"),

    /**
     * Tax category for U.S. government interest on GNMA 1 & 2 proceeds.
     * 
     */
    @XmlEnumValue("T046")
    T_046("T046"),

    /**
     * Tax category for interest on collateralized mortgage obligations proceeds.
     * 
     */
    @XmlEnumValue("T047")
    T_047("T047"),

    /**
     * Tax category for interests on certificates of deposits proceeds.
     * 
     */
    @XmlEnumValue("T048")
    T_048("T048"),

    /**
     * Tax category for U.S. government interest proceeds.
     * 
     */
    @XmlEnumValue("T049")
    T_049("T049"),

    /**
     * Tax Category for US government interest on Notes and Bills.
     * 
     */
    @XmlEnumValue("T050")
    T_050("T050"),

    /**
     * Tax category for principal pay downs proceeds.
     * 
     */
    @XmlEnumValue("T051")
    T_051("T051"),

    /**
     * Tax category for interest substitute payment.
     * 
     */
    @XmlEnumValue("T054")
    T_054("T054"),

    /**
     * Tax category for royalty payments proceeds.
     * 
     */
    @XmlEnumValue("T073")
    T_073("T073"),

    /**
     * Tax category for other taxable income proceeds.
     * 
     */
    @XmlEnumValue("T074")
    T_074("T074"),

    /**
     * Tax category for other non-taxable income proceeds.
     * 
     */
    @XmlEnumValue("T075")
    T_075("T075"),

    /**
     * Tax category for miscellaneous payments proceeds.
     * 
     */
    @XmlEnumValue("T076")
    T_076("T076"),

    /**
     * Tax category for stock split proceeds.
     * 
     */
    @XmlEnumValue("T077")
    T_077("T077"),

    /**
     * Tax category for stock dividend proceeds.
     * 
     */
    @XmlEnumValue("T078")
    T_078("T078"),

    /**
     * Tax category for spin off proceeds.
     * 
     */
    @XmlEnumValue("T080")
    T_080("T080");
    private final String value;

    NRATax2Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NRATax2Code fromValue(String v) {
        for (NRATax2Code c: NRATax2Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
