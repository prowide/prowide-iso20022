
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
 * Period before or at the end of which the loan should be repaid or renegotiated for another term. 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractTerm6Choice", propOrder = {
    "opn",
    "fxd"
})
public class ContractTerm6Choice {

    @XmlElement(name = "Opn")
    protected Boolean opn;
    @XmlElement(name = "Fxd")
    protected TimeToMaturity2Choice fxd;

    /**
     * Gets the value of the opn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOpn() {
        return opn;
    }

    /**
     * Sets the value of the opn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ContractTerm6Choice setOpn(Boolean value) {
        this.opn = value;
        return this;
    }

    /**
     * Gets the value of the fxd property.
     * 
     * @return
     *     possible object is
     *     {@link TimeToMaturity2Choice }
     *     
     */
    public TimeToMaturity2Choice getFxd() {
        return fxd;
    }

    /**
     * Sets the value of the fxd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeToMaturity2Choice }
     *     
     */
    public ContractTerm6Choice setFxd(TimeToMaturity2Choice value) {
        this.fxd = value;
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
