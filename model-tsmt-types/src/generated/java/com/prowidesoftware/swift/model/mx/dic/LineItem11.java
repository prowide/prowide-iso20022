
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
 * Commercial details of a trade transaction between a buyer and a seller.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineItem11", propOrder = {
    "goodsDesc",
    "prtlShipmnt",
    "trnsShipmnt",
    "shipmntDtRg",
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
public class LineItem11 {

    @XmlElement(name = "GoodsDesc")
    protected String goodsDesc;
    @XmlElement(name = "PrtlShipmnt")
    protected boolean prtlShipmnt;
    @XmlElement(name = "TrnsShipmnt")
    protected Boolean trnsShipmnt;
    @XmlElement(name = "ShipmntDtRg")
    protected ShipmentDateRange1 shipmntDtRg;
    @XmlElement(name = "LineItmDtls", required = true)
    protected List<LineItemDetails10> lineItmDtls;
    @XmlElement(name = "LineItmsTtlAmt", required = true)
    protected CurrencyAndAmount lineItmsTtlAmt;
    @XmlElement(name = "RtgSummry")
    protected TransportMeans5 rtgSummry;
    @XmlElement(name = "Incotrms")
    protected Incoterms4 incotrms;
    @XmlElement(name = "Adjstmnt")
    protected List<Adjustment7> adjstmnt;
    @XmlElement(name = "FrghtChrgs")
    protected Charge24 frghtChrgs;
    @XmlElement(name = "Tax")
    protected List<Tax23> tax;
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
    public LineItem11 setGoodsDesc(String value) {
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
    public LineItem11 setPrtlShipmnt(boolean value) {
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
    public LineItem11 setTrnsShipmnt(Boolean value) {
        this.trnsShipmnt = value;
        return this;
    }

    /**
     * Gets the value of the shipmntDtRg property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentDateRange1 }
     *     
     */
    public ShipmentDateRange1 getShipmntDtRg() {
        return shipmntDtRg;
    }

    /**
     * Sets the value of the shipmntDtRg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentDateRange1 }
     *     
     */
    public LineItem11 setShipmntDtRg(ShipmentDateRange1 value) {
        this.shipmntDtRg = value;
        return this;
    }

    /**
     * Gets the value of the lineItmDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineItmDtls property.
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
     * {@link LineItemDetails10 }
     * 
     * 
     */
    public List<LineItemDetails10> getLineItmDtls() {
        if (lineItmDtls == null) {
            lineItmDtls = new ArrayList<LineItemDetails10>();
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
    public LineItem11 setLineItmsTtlAmt(CurrencyAndAmount value) {
        this.lineItmsTtlAmt = value;
        return this;
    }

    /**
     * Gets the value of the rtgSummry property.
     * 
     * @return
     *     possible object is
     *     {@link TransportMeans5 }
     *     
     */
    public TransportMeans5 getRtgSummry() {
        return rtgSummry;
    }

    /**
     * Sets the value of the rtgSummry property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportMeans5 }
     *     
     */
    public LineItem11 setRtgSummry(TransportMeans5 value) {
        this.rtgSummry = value;
        return this;
    }

    /**
     * Gets the value of the incotrms property.
     * 
     * @return
     *     possible object is
     *     {@link Incoterms4 }
     *     
     */
    public Incoterms4 getIncotrms() {
        return incotrms;
    }

    /**
     * Sets the value of the incotrms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Incoterms4 }
     *     
     */
    public LineItem11 setIncotrms(Incoterms4 value) {
        this.incotrms = value;
        return this;
    }

    /**
     * Gets the value of the adjstmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adjstmnt property.
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
     * {@link Adjustment7 }
     * 
     * 
     */
    public List<Adjustment7> getAdjstmnt() {
        if (adjstmnt == null) {
            adjstmnt = new ArrayList<Adjustment7>();
        }
        return this.adjstmnt;
    }

    /**
     * Gets the value of the frghtChrgs property.
     * 
     * @return
     *     possible object is
     *     {@link Charge24 }
     *     
     */
    public Charge24 getFrghtChrgs() {
        return frghtChrgs;
    }

    /**
     * Sets the value of the frghtChrgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Charge24 }
     *     
     */
    public LineItem11 setFrghtChrgs(Charge24 value) {
        this.frghtChrgs = value;
        return this;
    }

    /**
     * Gets the value of the tax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tax property.
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
     * {@link Tax23 }
     * 
     * 
     */
    public List<Tax23> getTax() {
        if (tax == null) {
            tax = new ArrayList<Tax23>();
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
    public LineItem11 setTtlNetAmt(CurrencyAndAmount value) {
        this.ttlNetAmt = value;
        return this;
    }

    /**
     * Gets the value of the buyrDfndInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buyrDfndInf property.
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
     */
    public List<UserDefinedInformation1> getBuyrDfndInf() {
        if (buyrDfndInf == null) {
            buyrDfndInf = new ArrayList<UserDefinedInformation1>();
        }
        return this.buyrDfndInf;
    }

    /**
     * Gets the value of the sellrDfndInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sellrDfndInf property.
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
     */
    public List<UserDefinedInformation1> getSellrDfndInf() {
        if (sellrDfndInf == null) {
            sellrDfndInf = new ArrayList<UserDefinedInformation1>();
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
    public LineItem11 addLineItmDtls(LineItemDetails10 lineItmDtls) {
        getLineItmDtls().add(lineItmDtls);
        return this;
    }

    /**
     * Adds a new item to the adjstmnt list.
     * @see #getAdjstmnt()
     * 
     */
    public LineItem11 addAdjstmnt(Adjustment7 adjstmnt) {
        getAdjstmnt().add(adjstmnt);
        return this;
    }

    /**
     * Adds a new item to the tax list.
     * @see #getTax()
     * 
     */
    public LineItem11 addTax(Tax23 tax) {
        getTax().add(tax);
        return this;
    }

    /**
     * Adds a new item to the buyrDfndInf list.
     * @see #getBuyrDfndInf()
     * 
     */
    public LineItem11 addBuyrDfndInf(UserDefinedInformation1 buyrDfndInf) {
        getBuyrDfndInf().add(buyrDfndInf);
        return this;
    }

    /**
     * Adds a new item to the sellrDfndInf list.
     * @see #getSellrDfndInf()
     * 
     */
    public LineItem11 addSellrDfndInf(UserDefinedInformation1 sellrDfndInf) {
        getSellrDfndInf().add(sellrDfndInf);
        return this;
    }

}
