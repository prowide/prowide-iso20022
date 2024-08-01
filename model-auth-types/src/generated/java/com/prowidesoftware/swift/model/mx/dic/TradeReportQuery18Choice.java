
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
 * Defines the type of the query, a recurrent or an ad-hoc query.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeReportQuery18Choice", propOrder = {
    "adHocQry",
    "rcrntQry"
})
public class TradeReportQuery18Choice {

    @XmlElement(name = "AdHocQry")
    protected TradeQueryCriteria14 adHocQry;
    @XmlElement(name = "RcrntQry")
    protected TradeRecurrentQuery7 rcrntQry;

    /**
     * Gets the value of the adHocQry property.
     * 
     * @return
     *     possible object is
     *     {@link TradeQueryCriteria14 }
     *     
     */
    public TradeQueryCriteria14 getAdHocQry() {
        return adHocQry;
    }

    /**
     * Sets the value of the adHocQry property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeQueryCriteria14 }
     *     
     */
    public TradeReportQuery18Choice setAdHocQry(TradeQueryCriteria14 value) {
        this.adHocQry = value;
        return this;
    }

    /**
     * Gets the value of the rcrntQry property.
     * 
     * @return
     *     possible object is
     *     {@link TradeRecurrentQuery7 }
     *     
     */
    public TradeRecurrentQuery7 getRcrntQry() {
        return rcrntQry;
    }

    /**
     * Sets the value of the rcrntQry property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeRecurrentQuery7 }
     *     
     */
    public TradeReportQuery18Choice setRcrntQry(TradeRecurrentQuery7 value) {
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
