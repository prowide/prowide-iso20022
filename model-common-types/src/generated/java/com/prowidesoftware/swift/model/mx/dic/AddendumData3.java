
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "AddendumData3", propOrder = {
    "purchsIdrTp",
    "othrPurchsIdrTp",
    "purchsIdr",
    "addtlAccptrData",
    "cstmr",
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
    "instlmt",
    "addtlData"
})
public class AddendumData3 {

    @XmlElement(name = "PurchsIdrTp")
    @XmlSchemaType(name = "string")
    protected PurchaseIdentifierType1Code purchsIdrTp;
    @XmlElement(name = "OthrPurchsIdrTp")
    protected String othrPurchsIdrTp;
    @XmlElement(name = "PurchsIdr")
    protected String purchsIdr;
    @XmlElement(name = "AddtlAccptrData")
    protected AdditionalAcceptorData1 addtlAccptrData;
    @XmlElement(name = "Cstmr")
    protected Customer4 cstmr;
    @XmlElement(name = "Sale")
    protected Sale2 sale;
    @XmlElement(name = "Fleet")
    protected FleetData4 fleet;
    @XmlElement(name = "Invc")
    protected Invoice2 invc;
    @XmlElement(name = "TrvlAgcy")
    protected List<TravelAgency3> trvlAgcy;
    @XmlElement(name = "PssngrTrnsprt")
    protected PassengerTransport2 pssngrTrnsprt;
    @XmlElement(name = "VhclRntl")
    protected List<VehicleRentalService2> vhclRntl;
    @XmlElement(name = "Ldgg")
    protected List<Lodging3> ldgg;
    @XmlElement(name = "ShppgData")
    protected ShippingData2 shppgData;
    @XmlElement(name = "TelecomSvcs")
    protected TelecomServices2 telecomSvcs;
    @XmlElement(name = "TempSvcs")
    protected List<TemporaryServices2> tempSvcs;
    @XmlElement(name = "Instlmt")
    protected Instalment4 instlmt;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

    /**
     * Gets the value of the purchsIdrTp property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseIdentifierType1Code }
     *     
     */
    public PurchaseIdentifierType1Code getPurchsIdrTp() {
        return purchsIdrTp;
    }

    /**
     * Sets the value of the purchsIdrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseIdentifierType1Code }
     *     
     */
    public AddendumData3 setPurchsIdrTp(PurchaseIdentifierType1Code value) {
        this.purchsIdrTp = value;
        return this;
    }

    /**
     * Gets the value of the othrPurchsIdrTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrPurchsIdrTp() {
        return othrPurchsIdrTp;
    }

    /**
     * Sets the value of the othrPurchsIdrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AddendumData3 setOthrPurchsIdrTp(String value) {
        this.othrPurchsIdrTp = value;
        return this;
    }

    /**
     * Gets the value of the purchsIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchsIdr() {
        return purchsIdr;
    }

    /**
     * Sets the value of the purchsIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AddendumData3 setPurchsIdr(String value) {
        this.purchsIdr = value;
        return this;
    }

    /**
     * Gets the value of the addtlAccptrData property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalAcceptorData1 }
     *     
     */
    public AdditionalAcceptorData1 getAddtlAccptrData() {
        return addtlAccptrData;
    }

    /**
     * Sets the value of the addtlAccptrData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalAcceptorData1 }
     *     
     */
    public AddendumData3 setAddtlAccptrData(AdditionalAcceptorData1 value) {
        this.addtlAccptrData = value;
        return this;
    }

    /**
     * Gets the value of the cstmr property.
     * 
     * @return
     *     possible object is
     *     {@link Customer4 }
     *     
     */
    public Customer4 getCstmr() {
        return cstmr;
    }

    /**
     * Sets the value of the cstmr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer4 }
     *     
     */
    public AddendumData3 setCstmr(Customer4 value) {
        this.cstmr = value;
        return this;
    }

    /**
     * Gets the value of the sale property.
     * 
     * @return
     *     possible object is
     *     {@link Sale2 }
     *     
     */
    public Sale2 getSale() {
        return sale;
    }

    /**
     * Sets the value of the sale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sale2 }
     *     
     */
    public AddendumData3 setSale(Sale2 value) {
        this.sale = value;
        return this;
    }

    /**
     * Gets the value of the fleet property.
     * 
     * @return
     *     possible object is
     *     {@link FleetData4 }
     *     
     */
    public FleetData4 getFleet() {
        return fleet;
    }

    /**
     * Sets the value of the fleet property.
     * 
     * @param value
     *     allowed object is
     *     {@link FleetData4 }
     *     
     */
    public AddendumData3 setFleet(FleetData4 value) {
        this.fleet = value;
        return this;
    }

