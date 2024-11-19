
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
 * Calculation of the current situation of a baseline as a result of the submission of a commercial data set.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineItem8", propOrder = {
    "lineItmDtls",
    "ordrdLineItmsTtlAmt",
    "accptdLineItmsTtlAmt",
    "outsdngLineItmsTtlAmt",
    "pdgLineItmsTtlAmt",
    "ordrdTtlNetAmt",
    "accptdTtlNetAmt",
    "outsdngTtlNetAmt",
    "pdgTtlNetAmt"
})
public class LineItem8 {

    @XmlElement(name = "LineItmDtls", required = true)
    protected List<LineItemDetails8> lineItmDtls;
    @XmlElement(name = "OrdrdLineItmsTtlAmt", required = true)
    protected CurrencyAndAmount ordrdLineItmsTtlAmt;
    @XmlElement(name = "AccptdLineItmsTtlAmt", required = true)
    protected CurrencyAndAmount accptdLineItmsTtlAmt;
    @XmlElement(name = "OutsdngLineItmsTtlAmt", required = true)
    protected CurrencyAndAmount outsdngLineItmsTtlAmt;
    @XmlElement(name = "PdgLineItmsTtlAmt", required = true)
    protected CurrencyAndAmount pdgLineItmsTtlAmt;
    @XmlElement(name = "OrdrdTtlNetAmt", required = true)
    protected CurrencyAndAmount ordrdTtlNetAmt;
    @XmlElement(name = "AccptdTtlNetAmt", required = true)
    protected CurrencyAndAmount accptdTtlNetAmt;
    @XmlElement(name = "OutsdngTtlNetAmt", required = true)
    protected CurrencyAndAmount outsdngTtlNetAmt;
    @XmlElement(name = "PdgTtlNetAmt", required = true)
    protected CurrencyAndAmount pdgTtlNetAmt;

    /**
     * Gets the value of the lineItmDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lineItmDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineItmDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineItemDetails8 }
     * 
     * 
     * @return
     *     The value of the lineItmDtls property.
     */
    public List<LineItemDetails8> getLineItmDtls() {
        if (lineItmDtls == null) {
            lineItmDtls = new ArrayList<>();
        }
        return this.lineItmDtls;
    }

    /**
     * Gets the value of the ordrdLineItmsTtlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getOrdrdLineItmsTtlAmt() {
        return ordrdLineItmsTtlAmt;
    }

    /**
     * Sets the value of the ordrdLineItmsTtlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public LineItem8 setOrdrdLineItmsTtlAmt(CurrencyAndAmount value) {
        this.ordrdLineItmsTtlAmt = value;
        return this;
    }

    /**
     * Gets the value of the accptdLineItmsTtlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getAccptdLineItmsTtlAmt() {
        return accptdLineItmsTtlAmt;
    }

    /**
     * Sets the value of the accptdLineItmsTtlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public LineItem8 setAccptdLineItmsTtlAmt(CurrencyAndAmount value) {
        this.accptdLineItmsTtlAmt = value;
        return this;
    }

    /**
     * Gets the value of the outsdngLineItmsTtlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getOutsdngLineItmsTtlAmt() {
        return outsdngLineItmsTtlAmt;
    }

    /**
     * Sets the value of the outsdngLineItmsTtlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public LineItem8 setOutsdngLineItmsTtlAmt(CurrencyAndAmount value) {
        this.outsdngLineItmsTtlAmt = value;
        return this;
    }

    /**
     * Gets the value of the pdgLineItmsTtlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getPdgLineItmsTtlAmt() {
        return pdgLineItmsTtlAmt;
    }

    /**
     * Sets the value of the pdgLineItmsTtlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public LineItem8 setPdgLineItmsTtlAmt(CurrencyAndAmount value) {
        this.pdgLineItmsTtlAmt = value;
        return this;
    }

    /**
     * Gets the value of the ordrdTtlNetAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getOrdrdTtlNetAmt() {
        return ordrdTtlNetAmt;
    }

    /**
     * Sets the value of the ordrdTtlNetAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public LineItem8 setOrdrdTtlNetAmt(CurrencyAndAmount value) {
        this.ordrdTtlNetAmt = value;
        return this;
    }

    /**
     * Gets the value of the accptdTtlNetAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getAccptdTtlNetAmt() {
        return accptdTtlNetAmt;
    }

    /**
     * Sets the value of the accptdTtlNetAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public LineItem8 setAccptdTtlNetAmt(CurrencyAndAmount value) {
        this.accptdTtlNetAmt = value;
        return this;
    }

    /**
     * Gets the value of the outsdngTtlNetAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getOutsdngTtlNetAmt() {
        return outsdngTtlNetAmt;
    }

    /**
     * Sets the value of the outsdngTtlNetAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public LineItem8 setOutsdngTtlNetAmt(CurrencyAndAmount value) {
        this.outsdngTtlNetAmt = value;
        return this;
    }

    /**
     * Gets the value of the pdgTtlNetAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getPdgTtlNetAmt() {
        return pdgTtlNetAmt;
    }

    /**
     * Sets the value of the pdgTtlNetAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public LineItem8 setPdgTtlNetAmt(CurrencyAndAmount value) {
        this.pdgTtlNetAmt = value;
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
     * Adds a new item to the lineItmDtls list.
     * @see #getLineItmDtls()
     * 
     */
    public LineItem8 addLineItmDtls(LineItemDetails8 lineItmDtls) {
        getLineItmDtls().add(lineItmDtls);
        return this;
    }

}
