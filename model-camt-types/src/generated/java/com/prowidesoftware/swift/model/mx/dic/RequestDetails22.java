
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
 * Details of the request providing the changes and references of the instruction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestDetails22", propOrder = {
    "ref",
    "lkg",
    "prty",
    "othrPrcg",
    "prtlSttlmInd",
    "clrChanl",
    "lnkgs"
})
public class RequestDetails22 {

    @XmlElement(name = "Ref", required = true)
    protected References14 ref;
    @XmlElement(name = "Lkg")
    protected LinkageType3Choice lkg;
    @XmlElement(name = "Prty")
    protected PriorityNumeric4Choice prty;
    @XmlElement(name = "OthrPrcg")
    protected List<GenericIdentification30> othrPrcg;
    @XmlElement(name = "PrtlSttlmInd")
    protected Boolean prtlSttlmInd;
    @XmlElement(name = "ClrChanl")
    @XmlSchemaType(name = "string")
    protected ClearingChannel2Code clrChanl;
    @XmlElement(name = "Lnkgs")
    protected List<Linkages57> lnkgs;

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link References14 }
     *     
     */
    public References14 getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link References14 }
     *     
     */
    public RequestDetails22 setRef(References14 value) {
        this.ref = value;
        return this;
    }

    /**
     * Gets the value of the lkg property.
     * 
     * @return
     *     possible object is
     *     {@link LinkageType3Choice }
     *     
     */
    public LinkageType3Choice getLkg() {
        return lkg;
    }

    /**
     * Sets the value of the lkg property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkageType3Choice }
     *     
     */
    public RequestDetails22 setLkg(LinkageType3Choice value) {
        this.lkg = value;
        return this;
    }

    /**
     * Gets the value of the prty property.
     * 
     * @return
     *     possible object is
     *     {@link PriorityNumeric4Choice }
     *     
     */
    public PriorityNumeric4Choice getPrty() {
        return prty;
    }

    /**
     * Sets the value of the prty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorityNumeric4Choice }
     *     
     */
    public RequestDetails22 setPrty(PriorityNumeric4Choice value) {
        this.prty = value;
        return this;
    }

    /**
     * Gets the value of the othrPrcg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othrPrcg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrPrcg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericIdentification30 }
     * 
     * 
     * @return
     *     The value of the othrPrcg property.
     */
    public List<GenericIdentification30> getOthrPrcg() {
        if (othrPrcg == null) {
            othrPrcg = new ArrayList<>();
        }
        return this.othrPrcg;
    }

    /**
     * Gets the value of the prtlSttlmInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrtlSttlmInd() {
        return prtlSttlmInd;
    }

    /**
     * Sets the value of the prtlSttlmInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public RequestDetails22 setPrtlSttlmInd(Boolean value) {
        this.prtlSttlmInd = value;
        return this;
    }

    /**
     * Gets the value of the clrChanl property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingChannel2Code }
     *     
     */
    public ClearingChannel2Code getClrChanl() {
        return clrChanl;
    }

    /**
     * Sets the value of the clrChanl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingChannel2Code }
     *     
     */
    public RequestDetails22 setClrChanl(ClearingChannel2Code value) {
        this.clrChanl = value;
        return this;
    }

    /**
     * Gets the value of the lnkgs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lnkgs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLnkgs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Linkages57 }
     * 
     * 
     * @return
     *     The value of the lnkgs property.
     */
    public List<Linkages57> getLnkgs() {
        if (lnkgs == null) {
            lnkgs = new ArrayList<>();
        }
        return this.lnkgs;
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
     * Adds a new item to the othrPrcg list.
     * @see #getOthrPrcg()
     * 
     */
    public RequestDetails22 addOthrPrcg(GenericIdentification30 othrPrcg) {
        getOthrPrcg().add(othrPrcg);
        return this;
    }

    /**
     * Adds a new item to the lnkgs list.
     * @see #getLnkgs()
     * 
     */
    public RequestDetails22 addLnkgs(Linkages57 lnkgs) {
        getLnkgs().add(lnkgs);
        return this;
    }

}
