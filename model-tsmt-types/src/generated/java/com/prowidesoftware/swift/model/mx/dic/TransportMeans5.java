
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
 * Describes the multimodal or the individual transport of goods.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportMeans5", propOrder = {
    "indvTrnsprt",
    "mltmdlTrnsprt"
})
public class TransportMeans5 {

    @XmlElement(name = "IndvTrnsprt", required = true)
    protected SingleTransport7 indvTrnsprt;
    @XmlElement(name = "MltmdlTrnsprt")
    protected MultimodalTransport3 mltmdlTrnsprt;

    /**
     * Gets the value of the indvTrnsprt property.
     * 
     * @return
     *     possible object is
     *     {@link SingleTransport7 }
     *     
     */
    public SingleTransport7 getIndvTrnsprt() {
        return indvTrnsprt;
    }

    /**
     * Sets the value of the indvTrnsprt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SingleTransport7 }
     *     
     */
    public TransportMeans5 setIndvTrnsprt(SingleTransport7 value) {
        this.indvTrnsprt = value;
        return this;
    }

    /**
     * Gets the value of the mltmdlTrnsprt property.
     * 
     * @return
     *     possible object is
     *     {@link MultimodalTransport3 }
     *     
     */
    public MultimodalTransport3 getMltmdlTrnsprt() {
        return mltmdlTrnsprt;
    }

    /**
     * Sets the value of the mltmdlTrnsprt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultimodalTransport3 }
     *     
     */
    public TransportMeans5 setMltmdlTrnsprt(MultimodalTransport3 value) {
        this.mltmdlTrnsprt = value;
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
