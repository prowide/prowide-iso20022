
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
 * Choice between the identification of the MarginCallRequest message, the MarginCallResponse message, the CollateralProposal message, the CollateralProposalResponse message, the CollateralSubstitutionRequest message or the MarginCallDisputeNotification message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reference1Choice", propOrder = {
    "mrgnCallReqId",
    "mrgnCallRspnId",
    "collPrpslId",
    "collPrpslRspnId",
    "dsptNtfctnId",
    "collSbstitnReqId"
})
public class Reference1Choice {

    @XmlElement(name = "MrgnCallReqId")
    protected String mrgnCallReqId;
    @XmlElement(name = "MrgnCallRspnId")
    protected String mrgnCallRspnId;
    @XmlElement(name = "CollPrpslId")
    protected String collPrpslId;
    @XmlElement(name = "CollPrpslRspnId")
    protected String collPrpslRspnId;
    @XmlElement(name = "DsptNtfctnId")
    protected String dsptNtfctnId;
    @XmlElement(name = "CollSbstitnReqId")
    protected String collSbstitnReqId;

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
    public Reference1Choice setMrgnCallReqId(String value) {
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
    public Reference1Choice setMrgnCallRspnId(String value) {
        this.mrgnCallRspnId = value;
        return this;
    }

    /**
     * Gets the value of the collPrpslId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollPrpslId() {
        return collPrpslId;
    }

    /**
     * Sets the value of the collPrpslId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference1Choice setCollPrpslId(String value) {
        this.collPrpslId = value;
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
    public Reference1Choice setCollPrpslRspnId(String value) {
        this.collPrpslRspnId = value;
        return this;
    }

    /**
     * Gets the value of the dsptNtfctnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsptNtfctnId() {
        return dsptNtfctnId;
    }

    /**
     * Sets the value of the dsptNtfctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference1Choice setDsptNtfctnId(String value) {
        this.dsptNtfctnId = value;
        return this;
    }

    /**
     * Gets the value of the collSbstitnReqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollSbstitnReqId() {
        return collSbstitnReqId;
    }

    /**
     * Sets the value of the collSbstitnReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference1Choice setCollSbstitnReqId(String value) {
        this.collSbstitnReqId = value;
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
