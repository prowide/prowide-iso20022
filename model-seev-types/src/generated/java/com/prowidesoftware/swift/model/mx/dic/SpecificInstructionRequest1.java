
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
 * Request to execute specific instructions, such as participation registration, securities registration or blocking of securities.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecificInstructionRequest1", propOrder = {
    "prtcptnRegn",
    "blckgScties",
    "sctiesRegn"
})
public class SpecificInstructionRequest1 {

    @XmlElement(name = "PrtcptnRegn")
    protected Boolean prtcptnRegn;
    @XmlElement(name = "BlckgScties")
    protected Boolean blckgScties;
    @XmlElement(name = "SctiesRegn")
    protected Boolean sctiesRegn;

    /**
     * Gets the value of the prtcptnRegn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrtcptnRegn() {
        return prtcptnRegn;
    }

    /**
     * Sets the value of the prtcptnRegn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SpecificInstructionRequest1 setPrtcptnRegn(Boolean value) {
        this.prtcptnRegn = value;
        return this;
    }

    /**
     * Gets the value of the blckgScties property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBlckgScties() {
        return blckgScties;
    }

    /**
     * Sets the value of the blckgScties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SpecificInstructionRequest1 setBlckgScties(Boolean value) {
        this.blckgScties = value;
        return this;
    }

    /**
     * Gets the value of the sctiesRegn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSctiesRegn() {
        return sctiesRegn;
    }

    /**
     * Sets the value of the sctiesRegn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SpecificInstructionRequest1 setSctiesRegn(Boolean value) {
        this.sctiesRegn = value;
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
