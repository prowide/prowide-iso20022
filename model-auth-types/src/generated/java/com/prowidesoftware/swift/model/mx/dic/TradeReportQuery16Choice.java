
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
 * Defines the type of the query, a recurrent or an ad-hoc query.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeReportQuery16Choice", propOrder = {
    "adHocQry",
    "rcrntQry"
})
public class TradeReportQuery16Choice {

    @XmlElement(name = "AdHocQry")
    protected TradeQueryCriteria13 adHocQry;
    @XmlElement(name = "RcrntQry")
    protected TradeRecurrentQuery5 rcrntQry;

    /**
     * Gets the value of the adHocQry property.
     * 
     * @return
     *     possible object is
     *     {@link TradeQueryCriteria13 }
     *     
     */
    public TradeQueryCriteria13 getAdHocQry() {
        return adHocQry;
    }

    /**
     * Sets the value of the adHocQry property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeQueryCriteria13 }
     *     
     */
    public TradeReportQuery16Choice setAdHocQry(TradeQueryCriteria13 value) {
        this.adHocQry = value;
        return this;
    }

    /**
     * Gets the value of the rcrntQry property.
     * 
     * @return
     *     possible object is
     *     {@link TradeRecurrentQuery5 }
     *     
     */
    public TradeRecurrentQuery5 getRcrntQry() {
        return rcrntQry;
    }

    /**
     * Sets the value of the rcrntQry property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeRecurrentQuery5 }
     *     
     */
    public TradeReportQuery16Choice setRcrntQry(TradeRecurrentQuery5 value) {
        this.rcrntQry = value;
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
