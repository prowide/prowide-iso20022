
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Distribution strategy criteria.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributionStrategy1", propOrder = {
    "exctnOnly",
    "exctnWthApprprtnssTstOrNonAdvsdSvcs",
    "invstmtAdvc",
    "prtflMgmt",
    "othr"
})
public class DistributionStrategy1 {

    @XmlElement(name = "ExctnOnly")
    protected DistributionStrategy1Choice exctnOnly;
    @XmlElement(name = "ExctnWthApprprtnssTstOrNonAdvsdSvcs")
    protected DistributionStrategy1Choice exctnWthApprprtnssTstOrNonAdvsdSvcs;
    @XmlElement(name = "InvstmtAdvc")
    protected DistributionStrategy1Choice invstmtAdvc;
    @XmlElement(name = "PrtflMgmt")
    protected DistributionStrategy1Choice prtflMgmt;
    @XmlElement(name = "Othr")
    protected OtherDistributionStrategy1 othr;

    /**
     * Gets the value of the exctnOnly property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionStrategy1Choice }
     *     
     */
    public DistributionStrategy1Choice getExctnOnly() {
        return exctnOnly;
    }

    /**
     * Sets the value of the exctnOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionStrategy1Choice }
     *     
     */
    public DistributionStrategy1 setExctnOnly(DistributionStrategy1Choice value) {
        this.exctnOnly = value;
        return this;
    }

    /**
     * Gets the value of the exctnWthApprprtnssTstOrNonAdvsdSvcs property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionStrategy1Choice }
     *     
     */
    public DistributionStrategy1Choice getExctnWthApprprtnssTstOrNonAdvsdSvcs() {
        return exctnWthApprprtnssTstOrNonAdvsdSvcs;
    }

    /**
     * Sets the value of the exctnWthApprprtnssTstOrNonAdvsdSvcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionStrategy1Choice }
     *     
     */
    public DistributionStrategy1 setExctnWthApprprtnssTstOrNonAdvsdSvcs(DistributionStrategy1Choice value) {
        this.exctnWthApprprtnssTstOrNonAdvsdSvcs = value;
        return this;
    }

    /**
     * Gets the value of the invstmtAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionStrategy1Choice }
     *     
     */
    public DistributionStrategy1Choice getInvstmtAdvc() {
        return invstmtAdvc;
    }

    /**
     * Sets the value of the invstmtAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionStrategy1Choice }
     *     
     */
    public DistributionStrategy1 setInvstmtAdvc(DistributionStrategy1Choice value) {
        this.invstmtAdvc = value;
        return this;
    }

    /**
     * Gets the value of the prtflMgmt property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionStrategy1Choice }
     *     
     */
    public DistributionStrategy1Choice getPrtflMgmt() {
        return prtflMgmt;
    }

    /**
     * Sets the value of the prtflMgmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionStrategy1Choice }
     *     
     */
    public DistributionStrategy1 setPrtflMgmt(DistributionStrategy1Choice value) {
        this.prtflMgmt = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link OtherDistributionStrategy1 }
     *     
     */
    public OtherDistributionStrategy1 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherDistributionStrategy1 }
     *     
     */
    public DistributionStrategy1 setOthr(OtherDistributionStrategy1 value) {
        this.othr = value;
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
