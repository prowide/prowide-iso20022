
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
 * Provides additional cover details for the claim non receipt.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MissingCover4", propOrder = {
    "mssngCoverInd",
    "coverCrrctn"
})
public class MissingCover4 {

    @XmlElement(name = "MssngCoverInd")
    protected boolean mssngCoverInd;
    @XmlElement(name = "CoverCrrctn")
    protected SettlementInstruction6 coverCrrctn;

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
    public MissingCover4 setMssngCoverInd(boolean value) {
        this.mssngCoverInd = value;
        return this;
    }

    /**
     * Gets the value of the coverCrrctn property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementInstruction6 }
     *     
     */
    public SettlementInstruction6 getCoverCrrctn() {
        return coverCrrctn;
    }

    /**
     * Sets the value of the coverCrrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementInstruction6 }
     *     
     */
    public MissingCover4 setCoverCrrctn(SettlementInstruction6 value) {
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
