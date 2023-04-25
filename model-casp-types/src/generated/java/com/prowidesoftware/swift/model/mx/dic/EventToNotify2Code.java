
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventToNotify2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="EventToNotify2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ABRT"/>
 *     <enumeration value="MAIB"/>
 *     <enumeration value="CRDI"/>
 *     <enumeration value="COMP"/>
 *     <enumeration value="CRDR"/>
 *     <enumeration value="CUSL"/>
 *     <enumeration value="MAIE"/>
 *     <enumeration value="INIT"/>
 *     <enumeration value="KEYP"/>
 *     <enumeration value="MAIR"/>
 *     <enumeration value="OODR"/>
 *     <enumeration value="SADM"/>
 *     <enumeration value="SWUP"/>
 *     <enumeration value="SECA"/>
 *     <enumeration value="SHUT"/>
 *     <enumeration value="SASS"/>
 *     <enumeration value="DISC"/>
 *     <enumeration value="CNTN"/>
 *     <enumeration value="TNOK"/>
 *     <enumeration value="TNKO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EventToNotify2Code")
@XmlEnum
public enum EventToNotify2Code {


    /**
     * One or several device request has been sent by the POI during the processing of a service requested by the Sale System. The processing is cancelled by the Customer or stopped by the POI. If the device response is not received by the POI, an event is sent to inform the Sale to abort internally these device requests.
     * 
     */
    ABRT,

    /**
     * Begin of POI Maintenance.
     * 
     */
    MAIB,

    /**
     * A card is inserted in the card reader (see Input request and NotifyCardInputFlag).
     * 
     */
    CRDI,

    /**
     * An Abort request has been sent to abort a message which is already completed.
     * 
     */
    COMP,

    /**
     * A card is removed from the card reader.
     * 
     */
    CRDR,

    /**
     * The customer has selected a different language on the POI.
     * 
     */
    CUSL,

    /**
     * End of POI Maintenance.
     * 
     */
    MAIE,

    /**
     * The POI Terminal or the POI System is now ready to work.
     * 
     */
    INIT,

    /**
     * The customer has pressed a specific key on the POI.
     * 
     */
    KEYP,

    /**
     * Maintenance required by the POI.
     * 
     */
    MAIR,

    /**
     * The POI Terminal or the POI System cannot work.
     * 
     */
    OODR,

    /**
     * The POI has performed, or want to perform an automatic administrative process, e.g. the reports at the end of day.
     * 
     */
    SADM,

    /**
     * A POI terminal requests the payment of the transaction identified by the content of EventDetails in the Event notification.
     * 
     */
    SWUP,

    /**
     * Problem of security.
     * 
     */
    SECA,

    /**
     * The POI Terminal or the POI System is shutting down.
     * 
     */
    SHUT,

    /**
     * When the Customer assistance is stopped, because the Customer has completed its input.
     * 
     */
    SASS,

    /**
     * A disconnection occurred.
     * 
     */
    DISC,

    /**
     * Connection has been set up.
     * 
     */
    CNTN,

    /**
     * Transaction has been processed and approved by the POI.
     * 
     */
    TNOK,

    /**
     * Transaction has been processed but has been declined.
     * 
     */
    TNKO;

    public String value() {
        return name();
    }

    public static EventToNotify2Code fromValue(String v) {
        return valueOf(v);
    }

}
