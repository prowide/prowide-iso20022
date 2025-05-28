
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
 * Identification of the financial instrument(s) to which the order refers to.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrument99Choice", propOrder = {
    "id",
    "strtgyInstrms"
})
public class FinancialInstrument99Choice {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "StrtgyInstrms")
    protected List<String> strtgyInstrms;

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
    public FinancialInstrument99Choice setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the strtgyInstrms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the strtgyInstrms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStrtgyInstrms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the strtgyInstrms property.
     */
    public List<String> getStrtgyInstrms() {
        if (strtgyInstrms == null) {
            strtgyInstrms = new ArrayList<>();
        }
        return this.strtgyInstrms;
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
     * Adds a new item to the strtgyInstrms list.
     * @see #getStrtgyInstrms()
     * 
     */
    public FinancialInstrument99Choice addStrtgyInstrms(String strtgyInstrms) {
        getStrtgyInstrms().add(strtgyInstrms);
        return this;
    }

}
