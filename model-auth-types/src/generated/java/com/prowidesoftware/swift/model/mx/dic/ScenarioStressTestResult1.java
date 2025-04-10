
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
 * Outcome of the application of a hypothetical scenario on the valuation of a set of portfolios of financial instruments.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScenarioStressTestResult1", propOrder = {
    "id",
    "prtflStrssTstRslt"
})
public class ScenarioStressTestResult1 {

    @XmlElement(name = "Id", required = true)
    protected GenericIdentification168 id;
    @XmlElement(name = "PrtflStrssTstRslt", required = true)
    protected List<PortfolioStressTestResult1> prtflStrssTstRslt;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification168 }
     *     
     */
    public GenericIdentification168 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification168 }
     *     
     */
    public ScenarioStressTestResult1 setId(GenericIdentification168 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the prtflStrssTstRslt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prtflStrssTstRslt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrtflStrssTstRslt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortfolioStressTestResult1 }
     * 
     * 
     * @return
     *     The value of the prtflStrssTstRslt property.
     */
    public List<PortfolioStressTestResult1> getPrtflStrssTstRslt() {
        if (prtflStrssTstRslt == null) {
            prtflStrssTstRslt = new ArrayList<>();
        }
        return this.prtflStrssTstRslt;
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
     * Adds a new item to the prtflStrssTstRslt list.
     * @see #getPrtflStrssTstRslt()
     * 
     */
    public ScenarioStressTestResult1 addPrtflStrssTstRslt(PortfolioStressTestResult1 prtflStrssTstRslt) {
        getPrtflStrssTstRslt().add(prtflStrssTstRslt);
        return this;
    }

}
