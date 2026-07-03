
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
 * Choice between tax calculation methods A, B or D.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingMethod1Choice", propOrder = {
    "mtdA",
    "mtdB",
    "mtdD"
})
public class BillingMethod1Choice {

    @XmlElement(name = "MtdA")
    protected BillingMethod1 mtdA;
    @XmlElement(name = "MtdB")
    protected BillingMethod2 mtdB;
    @XmlElement(name = "MtdD")
    protected BillingMethod3 mtdD;

    /**
     * Gets the value of the mtdA property.
     * 
     * @return
     *     possible object is
     *     {@link BillingMethod1 }
     *     
     */
    public BillingMethod1 getMtdA() {
        return mtdA;
    }

    /**
     * Sets the value of the mtdA property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingMethod1 }
     *     
     */
    public BillingMethod1Choice setMtdA(BillingMethod1 value) {
        this.mtdA = value;
        return this;
    }

    /**
     * Gets the value of the mtdB property.
     * 
     * @return
     *     possible object is
     *     {@link BillingMethod2 }
     *     
     */
    public BillingMethod2 getMtdB() {
        return mtdB;
    }

    /**
     * Sets the value of the mtdB property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingMethod2 }
     *     
     */
    public BillingMethod1Choice setMtdB(BillingMethod2 value) {
        this.mtdB = value;
        return this;
    }

    /**
     * Gets the value of the mtdD property.
     * 
     * @return
     *     possible object is
     *     {@link BillingMethod3 }
     *     
     */
    public BillingMethod3 getMtdD() {
        return mtdD;
    }

    /**
     * Sets the value of the mtdD property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingMethod3 }
     *     
     */
    public BillingMethod1Choice setMtdD(BillingMethod3 value) {
        this.mtdD = value;
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
