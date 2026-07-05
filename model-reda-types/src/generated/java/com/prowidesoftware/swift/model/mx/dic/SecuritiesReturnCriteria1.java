
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
 * Return criteria for information to be returned in the report deriving from a query about securities reference data.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesReturnCriteria1", propOrder = {
    "finInstrmId",
    "isoSctyLngNm",
    "isoSctyShrtNm",
    "clssfctnFinInstrm",
    "mtrtyDt",
    "isseDt",
    "isseCcy",
    "ctryOfIsse",
    "sctySts",
    "invstrCSD",
    "issrCSD",
    "techIssrCSD",
    "csd",
    "sctiesQtyTp",
    "minDnmtn",
    "minMltplQty",
    "devtgSttlmUnit"
})
public class SecuritiesReturnCriteria1 {

    @XmlElement(name = "FinInstrmId")
    protected boolean finInstrmId;
    @XmlElement(name = "ISOSctyLngNm")
    protected boolean isoSctyLngNm;
    @XmlElement(name = "ISOSctyShrtNm")
    protected boolean isoSctyShrtNm;
    @XmlElement(name = "ClssfctnFinInstrm")
    protected boolean clssfctnFinInstrm;
    @XmlElement(name = "MtrtyDt")
    protected boolean mtrtyDt;
    @XmlElement(name = "IsseDt")
    protected boolean isseDt;
    @XmlElement(name = "IsseCcy")
    protected boolean isseCcy;
    @XmlElement(name = "CtryOfIsse")
    protected boolean ctryOfIsse;
    @XmlElement(name = "SctySts")
    protected boolean sctySts;
    @XmlElement(name = "InvstrCSD")
    protected boolean invstrCSD;
    @XmlElement(name = "IssrCSD")
    protected boolean issrCSD;
    @XmlElement(name = "TechIssrCSD")
    protected boolean techIssrCSD;
    @XmlElement(name = "CSD")
    protected boolean csd;
    @XmlElement(name = "SctiesQtyTp")
    protected boolean sctiesQtyTp;
    @XmlElement(name = "MinDnmtn")
    protected boolean minDnmtn;
    @XmlElement(name = "MinMltplQty")
    protected boolean minMltplQty;
    @XmlElement(name = "DevtgSttlmUnit")
    protected boolean devtgSttlmUnit;

