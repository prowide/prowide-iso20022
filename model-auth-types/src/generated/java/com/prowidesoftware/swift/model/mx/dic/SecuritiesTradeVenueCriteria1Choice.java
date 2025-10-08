
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Criteria for the trade venue identification.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTradeVenueCriteria1Choice", propOrder = {
    "mic",
    "anyMIC"
})
public class SecuritiesTradeVenueCriteria1Choice {

    @XmlElement(name = "MIC")
    protected List<String> mic;
    @XmlElement(name = "AnyMIC")
    @XmlSchemaType(name = "string")
    protected AnyMIC1Code anyMIC;

    /**
     * Gets the value of the mic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMIC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMIC() {
        if (mic == null) {
            mic = new ArrayList<String>();
        }
        return this.mic;
    }

    /**
     * Gets the value of the anyMIC property.
     * 
     * @return
     *     possible object is
     *     {@link AnyMIC1Code }
     *     
     */
    public AnyMIC1Code getAnyMIC() {
        return anyMIC;
    }

    /**
     * Sets the value of the anyMIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyMIC1Code }
     *     
     */
    public SecuritiesTradeVenueCriteria1Choice setAnyMIC(AnyMIC1Code value) {
        this.anyMIC = value;
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

    /**
     * Adds a new item to the mIC list.
     * @see #getMIC()
     * 
     */
    public SecuritiesTradeVenueCriteria1Choice addMIC(String mIC) {
        getMIC().add(mIC);
        return this;
    }

}
