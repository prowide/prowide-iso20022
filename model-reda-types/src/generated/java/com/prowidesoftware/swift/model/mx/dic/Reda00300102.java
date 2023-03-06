
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Scope
 * The PriceReportCorrection message is sent by a report provider, eg, a fund accountant, transfer agent, market data provider, or any other interested party, to a report user, eg, a fund management company, a transfer agent, market data provider, regulator or any other interested party.
 * The message is used to correct at least one of the prices, of a financial instrument, that was quoted in a previously sent PriceReport message.
 * Usage
 * The PriceReportCorrection message is used to correct information in a PriceReport message that was previously sent by the fund accountant. If an entire PriceReport message must be corrected, eg, due to an incorrect trade date, it is recommended that a PriceReportCancellation message is used to cancel the entire PriceReport message and a new PriceReport message is sent.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reda.003.001.02", propOrder = {
    "poolRef",
    "prvsRef",
    "pricCrrctnDtls"
})
public class Reda00300102 {

    @XmlElement(name = "PoolRef")
    protected AdditionalReference3 poolRef;
    @XmlElement(name = "PrvsRef", required = true)
    protected AdditionalReference3 prvsRef;
    @XmlElement(name = "PricCrrctnDtls", required = true)
    protected List<PriceCorrection2> pricCrrctnDtls;

    /**
     * Gets the value of the poolRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference3 }
     *     
     */
    public AdditionalReference3 getPoolRef() {
        return poolRef;
    }

    /**
     * Sets the value of the poolRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference3 }
     *     
     */
    public Reda00300102 setPoolRef(AdditionalReference3 value) {
        this.poolRef = value;
        return this;
    }

    /**
     * Gets the value of the prvsRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference3 }
     *     
     */
    public AdditionalReference3 getPrvsRef() {
        return prvsRef;
    }

    /**
     * Sets the value of the prvsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference3 }
     *     
     */
    public Reda00300102 setPrvsRef(AdditionalReference3 value) {
        this.prvsRef = value;
        return this;
    }

    /**
     * Gets the value of the pricCrrctnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricCrrctnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricCrrctnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceCorrection2 }
     * 
     * 
     */
    public List<PriceCorrection2> getPricCrrctnDtls() {
        if (pricCrrctnDtls == null) {
            pricCrrctnDtls = new ArrayList<PriceCorrection2>();
        }
        return this.pricCrrctnDtls;
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
     * Adds a new item to the pricCrrctnDtls list.
     * @see #getPricCrrctnDtls()
     * 
     */
    public Reda00300102 addPricCrrctnDtls(PriceCorrection2 pricCrrctnDtls) {
        getPricCrrctnDtls().add(pricCrrctnDtls);
        return this;
    }

}
