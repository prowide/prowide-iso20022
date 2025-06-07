
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Element related to recurring transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurringTransaction6", propOrder = {
    "planId",
    "seqNb",
    "prdUnit",
    "gracePrd",
    "planNtce"
})
public class RecurringTransaction6 {

    @XmlElement(name = "PlanId")
    protected String planId;
    @XmlElement(name = "SeqNb")
    protected BigDecimal seqNb;
    @XmlElement(name = "PrdUnit")
    @XmlSchemaType(name = "string")
    protected Frequency3Code prdUnit;
    @XmlElement(name = "GracePrd")
    protected List<GracePeriod1> gracePrd;
    @XmlElement(name = "PlanNtce")
    protected List<ActionMessage11> planNtce;

    /**
     * Gets the value of the planId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanId() {
        return planId;
    }

    /**
     * Sets the value of the planId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RecurringTransaction6 setPlanId(String value) {
        this.planId = value;
        return this;
    }

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
    public RecurringTransaction6 setSeqNb(BigDecimal value) {
        this.seqNb = value;
        return this;
    }

    /**
     * Gets the value of the prdUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency3Code }
     *     
     */
    public Frequency3Code getPrdUnit() {
        return prdUnit;
    }

    /**
     * Sets the value of the prdUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency3Code }
     *     
     */
    public RecurringTransaction6 setPrdUnit(Frequency3Code value) {
        this.prdUnit = value;
        return this;
    }

    /**
     * Gets the value of the gracePrd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gracePrd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGracePrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GracePeriod1 }
     * 
     * 
     */
    public List<GracePeriod1> getGracePrd() {
        if (gracePrd == null) {
            gracePrd = new ArrayList<GracePeriod1>();
        }
        return this.gracePrd;
    }

    /**
     * Gets the value of the planNtce property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the planNtce property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlanNtce().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionMessage11 }
     * 
     * 
     */
    public List<ActionMessage11> getPlanNtce() {
        if (planNtce == null) {
            planNtce = new ArrayList<ActionMessage11>();
        }
        return this.planNtce;
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
     * Adds a new item to the gracePrd list.
     * @see #getGracePrd()
     * 
     */
    public RecurringTransaction6 addGracePrd(GracePeriod1 gracePrd) {
        getGracePrd().add(gracePrd);
        return this;
    }

    /**
     * Adds a new item to the planNtce list.
     * @see #getPlanNtce()
     * 
     */
    public RecurringTransaction6 addPlanNtce(ActionMessage11 planNtce) {
        getPlanNtce().add(planNtce);
        return this;
    }

}
