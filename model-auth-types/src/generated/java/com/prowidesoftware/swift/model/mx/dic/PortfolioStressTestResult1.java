
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Outcome of the application of a hypothetical scenario on the valuation of a portfolio of financial instruments.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortfolioStressTestResult1", propOrder = {
    "prtflId",
    "strssLoss",
    "rawStrssLoss",
    "cover1Flg",
    "cover2Flg"
})
public class PortfolioStressTestResult1 {

    @XmlElement(name = "PrtflId", required = true)
    protected GenericIdentification165 prtflId;
    @XmlElement(name = "StrssLoss", required = true)
    protected AmountAndDirection102 strssLoss;
    @XmlElement(name = "RawStrssLoss")
    protected AmountAndDirection102 rawStrssLoss;
    @XmlElement(name = "Cover1Flg")
    protected boolean cover1Flg;
    @XmlElement(name = "Cover2Flg")
    protected boolean cover2Flg;

    /**
     * Gets the value of the prtflId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification165 }
     *     
     */
    public GenericIdentification165 getPrtflId() {
        return prtflId;
    }

    /**
     * Sets the value of the prtflId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification165 }
     *     
     */
    public PortfolioStressTestResult1 setPrtflId(GenericIdentification165 value) {
        this.prtflId = value;
        return this;
    }

    /**
     * Gets the value of the strssLoss property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public AmountAndDirection102 getStrssLoss() {
        return strssLoss;
    }

    /**
     * Sets the value of the strssLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public PortfolioStressTestResult1 setStrssLoss(AmountAndDirection102 value) {
        this.strssLoss = value;
        return this;
    }

    /**
     * Gets the value of the rawStrssLoss property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public AmountAndDirection102 getRawStrssLoss() {
        return rawStrssLoss;
    }

    /**
     * Sets the value of the rawStrssLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public PortfolioStressTestResult1 setRawStrssLoss(AmountAndDirection102 value) {
        this.rawStrssLoss = value;
        return this;
    }

    /**
     * Gets the value of the cover1Flg property.
     * 
     */
    public boolean isCover1Flg() {
        return cover1Flg;
    }

    /**
     * Sets the value of the cover1Flg property.
     * 
     */
    public PortfolioStressTestResult1 setCover1Flg(boolean value) {
        this.cover1Flg = value;
        return this;
    }

    /**
     * Gets the value of the cover2Flg property.
     * 
     */
    public boolean isCover2Flg() {
        return cover2Flg;
    }

    /**
     * Sets the value of the cover2Flg property.
     * 
     */
    public PortfolioStressTestResult1 setCover2Flg(boolean value) {
        this.cover2Flg = value;
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

}
