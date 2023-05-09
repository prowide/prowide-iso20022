
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the commercial details of the underlying transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Baseline3", propOrder = {
    "submitrBaselnId",
    "svcCd",
    "purchsOrdrRef",
    "buyr",
    "sellr",
    "buyrBk",
    "sellrBk",
    "buyrSdSubmitgBk",
    "sellrSdSubmitgBk",
    "bllTo",
    "shipTo",
    "consgn",
    "goods",
    "pmtTerms",
    "sttlmTerms",
    "pmtOblgtn",
    "latstMtchDt",
    "comrclDataSetReqrd",
    "trnsprtDataSetReqrd",
    "insrncDataSetReqrd",
    "certDataSetReqrd",
    "othrCertDataSetReqrd",
    "inttToPayXpctd"
})
public class Baseline3 {

    @XmlElement(name = "SubmitrBaselnId", required = true)
    protected DocumentIdentification1 submitrBaselnId;
    @XmlElement(name = "SvcCd", required = true)
    @XmlSchemaType(name = "string")
    protected TradeFinanceService2Code svcCd;
    @XmlElement(name = "PurchsOrdrRef", required = true)
    protected DocumentIdentification7 purchsOrdrRef;
    @XmlElement(name = "Buyr", required = true)
    protected PartyIdentification26 buyr;
    @XmlElement(name = "Sellr", required = true)
    protected PartyIdentification26 sellr;
    @XmlElement(name = "BuyrBk", required = true)
    protected BICIdentification1 buyrBk;
    @XmlElement(name = "SellrBk", required = true)
    protected BICIdentification1 sellrBk;
    @XmlElement(name = "BuyrSdSubmitgBk")
    protected List<BICIdentification1> buyrSdSubmitgBk;
    @XmlElement(name = "SellrSdSubmitgBk")
    protected List<BICIdentification1> sellrSdSubmitgBk;
    @XmlElement(name = "BllTo")
    protected PartyIdentification26 bllTo;
    @XmlElement(name = "ShipTo")
    protected PartyIdentification26 shipTo;
    @XmlElement(name = "Consgn")
    protected PartyIdentification26 consgn;
    @XmlElement(name = "Goods", required = true)
    protected LineItem7 goods;
    @XmlElement(name = "PmtTerms", required = true)
    protected List<PaymentTerms1> pmtTerms;
    @XmlElement(name = "SttlmTerms")
    protected SettlementTerms2 sttlmTerms;
    @XmlElement(name = "PmtOblgtn")
    protected List<PaymentObligation1> pmtOblgtn;
    @XmlElement(name = "LatstMtchDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate latstMtchDt;
    @XmlElement(name = "ComrclDataSetReqrd", required = true)
    protected RequiredSubmission2 comrclDataSetReqrd;
    @XmlElement(name = "TrnsprtDataSetReqrd")
    protected RequiredSubmission2 trnsprtDataSetReqrd;
    @XmlElement(name = "InsrncDataSetReqrd")
    protected RequiredSubmission3 insrncDataSetReqrd;
    @XmlElement(name = "CertDataSetReqrd")
    protected List<RequiredSubmission4> certDataSetReqrd;
    @XmlElement(name = "OthrCertDataSetReqrd")
    protected List<RequiredSubmission5> othrCertDataSetReqrd;
    @XmlElement(name = "InttToPayXpctd")
    protected boolean inttToPayXpctd;

    /**
     * Gets the value of the submitrBaselnId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification1 }
     *     
     */
    public DocumentIdentification1 getSubmitrBaselnId() {
        return submitrBaselnId;
    }

    /**
     * Sets the value of the submitrBaselnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification1 }
     *     
     */
    public Baseline3 setSubmitrBaselnId(DocumentIdentification1 value) {
        this.submitrBaselnId = value;
        return this;
    }

    /**
     * Gets the value of the svcCd property.
     * 
     * @return
     *     possible object is
     *     {@link TradeFinanceService2Code }
     *     
     */
    public TradeFinanceService2Code getSvcCd() {
        return svcCd;
    }

    /**
     * Sets the value of the svcCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeFinanceService2Code }
     *     
     */
    public Baseline3 setSvcCd(TradeFinanceService2Code value) {
        this.svcCd = value;
        return this;
    }

    /**
     * Gets the value of the purchsOrdrRef property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification7 }
     *     
     */
    public DocumentIdentification7 getPurchsOrdrRef() {
        return purchsOrdrRef;
    }

    /**
     * Sets the value of the purchsOrdrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification7 }
     *     
     */
    public Baseline3 setPurchsOrdrRef(DocumentIdentification7 value) {
        this.purchsOrdrRef = value;
        return this;
    }

    /**
     * Gets the value of the buyr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification26 }
     *     
     */
    public PartyIdentification26 getBuyr() {
        return buyr;
    }

    /**
     * Sets the value of the buyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification26 }
     *     
     */
    public Baseline3 setBuyr(PartyIdentification26 value) {
        this.buyr = value;
        return this;
    }

    /**
     * Gets the value of the sellr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification26 }
     *     
     */
    public PartyIdentification26 getSellr() {
        return sellr;
    }

    /**
     * Sets the value of the sellr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification26 }
     *     
     */
    public Baseline3 setSellr(PartyIdentification26 value) {
        this.sellr = value;
        return this;
    }

    /**
     * Gets the value of the buyrBk property.
     * 
     * @return
     *     possible object is
     *     {@link BICIdentification1 }
     *     
     */
    public BICIdentification1 getBuyrBk() {
        return buyrBk;
    }

    /**
     * Sets the value of the buyrBk property.
     * 
     * @param value
     *     allowed object is
     *     {@link BICIdentification1 }
     *     
     */
    public Baseline3 setBuyrBk(BICIdentification1 value) {
        this.buyrBk = value;
        return this;
    }

    /**
     * Gets the value of the sellrBk property.
     * 
     * @return
     *     possible object is
     *     {@link BICIdentification1 }
     *     
     */
    public BICIdentification1 getSellrBk() {
        return sellrBk;
    }

    /**
     * Sets the value of the sellrBk property.
     * 
     * @param value
     *     allowed object is
     *     {@link BICIdentification1 }
     *     
     */
    public Baseline3 setSellrBk(BICIdentification1 value) {
        this.sellrBk = value;
        return this;
    }

    /**
     * Gets the value of the buyrSdSubmitgBk property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the buyrSdSubmitgBk property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuyrSdSubmitgBk().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BICIdentification1 }
     * 
     * 
     * @return
     *     The value of the buyrSdSubmitgBk property.
     */
    public List<BICIdentification1> getBuyrSdSubmitgBk() {
        if (buyrSdSubmitgBk == null) {
            buyrSdSubmitgBk = new ArrayList<>();
        }
        return this.buyrSdSubmitgBk;
    }

    /**
     * Gets the value of the sellrSdSubmitgBk property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sellrSdSubmitgBk property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSellrSdSubmitgBk().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BICIdentification1 }
     * 
     * 
     * @return
     *     The value of the sellrSdSubmitgBk property.
     */
    public List<BICIdentification1> getSellrSdSubmitgBk() {
        if (sellrSdSubmitgBk == null) {
            sellrSdSubmitgBk = new ArrayList<>();
        }
        return this.sellrSdSubmitgBk;
    }

    /**
     * Gets the value of the bllTo property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification26 }
     *     
     */
    public PartyIdentification26 getBllTo() {
        return bllTo;
    }

    /**
     * Sets the value of the bllTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification26 }
     *     
     */
    public Baseline3 setBllTo(PartyIdentification26 value) {
        this.bllTo = value;
        return this;
    }

    /**
     * Gets the value of the shipTo property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification26 }
     *     
     */
    public PartyIdentification26 getShipTo() {
        return shipTo;
    }

    /**
     * Sets the value of the shipTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification26 }
     *     
     */
    public Baseline3 setShipTo(PartyIdentification26 value) {
        this.shipTo = value;
        return this;
    }

    /**
     * Gets the value of the consgn property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification26 }
     *     
     */
    public PartyIdentification26 getConsgn() {
        return consgn;
    }

    /**
     * Sets the value of the consgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification26 }
     *     
     */
    public Baseline3 setConsgn(PartyIdentification26 value) {
        this.consgn = value;
        return this;
    }

    /**
     * Gets the value of the goods property.
     * 
     * @return
     *     possible object is
     *     {@link LineItem7 }
     *     
     */
    public LineItem7 getGoods() {
        return goods;
    }

    /**
     * Sets the value of the goods property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineItem7 }
     *     
     */
    public Baseline3 setGoods(LineItem7 value) {
        this.goods = value;
        return this;
    }

    /**
     * Gets the value of the pmtTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pmtTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentTerms1 }
     * 
     * 
     * @return
     *     The value of the pmtTerms property.
     */
    public List<PaymentTerms1> getPmtTerms() {
        if (pmtTerms == null) {
            pmtTerms = new ArrayList<>();
        }
        return this.pmtTerms;
    }

    /**
     * Gets the value of the sttlmTerms property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTerms2 }
     *     
     */
    public SettlementTerms2 getSttlmTerms() {
        return sttlmTerms;
    }

    /**
     * Sets the value of the sttlmTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTerms2 }
     *     
     */
    public Baseline3 setSttlmTerms(SettlementTerms2 value) {
        this.sttlmTerms = value;
        return this;
    }

    /**
     * Gets the value of the pmtOblgtn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pmtOblgtn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtOblgtn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentObligation1 }
     * 
     * 
     * @return
     *     The value of the pmtOblgtn property.
     */
    public List<PaymentObligation1> getPmtOblgtn() {
        if (pmtOblgtn == null) {
            pmtOblgtn = new ArrayList<>();
        }
        return this.pmtOblgtn;
    }

    /**
     * Gets the value of the latstMtchDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getLatstMtchDt() {
        return latstMtchDt;
    }

    /**
     * Sets the value of the latstMtchDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Baseline3 setLatstMtchDt(LocalDate value) {
        this.latstMtchDt = value;
        return this;
    }

    /**
     * Gets the value of the comrclDataSetReqrd property.
     * 
     * @return
     *     possible object is
     *     {@link RequiredSubmission2 }
     *     
     */
    public RequiredSubmission2 getComrclDataSetReqrd() {
        return comrclDataSetReqrd;
    }

    /**
     * Sets the value of the comrclDataSetReqrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequiredSubmission2 }
     *     
     */
    public Baseline3 setComrclDataSetReqrd(RequiredSubmission2 value) {
        this.comrclDataSetReqrd = value;
        return this;
    }

    /**
     * Gets the value of the trnsprtDataSetReqrd property.
     * 
     * @return
     *     possible object is
     *     {@link RequiredSubmission2 }
     *     
     */
    public RequiredSubmission2 getTrnsprtDataSetReqrd() {
        return trnsprtDataSetReqrd;
    }

    /**
     * Sets the value of the trnsprtDataSetReqrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequiredSubmission2 }
     *     
     */
    public Baseline3 setTrnsprtDataSetReqrd(RequiredSubmission2 value) {
        this.trnsprtDataSetReqrd = value;
        return this;
    }

    /**
     * Gets the value of the insrncDataSetReqrd property.
     * 
     * @return
     *     possible object is
     *     {@link RequiredSubmission3 }
     *     
     */
    public RequiredSubmission3 getInsrncDataSetReqrd() {
        return insrncDataSetReqrd;
    }

    /**
     * Sets the value of the insrncDataSetReqrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequiredSubmission3 }
     *     
     */
    public Baseline3 setInsrncDataSetReqrd(RequiredSubmission3 value) {
        this.insrncDataSetReqrd = value;
        return this;
    }

    /**
     * Gets the value of the certDataSetReqrd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the certDataSetReqrd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertDataSetReqrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequiredSubmission4 }
     * 
     * 
     * @return
     *     The value of the certDataSetReqrd property.
     */
    public List<RequiredSubmission4> getCertDataSetReqrd() {
        if (certDataSetReqrd == null) {
            certDataSetReqrd = new ArrayList<>();
        }
        return this.certDataSetReqrd;
    }

    /**
     * Gets the value of the othrCertDataSetReqrd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othrCertDataSetReqrd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrCertDataSetReqrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequiredSubmission5 }
     * 
     * 
     * @return
     *     The value of the othrCertDataSetReqrd property.
     */
    public List<RequiredSubmission5> getOthrCertDataSetReqrd() {
        if (othrCertDataSetReqrd == null) {
            othrCertDataSetReqrd = new ArrayList<>();
        }
        return this.othrCertDataSetReqrd;
    }

    /**
     * Gets the value of the inttToPayXpctd property.
     * 
     */
    public boolean isInttToPayXpctd() {
        return inttToPayXpctd;
    }

    /**
     * Sets the value of the inttToPayXpctd property.
     * 
     */
    public Baseline3 setInttToPayXpctd(boolean value) {
        this.inttToPayXpctd = value;
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
     * Adds a new item to the buyrSdSubmitgBk list.
     * @see #getBuyrSdSubmitgBk()
     * 
     */
    public Baseline3 addBuyrSdSubmitgBk(BICIdentification1 buyrSdSubmitgBk) {
        getBuyrSdSubmitgBk().add(buyrSdSubmitgBk);
        return this;
    }

    /**
     * Adds a new item to the sellrSdSubmitgBk list.
     * @see #getSellrSdSubmitgBk()
     * 
     */
    public Baseline3 addSellrSdSubmitgBk(BICIdentification1 sellrSdSubmitgBk) {
        getSellrSdSubmitgBk().add(sellrSdSubmitgBk);
        return this;
    }

    /**
     * Adds a new item to the pmtTerms list.
     * @see #getPmtTerms()
     * 
     */
    public Baseline3 addPmtTerms(PaymentTerms1 pmtTerms) {
        getPmtTerms().add(pmtTerms);
        return this;
    }

    /**
     * Adds a new item to the pmtOblgtn list.
     * @see #getPmtOblgtn()
     * 
     */
    public Baseline3 addPmtOblgtn(PaymentObligation1 pmtOblgtn) {
        getPmtOblgtn().add(pmtOblgtn);
        return this;
    }

    /**
     * Adds a new item to the certDataSetReqrd list.
     * @see #getCertDataSetReqrd()
     * 
     */
    public Baseline3 addCertDataSetReqrd(RequiredSubmission4 certDataSetReqrd) {
        getCertDataSetReqrd().add(certDataSetReqrd);
        return this;
    }

    /**
     * Adds a new item to the othrCertDataSetReqrd list.
     * @see #getOthrCertDataSetReqrd()
     * 
     */
    public Baseline3 addOthrCertDataSetReqrd(RequiredSubmission5 othrCertDataSetReqrd) {
        getOthrCertDataSetReqrd().add(othrCertDataSetReqrd);
        return this;
    }

}
