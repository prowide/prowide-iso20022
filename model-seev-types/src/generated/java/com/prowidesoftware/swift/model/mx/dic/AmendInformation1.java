
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
 * Information specific to an amendment or cancellation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmendInformation1", propOrder = {
    "prvsRef",
    "rcnfrmInstrs"
})
public class AmendInformation1 {

    @XmlElement(name = "PrvsRef", required = true)
    protected MessageIdentification prvsRef;
    @XmlElement(name = "RcnfrmInstrs")
    protected boolean rcnfrmInstrs;

    /**
     * Gets the value of the prvsRef property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification }
     *     
     */
    public MessageIdentification getPrvsRef() {
        return prvsRef;
    }

    /**
     * Sets the value of the prvsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification }
     *     
     */
    public AmendInformation1 setPrvsRef(MessageIdentification value) {
        this.prvsRef = value;
        return this;
    }

    /**
     * Gets the value of the rcnfrmInstrs property.
     * 
     */
    public boolean isRcnfrmInstrs() {
        return rcnfrmInstrs;
    }

    /**
     * Sets the value of the rcnfrmInstrs property.
     * 
     */
    public AmendInformation1 setRcnfrmInstrs(boolean value) {
        this.rcnfrmInstrs = value;
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
