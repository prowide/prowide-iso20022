
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
 * Specifies the tax income part C report details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxIncomePartC1", propOrder = {
    "cptlGn",
    "dmstIncm",
    "frgnIncm",
    "nonAssessblIncm",
    "othrDdctn"
})
public class TaxIncomePartC1 {

    @XmlElement(name = "CptlGn")
    protected TaxIncomeCapitalGain1 cptlGn;
    @XmlElement(name = "DmstIncm")
    protected TaxIncomeDomestic1 dmstIncm;
    @XmlElement(name = "FrgnIncm")
    protected TaxIncomeForeign1 frgnIncm;
    @XmlElement(name = "NonAssessblIncm")
    protected TaxIncomeNonAssessable1 nonAssessblIncm;
    @XmlElement(name = "OthrDdctn")
    protected TaxIncomeOtherDeduction1 othrDdctn;

    /**
     * Gets the value of the cptlGn property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIncomeCapitalGain1 }
     *     
     */
    public TaxIncomeCapitalGain1 getCptlGn() {
        return cptlGn;
    }

    /**
     * Sets the value of the cptlGn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIncomeCapitalGain1 }
     *     
     */
    public TaxIncomePartC1 setCptlGn(TaxIncomeCapitalGain1 value) {
        this.cptlGn = value;
        return this;
    }

    /**
     * Gets the value of the dmstIncm property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIncomeDomestic1 }
     *     
     */
    public TaxIncomeDomestic1 getDmstIncm() {
        return dmstIncm;
    }

    /**
     * Sets the value of the dmstIncm property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIncomeDomestic1 }
     *     
     */
    public TaxIncomePartC1 setDmstIncm(TaxIncomeDomestic1 value) {
        this.dmstIncm = value;
        return this;
    }

    /**
     * Gets the value of the frgnIncm property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIncomeForeign1 }
     *     
     */
    public TaxIncomeForeign1 getFrgnIncm() {
        return frgnIncm;
    }

    /**
     * Sets the value of the frgnIncm property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIncomeForeign1 }
     *     
     */
    public TaxIncomePartC1 setFrgnIncm(TaxIncomeForeign1 value) {
        this.frgnIncm = value;
        return this;
    }

    /**
     * Gets the value of the nonAssessblIncm property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIncomeNonAssessable1 }
     *     
     */
    public TaxIncomeNonAssessable1 getNonAssessblIncm() {
        return nonAssessblIncm;
    }

    /**
     * Sets the value of the nonAssessblIncm property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIncomeNonAssessable1 }
     *     
     */
    public TaxIncomePartC1 setNonAssessblIncm(TaxIncomeNonAssessable1 value) {
        this.nonAssessblIncm = value;
        return this;
    }

    /**
     * Gets the value of the othrDdctn property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIncomeOtherDeduction1 }
     *     
     */
    public TaxIncomeOtherDeduction1 getOthrDdctn() {
        return othrDdctn;
    }

    /**
     * Sets the value of the othrDdctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIncomeOtherDeduction1 }
     *     
     */
    public TaxIncomePartC1 setOthrDdctn(TaxIncomeOtherDeduction1 value) {
        this.othrDdctn = value;
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
