
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
 * Limit details of one particular limit set by the member and managed by the transaction administrator.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LimitStructure5", propOrder = {
    "lmtId",
    "newLmtValSet",
    "odLmtValSet",
    "lmtValAmdmnt"
})
public class LimitStructure5 {

    @XmlElement(name = "LmtId", required = true)
    protected LimitIdentification3Choice lmtId;
    @XmlElement(name = "NewLmtValSet", required = true)
    protected Limit8 newLmtValSet;
    @XmlElement(name = "OdLmtValSet")
    protected Limit10 odLmtValSet;
    @XmlElement(name = "LmtValAmdmnt")
    protected Amount4Choice lmtValAmdmnt;

    /**
     * Gets the value of the lmtId property.
     * 
     * @return
     *     possible object is
     *     {@link LimitIdentification3Choice }
     *     
     */
    public LimitIdentification3Choice getLmtId() {
        return lmtId;
    }

    /**
     * Sets the value of the lmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitIdentification3Choice }
     *     
     */
    public LimitStructure5 setLmtId(LimitIdentification3Choice value) {
        this.lmtId = value;
        return this;
    }

    /**
     * Gets the value of the newLmtValSet property.
     * 
     * @return
     *     possible object is
     *     {@link Limit8 }
     *     
     */
    public Limit8 getNewLmtValSet() {
        return newLmtValSet;
    }

    /**
     * Sets the value of the newLmtValSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Limit8 }
     *     
     */
    public LimitStructure5 setNewLmtValSet(Limit8 value) {
        this.newLmtValSet = value;
        return this;
    }

    /**
     * Gets the value of the odLmtValSet property.
     * 
     * @return
     *     possible object is
     *     {@link Limit10 }
     *     
     */
    public Limit10 getOdLmtValSet() {
        return odLmtValSet;
    }

    /**
     * Sets the value of the odLmtValSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Limit10 }
     *     
     */
    public LimitStructure5 setOdLmtValSet(Limit10 value) {
        this.odLmtValSet = value;
        return this;
    }

    /**
     * Gets the value of the lmtValAmdmnt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount4Choice }
     *     
     */
    public Amount4Choice getLmtValAmdmnt() {
        return lmtValAmdmnt;
    }

    /**
     * Sets the value of the lmtValAmdmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount4Choice }
     *     
     */
    public LimitStructure5 setLmtValAmdmnt(Amount4Choice value) {
        this.lmtValAmdmnt = value;
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
