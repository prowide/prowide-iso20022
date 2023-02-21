
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
 * Amount and trigger information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountAndTrigger1", propOrder = {
    "id",
    "amtDtlsChc",
    "trggr"
})
public class AmountAndTrigger1 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "AmtDtlsChc", required = true)
    protected AmountOrPercentage1Choice amtDtlsChc;
    @XmlElement(name = "Trggr", required = true)
    protected List<Trigger1> trggr;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AmountAndTrigger1 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the amtDtlsChc property.
     * 
     * @return
     *     possible object is
     *     {@link AmountOrPercentage1Choice }
     *     
     */
    public AmountOrPercentage1Choice getAmtDtlsChc() {
        return amtDtlsChc;
    }

    /**
     * Sets the value of the amtDtlsChc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountOrPercentage1Choice }
     *     
     */
    public AmountAndTrigger1 setAmtDtlsChc(AmountOrPercentage1Choice value) {
        this.amtDtlsChc = value;
        return this;
    }

    /**
     * Gets the value of the trggr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trggr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrggr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Trigger1 }
     * 
     * 
     */
    public List<Trigger1> getTrggr() {
        if (trggr == null) {
            trggr = new ArrayList<Trigger1>();
        }
        return this.trggr;
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
     * Adds a new item to the trggr list.
     * @see #getTrggr()
     * 
     */
    public AmountAndTrigger1 addTrggr(Trigger1 trggr) {
        getTrggr().add(trggr);
        return this;
    }

}
