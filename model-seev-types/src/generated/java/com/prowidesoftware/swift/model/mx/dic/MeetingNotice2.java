
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
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information about the shareholders meeting, specifying the participation requirements and the voting procedures. Alternatively, it may indicate where such information may be obtained.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingNotice2", propOrder = {
    "mtgId",
    "issrMtgId",
    "tp",
    "clssfctn",
    "xtndedClssfctn",
    "anncmntDt",
    "attndncReqrd",
    "attndncConfInf",
    "attndncConfDdln",
    "attndncConfSTPDdln",
    "attndncConfMktDdln",
    "addtlDcmnttnURLAdr",
    "rsltnPrpslDdln",
    "rsltnPrpslMktDdln",
    "rsltnPrpslThrshld",
    "rsltnPrpslThrshldPctg",
    "ttlNbOfSctiesOutsdng",
    "ttlNbOfVtngRghts",
    "prxyAppntmntNtfctnAdr",
    "prxyNotAllwd",
    "prxy",
    "ctctPrsnDtls",
    "rsltPblctnDt"
})
public class MeetingNotice2 {

    @XmlElement(name = "MtgId")
    protected String mtgId;
    @XmlElement(name = "IssrMtgId")
    protected String issrMtgId;
    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected MeetingType2Code tp;
    @XmlElement(name = "Clssfctn")
    @XmlSchemaType(name = "string")
    protected MeetingTypeClassification1Code clssfctn;
    @XmlElement(name = "XtndedClssfctn")
    protected String xtndedClssfctn;
    @XmlElement(name = "AnncmntDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar anncmntDt;
    @XmlElement(name = "AttndncReqrd")
    protected boolean attndncReqrd;
    @XmlElement(name = "AttndncConfInf")
    protected String attndncConfInf;
    @XmlElement(name = "AttndncConfDdln")
    protected DateFormat2Choice attndncConfDdln;
    @XmlElement(name = "AttndncConfSTPDdln")
    protected DateFormat2Choice attndncConfSTPDdln;
    @XmlElement(name = "AttndncConfMktDdln")
    protected DateFormat2Choice attndncConfMktDdln;
    @XmlElement(name = "AddtlDcmnttnURLAdr")
    protected String addtlDcmnttnURLAdr;
    @XmlElement(name = "RsltnPrpslDdln")
    protected DateFormat2Choice rsltnPrpslDdln;
    @XmlElement(name = "RsltnPrpslMktDdln")
    protected DateFormat2Choice rsltnPrpslMktDdln;
    @XmlElement(name = "RsltnPrpslThrshld")
    protected String rsltnPrpslThrshld;
    @XmlElement(name = "RsltnPrpslThrshldPctg")
    protected BigDecimal rsltnPrpslThrshldPctg;
    @XmlElement(name = "TtlNbOfSctiesOutsdng")
    protected CurrencyAndAmount ttlNbOfSctiesOutsdng;
    @XmlElement(name = "TtlNbOfVtngRghts")
    protected BigDecimal ttlNbOfVtngRghts;
    @XmlElement(name = "PrxyAppntmntNtfctnAdr")
    protected PostalAddress1 prxyAppntmntNtfctnAdr;
    @XmlElement(name = "PrxyNotAllwd")
    @XmlSchemaType(name = "string")
    protected ProxyNotAllowedCode prxyNotAllwd;
    @XmlElement(name = "Prxy")
    protected ProxyAppointmentInformation1 prxy;
    @XmlElement(name = "CtctPrsnDtls")
    protected List<MeetingContactPerson1> ctctPrsnDtls;
    @XmlElement(name = "RsltPblctnDt")
    protected DateFormat3Choice rsltPblctnDt;

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
    public MeetingNotice2 setMtgId(String value) {
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
    public MeetingNotice2 setIssrMtgId(String value) {
        this.issrMtgId = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingType2Code }
     *     
     */
    public MeetingType2Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingType2Code }
     *     
     */
    public MeetingNotice2 setTp(MeetingType2Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the clssfctn property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingTypeClassification1Code }
     *     
     */
    public MeetingTypeClassification1Code getClssfctn() {
        return clssfctn;
    }

    /**
     * Sets the value of the clssfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingTypeClassification1Code }
     *     
     */
    public MeetingNotice2 setClssfctn(MeetingTypeClassification1Code value) {
        this.clssfctn = value;
        return this;
    }

    /**
     * Gets the value of the xtndedClssfctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedClssfctn() {
        return xtndedClssfctn;
    }

    /**
     * Sets the value of the xtndedClssfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MeetingNotice2 setXtndedClssfctn(String value) {
        this.xtndedClssfctn = value;
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
    public MeetingNotice2 setAnncmntDt(XMLGregorianCalendar value) {
        this.anncmntDt = value;
        return this;
    }

    /**
     * Gets the value of the attndncReqrd property.
     * 
     */
    public boolean isAttndncReqrd() {
        return attndncReqrd;
    }

    /**
     * Sets the value of the attndncReqrd property.
     * 
     */
    public MeetingNotice2 setAttndncReqrd(boolean value) {
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
    public MeetingNotice2 setAttndncConfInf(String value) {
        this.attndncConfInf = value;
        return this;
    }

    /**
     * Gets the value of the attndncConfDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat2Choice }
     *     
     */
    public DateFormat2Choice getAttndncConfDdln() {
        return attndncConfDdln;
    }

    /**
     * Sets the value of the attndncConfDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat2Choice }
     *     
     */
    public MeetingNotice2 setAttndncConfDdln(DateFormat2Choice value) {
        this.attndncConfDdln = value;
        return this;
    }

    /**
     * Gets the value of the attndncConfSTPDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat2Choice }
     *     
     */
    public DateFormat2Choice getAttndncConfSTPDdln() {
        return attndncConfSTPDdln;
    }

    /**
     * Sets the value of the attndncConfSTPDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat2Choice }
     *     
     */
    public MeetingNotice2 setAttndncConfSTPDdln(DateFormat2Choice value) {
        this.attndncConfSTPDdln = value;
        return this;
    }

    /**
     * Gets the value of the attndncConfMktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat2Choice }
     *     
     */
    public DateFormat2Choice getAttndncConfMktDdln() {
        return attndncConfMktDdln;
    }

    /**
     * Sets the value of the attndncConfMktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat2Choice }
     *     
     */
    public MeetingNotice2 setAttndncConfMktDdln(DateFormat2Choice value) {
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
    public MeetingNotice2 setAddtlDcmnttnURLAdr(String value) {
        this.addtlDcmnttnURLAdr = value;
        return this;
    }

    /**
     * Gets the value of the rsltnPrpslDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat2Choice }
     *     
     */
    public DateFormat2Choice getRsltnPrpslDdln() {
        return rsltnPrpslDdln;
    }

    /**
     * Sets the value of the rsltnPrpslDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat2Choice }
     *     
     */
    public MeetingNotice2 setRsltnPrpslDdln(DateFormat2Choice value) {
        this.rsltnPrpslDdln = value;
        return this;
    }

    /**
     * Gets the value of the rsltnPrpslMktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat2Choice }
     *     
     */
    public DateFormat2Choice getRsltnPrpslMktDdln() {
        return rsltnPrpslMktDdln;
    }

    /**
     * Sets the value of the rsltnPrpslMktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat2Choice }
     *     
     */
    public MeetingNotice2 setRsltnPrpslMktDdln(DateFormat2Choice value) {
        this.rsltnPrpslMktDdln = value;
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
    public MeetingNotice2 setRsltnPrpslThrshld(String value) {
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
    public MeetingNotice2 setRsltnPrpslThrshldPctg(BigDecimal value) {
        this.rsltnPrpslThrshldPctg = value;
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
    public MeetingNotice2 setTtlNbOfSctiesOutsdng(CurrencyAndAmount value) {
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
    public MeetingNotice2 setTtlNbOfVtngRghts(BigDecimal value) {
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
    public MeetingNotice2 setPrxyAppntmntNtfctnAdr(PostalAddress1 value) {
        this.prxyAppntmntNtfctnAdr = value;
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
    public MeetingNotice2 setPrxyNotAllwd(ProxyNotAllowedCode value) {
        this.prxyNotAllwd = value;
        return this;
    }

    /**
     * Gets the value of the prxy property.
     * 
     * @return
     *     possible object is
     *     {@link ProxyAppointmentInformation1 }
     *     
     */
    public ProxyAppointmentInformation1 getPrxy() {
        return prxy;
    }

    /**
     * Sets the value of the prxy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProxyAppointmentInformation1 }
     *     
     */
    public MeetingNotice2 setPrxy(ProxyAppointmentInformation1 value) {
        this.prxy = value;
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
     * {@link MeetingContactPerson1 }
     * 
     * 
     */
    public List<MeetingContactPerson1> getCtctPrsnDtls() {
        if (ctctPrsnDtls == null) {
            ctctPrsnDtls = new ArrayList<MeetingContactPerson1>();
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
    public MeetingNotice2 setRsltPblctnDt(DateFormat3Choice value) {
        this.rsltPblctnDt = value;
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
    public MeetingNotice2 addCtctPrsnDtls(MeetingContactPerson1 ctctPrsnDtls) {
        getCtctPrsnDtls().add(ctctPrsnDtls);
        return this;
    }

}
