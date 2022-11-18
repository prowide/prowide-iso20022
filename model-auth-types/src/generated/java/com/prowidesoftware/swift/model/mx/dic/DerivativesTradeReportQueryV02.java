
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
 * The DerivativesTradeReportQuery message is sent by the supervisory authority system to the trade repositories, to query data based on the search criteria for the trade transaction as defined by the system user.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivativesTradeReportQueryV02", propOrder = {
    "rqstngAuthrty",
    "tradQryData",
    "splmtryData"
})
public class DerivativesTradeReportQueryV02 {

    @XmlElement(name = "RqstngAuthrty", required = true)
    protected PartyIdentification121Choice rqstngAuthrty;
    @XmlElement(name = "TradQryData", required = true)
    protected TradeReportQuery10Choice tradQryData;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the rqstngAuthrty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification121Choice }
     *     
     */
    public PartyIdentification121Choice getRqstngAuthrty() {
        return rqstngAuthrty;
    }

    /**
     * Sets the value of the rqstngAuthrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification121Choice }
     *     
     */
    public DerivativesTradeReportQueryV02 setRqstngAuthrty(PartyIdentification121Choice value) {
        this.rqstngAuthrty = value;
        return this;
    }

    /**
     * Gets the value of the tradQryData property.
     * 
     * @return
     *     possible object is
     *     {@link TradeReportQuery10Choice }
     *     
     */
    public TradeReportQuery10Choice getTradQryData() {
        return tradQryData;
    }

    /**
     * Sets the value of the tradQryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeReportQuery10Choice }
     *     
     */
    public DerivativesTradeReportQueryV02 setTradQryData(TradeReportQuery10Choice value) {
        this.tradQryData = value;
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
    public DerivativesTradeReportQueryV02 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}