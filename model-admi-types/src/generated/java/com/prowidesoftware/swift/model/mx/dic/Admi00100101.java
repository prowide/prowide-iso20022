
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
 * Scope
 * The Report message is used for general application level data reporting. A message may contain either a full report or one single tranche (part) of a report split in a multi-tranches (multi-parts). The message contains a mechanism to support the correct reassembling of the reporting data by an application.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "admi.001.001.01", propOrder = {
    "trchHdr",
    "trchBody"
})
public class Admi00100101 {

    @XmlElement(name = "TrchHdr", required = true)
    protected BulkReportHeader trchHdr;
    @XmlElement(name = "TrchBody", required = true)
    protected BulkReportBody trchBody;

    /**
     * Gets the value of the trchHdr property.
     * 
     * @return
     *     possible object is
     *     {@link BulkReportHeader }
     *     
     */
    public BulkReportHeader getTrchHdr() {
        return trchHdr;
    }

    /**
     * Sets the value of the trchHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BulkReportHeader }
     *     
     */
    public Admi00100101 setTrchHdr(BulkReportHeader value) {
        this.trchHdr = value;
        return this;
    }

    /**
     * Gets the value of the trchBody property.
     * 
     * @return
     *     possible object is
     *     {@link BulkReportBody }
     *     
     */
    public BulkReportBody getTrchBody() {
        return trchBody;
    }

    /**
     * Sets the value of the trchBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link BulkReportBody }
     *     
     */
    public Admi00100101 setTrchBody(BulkReportBody value) {
        this.trchBody = value;
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
