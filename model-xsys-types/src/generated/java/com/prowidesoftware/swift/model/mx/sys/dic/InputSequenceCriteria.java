
package com.prowidesoftware.swift.model.mx.sys.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for InputSequenceCriteria complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputSequenceCriteria", propOrder = {
    "inputChannel",
    "frSeq",
    "toSeq"
})
public class InputSequenceCriteria {

    @XmlElement(name = "InputChannel", namespace = "urn:swift:snl:ns.Sw", required = true)
    protected String inputChannel;
    @XmlElement(name = "FrSeq", required = true)
    protected BigDecimal frSeq;
    @XmlElement(name = "ToSeq", required = true)
    protected BigDecimal toSeq;

    /**
     * InputChannel
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputChannel() {
        return inputChannel;
    }

    /**
     * Sets the value of the inputChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InputSequenceCriteria setInputChannel(String value) {
        this.inputChannel = value;
        return this;
    }

    /**
     * Gets the value of the frSeq property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFrSeq() {
        return frSeq;
    }

    /**
     * Sets the value of the frSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InputSequenceCriteria setFrSeq(BigDecimal value) {
        this.frSeq = value;
        return this;
    }

    /**
     * Gets the value of the toSeq property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getToSeq() {
        return toSeq;
    }

    /**
     * Sets the value of the toSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InputSequenceCriteria setToSeq(BigDecimal value) {
        this.toSeq = value;
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
