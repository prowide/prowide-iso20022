
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
 * Limit details of one or more limits set by the member and managed by the transaction administrator.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LimitStructure1Choice", propOrder = {
    "curLmtId",
    "allCurLmts"
})
public class LimitStructure1Choice {

    @XmlElement(name = "CurLmtId")
    protected LimitIdentification1 curLmtId;
    @XmlElement(name = "AllCurLmts")
    protected LimitIdentification2 allCurLmts;

    /**
     * Gets the value of the curLmtId property.
     * 
     * @return
     *     possible object is
     *     {@link LimitIdentification1 }
     *     
     */
    public LimitIdentification1 getCurLmtId() {
        return curLmtId;
    }

    /**
     * Sets the value of the curLmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitIdentification1 }
     *     
     */
    public LimitStructure1Choice setCurLmtId(LimitIdentification1 value) {
        this.curLmtId = value;
        return this;
    }

    /**
     * Gets the value of the allCurLmts property.
     * 
     * @return
     *     possible object is
     *     {@link LimitIdentification2 }
     *     
     */
    public LimitIdentification2 getAllCurLmts() {
        return allCurLmts;
    }

    /**
     * Sets the value of the allCurLmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitIdentification2 }
     *     
     */
    public LimitStructure1Choice setAllCurLmts(LimitIdentification2 value) {
        this.allCurLmts = value;
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
