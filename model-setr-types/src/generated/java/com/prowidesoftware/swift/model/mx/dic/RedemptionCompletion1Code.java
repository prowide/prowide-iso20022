
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RedemptionCompletion1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RedemptionCompletion1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RED0"/&gt;
 *     &lt;enumeration value="RED1"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RedemptionCompletion1Code")
@XmlEnum
public enum RedemptionCompletion1Code {


    /**
     * It is not necessary to send more redemption order instructions to the executing party to complete the redemption, the executing will generate redemption confirmations automatically.
     * 
     */
    @XmlEnumValue("RED0")
    RED_0("RED0"),

    /**
     * Additional redemption order instructions must be sent to the executing party order to have the rest of the redemption executed.
     * 
     */
    @XmlEnumValue("RED1")
    RED_1("RED1");
    private final String value;

    RedemptionCompletion1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RedemptionCompletion1Code fromValue(String v) {
        for (RedemptionCompletion1Code c: RedemptionCompletion1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
