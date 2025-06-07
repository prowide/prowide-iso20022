
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
 * Scope
 * The ForeignExchangeTradeBulkStatusNotification message is sent by a central system to the participant to provide notification of the current status of one or more foreign exchange trades.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForeignExchangeTradeBulkStatusNotificationV06", propOrder = {
    "stsDtls",
    "tradDataRpt",
    "msgPgntn",
    "splmtryData"
})
public class ForeignExchangeTradeBulkStatusNotificationV06 {

    @XmlElement(name = "StsDtls", required = true)
    protected TradeData45 stsDtls;
    @XmlElement(name = "TradDataRpt", required = true)
    protected List<TradeDataReport2> tradDataRpt;
    @XmlElement(name = "MsgPgntn")
    protected Pagination1 msgPgntn;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the stsDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData45 }
     *     
     */
    public TradeData45 getStsDtls() {
        return stsDtls;
    }

    /**
     * Sets the value of the stsDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData45 }
     *     
     */
    public ForeignExchangeTradeBulkStatusNotificationV06 setStsDtls(TradeData45 value) {
        this.stsDtls = value;
        return this;
    }

    /**
     * Gets the value of the tradDataRpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradDataRpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradDataRpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeDataReport2 }
     * 
     * 
     */
    public List<TradeDataReport2> getTradDataRpt() {
        if (tradDataRpt == null) {
            tradDataRpt = new ArrayList<TradeDataReport2>();
        }
        return this.tradDataRpt;
    }

    /**
     * Gets the value of the msgPgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination1 }
     *     
     */
    public Pagination1 getMsgPgntn() {
        return msgPgntn;
    }

    /**
     * Sets the value of the msgPgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination1 }
     *     
     */
    public ForeignExchangeTradeBulkStatusNotificationV06 setMsgPgntn(Pagination1 value) {
        this.msgPgntn = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
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
     * Adds a new item to the tradDataRpt list.
     * @see #getTradDataRpt()
     * 
     */
    public ForeignExchangeTradeBulkStatusNotificationV06 addTradDataRpt(TradeDataReport2 tradDataRpt) {
        getTradDataRpt().add(tradDataRpt);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public ForeignExchangeTradeBulkStatusNotificationV06 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
