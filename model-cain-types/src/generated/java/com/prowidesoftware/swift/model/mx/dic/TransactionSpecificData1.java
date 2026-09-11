
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
 * Component contains data structures applicable to certain merchant verticals that require industry-specific data within transaction messages. 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionSpecificData1", propOrder = {
    "sale",
    "fleet",
    "invc",
    "trvlAgcy",
    "pssngrTrnsprt",
    "vhclRntl",
    "ldgg",
    "shppgData",
    "telecomSvcs",
    "tempSvcs",
    "prvtData",
    "ntlData"
})
public class TransactionSpecificData1 {

    @XmlElement(name = "Sale")
    protected Sale4 sale;
    @XmlElement(name = "Fleet")
    protected FleetData7 fleet;
    @XmlElement(name = "Invc")
    protected Invoice4 invc;
    @XmlElement(name = "TrvlAgcy")
    protected List<TravelAgency5> trvlAgcy;
    @XmlElement(name = "PssngrTrnsprt")
    protected PassengerTransport4 pssngrTrnsprt;
    @XmlElement(name = "VhclRntl")
    protected List<VehicleRentalService4> vhclRntl;
    @XmlElement(name = "Ldgg")
    protected List<Lodging5> ldgg;
    @XmlElement(name = "ShppgData")
    protected ShippingData4 shppgData;
    @XmlElement(name = "TelecomSvcs")
    protected TelecomServices4 telecomSvcs;
    @XmlElement(name = "TempSvcs")
    protected List<TemporaryServices4> tempSvcs;
    @XmlElement(name = "PrvtData")
    protected List<ATICALaxProcessing> prvtData;
    @XmlElement(name = "NtlData")
    protected List<ATICALaxProcessing> ntlData;

    /**
     * Gets the value of the sale property.
     * 
     * @return
     *     possible object is
     *     {@link Sale4 }
     *     
     */
    public Sale4 getSale() {
        return sale;
    }

    /**
     * Sets the value of the sale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sale4 }
     *     
     */
    public TransactionSpecificData1 setSale(Sale4 value) {
        this.sale = value;
        return this;
    }

    /**
     * Gets the value of the fleet property.
     * 
     * @return
     *     possible object is
     *     {@link FleetData7 }
     *     
     */
    public FleetData7 getFleet() {
        return fleet;
    }

    /**
     * Sets the value of the fleet property.
     * 
     * @param value
     *     allowed object is
     *     {@link FleetData7 }
     *     
     */
    public TransactionSpecificData1 setFleet(FleetData7 value) {
        this.fleet = value;
        return this;
    }

    /**
     * Gets the value of the invc property.
     * 
     * @return
     *     possible object is
     *     {@link Invoice4 }
     *     
     */
    public Invoice4 getInvc() {
        return invc;
    }

    /**
     * Sets the value of the invc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Invoice4 }
     *     
     */
    public TransactionSpecificData1 setInvc(Invoice4 value) {
        this.invc = value;
        return this;
    }

    /**
     * Gets the value of the trvlAgcy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the trvlAgcy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrvlAgcy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelAgency5 }
     * 
     * 
     * @return
     *     The value of the trvlAgcy property.
     */
    public List<TravelAgency5> getTrvlAgcy() {
        if (trvlAgcy == null) {
            trvlAgcy = new ArrayList<>();
        }
        return this.trvlAgcy;
    }

    /**
     * Gets the value of the pssngrTrnsprt property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerTransport4 }
     *     
     */
    public PassengerTransport4 getPssngrTrnsprt() {
        return pssngrTrnsprt;
    }

    /**
     * Sets the value of the pssngrTrnsprt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerTransport4 }
     *     
     */
    public TransactionSpecificData1 setPssngrTrnsprt(PassengerTransport4 value) {
        this.pssngrTrnsprt = value;
        return this;
    }

