
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
 * Provides details for a trade state report.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeStateReport22", propOrder = {
    "ctrPtySpcfcData",
    "cmonTradData",
    "techAttrbts",
    "pblcDssmntnData",
    "splmtryData"
})
public class TradeStateReport22 {

    @XmlElement(name = "CtrPtySpcfcData", required = true)
    protected List<CounterpartySpecificData36> ctrPtySpcfcData;
    @XmlElement(name = "CmonTradData", required = true)
    protected CommonTradeDataReport70 cmonTradData;
    @XmlElement(name = "TechAttrbts")
    protected TechnicalAttributes5 techAttrbts;
    @XmlElement(name = "PblcDssmntnData")
    protected DisseminationData1 pblcDssmntnData;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the ctrPtySpcfcData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ctrPtySpcfcData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtrPtySpcfcData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CounterpartySpecificData36 }
     * 
     * 
     * @return
     *     The value of the ctrPtySpcfcData property.
     */
    public List<CounterpartySpecificData36> getCtrPtySpcfcData() {
        if (ctrPtySpcfcData == null) {
            ctrPtySpcfcData = new ArrayList<>();
        }
        return this.ctrPtySpcfcData;
    }

    /**
     * Gets the value of the cmonTradData property.
     * 
     * @return
     *     possible object is
     *     {@link CommonTradeDataReport70 }
     *     
     */
    public CommonTradeDataReport70 getCmonTradData() {
        return cmonTradData;
    }

    /**
     * Sets the value of the cmonTradData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonTradeDataReport70 }
     *     
     */
    public TradeStateReport22 setCmonTradData(CommonTradeDataReport70 value) {
        this.cmonTradData = value;
        return this;
    }

    /**
     * Gets the value of the techAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link TechnicalAttributes5 }
     *     
     */
    public TechnicalAttributes5 getTechAttrbts() {
        return techAttrbts;
    }

    /**
     * Sets the value of the techAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TechnicalAttributes5 }
     *     
     */
    public TradeStateReport22 setTechAttrbts(TechnicalAttributes5 value) {
        this.techAttrbts = value;
        return this;
    }

    /**
     * Gets the value of the pblcDssmntnData property.
     * 
     * @return
     *     possible object is
     *     {@link DisseminationData1 }
     *     
     */
    public DisseminationData1 getPblcDssmntnData() {
        return pblcDssmntnData;
    }

    /**
     * Sets the value of the pblcDssmntnData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisseminationData1 }
     *     
     */
    public TradeStateReport22 setPblcDssmntnData(DisseminationData1 value) {
        this.pblcDssmntnData = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
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
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
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
     * Adds a new item to the ctrPtySpcfcData list.
     * @see #getCtrPtySpcfcData()
     * 
     */
    public TradeStateReport22 addCtrPtySpcfcData(CounterpartySpecificData36 ctrPtySpcfcData) {
        getCtrPtySpcfcData().add(ctrPtySpcfcData);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public TradeStateReport22 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
