
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
 * Describes the multimodal or the individual transport of goods.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportMeans1Choice", propOrder = {
    "indvTrnsprt",
    "mltmdlTrnsprt"
})
public class TransportMeans1Choice {

    @XmlElement(name = "IndvTrnsprt")
    protected SingleTransport1 indvTrnsprt;
    @XmlElement(name = "MltmdlTrnsprt")
    protected MultimodalTransport1 mltmdlTrnsprt;

    /**
     * Gets the value of the indvTrnsprt property.
     * 
     * @return
     *     possible object is
     *     {@link SingleTransport1 }
     *     
     */
    public SingleTransport1 getIndvTrnsprt() {
        return indvTrnsprt;
    }

    /**
     * Sets the value of the indvTrnsprt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SingleTransport1 }
     *     
     */
    public TransportMeans1Choice setIndvTrnsprt(SingleTransport1 value) {
        this.indvTrnsprt = value;
        return this;
    }

    /**
     * Gets the value of the mltmdlTrnsprt property.
     * 
     * @return
     *     possible object is
     *     {@link MultimodalTransport1 }
     *     
     */
    public MultimodalTransport1 getMltmdlTrnsprt() {
        return mltmdlTrnsprt;
    }

    /**
     * Sets the value of the mltmdlTrnsprt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultimodalTransport1 }
     *     
     */
    public TransportMeans1Choice setMltmdlTrnsprt(MultimodalTransport1 value) {
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
