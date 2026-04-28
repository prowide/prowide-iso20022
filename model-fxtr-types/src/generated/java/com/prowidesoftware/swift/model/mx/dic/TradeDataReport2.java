
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
     * {@link TradeData44 }
     * 
     * 
     */
    public List<TradeData44> getTradData() {
        if (tradData == null) {
            tradData = new ArrayList<TradeData44>();
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
