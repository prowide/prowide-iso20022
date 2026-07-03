
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
 * Specifies categories of statuses of a derivative when there is no reporting requirement for both counterparties.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconciliationCategory4", propOrder = {
    "rvvd",
    "frthrMod"
})
public class ReconciliationCategory4 {

    @XmlElement(name = "Rvvd")
    protected boolean rvvd;
    @XmlElement(name = "FrthrMod")
    protected boolean frthrMod;

    /**
     * Gets the value of the rvvd property.
     * 
     */
    public boolean isRvvd() {
        return rvvd;
    }

    /**
     * Sets the value of the rvvd property.
     * 
     */
    public ReconciliationCategory4 setRvvd(boolean value) {
        this.rvvd = value;
        return this;
    }

    /**
     * Gets the value of the frthrMod property.
     * 
     */
    public boolean isFrthrMod() {
        return frthrMod;
    }

    /**
     * Sets the value of the frthrMod property.
     * 
     */
    public ReconciliationCategory4 setFrthrMod(boolean value) {
        this.frthrMod = value;
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
