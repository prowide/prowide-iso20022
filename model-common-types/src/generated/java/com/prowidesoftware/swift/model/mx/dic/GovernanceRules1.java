
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
 * Rules governing an undertaking such as a guarantee or standby letter of credit.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GovernanceRules1", propOrder = {
    "ruleId",
    "aplblLaw",
    "jursdctn"
})
public class GovernanceRules1 {

    @XmlElement(name = "RuleId", required = true)
    protected GovernanceIdentification1Choice ruleId;
    @XmlElement(name = "AplblLaw")
    protected Location1 aplblLaw;
    @XmlElement(name = "Jursdctn")
    protected List<Location1> jursdctn;

    /**
     * Gets the value of the ruleId property.
     * 
     * @return
     *     possible object is
     *     {@link GovernanceIdentification1Choice }
     *     
     */
    public GovernanceIdentification1Choice getRuleId() {
        return ruleId;
    }

    /**
     * Sets the value of the ruleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GovernanceIdentification1Choice }
     *     
     */
    public GovernanceRules1 setRuleId(GovernanceIdentification1Choice value) {
        this.ruleId = value;
        return this;
    }

    /**
     * Gets the value of the aplblLaw property.
     * 
     * @return
     *     possible object is
     *     {@link Location1 }
     *     
     */
    public Location1 getAplblLaw() {
        return aplblLaw;
    }

    /**
     * Sets the value of the aplblLaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location1 }
     *     
     */
    public GovernanceRules1 setAplblLaw(Location1 value) {
        this.aplblLaw = value;
        return this;
    }

    /**
     * Gets the value of the jursdctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the jursdctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJursdctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Location1 }
     * 
     * 
     * @return
     *     The value of the jursdctn property.
     */
    public List<Location1> getJursdctn() {
        if (jursdctn == null) {
            jursdctn = new ArrayList<>();
        }
        return this.jursdctn;
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
     * Adds a new item to the jursdctn list.
     * @see #getJursdctn()
     * 
     */
    public GovernanceRules1 addJursdctn(Location1 jursdctn) {
        getJursdctn().add(jursdctn);
        return this;
    }

}
