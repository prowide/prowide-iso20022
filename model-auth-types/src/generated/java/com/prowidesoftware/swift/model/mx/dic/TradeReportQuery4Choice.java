
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
@XmlType(name = "TradeReportQuery4Choice", propOrder = {
    "adHocQry",
    "rcrntQry"
})
public class TradeReportQuery4Choice {

    @XmlElement(name = "AdHocQry")
    protected TradeQueryCriteria4 adHocQry;
    @XmlElement(name = "RcrntQry")
    protected TradeRecurrentQuery3 rcrntQry;

    /**
     * Gets the value of the adHocQry property.
     * 
     * @return
     *     possible object is
     *     {@link TradeQueryCriteria4 }
     *     
     */
    public TradeQueryCriteria4 getAdHocQry() {
        return adHocQry;
    }

    /**
     * Sets the value of the adHocQry property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeQueryCriteria4 }
     *     
     */
    public TradeReportQuery4Choice setAdHocQry(TradeQueryCriteria4 value) {
        this.adHocQry = value;
        return this;
    }

    /**
     * Gets the value of the rcrntQry property.
     * 
     * @return
     *     possible object is
     *     {@link TradeRecurrentQuery3 }
     *     
     */
    public TradeRecurrentQuery3 getRcrntQry() {
        return rcrntQry;
    }

    /**
     * Sets the value of the rcrntQry property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeRecurrentQuery3 }
     *     
     */
    public TradeReportQuery4Choice setRcrntQry(TradeRecurrentQuery3 value) {
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
