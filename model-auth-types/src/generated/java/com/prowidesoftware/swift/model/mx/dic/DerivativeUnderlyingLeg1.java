
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
 * Specifies the obligations of one of the participants to a derivative contract. The obligations may be conceptual or operational only, with settlement of any obligations arising from the derivative contract taking place on a net basis, after the netting of the obligations arising from each leg of the contract.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivativeUnderlyingLeg1", propOrder = {
    "ctrctAttrbts",
    "dfndAttrbts"
})
public class DerivativeUnderlyingLeg1 {

    @XmlElement(name = "CtrctAttrbts", required = true)
    protected FinancialInstrumentAttributes88 ctrctAttrbts;
    @XmlElement(name = "DfndAttrbts")
    protected DefinedAttributes1Choice dfndAttrbts;

    /**
     * Gets the value of the ctrctAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributes88 }
     *     
     */
    public FinancialInstrumentAttributes88 getCtrctAttrbts() {
        return ctrctAttrbts;
    }

    /**
     * Sets the value of the ctrctAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributes88 }
     *     
     */
    public DerivativeUnderlyingLeg1 setCtrctAttrbts(FinancialInstrumentAttributes88 value) {
        this.ctrctAttrbts = value;
        return this;
    }

    /**
     * Gets the value of the dfndAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link DefinedAttributes1Choice }
     *     
     */
    public DefinedAttributes1Choice getDfndAttrbts() {
        return dfndAttrbts;
    }

    /**
     * Sets the value of the dfndAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefinedAttributes1Choice }
     *     
     */
    public DerivativeUnderlyingLeg1 setDfndAttrbts(DefinedAttributes1Choice value) {
        this.dfndAttrbts = value;
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
