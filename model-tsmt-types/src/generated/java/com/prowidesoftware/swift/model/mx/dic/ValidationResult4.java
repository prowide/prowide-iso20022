
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
 * Detailed description of the differences.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidationResult4", propOrder = {
    "seqNb",
    "ruleId",
    "ruleDesc",
    "misMtchdElmt"
})
public class ValidationResult4 {

    @XmlElement(name = "SeqNb", required = true)
    protected BigDecimal seqNb;
    @XmlElement(name = "RuleId", required = true)
    protected String ruleId;
    @XmlElement(name = "RuleDesc", required = true)
    protected String ruleDesc;
    @XmlElement(name = "MisMtchdElmt", required = true)
    protected List<ElementIdentification1> misMtchdElmt;

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
    public ValidationResult4 setSeqNb(BigDecimal value) {
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
    public ValidationResult4 setRuleId(String value) {
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
    public ValidationResult4 setRuleDesc(String value) {
        this.ruleDesc = value;
        return this;
    }

    /**
     * Gets the value of the misMtchdElmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the misMtchdElmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMisMtchdElmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElementIdentification1 }
     * 
     * 
     */
    public List<ElementIdentification1> getMisMtchdElmt() {
        if (misMtchdElmt == null) {
            misMtchdElmt = new ArrayList<ElementIdentification1>();
        }
        return this.misMtchdElmt;
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
     * Adds a new item to the misMtchdElmt list.
     * @see #getMisMtchdElmt()
     * 
     */
    public ValidationResult4 addMisMtchdElmt(ElementIdentification1 misMtchdElmt) {
        getMisMtchdElmt().add(misMtchdElmt);
        return this;
    }

}
