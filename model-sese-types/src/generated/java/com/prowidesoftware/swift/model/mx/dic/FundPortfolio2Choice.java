
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
 * Choice of different types of portfolio.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundPortfolio2Choice", propOrder = {
    "taxEffcntPdct",
    "gnlInvstmt",
    "pnsn"
})
public class FundPortfolio2Choice {

    @XmlElement(name = "TaxEffcntPdct")
    protected TaxEfficientProduct2 taxEffcntPdct;
    @XmlElement(name = "GnlInvstmt")
    protected GeneralInvestment1 gnlInvstmt;
    @XmlElement(name = "Pnsn")
    protected Pension2 pnsn;

    /**
     * Gets the value of the taxEffcntPdct property.
     * 
     * @return
     *     possible object is
     *     {@link TaxEfficientProduct2 }
     *     
     */
    public TaxEfficientProduct2 getTaxEffcntPdct() {
        return taxEffcntPdct;
    }

    /**
     * Sets the value of the taxEffcntPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxEfficientProduct2 }
     *     
     */
    public FundPortfolio2Choice setTaxEffcntPdct(TaxEfficientProduct2 value) {
        this.taxEffcntPdct = value;
        return this;
    }

    /**
     * Gets the value of the gnlInvstmt property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralInvestment1 }
     *     
     */
    public GeneralInvestment1 getGnlInvstmt() {
        return gnlInvstmt;
    }

    /**
     * Sets the value of the gnlInvstmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralInvestment1 }
     *     
     */
    public FundPortfolio2Choice setGnlInvstmt(GeneralInvestment1 value) {
        this.gnlInvstmt = value;
        return this;
    }

    /**
     * Gets the value of the pnsn property.
     * 
     * @return
     *     possible object is
     *     {@link Pension2 }
     *     
     */
    public Pension2 getPnsn() {
        return pnsn;
    }

    /**
     * Sets the value of the pnsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pension2 }
     *     
     */
    public FundPortfolio2Choice setPnsn(Pension2 value) {
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
