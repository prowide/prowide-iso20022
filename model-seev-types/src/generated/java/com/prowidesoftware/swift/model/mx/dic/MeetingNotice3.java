
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
@XmlType(name = "MeetingNotice3", propOrder = {
    "mtgId",
    "issrMtgId",
    "tp",
    "clssfctn",
    "anncmntDt",
    "attndncReqrd",
    "attndncConfInf",
    "attndncConfDdln",
    "attndncConfSTPDdln",
    "attndncConfMktDdln",
    "addtlDcmnttnURLAdr",
    "addtlPrcdrDtls",
    "ttlNbOfSctiesOutsdng",
    "ttlNbOfVtngRghts",
    "prxyAppntmntNtfctnAdr",
    "prxyChc",
    "ctctPrsnDtls",
    "rsltPblctnDt"
})
public class MeetingNotice3 {

    @XmlElement(name = "MtgId")
    protected String mtgId;
    @XmlElement(name = "IssrMtgId")
    protected String issrMtgId;
    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected MeetingType2Code tp;
    @XmlElement(name = "Clssfctn")
    protected MeetingTypeClassification1Choice clssfctn;
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
    @XmlElement(name = "AddtlPrcdrDtls")
    protected List<AdditionalRights1> addtlPrcdrDtls;
    @XmlElement(name = "TtlNbOfSctiesOutsdng")
    protected ActiveCurrencyAndAmount ttlNbOfSctiesOutsdng;
    @XmlElement(name = "TtlNbOfVtngRghts")
    protected BigDecimal ttlNbOfVtngRghts;
    @XmlElement(name = "PrxyAppntmntNtfctnAdr")
    protected PostalAddress1 prxyAppntmntNtfctnAdr;
    @XmlElement(name = "PrxyChc")
    protected Proxy1Choice prxyChc;
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
    public MeetingNotice3 setMtgId(String value) {
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
    public MeetingNotice3 setIssrMtgId(String value) {
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
    public MeetingNotice3 setTp(MeetingType2Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the clssfctn property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingTypeClassification1Choice }
     *     
     */
    public MeetingTypeClassification1Choice getClssfctn() {
        return clssfctn;
    }

    /**
     * Sets the value of the clssfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingTypeClassification1Choice }
     *     
     */
    public MeetingNotice3 setClssfctn(MeetingTypeClassification1Choice value) {
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
    public MeetingNotice3 setAnncmntDt(XMLGregorianCalendar value) {
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
    public MeetingNotice3 setAttndncReqrd(boolean value) {
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
    public MeetingNotice3 setAttndncConfInf(String value) {
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
    public MeetingNotice3 setAttndncConfDdln(DateFormat2Choice value) {
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
    public MeetingNotice3 setAttndncConfSTPDdln(DateFormat2Choice value) {
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
    public MeetingNotice3 setAttndncConfMktDdln(DateFormat2Choice value) {
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
    public MeetingNotice3 setAddtlDcmnttnURLAdr(String value) {
        this.addtlDcmnttnURLAdr = value;
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
     * {@link AdditionalRights1 }
     * 
     * 
     */
    public List<AdditionalRights1> getAddtlPrcdrDtls() {
        if (addtlPrcdrDtls == null) {
            addtlPrcdrDtls = new ArrayList<AdditionalRights1>();
        }
        return this.addtlPrcdrDtls;
    }

    /**
     * Gets the value of the ttlNbOfSctiesOutsdng property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlNbOfSctiesOutsdng() {
        return ttlNbOfSctiesOutsdng;
    }

    /**
     * Sets the value of the ttlNbOfSctiesOutsdng property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public MeetingNotice3 setTtlNbOfSctiesOutsdng(ActiveCurrencyAndAmount value) {
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
    public MeetingNotice3 setTtlNbOfVtngRghts(BigDecimal value) {
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
    public MeetingNotice3 setPrxyAppntmntNtfctnAdr(PostalAddress1 value) {
        this.prxyAppntmntNtfctnAdr = value;
        return this;
    }

    /**
     * Gets the value of the prxyChc property.
     * 
     * @return
     *     possible object is
     *     {@link Proxy1Choice }
     *     
     */
    public Proxy1Choice getPrxyChc() {
        return prxyChc;
    }

    /**
     * Sets the value of the prxyChc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Proxy1Choice }
     *     
     */
    public MeetingNotice3 setPrxyChc(Proxy1Choice value) {
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
    public MeetingNotice3 setRsltPblctnDt(DateFormat3Choice value) {
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
     * Adds a new item to the addtlPrcdrDtls list.
     * @see #getAddtlPrcdrDtls()
     * 
     */
    public MeetingNotice3 addAddtlPrcdrDtls(AdditionalRights1 addtlPrcdrDtls) {
        getAddtlPrcdrDtls().add(addtlPrcdrDtls);
        return this;
    }

    /**
     * Adds a new item to the ctctPrsnDtls list.
     * @see #getCtctPrsnDtls()
     * 
     */
    public MeetingNotice3 addCtctPrsnDtls(MeetingContactPerson1 ctctPrsnDtls) {
        getCtctPrsnDtls().add(ctctPrsnDtls);
        return this;
    }

}
