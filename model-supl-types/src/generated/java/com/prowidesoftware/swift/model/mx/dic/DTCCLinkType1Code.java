
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DTCCLinkType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DTCCLinkType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="COEV"/&gt;
 *     &lt;enumeration value="DUPE"/&gt;
 *     &lt;enumeration value="CHMA"/&gt;
 *     &lt;enumeration value="CHVO"/&gt;
 *     &lt;enumeration value="FRSE"/&gt;
 *     &lt;enumeration value="HYBS"/&gt;
 *     &lt;enumeration value="ISEV"/&gt;
 *     &lt;enumeration value="IUNS"/&gt;
 *     &lt;enumeration value="TONU"/&gt;
 *     &lt;enumeration value="MMKT"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DTCCLinkType1Code")
@XmlEnum
public enum DTCCLinkType1Code {


    /**
     * Events that are concurrent and affect the same underlying security (for example: Stock Split followed by a Reverse Split).
     * 
     */
    COEV,

    /**
     * Events (event records) are duplicate of each other.
     * 
     */
    DUPE,

    /**
     * Events that are consecutive and evolve from a Voluntary Event to a Mandatory Event but of the same basic GCA (Global Corporate Actions validation service) event type. For example Exchange - Voluntary to Exchange - Mandatory.  Note: The old and new events should not overlap and the older event will remain in an "approved" state.
     * 
     */
    CHMA,

    /**
     * Event that are consecutive and evolve from a Mandatory Event to a voluntary event (for example Merger-Mandatory becomes a Merger-Voluntary).
     * 
     */
    CHVO,

    /**
     * Events are linked because of fractional security.
     * 
     */
    FRSE,

    /**
     * Events are linked because of underlying security is part of hybrid security. Hybrid securities have underlying securities. As an example Telecom hybrid security is made of various Telecom securities, example ATT, Verizon etc. When there is a dividend on the underlying security the hybrid pays as well. Announcements are linked under the hybrid security payment announcement to the underlying security that is paying that event. This is the way the holders of the hybrid are informed where this income is being derived from, since on many occasions there can be multiple announcements under the hybrid at the same time since the underlying securities are paying a distribution.
     * 
     */
    HYBS,

    /**
     * Events are linked because of an intermediary security (for example Rights Distribution to a Rights Subscription; Rights Subscription to an Assimilation).
     * 
     */
    ISEV,

    /**
     * Events are linked because of insured or uninsured securities. In the market there are many securities where a municipality or issuer will insure a portion of their outstanding principal. It technically is the same security, however, there are two different CUSIPs one for the insured piece and the other for the un insured part.
     * 
     */
    IUNS,

    /**
     * Event that are consecutive but of a different GCA (Global Corporate actions validation service) event type. For example Tender converts to Merger Voluntary when 429 Notice issued.  Note: the old and new events should not overlap and the older event will remain in an "approved" state.
     * 
     */
    TONU,

    /**
     * Events are linked because event security is listed in another market under another market security.
     * 
     */
    MMKT,

    /**
     * Cannot be classified by any of the link types.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static DTCCLinkType1Code fromValue(String v) {
        return valueOf(v);
    }

}
