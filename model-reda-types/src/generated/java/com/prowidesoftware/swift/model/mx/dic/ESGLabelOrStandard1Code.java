
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ESGLabelOrStandard1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ESGLabelOrStandard1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="E005"/>
 *     <enumeration value="C003"/>
 *     <enumeration value="B002"/>
 *     <enumeration value="L012"/>
 *     <enumeration value="D004"/>
 *     <enumeration value="O015"/>
 *     <enumeration value="A001"/>
 *     <enumeration value="F006"/>
 *     <enumeration value="K011"/>
 *     <enumeration value="J010"/>
 *     <enumeration value="H008"/>
 *     <enumeration value="I009"/>
 *     <enumeration value="G007"/>
 *     <enumeration value="N014"/>
 *     <enumeration value="M013"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ESGLabelOrStandard1Code")
@XmlEnum
public enum ESGLabelOrStandard1Code {


    /**
     * Climate Bonds Initiative (CBI) Climate Bonds Standard.
     * 
     */
    @XmlEnumValue("E005")
    E_005("E005"),

    /**
     * EU Ecolabel for financial products.
     * 
     */
    @XmlEnumValue("C003")
    C_003("C003"),

    /**
     * EU Green Bond Standard.
     * 
     */
    @XmlEnumValue("B002")
    B_002("B002"),

    /**
     * Febelfin Towards Sustainability label.
     * 
     */
    @XmlEnumValue("L012")
    L_012("L012"),

    /**
     * FNG-Siegel.
     * 
     */
    @XmlEnumValue("D004")
    D_004("D004"),

    /**
     * Greenfin label.
     * 
     */
    @XmlEnumValue("O015")
    O_015("O015"),

    /**
     * International Capital Markets Association (ICMA) Green Bond Principles.
     * 
     */
    @XmlEnumValue("A001")
    A_001("A001"),

    /**
     * International Capital Markets Association (ICMA) Social Bonds Principles.
     * 
     */
    @XmlEnumValue("F006")
    F_006("F006"),

    /**
     * Label "Investissement Socialement Responsable" (ISR).
     * 
     */
    @XmlEnumValue("K011")
    K_011("K011"),

    /**
     * Kein Verstoss gegen Atomwaffensperrvertrag.
     * 
     */
    @XmlEnumValue("J010")
    J_010("J010"),

    /**
     * LuxFLAG climate finance label.
     * 
     */
    @XmlEnumValue("H008")
    H_008("H008"),

    /**
     * LuxFLAG environment label.
     * 
     */
    @XmlEnumValue("I009")
    I_009("I009"),

    /**
     * LuxFLAG ESG label.
     * 
     */
    @XmlEnumValue("G007")
    G_007("G007"),

    /**
     * Nordic Swan Ecolabel.
     * 
     */
    @XmlEnumValue("N014")
    N_014("N014"),

    /**
     * UZ49 - das Oesterreichische Umweltzeichen.
     * 
     */
    @XmlEnumValue("M013")
    M_013("M013");
    private final String value;

    ESGLabelOrStandard1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ESGLabelOrStandard1Code fromValue(String v) {
        for (ESGLabelOrStandard1Code c: ESGLabelOrStandard1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
