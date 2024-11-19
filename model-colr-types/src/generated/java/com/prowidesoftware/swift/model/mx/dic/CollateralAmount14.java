
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
 * Deal amount details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralAmount14", propOrder = {
    "tx",
    "termntn",
    "acrd",
    "valSght",
    "udsptdTx"
})
public class CollateralAmount14 {

    @XmlElement(name = "Tx")
    protected AmountAndDirection49 tx;
    @XmlElement(name = "Termntn")
    protected AmountAndDirection49 termntn;
    @XmlElement(name = "Acrd")
    protected AmountAndDirection49 acrd;
    @XmlElement(name = "ValSght")
    protected AmountAndDirection49 valSght;
    @XmlElement(name = "UdsptdTx")
    protected AmountAndDirection49 udsptdTx;

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection49 }
     *     
     */
    public AmountAndDirection49 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection49 }
     *     
     */
    public CollateralAmount14 setTx(AmountAndDirection49 value) {
        this.tx = value;
        return this;
    }

    /**
     * Gets the value of the termntn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection49 }
     *     
     */
    public AmountAndDirection49 getTermntn() {
        return termntn;
    }

    /**
     * Sets the value of the termntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection49 }
     *     
     */
    public CollateralAmount14 setTermntn(AmountAndDirection49 value) {
        this.termntn = value;
        return this;
    }

    /**
     * Gets the value of the acrd property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection49 }
     *     
     */
    public AmountAndDirection49 getAcrd() {
        return acrd;
    }

    /**
     * Sets the value of the acrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection49 }
     *     
     */
    public CollateralAmount14 setAcrd(AmountAndDirection49 value) {
        this.acrd = value;
        return this;
    }

    /**
     * Gets the value of the valSght property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection49 }
     *     
     */
    public AmountAndDirection49 getValSght() {
        return valSght;
    }

    /**
     * Sets the value of the valSght property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection49 }
     *     
     */
    public CollateralAmount14 setValSght(AmountAndDirection49 value) {
        this.valSght = value;
        return this;
    }

    /**
     * Gets the value of the udsptdTx property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection49 }
     *     
     */
    public AmountAndDirection49 getUdsptdTx() {
        return udsptdTx;
    }

    /**
     * Sets the value of the udsptdTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection49 }
     *     
     */
    public CollateralAmount14 setUdsptdTx(AmountAndDirection49 value) {
        this.udsptdTx = value;
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
