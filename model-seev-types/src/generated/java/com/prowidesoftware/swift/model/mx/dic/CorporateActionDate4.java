
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
 * Specifies corporate action dates.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionDate4", propOrder = {
    "cpnClpngDt",
    "cnsntXprtnDt",
    "cnsntRcrdDt",
    "pmtDt",
    "earlstPmtDt",
    "mktDdln",
    "rspnDdln",
    "ddlnToSplt",
    "xpryDt",
    "qtnSetngDt",
    "sbcptCostDbtDt"
})
public class CorporateActionDate4 {

    @XmlElement(name = "CpnClpngDt")
    protected DateFormat4Choice cpnClpngDt;
    @XmlElement(name = "CnsntXprtnDt")
    protected DateFormat4Choice cnsntXprtnDt;
    @XmlElement(name = "CnsntRcrdDt")
    protected DateFormat4Choice cnsntRcrdDt;
    @XmlElement(name = "PmtDt")
    protected DateFormat4Choice pmtDt;
    @XmlElement(name = "EarlstPmtDt")
    protected DateFormat4Choice earlstPmtDt;
    @XmlElement(name = "MktDdln")
    protected DateFormat4Choice mktDdln;
    @XmlElement(name = "RspnDdln")
    protected DateFormat4Choice rspnDdln;
    @XmlElement(name = "DdlnToSplt")
    protected DateFormat4Choice ddlnToSplt;
    @XmlElement(name = "XpryDt")
    protected DateFormat4Choice xpryDt;
    @XmlElement(name = "QtnSetngDt")
    protected DateFormat4Choice qtnSetngDt;
    @XmlElement(name = "SbcptCostDbtDt")
    protected DateFormat4Choice sbcptCostDbtDt;

    /**
     * Gets the value of the cpnClpngDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getCpnClpngDt() {
        return cpnClpngDt;
    }

    /**
     * Sets the value of the cpnClpngDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public CorporateActionDate4 setCpnClpngDt(DateFormat4Choice value) {
        this.cpnClpngDt = value;
        return this;
    }

    /**
     * Gets the value of the cnsntXprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getCnsntXprtnDt() {
        return cnsntXprtnDt;
    }

    /**
     * Sets the value of the cnsntXprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public CorporateActionDate4 setCnsntXprtnDt(DateFormat4Choice value) {
        this.cnsntXprtnDt = value;
        return this;
    }

    /**
     * Gets the value of the cnsntRcrdDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getCnsntRcrdDt() {
        return cnsntRcrdDt;
    }

    /**
     * Sets the value of the cnsntRcrdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public CorporateActionDate4 setCnsntRcrdDt(DateFormat4Choice value) {
        this.cnsntRcrdDt = value;
        return this;
    }

    /**
     * Gets the value of the pmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getPmtDt() {
        return pmtDt;
    }

    /**
     * Sets the value of the pmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public CorporateActionDate4 setPmtDt(DateFormat4Choice value) {
        this.pmtDt = value;
        return this;
    }

    /**
     * Gets the value of the earlstPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getEarlstPmtDt() {
        return earlstPmtDt;
    }

    /**
     * Sets the value of the earlstPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public CorporateActionDate4 setEarlstPmtDt(DateFormat4Choice value) {
        this.earlstPmtDt = value;
        return this;
    }

    /**
     * Gets the value of the mktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getMktDdln() {
        return mktDdln;
    }

    /**
     * Sets the value of the mktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public CorporateActionDate4 setMktDdln(DateFormat4Choice value) {
        this.mktDdln = value;
        return this;
    }

    /**
     * Gets the value of the rspnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getRspnDdln() {
        return rspnDdln;
    }

    /**
     * Sets the value of the rspnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public CorporateActionDate4 setRspnDdln(DateFormat4Choice value) {
        this.rspnDdln = value;
        return this;
    }

    /**
     * Gets the value of the ddlnToSplt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getDdlnToSplt() {
        return ddlnToSplt;
    }

    /**
     * Sets the value of the ddlnToSplt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public CorporateActionDate4 setDdlnToSplt(DateFormat4Choice value) {
        this.ddlnToSplt = value;
        return this;
    }

    /**
     * Gets the value of the xpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getXpryDt() {
        return xpryDt;
    }

    /**
     * Sets the value of the xpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public CorporateActionDate4 setXpryDt(DateFormat4Choice value) {
        this.xpryDt = value;
        return this;
    }

    /**
     * Gets the value of the qtnSetngDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getQtnSetngDt() {
        return qtnSetngDt;
    }

    /**
     * Sets the value of the qtnSetngDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public CorporateActionDate4 setQtnSetngDt(DateFormat4Choice value) {
        this.qtnSetngDt = value;
        return this;
    }

    /**
     * Gets the value of the sbcptCostDbtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getSbcptCostDbtDt() {
        return sbcptCostDbtDt;
    }

    /**
     * Sets the value of the sbcptCostDbtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public CorporateActionDate4 setSbcptCostDbtDt(DateFormat4Choice value) {
        this.sbcptCostDbtDt = value;
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
