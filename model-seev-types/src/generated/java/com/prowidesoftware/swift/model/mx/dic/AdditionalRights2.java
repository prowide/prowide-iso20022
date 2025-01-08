
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
 * Information about the general meeting, specifying the participation requirements and the voting procedures. Alternatively, it may indicate where such information may be obtained.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalRights2", propOrder = {
    "addtlRght",
    "addtlRghtInfURLAdr",
    "addtlRghtDdln",
    "addtlRghtMktDdln",
    "addtlRghtThrshld"
})
public class AdditionalRights2 {

    @XmlElement(name = "AddtlRght", required = true)
    protected AdditionalRightCode1Choice addtlRght;
    @XmlElement(name = "AddtlRghtInfURLAdr")
    protected String addtlRghtInfURLAdr;
    @XmlElement(name = "AddtlRghtDdln")
    protected DateFormat29Choice addtlRghtDdln;
    @XmlElement(name = "AddtlRghtMktDdln")
    protected DateFormat29Choice addtlRghtMktDdln;
    @XmlElement(name = "AddtlRghtThrshld")
    protected AdditionalRightThreshold1Choice addtlRghtThrshld;

    /**
     * Gets the value of the addtlRght property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalRightCode1Choice }
     *     
     */
    public AdditionalRightCode1Choice getAddtlRght() {
        return addtlRght;
    }

    /**
     * Sets the value of the addtlRght property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalRightCode1Choice }
     *     
     */
    public AdditionalRights2 setAddtlRght(AdditionalRightCode1Choice value) {
        this.addtlRght = value;
        return this;
    }

    /**
     * Gets the value of the addtlRghtInfURLAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlRghtInfURLAdr() {
        return addtlRghtInfURLAdr;
    }

    /**
     * Sets the value of the addtlRghtInfURLAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalRights2 setAddtlRghtInfURLAdr(String value) {
        this.addtlRghtInfURLAdr = value;
        return this;
    }

    /**
     * Gets the value of the addtlRghtDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat29Choice }
     *     
     */
    public DateFormat29Choice getAddtlRghtDdln() {
        return addtlRghtDdln;
    }

    /**
     * Sets the value of the addtlRghtDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat29Choice }
     *     
     */
    public AdditionalRights2 setAddtlRghtDdln(DateFormat29Choice value) {
        this.addtlRghtDdln = value;
        return this;
    }

    /**
     * Gets the value of the addtlRghtMktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat29Choice }
     *     
     */
    public DateFormat29Choice getAddtlRghtMktDdln() {
        return addtlRghtMktDdln;
    }

    /**
     * Sets the value of the addtlRghtMktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat29Choice }
     *     
     */
    public AdditionalRights2 setAddtlRghtMktDdln(DateFormat29Choice value) {
        this.addtlRghtMktDdln = value;
        return this;
    }

    /**
     * Gets the value of the addtlRghtThrshld property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalRightThreshold1Choice }
     *     
     */
    public AdditionalRightThreshold1Choice getAddtlRghtThrshld() {
        return addtlRghtThrshld;
    }

    /**
     * Sets the value of the addtlRghtThrshld property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalRightThreshold1Choice }
     *     
     */
    public AdditionalRights2 setAddtlRghtThrshld(AdditionalRightThreshold1Choice value) {
        this.addtlRghtThrshld = value;
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
