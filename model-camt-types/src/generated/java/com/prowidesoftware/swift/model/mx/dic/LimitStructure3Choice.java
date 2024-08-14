
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
@XmlType(name = "LimitStructure3Choice", propOrder = {
    "curLmtId",
    "allCurLmts"
})
public class LimitStructure3Choice {

    @XmlElement(name = "CurLmtId")
    protected LimitIdentification8 curLmtId;
    @XmlElement(name = "AllCurLmts")
    protected LimitIdentification9 allCurLmts;

    /**
     * Gets the value of the curLmtId property.
     * 
     * @return
     *     possible object is
     *     {@link LimitIdentification8 }
     *     
     */
    public LimitIdentification8 getCurLmtId() {
        return curLmtId;
    }

    /**
     * Sets the value of the curLmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitIdentification8 }
     *     
     */
    public LimitStructure3Choice setCurLmtId(LimitIdentification8 value) {
        this.curLmtId = value;
        return this;
    }

    /**
     * Gets the value of the allCurLmts property.
     * 
     * @return
     *     possible object is
     *     {@link LimitIdentification9 }
     *     
     */
    public LimitIdentification9 getAllCurLmts() {
        return allCurLmts;
    }

    /**
     * Sets the value of the allCurLmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitIdentification9 }
     *     
     */
    public LimitStructure3Choice setAllCurLmts(LimitIdentification9 value) {
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
