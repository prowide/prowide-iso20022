
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashAssetType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CashAssetType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CSH2"/&gt;
 *     &lt;enumeration value="CSH1"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CashAssetType1Code")
@XmlEnum
public enum CashAssetType1Code {


    /**
     * Cash is cash in the holding not yet invested.
     * 
     */
    @XmlEnumValue("CSH2")
    CSH_2("CSH2"),

    /**
     * Cash is attributed to a cash investment.
     * 
     */
    @XmlEnumValue("CSH1")
    CSH_1("CSH1");
    private final String value;

    CashAssetType1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CashAssetType1Code fromValue(String v) {
        for (CashAssetType1Code c: CashAssetType1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
