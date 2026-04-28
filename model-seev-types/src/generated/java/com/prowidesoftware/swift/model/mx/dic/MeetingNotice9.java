
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Information about a meeting, participation requirements and voting procedures.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingNotice9", propOrder = {
    "mtgId",
    "issrMtgId",
    "tp",
    "clssfctn",
    "anncmntDt",
    "oneManOneVoteInd",
    "prtcptn",
    "attndnc",
    "addtlDcmnttnURLAdr",
    "evtPrcgWebSiteAdr",
    "addtlPrcdrDtls",
    "ttlNbOfSctiesOutsdng",
    "ttlNbOfVtngRghts",
    "prxyAppntmntNtfctnAdr",
    "prxyChc",
    "ctctPrsnDtls",
    "rsltPblctnDt",
    "sctiesBlckgPrdEndDt",
    "entitlmntFxgDt",
    "regnSctiesDdln",
    "regnSctiesMktDdln",
    "enrlmntMktDdln",
    "enrlmntDdln"
})
public class MeetingNotice9 {

    @XmlElement(name = "MtgId", required = true)
    protected String mtgId;
    @XmlElement(name = "IssrMtgId")
    protected String issrMtgId;
    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected MeetingType4Code tp;
    @XmlElement(name = "Clssfctn")
    protected MeetingTypeClassification2Choice clssfctn;
    @XmlElement(name = "AnncmntDt")
    protected DateAndDateTime2Choice anncmntDt;
    @XmlElement(name = "OneManOneVoteInd")
    protected Boolean oneManOneVoteInd;
    @XmlElement(name = "Prtcptn")
    protected List<ParticipationMethod2> prtcptn;
    @XmlElement(name = "Attndnc")
    protected Attendance2 attndnc;
    @XmlElement(name = "AddtlDcmnttnURLAdr")
    protected List<String> addtlDcmnttnURLAdr;
    @XmlElement(name = "EvtPrcgWebSiteAdr")
    protected String evtPrcgWebSiteAdr;
    @XmlElement(name = "AddtlPrcdrDtls")
    protected List<AdditionalRights4> addtlPrcdrDtls;
    @XmlElement(name = "TtlNbOfSctiesOutsdng")
    protected FinancialInstrumentQuantity18Choice ttlNbOfSctiesOutsdng;
    @XmlElement(name = "TtlNbOfVtngRghts")
    protected BigDecimal ttlNbOfVtngRghts;
    @XmlElement(name = "PrxyAppntmntNtfctnAdr")
    protected PostalAddress1 prxyAppntmntNtfctnAdr;
    @XmlElement(name = "PrxyChc")
    protected Proxy5Choice prxyChc;
    @XmlElement(name = "CtctPrsnDtls")
    protected List<MeetingContactPerson3> ctctPrsnDtls;
    @XmlElement(name = "RsltPblctnDt")
    protected DateFormat3Choice rsltPblctnDt;
    @XmlElement(name = "SctiesBlckgPrdEndDt")
    protected DateFormat60Choice sctiesBlckgPrdEndDt;
    @XmlElement(name = "EntitlmntFxgDt")
    protected DateFormat1 entitlmntFxgDt;
    @XmlElement(name = "RegnSctiesDdln")
    protected DateFormat58Choice regnSctiesDdln;
    @XmlElement(name = "RegnSctiesMktDdln")
    protected DateFormat58Choice regnSctiesMktDdln;
    @XmlElement(name = "EnrlmntMktDdln")
    protected DateFormat58Choice enrlmntMktDdln;
    @XmlElement(name = "EnrlmntDdln")
    protected DateFormat58Choice enrlmntDdln;

