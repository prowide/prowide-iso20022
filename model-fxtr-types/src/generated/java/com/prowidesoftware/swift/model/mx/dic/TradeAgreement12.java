
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Date and identification of a trade together with references to previous events in its life.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeAgreement12", propOrder = {
    "tradDt",
    "msgId",
    "orgtrRef",
    "cmonRef",
    "amdOrCclRsn",
    "rltdRef",
    "pdctTp",
    "oprTp",
    "oprScp",
    "sttlmSsnIdr",
    "spltTradInd",
    "pmtVrssPmtInd"
})
public class TradeAgreement12 {

    @XmlElement(name = "TradDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tradDt;
    @XmlElement(name = "MsgId", required = true)
    protected String msgId;
    @XmlElement(name = "OrgtrRef", required = true)
    protected String orgtrRef;
    @XmlElement(name = "CmonRef")
    protected String cmonRef;
    @XmlElement(name = "AmdOrCclRsn")
    protected String amdOrCclRsn;
    @XmlElement(name = "RltdRef")
    protected String rltdRef;
    @XmlElement(name = "PdctTp")
    protected String pdctTp;
    @XmlElement(name = "OprTp")
    protected String oprTp;
    @XmlElement(name = "OprScp")
    protected String oprScp;
    @XmlElement(name = "SttlmSsnIdr")
    protected String sttlmSsnIdr;
    @XmlElement(name = "SpltTradInd")
    protected boolean spltTradInd;
    @XmlElement(name = "PmtVrssPmtInd")
    protected Boolean pmtVrssPmtInd;

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeAgreement12 setTradDt(XMLGregorianCalendar value) {
        this.tradDt = value;
        return this;
    }

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeAgreement12 setMsgId(String value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the orgtrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgtrRef() {
        return orgtrRef;
    }

    /**
     * Sets the value of the orgtrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeAgreement12 setOrgtrRef(String value) {
        this.orgtrRef = value;
        return this;
    }

    /**
     * Gets the value of the cmonRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmonRef() {
        return cmonRef;
    }

    /**
     * Sets the value of the cmonRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeAgreement12 setCmonRef(String value) {
        this.cmonRef = value;
        return this;
    }

    /**
     * Gets the value of the amdOrCclRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmdOrCclRsn() {
        return amdOrCclRsn;
    }

    /**
     * Sets the value of the amdOrCclRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeAgreement12 setAmdOrCclRsn(String value) {
        this.amdOrCclRsn = value;
        return this;
    }

    /**
     * Gets the value of the rltdRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRltdRef() {
        return rltdRef;
    }

    /**
     * Sets the value of the rltdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeAgreement12 setRltdRef(String value) {
        this.rltdRef = value;
        return this;
    }

    /**
     * Gets the value of the pdctTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdctTp() {
        return pdctTp;
    }

    /**
     * Sets the value of the pdctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeAgreement12 setPdctTp(String value) {
        this.pdctTp = value;
        return this;
    }

    /**
     * Gets the value of the oprTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOprTp() {
        return oprTp;
    }

    /**
     * Sets the value of the oprTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeAgreement12 setOprTp(String value) {
        this.oprTp = value;
        return this;
    }

    /**
     * Gets the value of the oprScp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOprScp() {
        return oprScp;
    }

    /**
     * Sets the value of the oprScp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeAgreement12 setOprScp(String value) {
        this.oprScp = value;
        return this;
    }

    /**
     * Gets the value of the sttlmSsnIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttlmSsnIdr() {
        return sttlmSsnIdr;
    }

    /**
     * Sets the value of the sttlmSsnIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeAgreement12 setSttlmSsnIdr(String value) {
        this.sttlmSsnIdr = value;
        return this;
    }

    /**
     * Gets the value of the spltTradInd property.
     * 
     */
    public boolean isSpltTradInd() {
        return spltTradInd;
    }

    /**
     * Sets the value of the spltTradInd property.
     * 
     */
    public TradeAgreement12 setSpltTradInd(boolean value) {
        this.spltTradInd = value;
        return this;
    }

    /**
     * Gets the value of the pmtVrssPmtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPmtVrssPmtInd() {
        return pmtVrssPmtInd;
    }

    /**
     * Sets the value of the pmtVrssPmtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public TradeAgreement12 setPmtVrssPmtInd(Boolean value) {
        this.pmtVrssPmtInd = value;
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
