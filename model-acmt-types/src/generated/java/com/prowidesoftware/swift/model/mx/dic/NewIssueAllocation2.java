
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
@XmlType(name = "NewIssueAllocation2", propOrder = {
    "rstrctd",
    "xmptPrsnRsn",
    "deMnms"
})
public class NewIssueAllocation2 {

    @XmlElement(name = "Rstrctd")
    protected boolean rstrctd;
    @XmlElement(name = "XmptPrsnRsn")
    protected String xmptPrsnRsn;
    @XmlElement(name = "DeMnms")
    protected DeMinimus1Choice deMnms;

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
    public NewIssueAllocation2 setRstrctd(boolean value) {
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
    public NewIssueAllocation2 setXmptPrsnRsn(String value) {
        this.xmptPrsnRsn = value;
        return this;
    }

    /**
     * Gets the value of the deMnms property.
     * 
     * @return
     *     possible object is
     *     {@link DeMinimus1Choice }
     *     
     */
    public DeMinimus1Choice getDeMnms() {
        return deMnms;
    }

    /**
     * Sets the value of the deMnms property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeMinimus1Choice }
     *     
     */
    public NewIssueAllocation2 setDeMnms(DeMinimus1Choice value) {
        this.deMnms = value;
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
