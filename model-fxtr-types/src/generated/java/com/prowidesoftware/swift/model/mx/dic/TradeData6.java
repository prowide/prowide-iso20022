
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides information on the status of a trade.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeData6", propOrder = {
    "ntfctnId",
    "mtchgSysUnqRef",
    "mtchgSysMtchgRef",
    "stsOrgtr",
    "curSts",
    "curStsSubTp",
    "curStsDtTm",
    "prvsSts",
    "prvsStsSubTp",
    "prvsStsDtTm",
    "pdctTp"
})
public class TradeData6 {

    @XmlElement(name = "NtfctnId", required = true)
    protected String ntfctnId;
    @XmlElement(name = "MtchgSysUnqRef", required = true)
    protected String mtchgSysUnqRef;
    @XmlElement(name = "MtchgSysMtchgRef")
    protected String mtchgSysMtchgRef;
    @XmlElement(name = "StsOrgtr")
    protected String stsOrgtr;
    @XmlElement(name = "CurSts", required = true)
    protected Status6Choice curSts;
    @XmlElement(name = "CurStsSubTp")
    protected String curStsSubTp;
    @XmlElement(name = "CurStsDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar curStsDtTm;
    @XmlElement(name = "PrvsSts")
    protected Status6Choice prvsSts;
    @XmlElement(name = "PrvsStsSubTp")
    protected String prvsStsSubTp;
    @XmlElement(name = "PrvsStsDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar prvsStsDtTm;
    @XmlElement(name = "PdctTp")
    protected String pdctTp;

    /**
     * Gets the value of the ntfctnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtfctnId() {
        return ntfctnId;
    }

    /**
     * Sets the value of the ntfctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeData6 setNtfctnId(String value) {
        this.ntfctnId = value;
        return this;
    }

    /**
     * Gets the value of the mtchgSysUnqRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtchgSysUnqRef() {
        return mtchgSysUnqRef;
    }

    /**
     * Sets the value of the mtchgSysUnqRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeData6 setMtchgSysUnqRef(String value) {
        this.mtchgSysUnqRef = value;
        return this;
    }

    /**
     * Gets the value of the mtchgSysMtchgRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtchgSysMtchgRef() {
        return mtchgSysMtchgRef;
    }

    /**
     * Sets the value of the mtchgSysMtchgRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeData6 setMtchgSysMtchgRef(String value) {
        this.mtchgSysMtchgRef = value;
        return this;
    }

    /**
     * Gets the value of the stsOrgtr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStsOrgtr() {
        return stsOrgtr;
    }

    /**
     * Sets the value of the stsOrgtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeData6 setStsOrgtr(String value) {
        this.stsOrgtr = value;
        return this;
    }

    /**
     * Gets the value of the curSts property.
     * 
     * @return
     *     possible object is
     *     {@link Status6Choice }
     *     
     */
    public Status6Choice getCurSts() {
        return curSts;
    }

    /**
     * Sets the value of the curSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status6Choice }
     *     
     */
    public TradeData6 setCurSts(Status6Choice value) {
        this.curSts = value;
        return this;
    }

    /**
     * Gets the value of the curStsSubTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurStsSubTp() {
        return curStsSubTp;
    }

    /**
     * Sets the value of the curStsSubTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeData6 setCurStsSubTp(String value) {
        this.curStsSubTp = value;
        return this;
    }

    /**
     * Gets the value of the curStsDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCurStsDtTm() {
        return curStsDtTm;
    }

    /**
     * Sets the value of the curStsDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public TradeData6 setCurStsDtTm(XMLGregorianCalendar value) {
        this.curStsDtTm = value;
        return this;
    }

    /**
     * Gets the value of the prvsSts property.
     * 
     * @return
     *     possible object is
     *     {@link Status6Choice }
     *     
     */
    public Status6Choice getPrvsSts() {
        return prvsSts;
    }

    /**
     * Sets the value of the prvsSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status6Choice }
     *     
     */
    public TradeData6 setPrvsSts(Status6Choice value) {
        this.prvsSts = value;
        return this;
    }

    /**
     * Gets the value of the prvsStsSubTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrvsStsSubTp() {
        return prvsStsSubTp;
    }

    /**
     * Sets the value of the prvsStsSubTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeData6 setPrvsStsSubTp(String value) {
        this.prvsStsSubTp = value;
        return this;
    }

    /**
     * Gets the value of the prvsStsDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrvsStsDtTm() {
        return prvsStsDtTm;
    }

    /**
     * Sets the value of the prvsStsDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public TradeData6 setPrvsStsDtTm(XMLGregorianCalendar value) {
        this.prvsStsDtTm = value;
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
    public TradeData6 setPdctTp(String value) {
        this.pdctTp = value;
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
