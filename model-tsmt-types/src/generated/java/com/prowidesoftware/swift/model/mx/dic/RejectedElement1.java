
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
 * Provides information on the rejection reason of an individual element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RejectedElement1", propOrder = {
    "elmtSeqNb",
    "indvRjctnRsn"
})
public class RejectedElement1 {

    @XmlElement(name = "ElmtSeqNb", required = true)
    protected BigDecimal elmtSeqNb;
    @XmlElement(name = "IndvRjctnRsn", required = true)
    protected String indvRjctnRsn;

    /**
     * Gets the value of the elmtSeqNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getElmtSeqNb() {
        return elmtSeqNb;
    }

    /**
     * Sets the value of the elmtSeqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public RejectedElement1 setElmtSeqNb(BigDecimal value) {
        this.elmtSeqNb = value;
        return this;
    }

    /**
     * Gets the value of the indvRjctnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndvRjctnRsn() {
        return indvRjctnRsn;
    }

    /**
     * Sets the value of the indvRjctnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RejectedElement1 setIndvRjctnRsn(String value) {
        this.indvRjctnRsn = value;
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
