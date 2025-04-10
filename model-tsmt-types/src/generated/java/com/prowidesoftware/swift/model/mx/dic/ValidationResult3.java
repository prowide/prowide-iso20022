
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
 * Describes the error that is the cause of the rejection.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidationResult3", propOrder = {
    "seqNb",
    "ruleId",
    "ruleDesc",
    "elmt"
})
public class ValidationResult3 {

    @XmlElement(name = "SeqNb", required = true)
    protected BigDecimal seqNb;
    @XmlElement(name = "RuleId", required = true)
    protected String ruleId;
    @XmlElement(name = "RuleDesc", required = true)
    protected String ruleDesc;
    @XmlElement(name = "Elmt")
    protected List<ElementIdentification3> elmt;

    /**
     * Gets the value of the seqNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeqNb() {
        return seqNb;
    }

    /**
     * Sets the value of the seqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ValidationResult3 setSeqNb(BigDecimal value) {
        this.seqNb = value;
        return this;
    }

    /**
     * Gets the value of the ruleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleId() {
        return ruleId;
    }

    /**
     * Sets the value of the ruleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ValidationResult3 setRuleId(String value) {
        this.ruleId = value;
        return this;
    }

    /**
     * Gets the value of the ruleDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleDesc() {
        return ruleDesc;
    }

    /**
     * Sets the value of the ruleDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ValidationResult3 setRuleDesc(String value) {
        this.ruleDesc = value;
        return this;
    }

    /**
     * Gets the value of the elmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElementIdentification3 }
     * 
     * 
     */
    public List<ElementIdentification3> getElmt() {
        if (elmt == null) {
            elmt = new ArrayList<ElementIdentification3>();
        }
        return this.elmt;
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
     * Adds a new item to the elmt list.
     * @see #getElmt()
     * 
     */
    public ValidationResult3 addElmt(ElementIdentification3 elmt) {
        getElmt().add(elmt);
        return this;
    }

}
