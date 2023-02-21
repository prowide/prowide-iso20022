
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
 * Provides additional cover details for the claim non receipt.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MissingCover3", propOrder = {
    "mssngCoverInd",
    "coverCrrctn"
})
public class MissingCover3 {

    @XmlElement(name = "MssngCoverInd")
    protected boolean mssngCoverInd;
    @XmlElement(name = "CoverCrrctn")
    protected SettlementInstruction3 coverCrrctn;

    /**
     * Gets the value of the mssngCoverInd property.
     * 
     */
    public boolean isMssngCoverInd() {
        return mssngCoverInd;
    }

    /**
     * Sets the value of the mssngCoverInd property.
     * 
     */
    public MissingCover3 setMssngCoverInd(boolean value) {
        this.mssngCoverInd = value;
        return this;
    }

    /**
     * Gets the value of the coverCrrctn property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementInstruction3 }
     *     
     */
    public SettlementInstruction3 getCoverCrrctn() {
        return coverCrrctn;
    }

    /**
     * Sets the value of the coverCrrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementInstruction3 }
     *     
     */
    public MissingCover3 setCoverCrrctn(SettlementInstruction3 value) {
        this.coverCrrctn = value;
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
