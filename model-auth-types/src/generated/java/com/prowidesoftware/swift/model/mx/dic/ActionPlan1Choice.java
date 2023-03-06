
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice between no action plan (because no vulnerability was revealed) or the description of the action plan proposed by the manager of the fund.
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionPlan1Choice", propOrder = {
    "noVlnrblty",
    "propsdActnPlan"
})
public class ActionPlan1Choice {

    @XmlElement(name = "NoVlnrblty")
    @XmlSchemaType(name = "string")
    protected NoVulnerability1Code noVlnrblty;
    @XmlElement(name = "PropsdActnPlan")
    protected String propsdActnPlan;

    /**
     * Gets the value of the noVlnrblty property.
     * 
     * @return
     *     possible object is
     *     {@link NoVulnerability1Code }
     *     
     */
    public NoVulnerability1Code getNoVlnrblty() {
        return noVlnrblty;
    }

    /**
     * Sets the value of the noVlnrblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoVulnerability1Code }
     *     
     */
    public ActionPlan1Choice setNoVlnrblty(NoVulnerability1Code value) {
        this.noVlnrblty = value;
        return this;
    }

    /**
     * Gets the value of the propsdActnPlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropsdActnPlan() {
        return propsdActnPlan;
    }

    /**
     * Sets the value of the propsdActnPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ActionPlan1Choice setPropsdActnPlan(String value) {
        this.propsdActnPlan = value;
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

}
