
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Defines the criteria used to report on a member.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemberReturnCriteria1", propOrder = {
    "nmInd",
    "mmbRtrAdrInd",
    "acctInd",
    "tpInd",
    "stsInd",
    "ctctRefInd",
    "comAdrInd"
})
public class MemberReturnCriteria1 {

    @XmlElement(name = "NmInd")
    protected Boolean nmInd;
    @XmlElement(name = "MmbRtrAdrInd")
    protected Boolean mmbRtrAdrInd;
    @XmlElement(name = "AcctInd")
    protected Boolean acctInd;
    @XmlElement(name = "TpInd")
    protected Boolean tpInd;
    @XmlElement(name = "StsInd")
    protected Boolean stsInd;
    @XmlElement(name = "CtctRefInd")
    protected Boolean ctctRefInd;
    @XmlElement(name = "ComAdrInd")
    protected Boolean comAdrInd;

    /**
     * Gets the value of the nmInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNmInd() {
        return nmInd;
    }

    /**
     * Sets the value of the nmInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public MemberReturnCriteria1 setNmInd(Boolean value) {
        this.nmInd = value;
        return this;
    }

    /**
     * Gets the value of the mmbRtrAdrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMmbRtrAdrInd() {
        return mmbRtrAdrInd;
    }

    /**
     * Sets the value of the mmbRtrAdrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public MemberReturnCriteria1 setMmbRtrAdrInd(Boolean value) {
        this.mmbRtrAdrInd = value;
        return this;
    }

    /**
     * Gets the value of the acctInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcctInd() {
        return acctInd;
    }

    /**
     * Sets the value of the acctInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public MemberReturnCriteria1 setAcctInd(Boolean value) {
        this.acctInd = value;
        return this;
    }

    /**
     * Gets the value of the tpInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTpInd() {
        return tpInd;
    }

    /**
     * Sets the value of the tpInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public MemberReturnCriteria1 setTpInd(Boolean value) {
        this.tpInd = value;
        return this;
    }

    /**
     * Gets the value of the stsInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStsInd() {
        return stsInd;
    }

    /**
     * Sets the value of the stsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public MemberReturnCriteria1 setStsInd(Boolean value) {
        this.stsInd = value;
        return this;
    }

    /**
     * Gets the value of the ctctRefInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCtctRefInd() {
        return ctctRefInd;
    }

    /**
     * Sets the value of the ctctRefInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public MemberReturnCriteria1 setCtctRefInd(Boolean value) {
        this.ctctRefInd = value;
        return this;
    }

    /**
     * Gets the value of the comAdrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComAdrInd() {
        return comAdrInd;
    }

    /**
     * Sets the value of the comAdrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public MemberReturnCriteria1 setComAdrInd(Boolean value) {
        this.comAdrInd = value;
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
