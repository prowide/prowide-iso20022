
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
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
 * ATM cassette counter per unit value or globally.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMCassetteCounters3", propOrder = {
    "unitVal",
    "ccy",
    "mdiaCtgy",
    "curNb",
    "curAmt",
    "flowTtls"
})
public class ATMCassetteCounters3 {

    @XmlElement(name = "UnitVal")
    protected BigDecimal unitVal;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "MdiaCtgy")
    @XmlSchemaType(name = "string")
    protected ATMMediaType3Code mdiaCtgy;
    @XmlElement(name = "CurNb", required = true)
    protected BigDecimal curNb;
    @XmlElement(name = "CurAmt")
    protected BigDecimal curAmt;
    @XmlElement(name = "FlowTtls")
    protected List<ATMCassetteCounters4> flowTtls;

    /**
     * Gets the value of the unitVal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitVal() {
        return unitVal;
    }

    /**
     * Sets the value of the unitVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMCassetteCounters3 setUnitVal(BigDecimal value) {
        this.unitVal = value;
        return this;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMCassetteCounters3 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the mdiaCtgy property.
     * 
     * @return
     *     possible object is
     *     {@link ATMMediaType3Code }
     *     
     */
    public ATMMediaType3Code getMdiaCtgy() {
        return mdiaCtgy;
    }

    /**
     * Sets the value of the mdiaCtgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMMediaType3Code }
     *     
     */
    public ATMCassetteCounters3 setMdiaCtgy(ATMMediaType3Code value) {
        this.mdiaCtgy = value;
        return this;
    }

    /**
     * Gets the value of the curNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurNb() {
        return curNb;
    }

    /**
     * Sets the value of the curNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMCassetteCounters3 setCurNb(BigDecimal value) {
        this.curNb = value;
        return this;
    }

    /**
     * Gets the value of the curAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurAmt() {
        return curAmt;
    }

    /**
     * Sets the value of the curAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMCassetteCounters3 setCurAmt(BigDecimal value) {
        this.curAmt = value;
        return this;
    }

    /**
     * Gets the value of the flowTtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the flowTtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlowTtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMCassetteCounters4 }
     * 
     * 
     * @return
     *     The value of the flowTtls property.
     */
    public List<ATMCassetteCounters4> getFlowTtls() {
        if (flowTtls == null) {
            flowTtls = new ArrayList<>();
        }
        return this.flowTtls;
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

    /**
     * Adds a new item to the flowTtls list.
     * @see #getFlowTtls()
     * 
     */
    public ATMCassetteCounters3 addFlowTtls(ATMCassetteCounters4 flowTtls) {
        getFlowTtls().add(flowTtls);
        return this;
    }

}
