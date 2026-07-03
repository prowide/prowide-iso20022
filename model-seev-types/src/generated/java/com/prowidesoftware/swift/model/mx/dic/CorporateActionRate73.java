
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "CorporateActionRate73", propOrder = {
    "propsdRate",
    "ovrsbcptRate",
    "reqdWhldgTaxRate",
    "reqdScndLvlTaxRate"
})
public class CorporateActionRate73 {

    @XmlElement(name = "PropsdRate")
    protected BigDecimal propsdRate;
    @XmlElement(name = "OvrsbcptRate")
    protected RateAndAmountFormat43Choice ovrsbcptRate;
    @XmlElement(name = "ReqdWhldgTaxRate")
    protected List<RateAndAmountFormat45Choice> reqdWhldgTaxRate;
    @XmlElement(name = "ReqdScndLvlTaxRate")
    protected List<RateAndAmountFormat45Choice> reqdScndLvlTaxRate;

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
    public CorporateActionRate73 setPropsdRate(BigDecimal value) {
        this.propsdRate = value;
        return this;
    }

    /**
     * Gets the value of the ovrsbcptRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat43Choice }
     *     
     */
    public RateAndAmountFormat43Choice getOvrsbcptRate() {
        return ovrsbcptRate;
    }

    /**
     * Sets the value of the ovrsbcptRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat43Choice }
     *     
     */
    public CorporateActionRate73 setOvrsbcptRate(RateAndAmountFormat43Choice value) {
        this.ovrsbcptRate = value;
        return this;
    }

    /**
     * Gets the value of the reqdWhldgTaxRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reqdWhldgTaxRate property.
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
     * {@link RateAndAmountFormat45Choice }
     * 
     * 
     */
    public List<RateAndAmountFormat45Choice> getReqdWhldgTaxRate() {
        if (reqdWhldgTaxRate == null) {
            reqdWhldgTaxRate = new ArrayList<RateAndAmountFormat45Choice>();
        }
        return this.reqdWhldgTaxRate;
    }

    /**
     * Gets the value of the reqdScndLvlTaxRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reqdScndLvlTaxRate property.
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
     * {@link RateAndAmountFormat45Choice }
     * 
     * 
     */
    public List<RateAndAmountFormat45Choice> getReqdScndLvlTaxRate() {
        if (reqdScndLvlTaxRate == null) {
            reqdScndLvlTaxRate = new ArrayList<RateAndAmountFormat45Choice>();
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
    public CorporateActionRate73 addReqdWhldgTaxRate(RateAndAmountFormat45Choice reqdWhldgTaxRate) {
        getReqdWhldgTaxRate().add(reqdWhldgTaxRate);
        return this;
    }

    /**
     * Adds a new item to the reqdScndLvlTaxRate list.
     * @see #getReqdScndLvlTaxRate()
     * 
     */
    public CorporateActionRate73 addReqdScndLvlTaxRate(RateAndAmountFormat45Choice reqdScndLvlTaxRate) {
        getReqdScndLvlTaxRate().add(reqdScndLvlTaxRate);
        return this;
    }

}
