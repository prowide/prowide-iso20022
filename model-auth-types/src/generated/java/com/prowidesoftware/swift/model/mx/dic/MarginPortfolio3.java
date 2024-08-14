
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the unique codes.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarginPortfolio3", propOrder = {
    "initlMrgnPrtflCd",
    "vartnMrgnPrtflCd"
})
public class MarginPortfolio3 {

    @XmlElement(name = "InitlMrgnPrtflCd", required = true)
    protected PortfolioCode5Choice initlMrgnPrtflCd;
    @XmlElement(name = "VartnMrgnPrtflCd")
    protected PortfolioCode5Choice vartnMrgnPrtflCd;

    /**
     * Gets the value of the initlMrgnPrtflCd property.
     * 
     * @return
     *     possible object is
     *     {@link PortfolioCode5Choice }
     *     
     */
    public PortfolioCode5Choice getInitlMrgnPrtflCd() {
        return initlMrgnPrtflCd;
    }

    /**
     * Sets the value of the initlMrgnPrtflCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortfolioCode5Choice }
     *     
     */
    public MarginPortfolio3 setInitlMrgnPrtflCd(PortfolioCode5Choice value) {
        this.initlMrgnPrtflCd = value;
        return this;
    }

    /**
     * Gets the value of the vartnMrgnPrtflCd property.
     * 
     * @return
     *     possible object is
     *     {@link PortfolioCode5Choice }
     *     
     */
    public PortfolioCode5Choice getVartnMrgnPrtflCd() {
        return vartnMrgnPrtflCd;
    }

    /**
     * Sets the value of the vartnMrgnPrtflCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortfolioCode5Choice }
     *     
     */
    public MarginPortfolio3 setVartnMrgnPrtflCd(PortfolioCode5Choice value) {
        this.vartnMrgnPrtflCd = value;
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
