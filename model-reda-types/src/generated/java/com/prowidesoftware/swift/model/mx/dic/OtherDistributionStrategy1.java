
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
 * Other distribution strategy.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherDistributionStrategy1", propOrder = {
    "dstrbtnStrtgyTp",
    "trgt",
    "addtlInf"
})
public class OtherDistributionStrategy1 {

    @XmlElement(name = "DstrbtnStrtgyTp")
    protected String dstrbtnStrtgyTp;
    @XmlElement(name = "Trgt")
    protected DistributionStrategy1Choice trgt;
    @XmlElement(name = "AddtlInf")
    protected AdditionalInformation15 addtlInf;

    /**
     * Gets the value of the dstrbtnStrtgyTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDstrbtnStrtgyTp() {
        return dstrbtnStrtgyTp;
    }

    /**
     * Sets the value of the dstrbtnStrtgyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OtherDistributionStrategy1 setDstrbtnStrtgyTp(String value) {
        this.dstrbtnStrtgyTp = value;
        return this;
    }

    /**
     * Gets the value of the trgt property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionStrategy1Choice }
     *     
     */
    public DistributionStrategy1Choice getTrgt() {
        return trgt;
    }

    /**
     * Sets the value of the trgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionStrategy1Choice }
     *     
     */
    public OtherDistributionStrategy1 setTrgt(DistributionStrategy1Choice value) {
        this.trgt = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInformation15 }
     *     
     */
    public AdditionalInformation15 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInformation15 }
     *     
     */
    public OtherDistributionStrategy1 setAddtlInf(AdditionalInformation15 value) {
        this.addtlInf = value;
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
