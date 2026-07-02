
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
 * Provides additional information regarding corporate action option securities movement price details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionPriceSD2", propOrder = {
    "plcAndNm",
    "dtcCshInLieuPric"
})
public class CorporateActionPriceSD2 {

    @XmlElement(name = "PlcAndNm", required = true)
    protected String plcAndNm;
    @XmlElement(name = "DTCCshInLieuPric")
    protected RateAndAmountFormat17Choice dtcCshInLieuPric;

    /**
     * Gets the value of the plcAndNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcAndNm() {
        return plcAndNm;
    }

    /**
     * Sets the value of the plcAndNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionPriceSD2 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the dtcCshInLieuPric property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat17Choice }
     *     
     */
    public RateAndAmountFormat17Choice getDTCCshInLieuPric() {
        return dtcCshInLieuPric;
    }

    /**
     * Sets the value of the dtcCshInLieuPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat17Choice }
     *     
     */
    public CorporateActionPriceSD2 setDTCCshInLieuPric(RateAndAmountFormat17Choice value) {
        this.dtcCshInLieuPric = value;
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
