
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
@XmlType(name = "LimitDetailsStructure1", propOrder = {
    "curLmtId",
    "dfltLmtId",
    "newLmtValSet"
})
public class LimitDetailsStructure1 {

    @XmlElement(name = "CurLmtId")
    protected LimitIdentificationDetails2 curLmtId;
    @XmlElement(name = "DfltLmtId")
    protected LimitIdentificationDetails2 dfltLmtId;
    @XmlElement(name = "NewLmtValSet", required = true)
    protected LimitDetails4 newLmtValSet;

    /**
     * Gets the value of the curLmtId property.
     * 
     * @return
     *     possible object is
     *     {@link LimitIdentificationDetails2 }
     *     
     */
    public LimitIdentificationDetails2 getCurLmtId() {
        return curLmtId;
    }

    /**
     * Sets the value of the curLmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitIdentificationDetails2 }
     *     
     */
    public LimitDetailsStructure1 setCurLmtId(LimitIdentificationDetails2 value) {
        this.curLmtId = value;
        return this;
    }

    /**
     * Gets the value of the dfltLmtId property.
     * 
     * @return
     *     possible object is
     *     {@link LimitIdentificationDetails2 }
     *     
     */
    public LimitIdentificationDetails2 getDfltLmtId() {
        return dfltLmtId;
    }

    /**
     * Sets the value of the dfltLmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitIdentificationDetails2 }
     *     
     */
    public LimitDetailsStructure1 setDfltLmtId(LimitIdentificationDetails2 value) {
        this.dfltLmtId = value;
        return this;
    }

    /**
     * Gets the value of the newLmtValSet property.
     * 
     * @return
     *     possible object is
     *     {@link LimitDetails4 }
     *     
     */
    public LimitDetails4 getNewLmtValSet() {
        return newLmtValSet;
    }

    /**
     * Sets the value of the newLmtValSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitDetails4 }
     *     
     */
    public LimitDetailsStructure1 setNewLmtValSet(LimitDetails4 value) {
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
