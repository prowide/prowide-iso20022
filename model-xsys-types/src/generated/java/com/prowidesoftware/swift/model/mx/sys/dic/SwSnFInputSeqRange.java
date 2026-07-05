
package com.prowidesoftware.swift.model.mx.sys.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for SnFInputSeqRange complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SnFInputSeqRange", propOrder = {
    "firstSnFInputSeq",
    "lastSnFInputSeq"
})
public class SwSnFInputSeqRange {

    @XmlElement(name = "FirstSnFInputSeq", required = true)
    protected String firstSnFInputSeq;
    @XmlElement(name = "LastSnFInputSeq", required = true)
    protected String lastSnFInputSeq;

    /**
     * Gets the value of the firstSnFInputSeq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstSnFInputSeq() {
        return firstSnFInputSeq;
    }

    /**
     * Sets the value of the firstSnFInputSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwSnFInputSeqRange setFirstSnFInputSeq(String value) {
        this.firstSnFInputSeq = value;
        return this;
    }

    /**
     * Gets the value of the lastSnFInputSeq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastSnFInputSeq() {
        return lastSnFInputSeq;
    }

    /**
     * Sets the value of the lastSnFInputSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwSnFInputSeqRange setLastSnFInputSeq(String value) {
        this.lastSnFInputSeq = value;
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
