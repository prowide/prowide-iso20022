
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
 * Indicates that the claim for non receipt is effectively a missing cover.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MissingCover", propOrder = {
    "mssngCoverIndctn"
})
public class MissingCover {

    @XmlElement(name = "MssngCoverIndctn")
    protected boolean mssngCoverIndctn;

    /**
     * Gets the value of the mssngCoverIndctn property.
     * 
     */
    public boolean isMssngCoverIndctn() {
        return mssngCoverIndctn;
    }

    /**
     * Sets the value of the mssngCoverIndctn property.
     * 
     */
    public MissingCover setMssngCoverIndctn(boolean value) {
        this.mssngCoverIndctn = value;
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
