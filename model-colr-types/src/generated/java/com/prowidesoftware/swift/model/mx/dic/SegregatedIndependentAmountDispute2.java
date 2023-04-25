
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
 * Provides for the segregated independent amount, the dispute details like the dispute amount or the dispute date and the resolution type details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegregatedIndependentAmountDispute2", propOrder = {
    "dsptDtls",
    "dsptRsltnTp1Chc"
})
public class SegregatedIndependentAmountDispute2 {

    @XmlElement(name = "DsptDtls", required = true)
    protected Dispute1 dsptDtls;
    @XmlElement(name = "DsptRsltnTp1Chc")
    protected List<DisputeResolutionType1Choice> dsptRsltnTp1Chc;

    /**
     * Gets the value of the dsptDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Dispute1 }
     *     
     */
    public Dispute1 getDsptDtls() {
        return dsptDtls;
    }

    /**
     * Sets the value of the dsptDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dispute1 }
     *     
     */
    public SegregatedIndependentAmountDispute2 setDsptDtls(Dispute1 value) {
        this.dsptDtls = value;
        return this;
    }

    /**
     * Gets the value of the dsptRsltnTp1Chc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dsptRsltnTp1Chc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDsptRsltnTp1Chc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisputeResolutionType1Choice }
     * 
     * 
     * @return
     *     The value of the dsptRsltnTp1Chc property.
     */
    public List<DisputeResolutionType1Choice> getDsptRsltnTp1Chc() {
        if (dsptRsltnTp1Chc == null) {
            dsptRsltnTp1Chc = new ArrayList<>();
        }
        return this.dsptRsltnTp1Chc;
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
     * Adds a new item to the dsptRsltnTp1Chc list.
     * @see #getDsptRsltnTp1Chc()
     * 
     */
    public SegregatedIndependentAmountDispute2 addDsptRsltnTp1Chc(DisputeResolutionType1Choice dsptRsltnTp1Chc) {
        getDsptRsltnTp1Chc().add(dsptRsltnTp1Chc);
        return this;
    }

}
