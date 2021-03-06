
package com.prowidesoftware.swift.model.mx.dic;

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
 * Unique and unambiguous identifier of the group of transactions as assigned by the original instructing party.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalGroupInformation17", propOrder = {
    "orgnlMsgId",
    "ntwkFileNm",
    "orgnlMsgNmId",
    "grpSts",
    "stsRsnInf"
})
public class OriginalGroupInformation17 {

    @XmlElement(name = "OrgnlMsgId")
    protected String orgnlMsgId;
    @XmlElement(name = "NtwkFileNm")
    protected String ntwkFileNm;
    @XmlElement(name = "OrgnlMsgNmId", required = true)
    protected String orgnlMsgNmId;
    @XmlElement(name = "GrpSts")
    @XmlSchemaType(name = "string")
    protected TransactionGroupStatus2Code grpSts;
    @XmlElement(name = "StsRsnInf")
    protected StatusReasonInformation6 stsRsnInf;

    /**
     * Gets the value of the orgnlMsgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlMsgId() {
        return orgnlMsgId;
    }

    /**
     * Sets the value of the orgnlMsgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalGroupInformation17 setOrgnlMsgId(String value) {
        this.orgnlMsgId = value;
        return this;
    }

    /**
     * Gets the value of the ntwkFileNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtwkFileNm() {
        return ntwkFileNm;
    }

    /**
     * Sets the value of the ntwkFileNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalGroupInformation17 setNtwkFileNm(String value) {
        this.ntwkFileNm = value;
        return this;
    }

    /**
     * Gets the value of the orgnlMsgNmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlMsgNmId() {
        return orgnlMsgNmId;
    }

    /**
     * Sets the value of the orgnlMsgNmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalGroupInformation17 setOrgnlMsgNmId(String value) {
        this.orgnlMsgNmId = value;
        return this;
    }

    /**
     * Gets the value of the grpSts property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionGroupStatus2Code }
     *     
     */
    public TransactionGroupStatus2Code getGrpSts() {
        return grpSts;
    }

    /**
     * Sets the value of the grpSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionGroupStatus2Code }
     *     
     */
    public OriginalGroupInformation17 setGrpSts(TransactionGroupStatus2Code value) {
        this.grpSts = value;
        return this;
    }

    /**
     * Gets the value of the stsRsnInf property.
     * 
     * @return
     *     possible object is
     *     {@link StatusReasonInformation6 }
     *     
     */
    public StatusReasonInformation6 getStsRsnInf() {
        return stsRsnInf;
    }

    /**
     * Sets the value of the stsRsnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusReasonInformation6 }
     *     
     */
    public OriginalGroupInformation17 setStsRsnInf(StatusReasonInformation6 value) {
        this.stsRsnInf = value;
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
