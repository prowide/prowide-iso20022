
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
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
@XmlType(name = "Baseline2", propOrder = {
    "submitrBaselnId",
    "svcCd",
    "purchsOrdrRef",
    "buyr",
    "sellr",
    "buyrBk",
    "sellrBk",
    "bllTo",
    "shipTo",
    "consgn",
    "goods",
    "pmtTerms",
    "sttlmTerms",
    "dataSetReqrd"
})
public class Baseline2 {

    @XmlElement(name = "SubmitrBaselnId", required = true)
    protected DocumentIdentification1 submitrBaselnId;
    @XmlElement(name = "SvcCd", required = true)
    @XmlSchemaType(name = "string")
    protected TradeFinanceService2Code svcCd;
    @XmlElement(name = "PurchsOrdrRef", required = true)
    protected DocumentIdentification7 purchsOrdrRef;
    @XmlElement(name = "Buyr", required = true)
    protected PartyIdentification9 buyr;
    @XmlElement(name = "Sellr", required = true)
    protected PartyIdentification9 sellr;
    @XmlElement(name = "BuyrBk", required = true)
    protected BICIdentification1 buyrBk;
    @XmlElement(name = "SellrBk", required = true)
    protected BICIdentification1 sellrBk;
    @XmlElement(name = "BllTo")
    protected PartyIdentification9 bllTo;
    @XmlElement(name = "ShipTo")
    protected PartyIdentification9 shipTo;
    @XmlElement(name = "Consgn")
    protected PartyIdentification9 consgn;
    @XmlElement(name = "Goods", required = true)
    protected LineItem5 goods;
    @XmlElement(name = "PmtTerms", required = true)
    protected List<PaymentTerms1> pmtTerms;
    @XmlElement(name = "SttlmTerms")
    protected SettlementTerms1 sttlmTerms;
    @XmlElement(name = "DataSetReqrd")
    protected RequiredSubmission1 dataSetReqrd;

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
    public Baseline2 setSubmitrBaselnId(DocumentIdentification1 value) {
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
    public Baseline2 setSvcCd(TradeFinanceService2Code value) {
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
    public Baseline2 setPurchsOrdrRef(DocumentIdentification7 value) {
        this.purchsOrdrRef = value;
        return this;
    }

    /**
     * Gets the value of the buyr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification9 }
     *     
     */
    public PartyIdentification9 getBuyr() {
        return buyr;
    }

    /**
     * Sets the value of the buyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification9 }
     *     
     */
    public Baseline2 setBuyr(PartyIdentification9 value) {
        this.buyr = value;
        return this;
    }

    /**
     * Gets the value of the sellr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification9 }
     *     
     */
    public PartyIdentification9 getSellr() {
        return sellr;
    }

    /**
     * Sets the value of the sellr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification9 }
     *     
     */
    public Baseline2 setSellr(PartyIdentification9 value) {
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
    public Baseline2 setBuyrBk(BICIdentification1 value) {
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
    public Baseline2 setSellrBk(BICIdentification1 value) {
        this.sellrBk = value;
        return this;
    }

    /**
     * Gets the value of the bllTo property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification9 }
     *     
     */
    public PartyIdentification9 getBllTo() {
        return bllTo;
    }

    /**
     * Sets the value of the bllTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification9 }
     *     
     */
    public Baseline2 setBllTo(PartyIdentification9 value) {
        this.bllTo = value;
        return this;
    }

    /**
     * Gets the value of the shipTo property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification9 }
     *     
     */
    public PartyIdentification9 getShipTo() {
        return shipTo;
    }

    /**
     * Sets the value of the shipTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification9 }
     *     
     */
    public Baseline2 setShipTo(PartyIdentification9 value) {
        this.shipTo = value;
        return this;
    }

    /**
     * Gets the value of the consgn property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification9 }
     *     
     */
    public PartyIdentification9 getConsgn() {
        return consgn;
    }

    /**
     * Sets the value of the consgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification9 }
     *     
     */
    public Baseline2 setConsgn(PartyIdentification9 value) {
        this.consgn = value;
        return this;
    }

    /**
     * Gets the value of the goods property.
     * 
     * @return
     *     possible object is
     *     {@link LineItem5 }
     *     
     */
    public LineItem5 getGoods() {
        return goods;
    }

    /**
     * Sets the value of the goods property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineItem5 }
     *     
     */
    public Baseline2 setGoods(LineItem5 value) {
        this.goods = value;
        return this;
    }

    /**
     * Gets the value of the pmtTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtTerms property.
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
     */
    public List<PaymentTerms1> getPmtTerms() {
        if (pmtTerms == null) {
            pmtTerms = new ArrayList<PaymentTerms1>();
        }
        return this.pmtTerms;
    }

    /**
     * Gets the value of the sttlmTerms property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTerms1 }
     *     
     */
    public SettlementTerms1 getSttlmTerms() {
        return sttlmTerms;
    }

    /**
     * Sets the value of the sttlmTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTerms1 }
     *     
     */
    public Baseline2 setSttlmTerms(SettlementTerms1 value) {
        this.sttlmTerms = value;
        return this;
    }

    /**
     * Gets the value of the dataSetReqrd property.
     * 
     * @return
     *     possible object is
     *     {@link RequiredSubmission1 }
     *     
     */
    public RequiredSubmission1 getDataSetReqrd() {
        return dataSetReqrd;
    }

    /**
     * Sets the value of the dataSetReqrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequiredSubmission1 }
     *     
     */
    public Baseline2 setDataSetReqrd(RequiredSubmission1 value) {
        this.dataSetReqrd = value;
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
     * Adds a new item to the pmtTerms list.
     * @see #getPmtTerms()
     * 
     */
    public Baseline2 addPmtTerms(PaymentTerms1 pmtTerms) {
        getPmtTerms().add(pmtTerms);
        return this;
    }

}
