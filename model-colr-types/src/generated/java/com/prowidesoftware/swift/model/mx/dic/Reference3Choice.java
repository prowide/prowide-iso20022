
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
 * Identification of the message to be cancelled.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reference3Choice", propOrder = {
    "clntCollInstrId",
    "clntCollTxId",
    "collPrpslId",
    "collPrpslRspnId",
    "collSbstitnConfId",
    "collSbstitnReqId",
    "collSbstitnRspnId",
    "cmonTxId",
    "dsptNtfctnId",
    "intrstPmtReqId",
    "intrstPmtRspnId",
    "intrstPmtStmtId",
    "mrgnCallReqId",
    "mrgnCallRspnId",
    "trptyAgtSvcPrvdrCollInstrId",
    "trptyAgtSvcPrvdrCollTxId"
})
public class Reference3Choice {

    @XmlElement(name = "ClntCollInstrId")
    protected String clntCollInstrId;
    @XmlElement(name = "ClntCollTxId")
    protected String clntCollTxId;
    @XmlElement(name = "CollPrpslId")
    protected String collPrpslId;
    @XmlElement(name = "CollPrpslRspnId")
    protected String collPrpslRspnId;
    @XmlElement(name = "CollSbstitnConfId")
    protected String collSbstitnConfId;
    @XmlElement(name = "CollSbstitnReqId")
    protected String collSbstitnReqId;
    @XmlElement(name = "CollSbstitnRspnId")
    protected String collSbstitnRspnId;
    @XmlElement(name = "CmonTxId")
    protected String cmonTxId;
    @XmlElement(name = "DsptNtfctnId")
    protected String dsptNtfctnId;
    @XmlElement(name = "IntrstPmtReqId")
    protected String intrstPmtReqId;
    @XmlElement(name = "IntrstPmtRspnId")
    protected String intrstPmtRspnId;
    @XmlElement(name = "IntrstPmtStmtId")
    protected String intrstPmtStmtId;
    @XmlElement(name = "MrgnCallReqId")
    protected String mrgnCallReqId;
    @XmlElement(name = "MrgnCallRspnId")
    protected String mrgnCallRspnId;
    @XmlElement(name = "TrptyAgtSvcPrvdrCollInstrId")
    protected String trptyAgtSvcPrvdrCollInstrId;
    @XmlElement(name = "TrptyAgtSvcPrvdrCollTxId")
    protected String trptyAgtSvcPrvdrCollTxId;

    /**
     * Gets the value of the clntCollInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntCollInstrId() {
        return clntCollInstrId;
    }

    /**
     * Sets the value of the clntCollInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference3Choice setClntCollInstrId(String value) {
        this.clntCollInstrId = value;
        return this;
    }

    /**
     * Gets the value of the clntCollTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntCollTxId() {
        return clntCollTxId;
    }

    /**
     * Sets the value of the clntCollTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference3Choice setClntCollTxId(String value) {
        this.clntCollTxId = value;
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
    public Reference3Choice setCollPrpslId(String value) {
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
    public Reference3Choice setCollPrpslRspnId(String value) {
        this.collPrpslRspnId = value;
        return this;
    }

    /**
     * Gets the value of the collSbstitnConfId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollSbstitnConfId() {
        return collSbstitnConfId;
    }

    /**
     * Sets the value of the collSbstitnConfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference3Choice setCollSbstitnConfId(String value) {
        this.collSbstitnConfId = value;
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
    public Reference3Choice setCollSbstitnReqId(String value) {
        this.collSbstitnReqId = value;
        return this;
    }

    /**
     * Gets the value of the collSbstitnRspnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollSbstitnRspnId() {
        return collSbstitnRspnId;
    }

    /**
     * Sets the value of the collSbstitnRspnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference3Choice setCollSbstitnRspnId(String value) {
        this.collSbstitnRspnId = value;
        return this;
    }

    /**
     * Gets the value of the cmonTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmonTxId() {
        return cmonTxId;
    }

    /**
     * Sets the value of the cmonTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference3Choice setCmonTxId(String value) {
        this.cmonTxId = value;
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
    public Reference3Choice setDsptNtfctnId(String value) {
        this.dsptNtfctnId = value;
        return this;
    }

    /**
     * Gets the value of the intrstPmtReqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntrstPmtReqId() {
        return intrstPmtReqId;
    }

    /**
     * Sets the value of the intrstPmtReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference3Choice setIntrstPmtReqId(String value) {
        this.intrstPmtReqId = value;
        return this;
    }

    /**
     * Gets the value of the intrstPmtRspnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntrstPmtRspnId() {
        return intrstPmtRspnId;
    }

    /**
     * Sets the value of the intrstPmtRspnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference3Choice setIntrstPmtRspnId(String value) {
        this.intrstPmtRspnId = value;
        return this;
    }

    /**
     * Gets the value of the intrstPmtStmtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntrstPmtStmtId() {
        return intrstPmtStmtId;
    }

    /**
     * Sets the value of the intrstPmtStmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference3Choice setIntrstPmtStmtId(String value) {
        this.intrstPmtStmtId = value;
        return this;
    }

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
    public Reference3Choice setMrgnCallReqId(String value) {
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
    public Reference3Choice setMrgnCallRspnId(String value) {
        this.mrgnCallRspnId = value;
        return this;
    }

    /**
     * Gets the value of the trptyAgtSvcPrvdrCollInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrptyAgtSvcPrvdrCollInstrId() {
        return trptyAgtSvcPrvdrCollInstrId;
    }

    /**
     * Sets the value of the trptyAgtSvcPrvdrCollInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference3Choice setTrptyAgtSvcPrvdrCollInstrId(String value) {
        this.trptyAgtSvcPrvdrCollInstrId = value;
        return this;
    }

    /**
     * Gets the value of the trptyAgtSvcPrvdrCollTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrptyAgtSvcPrvdrCollTxId() {
        return trptyAgtSvcPrvdrCollTxId;
    }

    /**
     * Sets the value of the trptyAgtSvcPrvdrCollTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference3Choice setTrptyAgtSvcPrvdrCollTxId(String value) {
        this.trptyAgtSvcPrvdrCollTxId = value;
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
