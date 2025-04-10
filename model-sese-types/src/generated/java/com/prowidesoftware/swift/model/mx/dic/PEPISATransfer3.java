
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
 * Describes the type of product and the assets to be transferred.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PEPISATransfer3", propOrder = {
    "mstrRef",
    "trfId",
    "rsdlCshInd",
    "isa",
    "pep",
    "prtfl",
    "finInstrmAsstForTrf"
})
public class PEPISATransfer3 {

    @XmlElement(name = "MstrRef")
    protected String mstrRef;
    @XmlElement(name = "TrfId", required = true)
    protected String trfId;
    @XmlElement(name = "RsdlCshInd")
    protected boolean rsdlCshInd;
    @XmlElement(name = "ISA")
    protected ISAYearsOfIssue1 isa;
    @XmlElement(name = "PEP")
    protected PreviousYearChoice pep;
    @XmlElement(name = "Prtfl")
    protected Portfolio1 prtfl;
    @XmlElement(name = "FinInstrmAsstForTrf")
    protected List<FinancialInstrument11> finInstrmAsstForTrf;

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
    public PEPISATransfer3 setMstrRef(String value) {
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
    public PEPISATransfer3 setTrfId(String value) {
        this.trfId = value;
        return this;
    }

    /**
     * Gets the value of the rsdlCshInd property.
     * 
     */
    public boolean isRsdlCshInd() {
        return rsdlCshInd;
    }

    /**
     * Sets the value of the rsdlCshInd property.
     * 
     */
    public PEPISATransfer3 setRsdlCshInd(boolean value) {
        this.rsdlCshInd = value;
        return this;
    }

    /**
     * Gets the value of the isa property.
     * 
     * @return
     *     possible object is
     *     {@link ISAYearsOfIssue1 }
     *     
     */
    public ISAYearsOfIssue1 getISA() {
        return isa;
    }

    /**
     * Sets the value of the isa property.
     * 
     * @param value
     *     allowed object is
     *     {@link ISAYearsOfIssue1 }
     *     
     */
    public PEPISATransfer3 setISA(ISAYearsOfIssue1 value) {
        this.isa = value;
        return this;
    }

    /**
     * Gets the value of the pep property.
     * 
     * @return
     *     possible object is
     *     {@link PreviousYearChoice }
     *     
     */
    public PreviousYearChoice getPEP() {
        return pep;
    }

    /**
     * Sets the value of the pep property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviousYearChoice }
     *     
     */
    public PEPISATransfer3 setPEP(PreviousYearChoice value) {
        this.pep = value;
        return this;
    }

    /**
     * Gets the value of the prtfl property.
     * 
     * @return
     *     possible object is
     *     {@link Portfolio1 }
     *     
     */
    public Portfolio1 getPrtfl() {
        return prtfl;
    }

    /**
     * Sets the value of the prtfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Portfolio1 }
     *     
     */
    public PEPISATransfer3 setPrtfl(Portfolio1 value) {
        this.prtfl = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmAsstForTrf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the finInstrmAsstForTrf property.
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
     * {@link FinancialInstrument11 }
     * 
     * 
     * @return
     *     The value of the finInstrmAsstForTrf property.
     */
    public List<FinancialInstrument11> getFinInstrmAsstForTrf() {
        if (finInstrmAsstForTrf == null) {
            finInstrmAsstForTrf = new ArrayList<>();
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
    public PEPISATransfer3 addFinInstrmAsstForTrf(FinancialInstrument11 finInstrmAsstForTrf) {
        getFinInstrmAsstForTrf().add(finInstrmAsstForTrf);
        return this;
    }

}
