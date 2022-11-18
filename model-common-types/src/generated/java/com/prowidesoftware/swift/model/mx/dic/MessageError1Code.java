
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageError1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageError1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="IDEF"/&gt;
 *     &lt;enumeration value="IDEL"/&gt;
 *     &lt;enumeration value="IDEV"/&gt;
 *     &lt;enumeration value="INME"/&gt;
 *     &lt;enumeration value="INMF"/&gt;
 *     &lt;enumeration value="MEPE"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="PRVE"/&gt;
 *     &lt;enumeration value="RDEM"/&gt;
 *     &lt;enumeration value="SECU"/&gt;
 *     &lt;enumeration value="UDFD"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="ITDE"/&gt;
 *     &lt;enumeration value="DUME"/&gt;
 *     &lt;enumeration value="IDWM"/&gt;
 *     &lt;enumeration value="IDRM"/&gt;
 *     &lt;enumeration value="IBAT"/&gt;
 *     &lt;enumeration value="ICOL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