    /**
     * Gets the value of the invc property.
     * 
     * @return
     *     possible object is
     *     {@link Invoice2 }
     *     
     */
    public Invoice2 getInvc() {
        return invc;
    }

    /**
     * Sets the value of the invc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Invoice2 }
     *     
     */
    public AddendumData3 setInvc(Invoice2 value) {
        this.invc = value;
        return this;
    }

    /**
     * Gets the value of the trvlAgcy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trvlAgcy property.
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
     * {@link TravelAgency3 }
     * 
     * 
     */
    public List<TravelAgency3> getTrvlAgcy() {
        if (trvlAgcy == null) {
            trvlAgcy = new ArrayList<TravelAgency3>();
        }
        return this.trvlAgcy;
    }

    /**
     * Gets the value of the pssngrTrnsprt property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerTransport2 }
     *     
     */
    public PassengerTransport2 getPssngrTrnsprt() {
        return pssngrTrnsprt;
    }

    /**
     * Sets the value of the pssngrTrnsprt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerTransport2 }
     *     
     */
    public AddendumData3 setPssngrTrnsprt(PassengerTransport2 value) {
        this.pssngrTrnsprt = value;
        return this;
    }

    /**
     * Gets the value of the vhclRntl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vhclRntl property.
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
     * {@link VehicleRentalService2 }
     * 
     * 
     */
    public List<VehicleRentalService2> getVhclRntl() {
        if (vhclRntl == null) {
            vhclRntl = new ArrayList<VehicleRentalService2>();
        }
        return this.vhclRntl;
    }

    /**
     * Gets the value of the ldgg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ldgg property.
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
     * {@link Lodging3 }
     * 
     * 
     */
    public List<Lodging3> getLdgg() {
        if (ldgg == null) {
            ldgg = new ArrayList<Lodging3>();
        }
        return this.ldgg;
    }

    /**
     * Gets the value of the shppgData property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingData2 }
     *     
     */
    public ShippingData2 getShppgData() {
        return shppgData;
    }

    /**
     * Sets the value of the shppgData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingData2 }
     *     
     */
    public AddendumData3 setShppgData(ShippingData2 value) {
        this.shppgData = value;
        return this;
    }

    /**
     * Gets the value of the telecomSvcs property.
     * 
     * @return
     *     possible object is
     *     {@link TelecomServices2 }
     *     
     */
    public TelecomServices2 getTelecomSvcs() {
        return telecomSvcs;
    }

    /**
     * Sets the value of the telecomSvcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelecomServices2 }
     *     
     */
    public AddendumData3 setTelecomSvcs(TelecomServices2 value) {
        this.telecomSvcs = value;
        return this;
    }

    /**
     * Gets the value of the tempSvcs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tempSvcs property.
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
     * {@link TemporaryServices2 }
     * 
     * 
     */
    public List<TemporaryServices2> getTempSvcs() {
        if (tempSvcs == null) {
            tempSvcs = new ArrayList<TemporaryServices2>();
        }
        return this.tempSvcs;
    }

    /**
     * Gets the value of the instlmt property.
     * 
     * @return
     *     possible object is
     *     {@link Instalment4 }
     *     
     */
    public Instalment4 getInstlmt() {
        return instlmt;
    }

    /**
     * Sets the value of the instlmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Instalment4 }
     *     
     */
    public AddendumData3 setInstlmt(Instalment4 value) {
        this.instlmt = value;
        return this;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlData property.
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
     * {@link AdditionalData1 }
     * 
     * 
     */
    public List<AdditionalData1> getAddtlData() {
        if (addtlData == null) {
            addtlData = new ArrayList<AdditionalData1>();
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
    public AddendumData3 addTrvlAgcy(TravelAgency3 trvlAgcy) {
        getTrvlAgcy().add(trvlAgcy);
        return this;
    }

    /**
     * Adds a new item to the vhclRntl list.
     * @see #getVhclRntl()
     * 
     */
    public AddendumData3 addVhclRntl(VehicleRentalService2 vhclRntl) {
        getVhclRntl().add(vhclRntl);
        return this;
    }

    /**
     * Adds a new item to the ldgg list.
     * @see #getLdgg()
     * 
     */
    public AddendumData3 addLdgg(Lodging3 ldgg) {
        getLdgg().add(ldgg);
        return this;
    }

    /**
     * Adds a new item to the tempSvcs list.
     * @see #getTempSvcs()
     * 
     */
    public AddendumData3 addTempSvcs(TemporaryServices2 tempSvcs) {
        getTempSvcs().add(tempSvcs);
        return this;
    }

    /**
     * Adds a new item to the addtlData list.
     * @see #getAddtlData()
     * 
     */
    public AddendumData3 addAddtlData(AdditionalData1 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

}
