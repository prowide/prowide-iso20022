
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
 * Electronic presentation information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Presentation3", propOrder = {
    "frmt",
    "chanl",
    "adr"
})
public class Presentation3 {

    @XmlElement(name = "Frmt")
    protected DocumentFormat1Choice frmt;
    @XmlElement(name = "Chanl")
    protected Channel1Choice chanl;
    @XmlElement(name = "Adr")
    protected String adr;

    /**
     * Gets the value of the frmt property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentFormat1Choice }
     *     
     */
    public DocumentFormat1Choice getFrmt() {
        return frmt;
    }

    /**
     * Sets the value of the frmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentFormat1Choice }
     *     
     */
    public Presentation3 setFrmt(DocumentFormat1Choice value) {
        this.frmt = value;
        return this;
    }

    /**
     * Gets the value of the chanl property.
     * 
     * @return
     *     possible object is
     *     {@link Channel1Choice }
     *     
     */
    public Channel1Choice getChanl() {
        return chanl;
    }

    /**
     * Sets the value of the chanl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Channel1Choice }
     *     
     */
    public Presentation3 setChanl(Channel1Choice value) {
        this.chanl = value;
        return this;
    }

    /**
     * Gets the value of the adr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdr() {
        return adr;
    }

    /**
     * Sets the value of the adr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Presentation3 setAdr(String value) {
        this.adr = value;
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
