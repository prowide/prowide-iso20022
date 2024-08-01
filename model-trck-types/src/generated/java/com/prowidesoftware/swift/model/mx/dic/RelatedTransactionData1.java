
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
 * Provides information on individual transactions that the payment instruction has been split into.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedTransactionData1", propOrder = {
    "mstrUETR",
    "subUETR"
})
public class RelatedTransactionData1 {

    @XmlElement(name = "MstrUETR")
    protected String mstrUETR;
    @XmlElement(name = "SubUETR")
    protected List<String> subUETR;

    /**
     * Gets the value of the mstrUETR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMstrUETR() {
        return mstrUETR;
    }

    /**
     * Sets the value of the mstrUETR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RelatedTransactionData1 setMstrUETR(String value) {
        this.mstrUETR = value;
        return this;
    }

    /**
     * Gets the value of the subUETR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the subUETR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubUETR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the subUETR property.
     */
    public List<String> getSubUETR() {
        if (subUETR == null) {
            subUETR = new ArrayList<>();
        }
        return this.subUETR;
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
     * Adds a new item to the subUETR list.
     * @see #getSubUETR()
     * 
     */
    public RelatedTransactionData1 addSubUETR(String subUETR) {
        getSubUETR().add(subUETR);
        return this;
    }

}
