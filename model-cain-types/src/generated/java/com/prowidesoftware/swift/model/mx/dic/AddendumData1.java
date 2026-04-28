
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
@XmlType(name = "AddendumData1", propOrder = {
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
public class AddendumData1 {

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
    protected Sale1 sale;
    @XmlElement(name = "Fleet")
    protected FleetData2 fleet;
    @XmlElement(name = "Invc")
    protected Invoice1 invc;
    @XmlElement(name = "TrvlAgcy")
    protected TravelAgency2 trvlAgcy;
    @XmlElement(name = "PssngrTrnsprt")
    protected PassengerTransport1 pssngrTrnsprt;
    @XmlElement(name = "VhclRntl")
    protected List<VehicleRentalService1> vhclRntl;
    @XmlElement(name = "Ldgg")
    protected List<Lodging2> ldgg;
    @XmlElement(name = "ShppgData")
    protected ShippingData1 shppgData;
    @XmlElement(name = "TelecomSvcs")
    protected TelecomServices1 telecomSvcs;
    @XmlElement(name = "TempSvcs")
    protected List<TemporaryServices1> tempSvcs;
    @XmlElement(name = "Instlmt")
    protected Instalment3 instlmt;
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
    public AddendumData1 setPurchsIdrTp(PurchaseIdentifierType1Code value) {
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
    public AddendumData1 setOthrPurchsIdrTp(String value) {
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
    public AddendumData1 setPurchsIdr(String value) {
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
    public AddendumData1 setAddtlAccptrData(AdditionalAcceptorData1 value) {
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
    public AddendumData1 setCstmr(Customer4 value) {
        this.cstmr = value;
        return this;
    }

    /**
     * Gets the value of the sale property.
     * 
     * @return
     *     possible object is
     *     {@link Sale1 }
     *     
     */
    public Sale1 getSale() {
        return sale;
    }

    /**
     * Sets the value of the sale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sale1 }
     *     
     */
    public AddendumData1 setSale(Sale1 value) {
        this.sale = value;
        return this;
    }

    /**
     * Gets the value of the fleet property.
     * 
     * @return
     *     possible object is
     *     {@link FleetData2 }
     *     
     */
    public FleetData2 getFleet() {
        return fleet;
    }

    /**
     * Sets the value of the fleet property.
     * 
     * @param value
     *     allowed object is
     *     {@link FleetData2 }
     *     
     */
    public AddendumData1 setFleet(FleetData2 value) {
        this.fleet = value;
        return this;
    }

    /**
     * Gets the value of the invc property.
     * 
     * @return
     *     possible object is
     *     {@link Invoice1 }
     *     
     */
    public Invoice1 getInvc() {
        return invc;
    }

    /**
     * Sets the value of the invc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Invoice1 }
     *     
     */
    public AddendumData1 setInvc(Invoice1 value) {
        this.invc = value;
        return this;
    }

    /**
     * Gets the value of the trvlAgcy property.
     * 
     * @return
     *     possible object is
     *     {@link TravelAgency2 }
     *     
     */
    public TravelAgency2 getTrvlAgcy() {
        return trvlAgcy;
    }

    /**
     * Sets the value of the trvlAgcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelAgency2 }
     *     
     */
    public AddendumData1 setTrvlAgcy(TravelAgency2 value) {
        this.trvlAgcy = value;
        return this;
    }

    /**
     * Gets the value of the pssngrTrnsprt property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerTransport1 }
     *     
     */
    public PassengerTransport1 getPssngrTrnsprt() {
        return pssngrTrnsprt;
    }

    /**
     * Sets the value of the pssngrTrnsprt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerTransport1 }
     *     
     */
    public AddendumData1 setPssngrTrnsprt(PassengerTransport1 value) {
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
     * {@link VehicleRentalService1 }
     * 
     * 
     */
    public List<VehicleRentalService1> getVhclRntl() {
        if (vhclRntl == null) {
            vhclRntl = new ArrayList<VehicleRentalService1>();
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
     * {@link Lodging2 }
     * 
     * 
     */
    public List<Lodging2> getLdgg() {
        if (ldgg == null) {
            ldgg = new ArrayList<Lodging2>();
        }
        return this.ldgg;
    }

    /**
     * Gets the value of the shppgData property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingData1 }
     *     
     */
    public ShippingData1 getShppgData() {
        return shppgData;
    }

    /**
     * Sets the value of the shppgData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingData1 }
     *     
     */
    public AddendumData1 setShppgData(ShippingData1 value) {
        this.shppgData = value;
        return this;
    }

    /**
     * Gets the value of the telecomSvcs property.
     * 
     * @return
     *     possible object is
     *     {@link TelecomServices1 }
     *     
     */
    public TelecomServices1 getTelecomSvcs() {
        return telecomSvcs;
    }

    /**
     * Sets the value of the telecomSvcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelecomServices1 }
     *     
     */
    public AddendumData1 setTelecomSvcs(TelecomServices1 value) {
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
     * {@link TemporaryServices1 }
     * 
     * 
     */
    public List<TemporaryServices1> getTempSvcs() {
        if (tempSvcs == null) {
            tempSvcs = new ArrayList<TemporaryServices1>();
        }
        return this.tempSvcs;
    }

    /**
     * Gets the value of the instlmt property.
     * 
     * @return
     *     possible object is
     *     {@link Instalment3 }
     *     
     */
    public Instalment3 getInstlmt() {
        return instlmt;
    }

    /**
     * Sets the value of the instlmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Instalment3 }
     *     
     */
    public AddendumData1 setInstlmt(Instalment3 value) {
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
     * Adds a new item to the vhclRntl list.
     * @see #getVhclRntl()
     * 
     */
    public AddendumData1 addVhclRntl(VehicleRentalService1 vhclRntl) {
        getVhclRntl().add(vhclRntl);
        return this;
    }

    /**
     * Adds a new item to the ldgg list.
     * @see #getLdgg()
     * 
     */
    public AddendumData1 addLdgg(Lodging2 ldgg) {
        getLdgg().add(ldgg);
        return this;
    }

    /**
     * Adds a new item to the tempSvcs list.
     * @see #getTempSvcs()
     * 
     */
    public AddendumData1 addTempSvcs(TemporaryServices1 tempSvcs) {
        getTempSvcs().add(tempSvcs);
        return this;
    }

    /**
     * Adds a new item to the addtlData list.
     * @see #getAddtlData()
     * 
     */
    public AddendumData1 addAddtlData(AdditionalData1 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

}
