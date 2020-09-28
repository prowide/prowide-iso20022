
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
 * Data specific to securities and related fields used as a collateral.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HaircutPortfolioSecurityIdentification1", propOrder = {
    "prtflHrcutOrMrgn",
    "id"
})
public class HaircutPortfolioSecurityIdentification1 {

    @XmlElement(name = "PrtflHrcutOrMrgn")
    protected BigDecimal prtflHrcutOrMrgn;
    @XmlElement(name = "Id", required = true)
    protected Security3 id;

    /**
     * Gets the value of the prtflHrcutOrMrgn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrtflHrcutOrMrgn() {
        return prtflHrcutOrMrgn;
    }

    /**
     * Sets the value of the prtflHrcutOrMrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public HaircutPortfolioSecurityIdentification1 setPrtflHrcutOrMrgn(BigDecimal value) {
        this.prtflHrcutOrMrgn = value;
        return this;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Security3 }
     *     
     */
    public Security3 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Security3 }
     *     
     */
    public HaircutPortfolioSecurityIdentification1 setId(Security3 value) {
        this.id = value;
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
