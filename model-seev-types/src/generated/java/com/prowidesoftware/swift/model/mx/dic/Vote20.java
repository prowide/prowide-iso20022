
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
 * Vote results for one resolution.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vote20", propOrder = {
    "issrLabl",
    "desc",
    "rsltnSts",
    "subSts",
    "_for",
    "agnst",
    "abstn",
    "wthhld",
    "wthMgmt",
    "agnstMgmt",
    "dscrtnry",
    "oneYr",
    "twoYrs",
    "threeYrs",
    "noActn",
    "blnk",
    "prtry"
})
public class Vote20 {

    @XmlElement(name = "IssrLabl", required = true)
    protected String issrLabl;
    @XmlElement(name = "Desc")
    protected List<ItemDescription2> desc;
    @XmlElement(name = "RsltnSts", required = true)
    @XmlSchemaType(name = "string")
    protected ResolutionStatus2Code rsltnSts;
    @XmlElement(name = "SubSts")
    @XmlSchemaType(name = "string")
    protected ResolutionSubStatus1Code subSts;
    @XmlElement(name = "For")
    protected FinancialInstrumentQuantity18Choice _for;
    @XmlElement(name = "Agnst")
    protected FinancialInstrumentQuantity18Choice agnst;
    @XmlElement(name = "Abstn")
    protected FinancialInstrumentQuantity18Choice abstn;
    @XmlElement(name = "Wthhld")
    protected FinancialInstrumentQuantity18Choice wthhld;
    @XmlElement(name = "WthMgmt")
    protected FinancialInstrumentQuantity18Choice wthMgmt;
    @XmlElement(name = "AgnstMgmt")
    protected FinancialInstrumentQuantity18Choice agnstMgmt;
    @XmlElement(name = "Dscrtnry")
    protected FinancialInstrumentQuantity18Choice dscrtnry;
    @XmlElement(name = "OneYr")
    protected FinancialInstrumentQuantity18Choice oneYr;
    @XmlElement(name = "TwoYrs")
    protected FinancialInstrumentQuantity18Choice twoYrs;
    @XmlElement(name = "ThreeYrs")
    protected FinancialInstrumentQuantity18Choice threeYrs;
    @XmlElement(name = "NoActn")
    protected FinancialInstrumentQuantity18Choice noActn;
    @XmlElement(name = "Blnk")
    protected FinancialInstrumentQuantity18Choice blnk;
    @XmlElement(name = "Prtry")
    protected List<ProprietaryVote2> prtry;

    /**
     * Gets the value of the issrLabl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssrLabl() {
        return issrLabl;
    }

    /**
     * Sets the value of the issrLabl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Vote20 setIssrLabl(String value) {
        this.issrLabl = value;
        return this;
    }

    /**
     * Gets the value of the desc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the desc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDesc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemDescription2 }
     * 
     * 
     */
    public List<ItemDescription2> getDesc() {
        if (desc == null) {
            desc = new ArrayList<ItemDescription2>();
        }
        return this.desc;
    }

    /**
     * Gets the value of the rsltnSts property.
     * 
     * @return
     *     possible object is
     *     {@link ResolutionStatus2Code }
     *     
     */
    public ResolutionStatus2Code getRsltnSts() {
        return rsltnSts;
    }

    /**
     * Sets the value of the rsltnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResolutionStatus2Code }
     *     
     */
    public Vote20 setRsltnSts(ResolutionStatus2Code value) {
        this.rsltnSts = value;
        return this;
    }

    /**
     * Gets the value of the subSts property.
     * 
     * @return
     *     possible object is
     *     {@link ResolutionSubStatus1Code }
     *     
     */
    public ResolutionSubStatus1Code getSubSts() {
        return subSts;
    }

    /**
     * Sets the value of the subSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResolutionSubStatus1Code }
     *     
     */
    public Vote20 setSubSts(ResolutionSubStatus1Code value) {
        this.subSts = value;
        return this;
    }

