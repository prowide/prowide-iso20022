
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventToNotify2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EventToNotify2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ABRT"/&gt;
 *     &lt;enumeration value="MAIB"/&gt;
 *     &lt;enumeration value="CRDI"/&gt;
 *     &lt;enumeration value="COMP"/&gt;
 *     &lt;enumeration value="CRDR"/&gt;
 *     &lt;enumeration value="CUSL"/&gt;
 *     &lt;enumeration value="MAIE"/&gt;
 *     &lt;enumeration value="INIT"/&gt;
 *     &lt;enumeration value="KEYP"/&gt;
 *     &lt;enumeration value="MAIR"/&gt;
 *     &lt;enumeration value="OODR"/&gt;
 *     &lt;enumeration value="SADM"/&gt;
 *     &lt;enumeration value="SWUP"/&gt;
 *     &lt;enumeration value="SECA"/&gt;
 *     &lt;enumeration value="SHUT"/&gt;
 *     &lt;enumeration value="SASS"/&gt;
 *     &lt;enumeration value="DISC"/&gt;
 *     &lt;enumeration value="CNTN"/&gt;
 *     &lt;enumeration value="TNOK"/&gt;
 *     &lt;enumeration value="TNKO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
