
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
 * Specifies the aggregated data and failed rate of internalised settlement instructions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InternalisationData1", propOrder = {
    "aggt",
    "faildRate"
})
public class InternalisationData1 {

    @XmlElement(name = "Aggt", required = true)
    protected InternalisationData2 aggt;
    @XmlElement(name = "FaildRate", required = true)
    protected InternalisationDataRate1 faildRate;

    /**
     * Gets the value of the aggt property.
     * 
     * @return
     *     possible object is
     *     {@link InternalisationData2 }
     *     
     */
    public InternalisationData2 getAggt() {
        return aggt;
    }

    /**
     * Sets the value of the aggt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalisationData2 }
     *     
     */
    public InternalisationData1 setAggt(InternalisationData2 value) {
        this.aggt = value;
        return this;
    }

    /**
     * Gets the value of the faildRate property.
     * 
     * @return
     *     possible object is
     *     {@link InternalisationDataRate1 }
     *     
     */
    public InternalisationDataRate1 getFaildRate() {
        return faildRate;
    }

    /**
     * Sets the value of the faildRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalisationDataRate1 }
     *     
     */
    public InternalisationData1 setFaildRate(InternalisationDataRate1 value) {
        this.faildRate = value;
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
