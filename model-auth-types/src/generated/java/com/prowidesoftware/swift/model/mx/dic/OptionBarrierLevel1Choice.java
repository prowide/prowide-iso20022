
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice of barrier levels for an option.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionBarrierLevel1Choice", propOrder = {
    "sngl",
    "mltpl"
})
public class OptionBarrierLevel1Choice {

    @XmlElement(name = "Sngl")
    protected SecuritiesTransactionPrice23Choice sngl;
    @XmlElement(name = "Mltpl")
    protected OptionMultipleBarrierLevels1 mltpl;

    /**
     * Gets the value of the sngl property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice23Choice }
     *     
     */
    public SecuritiesTransactionPrice23Choice getSngl() {
        return sngl;
    }

    /**
     * Sets the value of the sngl property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice23Choice }
     *     
     */
    public OptionBarrierLevel1Choice setSngl(SecuritiesTransactionPrice23Choice value) {
        this.sngl = value;
        return this;
    }

    /**
     * Gets the value of the mltpl property.
     * 
     * @return
     *     possible object is
     *     {@link OptionMultipleBarrierLevels1 }
     *     
     */
    public OptionMultipleBarrierLevels1 getMltpl() {
        return mltpl;
    }

    /**
     * Sets the value of the mltpl property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionMultipleBarrierLevels1 }
     *     
     */
    public OptionBarrierLevel1Choice setMltpl(OptionMultipleBarrierLevels1 value) {
        this.mltpl = value;
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
