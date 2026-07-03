
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
 * The TerminalManagementRejection message is sent by the terminal manager to reject a message request sent by an acceptor, to indicate that the received message could not be processed.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminalManagementRejectionV04", propOrder = {
    "hdr",
    "rjct"
})
public class TerminalManagementRejectionV04 {

    @XmlElement(name = "Hdr", required = true)
    protected Header28 hdr;
    @XmlElement(name = "Rjct", required = true)
    protected AcceptorRejection3 rjct;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header28 }
     *     
     */
    public Header28 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header28 }
     *     
     */
    public TerminalManagementRejectionV04 setHdr(Header28 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the rjct property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorRejection3 }
     *     
     */
    public AcceptorRejection3 getRjct() {
        return rjct;
    }

    /**
     * Sets the value of the rjct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorRejection3 }
     *     
     */
    public TerminalManagementRejectionV04 setRjct(AcceptorRejection3 value) {
        this.rjct = value;
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
