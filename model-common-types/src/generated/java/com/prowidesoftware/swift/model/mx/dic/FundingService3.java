
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Funds related service such as a payment or a transfer related to the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundingService3", propOrder = {
    "prvdr",
    "nm",
    "ref",
    "bizPurp",
    "desc",
    "fndgSrc",
    "clmCrdntls",
    "clmAssgnr"
})
public class FundingService3 {

    @XmlElement(name = "Prvdr")
    protected String prvdr;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Ref")
    protected String ref;
    @XmlElement(name = "BizPurp")
    protected String bizPurp;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "FndgSrc")
    protected List<FundingSource4> fndgSrc;
    @XmlElement(name = "ClmCrdntls")
    protected String clmCrdntls;
    @XmlElement(name = "ClmAssgnr")
    protected String clmAssgnr;

    /**
     * Gets the value of the prvdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrvdr() {
        return prvdr;
    }

    /**
     * Sets the value of the prvdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FundingService3 setPrvdr(String value) {
        this.prvdr = value;
        return this;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FundingService3 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FundingService3 setRef(String value) {
        this.ref = value;
        return this;
    }

    /**
     * Gets the value of the bizPurp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizPurp() {
        return bizPurp;
    }

    /**
     * Sets the value of the bizPurp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FundingService3 setBizPurp(String value) {
        this.bizPurp = value;
        return this;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FundingService3 setDesc(String value) {
        this.desc = value;
        return this;
    }

    /**
     * Gets the value of the fndgSrc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fndgSrc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFndgSrc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FundingSource4 }
     * 
     * 
     */
    public List<FundingSource4> getFndgSrc() {
        if (fndgSrc == null) {
            fndgSrc = new ArrayList<FundingSource4>();
        }
        return this.fndgSrc;
    }

    /**
     * Gets the value of the clmCrdntls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClmCrdntls() {
        return clmCrdntls;
    }

    /**
     * Sets the value of the clmCrdntls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FundingService3 setClmCrdntls(String value) {
        this.clmCrdntls = value;
        return this;
    }

    /**
     * Gets the value of the clmAssgnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClmAssgnr() {
        return clmAssgnr;
    }

    /**
     * Sets the value of the clmAssgnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FundingService3 setClmAssgnr(String value) {
        this.clmAssgnr = value;
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

    /**
     * Adds a new item to the fndgSrc list.
     * @see #getFndgSrc()
     * 
     */
    public FundingService3 addFndgSrc(FundingSource4 fndgSrc) {
        getFndgSrc().add(fndgSrc);
        return this;
    }

}
