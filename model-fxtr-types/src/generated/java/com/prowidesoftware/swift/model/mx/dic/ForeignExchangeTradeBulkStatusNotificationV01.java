
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
 * Scope
 * The ForeignExchangeTradeBulkStatusNotification message is sent by a central system to the participant to provide notification of the current status of one or more foreign exchange trades.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForeignExchangeTradeBulkStatusNotificationV01", propOrder = {
    "stsDtls",
    "tradData",
    "msgPgntn"
})
public class ForeignExchangeTradeBulkStatusNotificationV01 {

    @XmlElement(name = "StsDtls", required = true)
    protected TradeData4 stsDtls;
    @XmlElement(name = "TradData", required = true)
    protected List<TradeData5> tradData;
    @XmlElement(name = "MsgPgntn")
    protected Pagination msgPgntn;

    /**
     * Gets the value of the stsDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData4 }
     *     
     */
    public TradeData4 getStsDtls() {
        return stsDtls;
    }

    /**
     * Sets the value of the stsDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData4 }
     *     
     */
    public ForeignExchangeTradeBulkStatusNotificationV01 setStsDtls(TradeData4 value) {
        this.stsDtls = value;
        return this;
    }

    /**
     * Gets the value of the tradData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeData5 }
     * 
     * 
     */
    public List<TradeData5> getTradData() {
        if (tradData == null) {
            tradData = new ArrayList<TradeData5>();
        }
        return this.tradData;
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
    public ForeignExchangeTradeBulkStatusNotificationV01 setMsgPgntn(Pagination value) {
        this.msgPgntn = value;
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
     * Adds a new item to the tradData list.
     * @see #getTradData()
     * 
     */
    public ForeignExchangeTradeBulkStatusNotificationV01 addTradData(TradeData5 tradData) {
        getTradData().add(tradData);
        return this;
    }

}
