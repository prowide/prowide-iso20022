
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
 * The DerivativesTradeReport is sent by the trade repositories (TRs) to the users as a response to a query to provide transaction data.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivativesTradeReportV01", propOrder = {
    "rptHdr",
    "tradData",
    "splmtryData"
})
public class DerivativesTradeReportV01 {

    @XmlElement(name = "RptHdr", required = true)
    protected TradeQueryHeader4 rptHdr;
    @XmlElement(name = "TradData", required = true)
    protected TradeData17Choice tradData;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the rptHdr property.
     * 
     * @return
     *     possible object is
     *     {@link TradeQueryHeader4 }
     *     
     */
    public TradeQueryHeader4 getRptHdr() {
        return rptHdr;
    }

    /**
     * Sets the value of the rptHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeQueryHeader4 }
     *     
     */
    public DerivativesTradeReportV01 setRptHdr(TradeQueryHeader4 value) {
        this.rptHdr = value;
        return this;
    }

    /**
     * Gets the value of the tradData property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData17Choice }
     *     
     */
    public TradeData17Choice getTradData() {
        return tradData;
    }

    /**
     * Sets the value of the tradData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData17Choice }
     *     
     */
    public DerivativesTradeReportV01 setTradData(TradeData17Choice value) {
        this.tradData = value;
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
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public DerivativesTradeReportV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
