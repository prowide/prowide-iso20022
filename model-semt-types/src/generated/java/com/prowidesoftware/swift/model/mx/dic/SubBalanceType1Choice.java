
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
 * Choice of SubBalance type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubBalanceType1Choice", propOrder = {
    "subBalTp",
    "prtry"
})
public class SubBalanceType1Choice {

    @XmlElement(name = "SubBalTp")
    @XmlSchemaType(name = "string")
    protected SecuritiesBalanceType4Code subBalTp;
    @XmlElement(name = "Prtry")
    protected GenericIdentification13 prtry;

    /**
     * Gets the value of the subBalTp property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesBalanceType4Code }
     *     
     */
    public SecuritiesBalanceType4Code getSubBalTp() {
        return subBalTp;
    }

    /**
     * Sets the value of the subBalTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesBalanceType4Code }
     *     
     */
    public SubBalanceType1Choice setSubBalTp(SecuritiesBalanceType4Code value) {
        this.subBalTp = value;
        return this;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification13 }
     *     
     */
    public GenericIdentification13 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification13 }
     *     
     */
    public SubBalanceType1Choice setPrtry(GenericIdentification13 value) {
        this.prtry = value;
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
