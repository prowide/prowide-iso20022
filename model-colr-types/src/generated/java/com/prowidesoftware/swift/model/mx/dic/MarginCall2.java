
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
 * Specifies the calculation and the resulting margin and independent amount needed to cover the risk exposure of one party versus another.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarginCall2", propOrder = {
    "collAcctId",
    "mrgnCallRslt",
    "mrgnDtlDueToA",
    "mrgnDtlDueToB",
    "rqrmntDtlsDueToA",
    "rqrmntDtlsDueToB",
    "xpctdCollDueToA",
    "xpctdCollDueToB"
})
public class MarginCall2 {

    @XmlElement(name = "CollAcctId")
    protected CollateralAccount2 collAcctId;
    @XmlElement(name = "MrgnCallRslt", required = true)
    protected MarginCallResult3 mrgnCallRslt;
    @XmlElement(name = "MrgnDtlDueToA")
    protected MarginCall1 mrgnDtlDueToA;
    @XmlElement(name = "MrgnDtlDueToB")
    protected MarginCall1 mrgnDtlDueToB;
    @XmlElement(name = "RqrmntDtlsDueToA")
    protected MarginRequirement1Choice rqrmntDtlsDueToA;
    @XmlElement(name = "RqrmntDtlsDueToB")
    protected MarginRequirement1Choice rqrmntDtlsDueToB;
    @XmlElement(name = "XpctdCollDueToA")
    protected ExpectedCollateral2Choice xpctdCollDueToA;
    @XmlElement(name = "XpctdCollDueToB")
    protected ExpectedCollateral2Choice xpctdCollDueToB;

    /**
     * Gets the value of the collAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralAccount2 }
     *     
     */
    public CollateralAccount2 getCollAcctId() {
        return collAcctId;
    }

    /**
     * Sets the value of the collAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralAccount2 }
     *     
     */
    public MarginCall2 setCollAcctId(CollateralAccount2 value) {
        this.collAcctId = value;
        return this;
    }

    /**
     * Gets the value of the mrgnCallRslt property.
     * 
     * @return
     *     possible object is
     *     {@link MarginCallResult3 }
     *     
     */
    public MarginCallResult3 getMrgnCallRslt() {
        return mrgnCallRslt;
    }

    /**
     * Sets the value of the mrgnCallRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginCallResult3 }
     *     
     */
    public MarginCall2 setMrgnCallRslt(MarginCallResult3 value) {
        this.mrgnCallRslt = value;
        return this;
    }

    /**
     * Gets the value of the mrgnDtlDueToA property.
     * 
     * @return
     *     possible object is
     *     {@link MarginCall1 }
     *     
     */
    public MarginCall1 getMrgnDtlDueToA() {
        return mrgnDtlDueToA;
    }

    /**
     * Sets the value of the mrgnDtlDueToA property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginCall1 }
     *     
     */
    public MarginCall2 setMrgnDtlDueToA(MarginCall1 value) {
        this.mrgnDtlDueToA = value;
        return this;
    }

    /**
     * Gets the value of the mrgnDtlDueToB property.
     * 
     * @return
     *     possible object is
     *     {@link MarginCall1 }
     *     
     */
    public MarginCall1 getMrgnDtlDueToB() {
        return mrgnDtlDueToB;
    }

    /**
     * Sets the value of the mrgnDtlDueToB property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginCall1 }
     *     
     */
    public MarginCall2 setMrgnDtlDueToB(MarginCall1 value) {
        this.mrgnDtlDueToB = value;
        return this;
    }

    /**
     * Gets the value of the rqrmntDtlsDueToA property.
     * 
     * @return
     *     possible object is
     *     {@link MarginRequirement1Choice }
     *     
     */
    public MarginRequirement1Choice getRqrmntDtlsDueToA() {
        return rqrmntDtlsDueToA;
    }

    /**
     * Sets the value of the rqrmntDtlsDueToA property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginRequirement1Choice }
     *     
     */
    public MarginCall2 setRqrmntDtlsDueToA(MarginRequirement1Choice value) {
        this.rqrmntDtlsDueToA = value;
        return this;
    }

    /**
     * Gets the value of the rqrmntDtlsDueToB property.
     * 
     * @return
     *     possible object is
     *     {@link MarginRequirement1Choice }
     *     
     */
    public MarginRequirement1Choice getRqrmntDtlsDueToB() {
        return rqrmntDtlsDueToB;
    }

    /**
     * Sets the value of the rqrmntDtlsDueToB property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginRequirement1Choice }
     *     
     */
    public MarginCall2 setRqrmntDtlsDueToB(MarginRequirement1Choice value) {
        this.rqrmntDtlsDueToB = value;
        return this;
    }

    /**
     * Gets the value of the xpctdCollDueToA property.
     * 
     * @return
     *     possible object is
     *     {@link ExpectedCollateral2Choice }
     *     
     */
    public ExpectedCollateral2Choice getXpctdCollDueToA() {
        return xpctdCollDueToA;
    }

    /**
     * Sets the value of the xpctdCollDueToA property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedCollateral2Choice }
     *     
     */
    public MarginCall2 setXpctdCollDueToA(ExpectedCollateral2Choice value) {
        this.xpctdCollDueToA = value;
        return this;
    }

    /**
     * Gets the value of the xpctdCollDueToB property.
     * 
     * @return
     *     possible object is
     *     {@link ExpectedCollateral2Choice }
     *     
     */
    public ExpectedCollateral2Choice getXpctdCollDueToB() {
        return xpctdCollDueToB;
    }

    /**
     * Sets the value of the xpctdCollDueToB property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedCollateral2Choice }
     *     
     */
    public MarginCall2 setXpctdCollDueToB(ExpectedCollateral2Choice value) {
        this.xpctdCollDueToB = value;
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
