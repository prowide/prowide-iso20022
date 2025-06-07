
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Details of the margin call request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarginCall1", propOrder = {
    "xpsdAmtPtyA",
    "xpsdAmtPtyB",
    "xpsrCnvntn",
    "indpdntAmtPtyA",
    "indpdntAmtPtyB",
    "mrgnTerms",
    "collBal"
})
public class MarginCall1 {

    @XmlElement(name = "XpsdAmtPtyA")
    protected ActiveCurrencyAndAmount xpsdAmtPtyA;
    @XmlElement(name = "XpsdAmtPtyB")
    protected ActiveCurrencyAndAmount xpsdAmtPtyB;
    @XmlElement(name = "XpsrCnvntn")
    @XmlSchemaType(name = "string")
    protected ExposureConventionType1Code xpsrCnvntn;
    @XmlElement(name = "IndpdntAmtPtyA")
    protected AggregatedIndependentAmount1 indpdntAmtPtyA;
    @XmlElement(name = "IndpdntAmtPtyB")
    protected AggregatedIndependentAmount1 indpdntAmtPtyB;
    @XmlElement(name = "MrgnTerms")
    protected MarginTerms1Choice mrgnTerms;
    @XmlElement(name = "CollBal")
    protected CollateralBalance1Choice collBal;

    /**
     * Gets the value of the xpsdAmtPtyA property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getXpsdAmtPtyA() {
        return xpsdAmtPtyA;
    }

    /**
     * Sets the value of the xpsdAmtPtyA property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public MarginCall1 setXpsdAmtPtyA(ActiveCurrencyAndAmount value) {
        this.xpsdAmtPtyA = value;
        return this;
    }

    /**
     * Gets the value of the xpsdAmtPtyB property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getXpsdAmtPtyB() {
        return xpsdAmtPtyB;
    }

    /**
     * Sets the value of the xpsdAmtPtyB property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public MarginCall1 setXpsdAmtPtyB(ActiveCurrencyAndAmount value) {
        this.xpsdAmtPtyB = value;
        return this;
    }

    /**
     * Gets the value of the xpsrCnvntn property.
     * 
     * @return
     *     possible object is
     *     {@link ExposureConventionType1Code }
     *     
     */
    public ExposureConventionType1Code getXpsrCnvntn() {
        return xpsrCnvntn;
    }

    /**
     * Sets the value of the xpsrCnvntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposureConventionType1Code }
     *     
     */
    public MarginCall1 setXpsrCnvntn(ExposureConventionType1Code value) {
        this.xpsrCnvntn = value;
        return this;
    }

    /**
     * Gets the value of the indpdntAmtPtyA property.
     * 
     * @return
     *     possible object is
     *     {@link AggregatedIndependentAmount1 }
     *     
     */
    public AggregatedIndependentAmount1 getIndpdntAmtPtyA() {
        return indpdntAmtPtyA;
    }

    /**
     * Sets the value of the indpdntAmtPtyA property.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregatedIndependentAmount1 }
     *     
     */
    public MarginCall1 setIndpdntAmtPtyA(AggregatedIndependentAmount1 value) {
        this.indpdntAmtPtyA = value;
        return this;
    }

    /**
     * Gets the value of the indpdntAmtPtyB property.
     * 
     * @return
     *     possible object is
     *     {@link AggregatedIndependentAmount1 }
     *     
     */
    public AggregatedIndependentAmount1 getIndpdntAmtPtyB() {
        return indpdntAmtPtyB;
    }

    /**
     * Sets the value of the indpdntAmtPtyB property.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregatedIndependentAmount1 }
     *     
     */
    public MarginCall1 setIndpdntAmtPtyB(AggregatedIndependentAmount1 value) {
        this.indpdntAmtPtyB = value;
        return this;
    }

    /**
     * Gets the value of the mrgnTerms property.
     * 
     * @return
     *     possible object is
     *     {@link MarginTerms1Choice }
     *     
     */
    public MarginTerms1Choice getMrgnTerms() {
        return mrgnTerms;
    }

    /**
     * Sets the value of the mrgnTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginTerms1Choice }
     *     
     */
    public MarginCall1 setMrgnTerms(MarginTerms1Choice value) {
        this.mrgnTerms = value;
        return this;
    }

    /**
     * Gets the value of the collBal property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralBalance1Choice }
     *     
     */
    public CollateralBalance1Choice getCollBal() {
        return collBal;
    }

    /**
     * Sets the value of the collBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralBalance1Choice }
     *     
     */
    public MarginCall1 setCollBal(CollateralBalance1Choice value) {
        this.collBal = value;
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