    /**
     * Gets the value of the mtgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtgId() {
        return mtgId;
    }

    /**
     * Sets the value of the mtgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MeetingNotice9 setMtgId(String value) {
        this.mtgId = value;
        return this;
    }

    /**
     * Gets the value of the issrMtgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssrMtgId() {
        return issrMtgId;
    }

    /**
     * Sets the value of the issrMtgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MeetingNotice9 setIssrMtgId(String value) {
        this.issrMtgId = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingType4Code }
     *     
     */
    public MeetingType4Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingType4Code }
     *     
     */
    public MeetingNotice9 setTp(MeetingType4Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the clssfctn property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingTypeClassification2Choice }
     *     
     */
    public MeetingTypeClassification2Choice getClssfctn() {
        return clssfctn;
    }

    /**
     * Sets the value of the clssfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingTypeClassification2Choice }
     *     
     */
    public MeetingNotice9 setClssfctn(MeetingTypeClassification2Choice value) {
        this.clssfctn = value;
        return this;
    }

    /**
     * Gets the value of the anncmntDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getAnncmntDt() {
        return anncmntDt;
    }

    /**
     * Sets the value of the anncmntDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public MeetingNotice9 setAnncmntDt(DateAndDateTime2Choice value) {
        this.anncmntDt = value;
        return this;
    }

    /**
     * Gets the value of the oneManOneVoteInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOneManOneVoteInd() {
        return oneManOneVoteInd;
    }

    /**
     * Sets the value of the oneManOneVoteInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public MeetingNotice9 setOneManOneVoteInd(Boolean value) {
        this.oneManOneVoteInd = value;
        return this;
    }

    /**
     * Gets the value of the prtcptn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prtcptn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrtcptn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParticipationMethod2 }
     * 
     * 
     */
    public List<ParticipationMethod2> getPrtcptn() {
        if (prtcptn == null) {
            prtcptn = new ArrayList<ParticipationMethod2>();
        }
        return this.prtcptn;
    }

    /**
     * Gets the value of the attndnc property.
     * 
     * @return
     *     possible object is
     *     {@link Attendance2 }
     *     
     */
    public Attendance2 getAttndnc() {
        return attndnc;
    }

    /**
     * Sets the value of the attndnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attendance2 }
     *     
     */
    public MeetingNotice9 setAttndnc(Attendance2 value) {
        this.attndnc = value;
        return this;
    }

    /**
     * Gets the value of the addtlDcmnttnURLAdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlDcmnttnURLAdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlDcmnttnURLAdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAddtlDcmnttnURLAdr() {
        if (addtlDcmnttnURLAdr == null) {
            addtlDcmnttnURLAdr = new ArrayList<String>();
        }
        return this.addtlDcmnttnURLAdr;
    }

    /**
     * Gets the value of the evtPrcgWebSiteAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvtPrcgWebSiteAdr() {
        return evtPrcgWebSiteAdr;
    }

    /**
     * Sets the value of the evtPrcgWebSiteAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MeetingNotice9 setEvtPrcgWebSiteAdr(String value) {
        this.evtPrcgWebSiteAdr = value;
        return this;
    }

    /**
     * Gets the value of the addtlPrcdrDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlPrcdrDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlPrcdrDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalRights4 }
     * 
     * 
     */
    public List<AdditionalRights4> getAddtlPrcdrDtls() {
        if (addtlPrcdrDtls == null) {
            addtlPrcdrDtls = new ArrayList<AdditionalRights4>();
        }
        return this.addtlPrcdrDtls;
    }

    /**
     * Gets the value of the ttlNbOfSctiesOutsdng property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public FinancialInstrumentQuantity18Choice getTtlNbOfSctiesOutsdng() {
        return ttlNbOfSctiesOutsdng;
    }

    /**
     * Sets the value of the ttlNbOfSctiesOutsdng property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public MeetingNotice9 setTtlNbOfSctiesOutsdng(FinancialInstrumentQuantity18Choice value) {
        this.ttlNbOfSctiesOutsdng = value;
        return this;
    }

    /**
     * Gets the value of the ttlNbOfVtngRghts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNbOfVtngRghts() {
        return ttlNbOfVtngRghts;
    }

    /**
     * Sets the value of the ttlNbOfVtngRghts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public MeetingNotice9 setTtlNbOfVtngRghts(BigDecimal value) {
        this.ttlNbOfVtngRghts = value;
        return this;
    }

    /**
     * Gets the value of the prxyAppntmntNtfctnAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress1 }
     *     
     */
    public PostalAddress1 getPrxyAppntmntNtfctnAdr() {
        return prxyAppntmntNtfctnAdr;
    }

    /**
     * Sets the value of the prxyAppntmntNtfctnAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress1 }
     *     
     */
    public MeetingNotice9 setPrxyAppntmntNtfctnAdr(PostalAddress1 value) {
        this.prxyAppntmntNtfctnAdr = value;
        return this;
    }

    /**
     * Gets the value of the prxyChc property.
     * 
     * @return
     *     possible object is
     *     {@link Proxy5Choice }
     *     
     */
    public Proxy5Choice getPrxyChc() {
        return prxyChc;
    }

    /**
     * Sets the value of the prxyChc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Proxy5Choice }
     *     
     */
    public MeetingNotice9 setPrxyChc(Proxy5Choice value) {
        this.prxyChc = value;
        return this;
    }

    /**
     * Gets the value of the ctctPrsnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ctctPrsnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtctPrsnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeetingContactPerson3 }
     * 
     * 
     */
    public List<MeetingContactPerson3> getCtctPrsnDtls() {
        if (ctctPrsnDtls == null) {
            ctctPrsnDtls = new ArrayList<MeetingContactPerson3>();
        }
        return this.ctctPrsnDtls;
    }

    /**
     * Gets the value of the rsltPblctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat3Choice }
     *     
     */
    public DateFormat3Choice getRsltPblctnDt() {
        return rsltPblctnDt;
    }

    /**
     * Sets the value of the rsltPblctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat3Choice }
     *     
     */
    public MeetingNotice9 setRsltPblctnDt(DateFormat3Choice value) {
        this.rsltPblctnDt = value;
        return this;
    }

    /**
     * Gets the value of the sctiesBlckgPrdEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat60Choice }
     *     
     */
    public DateFormat60Choice getSctiesBlckgPrdEndDt() {
        return sctiesBlckgPrdEndDt;
    }

    /**
     * Sets the value of the sctiesBlckgPrdEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat60Choice }
     *     
     */
    public MeetingNotice9 setSctiesBlckgPrdEndDt(DateFormat60Choice value) {
        this.sctiesBlckgPrdEndDt = value;
        return this;
    }

    /**
     * Gets the value of the entitlmntFxgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat1 }
     *     
     */
    public DateFormat1 getEntitlmntFxgDt() {
        return entitlmntFxgDt;
    }

    /**
     * Sets the value of the entitlmntFxgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat1 }
     *     
     */
    public MeetingNotice9 setEntitlmntFxgDt(DateFormat1 value) {
        this.entitlmntFxgDt = value;
        return this;
    }

    /**
     * Gets the value of the regnSctiesDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat58Choice }
     *     
     */
    public DateFormat58Choice getRegnSctiesDdln() {
        return regnSctiesDdln;
    }

    /**
     * Sets the value of the regnSctiesDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat58Choice }
     *     
     */
    public MeetingNotice9 setRegnSctiesDdln(DateFormat58Choice value) {
        this.regnSctiesDdln = value;
        return this;
    }

    /**
     * Gets the value of the regnSctiesMktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat58Choice }
     *     
     */
    public DateFormat58Choice getRegnSctiesMktDdln() {
        return regnSctiesMktDdln;
    }

    /**
     * Sets the value of the regnSctiesMktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat58Choice }
     *     
     */
    public MeetingNotice9 setRegnSctiesMktDdln(DateFormat58Choice value) {
        this.regnSctiesMktDdln = value;
        return this;
    }

    /**
     * Gets the value of the enrlmntMktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat58Choice }
     *     
     */
    public DateFormat58Choice getEnrlmntMktDdln() {
        return enrlmntMktDdln;
    }

    /**
     * Sets the value of the enrlmntMktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat58Choice }
     *     
     */
    public MeetingNotice9 setEnrlmntMktDdln(DateFormat58Choice value) {
        this.enrlmntMktDdln = value;
        return this;
    }

    /**
     * Gets the value of the enrlmntDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat58Choice }
     *     
     */
    public DateFormat58Choice getEnrlmntDdln() {
        return enrlmntDdln;
    }

    /**
     * Sets the value of the enrlmntDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat58Choice }
     *     
     */
    public MeetingNotice9 setEnrlmntDdln(DateFormat58Choice value) {
        this.enrlmntDdln = value;
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
     * Adds a new item to the prtcptn list.
     * @see #getPrtcptn()
     * 
     */
    public MeetingNotice9 addPrtcptn(ParticipationMethod2 prtcptn) {
        getPrtcptn().add(prtcptn);
        return this;
    }

    /**
     * Adds a new item to the addtlDcmnttnURLAdr list.
     * @see #getAddtlDcmnttnURLAdr()
     * 
     */
    public MeetingNotice9 addAddtlDcmnttnURLAdr(String addtlDcmnttnURLAdr) {
        getAddtlDcmnttnURLAdr().add(addtlDcmnttnURLAdr);
        return this;
    }

    /**
     * Adds a new item to the addtlPrcdrDtls list.
     * @see #getAddtlPrcdrDtls()
     * 
     */
    public MeetingNotice9 addAddtlPrcdrDtls(AdditionalRights4 addtlPrcdrDtls) {
        getAddtlPrcdrDtls().add(addtlPrcdrDtls);
        return this;
    }

    /**
     * Adds a new item to the ctctPrsnDtls list.
     * @see #getCtctPrsnDtls()
     * 
     */
    public MeetingNotice9 addCtctPrsnDtls(MeetingContactPerson3 ctctPrsnDtls) {
        getCtctPrsnDtls().add(ctctPrsnDtls);
        return this;
    }

}
