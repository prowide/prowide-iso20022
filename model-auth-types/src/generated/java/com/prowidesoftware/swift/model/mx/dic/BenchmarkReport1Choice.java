
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
 * Benchmark report by the relevant national institution. The report can be either an update or a cancellation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BenchmarkReport1Choice", propOrder = {
    "cret",
    "upd",
    "cxl"
})
public class BenchmarkReport1Choice {

    @XmlElement(name = "Cret")
    protected BenchmarkCreate1 cret;
    @XmlElement(name = "Upd")
    protected BenchmarkUpdate1 upd;
    @XmlElement(name = "Cxl")
    protected BenchmarkCancellation1 cxl;

    /**
     * Gets the value of the cret property.
     * 
     * @return
     *     possible object is
     *     {@link BenchmarkCreate1 }
     *     
     */
    public BenchmarkCreate1 getCret() {
        return cret;
    }

    /**
     * Sets the value of the cret property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenchmarkCreate1 }
     *     
     */
    public BenchmarkReport1Choice setCret(BenchmarkCreate1 value) {
        this.cret = value;
        return this;
    }

    /**
     * Gets the value of the upd property.
     * 
     * @return
     *     possible object is
     *     {@link BenchmarkUpdate1 }
     *     
     */
    public BenchmarkUpdate1 getUpd() {
        return upd;
    }

    /**
     * Sets the value of the upd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenchmarkUpdate1 }
     *     
     */
    public BenchmarkReport1Choice setUpd(BenchmarkUpdate1 value) {
        this.upd = value;
        return this;
    }

    /**
     * Gets the value of the cxl property.
     * 
     * @return
     *     possible object is
     *     {@link BenchmarkCancellation1 }
     *     
     */
    public BenchmarkCancellation1 getCxl() {
        return cxl;
    }

    /**
     * Sets the value of the cxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenchmarkCancellation1 }
     *     
     */
    public BenchmarkReport1Choice setCxl(BenchmarkCancellation1 value) {
        this.cxl = value;
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
