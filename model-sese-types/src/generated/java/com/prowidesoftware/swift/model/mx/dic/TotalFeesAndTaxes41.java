
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
 * Amount of money associated with a service.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalFeesAndTaxes41", propOrder = {
    "ttlOvrhdApld",
    "ttlFees",
    "ttlTaxs",
    "comrclAgrmtRef",
    "indvFee",
    "indvTax"
})
public class TotalFeesAndTaxes41 {

    @XmlElement(name = "TtlOvrhdApld")
    protected ActiveCurrencyAndAmount ttlOvrhdApld;
    @XmlElement(name = "TtlFees")
    protected ActiveCurrencyAndAmount ttlFees;
    @XmlElement(name = "TtlTaxs")
    protected ActiveCurrencyAndAmount ttlTaxs;
    @XmlElement(name = "ComrclAgrmtRef")
    protected String comrclAgrmtRef;
    @XmlElement(name = "IndvFee")
    protected List<Fee5> indvFee;
    @XmlElement(name = "IndvTax")
    protected List<Tax35> indvTax;

    /**
     * Gets the value of the ttlOvrhdApld property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlOvrhdApld() {
        return ttlOvrhdApld;
    }

    /**
     * Sets the value of the ttlOvrhdApld property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TotalFeesAndTaxes41 setTtlOvrhdApld(ActiveCurrencyAndAmount value) {
        this.ttlOvrhdApld = value;
        return this;
    }

    /**
     * Gets the value of the ttlFees property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlFees() {
        return ttlFees;
    }

    /**
     * Sets the value of the ttlFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TotalFeesAndTaxes41 setTtlFees(ActiveCurrencyAndAmount value) {
        this.ttlFees = value;
        return this;
    }

    /**
     * Gets the value of the ttlTaxs property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlTaxs() {
        return ttlTaxs;
    }

    /**
     * Sets the value of the ttlTaxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TotalFeesAndTaxes41 setTtlTaxs(ActiveCurrencyAndAmount value) {
        this.ttlTaxs = value;
        return this;
    }

    /**
     * Gets the value of the comrclAgrmtRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComrclAgrmtRef() {
        return comrclAgrmtRef;
    }

    /**
     * Sets the value of the comrclAgrmtRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TotalFeesAndTaxes41 setComrclAgrmtRef(String value) {
        this.comrclAgrmtRef = value;
        return this;
    }

    /**
     * Gets the value of the indvFee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indvFee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndvFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Fee5 }
     * 
     * 
     */
    public List<Fee5> getIndvFee() {
        if (indvFee == null) {
            indvFee = new ArrayList<Fee5>();
        }
        return this.indvFee;
    }

    /**
     * Gets the value of the indvTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indvTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndvTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax35 }
     * 
     * 
     */
    public List<Tax35> getIndvTax() {
        if (indvTax == null) {
            indvTax = new ArrayList<Tax35>();
        }
        return this.indvTax;
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
     * Adds a new item to the indvFee list.
     * @see #getIndvFee()
     * 
     */
    public TotalFeesAndTaxes41 addIndvFee(Fee5 indvFee) {
        getIndvFee().add(indvFee);
        return this;
    }

    /**
     * Adds a new item to the indvTax list.
     * @see #getIndvTax()
     * 
     */
    public TotalFeesAndTaxes41 addIndvTax(Tax35 indvTax) {
        getIndvTax().add(indvTax);
        return this;
    }

}