    /**
     * Gets the value of the vhclRntl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the vhclRntl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVhclRntl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleRentalService4 }
     * 
     * 
     * @return
     *     The value of the vhclRntl property.
     */
    public List<VehicleRentalService4> getVhclRntl() {
        if (vhclRntl == null) {
            vhclRntl = new ArrayList<>();
        }
        return this.vhclRntl;
    }

    /**
     * Gets the value of the ldgg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ldgg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLdgg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Lodging5 }
     * 
     * 
     * @return
     *     The value of the ldgg property.
     */
    public List<Lodging5> getLdgg() {
        if (ldgg == null) {
            ldgg = new ArrayList<>();
        }
        return this.ldgg;
    }

    /**
     * Gets the value of the shppgData property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingData4 }
     *     
     */
    public ShippingData4 getShppgData() {
        return shppgData;
    }

    /**
     * Sets the value of the shppgData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingData4 }
     *     
     */
    public TransactionSpecificData1 setShppgData(ShippingData4 value) {
        this.shppgData = value;
        return this;
    }

    /**
     * Gets the value of the telecomSvcs property.
     * 
     * @return
     *     possible object is
     *     {@link TelecomServices4 }
     *     
     */
    public TelecomServices4 getTelecomSvcs() {
        return telecomSvcs;
    }

    /**
     * Sets the value of the telecomSvcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelecomServices4 }
     *     
     */
    public TransactionSpecificData1 setTelecomSvcs(TelecomServices4 value) {
        this.telecomSvcs = value;
        return this;
    }

    /**
     * Gets the value of the tempSvcs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tempSvcs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTempSvcs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TemporaryServices4 }
     * 
     * 
     * @return
     *     The value of the tempSvcs property.
     */
    public List<TemporaryServices4> getTempSvcs() {
        if (tempSvcs == null) {
            tempSvcs = new ArrayList<>();
        }
        return this.tempSvcs;
    }

    /**
     * Gets the value of the prvtData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prvtData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrvtData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATICALaxProcessing }
     * 
     * 
     * @return
     *     The value of the prvtData property.
     */
    public List<ATICALaxProcessing> getPrvtData() {
        if (prvtData == null) {
            prvtData = new ArrayList<>();
        }
        return this.prvtData;
    }

    /**
     * Gets the value of the ntlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATICALaxProcessing }
     * 
     * 
     * @return
     *     The value of the ntlData property.
     */
    public List<ATICALaxProcessing> getNtlData() {
        if (ntlData == null) {
            ntlData = new ArrayList<>();
        }
        return this.ntlData;
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
     * Adds a new item to the trvlAgcy list.
     * @see #getTrvlAgcy()
     * 
     */
    public TransactionSpecificData1 addTrvlAgcy(TravelAgency5 trvlAgcy) {
        getTrvlAgcy().add(trvlAgcy);
        return this;
    }

    /**
     * Adds a new item to the vhclRntl list.
     * @see #getVhclRntl()
     * 
     */
    public TransactionSpecificData1 addVhclRntl(VehicleRentalService4 vhclRntl) {
        getVhclRntl().add(vhclRntl);
        return this;
    }

    /**
     * Adds a new item to the ldgg list.
     * @see #getLdgg()
     * 
     */
    public TransactionSpecificData1 addLdgg(Lodging5 ldgg) {
        getLdgg().add(ldgg);
        return this;
    }

    /**
     * Adds a new item to the tempSvcs list.
     * @see #getTempSvcs()
     * 
     */
    public TransactionSpecificData1 addTempSvcs(TemporaryServices4 tempSvcs) {
        getTempSvcs().add(tempSvcs);
        return this;
    }

    /**
     * Adds a new item to the prvtData list.
     * @see #getPrvtData()
     * 
     */
    public TransactionSpecificData1 addPrvtData(ATICALaxProcessing prvtData) {
        getPrvtData().add(prvtData);
        return this;
    }

    /**
     * Adds a new item to the ntlData list.
     * @see #getNtlData()
     * 
     */
    public TransactionSpecificData1 addNtlData(ATICALaxProcessing ntlData) {
        getNtlData().add(ntlData);
        return this;
    }

}
