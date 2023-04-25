
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherAsset2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="OtherAsset2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DIMA"/>
 *     <enumeration value="EXIA"/>
 *     <enumeration value="MOVE"/>
 *     <enumeration value="PROP"/>
 *     <enumeration value="TIPP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OtherAsset2Code")
@XmlEnum
public enum OtherAsset2Code {


    /**
     * Asset is a discretionary investment manager account
     * 
     */
    DIMA,

    /**
     * Asset is an external investment account.
     * 
     */
    EXIA,

    /**
     * Property that is not real estate. Also known as 'movable chattels'.
     * 
     */
    MOVE,

    /**
     * Property that is real estate.
     * 
     */
    PROP,

    /**
     * Asset is a trustee investment plan (TIP).
     * 
     */
    TIPP;

    public String value() {
        return name();
    }

    public static OtherAsset2Code fromValue(String v) {
        return valueOf(v);
    }

}
