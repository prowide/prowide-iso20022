
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
 * Data exclusively related to a card issuer financial loan of the payment transaction, or instalment.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Instalment4", propOrder = {
    "pmtSeqNb",
    "plan"
})
public class Instalment4 {

    @XmlElement(name = "PmtSeqNb")
    protected BigDecimal pmtSeqNb;
    @XmlElement(name = "Plan")
    protected List<Plan2> plan;

    /**
     * Gets the value of the pmtSeqNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPmtSeqNb() {
        return pmtSeqNb;
    }

    /**
     * Sets the value of the pmtSeqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Instalment4 setPmtSeqNb(BigDecimal value) {
        this.pmtSeqNb = value;
        return this;
    }

    /**
     * Gets the value of the plan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the plan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Plan2 }
     * 
     * 
     * @return
     *     The value of the plan property.
     */
    public List<Plan2> getPlan() {
        if (plan == null) {
            plan = new ArrayList<>();
        }
        return this.plan;
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
     * Adds a new item to the plan list.
     * @see #getPlan()
     * 
     */
    public Instalment4 addPlan(Plan2 plan) {
        getPlan().add(plan);
        return this;
    }

}
