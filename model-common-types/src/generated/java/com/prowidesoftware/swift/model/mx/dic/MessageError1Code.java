
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageError1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MessageError1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="IDEF"/>
 *     <enumeration value="IDEL"/>
 *     <enumeration value="IDEV"/>
 *     <enumeration value="INME"/>
 *     <enumeration value="INMF"/>
 *     <enumeration value="MEPE"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="PRVE"/>
 *     <enumeration value="RDEM"/>
 *     <enumeration value="SECU"/>
 *     <enumeration value="UDFD"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="ITDE"/>
 *     <enumeration value="DUME"/>
 *     <enumeration value="IDWM"/>
 *     <enumeration value="IDRM"/>
 *     <enumeration value="IBAT"/>
 *     <enumeration value="ICOL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MessageError1Code")
@XmlEnum
public enum MessageError1Code {


    /**
     * Invalid data element format
     * 
     */
    IDEF,

    /**
     * Invalid data element length
     * 
     */
    IDEL,

    /**
     * Invalid data element value
     * 
     */
    IDEV,

    /**
     * Invalid message
     * 
     */
    INME,

    /**
     * Invalid Message Function
     * 
     */
    INMF,

    /**
     * Message Parse Error
     * 
     */
    MEPE,

    /**
     * Other reason to reject a message defined at private level.
     * 
     */
    OTHP,

    /**
     * Protocol Version
     * 
     */
    PRVE,

    /**
     * Required data element missing
     * 
     */
    RDEM,

    /**
     * Security
     * 
     */
    SECU,

    /**
     * Error that is not defined in the Message type Error and is not OtherNational or OtherPrivate Error 
     * 
     */
    UDFD,

    /**
     * Other reason defined at national level to reject a message.
     * 
     */
    OTHN,

    /**
     * Iterative data error
     * 
     */
    ITDE,

    /**
     * Duplicate Message
     * 
     */
    DUME,

    /**
     * Inconsistent data within message
     * 
     */
    IDWM,

    /**
     * Inconsistent data with related message
     * 
     */
    IDRM,

    /**
     * Invalid Batch
     * 
     */
    IBAT,

    /**
     * Invalid Collection
     * 
     */
    ICOL;

    public String value() {
        return name();
    }

    public static MessageError1Code fromValue(String v) {
        return valueOf(v);
    }

}