    /**
     * Gets the value of the finInstrmId property.
     * 
     */
    public boolean isFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     */
    public SecuritiesReturnCriteria1 setFinInstrmId(boolean value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the isoSctyLngNm property.
     * 
     */
    public boolean isISOSctyLngNm() {
        return isoSctyLngNm;
    }

    /**
     * Sets the value of the isoSctyLngNm property.
     * 
     */
    public SecuritiesReturnCriteria1 setISOSctyLngNm(boolean value) {
        this.isoSctyLngNm = value;
        return this;
    }

    /**
     * Gets the value of the isoSctyShrtNm property.
     * 
     */
    public boolean isISOSctyShrtNm() {
        return isoSctyShrtNm;
    }

    /**
     * Sets the value of the isoSctyShrtNm property.
     * 
     */
    public SecuritiesReturnCriteria1 setISOSctyShrtNm(boolean value) {
        this.isoSctyShrtNm = value;
        return this;
    }

    /**
     * Gets the value of the clssfctnFinInstrm property.
     * 
     */
    public boolean isClssfctnFinInstrm() {
        return clssfctnFinInstrm;
    }

    /**
     * Sets the value of the clssfctnFinInstrm property.
     * 
     */
    public SecuritiesReturnCriteria1 setClssfctnFinInstrm(boolean value) {
        this.clssfctnFinInstrm = value;
        return this;
    }

    /**
     * Gets the value of the mtrtyDt property.
     * 
     */
    public boolean isMtrtyDt() {
        return mtrtyDt;
    }

    /**
     * Sets the value of the mtrtyDt property.
     * 
     */
    public SecuritiesReturnCriteria1 setMtrtyDt(boolean value) {
        this.mtrtyDt = value;
        return this;
    }

    /**
     * Gets the value of the isseDt property.
     * 
     */
    public boolean isIsseDt() {
        return isseDt;
    }

    /**
     * Sets the value of the isseDt property.
     * 
     */
    public SecuritiesReturnCriteria1 setIsseDt(boolean value) {
        this.isseDt = value;
        return this;
    }

    /**
     * Gets the value of the isseCcy property.
     * 
     */
    public boolean isIsseCcy() {
        return isseCcy;
    }

    /**
     * Sets the value of the isseCcy property.
     * 
     */
    public SecuritiesReturnCriteria1 setIsseCcy(boolean value) {
        this.isseCcy = value;
        return this;
    }

    /**
     * Gets the value of the ctryOfIsse property.
     * 
     */
    public boolean isCtryOfIsse() {
        return ctryOfIsse;
    }

    /**
     * Sets the value of the ctryOfIsse property.
     * 
     */
    public SecuritiesReturnCriteria1 setCtryOfIsse(boolean value) {
        this.ctryOfIsse = value;
        return this;
    }

    /**
     * Gets the value of the sctySts property.
     * 
     */
    public boolean isSctySts() {
        return sctySts;
    }

    /**
     * Sets the value of the sctySts property.
     * 
     */
    public SecuritiesReturnCriteria1 setSctySts(boolean value) {
        this.sctySts = value;
        return this;
    }

    /**
     * Gets the value of the invstrCSD property.
     * 
     */
    public boolean isInvstrCSD() {
        return invstrCSD;
    }

    /**
     * Sets the value of the invstrCSD property.
     * 
     */
    public SecuritiesReturnCriteria1 setInvstrCSD(boolean value) {
        this.invstrCSD = value;
        return this;
    }

    /**
     * Gets the value of the issrCSD property.
     * 
     */
    public boolean isIssrCSD() {
        return issrCSD;
    }

    /**
     * Sets the value of the issrCSD property.
     * 
     */
    public SecuritiesReturnCriteria1 setIssrCSD(boolean value) {
        this.issrCSD = value;
        return this;
    }

    /**
     * Gets the value of the techIssrCSD property.
     * 
     */
    public boolean isTechIssrCSD() {
        return techIssrCSD;
    }

    /**
     * Sets the value of the techIssrCSD property.
     * 
     */
    public SecuritiesReturnCriteria1 setTechIssrCSD(boolean value) {
        this.techIssrCSD = value;
        return this;
    }

    /**
     * Gets the value of the csd property.
     * 
     */
    public boolean isCSD() {
        return csd;
    }

    /**
     * Sets the value of the csd property.
     * 
     */
    public SecuritiesReturnCriteria1 setCSD(boolean value) {
        this.csd = value;
        return this;
    }

    /**
     * Gets the value of the sctiesQtyTp property.
     * 
     */
    public boolean isSctiesQtyTp() {
        return sctiesQtyTp;
    }

    /**
     * Sets the value of the sctiesQtyTp property.
     * 
     */
    public SecuritiesReturnCriteria1 setSctiesQtyTp(boolean value) {
        this.sctiesQtyTp = value;
        return this;
    }

    /**
     * Gets the value of the minDnmtn property.
     * 
     */
    public boolean isMinDnmtn() {
        return minDnmtn;
    }

    /**
     * Sets the value of the minDnmtn property.
     * 
     */
    public SecuritiesReturnCriteria1 setMinDnmtn(boolean value) {
        this.minDnmtn = value;
        return this;
    }

    /**
     * Gets the value of the minMltplQty property.
     * 
     */
    public boolean isMinMltplQty() {
        return minMltplQty;
    }

    /**
     * Sets the value of the minMltplQty property.
     * 
     */
    public SecuritiesReturnCriteria1 setMinMltplQty(boolean value) {
        this.minMltplQty = value;
        return this;
    }

    /**
     * Gets the value of the devtgSttlmUnit property.
     * 
     */
    public boolean isDevtgSttlmUnit() {
        return devtgSttlmUnit;
    }

    /**
     * Sets the value of the devtgSttlmUnit property.
     * 
     */
    public SecuritiesReturnCriteria1 setDevtgSttlmUnit(boolean value) {
        this.devtgSttlmUnit = value;
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
