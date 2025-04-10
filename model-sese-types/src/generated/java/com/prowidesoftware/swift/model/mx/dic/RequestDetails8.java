
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
 * Details of the settlement condition modification request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestDetails8", propOrder = {
    "ref",
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
public class RequestDetails8 {

    @XmlElement(name = "Ref", required = true)
    protected References9 ref;
    @XmlElement(name = "AutomtcBrrwg")
    protected AutomaticBorrowing2Choice automtcBrrwg;
    @XmlElement(name = "RtnInd")
    protected Boolean rtnInd;
    @XmlElement(name = "Lkg")
    protected LinkageType1Choice lkg;
    @XmlElement(name = "Prty")
    protected PriorityNumeric1Choice prty;
    @XmlElement(name = "OthrPrcg")
    protected List<GenericIdentification20> othrPrcg;
    @XmlElement(name = "PrtlSttlmInd")
    @XmlSchemaType(name = "string")
    protected SettlementTransactionCondition5Code prtlSttlmInd;
    @XmlElement(name = "SctiesRTGS")
    protected SecuritiesRTGS1Choice sctiesRTGS;
    @XmlElement(name = "HldInd")
    protected HoldIndicator4 hldInd;
    @XmlElement(name = "MtchgDnl")
    protected MatchingDenied1Choice mtchgDnl;
    @XmlElement(name = "UnltrlSplt")
    protected UnilateralSplit1Choice unltrlSplt;
    @XmlElement(name = "Lnkgs")
    protected List<Linkages16> lnkgs;

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link References9 }
     *     
     */
    public References9 getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link References9 }
     *     
     */
    public RequestDetails8 setRef(References9 value) {
        this.ref = value;
        return this;
    }

    /**
     * Gets the value of the automtcBrrwg property.
     * 
     * @return
     *     possible object is
     *     {@link AutomaticBorrowing2Choice }
     *     
     */
    public AutomaticBorrowing2Choice getAutomtcBrrwg() {
        return automtcBrrwg;
    }

    /**
     * Sets the value of the automtcBrrwg property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutomaticBorrowing2Choice }
     *     
     */
    public RequestDetails8 setAutomtcBrrwg(AutomaticBorrowing2Choice value) {
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
    public RequestDetails8 setRtnInd(Boolean value) {
        this.rtnInd = value;
        return this;
    }

    /**
     * Gets the value of the lkg property.
     * 
     * @return
     *     possible object is
     *     {@link LinkageType1Choice }
     *     
     */
    public LinkageType1Choice getLkg() {
        return lkg;
    }

    /**
     * Sets the value of the lkg property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkageType1Choice }
     *     
     */
    public RequestDetails8 setLkg(LinkageType1Choice value) {
        this.lkg = value;
        return this;
    }

    /**
     * Gets the value of the prty property.
     * 
     * @return
     *     possible object is
     *     {@link PriorityNumeric1Choice }
     *     
     */
    public PriorityNumeric1Choice getPrty() {
        return prty;
    }

    /**
     * Sets the value of the prty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorityNumeric1Choice }
     *     
     */
    public RequestDetails8 setPrty(PriorityNumeric1Choice value) {
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
     * {@link GenericIdentification20 }
     * 
     * 
     */
    public List<GenericIdentification20> getOthrPrcg() {
        if (othrPrcg == null) {
            othrPrcg = new ArrayList<GenericIdentification20>();
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
    public RequestDetails8 setPrtlSttlmInd(SettlementTransactionCondition5Code value) {
        this.prtlSttlmInd = value;
        return this;
    }

    /**
     * Gets the value of the sctiesRTGS property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesRTGS1Choice }
     *     
     */
    public SecuritiesRTGS1Choice getSctiesRTGS() {
        return sctiesRTGS;
    }

    /**
     * Sets the value of the sctiesRTGS property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesRTGS1Choice }
     *     
     */
    public RequestDetails8 setSctiesRTGS(SecuritiesRTGS1Choice value) {
        this.sctiesRTGS = value;
        return this;
    }

    /**
     * Gets the value of the hldInd property.
     * 
     * @return
     *     possible object is
     *     {@link HoldIndicator4 }
     *     
     */
    public HoldIndicator4 getHldInd() {
        return hldInd;
    }

    /**
     * Sets the value of the hldInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link HoldIndicator4 }
     *     
     */
    public RequestDetails8 setHldInd(HoldIndicator4 value) {
        this.hldInd = value;
        return this;
    }

    /**
     * Gets the value of the mtchgDnl property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingDenied1Choice }
     *     
     */
    public MatchingDenied1Choice getMtchgDnl() {
        return mtchgDnl;
    }

    /**
     * Sets the value of the mtchgDnl property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingDenied1Choice }
     *     
     */
    public RequestDetails8 setMtchgDnl(MatchingDenied1Choice value) {
        this.mtchgDnl = value;
        return this;
    }

    /**
     * Gets the value of the unltrlSplt property.
     * 
     * @return
     *     possible object is
     *     {@link UnilateralSplit1Choice }
     *     
     */
    public UnilateralSplit1Choice getUnltrlSplt() {
        return unltrlSplt;
    }

    /**
     * Sets the value of the unltrlSplt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnilateralSplit1Choice }
     *     
     */
    public RequestDetails8 setUnltrlSplt(UnilateralSplit1Choice value) {
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
     * {@link Linkages16 }
     * 
     * 
     */
    public List<Linkages16> getLnkgs() {
        if (lnkgs == null) {
            lnkgs = new ArrayList<Linkages16>();
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
    public RequestDetails8 addOthrPrcg(GenericIdentification20 othrPrcg) {
        getOthrPrcg().add(othrPrcg);
        return this;
    }

    /**
     * Adds a new item to the lnkgs list.
     * @see #getLnkgs()
     * 
     */
    public RequestDetails8 addLnkgs(Linkages16 lnkgs) {
        getLnkgs().add(lnkgs);
        return this;
    }

}
