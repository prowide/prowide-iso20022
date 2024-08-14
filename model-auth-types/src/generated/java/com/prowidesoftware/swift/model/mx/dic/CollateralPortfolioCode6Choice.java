
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
 * Specifies the unique codes identifying the portfolio.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralPortfolioCode6Choice", propOrder = {
    "prtfl",
    "mrgnPrtflCd"
})
public class CollateralPortfolioCode6Choice {

    @XmlElement(name = "Prtfl")
    protected PortfolioCode3Choice prtfl;
    @XmlElement(name = "MrgnPrtflCd")
    protected MarginPortfolio4 mrgnPrtflCd;

    /**
     * Gets the value of the prtfl property.
     * 
     * @return
     *     possible object is
     *     {@link PortfolioCode3Choice }
     *     
     */
    public PortfolioCode3Choice getPrtfl() {
        return prtfl;
    }

    /**
     * Sets the value of the prtfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortfolioCode3Choice }
     *     
     */
    public CollateralPortfolioCode6Choice setPrtfl(PortfolioCode3Choice value) {
        this.prtfl = value;
        return this;
    }

    /**
     * Gets the value of the mrgnPrtflCd property.
     * 
     * @return
     *     possible object is
     *     {@link MarginPortfolio4 }
     *     
     */
    public MarginPortfolio4 getMrgnPrtflCd() {
        return mrgnPrtflCd;
    }

    /**
     * Sets the value of the mrgnPrtflCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginPortfolio4 }
     *     
     */
    public CollateralPortfolioCode6Choice setMrgnPrtflCd(MarginPortfolio4 value) {
        this.mrgnPrtflCd = value;
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
