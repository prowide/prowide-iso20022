
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
 * Java class for SnFInputInfo complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SnFInputInfo", propOrder = {
    "snFInputTime",
    "snFInputSeqRange",
    "originalSnFRef",
    "snFLastReplicationTime"
})
public class SwSnFInputInfo {

    @XmlElement(name = "SnFInputTime")
    protected String snFInputTime;
    @XmlElement(name = "SnFInputSeqRange")
    protected SwSnFInputSeqRange snFInputSeqRange;
    @XmlElement(name = "OriginalSnFRef")
    protected String originalSnFRef;
    @XmlElement(name = "SnFLastReplicationTime")
    protected String snFLastReplicationTime;

    /**
     * Gets the value of the snFInputTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnFInputTime() {
        return snFInputTime;
    }

    /**
     * Sets the value of the snFInputTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwSnFInputInfo setSnFInputTime(String value) {
        this.snFInputTime = value;
        return this;
    }

    /**
     * Gets the value of the snFInputSeqRange property.
     * 
     * @return
     *     possible object is
     *     {@link SwSnFInputSeqRange }
     *     
     */
    public SwSnFInputSeqRange getSnFInputSeqRange() {
        return snFInputSeqRange;
    }

    /**
     * Sets the value of the snFInputSeqRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwSnFInputSeqRange }
     *     
     */
    public SwSnFInputInfo setSnFInputSeqRange(SwSnFInputSeqRange value) {
        this.snFInputSeqRange = value;
        return this;
    }

    /**
     * Gets the value of the originalSnFRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalSnFRef() {
        return originalSnFRef;
    }

    /**
     * Sets the value of the originalSnFRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwSnFInputInfo setOriginalSnFRef(String value) {
        this.originalSnFRef = value;
        return this;
    }

    /**
     * Gets the value of the snFLastReplicationTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnFLastReplicationTime() {
        return snFLastReplicationTime;
    }

    /**
     * Sets the value of the snFLastReplicationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwSnFInputInfo setSnFLastReplicationTime(String value) {
        this.snFLastReplicationTime = value;
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
