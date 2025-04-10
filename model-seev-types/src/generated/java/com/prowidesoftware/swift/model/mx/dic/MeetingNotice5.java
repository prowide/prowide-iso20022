
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
@XmlType(name = "MeetingNotice5", propOrder = {
    "mtgId",
    "issrMtgId",
    "tp",
    "clssfctn",
    "anncmntDt",
    "prtcptn",
    "attndnc",
    "addtlDcmnttnURLAdr",
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
    "regnPrtcptnDdln",
    "regnPrtcptnMktDdln"
})
public class MeetingNotice5 {

    @XmlElement(name = "MtgId")
    protected String mtgId;
    @XmlElement(name = "IssrMtgId")
    protected String issrMtgId;
    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected MeetingType4Code tp;
    @XmlElement(name = "Clssfctn")
    protected MeetingTypeClassification2Choice clssfctn;
    @XmlElement(name = "AnncmntDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate anncmntDt;
    @XmlElement(name = "Prtcptn")
    protected List<ParticipationMethod1> prtcptn;
    @XmlElement(name = "Attndnc")
    protected Attendance1 attndnc;
    @XmlElement(name = "AddtlDcmnttnURLAdr")
    protected List<String> addtlDcmnttnURLAdr;
    @XmlElement(name = "AddtlPrcdrDtls")
    protected List<AdditionalRights3> addtlPrcdrDtls;
    @XmlElement(name = "TtlNbOfSctiesOutsdng")
    protected FinancialInstrumentQuantity18Choice ttlNbOfSctiesOutsdng;
    @XmlElement(name = "TtlNbOfVtngRghts")
    protected BigDecimal ttlNbOfVtngRghts;
    @XmlElement(name = "PrxyAppntmntNtfctnAdr")
    protected PostalAddress1 prxyAppntmntNtfctnAdr;
    @XmlElement(name = "PrxyChc")
    protected Proxy3Choice prxyChc;
    @XmlElement(name = "CtctPrsnDtls")
    protected List<MeetingContactPerson3> ctctPrsnDtls;
    @XmlElement(name = "RsltPblctnDt")
    protected DateFormat3Choice rsltPblctnDt;
    @XmlElement(name = "SctiesBlckgPrdEndDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime sctiesBlckgPrdEndDt;
    @XmlElement(name = "EntitlmntFxgDt")
    protected DateFormat1 entitlmntFxgDt;
    @XmlElement(name = "RegnSctiesDdln")
    protected DateFormat58Choice regnSctiesDdln;
    @XmlElement(name = "RegnSctiesMktDdln")
    protected DateFormat58Choice regnSctiesMktDdln;
    @XmlElement(name = "RegnPrtcptnDdln")
    protected DateFormat58Choice regnPrtcptnDdln;
    @XmlElement(name = "RegnPrtcptnMktDdln")
    protected DateFormat58Choice regnPrtcptnMktDdln;

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
    public MeetingNotice5 setMtgId(String value) {
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
    public MeetingNotice5 setIssrMtgId(String value) {
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
    public MeetingNotice5 setTp(MeetingType4Code value) {
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
    public MeetingNotice5 setClssfctn(MeetingTypeClassification2Choice value) {
        this.clssfctn = value;
        return this;
    }

    /**
     * Gets the value of the anncmntDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getAnncmntDt() {
        return anncmntDt;
    }

    /**
     * Sets the value of the anncmntDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MeetingNotice5 setAnncmntDt(LocalDate value) {
        this.anncmntDt = value;
        return this;
    }

    /**
     * Gets the value of the prtcptn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prtcptn property.
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
     * {@link ParticipationMethod1 }
     * 
     * 
     * @return
     *     The value of the prtcptn property.
     */
    public List<ParticipationMethod1> getPrtcptn() {
        if (prtcptn == null) {
            prtcptn = new ArrayList<>();
        }
        return this.prtcptn;
    }

    /**
     * Gets the value of the attndnc property.
     * 
     * @return
     *     possible object is
     *     {@link Attendance1 }
     *     
     */
    public Attendance1 getAttndnc() {
        return attndnc;
    }

    /**
     * Sets the value of the attndnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attendance1 }
     *     
     */
    public MeetingNotice5 setAttndnc(Attendance1 value) {
        this.attndnc = value;
        return this;
    }

    /**
     * Gets the value of the addtlDcmnttnURLAdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlDcmnttnURLAdr property.
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
     * @return
     *     The value of the addtlDcmnttnURLAdr property.
     */
    public List<String> getAddtlDcmnttnURLAdr() {
        if (addtlDcmnttnURLAdr == null) {
            addtlDcmnttnURLAdr = new ArrayList<>();
        }
        return this.addtlDcmnttnURLAdr;
    }

    /**
     * Gets the value of the addtlPrcdrDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlPrcdrDtls property.
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
     * {@link AdditionalRights3 }
     * 
     * 
     * @return
     *     The value of the addtlPrcdrDtls property.
     */
    public List<AdditionalRights3> getAddtlPrcdrDtls() {
        if (addtlPrcdrDtls == null) {
            addtlPrcdrDtls = new ArrayList<>();
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
    public MeetingNotice5 setTtlNbOfSctiesOutsdng(FinancialInstrumentQuantity18Choice value) {
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
    public MeetingNotice5 setTtlNbOfVtngRghts(BigDecimal value) {
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
    public MeetingNotice5 setPrxyAppntmntNtfctnAdr(PostalAddress1 value) {
        this.prxyAppntmntNtfctnAdr = value;
        return this;
    }

    /**
     * Gets the value of the prxyChc property.
     * 
     * @return
     *     possible object is
     *     {@link Proxy3Choice }
     *     
     */
    public Proxy3Choice getPrxyChc() {
        return prxyChc;
    }

    /**
     * Sets the value of the prxyChc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Proxy3Choice }
     *     
     */
    public MeetingNotice5 setPrxyChc(Proxy3Choice value) {
        this.prxyChc = value;
        return this;
    }

    /**
     * Gets the value of the ctctPrsnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ctctPrsnDtls property.
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
     * @return
     *     The value of the ctctPrsnDtls property.
     */
    public List<MeetingContactPerson3> getCtctPrsnDtls() {
        if (ctctPrsnDtls == null) {
            ctctPrsnDtls = new ArrayList<>();
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
    public MeetingNotice5 setRsltPblctnDt(DateFormat3Choice value) {
        this.rsltPblctnDt = value;
        return this;
    }

    /**
     * Gets the value of the sctiesBlckgPrdEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getSctiesBlckgPrdEndDt() {
        return sctiesBlckgPrdEndDt;
    }

    /**
     * Sets the value of the sctiesBlckgPrdEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MeetingNotice5 setSctiesBlckgPrdEndDt(OffsetDateTime value) {
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
    public MeetingNotice5 setEntitlmntFxgDt(DateFormat1 value) {
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
    public MeetingNotice5 setRegnSctiesDdln(DateFormat58Choice value) {
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
    public MeetingNotice5 setRegnSctiesMktDdln(DateFormat58Choice value) {
        this.regnSctiesMktDdln = value;
        return this;
    }

    /**
     * Gets the value of the regnPrtcptnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat58Choice }
     *     
     */
    public DateFormat58Choice getRegnPrtcptnDdln() {
        return regnPrtcptnDdln;
    }

    /**
     * Sets the value of the regnPrtcptnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat58Choice }
     *     
     */
    public MeetingNotice5 setRegnPrtcptnDdln(DateFormat58Choice value) {
        this.regnPrtcptnDdln = value;
        return this;
    }

    /**
     * Gets the value of the regnPrtcptnMktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat58Choice }
     *     
     */
    public DateFormat58Choice getRegnPrtcptnMktDdln() {
        return regnPrtcptnMktDdln;
    }

    /**
     * Sets the value of the regnPrtcptnMktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat58Choice }
     *     
     */
    public MeetingNotice5 setRegnPrtcptnMktDdln(DateFormat58Choice value) {
        this.regnPrtcptnMktDdln = value;
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
    public MeetingNotice5 addPrtcptn(ParticipationMethod1 prtcptn) {
        getPrtcptn().add(prtcptn);
        return this;
    }

    /**
     * Adds a new item to the addtlDcmnttnURLAdr list.
     * @see #getAddtlDcmnttnURLAdr()
     * 
     */
    public MeetingNotice5 addAddtlDcmnttnURLAdr(String addtlDcmnttnURLAdr) {
        getAddtlDcmnttnURLAdr().add(addtlDcmnttnURLAdr);
        return this;
    }

    /**
     * Adds a new item to the addtlPrcdrDtls list.
     * @see #getAddtlPrcdrDtls()
     * 
     */
    public MeetingNotice5 addAddtlPrcdrDtls(AdditionalRights3 addtlPrcdrDtls) {
        getAddtlPrcdrDtls().add(addtlPrcdrDtls);
        return this;
    }

    /**
     * Adds a new item to the ctctPrsnDtls list.
     * @see #getCtctPrsnDtls()
     * 
     */
    public MeetingNotice5 addCtctPrsnDtls(MeetingContactPerson3 ctctPrsnDtls) {
        getCtctPrsnDtls().add(ctctPrsnDtls);
        return this;
    }

}