    /**
     * Gets the value of the for property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public FinancialInstrumentQuantity18Choice getFor() {
        return _for;
    }

    /**
     * Sets the value of the for property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public Vote20 setFor(FinancialInstrumentQuantity18Choice value) {
        this._for = value;
        return this;
    }

    /**
     * Gets the value of the agnst property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public FinancialInstrumentQuantity18Choice getAgnst() {
        return agnst;
    }

    /**
     * Sets the value of the agnst property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public Vote20 setAgnst(FinancialInstrumentQuantity18Choice value) {
        this.agnst = value;
        return this;
    }

    /**
     * Gets the value of the abstn property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public FinancialInstrumentQuantity18Choice getAbstn() {
        return abstn;
    }

    /**
     * Sets the value of the abstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public Vote20 setAbstn(FinancialInstrumentQuantity18Choice value) {
        this.abstn = value;
        return this;
    }

    /**
     * Gets the value of the wthhld property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public FinancialInstrumentQuantity18Choice getWthhld() {
        return wthhld;
    }

    /**
     * Sets the value of the wthhld property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public Vote20 setWthhld(FinancialInstrumentQuantity18Choice value) {
        this.wthhld = value;
        return this;
    }

    /**
     * Gets the value of the wthMgmt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public FinancialInstrumentQuantity18Choice getWthMgmt() {
        return wthMgmt;
    }

    /**
     * Sets the value of the wthMgmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public Vote20 setWthMgmt(FinancialInstrumentQuantity18Choice value) {
        this.wthMgmt = value;
        return this;
    }

    /**
     * Gets the value of the agnstMgmt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public FinancialInstrumentQuantity18Choice getAgnstMgmt() {
        return agnstMgmt;
    }

    /**
     * Sets the value of the agnstMgmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public Vote20 setAgnstMgmt(FinancialInstrumentQuantity18Choice value) {
        this.agnstMgmt = value;
        return this;
    }

    /**
     * Gets the value of the dscrtnry property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public FinancialInstrumentQuantity18Choice getDscrtnry() {
        return dscrtnry;
    }

    /**
     * Sets the value of the dscrtnry property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public Vote20 setDscrtnry(FinancialInstrumentQuantity18Choice value) {
        this.dscrtnry = value;
        return this;
    }

    /**
     * Gets the value of the oneYr property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public FinancialInstrumentQuantity18Choice getOneYr() {
        return oneYr;
    }

    /**
     * Sets the value of the oneYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public Vote20 setOneYr(FinancialInstrumentQuantity18Choice value) {
        this.oneYr = value;
        return this;
    }

    /**
     * Gets the value of the twoYrs property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public FinancialInstrumentQuantity18Choice getTwoYrs() {
        return twoYrs;
    }

    /**
     * Sets the value of the twoYrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public Vote20 setTwoYrs(FinancialInstrumentQuantity18Choice value) {
        this.twoYrs = value;
        return this;
    }

    /**
     * Gets the value of the threeYrs property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public FinancialInstrumentQuantity18Choice getThreeYrs() {
        return threeYrs;
    }

    /**
     * Sets the value of the threeYrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public Vote20 setThreeYrs(FinancialInstrumentQuantity18Choice value) {
        this.threeYrs = value;
        return this;
    }

    /**
     * Gets the value of the noActn property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public FinancialInstrumentQuantity18Choice getNoActn() {
        return noActn;
    }

    /**
     * Sets the value of the noActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public Vote20 setNoActn(FinancialInstrumentQuantity18Choice value) {
        this.noActn = value;
        return this;
    }

    /**
     * Gets the value of the blnk property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public FinancialInstrumentQuantity18Choice getBlnk() {
        return blnk;
    }

    /**
     * Sets the value of the blnk property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public Vote20 setBlnk(FinancialInstrumentQuantity18Choice value) {
        this.blnk = value;
        return this;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prtry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrtry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProprietaryVote2 }
     * 
     * 
     */
    public List<ProprietaryVote2> getPrtry() {
        if (prtry == null) {
            prtry = new ArrayList<ProprietaryVote2>();
        }
        return this.prtry;
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

    /**
     * Adds a new item to the desc list.
     * @see #getDesc()
     * 
     */
    public Vote20 addDesc(ItemDescription2 desc) {
        getDesc().add(desc);
        return this;
    }

    /**
     * Adds a new item to the prtry list.
     * @see #getPrtry()
     * 
     */
    public Vote20 addPrtry(ProprietaryVote2 prtry) {
        getPrtry().add(prtry);
        return this;
    }

}
