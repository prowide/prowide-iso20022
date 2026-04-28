
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "PassengerTransport1", propOrder = {
    "summry",
    "tripLeg",
    "ancllryPurchs",
    "hirdVhclDtls"
})
public class PassengerTransport1 {

    @XmlElement(name = "Summry")
    protected PassengerTransportSummary1 summry;
    @XmlElement(name = "TripLeg")
    protected List<TripLeg1> tripLeg;
    @XmlElement(name = "AncllryPurchs")
    protected List<AncillaryPurchase1> ancllryPurchs;
    @XmlElement(name = "HirdVhclDtls")
    protected List<HiredVehicle1> hirdVhclDtls;

    /**
     * Gets the value of the summry property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerTransportSummary1 }
     *     
     */
    public PassengerTransportSummary1 getSummry() {
        return summry;
    }

    /**
     * Sets the value of the summry property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerTransportSummary1 }
     *     
     */
    public PassengerTransport1 setSummry(PassengerTransportSummary1 value) {
        this.summry = value;
        return this;
    }

    /**
     * Gets the value of the tripLeg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tripLeg property.
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
     * {@link TripLeg1 }
     * 
     * 
     */
    public List<TripLeg1> getTripLeg() {
        if (tripLeg == null) {
            tripLeg = new ArrayList<TripLeg1>();
        }
        return this.tripLeg;
    }

    /**
     * Gets the value of the ancllryPurchs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ancllryPurchs property.
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
     * {@link AncillaryPurchase1 }
     * 
     * 
     */
    public List<AncillaryPurchase1> getAncllryPurchs() {
        if (ancllryPurchs == null) {
            ancllryPurchs = new ArrayList<AncillaryPurchase1>();
        }
        return this.ancllryPurchs;
    }

    /**
     * Gets the value of the hirdVhclDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hirdVhclDtls property.
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
     * {@link HiredVehicle1 }
     * 
     * 
     */
    public List<HiredVehicle1> getHirdVhclDtls() {
        if (hirdVhclDtls == null) {
            hirdVhclDtls = new ArrayList<HiredVehicle1>();
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
    public PassengerTransport1 addTripLeg(TripLeg1 tripLeg) {
        getTripLeg().add(tripLeg);
        return this;
    }

    /**
     * Adds a new item to the ancllryPurchs list.
     * @see #getAncllryPurchs()
     * 
     */
    public PassengerTransport1 addAncllryPurchs(AncillaryPurchase1 ancllryPurchs) {
        getAncllryPurchs().add(ancllryPurchs);
        return this;
    }

    /**
     * Adds a new item to the hirdVhclDtls list.
     * @see #getHirdVhclDtls()
     * 
     */
    public PassengerTransport1 addHirdVhclDtls(HiredVehicle1 hirdVhclDtls) {
        getHirdVhclDtls().add(hirdVhclDtls);
        return this;
    }

}
