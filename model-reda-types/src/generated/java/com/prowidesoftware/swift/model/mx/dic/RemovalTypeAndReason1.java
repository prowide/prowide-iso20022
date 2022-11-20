
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
 * Identifies the removal type, the reason, the exclusion period, the extension date and the termination date.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemovalTypeAndReason1", propOrder = {
    "rmvlTp",
    "rsn",
    "exclsnPrd"
})
public class RemovalTypeAndReason1 {

    @XmlElement(name = "RmvlTp", required = true)
    protected Removal1Choice rmvlTp;
    @XmlElement(name = "Rsn")
    protected GenericIdentification30 rsn;
    @XmlElement(name = "ExclsnPrd")
    protected DateOrDateTimePeriod3Choice exclsnPrd;

    /**
     * Gets the value of the rmvlTp property.
     * 
     * @return
     *     possible object is
     *     {@link Removal1Choice }
     *     
     */
    public Removal1Choice getRmvlTp() {
        return rmvlTp;
    }

    /**
     * Sets the value of the rmvlTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Removal1Choice }
     *     
     */
    public RemovalTypeAndReason1 setRmvlTp(Removal1Choice value) {
        this.rmvlTp = value;
        return this;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification30 }
     *     
     */
    public GenericIdentification30 getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification30 }
     *     
     */
    public RemovalTypeAndReason1 setRsn(GenericIdentification30 value) {
        this.rsn = value;
        return this;
    }

    /**
     * Gets the value of the exclsnPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DateOrDateTimePeriod3Choice }
     *     
     */
    public DateOrDateTimePeriod3Choice getExclsnPrd() {
        return exclsnPrd;
    }

    /**
     * Sets the value of the exclsnPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOrDateTimePeriod3Choice }
     *     
     */
    public RemovalTypeAndReason1 setExclsnPrd(DateOrDateTimePeriod3Choice value) {
        this.exclsnPrd = value;
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
