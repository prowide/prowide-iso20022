
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
@XmlType(name = "CardPaymentEnvironment79", propOrder = {
    "acqrr",
    "svcPrvdr",
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
public class CardPaymentEnvironment79 {

    @XmlElement(name = "Acqrr")
    protected Acquirer10 acqrr;
    @XmlElement(name = "SvcPrvdr")
    protected Acquirer10 svcPrvdr;
    @XmlElement(name = "Mrchnt")
    protected Organisation41 mrchnt;
    @XmlElement(name = "POI")
    protected PointOfInteraction13 poi;
    @XmlElement(name = "Card")
    protected PaymentCard33 card;
    @XmlElement(name = "Chck")
    protected Check1 chck;
    @XmlElement(name = "StordValAcct")
    protected List<StoredValueAccount2> stordValAcct;
    @XmlElement(name = "LltyAcct")
    protected List<LoyaltyAccount3> lltyAcct;
    @XmlElement(name = "CstmrDvc")
    protected CustomerDevice3 cstmrDvc;
    @XmlElement(name = "Wllt")
    protected CustomerDevice3 wllt;
    @XmlElement(name = "PmtTkn")
    protected Token1 pmtTkn;
    @XmlElement(name = "MrchntTkn")
    protected MerchantToken2 mrchntTkn;
    @XmlElement(name = "Crdhldr")
    protected Cardholder20 crdhldr;
    @XmlElement(name = "PrtctdCrdhldrData")
    protected ContentInformationType35 prtctdCrdhldrData;
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
    public CardPaymentEnvironment79 setAcqrr(Acquirer10 value) {
        this.acqrr = value;
        return this;
    }

    /**
     * Gets the value of the svcPrvdr property.
     * 
     * @return
     *     possible object is
     *     {@link Acquirer10 }
     *     
     */
    public Acquirer10 getSvcPrvdr() {
        return svcPrvdr;
    }

    /**
     * Sets the value of the svcPrvdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Acquirer10 }
     *     
     */
    public CardPaymentEnvironment79 setSvcPrvdr(Acquirer10 value) {
        this.svcPrvdr = value;
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
    public CardPaymentEnvironment79 setMrchnt(Organisation41 value) {
        this.mrchnt = value;
        return this;
    }

    /**
     * Gets the value of the poi property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInteraction13 }
     *     
     */
    public PointOfInteraction13 getPOI() {
        return poi;
    }

    /**
     * Sets the value of the poi property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInteraction13 }
     *     
     */
    public CardPaymentEnvironment79 setPOI(PointOfInteraction13 value) {
        this.poi = value;
        return this;
    }

    /**
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCard33 }
     *     
     */
    public PaymentCard33 getCard() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCard33 }
     *     
     */
    public CardPaymentEnvironment79 setCard(PaymentCard33 value) {
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
    public CardPaymentEnvironment79 setChck(Check1 value) {
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
     * {@link LoyaltyAccount3 }
     * 
     * 
     */
    public List<LoyaltyAccount3> getLltyAcct() {
        if (lltyAcct == null) {
            lltyAcct = new ArrayList<LoyaltyAccount3>();
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
    public CardPaymentEnvironment79 setCstmrDvc(CustomerDevice3 value) {
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
    public CardPaymentEnvironment79 setWllt(CustomerDevice3 value) {
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
    public CardPaymentEnvironment79 setPmtTkn(Token1 value) {
        this.pmtTkn = value;
        return this;
    }

    /**
     * Gets the value of the mrchntTkn property.
     * 
     * @return
     *     possible object is
     *     {@link MerchantToken2 }
     *     
     */
    public MerchantToken2 getMrchntTkn() {
        return mrchntTkn;
    }

    /**
     * Sets the value of the mrchntTkn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantToken2 }
     *     
     */
    public CardPaymentEnvironment79 setMrchntTkn(MerchantToken2 value) {
        this.mrchntTkn = value;
        return this;
    }

    /**
     * Gets the value of the crdhldr property.
     * 
     * @return
     *     possible object is
     *     {@link Cardholder20 }
     *     
     */
    public Cardholder20 getCrdhldr() {
        return crdhldr;
    }

    /**
     * Sets the value of the crdhldr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cardholder20 }
     *     
     */
    public CardPaymentEnvironment79 setCrdhldr(Cardholder20 value) {
        this.crdhldr = value;
        return this;
    }

    /**
     * Gets the value of the prtctdCrdhldrData property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType35 }
     *     
     */
    public ContentInformationType35 getPrtctdCrdhldrData() {
        return prtctdCrdhldrData;
    }

    /**
     * Sets the value of the prtctdCrdhldrData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType35 }
     *     
     */
    public CardPaymentEnvironment79 setPrtctdCrdhldrData(ContentInformationType35 value) {
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
    public CardPaymentEnvironment79 setSaleEnvt(RetailerSaleEnvironment2 value) {
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
    public CardPaymentEnvironment79 addStordValAcct(StoredValueAccount2 stordValAcct) {
        getStordValAcct().add(stordValAcct);
        return this;
    }

    /**
     * Adds a new item to the lltyAcct list.
     * @see #getLltyAcct()
     * 
     */
    public CardPaymentEnvironment79 addLltyAcct(LoyaltyAccount3 lltyAcct) {
        getLltyAcct().add(lltyAcct);
        return this;
    }

}
