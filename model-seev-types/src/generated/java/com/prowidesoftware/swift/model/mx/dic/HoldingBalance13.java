
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Net position of a segregated holding of a single security within the overall position held in the securities account, for example, sub-balance per status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HoldingBalance13", propOrder = {
    "bal",
    "balTp"
})
public class HoldingBalance13 {

    @XmlElement(name = "Bal", required = true)
    protected SignedQuantityFormat14 bal;
    @XmlElement(name = "BalTp", required = true)
    @XmlSchemaType(name = "string")
    protected SecuritiesEntryType3Code balTp;

    /**
     * Gets the value of the bal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat14 }
     *     
     */
    public SignedQuantityFormat14 getBal() {
        return bal;
    }

    /**
     * Sets the value of the bal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat14 }
     *     
     */
    public HoldingBalance13 setBal(SignedQuantityFormat14 value) {
        this.bal = value;
        return this;
    }

    /**
     * Gets the value of the balTp property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesEntryType3Code }
     *     
     */
    public SecuritiesEntryType3Code getBalTp() {
        return balTp;
    }

    /**
     * Sets the value of the balTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesEntryType3Code }
     *     
     */
    public HoldingBalance13 setBalTp(SecuritiesEntryType3Code value) {
        this.balTp = value;
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
