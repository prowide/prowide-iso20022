
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
 * Java class for OutputSequenceCriteria complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputSequenceCriteria", propOrder = {
    "outputChannel",
    "frSeq",
    "toSeq"
})
public class OutputSequenceCriteria {

    @XmlElement(name = "OutputChannel", namespace = "urn:swift:snl:ns.Sw", required = true)
    protected String outputChannel;
    @XmlElement(name = "FrSeq", required = true)
    protected BigDecimal frSeq;
    @XmlElement(name = "ToSeq", required = true)
    protected BigDecimal toSeq;

    /**
     * OutputChannel
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputChannel() {
        return outputChannel;
    }

    /**
     * Sets the value of the outputChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OutputSequenceCriteria setOutputChannel(String value) {
        this.outputChannel = value;
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
    public OutputSequenceCriteria setFrSeq(BigDecimal value) {
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
    public OutputSequenceCriteria setToSeq(BigDecimal value) {
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
