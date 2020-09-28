
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
 * Provides the status adivce of the excess cash standing instruction or the margin settlement request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExcessCashInstructionStatus1Choice", propOrder = {
    "accptd",
    "rjctd"
})
public class ExcessCashInstructionStatus1Choice {

    @XmlElement(name = "Accptd")
    protected ExcessCashAcceptedStatus1Choice accptd;
    @XmlElement(name = "Rjctd")
    protected ExcessCassRejectionStatus1Choice rjctd;

    /**
     * Gets the value of the accptd property.
     * 
     * @return
     *     possible object is
     *     {@link ExcessCashAcceptedStatus1Choice }
     *     
     */
    public ExcessCashAcceptedStatus1Choice getAccptd() {
        return accptd;
    }

    /**
     * Sets the value of the accptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcessCashAcceptedStatus1Choice }
     *     
     */
    public ExcessCashInstructionStatus1Choice setAccptd(ExcessCashAcceptedStatus1Choice value) {
        this.accptd = value;
        return this;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link ExcessCassRejectionStatus1Choice }
     *     
     */
    public ExcessCassRejectionStatus1Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcessCassRejectionStatus1Choice }
     *     
     */
    public ExcessCashInstructionStatus1Choice setRjctd(ExcessCassRejectionStatus1Choice value) {
        this.rjctd = value;
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
