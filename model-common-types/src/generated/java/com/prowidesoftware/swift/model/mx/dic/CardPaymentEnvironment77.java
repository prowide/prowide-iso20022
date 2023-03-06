
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
 * Environment of the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentEnvironment77", propOrder = {
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
    "mrchntTkn",
    "crdhldr",
    "prtctdCrdhldrData",
    "saleEnvt"
})
public class CardPaymentEnvironment77 {

    @XmlElement(name = "Acqrr")
    protected Acquirer10 acqrr;
    @XmlElement(name = "Mrchnt")
    protected Organisation41 mrchnt;
    @XmlElement(name = "POI")
    protected PointOfInteraction11 poi;
    @XmlElement(name = "Card")
    protected PaymentCard31 card;
    @XmlElement(name = "Chck")
    protected Check1 chck;
    @XmlElement(name = "StordValAcct")
    protected List<StoredValueAccount2> stordValAcct;
    @XmlElement(name = "LltyAcct")
    protected List<LoyaltyAccount2> lltyAcct;
    @XmlElement(name = "CstmrDvc")
    protected CustomerDevice3 cstmrDvc;
    @XmlElement(name = "Wllt")
    protected CustomerDevice3 wllt;
    @XmlElement(name = "PmtTkn")
    protected Token1 pmtTkn;
    @XmlElement(name = "MrchntTkn")
    protected MerchantToken1 mrchntTkn;
    @XmlElement(name = "Crdhldr")
    protected Cardholder17 crdhldr;
    @XmlElement(name = "PrtctdCrdhldrData")
    protected ContentInformationType28 prtctdCrdhldrData;
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
    public CardPaymentEnvironment77 setAcqrr(Acquirer10 value) {
        this.acqrr = value;
        return this;
    }

    /**
     * Gets the value of the mrchnt property.
     * 
     * @return
     *     possible object is
     *     {@link Organisation41 }
     *     
     */
    public Organisation41 getMrchnt() {
        return mrchnt;
    }

    /**
     * Sets the value of the mrchnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation41 }
     *     
     */
    public CardPaymentEnvironment77 setMrchnt(Organisation41 value) {
        this.mrchnt = value;
        return this;
    }

    /**
     * Gets the value of the poi property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInteraction11 }
     *     
     */
    public PointOfInteraction11 getPOI() {
        return poi;
    }

    /**
     * Sets the value of the poi property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInteraction11 }
     *     
     */
    public CardPaymentEnvironment77 setPOI(PointOfInteraction11 value) {
        this.poi = value;
        return this;
    }

    /**
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCard31 }
     *     
     */
    public PaymentCard31 getCard() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCard31 }
     *     
     */
    public CardPaymentEnvironment77 setCard(PaymentCard31 value) {
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
    public CardPaymentEnvironment77 setChck(Check1 value) {
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
     *     {@link CustomerDevice3 }
     *     
     */
    public CustomerDevice3 getCstmrDvc() {
        return cstmrDvc;
    }

    /**
     * Sets the value of the cstmrDvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDevice3 }
     *     
     */
    public CardPaymentEnvironment77 setCstmrDvc(CustomerDevice3 value) {
        this.cstmrDvc = value;
        return this;
    }

    /**
     * Gets the value of the wllt property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDevice3 }
     *     
     */
    public CustomerDevice3 getWllt() {
        return wllt;
    }

    /**
     * Sets the value of the wllt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDevice3 }
     *     
     */
    public CardPaymentEnvironment77 setWllt(CustomerDevice3 value) {
        this.wllt = value;
        return this;
    }

    /**
     * Gets the value of the pmtTkn property.
     * 
     * @return
     *     possible object is
     *     {@link Token1 }
     *     
     */
    public Token1 getPmtTkn() {
        return pmtTkn;
    }

    /**
     * Sets the value of the pmtTkn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Token1 }
     *     
     */
    public CardPaymentEnvironment77 setPmtTkn(Token1 value) {
        this.pmtTkn = value;
        return this;
    }

    /**
     * Gets the value of the mrchntTkn property.
     * 
     * @return
     *     possible object is
     *     {@link MerchantToken1 }
     *     
     */
    public MerchantToken1 getMrchntTkn() {
        return mrchntTkn;
    }

    /**
     * Sets the value of the mrchntTkn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantToken1 }
     *     
     */
    public CardPaymentEnvironment77 setMrchntTkn(MerchantToken1 value) {
        this.mrchntTkn = value;
        return this;
    }

    /**
     * Gets the value of the crdhldr property.
     * 
     * @return
     *     possible object is
     *     {@link Cardholder17 }
     *     
     */
    public Cardholder17 getCrdhldr() {
        return crdhldr;
    }

    /**
     * Sets the value of the crdhldr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cardholder17 }
     *     
     */
    public CardPaymentEnvironment77 setCrdhldr(Cardholder17 value) {
        this.crdhldr = value;
        return this;
    }

    /**
     * Gets the value of the prtctdCrdhldrData property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType28 }
     *     
     */
    public ContentInformationType28 getPrtctdCrdhldrData() {
        return prtctdCrdhldrData;
    }

    /**
     * Sets the value of the prtctdCrdhldrData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType28 }
     *     
     */
    public CardPaymentEnvironment77 setPrtctdCrdhldrData(ContentInformationType28 value) {
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
    public CardPaymentEnvironment77 setSaleEnvt(RetailerSaleEnvironment2 value) {
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
    public CardPaymentEnvironment77 addStordValAcct(StoredValueAccount2 stordValAcct) {
        getStordValAcct().add(stordValAcct);
        return this;
    }

    /**
     * Adds a new item to the lltyAcct list.
     * @see #getLltyAcct()
     * 
     */
    public CardPaymentEnvironment77 addLltyAcct(LoyaltyAccount2 lltyAcct) {
        getLltyAcct().add(lltyAcct);
        return this;
    }

}
