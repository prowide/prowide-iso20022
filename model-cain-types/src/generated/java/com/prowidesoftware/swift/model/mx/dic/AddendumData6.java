
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
@XmlType(name = "AddendumData6", propOrder = {
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
    "addtlData"
})
public class AddendumData6 {

    @XmlElement(name = "Sale")
    protected Sale3 sale;
    @XmlElement(name = "Fleet")
    protected FleetData6 fleet;
    @XmlElement(name = "Invc")
    protected Invoice3 invc;
    @XmlElement(name = "TrvlAgcy")
    protected List<TravelAgency4> trvlAgcy;
    @XmlElement(name = "PssngrTrnsprt")
    protected PassengerTransport3 pssngrTrnsprt;
    @XmlElement(name = "VhclRntl")
    protected List<VehicleRentalService3> vhclRntl;
    @XmlElement(name = "Ldgg")
    protected List<Lodging4> ldgg;
    @XmlElement(name = "ShppgData")
    protected ShippingData3 shppgData;
    @XmlElement(name = "TelecomSvcs")
    protected TelecomServices3 telecomSvcs;
    @XmlElement(name = "TempSvcs")
    protected List<TemporaryServices3> tempSvcs;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData2> addtlData;

    /**
     * Gets the value of the sale property.
     * 
     * @return
     *     possible object is
     *     {@link Sale3 }
     *     
     */
    public Sale3 getSale() {
        return sale;
    }

    /**
     * Sets the value of the sale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sale3 }
     *     
     */
    public AddendumData6 setSale(Sale3 value) {
        this.sale = value;
        return this;
    }

    /**
     * Gets the value of the fleet property.
     * 
     * @return
     *     possible object is
     *     {@link FleetData6 }
     *     
     */
    public FleetData6 getFleet() {
        return fleet;
    }

    /**
     * Sets the value of the fleet property.
     * 
     * @param value
     *     allowed object is
     *     {@link FleetData6 }
     *     
     */
    public AddendumData6 setFleet(FleetData6 value) {
        this.fleet = value;
        return this;
    }

    /**
     * Gets the value of the invc property.
     * 
     * @return
     *     possible object is
     *     {@link Invoice3 }
     *     
     */
    public Invoice3 getInvc() {
        return invc;
    }

    /**
     * Sets the value of the invc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Invoice3 }
     *     
     */
    public AddendumData6 setInvc(Invoice3 value) {
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
     * {@link TravelAgency4 }
     * 
     * 
     * @return
     *     The value of the trvlAgcy property.
     */
    public List<TravelAgency4> getTrvlAgcy() {
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
     *     {@link PassengerTransport3 }
     *     
     */
    public PassengerTransport3 getPssngrTrnsprt() {
        return pssngrTrnsprt;
    }

    /**
     * Sets the value of the pssngrTrnsprt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerTransport3 }
     *     
     */
    public AddendumData6 setPssngrTrnsprt(PassengerTransport3 value) {
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
     * {@link VehicleRentalService3 }
     * 
     * 
     * @return
     *     The value of the vhclRntl property.
     */
    public List<VehicleRentalService3> getVhclRntl() {
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
     * {@link Lodging4 }
     * 
     * 
     * @return
     *     The value of the ldgg property.
     */
    public List<Lodging4> getLdgg() {
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
     *     {@link ShippingData3 }
     *     
     */
    public ShippingData3 getShppgData() {
        return shppgData;
    }

    /**
     * Sets the value of the shppgData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingData3 }
     *     
     */
    public AddendumData6 setShppgData(ShippingData3 value) {
        this.shppgData = value;
        return this;
    }

    /**
     * Gets the value of the telecomSvcs property.
     * 
     * @return
     *     possible object is
     *     {@link TelecomServices3 }
     *     
     */
    public TelecomServices3 getTelecomSvcs() {
        return telecomSvcs;
    }

    /**
     * Sets the value of the telecomSvcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelecomServices3 }
     *     
     */
    public AddendumData6 setTelecomSvcs(TelecomServices3 value) {
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
     * {@link TemporaryServices3 }
     * 
     * 
     * @return
     *     The value of the tempSvcs property.
     */
    public List<TemporaryServices3> getTempSvcs() {
        if (tempSvcs == null) {
            tempSvcs = new ArrayList<>();
        }
        return this.tempSvcs;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData2 }
     * 
     * 
     * @return
     *     The value of the addtlData property.
     */
    public List<AdditionalData2> getAddtlData() {
        if (addtlData == null) {
            addtlData = new ArrayList<>();
        }
        return this.addtlData;
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
    public AddendumData6 addTrvlAgcy(TravelAgency4 trvlAgcy) {
        getTrvlAgcy().add(trvlAgcy);
        return this;
    }

    /**
     * Adds a new item to the vhclRntl list.
     * @see #getVhclRntl()
     * 
     */
    public AddendumData6 addVhclRntl(VehicleRentalService3 vhclRntl) {
        getVhclRntl().add(vhclRntl);
        return this;
    }

    /**
     * Adds a new item to the ldgg list.
     * @see #getLdgg()
     * 
     */
    public AddendumData6 addLdgg(Lodging4 ldgg) {
        getLdgg().add(ldgg);
        return this;
    }

    /**
     * Adds a new item to the tempSvcs list.
     * @see #getTempSvcs()
     * 
     */
    public AddendumData6 addTempSvcs(TemporaryServices3 tempSvcs) {
        getTempSvcs().add(tempSvcs);
        return this;
    }

    /**
     * Adds a new item to the addtlData list.
     * @see #getAddtlData()
     * 
     */
    public AddendumData6 addAddtlData(AdditionalData2 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

}
