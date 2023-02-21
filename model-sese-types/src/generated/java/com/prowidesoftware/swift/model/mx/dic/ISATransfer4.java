
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Describes the type of product and the assets to be transferred.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ISATransfer4", propOrder = {
    "mstrRef",
    "trfId",
    "rsdlCsh",
    "prtfl",
    "allOthrCsh",
    "finInstrmAsstForTrf"
})
public class ISATransfer4 {

    @XmlElement(name = "MstrRef")
    protected String mstrRef;
    @XmlElement(name = "TrfId", required = true)
    protected String trfId;
    @XmlElement(name = "RsdlCsh")
    @XmlSchemaType(name = "string")
    protected ResidualCash1Code rsdlCsh;
    @XmlElement(name = "Prtfl", required = true)
    protected ISAPortfolio1Choice prtfl;
    @XmlElement(name = "AllOthrCsh")
    protected boolean allOthrCsh;
    @XmlElement(name = "FinInstrmAsstForTrf")
    protected List<FinancialInstrument26> finInstrmAsstForTrf;

    /**
     * Gets the value of the mstrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMstrRef() {
        return mstrRef;
    }

    /**
     * Sets the value of the mstrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ISATransfer4 setMstrRef(String value) {
        this.mstrRef = value;
        return this;
    }

    /**
     * Gets the value of the trfId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrfId() {
        return trfId;
    }

    /**
     * Sets the value of the trfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ISATransfer4 setTrfId(String value) {
        this.trfId = value;
        return this;
    }

    /**
     * Gets the value of the rsdlCsh property.
     * 
     * @return
     *     possible object is
     *     {@link ResidualCash1Code }
     *     
     */
    public ResidualCash1Code getRsdlCsh() {
        return rsdlCsh;
    }

    /**
     * Sets the value of the rsdlCsh property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidualCash1Code }
     *     
     */
    public ISATransfer4 setRsdlCsh(ResidualCash1Code value) {
        this.rsdlCsh = value;
        return this;
    }

    /**
     * Gets the value of the prtfl property.
     * 
     * @return
     *     possible object is
     *     {@link ISAPortfolio1Choice }
     *     
     */
    public ISAPortfolio1Choice getPrtfl() {
        return prtfl;
    }

    /**
     * Sets the value of the prtfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ISAPortfolio1Choice }
     *     
     */
    public ISATransfer4 setPrtfl(ISAPortfolio1Choice value) {
        this.prtfl = value;
        return this;
    }

    /**
     * Gets the value of the allOthrCsh property.
     * 
     */
    public boolean isAllOthrCsh() {
        return allOthrCsh;
    }

    /**
     * Sets the value of the allOthrCsh property.
     * 
     */
    public ISATransfer4 setAllOthrCsh(boolean value) {
        this.allOthrCsh = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmAsstForTrf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the finInstrmAsstForTrf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinInstrmAsstForTrf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialInstrument26 }
     * 
     * 
     */
    public List<FinancialInstrument26> getFinInstrmAsstForTrf() {
        if (finInstrmAsstForTrf == null) {
            finInstrmAsstForTrf = new ArrayList<FinancialInstrument26>();
        }
        return this.finInstrmAsstForTrf;
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
     * Adds a new item to the finInstrmAsstForTrf list.
     * @see #getFinInstrmAsstForTrf()
     * 
     */
    public ISATransfer4 addFinInstrmAsstForTrf(FinancialInstrument26 finInstrmAsstForTrf) {
        getFinInstrmAsstForTrf().add(finInstrmAsstForTrf);
        return this;
    }

}
