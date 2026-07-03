
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
 * Information about the investment account ownership with respect to new issue allocation for a hedge fund.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NewIssueAllocation1", propOrder = {
    "rstrctd",
    "xmptPrsnRsn",
    "deMnmsAplbl",
    "deMnmsNotAplbl"
})
public class NewIssueAllocation1 {

    @XmlElement(name = "Rstrctd")
    protected boolean rstrctd;
    @XmlElement(name = "XmptPrsnRsn")
    protected String xmptPrsnRsn;
    @XmlElement(name = "DeMnmsAplbl")
    protected DeMinimusApplicable1 deMnmsAplbl;
    @XmlElement(name = "DeMnmsNotAplbl")
    protected DeMinimusNotApplicable1 deMnmsNotAplbl;

    /**
     * Gets the value of the rstrctd property.
     * 
     */
    public boolean isRstrctd() {
        return rstrctd;
    }

    /**
     * Sets the value of the rstrctd property.
     * 
     */
    public NewIssueAllocation1 setRstrctd(boolean value) {
        this.rstrctd = value;
        return this;
    }

    /**
     * Gets the value of the xmptPrsnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmptPrsnRsn() {
        return xmptPrsnRsn;
    }

    /**
     * Sets the value of the xmptPrsnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public NewIssueAllocation1 setXmptPrsnRsn(String value) {
        this.xmptPrsnRsn = value;
        return this;
    }

    /**
     * Gets the value of the deMnmsAplbl property.
     * 
     * @return
     *     possible object is
     *     {@link DeMinimusApplicable1 }
     *     
     */
    public DeMinimusApplicable1 getDeMnmsAplbl() {
        return deMnmsAplbl;
    }

    /**
     * Sets the value of the deMnmsAplbl property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeMinimusApplicable1 }
     *     
     */
    public NewIssueAllocation1 setDeMnmsAplbl(DeMinimusApplicable1 value) {
        this.deMnmsAplbl = value;
        return this;
    }

    /**
     * Gets the value of the deMnmsNotAplbl property.
     * 
     * @return
     *     possible object is
     *     {@link DeMinimusNotApplicable1 }
     *     
     */
    public DeMinimusNotApplicable1 getDeMnmsNotAplbl() {
        return deMnmsNotAplbl;
    }

    /**
     * Sets the value of the deMnmsNotAplbl property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeMinimusNotApplicable1 }
     *     
     */
    public NewIssueAllocation1 setDeMnmsNotAplbl(DeMinimusNotApplicable1 value) {
        this.deMnmsNotAplbl = value;
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
