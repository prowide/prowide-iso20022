
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
 * Information on the results of the last stress tests performed by the fund.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StressTestReport1", propOrder = {
    "strssTstRslt",
    "actnPlan"
})
public class StressTestReport1 {

    @XmlElement(name = "StrssTstRslt", required = true)
    protected List<StressTestResult2> strssTstRslt;
    @XmlElement(name = "ActnPlan")
    protected ActionPlan1Choice actnPlan;

    /**
     * Gets the value of the strssTstRslt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the strssTstRslt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStrssTstRslt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StressTestResult2 }
     * 
     * 
     */
    public List<StressTestResult2> getStrssTstRslt() {
        if (strssTstRslt == null) {
            strssTstRslt = new ArrayList<StressTestResult2>();
        }
        return this.strssTstRslt;
    }

    /**
     * Gets the value of the actnPlan property.
     * 
     * @return
     *     possible object is
     *     {@link ActionPlan1Choice }
     *     
     */
    public ActionPlan1Choice getActnPlan() {
        return actnPlan;
    }

    /**
     * Sets the value of the actnPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionPlan1Choice }
     *     
     */
    public StressTestReport1 setActnPlan(ActionPlan1Choice value) {
        this.actnPlan = value;
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
     * Adds a new item to the strssTstRslt list.
     * @see #getStrssTstRslt()
     * 
     */
    public StressTestReport1 addStrssTstRslt(StressTestResult2 strssTstRslt) {
        getStrssTstRslt().add(strssTstRslt);
        return this;
    }

}
