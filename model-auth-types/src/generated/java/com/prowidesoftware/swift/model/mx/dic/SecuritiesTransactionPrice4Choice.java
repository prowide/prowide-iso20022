
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
 * Choice element capturing strike price related descriptive information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTransactionPrice4Choice", propOrder = {
    "pric",
    "noPric"
})
public class SecuritiesTransactionPrice4Choice {

    @XmlElement(name = "Pric")
    protected SecuritiesTransactionPrice2Choice pric;
    @XmlElement(name = "NoPric")
    protected SecuritiesTransactionPrice1 noPric;

    /**
     * Gets the value of the pric property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice2Choice }
     *     
     */
    public SecuritiesTransactionPrice2Choice getPric() {
        return pric;
    }

    /**
     * Sets the value of the pric property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice2Choice }
     *     
     */
    public SecuritiesTransactionPrice4Choice setPric(SecuritiesTransactionPrice2Choice value) {
        this.pric = value;
        return this;
    }

    /**
     * Gets the value of the noPric property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice1 }
     *     
     */
    public SecuritiesTransactionPrice1 getNoPric() {
        return noPric;
    }

    /**
     * Sets the value of the noPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice1 }
     *     
     */
    public SecuritiesTransactionPrice4Choice setNoPric(SecuritiesTransactionPrice1 value) {
        this.noPric = value;
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
