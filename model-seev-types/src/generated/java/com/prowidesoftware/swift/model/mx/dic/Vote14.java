
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Vote expressed for one resolution.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vote14", propOrder = {
    "issrLabl",
    "listgGrpRsltnLabl",
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
public class Vote14 {

    @XmlElement(name = "IssrLabl", required = true)
    protected String issrLabl;
    @XmlElement(name = "ListgGrpRsltnLabl")
    protected String listgGrpRsltnLabl;
    @XmlElement(name = "For")
    protected QuantityOrCode1Choice _for;
    @XmlElement(name = "Agnst")
    protected QuantityOrCode1Choice agnst;
    @XmlElement(name = "Abstn")
    protected QuantityOrCode1Choice abstn;
    @XmlElement(name = "Wthhld")
    protected QuantityOrCode1Choice wthhld;
    @XmlElement(name = "WthMgmt")
    protected QuantityOrCode1Choice wthMgmt;
    @XmlElement(name = "AgnstMgmt")
    protected QuantityOrCode1Choice agnstMgmt;
    @XmlElement(name = "Dscrtnry")
    protected QuantityOrCode1Choice dscrtnry;
    @XmlElement(name = "OneYr")
    protected QuantityOrCode1Choice oneYr;
    @XmlElement(name = "TwoYrs")
    protected QuantityOrCode1Choice twoYrs;
    @XmlElement(name = "ThreeYrs")
    protected QuantityOrCode1Choice threeYrs;
    @XmlElement(name = "NoActn")
    protected QuantityOrCode1Choice noActn;
    @XmlElement(name = "Blnk")
    protected QuantityOrCode1Choice blnk;
    @XmlElement(name = "Prtry")
    protected List<ProprietaryVote1> prtry;

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
    public Vote14 setIssrLabl(String value) {
        this.issrLabl = value;
        return this;
    }

    /**
     * Gets the value of the listgGrpRsltnLabl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListgGrpRsltnLabl() {
        return listgGrpRsltnLabl;
    }

    /**
     * Sets the value of the listgGrpRsltnLabl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Vote14 setListgGrpRsltnLabl(String value) {
        this.listgGrpRsltnLabl = value;
        return this;
    }

    /**
     * Gets the value of the for property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityOrCode1Choice }
     *     
     */
    public QuantityOrCode1Choice getFor() {
        return _for;
    }

    /**
     * Sets the value of the for property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityOrCode1Choice }
     *     
     */
    public Vote14 setFor(QuantityOrCode1Choice value) {
        this._for = value;
        return this;
    }

    /**
     * Gets the value of the agnst property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityOrCode1Choice }
     *     
     */
    public QuantityOrCode1Choice getAgnst() {
        return agnst;
    }

    /**
     * Sets the value of the agnst property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityOrCode1Choice }
     *     
     */
    public Vote14 setAgnst(QuantityOrCode1Choice value) {
        this.agnst = value;
        return this;
    }

    /**
     * Gets the value of the abstn property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityOrCode1Choice }
     *     
     */
    public QuantityOrCode1Choice getAbstn() {
        return abstn;
    }

    /**
     * Sets the value of the abstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityOrCode1Choice }
     *     
     */
    public Vote14 setAbstn(QuantityOrCode1Choice value) {
        this.abstn = value;
        return this;
    }

    /**
     * Gets the value of the wthhld property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityOrCode1Choice }
     *     
     */
    public QuantityOrCode1Choice getWthhld() {
        return wthhld;
    }

    /**
     * Sets the value of the wthhld property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityOrCode1Choice }
     *     
     */
    public Vote14 setWthhld(QuantityOrCode1Choice value) {
        this.wthhld = value;
        return this;
    }

    /**
     * Gets the value of the wthMgmt property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityOrCode1Choice }
     *     
     */
    public QuantityOrCode1Choice getWthMgmt() {
        return wthMgmt;
    }

    /**
     * Sets the value of the wthMgmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityOrCode1Choice }
     *     
     */
    public Vote14 setWthMgmt(QuantityOrCode1Choice value) {
        this.wthMgmt = value;
        return this;
    }

    /**
     * Gets the value of the agnstMgmt property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityOrCode1Choice }
     *     
     */
    public QuantityOrCode1Choice getAgnstMgmt() {
        return agnstMgmt;
    }

    /**
     * Sets the value of the agnstMgmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityOrCode1Choice }
     *     
     */
    public Vote14 setAgnstMgmt(QuantityOrCode1Choice value) {
        this.agnstMgmt = value;
        return this;
    }

    /**
     * Gets the value of the dscrtnry property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityOrCode1Choice }
     *     
     */
    public QuantityOrCode1Choice getDscrtnry() {
        return dscrtnry;
    }

    /**
     * Sets the value of the dscrtnry property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityOrCode1Choice }
     *     
     */
    public Vote14 setDscrtnry(QuantityOrCode1Choice value) {
        this.dscrtnry = value;
        return this;
    }

    /**
     * Gets the value of the oneYr property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityOrCode1Choice }
     *     
     */
    public QuantityOrCode1Choice getOneYr() {
        return oneYr;
    }

    /**
     * Sets the value of the oneYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityOrCode1Choice }
     *     
     */
    public Vote14 setOneYr(QuantityOrCode1Choice value) {
        this.oneYr = value;
        return this;
    }

    /**
     * Gets the value of the twoYrs property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityOrCode1Choice }
     *     
     */
    public QuantityOrCode1Choice getTwoYrs() {
        return twoYrs;
    }

    /**
     * Sets the value of the twoYrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityOrCode1Choice }
     *     
     */
    public Vote14 setTwoYrs(QuantityOrCode1Choice value) {
        this.twoYrs = value;
        return this;
    }

    /**
     * Gets the value of the threeYrs property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityOrCode1Choice }
     *     
     */
    public QuantityOrCode1Choice getThreeYrs() {
        return threeYrs;
    }

    /**
     * Sets the value of the threeYrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityOrCode1Choice }
     *     
     */
    public Vote14 setThreeYrs(QuantityOrCode1Choice value) {
        this.threeYrs = value;
        return this;
    }

    /**
     * Gets the value of the noActn property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityOrCode1Choice }
     *     
     */
    public QuantityOrCode1Choice getNoActn() {
        return noActn;
    }

    /**
     * Sets the value of the noActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityOrCode1Choice }
     *     
     */
    public Vote14 setNoActn(QuantityOrCode1Choice value) {
        this.noActn = value;
        return this;
    }

    /**
     * Gets the value of the blnk property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityOrCode1Choice }
     *     
     */
    public QuantityOrCode1Choice getBlnk() {
        return blnk;
    }

    /**
     * Sets the value of the blnk property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityOrCode1Choice }
     *     
     */
    public Vote14 setBlnk(QuantityOrCode1Choice value) {
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
     * {@link ProprietaryVote1 }
     * 
     * 
     */
    public List<ProprietaryVote1> getPrtry() {
        if (prtry == null) {
            prtry = new ArrayList<ProprietaryVote1>();
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
     * Adds a new item to the prtry list.
     * @see #getPrtry()
     * 
     */
    public Vote14 addPrtry(ProprietaryVote1 prtry) {
        getPrtry().add(prtry);
        return this;
    }

}
