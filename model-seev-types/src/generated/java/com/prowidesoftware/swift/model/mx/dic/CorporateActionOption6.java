
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
 * Provides information about the corporate action option.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionOption6", propOrder = {
    "optnNb",
    "optnTp",
    "instdOrQtyToRcv"
})
public class CorporateActionOption6 {

    @XmlElement(name = "OptnNb", required = true)
    protected OptionNumber1Choice optnNb;
    @XmlElement(name = "OptnTp", required = true)
    protected CorporateActionOption4Choice optnTp;
    @XmlElement(name = "InstdOrQtyToRcv", required = true)
    protected InstructedOrQuantityToReceive1Choice instdOrQtyToRcv;

    /**
     * Gets the value of the optnNb property.
     * 
     * @return
     *     possible object is
     *     {@link OptionNumber1Choice }
     *     
     */
    public OptionNumber1Choice getOptnNb() {
        return optnNb;
    }

    /**
     * Sets the value of the optnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionNumber1Choice }
     *     
     */
    public CorporateActionOption6 setOptnNb(OptionNumber1Choice value) {
        this.optnNb = value;
        return this;
    }

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionOption4Choice }
     *     
     */
    public CorporateActionOption4Choice getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption4Choice }
     *     
     */
    public CorporateActionOption6 setOptnTp(CorporateActionOption4Choice value) {
        this.optnTp = value;
        return this;
    }

    /**
     * Gets the value of the instdOrQtyToRcv property.
     * 
     * @return
     *     possible object is
     *     {@link InstructedOrQuantityToReceive1Choice }
     *     
     */
    public InstructedOrQuantityToReceive1Choice getInstdOrQtyToRcv() {
        return instdOrQtyToRcv;
    }

    /**
     * Sets the value of the instdOrQtyToRcv property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructedOrQuantityToReceive1Choice }
     *     
     */
    public CorporateActionOption6 setInstdOrQtyToRcv(InstructedOrQuantityToReceive1Choice value) {
        this.instdOrQtyToRcv = value;
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
