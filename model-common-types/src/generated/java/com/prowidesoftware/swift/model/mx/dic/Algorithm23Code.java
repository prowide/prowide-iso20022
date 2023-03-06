
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Algorithm23Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Algorithm23Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EA2C"/&gt;
 *     &lt;enumeration value="E3DC"/&gt;
 *     &lt;enumeration value="EA9C"/&gt;
 *     &lt;enumeration value="EA5C"/&gt;
 *     &lt;enumeration value="EA2R"/&gt;
 *     &lt;enumeration value="EA9R"/&gt;
 *     &lt;enumeration value="EA5R"/&gt;
 *     &lt;enumeration value="E3DR"/&gt;
 *     &lt;enumeration value="E36C"/&gt;
 *     &lt;enumeration value="E36R"/&gt;
 *     &lt;enumeration value="SD5C"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Algorithm23Code")
@XmlEnum
public enum Algorithm23Code {


    /**
     * AES (Advanced Encryption Standard) CBC (Chaining Block Cypher) encryption with a 128 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).
     * 
     */
    @XmlEnumValue("EA2C")
    EA_2_C("EA2C"),

    /**
     * Triple DES (Data Encryption Standard) CBC (Chaining Block Cypher) encryption with double length key (112 Bit) as defined in FIPS PUB 46-3 - (ASN.1 Object Identifier: des-ede3-cbc).
     * 
     */
    @XmlEnumValue("E3DC")
    E_3_DC("E3DC"),

    /**
     * AES (Advanced Encryption Standard) CBC (Chaining Block Cypher) encryption with a 192 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 – November 6, 2001 - Advanced Encryption Standard).
     * 
     */
    @XmlEnumValue("EA9C")
    EA_9_C("EA9C"),

    /**
     * AES (Advanced Encryption Standard) CBC (Chaining Block Cypher) encryption with a 256 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 – November 6, 2001 - Advanced Encryption Standard).
     * 
     */
    @XmlEnumValue("EA5C")
    EA_5_C("EA5C"),

    /**
     * AES (Advanced Encryption Standard) CTR (Counter) encryption with a 128 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).
     * 
     */
    @XmlEnumValue("EA2R")
    EA_2_R("EA2R"),

    /**
     * AES (Advanced Encryption Standard) CTR (Counter) encryption with a 192 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).
     * 
     */
    @XmlEnumValue("EA9R")
    EA_9_R("EA9R"),

    /**
     * AES (Advanced Encryption Standard) CTR (Counter) encryption with a 256 bits cryptographic key as defined by the Federal Information Processing Standards (FIPS 197 - November 6, 2001 - Advanced Encryption Standard).
     * 
     */
    @XmlEnumValue("EA5R")
    EA_5_R("EA5R"),

    /**
     * Triple DES (Data Encryption Standard) CTR (Counter) encryption with double length key (112 Bit) as defined in FIPS SP 800-38a.
     * 
     */
    @XmlEnumValue("E3DR")
    E_3_DR("E3DR"),

    /**
     * Triple DES (Data Encryption Standard) CBC (Chaining Block Cypher) encryption with triple length key (168 Bit) as defined in FIPS PUB 46-3 - (ASN.1 Object Identifier: des-ede3-cbc).
     * 
     */
    @XmlEnumValue("E36C")
    E_36_C("E36C"),

    /**
     * Triple DES (Data Encryption Standard) CTR (Counter) encryption with triple length key (168 Bit) as defined in FIPS SP 800-38a.
     * 
     */
    @XmlEnumValue("E36R")
    E_36_R("E36R"),

    /**
     * The DEPRECATED Simple DES (Data Encryption Standard) CBC (Chaining Block Cypher) encryption with simple length key (56 Bit) as defined in FIPS PUB 81 - (ASN.1 Object Identifier: des-cbc).
     * 
     */
    @XmlEnumValue("SD5C")
    SD_5_C("SD5C");
    private final String value;

    Algorithm23Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Algorithm23Code fromValue(String v) {
        for (Algorithm23Code c: Algorithm23Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
