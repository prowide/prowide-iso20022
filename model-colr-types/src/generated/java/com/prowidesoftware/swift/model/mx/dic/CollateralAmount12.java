
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
 * Deal amount details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralAmount12", propOrder = {
    "tx",
    "termntn",
    "acrd",
    "cmpndSmplAcrlClctn",
    "pmtFrqcy",
    "intrstPmtDely",
    "valSght"
})
public class CollateralAmount12 {

    @XmlElement(name = "Tx")
    protected AmountAndDirection49 tx;
    @XmlElement(name = "Termntn")
    protected AmountAndDirection49 termntn;
    @XmlElement(name = "Acrd")
    protected AmountAndDirection49 acrd;
    @XmlElement(name = "CmpndSmplAcrlClctn")
    @XmlSchemaType(name = "string")
    protected CalculationMethod1Code cmpndSmplAcrlClctn;
    @XmlElement(name = "PmtFrqcy")
    protected Frequency38Choice pmtFrqcy;
    @XmlElement(name = "IntrstPmtDely")
    protected String intrstPmtDely;
    @XmlElement(name = "ValSght")
    protected AmountAndDirection49 valSght;

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
    public CollateralAmount12 setTx(AmountAndDirection49 value) {
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
    public CollateralAmount12 setTermntn(AmountAndDirection49 value) {
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
    public CollateralAmount12 setAcrd(AmountAndDirection49 value) {
        this.acrd = value;
        return this;
    }

    /**
     * Gets the value of the cmpndSmplAcrlClctn property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationMethod1Code }
     *     
     */
    public CalculationMethod1Code getCmpndSmplAcrlClctn() {
        return cmpndSmplAcrlClctn;
    }

    /**
     * Sets the value of the cmpndSmplAcrlClctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationMethod1Code }
     *     
     */
    public CollateralAmount12 setCmpndSmplAcrlClctn(CalculationMethod1Code value) {
        this.cmpndSmplAcrlClctn = value;
        return this;
    }

    /**
     * Gets the value of the pmtFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency38Choice }
     *     
     */
    public Frequency38Choice getPmtFrqcy() {
        return pmtFrqcy;
    }

    /**
     * Sets the value of the pmtFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency38Choice }
     *     
     */
    public CollateralAmount12 setPmtFrqcy(Frequency38Choice value) {
        this.pmtFrqcy = value;
        return this;
    }

    /**
     * Gets the value of the intrstPmtDely property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntrstPmtDely() {
        return intrstPmtDely;
    }

    /**
     * Sets the value of the intrstPmtDely property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CollateralAmount12 setIntrstPmtDely(String value) {
        this.intrstPmtDely = value;
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
    public CollateralAmount12 setValSght(AmountAndDirection49 value) {
        this.valSght = value;
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
