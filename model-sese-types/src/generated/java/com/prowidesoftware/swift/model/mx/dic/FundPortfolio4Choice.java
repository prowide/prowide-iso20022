
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
 * Choice of different types of portfolio.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundPortfolio4Choice", propOrder = {
    "taxEffcntPdct",
    "gnlInvstmt",
    "pnsn"
})
public class FundPortfolio4Choice {

    @XmlElement(name = "TaxEffcntPdct")
    protected TaxEfficientProduct4 taxEffcntPdct;
    @XmlElement(name = "GnlInvstmt")
    protected GeneralInvestment2 gnlInvstmt;
    @XmlElement(name = "Pnsn")
    protected Pension4 pnsn;

    /**
     * Gets the value of the taxEffcntPdct property.
     * 
     * @return
     *     possible object is
     *     {@link TaxEfficientProduct4 }
     *     
     */
    public TaxEfficientProduct4 getTaxEffcntPdct() {
        return taxEffcntPdct;
    }

    /**
     * Sets the value of the taxEffcntPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxEfficientProduct4 }
     *     
     */
    public FundPortfolio4Choice setTaxEffcntPdct(TaxEfficientProduct4 value) {
        this.taxEffcntPdct = value;
        return this;
    }

    /**
     * Gets the value of the gnlInvstmt property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralInvestment2 }
     *     
     */
    public GeneralInvestment2 getGnlInvstmt() {
        return gnlInvstmt;
    }

    /**
     * Sets the value of the gnlInvstmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralInvestment2 }
     *     
     */
    public FundPortfolio4Choice setGnlInvstmt(GeneralInvestment2 value) {
        this.gnlInvstmt = value;
        return this;
    }

    /**
     * Gets the value of the pnsn property.
     * 
     * @return
     *     possible object is
     *     {@link Pension4 }
     *     
     */
    public Pension4 getPnsn() {
        return pnsn;
    }

    /**
     * Sets the value of the pnsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pension4 }
     *     
     */
    public FundPortfolio4Choice setPnsn(Pension4 value) {
        this.pnsn = value;
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
