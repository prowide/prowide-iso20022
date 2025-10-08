
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
 * Identifies the associated trades and optionally, the linked report.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeDataReport2", propOrder = {
    "lkdRptId",
    "tradData"
})
public class TradeDataReport2 {

    @XmlElement(name = "LkdRptId")
    protected String lkdRptId;
    @XmlElement(name = "TradData", required = true)
    protected List<TradeData44> tradData;

    /**
     * Gets the value of the lkdRptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLkdRptId() {
        return lkdRptId;
    }

    /**
     * Sets the value of the lkdRptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeDataReport2 setLkdRptId(String value) {
        this.lkdRptId = value;
        return this;
    }

    /**
     * Gets the value of the tradData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tradData property.
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
     * {@link TradeData44 }
     * 
     * 
     * @return
     *     The value of the tradData property.
     */
    public List<TradeData44> getTradData() {
        if (tradData == null) {
            tradData = new ArrayList<>();
        }
        return this.tradData;
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
    public TradeDataReport2 addTradData(TradeData44 tradData) {
        getTradData().add(tradData);
        return this;
    }

}
