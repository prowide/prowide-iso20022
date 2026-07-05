
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
 * Java class for UnAckedSnFOutputSeq complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnAckedSnFOutputSeq", propOrder = {
    "snFOutputSeq",
    "snFOutputSeqStatus"
})
public class SwUnAckedSnFOutputSeq {

    @XmlElement(name = "SnFOutputSeq", required = true)
    protected String snFOutputSeq;
    @XmlElement(name = "SnFOutputSeqStatus", required = true)
    protected String snFOutputSeqStatus;

    /**
     * Gets the value of the snFOutputSeq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnFOutputSeq() {
        return snFOutputSeq;
    }

    /**
     * Sets the value of the snFOutputSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwUnAckedSnFOutputSeq setSnFOutputSeq(String value) {
        this.snFOutputSeq = value;
        return this;
    }

    /**
     * Gets the value of the snFOutputSeqStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnFOutputSeqStatus() {
        return snFOutputSeqStatus;
    }

    /**
     * Sets the value of the snFOutputSeqStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwUnAckedSnFOutputSeq setSnFOutputSeqStatus(String value) {
        this.snFOutputSeqStatus = value;
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
