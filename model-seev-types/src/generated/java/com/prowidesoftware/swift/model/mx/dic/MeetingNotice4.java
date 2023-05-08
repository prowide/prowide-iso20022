
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
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
 * Information about the shareholders meeting, specifying the participation requirements and the voting procedures. Alternatively, it may indicate where such information may be obtained.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingNotice4", propOrder = {
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
public class MeetingNotice4 {

    @XmlElement(name = "MtgId")
    protected String mtgId;
    @XmlElement(name = "IssrMtgId")
    protected String issrMtgId;
    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected MeetingType3Code tp;
    @XmlElement(name = "Clssfctn")
    protected MeetingTypeClassification1Choice clssfctn;
    @XmlElement(name = "AnncmntDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar anncmntDt;
    @XmlElement(name = "AttndncReqrd")
    protected Boolean attndncReqrd;
    @XmlElement(name = "AttndncConfInf")
    protected String attndncConfInf;
    @XmlElement(name = "AttndncConfDdln")
    protected DateFormat29Choice attndncConfDdln;
    @XmlElement(name = "AttndncConfSTPDdln")
    protected DateFormat29Choice attndncConfSTPDdln;
    @XmlElement(name = "AttndncConfMktDdln")
    protected DateFormat29Choice attndncConfMktDdln;
    @XmlElement(name = "AddtlDcmnttnURLAdr")
    protected String addtlDcmnttnURLAdr;
    @XmlElement(name = "AddtlPrcdrDtls")
    protected List<AdditionalRights2> addtlPrcdrDtls;
    @XmlElement(name = "TtlNbOfSctiesOutsdng")
    protected UnitOrFaceAmount1Choice ttlNbOfSctiesOutsdng;
    @XmlElement(name = "TtlNbOfVtngRghts")
    protected BigDecimal ttlNbOfVtngRghts;
    @XmlElement(name = "PrxyAppntmntNtfctnAdr")
    protected PostalAddress1 prxyAppntmntNtfctnAdr;
    @XmlElement(name = "PrxyChc")
    protected Proxy2Choice prxyChc;
    @XmlElement(name = "CtctPrsnDtls")
    protected List<MeetingContactPerson2> ctctPrsnDtls;
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
    public MeetingNotice4 setMtgId(String value) {
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
    public MeetingNotice4 setIssrMtgId(String value) {
        this.issrMtgId = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingType3Code }
     *     
     */
    public MeetingType3Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingType3Code }
     *     
     */
    public MeetingNotice4 setTp(MeetingType3Code value) {
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
    public MeetingNotice4 setClssfctn(MeetingTypeClassification1Choice value) {
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
    public Calendar getAnncmntDt() {
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
    public MeetingNotice4 setAnncmntDt(Calendar value) {
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
    public MeetingNotice4 setAttndncReqrd(Boolean value) {
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
    public MeetingNotice4 setAttndncConfInf(String value) {
        this.attndncConfInf = value;
        return this;
    }

    /**
     * Gets the value of the attndncConfDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat29Choice }
     *     
     */
    public DateFormat29Choice getAttndncConfDdln() {
        return attndncConfDdln;
    }

    /**
     * Sets the value of the attndncConfDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat29Choice }
     *     
     */
    public MeetingNotice4 setAttndncConfDdln(DateFormat29Choice value) {
        this.attndncConfDdln = value;
        return this;
    }

    /**
     * Gets the value of the attndncConfSTPDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat29Choice }
     *     
     */
    public DateFormat29Choice getAttndncConfSTPDdln() {
        return attndncConfSTPDdln;
    }

    /**
     * Sets the value of the attndncConfSTPDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat29Choice }
     *     
     */
    public MeetingNotice4 setAttndncConfSTPDdln(DateFormat29Choice value) {
        this.attndncConfSTPDdln = value;
        return this;
    }

    /**
     * Gets the value of the attndncConfMktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat29Choice }
     *     
     */
    public DateFormat29Choice getAttndncConfMktDdln() {
        return attndncConfMktDdln;
    }

    /**
     * Sets the value of the attndncConfMktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat29Choice }
     *     
     */
    public MeetingNotice4 setAttndncConfMktDdln(DateFormat29Choice value) {
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
    public MeetingNotice4 setAddtlDcmnttnURLAdr(String value) {
        this.addtlDcmnttnURLAdr = value;
        return this;
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
     * {@link AdditionalRights2 }
     * 
     * 
     * @return
     *     The value of the addtlPrcdrDtls property.
     */
    public List<AdditionalRights2> getAddtlPrcdrDtls() {
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
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public UnitOrFaceAmount1Choice getTtlNbOfSctiesOutsdng() {
        return ttlNbOfSctiesOutsdng;
    }

    /**
     * Sets the value of the ttlNbOfSctiesOutsdng property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public MeetingNotice4 setTtlNbOfSctiesOutsdng(UnitOrFaceAmount1Choice value) {
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
    public MeetingNotice4 setTtlNbOfVtngRghts(BigDecimal value) {
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
    public MeetingNotice4 setPrxyAppntmntNtfctnAdr(PostalAddress1 value) {
        this.prxyAppntmntNtfctnAdr = value;
        return this;
    }

    /**
     * Gets the value of the prxyChc property.
     * 
     * @return
     *     possible object is
     *     {@link Proxy2Choice }
     *     
     */
    public Proxy2Choice getPrxyChc() {
        return prxyChc;
    }

    /**
     * Sets the value of the prxyChc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Proxy2Choice }
     *     
     */
    public MeetingNotice4 setPrxyChc(Proxy2Choice value) {
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
     * {@link MeetingContactPerson2 }
     * 
     * 
     * @return
     *     The value of the ctctPrsnDtls property.
     */
    public List<MeetingContactPerson2> getCtctPrsnDtls() {
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
    public MeetingNotice4 setRsltPblctnDt(DateFormat3Choice value) {
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
    public MeetingNotice4 addAddtlPrcdrDtls(AdditionalRights2 addtlPrcdrDtls) {
        getAddtlPrcdrDtls().add(addtlPrcdrDtls);
        return this;
    }

    /**
     * Adds a new item to the ctctPrsnDtls list.
     * @see #getCtctPrsnDtls()
     * 
     */
    public MeetingNotice4 addCtctPrsnDtls(MeetingContactPerson2 ctctPrsnDtls) {
        getCtctPrsnDtls().add(ctctPrsnDtls);
        return this;
    }

}
