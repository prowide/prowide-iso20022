
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
 * Report between the party reference data or a business error.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyOrBusinessError4Choice", propOrder = {
    "sysPty",
    "bizErr"
})
public class PartyOrBusinessError4Choice {

    @XmlElement(name = "SysPty")
    protected SystemParty6 sysPty;
    @XmlElement(name = "BizErr")
    protected List<ErrorHandling4> bizErr;

    /**
     * Gets the value of the sysPty property.
     * 
     * @return
     *     possible object is
     *     {@link SystemParty6 }
     *     
     */
    public SystemParty6 getSysPty() {
        return sysPty;
    }

    /**
     * Sets the value of the sysPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemParty6 }
     *     
     */
    public PartyOrBusinessError4Choice setSysPty(SystemParty6 value) {
        this.sysPty = value;
        return this;
    }

    /**
     * Gets the value of the bizErr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bizErr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBizErr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorHandling4 }
     * 
     * 
     * @return
     *     The value of the bizErr property.
     */
    public List<ErrorHandling4> getBizErr() {
        if (bizErr == null) {
            bizErr = new ArrayList<>();
        }
        return this.bizErr;
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
     * Adds a new item to the bizErr list.
     * @see #getBizErr()
     * 
     */
    public PartyOrBusinessError4Choice addBizErr(ErrorHandling4 bizErr) {
        getBizErr().add(bizErr);
        return this;
    }

}
