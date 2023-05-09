
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
 * Commercial details of a trade transaction between a buyer and a seller.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineItem5", propOrder = {
    "goodsDesc",
    "prtlShipmnt",
    "trnsShipmnt",
    "latstShipmntDt",
    "lineItmDtls",
    "lineItmsTtlAmt",
    "rtgSummry",
    "incotrms",
    "adjstmnt",
    "frghtChrgs",
    "tax",
    "ttlNetAmt",
    "buyrDfndInf",
    "sellrDfndInf"
})
public class LineItem5 {

    @XmlElement(name = "GoodsDesc")
    protected String goodsDesc;
    @XmlElement(name = "PrtlShipmnt")
    protected boolean prtlShipmnt;
    @XmlElement(name = "TrnsShipmnt")
    protected Boolean trnsShipmnt;
    @XmlElement(name = "LatstShipmntDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate latstShipmntDt;
    @XmlElement(name = "LineItmDtls", required = true)
    protected List<LineItemDetails4> lineItmDtls;
    @XmlElement(name = "LineItmsTtlAmt", required = true)
    protected CurrencyAndAmount lineItmsTtlAmt;
    @XmlElement(name = "RtgSummry")
    protected TransportMeans1Choice rtgSummry;
    @XmlElement(name = "Incotrms")
    protected List<Incoterms1> incotrms;
    @XmlElement(name = "Adjstmnt")
    protected List<Adjustment3> adjstmnt;
    @XmlElement(name = "FrghtChrgs")
    protected Charge12 frghtChrgs;
    @XmlElement(name = "Tax")
    protected List<Tax13> tax;
    @XmlElement(name = "TtlNetAmt", required = true)
    protected CurrencyAndAmount ttlNetAmt;
    @XmlElement(name = "BuyrDfndInf")
    protected List<UserDefinedInformation1> buyrDfndInf;
    @XmlElement(name = "SellrDfndInf")
    protected List<UserDefinedInformation1> sellrDfndInf;

    /**
     * Gets the value of the goodsDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoodsDesc() {
        return goodsDesc;
    }

    /**
     * Sets the value of the goodsDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LineItem5 setGoodsDesc(String value) {
        this.goodsDesc = value;
        return this;
    }

    /**
     * Gets the value of the prtlShipmnt property.
     * 
     */
    public boolean isPrtlShipmnt() {
        return prtlShipmnt;
    }

    /**
     * Sets the value of the prtlShipmnt property.
     * 
     */
    public LineItem5 setPrtlShipmnt(boolean value) {
        this.prtlShipmnt = value;
        return this;
    }

    /**
     * Gets the value of the trnsShipmnt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrnsShipmnt() {
        return trnsShipmnt;
    }

    /**
     * Sets the value of the trnsShipmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public LineItem5 setTrnsShipmnt(Boolean value) {
        this.trnsShipmnt = value;
        return this;
    }

    /**
     * Gets the value of the latstShipmntDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getLatstShipmntDt() {
        return latstShipmntDt;
    }

    /**
     * Sets the value of the latstShipmntDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LineItem5 setLatstShipmntDt(LocalDate value) {
        this.latstShipmntDt = value;
        return this;
    }

    /**
     * Gets the value of the lineItmDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lineItmDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineItmDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineItemDetails4 }
     * 
     * 
     * @return
     *     The value of the lineItmDtls property.
     */
    public List<LineItemDetails4> getLineItmDtls() {
        if (lineItmDtls == null) {
            lineItmDtls = new ArrayList<>();
        }
        return this.lineItmDtls;
    }

    /**
     * Gets the value of the lineItmsTtlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getLineItmsTtlAmt() {
        return lineItmsTtlAmt;
    }

    /**
     * Sets the value of the lineItmsTtlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public LineItem5 setLineItmsTtlAmt(CurrencyAndAmount value) {
        this.lineItmsTtlAmt = value;
        return this;
    }

    /**
     * Gets the value of the rtgSummry property.
     * 
     * @return
     *     possible object is
     *     {@link TransportMeans1Choice }
     *     
     */
    public TransportMeans1Choice getRtgSummry() {
        return rtgSummry;
    }

    /**
     * Sets the value of the rtgSummry property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportMeans1Choice }
     *     
     */
    public LineItem5 setRtgSummry(TransportMeans1Choice value) {
        this.rtgSummry = value;
        return this;
    }

    /**
     * Gets the value of the incotrms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the incotrms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncotrms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Incoterms1 }
     * 
     * 
     * @return
     *     The value of the incotrms property.
     */
    public List<Incoterms1> getIncotrms() {
        if (incotrms == null) {
            incotrms = new ArrayList<>();
        }
        return this.incotrms;
    }

    /**
     * Gets the value of the adjstmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the adjstmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdjstmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Adjustment3 }
     * 
     * 
     * @return
     *     The value of the adjstmnt property.
     */
    public List<Adjustment3> getAdjstmnt() {
        if (adjstmnt == null) {
            adjstmnt = new ArrayList<>();
        }
        return this.adjstmnt;
    }

    /**
     * Gets the value of the frghtChrgs property.
     * 
     * @return
     *     possible object is
     *     {@link Charge12 }
     *     
     */
    public Charge12 getFrghtChrgs() {
        return frghtChrgs;
    }

    /**
     * Sets the value of the frghtChrgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Charge12 }
     *     
     */
    public LineItem5 setFrghtChrgs(Charge12 value) {
        this.frghtChrgs = value;
        return this;
    }

    /**
     * Gets the value of the tax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax13 }
     * 
     * 
     * @return
     *     The value of the tax property.
     */
    public List<Tax13> getTax() {
        if (tax == null) {
            tax = new ArrayList<>();
        }
        return this.tax;
    }

    /**
     * Gets the value of the ttlNetAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getTtlNetAmt() {
        return ttlNetAmt;
    }

    /**
     * Sets the value of the ttlNetAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public LineItem5 setTtlNetAmt(CurrencyAndAmount value) {
        this.ttlNetAmt = value;
        return this;
    }

    /**
     * Gets the value of the buyrDfndInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the buyrDfndInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuyrDfndInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserDefinedInformation1 }
     * 
     * 
     * @return
     *     The value of the buyrDfndInf property.
     */
    public List<UserDefinedInformation1> getBuyrDfndInf() {
        if (buyrDfndInf == null) {
            buyrDfndInf = new ArrayList<>();
        }
        return this.buyrDfndInf;
    }

    /**
     * Gets the value of the sellrDfndInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sellrDfndInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSellrDfndInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserDefinedInformation1 }
     * 
     * 
     * @return
     *     The value of the sellrDfndInf property.
     */
    public List<UserDefinedInformation1> getSellrDfndInf() {
        if (sellrDfndInf == null) {
            sellrDfndInf = new ArrayList<>();
        }
        return this.sellrDfndInf;
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
     * Adds a new item to the lineItmDtls list.
     * @see #getLineItmDtls()
     * 
     */
    public LineItem5 addLineItmDtls(LineItemDetails4 lineItmDtls) {
        getLineItmDtls().add(lineItmDtls);
        return this;
    }

    /**
     * Adds a new item to the incotrms list.
     * @see #getIncotrms()
     * 
     */
    public LineItem5 addIncotrms(Incoterms1 incotrms) {
        getIncotrms().add(incotrms);
        return this;
    }

    /**
     * Adds a new item to the adjstmnt list.
     * @see #getAdjstmnt()
     * 
     */
    public LineItem5 addAdjstmnt(Adjustment3 adjstmnt) {
        getAdjstmnt().add(adjstmnt);
        return this;
    }

    /**
     * Adds a new item to the tax list.
     * @see #getTax()
     * 
     */
    public LineItem5 addTax(Tax13 tax) {
        getTax().add(tax);
        return this;
    }

    /**
     * Adds a new item to the buyrDfndInf list.
     * @see #getBuyrDfndInf()
     * 
     */
    public LineItem5 addBuyrDfndInf(UserDefinedInformation1 buyrDfndInf) {
        getBuyrDfndInf().add(buyrDfndInf);
        return this;
    }

    /**
     * Adds a new item to the sellrDfndInf list.
     * @see #getSellrDfndInf()
     * 
     */
    public LineItem5 addSellrDfndInf(UserDefinedInformation1 sellrDfndInf) {
        getSellrDfndInf().add(sellrDfndInf);
        return this;
    }

}
