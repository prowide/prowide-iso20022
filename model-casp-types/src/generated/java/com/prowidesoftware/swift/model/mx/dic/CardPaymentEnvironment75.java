
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
 * Environment of the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentEnvironment75", propOrder = {
    "acqrr",
    "mrchnt",
    "poi",
    "card",
    "chck",
    "stordValAcct",
    "lltyAcct",
    "cstmrDvc",
    "wllt",
    "pmtTkn",
    "crdhldr",
    "prtctdCrdhldrData",
    "saleEnvt"
})
public class CardPaymentEnvironment75 {

    @XmlElement(name = "Acqrr")
    protected Acquirer10 acqrr;
    @XmlElement(name = "Mrchnt")
    protected Organisation32 mrchnt;
    @XmlElement(name = "POI")
    protected PointOfInteraction10 poi;
    @XmlElement(name = "Card")
    protected PaymentCard30 card;
    @XmlElement(name = "Chck")
    protected Check1 chck;
    @XmlElement(name = "StordValAcct")
    protected List<StoredValueAccount2> stordValAcct;
    @XmlElement(name = "LltyAcct")
    protected List<LoyaltyAccount2> lltyAcct;
    @XmlElement(name = "CstmrDvc")
    protected CustomerDevice1 cstmrDvc;
    @XmlElement(name = "Wllt")
    protected CustomerDevice1 wllt;
    @XmlElement(name = "PmtTkn")
    protected CardPaymentToken5 pmtTkn;
    @XmlElement(name = "Crdhldr")
    protected Cardholder16 crdhldr;
    @XmlElement(name = "PrtctdCrdhldrData")
    protected ContentInformationType22 prtctdCrdhldrData;
    @XmlElement(name = "SaleEnvt")
    protected RetailerSaleEnvironment2 saleEnvt;

    /**
     * Gets the value of the acqrr property.
     * 
     * @return
     *     possible object is
     *     {@link Acquirer10 }
     *     
     */
    public Acquirer10 getAcqrr() {
        return acqrr;
    }

    /**
     * Sets the value of the acqrr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Acquirer10 }
     *     
     */
    public CardPaymentEnvironment75 setAcqrr(Acquirer10 value) {
        this.acqrr = value;
        return this;
    }

    /**
     * Gets the value of the mrchnt property.
     * 
     * @return
     *     possible object is
     *     {@link Organisation32 }
     *     
     */
    public Organisation32 getMrchnt() {
        return mrchnt;
    }

    /**
     * Sets the value of the mrchnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation32 }
     *     
     */
    public CardPaymentEnvironment75 setMrchnt(Organisation32 value) {
        this.mrchnt = value;
        return this;
    }

    /**
     * Gets the value of the poi property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInteraction10 }
     *     
     */
    public PointOfInteraction10 getPOI() {
        return poi;
    }

    /**
     * Sets the value of the poi property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInteraction10 }
     *     
     */
    public CardPaymentEnvironment75 setPOI(PointOfInteraction10 value) {
        this.poi = value;
        return this;
    }

    /**
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCard30 }
     *     
     */
    public PaymentCard30 getCard() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCard30 }
     *     
     */
    public CardPaymentEnvironment75 setCard(PaymentCard30 value) {
        this.card = value;
        return this;
    }

    /**
     * Gets the value of the chck property.
     * 
     * @return
     *     possible object is
     *     {@link Check1 }
     *     
     */
    public Check1 getChck() {
        return chck;
    }

    /**
     * Sets the value of the chck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Check1 }
     *     
     */
    public CardPaymentEnvironment75 setChck(Check1 value) {
        this.chck = value;
        return this;
    }

    /**
     * Gets the value of the stordValAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stordValAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStordValAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StoredValueAccount2 }
     * 
     * 
     */
    public List<StoredValueAccount2> getStordValAcct() {
        if (stordValAcct == null) {
            stordValAcct = new ArrayList<StoredValueAccount2>();
        }
        return this.stordValAcct;
    }

    /**
     * Gets the value of the lltyAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lltyAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLltyAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyAccount2 }
     * 
     * 
     */
    public List<LoyaltyAccount2> getLltyAcct() {
        if (lltyAcct == null) {
            lltyAcct = new ArrayList<LoyaltyAccount2>();
        }
        return this.lltyAcct;
    }

    /**
     * Gets the value of the cstmrDvc property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDevice1 }
     *     
     */
    public CustomerDevice1 getCstmrDvc() {
        return cstmrDvc;
    }

    /**
     * Sets the value of the cstmrDvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDevice1 }
     *     
     */
    public CardPaymentEnvironment75 setCstmrDvc(CustomerDevice1 value) {
        this.cstmrDvc = value;
        return this;
    }

    /**
     * Gets the value of the wllt property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDevice1 }
     *     
     */
    public CustomerDevice1 getWllt() {
        return wllt;
    }

    /**
     * Sets the value of the wllt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDevice1 }
     *     
     */
    public CardPaymentEnvironment75 setWllt(CustomerDevice1 value) {
        this.wllt = value;
        return this;
    }

    /**
     * Gets the value of the pmtTkn property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentToken5 }
     *     
     */
    public CardPaymentToken5 getPmtTkn() {
        return pmtTkn;
    }

    /**
     * Sets the value of the pmtTkn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentToken5 }
     *     
     */
    public CardPaymentEnvironment75 setPmtTkn(CardPaymentToken5 value) {
        this.pmtTkn = value;
        return this;
    }

    /**
     * Gets the value of the crdhldr property.
     * 
     * @return
     *     possible object is
     *     {@link Cardholder16 }
     *     
     */
    public Cardholder16 getCrdhldr() {
        return crdhldr;
    }

    /**
     * Sets the value of the crdhldr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cardholder16 }
     *     
     */
    public CardPaymentEnvironment75 setCrdhldr(Cardholder16 value) {
        this.crdhldr = value;
        return this;
    }

    /**
     * Gets the value of the prtctdCrdhldrData property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType22 }
     *     
     */
    public ContentInformationType22 getPrtctdCrdhldrData() {
        return prtctdCrdhldrData;
    }

    /**
     * Sets the value of the prtctdCrdhldrData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType22 }
     *     
     */
    public CardPaymentEnvironment75 setPrtctdCrdhldrData(ContentInformationType22 value) {
        this.prtctdCrdhldrData = value;
        return this;
    }

    /**
     * Gets the value of the saleEnvt property.
     * 
     * @return
     *     possible object is
     *     {@link RetailerSaleEnvironment2 }
     *     
     */
    public RetailerSaleEnvironment2 getSaleEnvt() {
        return saleEnvt;
    }

    /**
     * Sets the value of the saleEnvt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailerSaleEnvironment2 }
     *     
     */
    public CardPaymentEnvironment75 setSaleEnvt(RetailerSaleEnvironment2 value) {
        this.saleEnvt = value;
        return this;
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
     * Adds a new item to the stordValAcct list.
     * @see #getStordValAcct()
     * 
     */
    public CardPaymentEnvironment75 addStordValAcct(StoredValueAccount2 stordValAcct) {
        getStordValAcct().add(stordValAcct);
        return this;
    }

    /**
     * Adds a new item to the lltyAcct list.
     * @see #getLltyAcct()
     * 
     */
    public CardPaymentEnvironment75 addLltyAcct(LoyaltyAccount2 lltyAcct) {
        getLltyAcct().add(lltyAcct);
        return this;
    }

}
