
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
 * Specifies the old and new values for the requested settlement time of the payment instruction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateLogSettlementTimeRequest1", propOrder = {
    "clsTm",
    "tillTm",
    "frTm",
    "rjctTm"
})
public class UpdateLogSettlementTimeRequest1 {

    @XmlElement(name = "CLSTm")
    protected UpdateLogTime1 clsTm;
    @XmlElement(name = "TillTm")
    protected UpdateLogTime1 tillTm;
    @XmlElement(name = "FrTm")
    protected UpdateLogTime1 frTm;
    @XmlElement(name = "RjctTm")
    protected UpdateLogTime1 rjctTm;

    /**
     * Gets the value of the clsTm property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateLogTime1 }
     *     
     */
    public UpdateLogTime1 getCLSTm() {
        return clsTm;
    }

    /**
     * Sets the value of the clsTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateLogTime1 }
     *     
     */
    public UpdateLogSettlementTimeRequest1 setCLSTm(UpdateLogTime1 value) {
        this.clsTm = value;
        return this;
    }

    /**
     * Gets the value of the tillTm property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateLogTime1 }
     *     
     */
    public UpdateLogTime1 getTillTm() {
        return tillTm;
    }

    /**
     * Sets the value of the tillTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateLogTime1 }
     *     
     */
    public UpdateLogSettlementTimeRequest1 setTillTm(UpdateLogTime1 value) {
        this.tillTm = value;
        return this;
    }

    /**
     * Gets the value of the frTm property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateLogTime1 }
     *     
     */
    public UpdateLogTime1 getFrTm() {
        return frTm;
    }

    /**
     * Sets the value of the frTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateLogTime1 }
     *     
     */
    public UpdateLogSettlementTimeRequest1 setFrTm(UpdateLogTime1 value) {
        this.frTm = value;
        return this;
    }

    /**
     * Gets the value of the rjctTm property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateLogTime1 }
     *     
     */
    public UpdateLogTime1 getRjctTm() {
        return rjctTm;
    }

    /**
     * Sets the value of the rjctTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateLogTime1 }
     *     
     */
    public UpdateLogSettlementTimeRequest1 setRjctTm(UpdateLogTime1 value) {
        this.rjctTm = value;
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
