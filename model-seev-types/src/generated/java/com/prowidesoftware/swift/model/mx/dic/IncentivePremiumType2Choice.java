
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
 * Choice of cash premium paid to the security holder when voting.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncentivePremiumType2Choice", propOrder = {
    "perScty",
    "perVote",
    "perAttndee"
})
public class IncentivePremiumType2Choice {

    @XmlElement(name = "PerScty")
    protected BigDecimal perScty;
    @XmlElement(name = "PerVote")
    protected List<VoteTypeAndQuantity1> perVote;
    @XmlElement(name = "PerAttndee")
    protected Boolean perAttndee;

    /**
     * Gets the value of the perScty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPerScty() {
        return perScty;
    }

    /**
     * Sets the value of the perScty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public IncentivePremiumType2Choice setPerScty(BigDecimal value) {
        this.perScty = value;
        return this;
    }

    /**
     * Gets the value of the perVote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the perVote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerVote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VoteTypeAndQuantity1 }
     * 
     * 
     */
    public List<VoteTypeAndQuantity1> getPerVote() {
        if (perVote == null) {
            perVote = new ArrayList<VoteTypeAndQuantity1>();
        }
        return this.perVote;
    }

    /**
     * Gets the value of the perAttndee property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPerAttndee() {
        return perAttndee;
    }

    /**
     * Sets the value of the perAttndee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public IncentivePremiumType2Choice setPerAttndee(Boolean value) {
        this.perAttndee = value;
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
     * Adds a new item to the perVote list.
     * @see #getPerVote()
     * 
     */
    public IncentivePremiumType2Choice addPerVote(VoteTypeAndQuantity1 perVote) {
        getPerVote().add(perVote);
        return this;
    }

}
