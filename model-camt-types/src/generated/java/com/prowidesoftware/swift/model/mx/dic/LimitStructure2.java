
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
 * Limit details of one particular limit set by the member and managed by the transaction administrator.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LimitStructure2", propOrder = {
    "lmtId",
    "newLmtValSet"
})
public class LimitStructure2 {

    @XmlElement(name = "LmtId", required = true)
    protected LimitIdentification1Choice lmtId;
    @XmlElement(name = "NewLmtValSet", required = true)
    protected Limit8 newLmtValSet;

    /**
     * Gets the value of the lmtId property.
     * 
     * @return
     *     possible object is
     *     {@link LimitIdentification1Choice }
     *     
     */
    public LimitIdentification1Choice getLmtId() {
        return lmtId;
    }

    /**
     * Sets the value of the lmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitIdentification1Choice }
     *     
     */
    public LimitStructure2 setLmtId(LimitIdentification1Choice value) {
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
    public LimitStructure2 setNewLmtValSet(Limit8 value) {
        this.newLmtValSet = value;
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
