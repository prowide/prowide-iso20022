
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information about the general meeting, specifying the participation requirements and the voting procedures. Alternatively, it may indicate where such information may be obtained.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingNotice1", propOrder = {
    "mtgId",
    "issrMtgId",
    "tp",
    "anncmntDt",
    "attndncReqrd",
    "attndncConfInf",
    "attndncConfDdln",
    "attndncConfElctrncDdln",
    "attndncConfMktDdln",
    "addtlDcmnttnURLAdr",
    "rsltnPrpslDdln",
    "rsltnPrpslMktDdln",
    "prxyAppntmntNtfctnAdr",
    "ttlNbOfSctiesOutsdng",
    "ttlNbOfVtngRghts",
    "ctctPrsnDtls",
    "rsltPblctnDt",
    "inittdByHldr",
    "inittdByCrt",
    "prxyNotAllwd",
    "prxy",
    "rsltnPrpslThrshld",
    "rsltnPrpslThrshldPctg"
})
public class MeetingNotice1 {

    @XmlElement(name = "MtgId")
    protected String mtgId;
    @XmlElement(name = "IssrMtgId")
    protected String issrMtgId;
    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected MeetingType1Code tp;
    @XmlElement(name = "AnncmntDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar anncmntDt;
    @XmlElement(name = "AttndncReqrd")
    protected Boolean attndncReqrd;
    @XmlElement(name = "AttndncConfInf")
    protected String attndncConfInf;
    @XmlElement(name = "AttndncConfDdln", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar attndncConfDdln;
    @XmlElement(name = "AttndncConfElctrncDdln", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar attndncConfElctrncDdln;
    @XmlElement(name = "AttndncConfMktDdln", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar attndncConfMktDdln;
    @XmlElement(name = "AddtlDcmnttnURLAdr")
    protected String addtlDcmnttnURLAdr;
    @XmlElement(name = "RsltnPrpslDdln", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar rsltnPrpslDdln;
    @XmlElement(name = "RsltnPrpslMktDdln", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar rsltnPrpslMktDdln;
    @XmlElement(name = "PrxyAppntmntNtfctnAdr")
    protected PostalAddress1 prxyAppntmntNtfctnAdr;
    @XmlElement(name = "TtlNbOfSctiesOutsdng")
    protected CurrencyAndAmount ttlNbOfSctiesOutsdng;
    @XmlElement(name = "TtlNbOfVtngRghts")
    protected BigDecimal ttlNbOfVtngRghts;
    @XmlElement(name = "CtctPrsnDtls")
    protected List<MeetingContactPerson> ctctPrsnDtls;
    @XmlElement(name = "RsltPblctnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar rsltPblctnDt;
    @XmlElement(name = "InittdByHldr")
    protected NameAndAddress5 inittdByHldr;
    @XmlElement(name = "InittdByCrt")
    protected NameAndAddress5 inittdByCrt;
    @XmlElement(name = "PrxyNotAllwd")
    @XmlSchemaType(name = "string")
    protected ProxyNotAllowedCode prxyNotAllwd;
    @XmlElement(name = "Prxy")
    protected ProxyParameters prxy;
    @XmlElement(name = "RsltnPrpslThrshld")
    protected String rsltnPrpslThrshld;
    @XmlElement(name = "RsltnPrpslThrshldPctg")
    protected BigDecimal rsltnPrpslThrshldPctg;

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
    public MeetingNotice1 setMtgId(String value) {
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
    public MeetingNotice1 setIssrMtgId(String value) {
        this.issrMtgId = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingType1Code }
     *     
     */
    public MeetingType1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingType1Code }
     *     
     */
    public MeetingNotice1 setTp(MeetingType1Code value) {
        this.tp = value;
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
    public XMLGregorianCalendar getAnncmntDt() {
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
    public MeetingNotice1 setAnncmntDt(XMLGregorianCalendar value) {
        this.anncmntDt = value;
        return this;
    }

    /**
     * Gets the value of the attndncReqrd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAttndncReqrd() {
        return attndncReqrd;
    }

    /**
     * Sets the value of the attndncReqrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public MeetingNotice1 setAttndncReqrd(Boolean value) {
        this.attndncReqrd = value;
        return this;
    }

    /**
     * Gets the value of the attndncConfInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttndncConfInf() {
        return attndncConfInf;
    }

    /**
     * Sets the value of the attndncConfInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MeetingNotice1 setAttndncConfInf(String value) {
        this.attndncConfInf = value;
        return this;
    }

    /**
     * Gets the value of the attndncConfDdln property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getAttndncConfDdln() {
        return attndncConfDdln;
    }

    /**
     * Sets the value of the attndncConfDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MeetingNotice1 setAttndncConfDdln(XMLGregorianCalendar value) {
        this.attndncConfDdln = value;
        return this;
    }

    /**
     * Gets the value of the attndncConfElctrncDdln property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getAttndncConfElctrncDdln() {
        return attndncConfElctrncDdln;
    }

    /**
     * Sets the value of the attndncConfElctrncDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MeetingNotice1 setAttndncConfElctrncDdln(XMLGregorianCalendar value) {
        this.attndncConfElctrncDdln = value;
        return this;
    }

    /**
     * Gets the value of the attndncConfMktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getAttndncConfMktDdln() {
        return attndncConfMktDdln;
    }

    /**
     * Sets the value of the attndncConfMktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MeetingNotice1 setAttndncConfMktDdln(XMLGregorianCalendar value) {
        this.attndncConfMktDdln = value;
        return this;
    }

    /**
     * Gets the value of the addtlDcmnttnURLAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlDcmnttnURLAdr() {
        return addtlDcmnttnURLAdr;
    }

    /**
     * Sets the value of the addtlDcmnttnURLAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MeetingNotice1 setAddtlDcmnttnURLAdr(String value) {
        this.addtlDcmnttnURLAdr = value;
        return this;
    }

    /**
     * Gets the value of the rsltnPrpslDdln property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getRsltnPrpslDdln() {
        return rsltnPrpslDdln;
    }

    /**
     * Sets the value of the rsltnPrpslDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MeetingNotice1 setRsltnPrpslDdln(XMLGregorianCalendar value) {
        this.rsltnPrpslDdln = value;
        return this;
    }

    /**
     * Gets the value of the rsltnPrpslMktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getRsltnPrpslMktDdln() {
        return rsltnPrpslMktDdln;
    }

    /**
     * Sets the value of the rsltnPrpslMktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MeetingNotice1 setRsltnPrpslMktDdln(XMLGregorianCalendar value) {
        this.rsltnPrpslMktDdln = value;
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
    public MeetingNotice1 setPrxyAppntmntNtfctnAdr(PostalAddress1 value) {
        this.prxyAppntmntNtfctnAdr = value;
        return this;
    }

    /**
     * Gets the value of the ttlNbOfSctiesOutsdng property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getTtlNbOfSctiesOutsdng() {
        return ttlNbOfSctiesOutsdng;
    }

    /**
     * Sets the value of the ttlNbOfSctiesOutsdng property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public MeetingNotice1 setTtlNbOfSctiesOutsdng(CurrencyAndAmount value) {
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
    public MeetingNotice1 setTtlNbOfVtngRghts(BigDecimal value) {
        this.ttlNbOfVtngRghts = value;
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
     * {@link MeetingContactPerson }
     * 
     * 
     */
    public List<MeetingContactPerson> getCtctPrsnDtls() {
        if (ctctPrsnDtls == null) {
            ctctPrsnDtls = new ArrayList<MeetingContactPerson>();
        }
        return this.ctctPrsnDtls;
    }

    /**
     * Gets the value of the rsltPblctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getRsltPblctnDt() {
        return rsltPblctnDt;
    }

    /**
     * Sets the value of the rsltPblctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MeetingNotice1 setRsltPblctnDt(XMLGregorianCalendar value) {
        this.rsltPblctnDt = value;
        return this;
    }

    /**
     * Gets the value of the inittdByHldr property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddress5 }
     *     
     */
    public NameAndAddress5 getInittdByHldr() {
        return inittdByHldr;
    }

    /**
     * Sets the value of the inittdByHldr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddress5 }
     *     
     */
    public MeetingNotice1 setInittdByHldr(NameAndAddress5 value) {
        this.inittdByHldr = value;
        return this;
    }

    /**
     * Gets the value of the inittdByCrt property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddress5 }
     *     
     */
    public NameAndAddress5 getInittdByCrt() {
        return inittdByCrt;
    }

    /**
     * Sets the value of the inittdByCrt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddress5 }
     *     
     */
    public MeetingNotice1 setInittdByCrt(NameAndAddress5 value) {
        this.inittdByCrt = value;
        return this;
    }

    /**
     * Gets the value of the prxyNotAllwd property.
     * 
     * @return
     *     possible object is
     *     {@link ProxyNotAllowedCode }
     *     
     */
    public ProxyNotAllowedCode getPrxyNotAllwd() {
        return prxyNotAllwd;
    }

    /**
     * Sets the value of the prxyNotAllwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProxyNotAllowedCode }
     *     
     */
    public MeetingNotice1 setPrxyNotAllwd(ProxyNotAllowedCode value) {
        this.prxyNotAllwd = value;
        return this;
    }

    /**
     * Gets the value of the prxy property.
     * 
     * @return
     *     possible object is
     *     {@link ProxyParameters }
     *     
     */
    public ProxyParameters getPrxy() {
        return prxy;
    }

    /**
     * Sets the value of the prxy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProxyParameters }
     *     
     */
    public MeetingNotice1 setPrxy(ProxyParameters value) {
        this.prxy = value;
        return this;
    }

    /**
     * Gets the value of the rsltnPrpslThrshld property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsltnPrpslThrshld() {
        return rsltnPrpslThrshld;
    }

    /**
     * Sets the value of the rsltnPrpslThrshld property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MeetingNotice1 setRsltnPrpslThrshld(String value) {
        this.rsltnPrpslThrshld = value;
        return this;
    }

    /**
     * Gets the value of the rsltnPrpslThrshldPctg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRsltnPrpslThrshldPctg() {
        return rsltnPrpslThrshldPctg;
    }

    /**
     * Sets the value of the rsltnPrpslThrshldPctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public MeetingNotice1 setRsltnPrpslThrshldPctg(BigDecimal value) {
        this.rsltnPrpslThrshldPctg = value;
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
     * Adds a new item to the ctctPrsnDtls list.
     * @see #getCtctPrsnDtls()
     * 
     */
    public MeetingNotice1 addCtctPrsnDtls(MeetingContactPerson ctctPrsnDtls) {
        getCtctPrsnDtls().add(ctctPrsnDtls);
        return this;
    }

}
