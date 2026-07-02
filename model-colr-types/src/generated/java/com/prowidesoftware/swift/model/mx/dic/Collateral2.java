
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
 * Provides details on the collateral that will be either delivered, returned or both.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Collateral2", propOrder = {
    "mrgnCallReqId",
    "mrgnCallRspnId",
    "stdSttlmInstrs",
    "prpslTp",
    "collPrpslRspnId"
})
public class Collateral2 {

    @XmlElement(name = "MrgnCallReqId", required = true)
    protected String mrgnCallReqId;
    @XmlElement(name = "MrgnCallRspnId", required = true)
    protected String mrgnCallRspnId;
    @XmlElement(name = "StdSttlmInstrs", required = true)
    protected String stdSttlmInstrs;
    @XmlElement(name = "PrpslTp")
    protected ProposalType1Choice prpslTp;
    @XmlElement(name = "CollPrpslRspnId")
    protected String collPrpslRspnId;

    /**
     * Gets the value of the mrgnCallReqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrgnCallReqId() {
        return mrgnCallReqId;
    }

    /**
     * Sets the value of the mrgnCallReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Collateral2 setMrgnCallReqId(String value) {
        this.mrgnCallReqId = value;
        return this;
    }

    /**
     * Gets the value of the mrgnCallRspnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrgnCallRspnId() {
        return mrgnCallRspnId;
    }

    /**
     * Sets the value of the mrgnCallRspnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Collateral2 setMrgnCallRspnId(String value) {
        this.mrgnCallRspnId = value;
        return this;
    }

    /**
     * Gets the value of the stdSttlmInstrs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStdSttlmInstrs() {
        return stdSttlmInstrs;
    }

    /**
     * Sets the value of the stdSttlmInstrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Collateral2 setStdSttlmInstrs(String value) {
        this.stdSttlmInstrs = value;
        return this;
    }

    /**
     * Gets the value of the prpslTp property.
     * 
     * @return
     *     possible object is
     *     {@link ProposalType1Choice }
     *     
     */
    public ProposalType1Choice getPrpslTp() {
        return prpslTp;
    }

    /**
     * Sets the value of the prpslTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProposalType1Choice }
     *     
     */
    public Collateral2 setPrpslTp(ProposalType1Choice value) {
        this.prpslTp = value;
        return this;
    }

    /**
     * Gets the value of the collPrpslRspnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollPrpslRspnId() {
        return collPrpslRspnId;
    }

    /**
     * Sets the value of the collPrpslRspnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Collateral2 setCollPrpslRspnId(String value) {
        this.collPrpslRspnId = value;
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
