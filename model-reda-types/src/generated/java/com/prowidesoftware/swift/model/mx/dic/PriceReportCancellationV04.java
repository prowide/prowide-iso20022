
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
 * SCOPE
 * A report provider, for example, a transfer agent, fund accountant or market data provider, sends the PriceReportCancellation message to the report recipient, for example, a fund management company, transfer agent, market data provider, regulator or any other interested party to cancel previously sent prices.
 * 
 * USAGE
 * The PriceReportCancellation message is used to either: 
 * - cancel an entire PriceReport that was previously sent (by quoting the business reference of the original price report in the PriceReportIdentification element), or,
 * - cancel one or more individual prices from a previously sent price report (by using the PriceDetailsToBeCancelled sequence).
 * Technically, it is possible to cancel all the prices individually by using the PriceDetailsToBeCancelled sequence, but this is not recommended.
 * The cancellation should not contain the cancellation of prices for more than one NAV date. 
 * 
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceReportCancellationV04", propOrder = {
    "msgId",
    "poolRef",
    "prvsRef",
    "msgPgntn",
    "pricRptId",
    "cxlId",
    "cxlRsn",
    "xpctdPricCrrctnDt",
    "cmpltPricCxl",
    "cancPricValtnDtls",
    "xtnsn"
})
public class PriceReportCancellationV04 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "PoolRef")
    protected AdditionalReference3 poolRef;
    @XmlElement(name = "PrvsRef")
    protected AdditionalReference3 prvsRef;
    @XmlElement(name = "MsgPgntn", required = true)
    protected Pagination msgPgntn;
    @XmlElement(name = "PricRptId", required = true)
    protected String pricRptId;
    @XmlElement(name = "CxlId", required = true)
    protected String cxlId;
    @XmlElement(name = "CxlRsn")
    protected String cxlRsn;
    @XmlElement(name = "XpctdPricCrrctnDt")
    protected DateAndDateTime1Choice xpctdPricCrrctnDt;
    @XmlElement(name = "CmpltPricCxl")
    protected boolean cmpltPricCxl;
    @XmlElement(name = "CancPricValtnDtls")
    protected List<PriceReport3> cancPricValtnDtls;
    @XmlElement(name = "Xtnsn")
    protected List<Extension1> xtnsn;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public PriceReportCancellationV04 setMsgId(MessageIdentification1 value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the poolRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference3 }
     *     
     */
    public AdditionalReference3 getPoolRef() {
        return poolRef;
    }

    /**
     * Sets the value of the poolRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference3 }
     *     
     */
    public PriceReportCancellationV04 setPoolRef(AdditionalReference3 value) {
        this.poolRef = value;
        return this;
    }

    /**
     * Gets the value of the prvsRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference3 }
     *     
     */
    public AdditionalReference3 getPrvsRef() {
        return prvsRef;
    }

    /**
     * Sets the value of the prvsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference3 }
     *     
     */
    public PriceReportCancellationV04 setPrvsRef(AdditionalReference3 value) {
        this.prvsRef = value;
        return this;
    }

    /**
     * Gets the value of the msgPgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination }
     *     
     */
    public Pagination getMsgPgntn() {
        return msgPgntn;
    }

    /**
     * Sets the value of the msgPgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination }
     *     
     */
    public PriceReportCancellationV04 setMsgPgntn(Pagination value) {
        this.msgPgntn = value;
        return this;
    }

    /**
     * Gets the value of the pricRptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricRptId() {
        return pricRptId;
    }

    /**
     * Sets the value of the pricRptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PriceReportCancellationV04 setPricRptId(String value) {
        this.pricRptId = value;
        return this;
    }

    /**
     * Gets the value of the cxlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCxlId() {
        return cxlId;
    }

    /**
     * Sets the value of the cxlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PriceReportCancellationV04 setCxlId(String value) {
        this.cxlId = value;
        return this;
    }

    /**
     * Gets the value of the cxlRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCxlRsn() {
        return cxlRsn;
    }

    /**
     * Sets the value of the cxlRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PriceReportCancellationV04 setCxlRsn(String value) {
        this.cxlRsn = value;
        return this;
    }

    /**
     * Gets the value of the xpctdPricCrrctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime1Choice }
     *     
     */
    public DateAndDateTime1Choice getXpctdPricCrrctnDt() {
        return xpctdPricCrrctnDt;
    }

    /**
     * Sets the value of the xpctdPricCrrctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime1Choice }
     *     
     */
    public PriceReportCancellationV04 setXpctdPricCrrctnDt(DateAndDateTime1Choice value) {
        this.xpctdPricCrrctnDt = value;
        return this;
    }

    /**
     * Gets the value of the cmpltPricCxl property.
     * 
     */
    public boolean isCmpltPricCxl() {
        return cmpltPricCxl;
    }

    /**
     * Sets the value of the cmpltPricCxl property.
     * 
     */
    public PriceReportCancellationV04 setCmpltPricCxl(boolean value) {
        this.cmpltPricCxl = value;
        return this;
    }

    /**
     * Gets the value of the cancPricValtnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cancPricValtnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCancPricValtnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceReport3 }
     * 
     * 
     */
    public List<PriceReport3> getCancPricValtnDtls() {
        if (cancPricValtnDtls == null) {
            cancPricValtnDtls = new ArrayList<PriceReport3>();
        }
        return this.cancPricValtnDtls;
    }

    /**
     * Gets the value of the xtnsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xtnsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXtnsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension1 }
     * 
     * 
     */
    public List<Extension1> getXtnsn() {
        if (xtnsn == null) {
            xtnsn = new ArrayList<Extension1>();
        }
        return this.xtnsn;
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
     * Adds a new item to the cancPricValtnDtls list.
     * @see #getCancPricValtnDtls()
     * 
     */
    public PriceReportCancellationV04 addCancPricValtnDtls(PriceReport3 cancPricValtnDtls) {
        getCancPricValtnDtls().add(cancPricValtnDtls);
        return this;
    }

    /**
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public PriceReportCancellationV04 addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
