
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
 * Specifies the type of advice to report back for the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdviceType1", propOrder = {
    "cdtAdvc",
    "dbtAdvc"
})
public class AdviceType1 {

    @XmlElement(name = "CdtAdvc")
    protected AdviceType1Choice cdtAdvc;
    @XmlElement(name = "DbtAdvc")
    protected AdviceType1Choice dbtAdvc;

    /**
     * Gets the value of the cdtAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link AdviceType1Choice }
     *     
     */
    public AdviceType1Choice getCdtAdvc() {
        return cdtAdvc;
    }

    /**
     * Sets the value of the cdtAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdviceType1Choice }
     *     
     */
    public AdviceType1 setCdtAdvc(AdviceType1Choice value) {
        this.cdtAdvc = value;
        return this;
    }

    /**
     * Gets the value of the dbtAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link AdviceType1Choice }
     *     
     */
    public AdviceType1Choice getDbtAdvc() {
        return dbtAdvc;
    }

    /**
     * Sets the value of the dbtAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdviceType1Choice }
     *     
     */
    public AdviceType1 setDbtAdvc(AdviceType1Choice value) {
        this.dbtAdvc = value;
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
