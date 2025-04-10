
package com.prowidesoftware.swift.model.mx.dic;

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
 * Provides for the variation margin, the dispute details like the dispute amount or the dispute date and the resolution type details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VariationMarginDispute1", propOrder = {
    "dsptDtls",
    "rsltnTpDtls"
})
public class VariationMarginDispute1 {

    @XmlElement(name = "DsptDtls", required = true)
    protected Dispute1 dsptDtls;
    @XmlElement(name = "RsltnTpDtls")
    protected List<DisputeResolutionType2Choice> rsltnTpDtls;

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
    public VariationMarginDispute1 setDsptDtls(Dispute1 value) {
        this.dsptDtls = value;
        return this;
    }

    /**
     * Gets the value of the rsltnTpDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rsltnTpDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRsltnTpDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisputeResolutionType2Choice }
     * 
     * 
     */
    public List<DisputeResolutionType2Choice> getRsltnTpDtls() {
        if (rsltnTpDtls == null) {
            rsltnTpDtls = new ArrayList<DisputeResolutionType2Choice>();
        }
        return this.rsltnTpDtls;
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
     * Adds a new item to the rsltnTpDtls list.
     * @see #getRsltnTpDtls()
     * 
     */
    public VariationMarginDispute1 addRsltnTpDtls(DisputeResolutionType2Choice rsltnTpDtls) {
        getRsltnTpDtls().add(rsltnTpDtls);
        return this;
    }

}
