
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
 * Specifies the old and new values for an implied or an active currency and amount.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateLogAmount1Choice", propOrder = {
    "amtWthtCcy",
    "amtWthCcy"
})
public class UpdateLogAmount1Choice {

    @XmlElement(name = "AmtWthtCcy")
    protected UpdateLogImpliedAmount1 amtWthtCcy;
    @XmlElement(name = "AmtWthCcy")
    protected UpdateLogActiveAmount1 amtWthCcy;

    /**
     * Gets the value of the amtWthtCcy property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateLogImpliedAmount1 }
     *     
     */
    public UpdateLogImpliedAmount1 getAmtWthtCcy() {
        return amtWthtCcy;
    }

    /**
     * Sets the value of the amtWthtCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateLogImpliedAmount1 }
     *     
     */
    public UpdateLogAmount1Choice setAmtWthtCcy(UpdateLogImpliedAmount1 value) {
        this.amtWthtCcy = value;
        return this;
    }

    /**
     * Gets the value of the amtWthCcy property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateLogActiveAmount1 }
     *     
     */
    public UpdateLogActiveAmount1 getAmtWthCcy() {
        return amtWthCcy;
    }

    /**
     * Sets the value of the amtWthCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateLogActiveAmount1 }
     *     
     */
    public UpdateLogAmount1Choice setAmtWthCcy(UpdateLogActiveAmount1 value) {
        this.amtWthCcy = value;
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
