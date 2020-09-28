
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Specifies details of the liquidity indicators calculated for the money market fund.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundLiquidity1", propOrder = {
    "dalyMtrgAsstRate",
    "wklyMtrgAsstRate",
    "prtflLqdtyBrkdwn"
})
public class FundLiquidity1 {

    @XmlElement(name = "DalyMtrgAsstRate", required = true)
    protected BigDecimal dalyMtrgAsstRate;
    @XmlElement(name = "WklyMtrgAsstRate", required = true)
    protected BigDecimal wklyMtrgAsstRate;
    @XmlElement(name = "PrtflLqdtyBrkdwn", required = true)
    protected List<RangeBreakdown1> prtflLqdtyBrkdwn;

    /**
     * Gets the value of the dalyMtrgAsstRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDalyMtrgAsstRate() {
        return dalyMtrgAsstRate;
    }

    /**
     * Sets the value of the dalyMtrgAsstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FundLiquidity1 setDalyMtrgAsstRate(BigDecimal value) {
        this.dalyMtrgAsstRate = value;
        return this;
    }

    /**
     * Gets the value of the wklyMtrgAsstRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWklyMtrgAsstRate() {
        return wklyMtrgAsstRate;
    }

    /**
     * Sets the value of the wklyMtrgAsstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FundLiquidity1 setWklyMtrgAsstRate(BigDecimal value) {
        this.wklyMtrgAsstRate = value;
        return this;
    }

    /**
     * Gets the value of the prtflLqdtyBrkdwn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prtflLqdtyBrkdwn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrtflLqdtyBrkdwn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RangeBreakdown1 }
     * 
     * 
     */
    public List<RangeBreakdown1> getPrtflLqdtyBrkdwn() {
        if (prtflLqdtyBrkdwn == null) {
            prtflLqdtyBrkdwn = new ArrayList<RangeBreakdown1>();
        }
        return this.prtflLqdtyBrkdwn;
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
     * Adds a new item to the prtflLqdtyBrkdwn list.
     * @see #getPrtflLqdtyBrkdwn()
     * 
     */
    public FundLiquidity1 addPrtflLqdtyBrkdwn(RangeBreakdown1 prtflLqdtyBrkdwn) {
        getPrtflLqdtyBrkdwn().add(prtflLqdtyBrkdwn);
        return this;
    }

}
