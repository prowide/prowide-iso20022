
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Specifies rates related to a corporate action option.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionRate130", propOrder = {
    "propsdRate",
    "ovrsbcptRate",
    "reqdWhldgTaxRate",
    "reqdScndLvlTaxRate"
})
public class CorporateActionRate130 {

    @XmlElement(name = "PropsdRate")
    protected BigDecimal propsdRate;
    @XmlElement(name = "OvrsbcptRate")
    protected RateAndAmountFormat64Choice ovrsbcptRate;
    @XmlElement(name = "ReqdWhldgTaxRate")
    protected List<RateAndAmountFormat65Choice> reqdWhldgTaxRate;
    @XmlElement(name = "ReqdScndLvlTaxRate")
    protected List<RateAndAmountFormat65Choice> reqdScndLvlTaxRate;

    /**
     * Gets the value of the propsdRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPropsdRate() {
        return propsdRate;
    }

    /**
     * Sets the value of the propsdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CorporateActionRate130 setPropsdRate(BigDecimal value) {
        this.propsdRate = value;
        return this;
    }

    /**
     * Gets the value of the ovrsbcptRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat64Choice }
     *     
     */
    public RateAndAmountFormat64Choice getOvrsbcptRate() {
        return ovrsbcptRate;
    }

    /**
     * Sets the value of the ovrsbcptRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat64Choice }
     *     
     */
    public CorporateActionRate130 setOvrsbcptRate(RateAndAmountFormat64Choice value) {
        this.ovrsbcptRate = value;
        return this;
    }

    /**
     * Gets the value of the reqdWhldgTaxRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the reqdWhldgTaxRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReqdWhldgTaxRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateAndAmountFormat65Choice }
     * 
     * 
     * @return
     *     The value of the reqdWhldgTaxRate property.
     */
    public List<RateAndAmountFormat65Choice> getReqdWhldgTaxRate() {
        if (reqdWhldgTaxRate == null) {
            reqdWhldgTaxRate = new ArrayList<>();
        }
        return this.reqdWhldgTaxRate;
    }

    /**
     * Gets the value of the reqdScndLvlTaxRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the reqdScndLvlTaxRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReqdScndLvlTaxRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateAndAmountFormat65Choice }
     * 
     * 
     * @return
     *     The value of the reqdScndLvlTaxRate property.
     */
    public List<RateAndAmountFormat65Choice> getReqdScndLvlTaxRate() {
        if (reqdScndLvlTaxRate == null) {
            reqdScndLvlTaxRate = new ArrayList<>();
        }
        return this.reqdScndLvlTaxRate;
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
     * Adds a new item to the reqdWhldgTaxRate list.
     * @see #getReqdWhldgTaxRate()
     * 
     */
    public CorporateActionRate130 addReqdWhldgTaxRate(RateAndAmountFormat65Choice reqdWhldgTaxRate) {
        getReqdWhldgTaxRate().add(reqdWhldgTaxRate);
        return this;
    }

    /**
     * Adds a new item to the reqdScndLvlTaxRate list.
     * @see #getReqdScndLvlTaxRate()
     * 
     */
    public CorporateActionRate130 addReqdScndLvlTaxRate(RateAndAmountFormat65Choice reqdScndLvlTaxRate) {
        getReqdScndLvlTaxRate().add(reqdScndLvlTaxRate);
        return this;
    }

}
