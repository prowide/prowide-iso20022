
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
 * Detailed information on rejections for derivatives submitted to trade repositories and failed to pass data validations.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivativesStatistics3", propOrder = {
    "ttlSubmittd",
    "ttlRjctd",
    "ttlCrrctdRjctns",
    "topRjctnRsns"
})
public class DerivativesStatistics3 {

    @XmlElement(name = "TtlSubmittd", required = true)
    protected StatisticsPerActionType1 ttlSubmittd;
    @XmlElement(name = "TtlRjctd", required = true)
    protected StatisticsPerActionType1 ttlRjctd;
    @XmlElement(name = "TtlCrrctdRjctns", required = true)
    protected StatisticsPerActionType1 ttlCrrctdRjctns;
    @XmlElement(name = "TopRjctnRsns", required = true)
    protected TopReasonsForRejections2 topRjctnRsns;

    /**
     * Gets the value of the ttlSubmittd property.
     * 
     * @return
     *     possible object is
     *     {@link StatisticsPerActionType1 }
     *     
     */
    public StatisticsPerActionType1 getTtlSubmittd() {
        return ttlSubmittd;
    }

    /**
     * Sets the value of the ttlSubmittd property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticsPerActionType1 }
     *     
     */
    public DerivativesStatistics3 setTtlSubmittd(StatisticsPerActionType1 value) {
        this.ttlSubmittd = value;
        return this;
    }

    /**
     * Gets the value of the ttlRjctd property.
     * 
     * @return
     *     possible object is
     *     {@link StatisticsPerActionType1 }
     *     
     */
    public StatisticsPerActionType1 getTtlRjctd() {
        return ttlRjctd;
    }

    /**
     * Sets the value of the ttlRjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticsPerActionType1 }
     *     
     */
    public DerivativesStatistics3 setTtlRjctd(StatisticsPerActionType1 value) {
        this.ttlRjctd = value;
        return this;
    }

    /**
     * Gets the value of the ttlCrrctdRjctns property.
     * 
     * @return
     *     possible object is
     *     {@link StatisticsPerActionType1 }
     *     
     */
    public StatisticsPerActionType1 getTtlCrrctdRjctns() {
        return ttlCrrctdRjctns;
    }

    /**
     * Sets the value of the ttlCrrctdRjctns property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticsPerActionType1 }
     *     
     */
    public DerivativesStatistics3 setTtlCrrctdRjctns(StatisticsPerActionType1 value) {
        this.ttlCrrctdRjctns = value;
        return this;
    }

    /**
     * Gets the value of the topRjctnRsns property.
     * 
     * @return
     *     possible object is
     *     {@link TopReasonsForRejections2 }
     *     
     */
    public TopReasonsForRejections2 getTopRjctnRsns() {
        return topRjctnRsns;
    }

    /**
     * Sets the value of the topRjctnRsns property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopReasonsForRejections2 }
     *     
     */
    public DerivativesStatistics3 setTopRjctnRsns(TopReasonsForRejections2 value) {
        this.topRjctnRsns = value;
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
