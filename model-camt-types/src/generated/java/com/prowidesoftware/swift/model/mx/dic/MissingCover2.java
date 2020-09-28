
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
 * Set of elements used to provide additional cover details for the claim non receipt.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MissingCover2", propOrder = {
    "mssngCoverInd",
    "coverCrrctn"
})
public class MissingCover2 {

    @XmlElement(name = "MssngCoverInd")
    protected boolean mssngCoverInd;
    @XmlElement(name = "CoverCrrctn")
    protected SettlementInformation15 coverCrrctn;

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
    public MissingCover2 setMssngCoverInd(boolean value) {
        this.mssngCoverInd = value;
        return this;
    }

    /**
     * Gets the value of the coverCrrctn property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementInformation15 }
     *     
     */
    public SettlementInformation15 getCoverCrrctn() {
        return coverCrrctn;
    }

    /**
     * Sets the value of the coverCrrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementInformation15 }
     *     
     */
    public MissingCover2 setCoverCrrctn(SettlementInformation15 value) {
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
