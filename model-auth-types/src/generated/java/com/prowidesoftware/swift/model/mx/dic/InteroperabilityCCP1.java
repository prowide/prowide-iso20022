
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
 * Identifies the interoperability CCP.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InteroperabilityCCP1", propOrder = {
    "id",
    "ttlInitlMrgn",
    "trdsClrd",
    "grssNtnlAmt",
    "asstHldg"
})
public class InteroperabilityCCP1 {

    @XmlElement(name = "Id", required = true)
    protected GenericIdentification168 id;
    @XmlElement(name = "TtlInitlMrgn", required = true)
    protected List<ActiveCurrencyAndAmount> ttlInitlMrgn;
    @XmlElement(name = "TrdsClrd")
    protected BigDecimal trdsClrd;
    @XmlElement(name = "GrssNtnlAmt", required = true)
    protected List<ActiveCurrencyAnd24Amount> grssNtnlAmt;
    @XmlElement(name = "AsstHldg", required = true)
    protected List<AssetHolding3> asstHldg;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification168 }
     *     
     */
    public GenericIdentification168 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification168 }
     *     
     */
    public InteroperabilityCCP1 setId(GenericIdentification168 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the ttlInitlMrgn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ttlInitlMrgn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTtlInitlMrgn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActiveCurrencyAndAmount }
     * 
     * 
     * @return
     *     The value of the ttlInitlMrgn property.
     */
    public List<ActiveCurrencyAndAmount> getTtlInitlMrgn() {
        if (ttlInitlMrgn == null) {
            ttlInitlMrgn = new ArrayList<>();
        }
        return this.ttlInitlMrgn;
    }

    /**
     * Gets the value of the trdsClrd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTrdsClrd() {
        return trdsClrd;
    }

    /**
     * Sets the value of the trdsClrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InteroperabilityCCP1 setTrdsClrd(BigDecimal value) {
        this.trdsClrd = value;
        return this;
    }

    /**
     * Gets the value of the grssNtnlAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the grssNtnlAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrssNtnlAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActiveCurrencyAnd24Amount }
     * 
     * 
     * @return
     *     The value of the grssNtnlAmt property.
     */
    public List<ActiveCurrencyAnd24Amount> getGrssNtnlAmt() {
        if (grssNtnlAmt == null) {
            grssNtnlAmt = new ArrayList<>();
        }
        return this.grssNtnlAmt;
    }

    /**
     * Gets the value of the asstHldg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the asstHldg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAsstHldg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetHolding3 }
     * 
     * 
     * @return
     *     The value of the asstHldg property.
     */
    public List<AssetHolding3> getAsstHldg() {
        if (asstHldg == null) {
            asstHldg = new ArrayList<>();
        }
        return this.asstHldg;
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
     * Adds a new item to the ttlInitlMrgn list.
     * @see #getTtlInitlMrgn()
     * 
     */
    public InteroperabilityCCP1 addTtlInitlMrgn(ActiveCurrencyAndAmount ttlInitlMrgn) {
        getTtlInitlMrgn().add(ttlInitlMrgn);
        return this;
    }

    /**
     * Adds a new item to the grssNtnlAmt list.
     * @see #getGrssNtnlAmt()
     * 
     */
    public InteroperabilityCCP1 addGrssNtnlAmt(ActiveCurrencyAnd24Amount grssNtnlAmt) {
        getGrssNtnlAmt().add(grssNtnlAmt);
        return this;
    }

    /**
     * Adds a new item to the asstHldg list.
     * @see #getAsstHldg()
     * 
     */
    public InteroperabilityCCP1 addAsstHldg(AssetHolding3 asstHldg) {
        getAsstHldg().add(asstHldg);
        return this;
    }

}
