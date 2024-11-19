
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
 * Specifies the category of the investment fund order.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundOrderType2", propOrder = {
    "ordrTp",
    "xtndedOrdrTp"
})
public class FundOrderType2 {

    @XmlElement(name = "OrdrTp")
    @XmlSchemaType(name = "string")
    protected FundOrderType3Code ordrTp;
    @XmlElement(name = "XtndedOrdrTp")
    protected String xtndedOrdrTp;

    /**
     * Gets the value of the ordrTp property.
     * 
     * @return
     *     possible object is
     *     {@link FundOrderType3Code }
     *     
     */
    public FundOrderType3Code getOrdrTp() {
        return ordrTp;
    }

    /**
     * Sets the value of the ordrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundOrderType3Code }
     *     
     */
    public FundOrderType2 setOrdrTp(FundOrderType3Code value) {
        this.ordrTp = value;
        return this;
    }

    /**
     * Gets the value of the xtndedOrdrTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedOrdrTp() {
        return xtndedOrdrTp;
    }

    /**
     * Sets the value of the xtndedOrdrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FundOrderType2 setXtndedOrdrTp(String value) {
        this.xtndedOrdrTp = value;
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
