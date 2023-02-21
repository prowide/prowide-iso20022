
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
 * Details of the settlement condition modification request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestDetails21", propOrder = {
    "ref",
    "rstrctnRef",
    "automtcBrrwg",
    "rtnInd",
    "lkg",
    "prty",
    "othrPrcg",
    "prtlSttlmInd",
    "sctiesRTGS",
    "hldInd",
    "mtchgDnl",
    "unltrlSplt",
    "lnkgs"
})
public class RequestDetails21 {

    @XmlElement(name = "Ref", required = true)
    protected References24 ref;
    @XmlElement(name = "RstrctnRef")
    protected List<RestrictionIdentification2> rstrctnRef;
    @XmlElement(name = "AutomtcBrrwg")
    protected AutomaticBorrowing11Choice automtcBrrwg;
    @XmlElement(name = "RtnInd")
    protected Boolean rtnInd;
    @XmlElement(name = "Lkg")
    protected LinkageType4Choice lkg;
    @XmlElement(name = "Prty")
    protected PriorityNumeric5Choice prty;
    @XmlElement(name = "OthrPrcg")
    protected List<GenericIdentification47> othrPrcg;
    @XmlElement(name = "PrtlSttlmInd")
    @XmlSchemaType(name = "string")
    protected SettlementTransactionCondition5Code prtlSttlmInd;
    @XmlElement(name = "SctiesRTGS")
    protected SecuritiesRTGS5Choice sctiesRTGS;
    @XmlElement(name = "HldInd")
    protected HoldIndicator7 hldInd;
    @XmlElement(name = "MtchgDnl")
    protected MatchingDenied4Choice mtchgDnl;
    @XmlElement(name = "UnltrlSplt")
    protected UnilateralSplit4Choice unltrlSplt;
    @XmlElement(name = "Lnkgs")
    protected List<Linkages56> lnkgs;

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link References24 }
     *     
     */
    public References24 getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link References24 }
     *     
     */
    public RequestDetails21 setRef(References24 value) {
        this.ref = value;
        return this;
    }

    /**
     * Gets the value of the rstrctnRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rstrctnRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRstrctnRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RestrictionIdentification2 }
     * 
     * 
     */
    public List<RestrictionIdentification2> getRstrctnRef() {
        if (rstrctnRef == null) {
            rstrctnRef = new ArrayList<RestrictionIdentification2>();
        }
        return this.rstrctnRef;
    }

    /**
     * Gets the value of the automtcBrrwg property.
     * 
     * @return
     *     possible object is
     *     {@link AutomaticBorrowing11Choice }
     *     
     */
    public AutomaticBorrowing11Choice getAutomtcBrrwg() {
        return automtcBrrwg;
    }

    /**
     * Sets the value of the automtcBrrwg property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutomaticBorrowing11Choice }
     *     
     */
    public RequestDetails21 setAutomtcBrrwg(AutomaticBorrowing11Choice value) {
        this.automtcBrrwg = value;
        return this;
    }

    /**
     * Gets the value of the rtnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRtnInd() {
        return rtnInd;
    }

    /**
     * Sets the value of the rtnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public RequestDetails21 setRtnInd(Boolean value) {
        this.rtnInd = value;
        return this;
    }

    /**
     * Gets the value of the lkg property.
     * 
     * @return
     *     possible object is
     *     {@link LinkageType4Choice }
     *     
     */
    public LinkageType4Choice getLkg() {
        return lkg;
    }

    /**
     * Sets the value of the lkg property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkageType4Choice }
     *     
     */
    public RequestDetails21 setLkg(LinkageType4Choice value) {
        this.lkg = value;
        return this;
    }

    /**
     * Gets the value of the prty property.
     * 
     * @return
     *     possible object is
     *     {@link PriorityNumeric5Choice }
     *     
     */
    public PriorityNumeric5Choice getPrty() {
        return prty;
    }

    /**
     * Sets the value of the prty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorityNumeric5Choice }
     *     
     */
    public RequestDetails21 setPrty(PriorityNumeric5Choice value) {
        this.prty = value;
        return this;
    }

    /**
     * Gets the value of the othrPrcg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the othrPrcg property.
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
     * {@link GenericIdentification47 }
     * 
     * 
     */
    public List<GenericIdentification47> getOthrPrcg() {
        if (othrPrcg == null) {
            othrPrcg = new ArrayList<GenericIdentification47>();
        }
        return this.othrPrcg;
    }

    /**
     * Gets the value of the prtlSttlmInd property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTransactionCondition5Code }
     *     
     */
    public SettlementTransactionCondition5Code getPrtlSttlmInd() {
        return prtlSttlmInd;
    }

    /**
     * Sets the value of the prtlSttlmInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTransactionCondition5Code }
     *     
     */
    public RequestDetails21 setPrtlSttlmInd(SettlementTransactionCondition5Code value) {
        this.prtlSttlmInd = value;
        return this;
    }

    /**
     * Gets the value of the sctiesRTGS property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesRTGS5Choice }
     *     
     */
    public SecuritiesRTGS5Choice getSctiesRTGS() {
        return sctiesRTGS;
    }

    /**
     * Sets the value of the sctiesRTGS property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesRTGS5Choice }
     *     
     */
    public RequestDetails21 setSctiesRTGS(SecuritiesRTGS5Choice value) {
        this.sctiesRTGS = value;
        return this;
    }

    /**
     * Gets the value of the hldInd property.
     * 
     * @return
     *     possible object is
     *     {@link HoldIndicator7 }
     *     
     */
    public HoldIndicator7 getHldInd() {
        return hldInd;
    }

    /**
     * Sets the value of the hldInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link HoldIndicator7 }
     *     
     */
    public RequestDetails21 setHldInd(HoldIndicator7 value) {
        this.hldInd = value;
        return this;
    }

    /**
     * Gets the value of the mtchgDnl property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingDenied4Choice }
     *     
     */
    public MatchingDenied4Choice getMtchgDnl() {
        return mtchgDnl;
    }

    /**
     * Sets the value of the mtchgDnl property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingDenied4Choice }
     *     
     */
    public RequestDetails21 setMtchgDnl(MatchingDenied4Choice value) {
        this.mtchgDnl = value;
        return this;
    }

    /**
     * Gets the value of the unltrlSplt property.
     * 
     * @return
     *     possible object is
     *     {@link UnilateralSplit4Choice }
     *     
     */
    public UnilateralSplit4Choice getUnltrlSplt() {
        return unltrlSplt;
    }

    /**
     * Sets the value of the unltrlSplt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnilateralSplit4Choice }
     *     
     */
    public RequestDetails21 setUnltrlSplt(UnilateralSplit4Choice value) {
        this.unltrlSplt = value;
        return this;
    }

    /**
     * Gets the value of the lnkgs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lnkgs property.
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
     * {@link Linkages56 }
     * 
     * 
     */
    public List<Linkages56> getLnkgs() {
        if (lnkgs == null) {
            lnkgs = new ArrayList<Linkages56>();
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
     * Adds a new item to the rstrctnRef list.
     * @see #getRstrctnRef()
     * 
     */
    public RequestDetails21 addRstrctnRef(RestrictionIdentification2 rstrctnRef) {
        getRstrctnRef().add(rstrctnRef);
        return this;
    }

    /**
     * Adds a new item to the othrPrcg list.
     * @see #getOthrPrcg()
     * 
     */
    public RequestDetails21 addOthrPrcg(GenericIdentification47 othrPrcg) {
        getOthrPrcg().add(othrPrcg);
        return this;
    }

    /**
     * Adds a new item to the lnkgs list.
     * @see #getLnkgs()
     * 
     */
    public RequestDetails21 addLnkgs(Linkages56 lnkgs) {
        getLnkgs().add(lnkgs);
        return this;
    }

}
