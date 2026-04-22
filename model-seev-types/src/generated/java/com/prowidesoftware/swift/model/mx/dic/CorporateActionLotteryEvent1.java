
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Details of lottery event.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionLotteryEvent1", propOrder = {
    "tp",
    "featrTp"
})
public class CorporateActionLotteryEvent1 {

    @XmlElement(name = "Tp")
    protected LotteryTypeFormat4Choice tp;
    @XmlElement(name = "FeatrTp")
    @XmlSchemaType(name = "string")
    protected LotteryFeatureType1Code featrTp;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link LotteryTypeFormat4Choice }
     *     
     */
    public LotteryTypeFormat4Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotteryTypeFormat4Choice }
     *     
     */
    public CorporateActionLotteryEvent1 setTp(LotteryTypeFormat4Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the featrTp property.
     * 
     * @return
     *     possible object is
     *     {@link LotteryFeatureType1Code }
     *     
     */
    public LotteryFeatureType1Code getFeatrTp() {
        return featrTp;
    }

    /**
     * Sets the value of the featrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotteryFeatureType1Code }
     *     
     */
    public CorporateActionLotteryEvent1 setFeatrTp(LotteryFeatureType1Code value) {
        this.featrTp = value;
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
