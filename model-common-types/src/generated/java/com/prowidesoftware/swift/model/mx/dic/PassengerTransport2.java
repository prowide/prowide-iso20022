
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Passenger ticket information for the cardholder. 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerTransport2", propOrder = {
    "summry",
    "tripLeg",
    "ancllryPurchs",
    "hirdVhclDtls"
})
public class PassengerTransport2 {

    @XmlElement(name = "Summry")
    protected PassengerTransportSummary2 summry;
    @XmlElement(name = "TripLeg")
    protected List<TripLeg2> tripLeg;
    @XmlElement(name = "AncllryPurchs")
    protected List<AncillaryPurchase2> ancllryPurchs;
    @XmlElement(name = "HirdVhclDtls")
    protected List<HiredVehicle2> hirdVhclDtls;

    /**
     * Gets the value of the summry property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerTransportSummary2 }
     *     
     */
    public PassengerTransportSummary2 getSummry() {
        return summry;
    }

    /**
     * Sets the value of the summry property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerTransportSummary2 }
     *     
     */
    public PassengerTransport2 setSummry(PassengerTransportSummary2 value) {
        this.summry = value;
        return this;
    }

    /**
     * Gets the value of the tripLeg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tripLeg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTripLeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TripLeg2 }
     * 
     * 
     * @return
     *     The value of the tripLeg property.
     */
    public List<TripLeg2> getTripLeg() {
        if (tripLeg == null) {
            tripLeg = new ArrayList<>();
        }
        return this.tripLeg;
    }

    /**
     * Gets the value of the ancllryPurchs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ancllryPurchs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAncllryPurchs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AncillaryPurchase2 }
     * 
     * 
     * @return
     *     The value of the ancllryPurchs property.
     */
    public List<AncillaryPurchase2> getAncllryPurchs() {
        if (ancllryPurchs == null) {
            ancllryPurchs = new ArrayList<>();
        }
        return this.ancllryPurchs;
    }

    /**
     * Gets the value of the hirdVhclDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the hirdVhclDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHirdVhclDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HiredVehicle2 }
     * 
     * 
     * @return
     *     The value of the hirdVhclDtls property.
     */
    public List<HiredVehicle2> getHirdVhclDtls() {
        if (hirdVhclDtls == null) {
            hirdVhclDtls = new ArrayList<>();
        }
        return this.hirdVhclDtls;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * Adds a new item to the tripLeg list.
     * @see #getTripLeg()
     * 
     */
    public PassengerTransport2 addTripLeg(TripLeg2 tripLeg) {
        getTripLeg().add(tripLeg);
        return this;
    }

    /**
     * Adds a new item to the ancllryPurchs list.
     * @see #getAncllryPurchs()
     * 
     */
    public PassengerTransport2 addAncllryPurchs(AncillaryPurchase2 ancllryPurchs) {
        getAncllryPurchs().add(ancllryPurchs);
        return this;
    }

    /**
     * Adds a new item to the hirdVhclDtls list.
     * @see #getHirdVhclDtls()
     * 
     */
    public PassengerTransport2 addHirdVhclDtls(HiredVehicle2 hirdVhclDtls) {
        getHirdVhclDtls().add(hirdVhclDtls);
        return this;
    }

}
