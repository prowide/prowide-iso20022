
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
 * Statistics for a financial instrument generated as part of transparency calculations.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatisticsTransparency2", propOrder = {
    "ttlNbOfTxsExctd",
    "ttlVolOfTxsExctd"
})
public class StatisticsTransparency2 {

    @XmlElement(name = "TtlNbOfTxsExctd", required = true)
    protected BigDecimal ttlNbOfTxsExctd;
    @XmlElement(name = "TtlVolOfTxsExctd", required = true)
    protected BigDecimal ttlVolOfTxsExctd;

    /**
     * Gets the value of the ttlNbOfTxsExctd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNbOfTxsExctd() {
        return ttlNbOfTxsExctd;
    }

    /**
     * Sets the value of the ttlNbOfTxsExctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public StatisticsTransparency2 setTtlNbOfTxsExctd(BigDecimal value) {
        this.ttlNbOfTxsExctd = value;
        return this;
    }

    /**
     * Gets the value of the ttlVolOfTxsExctd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlVolOfTxsExctd() {
        return ttlVolOfTxsExctd;
    }

    /**
     * Sets the value of the ttlVolOfTxsExctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public StatisticsTransparency2 setTtlVolOfTxsExctd(BigDecimal value) {
        this.ttlVolOfTxsExctd = value;
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
