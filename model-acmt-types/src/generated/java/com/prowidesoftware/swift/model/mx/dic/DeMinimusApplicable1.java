
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Conditions applicable when the investor is covered by the "de minimis" exemption.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeMinimusApplicable1", propOrder = {
    "newIssePrmssn",
    "pctg"
})
public class DeMinimusApplicable1 {

    @XmlElement(name = "NewIssePrmssn")
    protected boolean newIssePrmssn;
    @XmlElement(name = "Pctg")
    protected BigDecimal pctg;

    /**
     * Gets the value of the newIssePrmssn property.
     * 
     */
    public boolean isNewIssePrmssn() {
        return newIssePrmssn;
    }

    /**
     * Sets the value of the newIssePrmssn property.
     * 
     */
    public DeMinimusApplicable1 setNewIssePrmssn(boolean value) {
        this.newIssePrmssn = value;
        return this;
    }

    /**
     * Gets the value of the pctg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPctg() {
        return pctg;
    }

    /**
     * Sets the value of the pctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public DeMinimusApplicable1 setPctg(BigDecimal value) {
        this.pctg = value;
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
